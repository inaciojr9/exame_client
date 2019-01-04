/**
 * ExameWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.inaciojr9.exames.jaxws;

public class ExameWsServiceLocator extends org.apache.axis.client.Service implements br.com.inaciojr9.exames.jaxws.ExameWsService {

    public ExameWsServiceLocator() {
    }


    public ExameWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExameWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExameWsPort
    private java.lang.String ExameWsPort_address = "http://localhost:8080/Exames/ExameWs";

    public java.lang.String getExameWsPortAddress() {
        return ExameWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExameWsPortWSDDServiceName = "ExameWsPort";

    public java.lang.String getExameWsPortWSDDServiceName() {
        return ExameWsPortWSDDServiceName;
    }

    public void setExameWsPortWSDDServiceName(java.lang.String name) {
        ExameWsPortWSDDServiceName = name;
    }

    public br.com.inaciojr9.exames.jaxws.ExameWs getExameWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExameWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExameWsPort(endpoint);
    }

    public br.com.inaciojr9.exames.jaxws.ExameWs getExameWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.inaciojr9.exames.jaxws.ExameWsServiceSoapBindingStub _stub = new br.com.inaciojr9.exames.jaxws.ExameWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getExameWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExameWsPortEndpointAddress(java.lang.String address) {
        ExameWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.inaciojr9.exames.jaxws.ExameWs.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.inaciojr9.exames.jaxws.ExameWsServiceSoapBindingStub _stub = new br.com.inaciojr9.exames.jaxws.ExameWsServiceSoapBindingStub(new java.net.URL(ExameWsPort_address), this);
                _stub.setPortName(getExameWsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExameWsPort".equals(inputPortName)) {
            return getExameWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxws.exames.inaciojr9.com.br/", "ExameWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxws.exames.inaciojr9.com.br/", "ExameWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExameWsPort".equals(portName)) {
            setExameWsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
