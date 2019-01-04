/**
 * ExameWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.inaciojr9.exames.jaxws;

public interface ExameWs extends java.rmi.Remote {
    public br.com.inaciojr9.exames.jaxws.Exame[] getAll() throws java.rmi.RemoteException;
    public br.com.inaciojr9.exames.jaxws.Exame getById(java.lang.Integer arg0) throws java.rmi.RemoteException;
}
