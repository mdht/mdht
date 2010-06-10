/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;

/**
 * This class is a JUnit4 test case.
 */
public class ADOperationsTest extends DatatypesValidationOperationsText {

	/**
	 * This class is used to hold the details of a single validation test.
	 */
	private static abstract class ADTestCase extends DatatypeTestCase {
		AddressPartType partType;

		public ADTestCase(final EStructuralFeature feature,
				final AddressPartType partType) {
			super(feature);
			this.partType = partType;
		}

		@Override
		@SuppressWarnings("unchecked")
		public void createAndAddPartType(final EObject eObjectToTest) {
			final ADXP enxp = DatatypesFactory.eINSTANCE.createADXP(partType,
					TEST_TEXT);
			((EList<ADXP>) (eObjectToTest.eGet(feature))).add(enxp);
		}

		@Override
		@SuppressWarnings( { "unchecked" })
		public void createAndAddBadPartType(final EObject eObjectToTest) {
			final ADXP enxpBad = DatatypesFactory.eINSTANCE.createADXP();
			((EList<ADXP>) (eObjectToTest.eGet(feature))).add(enxpBad);
		}
	} // ADTestCase

	private static final DatatypeTestCase TEST_CASE_ARRAY[] = {
	// delimiter
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_Delimiter(),
					AddressPartType.DEL) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDelimiter((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDelimiter((AD) eObjectToTest, text);
				}

			},
			
			// country
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_Country(),
					AddressPartType.CNT) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateCountry((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addCountry((AD) eObjectToTest, text);
				}
			},
			
			// state
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_State(),
					AddressPartType.STA) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateState((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addState((AD) eObjectToTest, text);
				}
			},

			// county
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_County(),
					AddressPartType.CPA) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateCounty((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addCounty((AD) eObjectToTest, text);
				}
			},

			// city
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_City(),
					AddressPartType.CTY) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateCity((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addCity((AD) eObjectToTest, text);
				}
			},

			// postalCode
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_PostalCode(),
					AddressPartType.ZIP) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validatePostalCode((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addPostalCode((AD) eObjectToTest, text);
				}
			},

			// streetAddress
			// -------------------------------------------------------------
			new ADTestCase(
					DatatypesPackage.eINSTANCE.getAD_StreetAddressLine(),
					AddressPartType.SAL) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateStreetAddressLine(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addStreetAddressLine((AD) eObjectToTest, text);
				}
			},

			// houseNumber
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_HouseNumber(),
					AddressPartType.BNR) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateHouseNumber((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addHouseNumber((AD) eObjectToTest, text);
				}
			},

			// houseNumberNumeric
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_HouseNumberNumeric(), AddressPartType.BNN) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateHouseNumberNumeric(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations
							.addHouseNumberNumeric((AD) eObjectToTest, text);
				}
			},

			// direction
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_Direction(),
					AddressPartType.DIR) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDirection((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDirection((AD) eObjectToTest, text);
				}
			},

			// streetName
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_StreetName(),
					AddressPartType.STR) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateStreetName((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addStreetName((AD) eObjectToTest, text);
				}
			},

			// streetNameBase
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_StreetNameBase(),
					AddressPartType.STB) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateStreetNameBase(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addStreetNameBase((AD) eObjectToTest, text);
				}
			},

			// streetNameType
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_StreetNameType(),
					AddressPartType.STTYP) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateStreetNameType(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addStreetNameType((AD) eObjectToTest, text);
				}
			},

			// additionalLocator
			// -------------------------------------------------------------
			new ADTestCase(
					DatatypesPackage.eINSTANCE.getAD_AdditionalLocator(),
					AddressPartType.ADL) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateAdditionalLocator(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addAdditionalLocator((AD) eObjectToTest, text);
				}

				// We override for this case because the default is ADL
				@SuppressWarnings("unchecked")
				@Override
				public void createAndAddBadPartType(final EObject eObjectToTest) {
					final ADXP enxpBad = DatatypesFactory.eINSTANCE
							.createADXP();
					enxpBad.setPartType(AddressPartType.POB);
					((EList<ADXP>) (eObjectToTest.eGet(feature))).add(enxpBad);
				}

			},

			// unitID
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_UnitID(),
					AddressPartType.UNID) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateUnitID((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addUnitID((AD) eObjectToTest, text);
				}

			},

			// unitType
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_UnitType(),
					AddressPartType.UNIT) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateUnitType((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addUnitType((AD) eObjectToTest, text);
				}
			},

			// careOf
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_CareOf(),
					AddressPartType.CAR) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateCareOf((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addCareOf((AD) eObjectToTest, text);
				}
			},

			// censusTract
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_CensusTract(),
					AddressPartType.CEN) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateCensusTract((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addCensusTract((AD) eObjectToTest, text);
				}
			},

			// deliveryAddressLine
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_DeliveryAddressLine(), AddressPartType.DAL) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryAddressLine(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryAddressLine((AD) eObjectToTest,
							text);
				}
			},

			// deliveryInstallationType
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_DeliveryInstallationType(), AddressPartType.DINST) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryInstallationType(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryInstallationType(
							(AD) eObjectToTest, text);
				}
			},

			// deliveryInstallationArea
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_DeliveryInstallationArea(), AddressPartType.DINSTA) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryInstallationArea(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryInstallationArea(
							(AD) eObjectToTest, text);
				}
			},

			// deliveryInstallationQualifier
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_DeliveryInstallationQualifier(),
					AddressPartType.DINSTQ) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryInstallationQualifier(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryInstallationQualifier(
							(AD) eObjectToTest, text);
				}
			},

			// deliveryMode
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_DeliveryMode(),
					AddressPartType.DMOD) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryMode(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryMode((AD) eObjectToTest, text);
				}
			},

			// deliveryModeIdentifier
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_DeliveryModeIdentifier(), AddressPartType.DMODID) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateDeliveryModeIdentifier(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addDeliveryModeIdentifier((AD) eObjectToTest,
							text);
				}
			},

			// buildingNumberSuffix
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE
					.getAD_BuildingNumberSuffix(), AddressPartType.BNS) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validateBuildingNumberSuffix(
							(AD) eObjectToTest, diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addBuildingNumberSuffix((AD) eObjectToTest,
							text);
				}
			},

			// postBox
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_PostBox(),
					AddressPartType.POB) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validatePostBox((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addPostBox((AD) eObjectToTest, text);

				}
			},

			// precinct
			// -------------------------------------------------------------
			new ADTestCase(DatatypesPackage.eINSTANCE.getAD_Precinct(),
					AddressPartType.PRE) {

				@Override
				public boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ADOperations.validatePrecinct((AD) eObjectToTest,
							diagnostician, map);
				}

				@Override
				public void add(final EObject eObjectToTest, final String text) {
					ADOperations.addPrecinct((AD) eObjectToTest, text);
				}
			} };

	@Override
	protected EObject getEObjectToTest() {
		return DatatypesFactory.eINSTANCE.createAD();
	}

	@Override
	protected List<DatatypeTestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<DatatypeTestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.datatypes.operations.ENOperations#addText(org.openhealthtools.mdht.uml.hl7.datatypes.EN, java.lang.String)}
	 * .
	 */
	@Test
	public final void testAddTextGetText() {
		final AD ad = (AD) getEObjectToTest();

		ad.addText(DatatypeTestCase.TEST_TEXT);
		assertTrue(ad.getText().equals(DatatypeTestCase.TEST_TEXT));
	}

} // ADOperationsTest