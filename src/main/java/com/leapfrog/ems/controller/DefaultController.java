/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ems.controller;

import com.leapfrog.ems.entity.Employee;
import com.leapfrog.ems.service.EmployeeService;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Chetan
 */
@Controller
//@RequestMapping(value = "/")
public class DefaultController {

//    private static final Logger logger = Logger.getLogger(DefaultController.class);
  
//   @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
//    public String index(){
//        return "index.jsp";
//    }
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/createEmployee")
    public ModelAndView createEmployee(@ModelAttribute Employee employee) {
//        logger.info("Creating Employee. Data: " + employee);
        return new ModelAndView("employeeForm");
    }
}
