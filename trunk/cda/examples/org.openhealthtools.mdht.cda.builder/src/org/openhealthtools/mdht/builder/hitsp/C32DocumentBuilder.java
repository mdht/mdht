package org.openhealthtools.mdht.builder.hitsp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

public class C32DocumentBuilder extends DocumentBuilder {

	@Override
	public CE buildDocumentCode() {
		return new BuilderUtil.BuildCE("34133-9", "2.16.840.1.113883.6.1", "LOINC", "Summarization of episode note").construct();
	}

	@Override
	public CE buildDocumentConfidentialityCode() {
		return new BuilderUtil.BuildCE("", "", "", "").construct();
	}

	@Override
	public II buildDocumentId() {
		return DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString());
	}

	@Override
	public InfrastructureRootTypeId buildDocumentType() {

		InfrastructureRootTypeId infrastructureRootTypeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();

		infrastructureRootTypeId.setRoot("2.16.840.1.113883.1.3");

		infrastructureRootTypeId.setExtension("POCD_HD000040");

		return infrastructureRootTypeId;
	}

	@Override
	public ST buildDocumentTitle() {
		return DatatypesFactory.eINSTANCE.createST();
	}

	@Override
	public TS buildDocumentEffectiveTime() {
		return new BuilderUtil.BuildEffectiveTime("yyyyMMddkkmmssZ").construct();
	}

	@Override
	public CS buildDocumentLanguageCode() {
		return new BuilderUtil.BuildCS("nn-CC").construct();
	}

	@Override
	public List<Author> buildAuthors() {

		ArrayList<Author> authors = new ArrayList<Author>();

		Author author = CDAFactory.eINSTANCE.createAuthor();

		author.setTime(new BuilderUtil.BuildEffectiveTime().construct());

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();

		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

		assignedAuthor.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

		assignedAuthor.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

		Person person = CDAFactory.eINSTANCE.createPerson();

		person.getNames().add(DatatypesFactory.eINSTANCE.createPN());

		assignedAuthor.setAssignedPerson(person);

		author.setAssignedAuthor(assignedAuthor);

		authors.add(author);

		return authors;
	}

	@Override
	public PatientRole buildPatientRole() {

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();

		patientRole.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

		AD ad = DatatypesFactory.eINSTANCE.createAD();

		ad.setNullFlavor(NullFlavor.UNK);

		patientRole.getAddrs().add(ad);

		patientRole.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

		return patientRole;

	}

	@Override
	public Patient buildPatient() {

		Patient patient = CDAFactory.eINSTANCE.createPatient();

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("UN", "2.16.840.1.113883.5.1");

		patient.setAdministrativeGenderCode(administrativeGenderCode);

		PN pn = DatatypesFactory.eINSTANCE.createPN();

		pn.setNullFlavor(NullFlavor.UNK);

		patient.getNames().add(pn);

		TS ts = DatatypesFactory.eINSTANCE.createTS();

		ts.setNullFlavor(NullFlavor.UNK);

		patient.setBirthTime(ts);

		return patient;

	}

	@Override
	public List<DocumentationOf> buildDocumentationsOf() {

		ArrayList<DocumentationOf> documentationOfs = new ArrayList<DocumentationOf>();

		DocumentationOf documentationOf = CDAFactory.eINSTANCE.createDocumentationOf();

		ServiceEvent serviceEvent = CDAFactory.eINSTANCE.createServiceEvent();

		serviceEvent.setClassCode(ActClassRoot.PCPR);

		String effectiveTime = BuilderUtil.TSDF.format(Calendar.getInstance().getTime());

		serviceEvent.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS(effectiveTime, effectiveTime));

		documentationOf.setServiceEvent(serviceEvent);

		documentationOfs.add(documentationOf);

		return documentationOfs;

	}

	public Custodian buildCustodian() {

		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();

		custodian.setAssignedCustodian(assignedCustodian);

		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();

		custodianOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

		ON on = DatatypesFactory.eINSTANCE.createON();

		custodianOrganization.setName(on);

		custodianOrganization.setAddr(DatatypesFactory.eINSTANCE.createAD());

		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL());

		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);

		return custodian;

	}

}
