package org.fjh.tag;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 作用： 版本信息： 
 * 日期：2018年1月27日-上午10:45:18 
 * 版权:樊建华
 */

public class Pagination extends TagSupport {

	/**
	 * Jack
	 */
	private static final long serialVersionUID = -3924926850539073630L;
	private String url=null; // 请求的地址
	private String attrName = "page";// 保存分页数据的属性名称
	private Integer pageSize=30;// 每页上的记录数

	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}


	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();// 得到输出对象
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();// 得到请求对象

		// 得到分页属性对象
		Object obj = request.getAttribute(attrName);
		if (obj == null) {
			try {
				out.print("<font color=red>分页数据没有，请检查</font>");
			} catch (IOException e) {
				try {
					out.print("<font color=red>分页标签发生异常1，请检查</font>");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
			return 0;// 返回
		} 
			
		if (url == null || url.trim().length()==0) {
			try {
				out.print("<font color=red>请求URL数据没有，请检查</font>");
			} catch (IOException e) {
				try {
					out.print("<font color=red>分页标签发生异常2，请检查</font>");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
			return 0;// 返回
		} 
		
		//------------------------------------------------->
		//                    分页逻辑
		//
		//<-------------------------------------------------
		 if (obj instanceof Page) {
			Page page = (Page) obj;// 转化对象

			Integer allRows = page.getAllRows();//得到总记录数
			//计算总页数
			//if(page.getPageSize()==50)
				pageSize = page.getPageSize();
			
			Integer length = (allRows%pageSize==0)?allRows/pageSize:(allRows/pageSize+1);
			
			Integer pageCurrent = page.getPageCurrent();//得到当前页号

			//判断请求的url中是否包含当前页参数
			//if (url.indexOf("pageCurrent") > 0) {
			//	url = url.replaceAll("&amp;pageCurrent=[0-9]", "");
			//}
				
			try {
				url = resolveUrl(url, this.pageContext);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			StringBuffer html = new StringBuffer();//输出字符
			html.append("<nav class='text-right'><ul class='pagination'>");
			
			try {
				// 上一页
				if (pageCurrent > 1) {
					html.append("<a href='").append(url).append("&pageCurrent=").append((pageCurrent - 1) + "'>");
					html.append("<li>");

					html.append("<span aria-hidden='true'>上一页</span>");
				} else {
					html.append("<li  class='disabled'>");

					html.append("<a href='#'>");
					html.append("<span aria-hidden='true'>上一页</span>");
				}
				html.append("</a></li>");
				out.print(html.toString());
				int index;
				if (pageCurrent > 20)
					index = pageCurrent;
				else
					index = 1;
				
				for (; index <= length; index++) {

					String h = "";
					if (index > pageCurrent + 20) {
						h = "<li><a href=" + url + "&pageCurrent=" + index + ">" + index + "...</a></li>";
						out.print(h);
						break;
					}
					if (index == pageCurrent)
						h = "<li class='active'><a href=" + url + "&pageCurrent=" + index + ">" + index + "</a></li>";
					else
						h = "<li><a href=" + url + "&pageCurrent=" + index + ">" + index + "</a></li>";
					out.print(h);

				}

				// 下一页
				html.setLength(0);
				if (pageCurrent < length) {
					html.append("<li>");

					html.append("<a href='").append(url).append("&pageCurrent=").append((pageCurrent + 1) + "'>");
					html.append("<span aria-hidden='true'>下一页</span>");
				} else {
					html.append("<li class='disabled'>");

					html.append("<a href='#' >");
					html.append("<span aria-hidden='true'>下一页</span>");
				}
				html.append("</a></li>");
				
				html.append("</ul></nav>");
				out.write(html.toString());

			} catch (Exception e) {
				try {
					out.print("<font color=red>分页标签异常，请查看:"+e.getMessage()+"</font>");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} 
			return 0;
		
	}
	
	
	 private String append(String url, String key, int value)
	  {
	    return append(url, key, String.valueOf(value));
	  }
	  
	  private String append(String url, String key, String value)
	  {
	    if ((url == null) || (url.trim().length() == 0)) {
	      return "";
	    }
	    if (url.indexOf("?") == -1) {
	      url = url + "?" + key + "=" + value;
	    } else if (url.endsWith("?")) {
	      url = url + key + "=" + value;
	    } else {
	      url = url + "&amp;" + key + "=" + value;
	    }
	    return url;
	  }
	  
	/**
	 * 
	 * 用途：给请求的URL加上请求参数
	 * 作者：樊建华
	 * 日期：2018年1月27日-下午2:42:35
	 */
	private String resolveUrl(String url, PageContext pageContext)
		    throws Exception
		  {
		    if (url != null) {
		      url = new String(url.getBytes("iso8859-1"), "utf-8");
		    }
		    Map params = pageContext.getRequest().getParameterMap();
		    for (Object key : params.keySet()) {
		      if ((!"pageCurrent".equals(key)))
		      {
		        Object value = params.get(key);
		        if (value != null) {
		          if (value.getClass().isArray()) {
		            url = append(url, key.toString(), new String(((String[])value)[0].getBytes("iso8859-1"), "utf-8"));
		          } else if ((value instanceof String)) {
		            url = append(url, key.toString(), new String(value.toString().getBytes("iso8859-1"), "utf-8"));
		          }
		        }
		      }
		    }
		    return url;
		  }
}
