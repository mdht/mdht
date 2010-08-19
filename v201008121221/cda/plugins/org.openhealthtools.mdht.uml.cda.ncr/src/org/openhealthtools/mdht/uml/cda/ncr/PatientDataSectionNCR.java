/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ncr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Data Section NCR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the specific reason for which the summarization was generated, such as in response to a request.
 * The general use case does not require a purpose. Purpose should be utilized when the CCD has a specific purpose such as a transfer, referral, or patient request.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ncr.NCRPackage#getPatientDataSectionNCR()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.17.2.5' constraints.validation.error='PatientDataSectionTemplateId PatientDataSectionNCREncountersSection PatientDataSectionNCRAcuityDataSection PatientDataSectionNCRBirthWeight'"
 * @generated
 */
public interface PatientDataSectionNCR extends PatientDataSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::EncountersSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::EncountersSection))'"
	 * @generated
	 */
	boolean validatePatientDataSectionNCREncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::AcuityDataSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ncr::AcuityDataSection))'"
	 * @generated
	 */
	boolean validatePatientDataSectionNCRAcuityDataSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ncr::BirthWeight) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ncr::BirthWeight) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validatePatientDataSectionNCRBirthWeight(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientDataSectionNCR init();
} // PatientDataSectionNCR
