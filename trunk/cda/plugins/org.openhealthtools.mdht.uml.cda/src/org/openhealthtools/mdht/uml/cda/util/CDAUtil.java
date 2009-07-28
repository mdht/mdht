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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CDAUtil {
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	public static final String CDA_SCHEMA_LOCATION = CDAPackage.eNS_URI + " infrastructure/cda/CDA.xsd";
	
	public static ClinicalDocument load(InputStream in) throws Exception {
		return load(in, null);
	}
	
	public static ClinicalDocument load(InputStream in, LoadHandler handler) throws Exception {
		CDAPackage.eINSTANCE.eClass();
		DocumentBuilder builder = newDocumentBuilder();
		Document doc = builder.parse(in);
		adjustNamespace(doc);
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.load(doc, null);
		if (handler != null) {
			processResource(resource, handler);
		}
		return (ClinicalDocument) resource.getContents().get(0);
	}
	
	private static void processResource(XMLResource resource, LoadHandler handler) {
		Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
		for (EObject key : extMap.keySet()) {
			AnyType value = extMap.get(key);
			handleUnknownData(key, value, handler);
		}
	}
	
	private static void handleUnknownData(EObject object, AnyType unknownData, LoadHandler handler) {
		handleUnknownFeatures(object, unknownData.getMixed(), handler);
		handleUnknownFeatures(object, unknownData.getAnyAttribute(), handler);
	}

	private static void handleUnknownFeatures(EObject owner, FeatureMap featureMap, LoadHandler handler) {
		Iterator<FeatureMap.Entry> iterator = featureMap.iterator();
		while (iterator.hasNext()) {
			FeatureMap.Entry entry = iterator.next();
			EStructuralFeature feature = entry.getEStructuralFeature();
			if (handler.handleUnknownFeature(owner, feature, entry.getValue())) {
				iterator.remove();
			}
		}
	}
	
	public interface LoadHandler {
		public boolean handleUnknownFeature(EObject owner, EStructuralFeature feature, Object value);
	}
	
	public static void save(ClinicalDocument clinicalDocument, OutputStream out) throws Exception {
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.getContents().add(clinicalDocument);
		Document document = newDocument();
		resource.save(document, null, null);
		adjustNamespace(document);
		setSchemaLocation(document);
		save(document, out);
	}
	
	private static void adjustNamespace(Document document) {
		Element root = document.getDocumentElement();
		if (root.getPrefix() == null) {
			root.removeAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns");
		} else {
			root.removeAttributeNS(ExtendedMetaData.XMLNS_URI, root.getPrefix());
		}
		root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + CDAPackage.eNS_PREFIX, CDAPackage.eNS_URI);
		root.setPrefix(CDAPackage.eNS_PREFIX);
	}
	
	private static void setSchemaLocation(Document document) {
		Element root = document.getDocumentElement();
		root.setAttributeNS(ExtendedMetaData.XSI_URI, "xsi:schemaLocation", CDA_SCHEMA_LOCATION);
	}
	
	private static void save(Document document, OutputStream out) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		factory.setAttribute("indent-number", new Integer(2));
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		transformer.transform(new DOMSource(document), new StreamResult(new OutputStreamWriter(out, "utf-8")));
	}
	
	private static DocumentBuilder newDocumentBuilder() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		return factory.newDocumentBuilder();
	}
	
	private static Document newDocument() throws Exception {
		return newDocumentBuilder().newDocument();
	}
	
	public static boolean validate(EObject object) {
		return validate(object, null);
	}
	
	public static boolean validate(EObject object, ValidationHandler handler) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(object);
		if (handler != null) {
			processDiagnostic(diagnostic, handler);
		}
		return diagnostic.getSeverity() != Diagnostic.ERROR;
	}

	// iterative breadth-first traversal of diagnostic tree using queue
	private static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic);	// root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			handleDiagnostic(d, handler);	// visit
			for (Diagnostic childDiagnostic : d.getChildren()) {	// process successors
				queue.add(childDiagnostic);
			}
		}
	}
	
	/*
	// iterative depth-first traversal of diagnostic tree using stack
	private static void processDiagnostic(Diagnostic diagnostic, DiagnosticHandler handler) {
		Stack<Diagnostic> stack = new Stack<Diagnostic>();
		stack.push(diagnostic);		// root
		while (!stack.isEmpty()) {
			Diagnostic d = stack.pop();
			handleDiagnostic(d, handler);	// visit
			for (Diagnostic childDiagnostic : d.getChildren()) {	// process successors
				stack.push(childDiagnostic);
			}
		}
	}
	*/
	
	private static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
		case Diagnostic.ERROR:
			handler.handleError(diagnostic);
			break;
		case Diagnostic.WARNING:
			handler.handleWarning(diagnostic);
			break;
		case Diagnostic.INFO:
			handler.handleInfo(diagnostic);
			break;
		}
	}
	
	public interface ValidationHandler {
		public void handleError(Diagnostic diagnostic);
		public void handleWarning(Diagnostic diagnostic);
		public void handleInfo(Diagnostic diagnostic);
	}

	// walk up the containment tree until we reach the ClinicalDocument or we run out of containers
	public static ClinicalDocument getClinicalDocument(EObject object) {
		while (object != null && !(object instanceof ClinicalDocument)) {
			object = object.eContainer();
		}
		return (ClinicalDocument) object;
	}
	
	// walk up the containment tree until we reach a Section or we run out of containers
	public static Section getSection(EObject object) {
		while (object != null & !(object instanceof Section)) {
			object = object.eContainer();
		}
		return (Section) object;
	}
	
	// TODO: Create a generic mechanism for populating an instance from annotations.
	public static void init(EObject object) {
		addTemplateIds(object);
		setCode(object);
	}

	private static II getTemplateId(EClass eClass) {
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
	
	private static EObject getCode(EClass eClass) {
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
	private static void addTemplateIds(EObject object) {
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

	private static void setCode(EObject object) {
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
}
