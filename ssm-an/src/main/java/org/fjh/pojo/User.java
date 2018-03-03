package org.fjh.pojo;

import java.io.Serializable;
import java.util.Date;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月28日-下午4:35:36   
     * 版权:樊建华 
*/

public class User implements Serializable {
	
	/**
	 * 樊建华
	 */
	private static final long serialVersionUID = 6214559894070393815L;
	private String id;
	private String username;
	private String password;
	private Integer gender;
	private Date   birthday;
	private String address;
	private String memo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
