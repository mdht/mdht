/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.SeriesActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Series Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActIdHasRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id Has Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActIdNoExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id No Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SeriesActTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActIdHasRoot() {
		OperationsTestCase<SeriesAct> validateSeriesActIdHasRootTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActIdHasRoot",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.getIds().clear();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("test");
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActIdHasRoot((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActIdHasRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActIdNoExtension() {
		OperationsTestCase<SeriesAct> validateSeriesActIdNoExtensionTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActIdNoExtension",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setExtension("test");
				target.getIds().add(id);
			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.getIds().clear();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("test");
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActIdNoExtension((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActIdNoExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActCodeQualifier() {
		OperationsTestCase<SeriesAct> validateSeriesActCodeQualifierTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCodeQualifier",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CV name = DatatypesFactory.eINSTANCE.createCV();
				name.setCode("121139");
				qual.setName(name);
				code.getQualifiers().add(qual);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActCodeQualifier((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActCodeQualifierCode() {
		OperationsTestCase<SeriesAct> validateSeriesActCodeQualifierCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCodeQualifierCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CV name = DatatypesFactory.eINSTANCE.createCV();
				name.setCode("121139");
				name.setCodeSystem("1.2.840.10008.2.16.4");
				qual.setName(name);
				code.getQualifiers().add(qual);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActCodeQualifierCode(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeQualifierCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActCodeQualifierValue() {
		OperationsTestCase<SeriesAct> validateSeriesActCodeQualifierValueTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCodeQualifierValue",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.setCodeSystem("1.2.840.10008.2.16.4");
				qual.setValue(val);
				code.getQualifiers().add(qual);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActCodeQualifierValue(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeQualifierValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActCodeQualifierValueCode() {
		OperationsTestCase<SeriesAct> validateSeriesActCodeQualifierValueCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCodeQualifierValueCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.setCodeSystem("1.2.840.10008.2.16.4");
				qual.setValue(val);
				code.getQualifiers().add(qual);
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActCodeQualifierValueCode(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeQualifierValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActTemplateId() {
		OperationsTestCase<SeriesAct> validateSeriesActTemplateIdTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActTemplateId((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActClassCode() {
		OperationsTestCase<SeriesAct> validateSeriesActClassCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActClassCode((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActMoodCode() {
		OperationsTestCase<SeriesAct> validateSeriesActMoodCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActMoodCode((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActCode() {
		OperationsTestCase<SeriesAct> validateSeriesActCodeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("113015", "1.2.840.10008.2.16.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActCode((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActEffectiveTime() {
		OperationsTestCase<SeriesAct> validateSeriesActEffectiveTimeTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActEffectiveTime((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActId() {
		OperationsTestCase<SeriesAct> validateSeriesActIdTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActId",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActId((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSeriesActText() {
		OperationsTestCase<SeriesAct> validateSeriesActTextTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActText",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {

			}

			@Override
			protected void updateToPass(SeriesAct target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActText((SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSeriesActSOPInstanceObservation() {
		OperationsTestCase<SeriesAct> validateSeriesActSOPInstanceObservationTestCase = new OperationsTestCase<SeriesAct>(
			"validateSeriesActSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SeriesAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(SeriesAct target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSOPInstanceObservation().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SeriesActOperations.validateSeriesActSOPInstanceObservation(
					(SeriesAct) objectToTest, diagnostician, map);
			}

		};

		validateSeriesActSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		SeriesAct target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SeriesActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SeriesAct> {
		public SeriesAct create() {
			return ConsolFactory.eINSTANCE.createSeriesAct();
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
	private static class ConstructorTestClass extends SeriesActOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // SeriesActOperations
