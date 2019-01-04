package br.com.inaciojr9.exames.jaxws;

public class ExameWsProxy implements br.com.inaciojr9.exames.jaxws.ExameWs {
  private String _endpoint = null;
  private br.com.inaciojr9.exames.jaxws.ExameWs exameWs = null;
  
  public ExameWsProxy() {
    _initExameWsProxy();
  }
  
  public ExameWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initExameWsProxy();
  }
  
  private void _initExameWsProxy() {
    try {
      exameWs = (new br.com.inaciojr9.exames.jaxws.ExameWsServiceLocator()).getExameWsPort();
      if (exameWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exameWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exameWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exameWs != null)
      ((javax.xml.rpc.Stub)exameWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.inaciojr9.exames.jaxws.ExameWs getExameWs() {
    if (exameWs == null)
      _initExameWsProxy();
    return exameWs;
  }
  
  public br.com.inaciojr9.exames.jaxws.Exame[] getAll() throws java.rmi.RemoteException{
    if (exameWs == null)
      _initExameWsProxy();
    return exameWs.getAll();
  }
  
  public br.com.inaciojr9.exames.jaxws.Exame getById(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (exameWs == null)
      _initExameWsProxy();
    return exameWs.getById(arg0);
  }
  
  
}