package org.openhealthtools.mdht.uml.cda.consol.operations;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.consol.CONSOLFactory;
import org.openhealthtools.mdht.uml.cda.consol.CONSOLPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.util.CONSOLValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperationsTest;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

public class GeneralHeaderConstraintsOperationsTest extends
		ClinicalDocumentOperationsTest {

	static private class CDADiagnosticCompare implements Comparator<Diagnostic> {

		public int compare(Diagnostic o1, Diagnostic o2) {

			int compareResult = o1.getSource().compareTo(o2.getSource());
			if (compareResult == 0) {
				if (o1.getSeverity() != o2.getSeverity()) {
					if (o1.getSeverity() < o2.getSeverity()) {
						compareResult = -1;
					} else {
						compareResult = 1;

					}
				}
			}

			if (compareResult == 0) {
				if (o1.getCode() != o2.getCode()) {
					if (o1.getCode() < o2.getCode()) {
						compareResult = -1;
					} else {
						compareResult = 1;
					}
				}
			}

			if (compareResult == 0) {
				compareResult = o1.getMessage().compareTo(o2.getMessage());
			}

			if (compareResult == 0) {
				if (!o1.getData().equals(o2.getData())) {
					compareResult = -1;
				}
			}

			return compareResult;
		}

	}

	@Test
	public void testGeneralHeaderConstraintsOperations() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsPersonHasName() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom() {

		GeneralHeaderConstraints generalHeaderConstraints = CONSOLFactory.eINSTANCE.createGeneralHeaderConstraints();

		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();

		Patient patient = CDAFactory.eINSTANCE.createPatient();

		Guardian guardian = CDAFactory.eINSTANCE.createGuardian();

		patient.getGuardians().add(guardian);

		patientRole.setPatient(patient);

		generalHeaderConstraints.addPatientRole(patientRole);

		BasicDiagnostic diagnostics = new BasicDiagnostic();

		Map<Object, Object> context = new HashMap<Object, Object>();

		try {
			System.out.println("\n \n Guardian HAS NO Address and Telecom XML \n");
			CDAUtil.save(generalHeaderConstraints, System.out);
		} catch (Exception e) {
			// TODO Auto-generated
			e.printStackTrace();
		}

		GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(generalHeaderConstraints, diagnostics, context);

		BasicDiagnostic key = new BasicDiagnostic(
				Diagnostic.WARNING,
				CONSOLValidator.DIAGNOSTIC_SOURCE,
				CONSOLValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
				CONSOLPlugin.INSTANCE.getString("GeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom"),
				new Object[] { guardian });

		assertTrue(Collections.binarySearch(diagnostics.getChildren(), key,	new CDADiagnosticCompare()) >= 0);

		guardian.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
		guardian.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
		diagnostics = new BasicDiagnostic();
		try {
			System.out.println("\n \n  Guardian HAS Address and Telecom XML \n");
			CDAUtil.save(generalHeaderConstraints, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

		GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(generalHeaderConstraints, diagnostics, context);

		assertTrue(Collections.binarySearch(diagnostics.getChildren(), key,	new CDADiagnosticCompare()) < 0);

	}

	@Test
	public void testValidateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsOrganizationsHaveContactInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTelephoneMatchesRegex() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasTelephoneDialingDigits() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTypeIdExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsOidLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndVersionNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndIdAreUnique() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsCopyTimeNotPresent() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasRecordTargetPatientRole() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasPatientBirthTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasAdministrativeGenderCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasProviderOrganization() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasAuthorTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasAssignedAuthorId() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasDataEntererAssignedPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasDataEntererTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasInformant() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToSecond() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToYearAndDay() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsEffectiveTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsRealmCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateGeneralHeaderConstraintsTypeId() {
		fail("Not yet implemented");
	}

}
