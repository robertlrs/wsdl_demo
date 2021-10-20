/**
 * DemoServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public class DemoServiceSoapBindingSkeleton implements DemoService, org.apache.axis.wsdl.Skeleton {
    private DemoService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(String methodName) {
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
        _oper = new org.apache.axis.description.OperationDesc("getDesc", _params, new javax.xml.namespace.QName("", "getDescReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "getDesc"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDesc") == null) {
            _myOperations.put("getDesc", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDesc")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getName", _params, new javax.xml.namespace.QName("", "getNameReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "getName"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getName") == null) {
            _myOperations.put("getName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("setName", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "setName"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setName") == null) {
            _myOperations.put("setName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setName")).add(_oper);
    }

    public DemoServiceSoapBindingSkeleton() {
        this.impl = new DemoServiceSoapBindingImpl();
    }

    public DemoServiceSoapBindingSkeleton(DemoService impl) {
        this.impl = impl;
    }
    public String getDesc() throws java.rmi.RemoteException
    {
        String ret = impl.getDesc();
        return ret;
    }

    public String getName() throws java.rmi.RemoteException
    {
        String ret = impl.getName();
        return ret;
    }

    public void setName(String name) throws java.rmi.RemoteException
    {
        impl.setName(name);
    }

}
