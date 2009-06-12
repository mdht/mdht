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
package org.openhealthtools.mdht.uml.cda.internal.operations;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#setStructuredBody(org.openhealthtools.mdht.uml.cda.StructuredBody) <em>Set Structured Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addSection(org.openhealthtools.mdht.uml.cda.Section) <em>Add Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getSection(int) <em>Get Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addPatientRole(org.openhealthtools.mdht.uml.cda.PatientRole) <em>Add Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getPatientRole(int) <em>Get Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#addPatient(org.openhealthtools.mdht.uml.cda.Patient) <em>Add Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument#getPatient(int) <em>Get Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalDocumentOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void setStructuredBody(ClinicalDocument clinicalDocument, StructuredBody structuredBody) {
		Component2 component = clinicalDocument.getComponent();
		if (component == null) {
			component = CDAFactory.eINSTANCE.createComponent2();
			clinicalDocument.setComponent(component);
		}
		component.setStructuredBody(structuredBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addSection(ClinicalDocument clinicalDocument, Section section) {
		Component2 component2 = clinicalDocument.getComponent();
		if (component2 == null) {
			component2 = CDAFactory.eINSTANCE.createComponent2();
			clinicalDocument.setComponent(component2);
		}
		StructuredBody structuredBody = component2.getStructuredBody();
		if (structuredBody == null) {
			structuredBody = CDAFactory.eINSTANCE.createStructuredBody();
			component2.setStructuredBody(structuredBody);
		}
		Component3 component3 = CDAFactory.eINSTANCE.createComponent3();
		component3.setSection(section);
		structuredBody.getComponent().add(component3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  Section getSection(ClinicalDocument clinicalDocument, int index) {
		Section section = null;
		Component2 component2 = clinicalDocument.getComponent();
		if (component2 != null) {
			StructuredBody structuredBody = component2.getStructuredBody();
			if (structuredBody != null) {
				Component3 component3 = structuredBody.getComponent().get(index);
				if (component3 != null) {
					section = component3.getSection();
				}
			}
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addPatientRole(ClinicalDocument clinicalDocument, PatientRole patientRole) {
		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		recordTarget.setPatientRole(patientRole);
		clinicalDocument.getRecordTarget().add(recordTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  PatientRole getPatientRole(ClinicalDocument clinicalDocument, int index) {
		PatientRole patientRole = null;
		RecordTarget recordTarget = clinicalDocument.getRecordTarget().get(index);
		if (recordTarget != null) {
			patientRole = recordTarget.getPatientRole();
		}
		return patientRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addPatient(ClinicalDocument clinicalDocument, Patient patient) {
		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);
		patientRole.setPatient(patient);
		clinicalDocument.getRecordTarget().add(recordTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  Patient getPatient(ClinicalDocument clinicalDocument, int index) {
		Patient patient = null;
		RecordTarget recordTarget = clinicalDocument.getRecordTarget().get(index);
		if (recordTarget != null) {
			PatientRole patientRole = recordTarget.getPatientRole();
			if (patientRole != null) {
				patient = patientRole.getPatient();
			}
		}
		return patient;
	}

} // ClinicalDocumentOperations