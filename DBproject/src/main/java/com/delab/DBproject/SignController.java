package com.delab.DBproject;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delab.DBproject.dao.EmployeeDao;
import com.delab.DBproject.dao.EmployeeVo;

@Controller
public class SignController {
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	@Resource(name = "employeeDao")
    private EmployeeDao employeeDao;
	//회원정보
	@RequestMapping(value = "/SignController/signup", method = RequestMethod.POST)
	public String signup(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String emp_name = request.getParameter("emp_name");
		BigInteger inhabit_num = new BigInteger((request.getParameter("inhabit_num")).getBytes());
		String dept_name = request.getParameter("dept_name");
		String address = request.getParameter("address");
		String high_car = request.getParameter("high_car");
		String career = request.getParameter("career");
		String technique = request.getParameter("technique");
		String job_group = request.getParameter("job_group");
		String class_posi = request.getParameter("class_posi");
		
		
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setDept_name(dept_name);
		employeeVo.setId(id);
		employeeVo.setPassword(password);
		employeeVo.setEmp_name(emp_name);
		employeeVo.setInhabit_num(inhabit_num);
		employeeVo.setAddress(address);
		employeeVo.setJob_group(job_group);
		employeeVo.setHigh_car(high_car);
		employeeVo.setCareer(career);
		employeeVo.setTechnique(technique);
		employeeVo.setClass_posi(class_posi);
		
		this.employeeDao.insert(employeeVo);
		
		request.getSession().setAttribute("result", "회원가입성공");
		return "result";
	}
	//아이디검사
	@RequestMapping(value = "/SignController/checkId", method = RequestMethod.POST)
	public String checkId(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		EmployeeVo getid = this.employeeDao.getSelectId(id);
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