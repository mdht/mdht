/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.builder.examples;

import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.builder.CDABuilderFactory;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.PatientBuilder;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.builder.CCDBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.datatypes.builder.DatatypesBuilderFactory;
import org.openhealthtools.mdht.uml.datatypes.builder.PNBuilder;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;

public class ContinuityOfCareDocumentExample {

	public static void main(String[] args) {

		try {

			// Create an instance of the ContinuityOfCareDocumentBuilder
			DocumentBuilder<ContinuityOfCareDocument> CCDbuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();

			PNBuilder pnBuilder = DatatypesBuilderFactory.createPNBuilder();

			PN patientName = pnBuilder.withGivenName("First").withFamilyName("Last").withSuffix("MD").build();

			PatientBuilder patientBuilder = CDABuilderFactory.createPatientBuilder();

			Patient patient = patientBuilder.withName(patientName).withAdministrativeGender(
				DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1")).withBirthTime(
				DatatypesFactory.eINSTANCE.createTS("1/1/1970")).withId(
				DatatypesFactory.eINSTANCE.createII("123456789")).build();

			// Create instances of the sections supported by the ContinuityOfCareDocument specification
			ProblemSection problemSection = CCDFactory.eINSTANCE.createProblemSection().init();
			FamilyHistorySection familyHistorySection = CCDFactory.eINSTANCE.createFamilyHistorySection().init();
			FunctionalStatusSection functionalStatusSection = CCDFactory.eINSTANCE.createFunctionalStatusSection().init();
			ImmunizationsSection immunizationsSection = CCDFactory.eINSTANCE.createImmunizationsSection().init();
			MedicalEquipmentSection medicalEquipmentSection = CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();
			MedicationsSection medicationsSection = CCDFactory.eINSTANCE.createMedicationsSection().init();
			PayersSection payersSection = CCDFactory.eINSTANCE.createPayersSection().init();
			PlanOfCareSection planOfCareSection = CCDFactory.eINSTANCE.createPlanOfCareSection().init();
			ProceduresSection procedureSection = CCDFactory.eINSTANCE.createProceduresSection().init();
			PurposeSection purposeSection = CCDFactory.eINSTANCE.createPurposeSection().init();
			ResultsSection resultsSection = CCDFactory.eINSTANCE.createResultsSection().init();
			SocialHistorySection socialHistorySection = CCDFactory.eINSTANCE.createSocialHistorySection().init();
			VitalSignsSection vitalSignsSection = CCDFactory.eINSTANCE.createVitalSignsSection().init();
			AlertsSection alertsSection = CCDFactory.eINSTANCE.createAlertsSection().init();
			AdvanceDirectivesSection advanceDirectivesSection = CCDFactory.eINSTANCE.createAdvanceDirectivesSection().init();
			EncountersSection encountersSection = CCDFactory.eINSTANCE.createEncountersSection().init();

			// Set the builder Sections and call the buildDocument method to create the Continuity Of Care Document
			ContinuityOfCareDocument continuityOfCareDocument = CCDbuilder.with(patient).with(problemSection).with(
				familyHistorySection).with(functionalStatusSection).with(immunizationsSection).with(
				medicalEquipmentSection).with(medicationsSection).with(payersSection).with(planOfCareSection).with(
				procedureSection).with(purposeSection).with(resultsSection).with(socialHistorySection).with(
				vitalSignsSection).with(alertsSection).with(advanceDirectivesSection).with(encountersSection).buildDocument();

			// Use the CDAUtil method to save instance to System.out, You can use the same method to save to a file
			CDAUtil.save(continuityOfCareDocument, System.out);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
