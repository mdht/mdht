/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code as per artf3818 : Errata 384 
 *     								   Incorporate No Information Section Fixes SITE-462
 *******************************************************************************/

package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.MedicationsAdministeredSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#getMu2consolMedicationActivities() <em>Get Mu2consol Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsAdministeredSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolMedicationActivities() {

		MedicationsAdministeredSection target = objectFactory.create();
		target.getMu2consolMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTemplateId(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationsAdministeredSection target) {
						// 1: x- has section withOUT a nullFlavor of type NI and no entry
						// empty on purpose
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationsAdministeredSection target) {
						// *2: x- has section WITH a nullFlavor of type NA and no entry (incorrect nullFlavor type to negate)
						target.init();
						target.setNullFlavor(NullFlavor.NA);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationsAdministeredSection target) {
						// 3: x- has section withOUT a nullFlavor of any type - but has an INVALID entry
						target.init();
						target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity().init());
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationsAdministeredSection target) {
						// 1: x- has section withOUT a nullFlavor of any type - but HAS a valid entry
						target.init();
						target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationsAdministeredSection target) {
						// *2: x- has section WITH a nullFlavor of type NI and no entry (the correct type to negate)
						target.init();
						target.setNullFlavor(NullFlavor.NI);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationsAdministeredSection target) {
						// 3: x- has section WITH a nullFlavor of type NI and has a valid entry
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationsAdministeredSection target) {
						// 4: x- has section WITH a nullFlavor of type NI and has an INVALID entry
						target.init();
						target.setNullFlavor(NullFlavor.NI);
						target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionMedicationActivity(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsAdministeredSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection> {
		public MedicationsAdministeredSection create() {
			return Mu2consolFactory.eINSTANCE.createMedicationsAdministeredSection();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSectionOperations {
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

} // MedicationsAdministeredSectionOperations
