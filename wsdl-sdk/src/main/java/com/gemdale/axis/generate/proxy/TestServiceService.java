/**
 * TestServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public interface TestServiceService extends javax.xml.rpc.Service {
    public java.lang.String getTestServiceAddress();

    public com.gemdale.axis.generate.proxy.TestService getTestService() throws javax.xml.rpc.ServiceException;

    public com.gemdale.axis.generate.proxy.TestService getTestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
