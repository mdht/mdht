/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component5;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addAct(org.openhealthtools.mdht.uml.cda.Act) <em>Add Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addEncounter(org.openhealthtools.mdht.uml.cda.Encounter) <em>Add Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addObservation(org.openhealthtools.mdht.uml.cda.Observation) <em>Add Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addObservationMedia(org.openhealthtools.mdht.uml.cda.ObservationMedia) <em>Add Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addOrganizer(org.openhealthtools.mdht.uml.cda.Organizer) <em>Add Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addProcedure(org.openhealthtools.mdht.uml.cda.Procedure) <em>Add Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addRegionOfInterest(org.openhealthtools.mdht.uml.cda.RegionOfInterest) <em>Add Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addSection(org.openhealthtools.mdht.uml.cda.Section) <em>Add Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addSubstanceAdministration(org.openhealthtools.mdht.uml.cda.SubstanceAdministration) <em>Add Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#addSupply(org.openhealthtools.mdht.uml.cda.Supply) <em>Add Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#createStrucDocText(java.lang.String) <em>Create Struc Doc Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getAct() <em>Get Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getClinicalDocument() <em>Get Clinical Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getEncounter() <em>Get Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getObservationMedia() <em>Get Observation Media</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getOrganizer() <em>Get Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getProcedure() <em>Get Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getRegionOfInterest() <em>Get Region Of Interest</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getSection() <em>Get Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getSubstanceAdministration() <em>Get Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#getSupply() <em>Get Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasActTemplate(java.lang.String) <em>Has Act Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasCode(java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasEncounterTemplate(java.lang.String) <em>Has Encounter Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasObservationMediaTemplate(java.lang.String) <em>Has Observation Media Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasObservationTemplate(java.lang.String) <em>Has Observation Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasOrganizerTemplate(java.lang.String) <em>Has Organizer Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasProcedureTemplate(java.lang.String) <em>Has Procedure Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasRegionOfInterestTemplate(java.lang.String) <em>Has Region Of Interest Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasSubstanceAdministrationTemplate(java.lang.String) <em>Has Substance Administration Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasSectionTemplate(java.lang.String) <em>Has Section Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasSupplyTemplate(java.lang.String) <em>Has Supply Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Section#hasTemplateId(java.lang.String) <em>Has Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addAct(Section section, Act act) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setAct(act);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addEncounter(Section section, Encounter encounter) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setEncounter(encounter);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addObservation(Section section, Observation observation) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setObservation(observation);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addObservationMedia(Section section, ObservationMedia observationMedia) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setObservationMedia(observationMedia);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addOrganizer(Section section, Organizer organizer) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setOrganizer(organizer);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addProcedure(Section section, Procedure procedure) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setProcedure(procedure);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addRegionOfInterest(Section section, RegionOfInterest regionOfInterest) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setRegionOfInterest(regionOfInterest);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSection(Section section, Section newSection) {
		Component5 component5 = CDAFactory.eINSTANCE.createComponent5();
		component5.setSection(newSection);
		section.getComponent().add(component5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSubstanceAdministration(Section section, SubstanceAdministration substanceAdministration) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setSubstanceAdministration(substanceAdministration);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSupply(Section section, Supply supply) {
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setSupply(supply);
		section.getEntry().add(entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  StrucDocText createStrucDocText(Section section, String xmlString) {
		StrucDocText text = null;
		try {
			Resource.Factory factory = new GenericXMLResourceFactoryImpl();
			XMLResource resource = (XMLResource) factory.createResource(null);
			resource.load(new URIConverter.ReadableInputStream("<text>" + xmlString + "</text>"), null);
			XMLTypeDocumentRoot root = (XMLTypeDocumentRoot) resource.getContents().get(0);
			AnyType value = (AnyType) root.getMixed().getValue(0);
			text = CDAFactory.eINSTANCE.createStrucDocText();
			text.getMixed().addAll(value.getMixed());
			section.setText(text);
		} catch (Exception e) {}
		return text;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAct(Section) <em>Get Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACT__EOCL_EXP = "self.entry.act";

	/**
	 * The cached OCL query for the '{@link #getAct(Section) <em>Get Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.act
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Act> getAct(Section section) {
		if (GET_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(11));
			try {
				GET_ACT__EOCL_QRY = helper.createQuery(GET_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACT__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Act> result = (Collection<Act>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Act>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  ClinicalDocument getClinicalDocument(Section section) {
		return CDAUtil.getClinicalDocument(section);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncounter(Section) <em>Get Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTER__EOCL_EXP = "self.entry.encounter";

	/**
	 * The cached OCL query for the '{@link #getEncounter(Section) <em>Get Encounter</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.encounter
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Encounter> getEncounter(Section section) {
		if (GET_ENCOUNTER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(13));
			try {
				GET_ENCOUNTER__EOCL_QRY = helper.createQuery(GET_ENCOUNTER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Encounter> result = (Collection<Encounter>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Encounter>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservation(Section) <em>Get Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION__EOCL_EXP = "self.entry.observation";

	/**
	 * The cached OCL query for the '{@link #getObservation(Section) <em>Get Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.observation
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Observation> getObservation(Section section) {
		if (GET_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(14));
			try {
				GET_OBSERVATION__EOCL_QRY = helper.createQuery(GET_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Observation> result = (Collection<Observation>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Observation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getObservationMedia(Section) <em>Get Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSERVATION_MEDIA__EOCL_EXP = "self.entry.observationMedia";

	/**
	 * The cached OCL query for the '{@link #getObservationMedia(Section) <em>Get Observation Media</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationMedia(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSERVATION_MEDIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.observationMedia
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ObservationMedia> getObservationMedia(Section section) {
		if (GET_OBSERVATION_MEDIA__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(15));
			try {
				GET_OBSERVATION_MEDIA__EOCL_QRY = helper.createQuery(GET_OBSERVATION_MEDIA__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBSERVATION_MEDIA__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObservationMedia> result = (Collection<ObservationMedia>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<ObservationMedia>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOrganizer(Section) <em>Get Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ORGANIZER__EOCL_EXP = "self.entry.organizer";

	/**
	 * The cached OCL query for the '{@link #getOrganizer(Section) <em>Get Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizer(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.organizer
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Organizer> getOrganizer(Section section) {
		if (GET_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(16));
			try {
				GET_ORGANIZER__EOCL_QRY = helper.createQuery(GET_ORGANIZER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ORGANIZER__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Organizer> result = (Collection<Organizer>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Organizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedure(Section) <em>Get Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE__EOCL_EXP = "self.entry.procedure";

	/**
	 * The cached OCL query for the '{@link #getProcedure(Section) <em>Get Procedure</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.procedure
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedure(Section section) {
		if (GET_PROCEDURE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(17));
			try {
				GET_PROCEDURE__EOCL_QRY = helper.createQuery(GET_PROCEDURE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRegionOfInterest(Section) <em>Get Region Of Interest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REGION_OF_INTEREST__EOCL_EXP = "self.entry.regionOfInterest";

	/**
	 * The cached OCL query for the '{@link #getRegionOfInterest(Section) <em>Get Region Of Interest</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionOfInterest(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REGION_OF_INTEREST__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.regionOfInterest
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<RegionOfInterest> getRegionOfInterest(Section section) {
		if (GET_REGION_OF_INTEREST__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(18));
			try {
				GET_REGION_OF_INTEREST__EOCL_QRY = helper.createQuery(GET_REGION_OF_INTEREST__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REGION_OF_INTEREST__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RegionOfInterest> result = (Collection<RegionOfInterest>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<RegionOfInterest>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSection(Section) <em>Get Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SECTION__EOCL_EXP = "self.component.section";

	/**
	 * The cached OCL query for the '{@link #getSection(Section) <em>Get Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component.section
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Section> getSection(Section section) {
		if (GET_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(19));
			try {
				GET_SECTION__EOCL_QRY = helper.createQuery(GET_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SECTION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Section> result = (Collection<Section>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Section>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubstanceAdministration(Section) <em>Get Substance Administration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP = "self.entry.substanceAdministration";

	/**
	 * The cached OCL query for the '{@link #getSubstanceAdministration(Section) <em>Get Substance Administration</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceAdministration(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.substanceAdministration
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<SubstanceAdministration> getSubstanceAdministration(Section section) {
		if (GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(20));
			try {
				GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY = helper.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBSTANCE_ADMINISTRATION__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SubstanceAdministration> result = (Collection<SubstanceAdministration>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<SubstanceAdministration>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupply(Section) <em>Get Supply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(Section)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY__EOCL_EXP = "self.entry.supply";

	/**
	 * The cached OCL query for the '{@link #getSupply(Section) <em>Get Supply</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupply(Section)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry.supply
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Supply> getSupply(Section section) {
		if (GET_SUPPLY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(21));
			try {
				GET_SUPPLY__EOCL_QRY = helper.createQuery(GET_SUPPLY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Supply> result = (Collection<Supply>) query.evaluate(section);
		return new BasicEList.UnmodifiableEList<Supply>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #hasActTemplate(Section, java.lang.String) <em>Has Act Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ACT_TEMPLATE__STRING__EOCL_EXP = "self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasActTemplate(Section, java.lang.String) <em>Has Act Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasActTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ACT_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAct()->exists(act : cda::Act | act.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasActTemplate(Section section, String templateId) {
		if (HAS_ACT_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(22));
			try {
				HAS_ACT_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ACT_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasCode(Section, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(Section, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_CODE__STRING_STRING_STRING__EOCL_EXP = "self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName";

	/**
	 * The cached OCL query for the '{@link #hasCode(Section, java.lang.String, java.lang.String, java.lang.String) <em>Has Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasCode(Section, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_CODE__STRING_STRING_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.code = code and self.code.codeSystem = codeSystem and self.code.codeSystemName = codeSystemName
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasCode(Section section, String code, String codeSystem, String codeSystemName) {
		if (HAS_CODE__STRING_STRING_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(23));
			try {
				HAS_CODE__STRING_STRING_STRING__EOCL_QRY = helper.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_CODE__STRING_STRING_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("code", code);
		environment.add("codeSystem", codeSystem);
		environment.add("codeSystemName", codeSystemName);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasEncounterTemplate(Section, java.lang.String) <em>Has Encounter Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP = "self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasEncounterTemplate(Section, java.lang.String) <em>Has Encounter Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasEncounterTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounter()->exists(enc : cda::Encounter | enc.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasEncounterTemplate(Section section, String templateId) {
		if (HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(24));
			try {
				HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ENCOUNTER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationMediaTemplate(Section, java.lang.String) <em>Has Observation Media Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP = "self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationMediaTemplate(Section, java.lang.String) <em>Has Observation Media Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationMediaTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservationMedia()->exists(media : cda::ObservationMedia | media.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationMediaTemplate(Section section, String templateId) {
		if (HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(25));
			try {
				HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_MEDIA_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasObservationTemplate(Section, java.lang.String) <em>Has Observation Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP = "self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasObservationTemplate(Section, java.lang.String) <em>Has Observation Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasObservationTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservation()->exists(obs : cda::Observation | obs.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasObservationTemplate(Section section, String templateId) {
		if (HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(26));
			try {
				HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_OBSERVATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasOrganizerTemplate(Section, java.lang.String) <em>Has Organizer Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP = "self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasOrganizerTemplate(Section, java.lang.String) <em>Has Organizer Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasOrganizerTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizer()->exists(org : cda::Organizer | org.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasOrganizerTemplate(Section section, String templateId) {
		if (HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(27));
			try {
				HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_ORGANIZER_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasProcedureTemplate(Section, java.lang.String) <em>Has Procedure Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP = "self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasProcedureTemplate(Section, java.lang.String) <em>Has Procedure Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasProcedureTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedure()->exists(proc : cda::Procedure | proc.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasProcedureTemplate(Section section, String templateId) {
		if (HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(28));
			try {
				HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_PROCEDURE_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasRegionOfInterestTemplate(Section, java.lang.String) <em>Has Region Of Interest Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP = "self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasRegionOfInterestTemplate(Section, java.lang.String) <em>Has Region Of Interest Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasRegionOfInterestTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getRegionOfInterest()->exists(reg : cda::RegionOfInterest | reg.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasRegionOfInterestTemplate(Section section, String templateId) {
		if (HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(29));
			try {
				HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_REGION_OF_INTEREST_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSubstanceAdministrationTemplate(Section, java.lang.String) <em>Has Substance Administration Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP = "self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSubstanceAdministrationTemplate(Section, java.lang.String) <em>Has Substance Administration Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSubstanceAdministrationTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministration()->exists(sub : cda::SubstanceAdministration | sub.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSubstanceAdministrationTemplate(Section section, String templateId) {
		if (HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(30));
			try {
				HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUBSTANCE_ADMINISTRATION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSectionTemplate(Section, java.lang.String) <em>Has Section Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSectionTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SECTION_TEMPLATE__STRING__EOCL_EXP = "self.getSection()->exists(sect : cda::Section | sect.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSectionTemplate(Section, java.lang.String) <em>Has Section Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSectionTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SECTION_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->exists(sect : cda::Section | sect.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSectionTemplate(Section section, String templateId) {
		if (HAS_SECTION_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(31));
			try {
				HAS_SECTION_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SECTION_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SECTION_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasSupplyTemplate(Section, java.lang.String) <em>Has Supply Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP = "self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))";

	/**
	 * The cached OCL query for the '{@link #hasSupplyTemplate(Section, java.lang.String) <em>Has Supply Template</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasSupplyTemplate(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupply()->exists(sup : cda::Supply | sup.hasTemplateId(templateId))
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasSupplyTemplate(Section section, String templateId) {
		if (HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(32));
			try {
				HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY = helper.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_SUPPLY_TEMPLATE__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #hasTemplateId(Section, java.lang.String) <em>Has Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String HAS_TEMPLATE_ID__STRING__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = templateId)";

	/**
	 * The cached OCL query for the '{@link #hasTemplateId(Section, java.lang.String) <em>Has Template Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasTemplateId(Section, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> HAS_TEMPLATE_ID__STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = templateId)
	 * @param section The receiving '<em><b>Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean hasTemplateId(Section section, String templateId) {
		if (HAS_TEMPLATE_ID__STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.eINSTANCE.getSection(), CDAPackage.eINSTANCE.getSection().getEAllOperations().get(33));
			try {
				HAS_TEMPLATE_ID__STRING__EOCL_QRY = helper.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(HAS_TEMPLATE_ID__STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("templateId", templateId);
		return ((Boolean) query.evaluate(section)).booleanValue();
	}
	
} // SectionOperations