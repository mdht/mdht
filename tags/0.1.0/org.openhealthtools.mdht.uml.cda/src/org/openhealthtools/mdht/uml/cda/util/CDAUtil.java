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
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResourceHandler;
import org.openhealthtools.mdht.uml.cda.resource.CDAResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CDAUtil {
	public static void save(EObject object, OutputStream out) throws Exception {
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.getContents().add(object);
		resource.save(out, null);
	}
	
	public static EObject load(InputStream in) throws Exception {
		return load(in, false);
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

	public static II getTemplateId(EClass eClass) {
		II templateId = null;
		String root = EcoreUtil.getAnnotation(eClass, "http://www.openhealthtools.org/mdht/uml/cda/annotation", "templateId.root");
		String extension = EcoreUtil.getAnnotation(eClass, "http://www.openhealthtools.org/mdht/uml/cda/annotation", "templateId.extension");
		if (root != null) {
			templateId = DatatypesFactory.eINSTANCE.createII();
			templateId.setRoot(root);
			if (extension != null) {
				templateId.setExtension(extension);
			}
		}
		return templateId;
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
