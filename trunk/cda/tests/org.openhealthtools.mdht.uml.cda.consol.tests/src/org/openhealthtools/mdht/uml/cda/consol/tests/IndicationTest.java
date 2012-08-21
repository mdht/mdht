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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.operations.IndicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Indication#validateIndicationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Indication Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IndicationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIndicationCodeNullFlavor() {
		OperationsTestCase<Indication> validateIndicationCodeNullFlavorTestCase = new OperationsTestCase<Indication>(
			"validateIndicationCodeNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();

				cd.setNullFlavor(NullFlavor.UNK);

				target.getValues().add(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationCodeNullFlavor(
					(Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationCodeNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationTemplateId() {
		OperationsTestCase<Indication> validateIndicationTemplateIdTestCase = new OperationsTestCase<Indication>(
			"validateIndicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationTemplateId((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationClassCode() {
		OperationsTestCase<Indication> validateIndicationClassCodeTestCase = new OperationsTestCase<Indication>(
			"validateIndicationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationClassCode((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIndicationCode() {
		OperationsTestCase<Indication> validateIndicationCodeTestCase = new OperationsTestCase<Indication>(
			"validateIndicationCode",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("404684003", "2.16.840.1.113883.6.96", "", "");

				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationCode((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationEffectiveTime() {
		OperationsTestCase<Indication> validateIndicationEffectiveTimeTestCase = new OperationsTestCase<Indication>(
			"validateIndicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationEffectiveTime(
					(Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIndicationId() {
		OperationsTestCase<Indication> validateIndicationIdTestCase = new OperationsTestCase<Indication>(
			"validateIndicationId",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication target) {
				target.init();
			}

			@Override
			protected void updateToPass(Indication target) {

				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationId((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationCodeP() {
		OperationsTestCase<Indication> validateIndicationCodePTestCase = new OperationsTestCase<Indication>(
			"validateIndicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationCodeP((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationMoodCode() {
		OperationsTestCase<Indication> validateIndicationMoodCodeTestCase = new OperationsTestCase<Indication>(
			"validateIndicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationMoodCode((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndicationStatusCode() {
		OperationsTestCase<Indication> validateIndicationStatusCodeTestCase = new OperationsTestCase<Indication>(
			"validateIndicationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationStatusCode((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIndicationValue() {
		OperationsTestCase<Indication> validateIndicationValueTestCase = new OperationsTestCase<Indication>(
			"validateIndicationValue",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

				target.getValues().add(DatatypesFactory.eINSTANCE.createCS());

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				target.getValues().clear();

				CD value = DatatypesFactory.eINSTANCE.createCD("code", "2.16.840.1.113883.6.96", "", "");

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationValue((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIndicationValueP() {
		OperationsTestCase<Indication> validateIndicationValuePTestCase = new OperationsTestCase<Indication>(
			"validateIndicationValueP",
			operationsForOCL.getOCLValue("VALIDATE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Indication target) {

				target.getValues().add(DatatypesFactory.eINSTANCE.createCS());

			}

			@Override
			protected void updateToPass(Indication target) {
				target.init();

				target.getValues().clear();

				CD value = DatatypesFactory.eINSTANCE.createCD("code", "2.16.840.1.113883.6.96", "", "");

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IndicationOperations.validateIndicationValueP((Indication) objectToTest, diagnostician, map);
			}

		};

		validateIndicationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IndicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Indication> {
		public Indication create() {
			return ConsolFactory.eINSTANCE.createIndication();
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
	private static class ConstructorTestClass extends IndicationOperations {
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

} // IndicationOperations
