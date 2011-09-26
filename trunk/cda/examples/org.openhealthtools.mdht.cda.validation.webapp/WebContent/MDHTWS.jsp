<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler,
org.openhealthtools.mdht.uml.cda.util.CDAUtil,
org.openhealthtools.mdht.uml.cda.CDAPackage,
org.openhealthtools.mdht.uml.cda.ClinicalDocument,
org.openhealthtools.mdht.uml.cda.DocumentRoot,
org.openhealthtools.mdht.uml.cda.ccd.CCDPackage,
org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage,
org.openhealthtools.mdht.uml.cda.ihe.IHEPackage,
org.openhealthtools.mdht.uml.cda.cdt.CDTPackage,
org.openhealthtools.mdht.uml.cda.toc.ToCPackage

"%>


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

	// Element childElement = doc.createElement("return");

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
</head>

<body>
	<p>
<%

	if (ServletFileUpload.isMultipartContent(request)){
	
  		ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
  		List fileItemsList = servletFileUpload.parseRequest(request);
  		Iterator it = fileItemsList.iterator();
  		String filterValue="3";
  		FileItem cdaFile=null; 
  		
  		while (it.hasNext()) {
    		FileItem fileItem = (FileItem)it.next();
			if (fileItem.isFormField()) {
				filterValue = fileItem.getString(); 
			}

    		if (!fileItem.isFormField()) {
                cdaFile = fileItem;
			}
  		}
  		
   		try {
			CDAUtil.loadPackages(getServletConfig().getServletContext().getRealPath("WEB-INF/lib"));

            InputStream in = new ByteArrayInputStream(cdaFile.getString("UTF8").getBytes("UTF8"));
            ClinicalDocument clinicalDocument = CDAUtil.load(in);

            final int filterlevel = Integer.parseInt(filterValue);                                                 
                     
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = factory.newDocumentBuilder();

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

		<xsl:apply nameXml="MDHTXML" xsl="MDHT.xsl" />
	</p>
</body>
</html>
