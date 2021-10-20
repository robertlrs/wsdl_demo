package com.gemdale.axis.demo.service;

/**
 java org.apache.axis.wsdl.Java2WSDL -o DemoService.wsdl    \
    -l"http://localhost:8080/axis/services/DemoService" \
    -n "urn:DemoService" -p"com.gemdale.axis.demo.service" "urn:DemoService"    \
    com.gemdale.axis.demo.service.DemoService
 */

public class DemoService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        System.out.println("hi 你好");
        return "hi 你好";
    }
}
