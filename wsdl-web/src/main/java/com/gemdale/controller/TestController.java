package com.gemdale.controller;

import com.gemdale.axis.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@org.springframework.stereotype.Controller
//@RequestMapping("/api")
public class TestController implements Controller {
    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.jsp");

        testService.desc();
        return modelAndView;
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
