/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors::
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResourceHandler;
import org.openhealthtools.mdht.uml.cda.resource.CDAResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CDAUtil {
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	
	public static void save(EObject object, OutputStream out) throws Exception {
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.getContents().add(object);
		resource.save(out, null);
	}
	
	public static EObject load(InputStream in) throws Exception {
		return load(in, false);
	}
	
	public static boolean validate(EObject object, DiagnosticHandler handler) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(object);
		if (handler != null) {
			processDiagnostic(handler, diagnostic);
			handler.close();
		}
		return diagnostic.getSeverity() != Diagnostic.ERROR;
	}
	
	private static void processDiagnostic(DiagnosticHandler handler, Diagnostic diagnostic) {
		handleDiagnostic(handler, diagnostic);
		for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
			processDiagnostic(handler, childDiagnostic);
		}
	}
	
	private static void handleDiagnostic(DiagnosticHandler handler, Diagnostic diagnostic) {
		switch (diagnostic.getSeverity()) {
		case Diagnostic.OK:
			handler.handleOkDiagnostic(diagnostic);
			break;
		case Diagnostic.WARNING:
			handler.handleWarningDiagnostic(diagnostic);
			break;
		case Diagnostic.INFO:
			handler.handleInfoDiagnostic(diagnostic);
			break;
		case Diagnostic.ERROR:
			handler.handleErrorDiagnostic(diagnostic);
			break;
		case Diagnostic.CANCEL:
			handler.handleCancelDiagnostic(diagnostic);
			break;
		}
	}
	
	public static class DiagnosticHandler {		
		private PrintStream out = null;
		
		public DiagnosticHandler(OutputStream os) {
			out = new PrintStream(os);
		}

		public DiagnosticHandler() {
			out = System.out;
		}
		
		public void close() {
			if (out != null && !out.equals(System.out)) {
				out.close();
				out = null;
			}
		}
		
		public void handleOkDiagnostic(Diagnostic diagnostic) {
			out.println("OK: " + diagnostic.getMessage());
		}
		
		public void handleErrorDiagnostic(Diagnostic diagnostic) {
			out.println("ERROR: " + diagnostic.getMessage());
		}
		
		public void handleWarningDiagnostic(Diagnostic diagnostic) {
			out.println("WARNING: " + diagnostic.getMessage());
		}
		
		public void handleInfoDiagnostic(Diagnostic diagnostic) {
			out.println("INFO: " + diagnostic.getMessage());
		}
		
		public void handleCancelDiagnostic(Diagnostic diagnostic) {
			out.println("CANCEL: " + diagnostic.getMessage());
		}
	}

	public static EObject load(InputStream in, boolean adjustNamespace) throws Exception {
		CDAPackage.eINSTANCE.eClass();
		DocumentBuilder builder = newDocumentBuilder();
		Document doc = builder.parse(in);
		if (adjustNamespace) {
			adjustNamespace(doc);
		}
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.load(doc, null);
		new CDAResourceHandler().postLoad(resource, in, null);
		return resource.getContents().get(0);
	}
	
	// TODO: Create a generic mechanism for populating an instance from annotations.
	public static void init(EObject object) {
		CDAUtil.addTemplateIds(object);
		CDAUtil.setCode(object);
	}

	public static II getTemplateId(EClass eClass) {
		II templateId = null;
		String root = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "templateId.root");
		String extension = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "templateId.extension");
		if (root != null) {
			templateId = DatatypesFactory.eINSTANCE.createII();
			templateId.setRoot(root);
			if (extension != null) {
				templateId.setExtension(extension);
			}
		}
		return templateId;
	}
	
	public static EObject getCode(EClass eClass) {
		EObject codeObject = null;
		String code = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "code.code");
		String codeSystem = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "code.codeSystem");
		String codeSystemName = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "code.codeSystemName");
		String displayName = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "code.displayName");
		String nullFlavor = EcoreUtil.getAnnotation(eClass, CDA_ANNOTATION_SOURCE, "code.nullFlavor");
		
		if (code != null || nullFlavor != null) {
			EStructuralFeature feature = eClass.getEStructuralFeature("code");
			if (feature != null) {
				codeObject = DatatypesFactory.eINSTANCE.create((EClass) feature.getEType());
				if (code != null) {
					codeObject.eSet(codeObject.eClass().getEStructuralFeature("code"), code);
				}
				if (codeSystem != null) {
					codeObject.eSet(codeObject.eClass().getEStructuralFeature("codeSystem"), codeSystem);
				}
				if (codeSystemName != null) {
					codeObject.eSet(codeObject.eClass().getEStructuralFeature("codeSystemName"), codeSystemName);
				}
				if (displayName != null) {
					codeObject.eSet(codeObject.eClass().getEStructuralFeature("displayName"), displayName);
				}
				if (nullFlavor != null) {
					codeObject.eSet(codeObject.eClass().getEStructuralFeature("nullFlavor"), NullFlavor.get(nullFlavor));
				}
			}
		}
		return codeObject;
	}

	@SuppressWarnings("unchecked")
	public static void addTemplateIds(EObject object) {
		EList<II> list = (EList<II>) object.eGet(object.eClass().getEStructuralFeature("templateId"));
		II templateId = null;
		for (EClass eClass : object.eClass().getEAllSuperTypes()) {
			templateId = CDAUtil.getTemplateId(eClass);
			if (templateId != null) {
				list.add(templateId);
			}
		}
		templateId = CDAUtil.getTemplateId(object.eClass());
		if (templateId != null) {
			list.add(templateId);
		}
	}

	public static void setCode(EObject object) {
		EObject code = null;
		for (EClass eClass : object.eClass().getEAllSuperTypes()) {
			code = CDAUtil.getCode(eClass);
			if (code != null) {
				object.eSet(object.eClass().getEStructuralFeature("code"), code);
			}
		}
		code = CDAUtil.getCode(object.eClass());
		if (code != null) {
			object.eSet(object.eClass().getEStructuralFeature("code"), code);
		}
	}
	
	public static void printDocument(Document doc, OutputStream out) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setAttribute("indent-number", new Integer(2));
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		System.out.println("");
		transformer.transform(new DOMSource(doc), new StreamResult(new OutputStreamWriter(out, "utf-8")));
		System.out.println("");
	}
	
	public static DocumentBuilder newDocumentBuilder() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		return factory.newDocumentBuilder();
	}
	
	public static Document newDocument() throws Exception {
		return newDocumentBuilder().newDocument();
	}
	
	public static void adjustNamespace(Document doc) {
		Element root = doc.getDocumentElement();
		if (root.hasAttribute("xmlns")) {
			root.removeAttribute("xmlns");
			root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + CDAPackage.eNS_PREFIX, CDAPackage.eNS_URI);
			root.setPrefix(CDAPackage.eNS_PREFIX);
		}
	}
	
	// TODO: Refactor this into an OCL constraint.
	public static boolean validateClinicalStatementChoiceGroup(EObject object) {
		List<EObject> choiceGroup = new ArrayList<EObject>();
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("act")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("encounter")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("observation")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("observationMedia")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("organizer")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("procedure")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("regionOfInterest")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("substanceAdministration")));
		choiceGroup.add((EObject) object.eGet(object.eClass().getEStructuralFeature("supply")));
		return validateChoiceGroup(choiceGroup);
	}

	public static boolean validateChoiceGroup(List<EObject> choiceGroup) {
		boolean defined = false;
		for (EObject member : choiceGroup) {
			if (member != null) {
				if (defined) {
					return false;
				} else {
					defined = true;
				}
			}
		}
		return defined;
	}
}
