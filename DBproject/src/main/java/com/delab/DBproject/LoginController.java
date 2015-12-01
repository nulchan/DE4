package com.delab.DBproject;

import java.io.UnsupportedEncodingException;
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
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Resource(name = "employeeDao")   
	private EmployeeDao employeeDao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/main/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String passwd = request.getParameter("password");
		if(id == null){id="";}
		if(passwd == null){passwd="";}
		EmployeeVo object = this.employeeDao.getSelectId(id);
		if(object != null){//아이디가 있다
			if(object.getPassword().equals(passwd)){//비밀번호가 맞다면
				//로그인성공
				if(object.getJob_group().equals("management")){//경영진
					request.getSession().setAttribute("result", id);
					return "managementMain";
				}else if(object.getJob_group().equals("PM")){//PM
					request.getSession().setAttribute("result", id);
					return "pmMain";
				}else if(object.getJob_group().equals("ordinary")){//일반직원
					request.getSession().setAttribute("result", id);
					return "ordinaryMain";
				} else {
					return "main";
				}
			}else{//아이디는 있는데 비밀번호는 없음
				request.getSession().setAttribute("result", "비밀번호가 틀렸습니다");
				return "main";
			}
		}else{//아이디가 없다
			request.getSession().setAttribute("result", "아이디가 없습니다");
			return "main";
		}
	}
	
	
}