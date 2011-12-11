/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySubjectOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Subject</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Adm Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySubjectTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectClassCode() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectClassCodeTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				rs.setClassCode(x_DocumentSubject.PRS);
				target.setRelatedSubject(rs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectClassCode(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectCode() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectCodeTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				rs.setCode(ce);
				target.setRelatedSubject(rs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectCode(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectCodeValueSet() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectCodeValueSetTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				rs.setCode(ce);
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.5.111");
				rs.setCode(ce);
				target.setRelatedSubject(rs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectCodeValueSet(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubject() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {

				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				rs.setSubject(sub);
				target.setRelatedSubject(rs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubject(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubjectId() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectIdTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubjectId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectId(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCodeTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				rs.setSubject(sub);
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				CE agc = DatatypesFactory.eINSTANCE.createCE();
				agc.setCodeSystem("2.16.840.1.113883.5.1");
				sub.setAdministrativeGenderCode(agc);
				rs.setSubject(sub);
				target.setRelatedSubject(rs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubjectBirthTime() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectBirthTimeTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				target.init();
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				rs.setSubject(sub);
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				TS bt = DatatypesFactory.eINSTANCE.createTS();
				sub.setBirthTime(bt);
				rs.setSubject(sub);
				target.setRelatedSubject(rs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedIndTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime() {
		OperationsTestCase<FamilyHistorySubject> validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTimeTestCase = new OperationsTestCase<FamilyHistorySubject>(
			"validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				rs.setSubject(sub);
				target.setRelatedSubject(rs);
			}

			@Override
			protected void updateToPass(FamilyHistorySubject target) {
				RelatedSubject rs = CDAFactory.eINSTANCE.createRelatedSubject();
				SubjectPerson sub = CDAFactory.eINSTANCE.createSubjectPerson();
				TS dt = DatatypesFactory.eINSTANCE.createTS();
				sub.setSDTCDeceasedTime(dt);
				rs.setSubject(sub);
				target.setRelatedSubject(rs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(
					(FamilyHistorySubject) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistorySubjectOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySubject> {
		public FamilyHistorySubject create() {
			return ConsolFactory.eINSTANCE.createFamilyHistorySubject();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends FamilyHistorySubjectOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FamilyHistorySubjectOperations
