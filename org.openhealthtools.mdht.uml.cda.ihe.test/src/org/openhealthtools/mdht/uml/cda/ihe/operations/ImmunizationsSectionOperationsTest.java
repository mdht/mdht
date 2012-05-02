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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Immunization;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ImmunizationsSectionOperationsTest extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.ImmunizationsSectionOperationsTest {

	// protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.3.23";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ImmunizationsSectionOperations.validateIHEImmunizationsSectionTemplateId(
	// (ImmunizationsSection) objectToTest, diagnostician, map);
	// }
	//
	// }
	//
	// }; // TEST_CASE_ARRAY
	//
	// @Override
	// protected List<CDATestCase> getTestCases() {
	// // Return a new List because the one returned by Arrays.asList is
	// // unmodifiable so a sub-class can't append their test cases.
	// final List<CDATestCase> retValue = super.getTestCases();
	// retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
	// return retValue;
	// }
	//
	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createImmunizationsSection();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createImmunizationsSection().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @Override
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// ImmunizationsSectionOperations obj = new ImmunizationsSectionOperations();
	// assertTrue(true);
	// } // testConstructor

	public static class OperationsForOCL extends ImmunizationsSectionOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<ImmunizationsSection> {
		public ImmunizationsSection create() {
			return IHEFactory.eINSTANCE.createImmunizationsSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateIHEImmunizationsSectionImmunization() {
		OperationsTestCase<ImmunizationsSection> testCase = new OperationsTestCase<ImmunizationsSection>(
			"validateIHEImmunizationsSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_IHE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createImmunization().init();
				target.addSubstanceAdministration(substanceAdministration);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationsSectionOperations.validateIHEImmunizationsSectionImmunization(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationsSectionTemplateId() {
		OperationsTestCase<ImmunizationsSection> testCase = new OperationsTestCase<ImmunizationsSection>(
			"ValidateImmunizationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationsSection target) {

			}

			@Override
			protected void updateToPass(ImmunizationsSection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationsSectionOperations.validateIHEImmunizationsSectionTemplateId(
					(ImmunizationsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testGetIHEVitalSignsOrganizers() {

		ImmunizationsSection immunizationsSection = objectFactory.create();

		immunizationsSection.init();

		final long TESTCOUNT = 100;
		for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {

			SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createImmunization().init();

			String vso = String.valueOf(vsoctr);
			CD cd = DatatypesFactory.eINSTANCE.createCD(vso, vso, vso, vso);
			substanceAdministration.setCode(cd);
			immunizationsSection.addSubstanceAdministration(substanceAdministration);
		}

		EList<Immunization> result = ImmunizationsSectionOperations.getImmunizations(immunizationsSection);
		;

		org.junit.Assert.assertEquals(result.size(), TESTCOUNT);

	}

} // ImmunizationsSectionOperationsTest
