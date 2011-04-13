/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.builder.examples;

import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.builder.HITSPBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class PatientSummaryExample {

	public static void main(String[] args) {
		
		try {

			// Create an instance of the PatientSummaryBuilder 
			DocumentBuilder<PatientSummary> patientSummarybuilder = HITSPBuilderFactory.createPatientSummaryBuilder();
			
			// Create instances of the sections supported by the PatientSummary specification 
			FamilyHistorySection familyHistorySection = HITSPFactory.eINSTANCE.createFamilyHistorySection().init();		
			FunctionalStatusSection functionalStatusSection = HITSPFactory.eINSTANCE.createFunctionalStatusSection ().init();			
			ImmunizationsSection immunizationsSection = HITSPFactory.eINSTANCE.createImmunizationsSection ().init();			
			MedicalEquipmentSection medicalEquipmentSection = HITSPFactory.eINSTANCE.createMedicalEquipmentSection ().init();			
			MedicationsSection medicationsSection = HITSPFactory.eINSTANCE.createMedicationsSection ().init();			
			PayersSection payersSection = HITSPFactory.eINSTANCE.createPayersSection ().init();			
			PlanOfCareSection planOfCareSection = HITSPFactory.eINSTANCE.createPlanOfCareSection ().init();			
			SocialHistorySection socialHistorySection  = HITSPFactory.eINSTANCE.createSocialHistorySection ().init();			
			VitalSignsSection  vitalSignsSection = HITSPFactory.eINSTANCE.createVitalSignsSection ().init();			
			AdvanceDirectivesSection advanceDirectivesSection  = HITSPFactory.eINSTANCE.createAdvanceDirectivesSection ().init();			
			EncountersSection encountersSection = HITSPFactory.eINSTANCE.createEncountersSection ().init();
			
			// Set the builder Sections and call the buildDocument method to create the Continuity Of Care Document  
			PatientSummary patientSummaryDocument = patientSummarybuilder.with(familyHistorySection)
														  .with(functionalStatusSection)
														  .with(immunizationsSection)
														  .with(medicalEquipmentSection)
														  .with(medicationsSection)
														  .with(payersSection)
														  .with(planOfCareSection)
														  .with(socialHistorySection)
													      .with(vitalSignsSection)
														  .with(advanceDirectivesSection)
														  .with(encountersSection)
														  .buildDocument();
			
			// Use the CDAUtil method to save instance to System.out,  You can use the same method to save to a file
			CDAUtil.save(patientSummaryDocument, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
