package com.gemdale.axis.service;


import com.gemdale.axis.demo.service.TestService;
import org.springframework.stereotype.Component;

public class TestServiceImpl implements TestService {
    private String desc;
    public java.lang.String desc() {
        System.out.println("kkkkk2222k");
        if(desc == null || "".equals(desc)){
            System.out.println("skdlksdlksd22222-------");
            System.out.println(desc);
            return "5555你好呀";
        }else {
            return desc;
        }
    }

    public java.lang.String setDesc(java.lang.String in0) {
        desc = in0;
        return desc;
    }
}
