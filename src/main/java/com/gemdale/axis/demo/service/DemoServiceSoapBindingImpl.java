/**
 * DemoServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.demo.service;

import com.gemdale.axis.generate.proxy.DemoService;

public class DemoServiceSoapBindingImpl implements DemoService {
    private String desc;


    public String getDesc() throws java.rmi.RemoteException {
        return null;
    }

    public String getName() throws java.rmi.RemoteException {
        return null;
    }

    public void setName(String name) throws java.rmi.RemoteException {
    }


    public java.lang.String desc() throws java.rmi.RemoteException {
        System.out.println("kkkkkk");
        if(desc == null || "".equals(desc)){
            return "你好呀";
        }else {
            return desc;
        }
    }

    public java.lang.String setDesc(java.lang.String in0) throws java.rmi.RemoteException {
        return desc;
    }

}
