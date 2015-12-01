package com.delab.DBproject;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delab.DBproject.Entity.Employee;
import com.delab.DBproject.dao.EmployeeDao;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Resource(name = "EmployeeDao")
    private EmployeeDao employeeDao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/LoginController/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	@RequestMapping(value = "/LoginController/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String passwd = request.getParameter("password");
		if(id == null){id="";}
		if(passwd == null){passwd="";}
		Employee object = this.employeeDao.getSelect(id);
		if(object != null){//아이디가 있다
			if(object.getPassword().equals(passwd)){//비밀번호가 맞다면
				//로그인성공
				if(object.getJob_group().equals("0")){//경영진
					request.getSession().setAttribute("result", "경영진login성공");
					return "result";
				}else if(object.getJob_group().equals("1")){//PM
					request.getSession().setAttribute("result", "PMlogin성공");
					return "result";
				}else{//일반직원
					request.getSession().setAttribute("result", "일반직원login성공");
					return "result";
				}
			}else{//아이디는 있는데 비밀번호는 없음
				request.getSession().setAttribute("result", "비밀번호가 틀렸습니다");
				return "result";
			}
		}else{//아이디가 없다
			request.getSession().setAttribute("result", "아이디가 없습니다");
			return "result";
		}
	}
	
	
	//회원가입
	@RequestMapping(value = "/LoginController/Sign", method = RequestMethod.GET)
	public String Join(Locale locale, Model model) {
		return "checkId";
	}
	
	
	//임시화면보기
	//회원정보
	@RequestMapping(value = "/LoginController/Information", method = RequestMethod.GET)
	public String Information(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		Employee employee = new Employee();
		employee.setEmp_no(1);
		employee.setDept_name("dept");
		employee.setId("id");
		employee.setEmp_name("amugae");
		employee.setInhabit1(123456);
		employee.setInhabit2(1234567);
		employee.setPassword("1234");
		employee.setAddress("Yongin");
		employee.setJob_group("PM");
		employee.setHigh_car("highschool");
		employee.setCareer("3");
		employee.setTechnique("no");
		employee.setClass_posi("sawon");
		request.getSession().setAttribute("employee", employee);
		return "information";
	}
	//회원정보수정
	@RequestMapping(value = "/LoginController/information.modify", method = RequestMethod.POST)
	public String Information_modify(HttpServletRequest request) throws UnsupportedEncodingException, SQLException{
		request.setCharacterEncoding("utf-8");
		Employee employee = new Employee();
		employee.setEmp_no(1);
		employee.setDept_name("dept");
		employee.setId("id");
		employee.setEmp_name("amugae");
		employee.setInhabit1(123456);
		employee.setInhabit2(1234567);
		employee.setPassword("1234");
		employee.setAddress("Yongin");
		employee.setJob_group("PM");
		employee.setHigh_car("highschool");
		employee.setCareer("3");
		employee.setTechnique("no");
		employee.setClass_posi("sawon");
		request.getSession().setAttribute("employee", employee);
		return "information_modify";
	}
	//임시화면보기 끝
	
}
