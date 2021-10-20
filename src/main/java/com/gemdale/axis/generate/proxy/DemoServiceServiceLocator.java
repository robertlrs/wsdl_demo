/**
 * DemoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gemdale.axis.generate.proxy;

public class DemoServiceServiceLocator extends org.apache.axis.client.Service implements DemoServiceService {

    public DemoServiceServiceLocator() {
    }


    public DemoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoService
    private String DemoService_address = "http://localhost:8080/axis/services/DemoService";

    public String getDemoServiceAddress() {
        return DemoService_address;
    }

    // The WSDD service name defaults to the port name.
    private String DemoServiceWSDDServiceName = "DemoService";

    public String getDemoServiceWSDDServiceName() {
        return DemoServiceWSDDServiceName;
    }

    public void setDemoServiceWSDDServiceName(String name) {
        DemoServiceWSDDServiceName = name;
    }

    public DemoService getDemoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoService(endpoint);
    }

    public DemoService getDemoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DemoServiceSoapBindingStub _stub = new DemoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDemoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoServiceEndpointAddress(String address) {
        DemoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DemoService.class.isAssignableFrom(serviceEndpointInterface)) {
                DemoServiceSoapBindingStub _stub = new DemoServiceSoapBindingStub(new java.net.URL(DemoService_address), this);
                _stub.setPortName(getDemoServiceWSDDServiceName());
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
        if ("DemoService".equals(inputPortName)) {
            return getDemoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "DemoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.gemdale.axis.generate.proxy", "DemoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoService".equals(portName)) {
            setDemoServiceEndpointAddress(address);
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
