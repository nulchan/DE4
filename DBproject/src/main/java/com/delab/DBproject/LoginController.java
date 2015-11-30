package com.delab.DBproject;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delab.DBproject.Entity.Employee;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	//@Autowired
    //private SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/LoginController/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	//회원가입
	@RequestMapping(value = "/LoginController/Sign", method = RequestMethod.GET)
	public String Join(Locale locale, Model model) {
		return "sign";
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
