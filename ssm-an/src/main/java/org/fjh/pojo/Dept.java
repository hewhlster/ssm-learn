package org.fjh.pojo;

import java.io.Serializable;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年3月3日-下午2:58:42   
     * 版权:樊建华 
*/

public class Dept implements Serializable {
	/**
	 * 樊建华
	 */
	private static final long serialVersionUID = 620831877349625918L;
	private String did;
	private String dname;
	private String dmemo;
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDmemo() {
		return dmemo;
	}
	public void setDmemo(String dmemo) {
		this.dmemo = dmemo;
	}
	
	
	
	
}
