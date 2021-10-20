/**
 * TestServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public class TestServiceSoapBindingSkeleton implements com.gemdale.axis.generate.proxy.TestService, org.apache.axis.wsdl.Skeleton {
    private com.gemdale.axis.generate.proxy.TestService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("desc", _params, new javax.xml.namespace.QName("", "descReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "desc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("desc") == null) {
            _myOperations.put("desc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("desc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setDesc", _params, new javax.xml.namespace.QName("", "setDescReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "setDesc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setDesc") == null) {
            _myOperations.put("setDesc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setDesc")).add(_oper);
    }

    public TestServiceSoapBindingSkeleton() {
        this.impl = new com.gemdale.axis.generate.proxy.TestServiceSoapBindingImpl();
    }

    public TestServiceSoapBindingSkeleton(com.gemdale.axis.generate.proxy.TestService impl) {
        this.impl = impl;
    }
    public java.lang.String desc() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.desc();
        return ret;
    }

    public java.lang.String setDesc(java.lang.String in0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.setDesc(in0);
        return ret;
    }

}
