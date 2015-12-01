package com.delab.DBproject.dao;

import java.util.Date;

public class DepartmentVo {

	public String dept_name;
	public String dept_ld;
	public String tel;
	public Date date;
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_ld() {
		return dept_ld;
	}
	public void setDept_ld(String dept_ld) {
		this.dept_ld = dept_ld;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}