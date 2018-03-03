package org.fjh.tag;

import java.util.List;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-下午5:22:13   
     * 版权:樊建华 
*/

public class Page<T> {
	
	private Integer pageSize=30;//每页上的记录数
	private Integer pageCurrent;//当前页号
	private Integer pageLength; //总页数
	private List<T> data;  //查询出来的记录
	private Integer allRows;    //总记录数
	private StringBuffer url;//前端查询的url
	
	public StringBuffer getUrl() {
		return url;
	}


	public void setUrl(StringBuffer url) {
		this.url = url;
	}


	public Page() {
		super();
	}


	public Page(Integer pageSize) {
		super();
		this.pageSize = pageSize;
	}
	
	
	public Integer getPageLength() {
		return pageLength;
	}


	public void setPageLength(Integer pageLength) {
		this.pageLength = pageLength;
	}


	public Integer getAllRows() {
		return allRows;
	}


	public void setAllRows(Integer allRows) {
		this.allRows = allRows;
	}


	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
