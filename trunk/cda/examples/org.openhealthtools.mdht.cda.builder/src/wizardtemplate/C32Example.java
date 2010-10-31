package wizardtemplate;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder.AllergiesReactionSectionDirector;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class C32Example {
	
	
	public static String RXNORM= "2.16.840.1.113883.6.88"; // RxNorm
	public static String SNOMEDCT =	"2.16.840.1.113883.6.96"; // SNOMED Controlled Terminology
	public static String HL7ACTCODE = "2.16.840.1.113883.5.4"; // HL7 ActCode vocabulary
	
	static public EntryRelationship createActiveStatus() {

		EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

		status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

		AlertStatusObservation observationStatus = CCDFactory.eINSTANCE.createAlertStatusObservation().init();

		observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", SNOMEDCT, "", "Active"));

		status.setObservation(observationStatus);

		return status;

	}

	static public AllergyDrugSensitivity createActiveAllergyDrugSensitivity(CE drug, CD reaction) {

		AllergyDrugSensitivity allergyDrugSensitivity = HITSPFactory.eINSTANCE.createAllergyDrugSensitivity().init();

		AlertObservation alertObservation = CCDFactory.eINSTANCE.createAlertObservation().init();

		allergyDrugSensitivity.addObservation(alertObservation);

		Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();

		participant.setTypeCode(ParticipationType.CSM);

		ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();

		participantRole.setClassCode(RoleClassRoot.MANU);

		PlayingEntity playingEntity = CDAFactory.eINSTANCE.createPlayingEntity();

		PN pn = DatatypesFactory.eINSTANCE.createPN();

		pn.addText(drug.getDisplayName());

		playingEntity.getNames().add(pn);

		participantRole.setPlayingEntity(playingEntity);

		participantRole.getPlayingEntity().setClassCode(EntityClassRoot.MMAT);

		participantRole.getPlayingEntity().setCode(drug);

		participant.setParticipantRole(participantRole);

		alertObservation.getParticipants().add(participant);

		EntryRelationship hives = CDAFactory.eINSTANCE.createEntryRelationship();

		hives.setTypeCode(x_ActRelationshipEntryRelationship.MFST);

		hives.setInversionInd(true);

		ReactionObservation hivesReaction = CCDFactory.eINSTANCE.createReactionObservation().init();

		hivesReaction.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", HL7ACTCODE, "", ""));

		hivesReaction.getValues().add(reaction);

		hives.setObservation(hivesReaction);

		alertObservation.getEntryRelationships().add(hives);

		alertObservation.getEntryRelationships().add(createActiveStatus());

		return allergyDrugSensitivity;
	}

	public static class C32AllergiesReactionSection extends AllergiesReactionSectionDirector {

		@Override
		public List<Act> buildActs() {

			List<Act> acts = new ArrayList<Act>();
			
			CE drug = DatatypesFactory.eINSTANCE.createCE("70618", RXNORM, "", "Penicillin");
			
			CD reaction = DatatypesFactory.eINSTANCE.createCD("247472004", SNOMEDCT, "", "Hives");
			
			AllergyDrugSensitivity allergyDrugSensitivity = createActiveAllergyDrugSensitivity(drug, reaction);
			
			acts.add(allergyDrugSensitivity);

			return acts;
		}
	}

	public static void main(String[] args) {

		C32DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public AllergiesReactionSectionDirector getAllergiesReactionSectionDirector() {
				return new C32AllergiesReactionSection();
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
