package com.delab.DBproject;

import java.util.List;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.delab.DBproject.dao.*;

@Controller(value = "viewController")
public class ViewController {
    private static final Logger logger = LoggerFactory.getLogger(ViewController.class);

    // Resource 어노테이션을 이용하여 BbsDao 선언.
    @Resource(name = "bbsDao")
    private BbsDao bbsDao;
    
    @Resource(name = "employeeDao")
    private EmployeeDao employeeDao;
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
    		
    	return "main";
    }
    
   

   /* // 게시판 목록
    @RequestMapping(value = "/bbs", method = RequestMethod.GET)
    public String dispBbsList(Model model) {
        logger.info("display view BBS list");
        List<BbsVo> list = this.bbsDao.getSelect();
        model.addAttribute("list", list);

        logger.info("totcal count" + list.size() );

        return "bbs.list";
    }
    */
    
    // 직원정보 list
    @RequestMapping(value = "/employeelist", method = RequestMethod.GET)
    public String dispEmployeeList(Model model) {
        logger.info("display view Employee list");
        List<EmployeeVo> list = this.employeeDao.getSelect();
        model.addAttribute("employeelist", list);

        logger.info("totcal count" + list.size() );

        return "employee.list";
    }
    
    //직원정보 상세보기
  /*  @RequestMapping("/{emp_no}")
    public String dispEmployeeView(@PathVariable int emp_no, Model model) {
        logger.info("display view Employee view emp_no = {}", emp_no);
        EmployeeVo object = this.employeeDao.getSelectOne(emp_no);

        model.addAttribute("object", object);
        return "employee.view";
    }*/
    
    //관리자로그인
    @RequestMapping("/main/login/management/{id}")
    public String dispManagementLoginView(@PathVariable String id, Model model) {
        logger.info("display view Login management view id = {}", id);
        EmployeeVo object = this.employeeDao.getSelectId(id);

        model.addAttribute("object", object);
        return "management.view";
    }
    
    //PM로그인
    @RequestMapping("/main/login/PM/{id}")
    public String dispPMLoginView(@PathVariable String id, Model model) {
        logger.info("display view Login PM view id = {}", id);
        EmployeeVo object = this.employeeDao.getSelectId(id);

        model.addAttribute("object", object);
        return "pm.view";
    }
    
  //ordinary로그인
    @RequestMapping("/main/login/ordinary/{id}")
    public String dispOrdinaryLoginView(@PathVariable String id, Model model) {
        logger.info("display view Login ordinary view id = {}", id);
        EmployeeVo object = this.employeeDao.getSelectId(id);

        model.addAttribute("object", object);
        return "ordinary.view";
    }

    /*// 게시판 쓰기
    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String dispBbsWrite(@RequestParam(value="idx", defaultValue="0") int idx, Model model) {
        logger.info("display view BBS write");

        if (idx > 0) {
            BbsVo object = this.bbsDao.getSelectOne(idx);
            model.addAttribute("object", object);
        }

        return "bbs.write";
    }
    */

  /*  @RequestMapping(value = "/write_ok", method = RequestMethod.POST)
    public String procBbsWrite(@ModelAttribute("bbsVo") BbsVo bbsVo, RedirectAttributes redirectAttributes) {
        Integer idx = bbsVo.getIdx();

        if (idx == null || idx == 0) {
            this.bbsDao.insert(bbsVo);
            redirectAttributes.addFlashAttribute("message", "추가되었습니다.");
            return "redirect:/";
        } else {
            this.bbsDao.update(bbsVo);
            redirectAttributes.addFlashAttribute("message", "수정되었습니다.");
            return "redirect:/write?idx=" + idx;
        }
    }*/
    
    @RequestMapping(value = "/write_ok", method = RequestMethod.POST)
    public String procEmployeeWrite(@ModelAttribute("employeeVo") EmployeeVo employeeVo, RedirectAttributes redirectAttributes) {
        Integer emp_no = employeeVo.getEmp_no();

        if (emp_no == null || emp_no == 0) {
            this.employeeDao.insert(employeeVo);
            redirectAttributes.addFlashAttribute("message", "추가되었습니다.");
            return "redirect:/js";
        } else {
            this.employeeDao.update(employeeVo);
            redirectAttributes.addFlashAttribute("message", "수정되었습니다.");
            return "redirect:/write?emp_no=" + emp_no;
        }
    }
/*
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String procBbsDelete(@RequestParam(value = "idx", required = false) int idx) {
        this.bbsDao.delete(idx);
        return "redirect:/";
    }
    
    */
    
    //직원 탈퇴시키기
    @RequestMapping(value = "/deleteemployee", method = RequestMethod.POST)
    public String procEmployeeDelete(@RequestParam(value = "emp_no", required = false) int emp_no) {
        this.employeeDao.delete(emp_no);
        return "redirect:/";
    }

}
