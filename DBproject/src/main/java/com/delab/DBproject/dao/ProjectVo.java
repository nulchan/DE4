package com.delab.DBproject.dao;

import java.util.Date;

public class ProjectVo {
    private int project_num;
    private int emp_no;
    private String project_name;
    private Date pro_outset;
    private Date pro_end;
    private String order_place;
    
	public int getProject_num() {
		return project_num;
	}
	public void setProject_num(int project_num) {
		this.project_num = project_num;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public Date getPro_outset() {
		return pro_outset;
	}
	public void setPro_outset(Date pro_outset) {
		this.pro_outset = pro_outset;
	}
	public Date getPro_end() {
		return pro_end;
	}
	public void setPro_end(Date pro_end) {
		this.pro_end = pro_end;
	}
	public String getOrder_place() {
		return order_place;
	}
	public void setOrder_place(String order_place) {
		this.order_place = order_place;
	}

}