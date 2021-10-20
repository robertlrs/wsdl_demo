/**
 * TestServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public class TestServiceServiceLocator extends org.apache.axis.client.Service implements TestServiceService {

    public TestServiceServiceLocator() {
    }


    public TestServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestService
    private String TestService_address = "http://localhost:8080/axis/services/TestService";

    public String getTestServiceAddress() {
        return TestService_address;
    }

    // The WSDD service name defaults to the port name.
    private String TestServiceWSDDServiceName = "TestService";

    public String getTestServiceWSDDServiceName() {
        return TestServiceWSDDServiceName;
    }

    public void setTestServiceWSDDServiceName(String name) {
        TestServiceWSDDServiceName = name;
    }

    public TestService getTestService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestService(endpoint);
    }

    public TestService getTestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            TestServiceSoapBindingStub _stub = new TestServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestServiceEndpointAddress(String address) {
        TestService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (TestService.class.isAssignableFrom(serviceEndpointInterface)) {
                TestServiceSoapBindingStub _stub = new TestServiceSoapBindingStub(new java.net.URL(TestService_address), this);
                _stub.setPortName(getTestServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("TestService".equals(inputPortName)) {
            return getTestService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "TestServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "TestService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("TestService".equals(portName)) {
            setTestServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
