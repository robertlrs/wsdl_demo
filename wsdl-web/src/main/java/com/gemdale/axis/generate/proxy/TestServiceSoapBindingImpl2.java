/**
 * TestServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

import com.gemdale.axis.service.TestServiceImpl;

public class TestServiceSoapBindingImpl2
//        implements com.gemdale.axis.generate.proxy.TestService
{
    private TestServiceImpl testService;

    public java.lang.String desc() throws java.rmi.RemoteException {
        return testService.desc();
    }

    public java.lang.String setDesc(java.lang.String in0) throws java.rmi.RemoteException {
        return testService.setDesc(in0);
    }

    public TestServiceImpl getTestService() {
        return testService;
    }

    public void setTestService(TestServiceImpl testService) {
        this.testService = testService;
    }
}
