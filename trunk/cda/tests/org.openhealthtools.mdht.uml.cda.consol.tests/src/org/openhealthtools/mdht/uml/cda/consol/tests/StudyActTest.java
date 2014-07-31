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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.StudyActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActIdsHaveRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Ids Have Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActNoIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act No Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActSeriesAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Series Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#getSeriesAct() <em>Get Series Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class StudyActTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActIdsHaveRoot() {
		OperationsTestCase<StudyAct> validateStudyActIdsHaveRootTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActIdsHaveRoot",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.getIds().clear();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("test");
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActIdsHaveRoot((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActIdsHaveRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActNoIdExtension() {
		OperationsTestCase<StudyAct> validateStudyActNoIdExtensionTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActNoIdExtension",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setExtension("test");
				target.getIds().add(id);
			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.getIds().clear();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("test");
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActNoIdExtension((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActNoIdExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActTextReference() {
		OperationsTestCase<StudyAct> validateStudyActTextReferenceTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActTextReference",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(StudyAct target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActTextReference((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActTextReferenceValue() {
		OperationsTestCase<StudyAct> validateStudyActTextReferenceValueTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(StudyAct target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActTextReferenceValue(
					(StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActReferenceValue() {
		OperationsTestCase<StudyAct> validateStudyActReferenceValueTestCase = new NarrativeReferenceTestCase<StudyAct>(
			"validateStudyActReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(StudyAct target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActReferenceValue((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActTemplateId() {
		OperationsTestCase<StudyAct> validateStudyActTemplateIdTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActTemplateId((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActClassCode() {
		OperationsTestCase<StudyAct> validateStudyActClassCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActClassCode((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActMoodCode() {
		OperationsTestCase<StudyAct> validateStudyActMoodCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActMoodCode((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActId() {
		OperationsTestCase<StudyAct> validateStudyActIdTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActId",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActId((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActCode() {
		OperationsTestCase<StudyAct> validateStudyActCodeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActCode",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("113014", "1.2.840.10008.2.16.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActCode((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActEffectiveTime() {
		OperationsTestCase<StudyAct> validateStudyActEffectiveTimeTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActEffectiveTime((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStudyActText() {
		OperationsTestCase<StudyAct> validateStudyActTextTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActText",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {

			}

			@Override
			protected void updateToPass(StudyAct target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActText((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStudyActSeriesAct() {
		OperationsTestCase<StudyAct> validateStudyActSeriesActTestCase = new OperationsTestCase<StudyAct>(
			"validateStudyActSeriesAct",
			operationsForOCL.getOCLValue("VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StudyAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(StudyAct target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createSeriesAct().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StudyActOperations.validateStudyActSeriesAct((StudyAct) objectToTest, diagnostician, map);
			}

		};

		validateStudyActSeriesActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeriesAct() {

		StudyAct target = objectFactory.create();
		target.getSeriesAct();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends StudyActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyAct> {
		public StudyAct create() {
			return ConsolFactory.eINSTANCE.createStudyAct();
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
	private static class ConstructorTestClass extends StudyActOperations {
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

} // StudyActOperations
