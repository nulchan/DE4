package com.delab.DBproject.Entity;

public class Employee {
	private int emp_no; //직원번호
	private String dept_name; //부서명
	private String id; //직원 아이디
	private String emp_name; //직원이름
	private long inhabit_num; //주민번호
	//임시
		private int inhabit1; //주민번호 앞자리
		public int getInhabit1() {return inhabit1;}
		public void setInhabit1(int inhabit1) {this.inhabit1 = inhabit1;}
		private int inhabit2; //주민번호 뒷자리
		public int getInhabit2() {return inhabit2;}
		public void setInhabit2(int inhabit2) {this.inhabit2 = inhabit2;}
	//임시끝
	private String password; //비밀번호
	private String address; //주소
	private String job_group; //직군(경영진 PM 일반직원)
	private String high_car; //최종학력 (고졸 대졸 대학원졸)
	private String career; //경력
	private String technique; //경험한 기술
	private String class_posi; //직급(부장 차장 과장 대리 사원)
	
	//getter setter
	public int getEmp_no() {return emp_no;}
	public void setEmp_no(int emp_no) {this.emp_no = emp_no;}
	
	public String getDept_name() {return dept_name;}
	public void setDept_name(String dept_name) {this.dept_name = dept_name;}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getEmp_name() {return emp_name;}
	public void setEmp_name(String emp_name) {this.emp_name = emp_name;}
	
	public long getInhabit_num() {return inhabit_num;}
	public void setInhabit_num(long inhabit_num) {this.inhabit_num = inhabit_num;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public String getJob_group() {return job_group;}
	public void setJob_group(String job_group) {this.job_group = job_group;}
	
	public String getHigh_car() {return high_car;}
	public void setHigh_car(String high_car) {this.high_car = high_car;}
	
	public String getCareer() {return career;}
	public void setCareer(String career) {this.career = career;}
	
	public String getTechnique() {return technique;}
	public void setTechnique(String technique) {this.technique = technique;}
	
	public String getClass_posi() {return class_posi;}
	public void setClass_posi(String class_posi) {this.class_posi = class_posi;}
	
}
