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
java.io.*,
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
org.xml.sax.SAXException,
org.eclipse.emf.*,
org.eclipse.emf.common.*,
org.eclipse.emf.common.util.*,
org.eclipse.emf.ecore.*,
org.openhealthtools.mdht.*,
org.openhealthtools.mdht.uml.cda.*,
org.openhealthtools.mdht.uml.cda.util.*,
org.w3c.dom.Document,
org.w3c.dom.Element,
org.xml.sax.SAXException,

javax.xml.parsers.DocumentBuilder,
javax.xml.parsers.DocumentBuilderFactory,
javax.xml.parsers.ParserConfigurationException,
javax.xml.transform.Result,
javax.xml.transform.Source,
javax.xml.transform.Transformer,
javax.xml.transform.TransformerFactory,
javax.xml.transform.dom.DOMSource,
javax.xml.transform.stream.StreamResult,

org.openhealthtools.mdht.uml.cda.CDAPackage,
org.openhealthtools.mdht.uml.cda.ClinicalDocument,
org.openhealthtools.mdht.uml.cda.DocumentRoot,
org.openhealthtools.mdht.uml.cda.ccd.CCDPackage,
org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage,
org.openhealthtools.mdht.uml.cda.ihe.IHEPackage,
org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler


"
%>



<%!

static public String getLevel(int level) {
	if (level == 1) {
		return "information";
	} else if (level == 2) {
		return "warning";
	} else {
		return "error";
	}
}


private static String getPath(EObject eObject) {
	String path = "";
	while (eObject != null && !(eObject instanceof DocumentRoot)) {
		EStructuralFeature feature = eObject.eContainingFeature();
		EObject container = eObject.eContainer();
		Object value = container.eGet(feature);
		if (feature.isMany()) {
			List<EObject> list = (List<EObject>) value;
			int index = list.indexOf(eObject) + 1;
			path = "/" + feature.getName() + "[" + index + "]" + path;
		} else {
			path = "/" + feature.getName() + "[1]" + path;
		}
		eObject = eObject.eContainer();
	}
	return path;
}

public void pushMDHTDiagnosticToXML(Document doc, Element root, Diagnostic diagnostic) {

	String context = "";
	String source = "";
	String severity = "";
	String message = "";
	String ocl = "OCL Unavailable";

	// If diagnostic data has eobject
	if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
		context = getPath((EObject) diagnostic.getData().get(0));
	}

	source = diagnostic.getSource();

	severity = getLevel(diagnostic.getSeverity());

	message = diagnostic.getMessage();

	// if diagnostic has ocl
	if (diagnostic.getData().size() > 1 && diagnostic.getData().get(1) instanceof org.eclipse.ocl.Query) {
		org.eclipse.ocl.Query query = (org.eclipse.ocl.Query) diagnostic.getData().get(1);
		ocl = query.queryText();
	}

	
	Element issueElement = doc.createElement("issue");




	Element contextElement = doc.createElement("context");
	contextElement.appendChild(doc.createTextNode(context));

	Element messageElement = doc.createElement("message");
	messageElement.appendChild(doc.createTextNode(message));

	Element severityElement = doc.createElement("severity");
	severityElement.appendChild(doc.createTextNode(severity));

	Element specificationElement = doc.createElement("specification");
	specificationElement.appendChild(doc.createTextNode(source));

	Element testElement = doc.createElement("test");
	testElement.appendChild(doc.createTextNode(ocl));


	issueElement.appendChild(contextElement);
	issueElement.appendChild(messageElement);
	issueElement.appendChild(severityElement);
	issueElement.appendChild(specificationElement);
	issueElement.appendChild(testElement);

	root.appendChild(issueElement);

}

%>

<title>MDHT CDA Diagnostics</title>




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



<%


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
          
        
  
          
          try {
               
               CDAPackage.eINSTANCE.eClass();
               CCDPackage.eINSTANCE.eClass();
               HITSPPackage.eINSTANCE.eClass();
               IHEPackage.eINSTANCE.eClass();

                           InputStream in = new ByteArrayInputStream(cdaFile.getString().getBytes());
                           ClinicalDocument clinicalDocument = CDAUtil.load(in, null);
                           

                           final int filterlevel = Integer.parseInt(filterValue);                                                 
                            
                              DocumentBuilderFactory factory;
                              DocumentBuilder docBuilder;

                              factory = DocumentBuilderFactory.newInstance();

                              docBuilder = factory.newDocumentBuilder();

                              // Create blank DOM Document
                              final Document doc = docBuilder.newDocument();

                              // create the root element
                              final Element root = doc.createElement("validateDocumentResponse");

                              final Element returnElement = doc.createElement("return");

                              root.appendChild(returnElement);

                              // all it to the xml tree
                              doc.appendChild(root);

                              boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {

                                   
                                   public void handleError(Diagnostic diagnostic) {                                       
                                        pushMDHTDiagnosticToXML(doc, returnElement, diagnostic);
                                   }

                                   
                                   public void handleWarning(Diagnostic diagnostic) {
                                    if (filterlevel<=2) {
                                        pushMDHTDiagnosticToXML(doc, returnElement, diagnostic);
                                    }
                                   }

                                   
                                   public void handleInfo(Diagnostic diagnostic) {
                                        if (filterlevel==1) {
                                        pushMDHTDiagnosticToXML(doc, returnElement, diagnostic);
                                        }

                                   }

                              });
                              
                              

         Source source = new DOMSource(root);
            StringWriter stringWriter = new StringWriter();
            Result result = new StreamResult(stringWriter);
            TransformerFactory tfactory = TransformerFactory.newInstance();
            Transformer transformer = tfactory.newTransformer();
            transformer.transform(source, result);
                         
     
                               request.setAttribute("MDHTXML",stringWriter.getBuffer().toString());

                         } catch (UnsupportedEncodingException e) {
                           e.printStackTrace();
                       }

     }
%> 
 <xsl:apply nameXml="MDHTXML" xsl="MDHTTree.xsl" />




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


   USETEXTLINKS = 1  
   STARTALLOPEN = 0
   HIGHLIGHT = 1
   PRESERVESTATE = 1
   GLOBALTARGET="R"
      
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
 <DIV style="position:absolute; top:0; left:0;"><TABLE border=0>
 
 
      <tr>
          <td id="header" style="width: 602"><img src="oht_logo.png" alt="Open Health Tools logo" style="width: 602 height :   140 hspace :   0 vspace :   0 border :   0" /></td>
          <td>
          <h1 style="text-align: center">MDHT - Model Driven Health Tools Logo Here</h1>
          </td>
     </tr>
     <tr>
          <td colspan="2">
          <h1 style="text-align: center">MDHT Clinical Document Architecture (CDA) Document Validation Services</h1>
          </td>
     </tr>
 
 
 <TR><TD><FONT size=-2><A style="font-size:7pt;text-decoration:none;color:silver" href="http://www.treemenu.net/" target=_blank>Javascript Tree Menu</A></FONT></TD></TR></TABLE></DIV>

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