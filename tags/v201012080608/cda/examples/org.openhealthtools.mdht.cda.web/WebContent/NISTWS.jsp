<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://jakarta.apache.org/taglibs/xsl-1.0" prefix="xsl"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page
     import="org.apache.commons.fileupload.*, 
org.apache.commons.fileupload.servlet.ServletFileUpload, 
org.apache.commons.fileupload.disk.DiskFileItemFactory, 
org.apache.commons.io.*, 
org.apache.commons.io.*, 
java.util.*, 
java.io.File, 
java.lang.Exception,
gov.nist.hitsp.validation.WSIndividualValidationResult,
gov.nist.hitsp.validation.WSValidationResults,
java.io.ByteArrayOutputStream,
java.io.File,
java.io.FileInputStream,
java.io.FileNotFoundException,
java.io.FilenameFilter,
java.io.IOException,
java.io.InputStream,
java.util.ArrayList,
java.util.Collections,
java.util.HashMap,
java.util.List,
java.util.Timer,
java.util.TimerTask,
javax.xml.parsers.ParserConfigurationException,
org.apache.axiom.om.OMAbstractFactory,
org.apache.axiom.om.OMElement,
org.apache.axiom.om.OMFactory,
org.apache.axiom.om.OMNamespace,
org.apache.axis2.AxisFault,
org.apache.axis2.Constants,
org.apache.axis2.addressing.EndpointReference,
org.apache.axis2.client.ServiceClient,
org.xml.sax.SAXException"%>

</head>
<body>

<p>
<%




EndpointReference wsTarget = null;
org.apache.axis2.client.Options options = null;
ServiceClient serviceClient = null;
OMFactory factory = null;
OMNamespace namespace = null;


          wsTarget = new EndpointReference(
                    "http://xreg2.nist.gov:8080/ws/services/ValidationWebService");

     options = new org.apache.axis2.client.Options();
     options.setTo(wsTarget);
     options
               .setTransportInProtocol(Constants.TRANSPORT_HTTP);
     // options.setTransportInProtocol(Constants.TRANSPORT_JMS);
     serviceClient = new ServiceClient();
     serviceClient.setOptions(options);
     factory = OMAbstractFactory.getOMFactory();
     namespace = factory.createOMNamespace(
               "http://validation.hitsp.nist.gov", "nns");








     if (ServletFileUpload.isMultipartContent(request)){
     
          ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
  
          List fileItemsList = servletFileUpload.parseRequest(request);

          Iterator it = fileItemsList.iterator();
          
          
       String filterValue="3";
      
      FileItem cdaFile=null; 
      
      while (it.hasNext()){
        
      FileItem fileItem = (FileItem)it.next();

      if (fileItem.isFormField())
      {
       filterValue = fileItem.getString(); 
      }

       if (!fileItem.isFormField()) {
            cdaFile = fileItem;
       }
      
      }
      
  
    



     OMElement method = factory.createOMElement(
               "validateDocument", namespace);
     OMElement specification = factory.createOMElement(
               "specificationId", namespace);
     OMElement document = factory.createOMElement(
               "document", namespace);

     specification.addChild(factory.createOMText(
               specification, "ccd"));
     String xml = cdaFile.getString("UTF8");
     document.addChild(factory.createOMText(document, xml));
     method.addChild(specification);
     method.addChild(document);
     OMElement result = serviceClient.sendReceive(method);
     
     
       ;
       
       request.setAttribute("NISTXML",result.toStringWithConsume());
      

                    
     
     }
%> <xsl:apply nameXml="NISTXML" xsl="NIST.xsl" /></p>
</body>
</html>