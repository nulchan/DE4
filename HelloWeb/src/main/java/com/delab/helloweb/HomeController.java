package com.delab.helloweb;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    private SqlSession sqlSession;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<HashMap<String, String>> outputs = sqlSession.selectList("userControlMapper.selectSample");
        model.addAttribute("showDB", outputs.toString());
	
		return "home";
	}
	
	//회원가입
	@RequestMapping(value = "Sign", method = RequestMethod.GET)
	public String Join(Locale locale, Model model) {
		return "Sign";
	}
	
	
	//임시화면보기
	//회원정보
	@RequestMapping(value = "Information", method = RequestMethod.GET)
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
		return "Information";
	}
	//회원정보수정
	@RequestMapping(value = "/information.modify", method = RequestMethod.POST)
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
		return "Information_modify";
	}
	//임시화면보기 끝
	
}
