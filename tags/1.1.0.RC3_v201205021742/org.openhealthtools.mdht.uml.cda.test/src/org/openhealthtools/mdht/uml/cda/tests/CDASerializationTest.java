/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Before;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * This class is a JUnit 4 test case for CDA document serialization.
 */
@SuppressWarnings("nls")
public class CDASerializationTest {

	private static final String TEMP_CDA_FILE_PREFIX = "CDADoc";

	private static final String TEMP_CDA_FILE_SUFFIX = "xml";

	ClinicalDocument doc = null;

	/**
	 * Create and initialize a CDA document for serialization.
	 */
	@Before
	public void createCDADocument() {
		doc = CDAFactory.eINSTANCE.createClinicalDocument();

		InfrastructureRootTypeId typeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		typeId.setExtension("POCD_HD000040");
		doc.setTypeId(typeId);

		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.4", "c266");
		doc.setId(id);

		II templateId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.27.1776");
		doc.getTemplateIds().add(templateId);

		CE code = DatatypesFactory.eINSTANCE.createCE("11488-4", "2.16.840.1.113883.6.1", "LOINC", "Consultation note");
		doc.setCode(code);

		ST title = DatatypesFactory.eINSTANCE.createST("Good Health Clinic Consultation Note");
		doc.setTitle(title);

		TS effectiveTime = DatatypesFactory.eINSTANCE.createTS("20000407");
		doc.setEffectiveTime(effectiveTime);

		CE confidentialityCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confidentialityCode);

		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		doc.getRecordTargets().add(recordTarget);

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);

		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);

		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Henry").addFamily("Levin").addSuffix("the 7th");
		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1");
		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS("19320924");
		patient.setBirthTime(birthTime);

		Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
		providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5"));
		patientRole.setProviderOrganization(providerOrganization);

		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setTime(DatatypesFactory.eINSTANCE.createTS("2000040714"));
		doc.getAuthors().add(author);

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5", "KP00017"));
		author.setAssignedAuthor(assignedAuthor);

		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(assignedPerson);

		name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Bob").addFamily("Dolin").addSuffix("MD");
		assignedPerson.getNames().add(name);

	} // createCDADocument

	/**
	 * Test that the CDA Document can be serialized, and that when it is
	 * deserialized, we get the same thing we wrote.
	 */
	@Test
	public void serializeCDADocument() {
		try {
			// If you want to know where the temporary files are going,
			// un-comment the next statement.
			// System.out.println(System.getProperty("java.io.tmpdir"));

			final File tempFile = File.createTempFile(TEMP_CDA_FILE_PREFIX, TEMP_CDA_FILE_SUFFIX);

			// If you want the temporary files to stick around, comment out the
			// next statement.
			tempFile.deleteOnExit();

			final OutputStream out = new BufferedOutputStream((new FileOutputStream(tempFile)));

			// Write the document out to a temporary file.
			CDAUtil.save(doc, out);

			out.flush();
			out.close();

			// Now read it back in.
			final InputStream in = new BufferedInputStream(new FileInputStream(tempFile));

			final ClinicalDocument clinicalDocument = CDAUtil.load(in);
			assertNotNull(clinicalDocument);

			// What we wrote should be what we read back in
			assertTrue(
				"The CDA that was serialized doesn't equal the CDA that was deserialized",
				EcoreUtil.equals(doc, clinicalDocument));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	} // serializeCDADocument
} // CDASerializationTest
