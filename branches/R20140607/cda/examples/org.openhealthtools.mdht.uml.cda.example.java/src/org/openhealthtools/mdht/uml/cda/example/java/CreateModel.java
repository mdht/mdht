/*******************************************************************************
 * Copyright (c) 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.example.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAResource;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class CreateModel {
	/*
	 * Set the first three String constants for your computer configuration.
	 */
	// the installed location for UML2 plugins
	private static final String uml2Resources = "jar:file:/C:/Program Files (x86)/IBM/SDPShared/plugins/org.eclipse.uml2.uml.resources_2.2.0.v200805131030.jar!";

	// if running installed MDHT plugins, use JAR path in installed plugins folder
	private static final String cdaResources = "D:/EclipseWorkspaces/oht-mdht-dev/org.openhealthtools.mdht.uml.cda.resources";

	// "jar:file:/C:\Program Files\IBM\SDPShared\plugins\plugins\org.openhealthtools.mdht.uml.cda.resources_0.1.0.200910061629.jar!";

	// workspace folder that contains the CDA model project, org.openhealthtools.mdht.uml.cda
	private static final String workspace = "D:/EclipseWorkspaces/HL7-CDA/";

	private static final URI CDA_MODEL_URI = URI.createFileURI(workspace +
			"org.openhealthtools.mdht.uml.cda/model/cda.uml");

	private static final URI DATATYPES_MODEL_URI = URI.createFileURI(workspace +
			"org.openhealthtools.mdht.uml.hl7.datatypes/model/datatypes.uml");

	private ResourceSet resourceSet = new ResourceSetImpl();

	public CreateModel() {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		// register UML2 pathmaps
		URIConverter.URI_MAP.put(
			URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createURI(uml2Resources + "/profiles/"));
		URIConverter.URI_MAP.put(
			URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createURI(uml2Resources + "/libraries/"));
		URIConverter.URI_MAP.put(
			URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createURI(uml2Resources + "/metamodels/"));

		// register MDHT pathmaps
		URIConverter.URI_MAP.put(
			URI.createURI(CDAResource.PROFILES_PATHMAP), URI.createFileURI(cdaResources + "/profiles/"));

	}

	public Package createModel(URI fileURI) {
		Resource resource = resourceSet.createResource(fileURI);

		// UML package must be added to a resource before applying stereotypes
		Package model = UMLFactory.eINSTANCE.createPackage();
		model.setName("MyTemplates");
		resource.getContents().add(model);

		initCDA(model);
		addContent(model);

		return model;
	}

	public void saveModel(Package model) {
		Map<String, String> options = new HashMap<String, String>();
		try {
			model.eResource().save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void initCDA(Package model) {
		ResourceSet resourceSet = model.eResource().getResourceSet();
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(resourceSet);
		if (cdaProfile != null) {
			model.applyProfile(cdaProfile);
		} else {
			throw new RuntimeException("Cannot find CDA profile");
		}

		Package cdaModel = getCDAModel(resourceSet);
		if (cdaModel != null) {
			model.createPackageImport(cdaModel);
		} else {
			throw new RuntimeException("Cannot find CDA model: " + CDA_MODEL_URI);
		}

		Package datatypesModel = getDatatypesModel(resourceSet);
		if (datatypesModel != null) {
			model.createPackageImport(datatypesModel);
		} else {
			throw new RuntimeException("Cannot find HL7 datatypes model: " + DATATYPES_MODEL_URI);
		}
	}

	protected void addContent(Package model) {
		ResourceSet resourceSet = model.eResource().getResourceSet();
		Package cdaModel = getCDAModel(resourceSet);
		Package datatypesModel = getDatatypesModel(resourceSet);

		Class clinicalDocument = (Class) cdaModel.getOwnedType("ClinicalDocument");
		Class section = (Class) cdaModel.getOwnedType("Section");
		Class observation = (Class) cdaModel.getOwnedType("Observation");

		Enumeration severityKind = (Enumeration) CDAProfileUtil.getCDAProfile(resourceSet).getOwnedType("SeverityKind");

		Class myDocument = model.createOwnedClass("MyDocument", false);
		myDocument.createGeneralization(clinicalDocument);
		Stereotype stereotype = CDAProfileUtil.applyCDAStereotype(myDocument, ICDAProfileConstants.CDA_TEMPLATE);
		myDocument.setValue(stereotype, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, "1.2.3.4.1");

		Class mySection = model.createOwnedClass("MySection", false);
		mySection.createGeneralization(section);
		stereotype = CDAProfileUtil.applyCDAStereotype(mySection, ICDAProfileConstants.CDA_TEMPLATE);
		mySection.setValue(stereotype, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, "1.2.3.4.2");
		myDocument.createAssociation(
			true, AggregationKind.NONE_LITERAL, "mySection", 1, -1, mySection, false, AggregationKind.NONE_LITERAL,
			null, 0, -1);
		Property property = mySection.createOwnedAttribute("code", datatypesModel.getOwnedType("CD"), 1, 1);
		stereotype = CDAProfileUtil.applyCDAStereotype(property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		property.setValue(stereotype, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE, "12312-5");
		property.setValue(stereotype, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME, "Swine Flu");
		property.setValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, severityKind.getOwnedLiteral("ERROR"));
		property.setValue(stereotype, ICDAProfileConstants.VALIDATION_MESSAGE, "MySection SHALL have code with...");

		Class myObservation = model.createOwnedClass("MyObservation", false);
		myObservation.createGeneralization(observation);
		stereotype = CDAProfileUtil.applyCDAStereotype(myObservation, ICDAProfileConstants.CDA_TEMPLATE);
		myObservation.setValue(stereotype, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, "1.2.3.4.3");
		Association association = mySection.createAssociation(
			true, AggregationKind.NONE_LITERAL, "myObservation", 0, -1, myObservation, false,
			AggregationKind.NONE_LITERAL, null, 0, -1);
		stereotype = CDAProfileUtil.applyCDAStereotype(association, ICDAProfileConstants.ENTRY);
		association.setValue(
			stereotype, ICDAProfileConstants.VALIDATION_SEVERITY, severityKind.getOwnedLiteral("WARNING"));
		association.setValue(
			stereotype, ICDAProfileConstants.VALIDATION_MESSAGE, "MySection SHOULD have one or more MyObservation");

	}

	private Package getCDAModel(ResourceSet resourceSet) {
		Package cdaModel = null;
		Resource resource = resourceSet.getResource(CDA_MODEL_URI, true);
		if (resource != null) {
			cdaModel = (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getPackage());
		}

		return cdaModel;
	}

	private Package getDatatypesModel(ResourceSet resourceSet) {
		Package datatypesModel = null;
		Resource resource = resourceSet.getResource(DATATYPES_MODEL_URI, true);
		if (resource != null) {
			datatypesModel = (Package) EcoreUtil.getObjectByType(
				resource.getContents(), UMLPackage.eINSTANCE.getPackage());
		}

		return datatypesModel;
	}
}
