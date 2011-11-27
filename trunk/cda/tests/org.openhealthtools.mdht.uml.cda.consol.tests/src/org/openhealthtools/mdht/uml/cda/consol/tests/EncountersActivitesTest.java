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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncountersActivites;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersActivitesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Activites</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesHasIndications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesHasPractitioners(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Has Practitioners</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesPractitionerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Practitioner Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#validateEncountersActivitesIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activites Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersActivites#getIndication() <em>Get Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersActivitesTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesHasIndications() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesHasIndicationsTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesHasIndications",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesHasIndications(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesHasIndicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesHasPractitioners() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesHasPractitionersTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesHasPractitioners",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesHasPractitioners(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesHasPractitionersTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesPractitionerRole() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesPractitionerRoleTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesPractitionerRole",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesPractitionerRole(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesPractitionerRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesTemplateId() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesTemplateIdTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesTemplateId(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesClassCode() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesClassCodeTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesClassCode(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesMoodCode() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesMoodCodeTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesMoodCode(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesId() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesIdTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesId(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesEffectiveTime() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesEffectiveTimeTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesEffectiveTime(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivitesIndication() {
		OperationsTestCase<EncountersActivites> validateEncountersActivitesIndicationTestCase = new OperationsTestCase<EncountersActivites>(
			"validateEncountersActivitesIndication",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivites target) {

			}

			@Override
			protected void updateToPass(EncountersActivites target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivitesOperations.validateEncountersActivitesIndication(
					(EncountersActivites) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivitesIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication() {

		EncountersActivites target = objectFactory.create();
		target.getIndication();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncountersActivitesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersActivites> {
		public EncountersActivites create() {
			return ConsolFactory.eINSTANCE.createEncountersActivites();
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
	private static class ConstructorTestClass extends EncountersActivitesOperations {
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

} // EncountersActivitesOperations
