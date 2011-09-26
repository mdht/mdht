<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://jakarta.apache.org/taglibs/xsl-1.0" prefix="xsl" %>

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

<title>File Upload Example</title>




 <STYLE>
   BODY {
     background-color: white;}
   TD {
     font-size: 10pt; 
     font-family: verdana,helvetica; 
     text-decoration: none;
     white-space:nowrap;}
   A {
     text-decoration: none;
     color: black}
  </STYLE>

  <!-- As in a client-side tree, all the tree infrastructure   -->
  <!-- is put in place within the <HEAD> block, but the actual -->
  <!-- tree rendering is trigered within the <BODY>.           -->

  <!-- Code for browser detection. DO NOT REMOVE.              -->
  <SCRIPT src="ua.js"></SCRIPT>

  <!-- Infrastructure code for the TreeView. DO NOT REMOVE.    -->
  <SCRIPT src="ftiens4.js"></SCRIPT>

  <SCRIPT>
    


//
// Copyright (c) 2006 by Conor O'Mahony.
// For enquiries, please email GubuSoft@GubuSoft.com.
// Please keep all copyright notices below.
// Original author of TreeView script is Marcelino Martins.
//
// This document includes the TreeView script.
// The TreeView script can be found at http://www.TreeView.net.
// The script is Copyright (c) 2006 by Conor O'Mahony.
//

USETEXTLINKS = 1  
STARTALLOPEN = 0
HIGHLIGHT = 1
PRESERVESTATE = 1
GLOBALTARGET="R"



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
	String xml = cdaFile.getString();
	document.addChild(factory.createOMText(document, xml));
	method.addChild(specification);
	method.addChild(document);
	OMElement result = serviceClient.sendReceive(method);
	
	
	  ;
	  
	  request.setAttribute("NISTXML",result.toStringWithConsume());
	 

				
    	
 	}
%>

	<xsl:apply nameXml="NISTXML" xsl="NISTTree.xsl" />


   // Load a page as if a node on the tree was clicked (to
   // synchronize the frames).  Also highlights selection if 
   // highlighting is chosen.
   function loadSynchPage(xID) 
   {
     var folderObj;
     docObj = parent.treeframe.findObj(xID);
     docObj.forceOpeningOfAncestorFolders();
     parent.treeframe.clickOnLink(xID,docObj.link,'basefrm'); 
 
     // Scroll the tree window to show the selected node.
     // Note that the code in this function might need to be 
     // chnaged to work with frameless pages.  Also note that
     // the scrolling does not work with NS4 browsers.
     if (typeof parent.treeframe.document.body != "undefined")
       parent.treeframe.document.body.scrollTop=docObj.navObj.offsetTop
   } 
  </SCRIPT>

</head>

<body topmargin="16" marginheight="16">




<!------------------------------------------------------------->
 <!-- IMPORTANT NOTICE:                                       -->
 <!-- Removing the following link will prevent this script    -->
 <!-- from working.  Unless you purchase the registered       -->
 <!-- version of TreeView, you must include this link.        -->
 <!-- If you make any unauthorized changes to the following   -->
 <!-- code, you will violate the user agreement.  If you want -->
 <!-- to remove the link, see the online FAQ for instructions -->
 <!-- on how to obtain a version without the link.            -->
 <!------------------------------------------------------------->
 <DIV style="position:absolute; top:0; left:0;"><TABLE border=0><TR><TD><FONT size=-2><A style="font-size:7pt;text-decoration:none;color:silver" href="http://www.treemenu.net/" target=_blank>Javascript Tree Menu</A></FONT></TD></TR></TABLE></DIV>

  <!-- Build the browser's objects and display default view  -->
  <!-- of the tree.                                          -->
  <SCRIPT>
   initializeDocument()
   // Click the Parakeet link
   loadSynchPage(506027036)
  </SCRIPT>
  <NOSCRIPT>
   A tree for site navigation will open here if you enable JavaScript in your browser.
  </NOSCRIPT>




</body>
</html>