package com.delab.DBproject;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delab.DBproject.Entity.Employee;
import com.delab.DBproject.dao.EmployeeDao;

@Controller
public class SignController {
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	@Resource(name = "EmployeeDao")
    private EmployeeDao employeeDao;
	//회원정보
	@RequestMapping(value = "/SignController/signup", method = RequestMethod.POST)
	public String signup(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String passwd = request.getParameter("password");
		String emp_name = request.getParameter("emp_name");
		int inhabit1 = Integer.parseInt(request.getParameter("inhabit1"));
		int inhabit2 = Integer.parseInt(request.getParameter("inhabit2"));
		String dept_name = request.getParameter("dept_name");
		String address = request.getParameter("address");
		String high_car = request.getParameter("high_car");
		String career = request.getParameter("career");
		String technique = request.getParameter("technique");
		
		Employee employee = new Employee();
		employee.setDept_name(dept_name);
		employee.setId(id);
		employee.setPassword(passwd);
		employee.setEmp_name(emp_name);
		employee.setInhabit1(inhabit1);
		employee.setInhabit2(inhabit2);
		employee.setInhabit_num(inhabit1*1000000 + inhabit2);
		employee.setAddress(address);
		employee.setJob_group("2");
		employee.setHigh_car(high_car);
		employee.setCareer(career);
		employee.setTechnique(technique);
		employee.setClass_posi("24");
		
		this.employeeDao.insert(employee);
		
		request.getSession().setAttribute("result", "회원가입성공");
		return "result";
	}
	//아이디검사
	@RequestMapping(value = "/SignController/checkId", method = RequestMethod.POST)
	public String checkId(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		Employee getid = this.employeeDao.getSelect(id);
		if(getid != null || id==""){//아이디가 있으면
			request.getSession().setAttribute("id", id);
			request.getSession().setAttribute("addid", "는 이미 있는 아이디 입니다. 다른 아이디를 이용해 주세요.");
			if(id==""){
				request.getSession().setAttribute("addid", "아이디를 입력후 개인정보 입력을 하세요.");
			}
			return "checkId";
		}else{//아이디가 있으면
			request.getSession().setAttribute("inputid", id);
			return "sign";
		}
	}
	
	
}
