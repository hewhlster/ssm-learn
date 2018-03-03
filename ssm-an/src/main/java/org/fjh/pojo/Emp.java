package org.fjh.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**   
	 * 作用：
     * 版本信息：   
     * 日期：2018年1月24日-上午10:05:49   
     * 版权:樊建华 
*/

public class Emp implements Serializable {

	/**
	 * Jack
	 */
	private static final long serialVersionUID = -9166268584378417637L;
	private String empid;
	private String empno;
	private String ename;
	private String job;
	@JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")//不加时区，中国会少一天
	private Date   hiredate;
	
	
	
	private String did;
	
	private Dept   dept;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
}
