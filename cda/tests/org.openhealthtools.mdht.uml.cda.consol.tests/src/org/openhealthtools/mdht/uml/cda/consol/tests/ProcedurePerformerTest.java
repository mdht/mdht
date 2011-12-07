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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedurePerformerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedurePerformerTest extends CDAValidationTest {

	/**
	* 
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntity() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntity(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityId() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityIdTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(value);
			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {

				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				value.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityId(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityAddr() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityAddrTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				value.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityAddr(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityTelecom() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				value.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityTelecom(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityRepOrg() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityRepOrgTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityRepOrg",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				value.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrg(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityRepOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityRepOrgId() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityRepOrgIdTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityRepOrgId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization o = CDAFactory.eINSTANCE.createOrganization();
				o.getIds().add(DatatypesFactory.eINSTANCE.createII());
				value.getRepresentedOrganizations().add(o);
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgId(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityRepOrgIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityRepOrgName() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityRepOrgNameTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityRepOrgName",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization o = CDAFactory.eINSTANCE.createOrganization();
				o.getNames().add(DatatypesFactory.eINSTANCE.createON());
				value.getRepresentedOrganizations().add(o);
				target.setAssignedEntity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgName(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityRepOrgNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityRepOrgAddr() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityRepOrgAddrTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityRepOrgAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization o = CDAFactory.eINSTANCE.createOrganization();
				o.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				value.getRepresentedOrganizations().add(o);
				target.setAssignedEntity(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgAddr(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityRepOrgAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedurePerformerAssignedEntityRepOrgTelecom() {
		OperationsTestCase<ProcedurePerformer> validateProcedurePerformerAssignedEntityRepOrgTelecomTestCase = new OperationsTestCase<ProcedurePerformer>(
			"validateProcedurePerformerAssignedEntityRepOrgTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePerformer target) {

			}

			@Override
			protected void updateToPass(ProcedurePerformer target) {
				target.init();
				AssignedEntity value = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization o = CDAFactory.eINSTANCE.createOrganization();
				o.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				value.getRepresentedOrganizations().add(o);
				target.setAssignedEntity(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePerformerOperations.validateProcedurePerformerAssignedEntityRepOrgTelecom(
					(ProcedurePerformer) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerAssignedEntityRepOrgTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedurePerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedurePerformer> {
		public ProcedurePerformer create() {
			return ConsolFactory.eINSTANCE.createProcedurePerformer();
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
	private static class ConstructorTestClass extends ProcedurePerformerOperations {
	}

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

} // ProcedurePerformerOperations
