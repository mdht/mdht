package wizardtemplate;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder.AllergiesReactionSectionDirector;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

public class C32Example {
	
	

	

	public static class C32AllergiesReactionSectionDirector extends AllergiesReactionSectionDirector {

		@Override
		public List<Act> buildActs() {

			List<Act> acts = new ArrayList<Act>();

			CE drug = DatatypesFactory.eINSTANCE.createCE("70618", PatientSummaryBuilder.RXNORM, "", "Penicillin");

			CD reaction = DatatypesFactory.eINSTANCE.createCD("247472004", PatientSummaryBuilder.SNOMEDCT, "", "Hives");

			AllergyDrugSensitivity allergyDrugSensitivity = PatientSummaryBuilder.createActiveAllergyDrugSensitivity(drug, new CD[] {reaction});

			acts.add(allergyDrugSensitivity);

			return acts;
		}
	}

	public static void main(String[] args) {

		C32DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public AllergiesReactionSectionDirector getAllergiesReactionSectionDirector() {
				return new C32AllergiesReactionSectionDirector();
			}

		};

		try {

			System.out.println("Start C32 Document Build Example");

			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();

			CDAUtil.save(clinicalDocument, System.out);

			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
