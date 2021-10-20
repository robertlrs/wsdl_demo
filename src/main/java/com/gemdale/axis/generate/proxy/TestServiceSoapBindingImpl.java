/**
 * TestServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public class TestServiceSoapBindingImpl implements TestService{
    private String desc;
    public java.lang.String desc() throws java.rmi.RemoteException {
        System.out.println("kkkkkk");
        if(desc == null || "".equals(desc)){
            System.out.println("skdlksdlksd-------");
            System.out.println(desc);
            return "1212121212121212121你好呀";
        }else {
            return desc;
        }
    }

    public java.lang.String setDesc(java.lang.String in0) throws java.rmi.RemoteException {
        desc = in0;
        return desc;
    }

}
