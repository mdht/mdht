/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.cda.generate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.eclipse.emf.common.util.Diagnostic;

import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder.ImmunizationsSectionBuilder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * C32Example is an example implementation of the MDHT DocumentBuilder based on
 * the GOF BuilderPattern. see http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example uses C32DocumentBuilder which creates the minimum structures to
 * create valid (no errors) C32 V2.5
 * 
 */

public class C32Generator {

	private static String getCellValueAsString(HSSFCell cell) {
		if (cell != null) {
			return cell.getStringCellValue();
		} else {
			return "";
		}
	}

	private static String getCellValueFromDate(HSSFCell cell) {
		if (cell != null) {
			Date date = cell.getDateCellValue();
			return sdf.format(date);
		} else {
			return "";
		}
	}
	
	/**
	 * creates an {@link HSSFWorkbook} the specified OS filename.
	 */
	static HSSFWorkbook readFile(String filename) throws IOException {
		return new HSSFWorkbook(new FileInputStream(filename));
	}

	static String DATE_FORMAT = "MM/dd/yyyy";

	// Create object of SimpleDateFormat and pass the desired date format.

	static SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

	public static class ExcelBuildPatient extends BuildPatient {

	

		private static String getGivenName(HSSFRow row) {
			return getCellValueAsString(row.getCell(0));
		}

		private static String getFamilyName(HSSFRow row) {
			return getCellValueAsString(row.getCell(1));
		}

		private static String getSuffix(HSSFRow row) {
			return getCellValueAsString(row.getCell(2));
		}

		private static String getDOB(HSSFRow row) {
			return getCellValueFromDate(row.getCell(3));
		}

		private static String getGender(HSSFRow row) {
			return getCellValueAsString(row.getCell(4));
		}

		public ExcelBuildPatient(HSSFRow row) {
			super(getGivenName(row), getFamilyName(row), getSuffix(row),
					getDOB(row), getGender(row));
		}

	}

	public static void main(String[] args) {

		String fileName = args[0];

		final HSSFWorkbook wb;

		try {
			wb = C32Generator.readFile(fileName);

			/*
			 * Define and override various builders
			 */
			DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

				// note a single Random object is reused here
				Random randomGenerator = new Random();

				HSSFSheet patients = wb.getSheet("Patients");
				
				HSSFSheet immunizationsSheet = wb.getSheet("Immunizations");

				@Override
				public Builder<Patient> getPatientBuilder() {

					int rows = patients.getPhysicalNumberOfRows() - 1;

					int randomRow = randomGenerator.nextInt(rows) + 1;

					return new ExcelBuildPatient(patients.getRow(randomRow));
				}
				
				
				@Override
				public ImmunizationsSectionBuilder getImmunizationsSectionBuilder() {
					return new ImmunizationsSectionBuilder() {

						@Override
						public ArrayBuilder<SubstanceAdministration> getSubstanceAdministrationBuilder() {
							return new ArrayBuilder<SubstanceAdministration>() {

								@Override
								public List<SubstanceAdministration> construct() {

									int rows = immunizationsSheet.getPhysicalNumberOfRows() - 1;

									ArrayList<SubstanceAdministration> immunizations = new ArrayList<SubstanceAdministration>();

									for (int i = 0; i<5; i++) {

										

										int randomRow = randomGenerator.nextInt(rows) + 1;
										
										HSSFRow row = immunizationsSheet.getRow(randomRow);
										
										
										
									Immunization immunization = HITSPFactory.eINSTANCE.createImmunization().init();

									immunization.setNegationInd(false);

									immunization.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

									immunization.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

									SXCM_TS effectiveTime = DatatypesFactory.eINSTANCE.createSXCM_TS();
									
									effectiveTime.setNullFlavor(NullFlavor.UNK);

									immunization.getEffectiveTimes().add(effectiveTime);

									immunization.setCode(DatatypesFactory.eINSTANCE.createCD("IMMUNIZ", "2.16.840.1.113883.5.4", "ActCode", ""));

									Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

									Product product = IHEFactory.eINSTANCE.createProductEntry().init();

									Material material = CDAFactory.eINSTANCE.createMaterial();

									CE ce = DatatypesFactory.eINSTANCE.createCE();
									
									ce.setCode(getCellValueAsString(row.getCell(0)));
									
									ce.setCodeSystem("2.16.840.1.113883.6.59");

									ce.setDisplayName(getCellValueAsString(row.getCell(1)));

									ce.setOriginalText(DatatypesFactory.eINSTANCE.createED(getCellValueAsString(row.getCell(2))));

									material.setCode(ce);

									product.setManufacturedMaterial(material);

									consumable.setManufacturedProduct(product);

									immunization.setConsumable(consumable);

									immunizations.add(immunization);
									}

									return immunizations;
								}
							};
						}

					};
				}


			};

			try {
				

				System.out.println("Start C32 Document Build Example");

				for (int i = 0; i < 5; i++) {
					ClinicalDocument clinicalDocument = exampleHITSPC32
							.buildDocument();

					CDAUtil.save(clinicalDocument, System.out);
					
					boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
						@Override
						public void handleError(Diagnostic diagnostic) {
							System.out.println("ERROR: " + diagnostic.getMessage());
						}						
					});
					
	

				}
				System.out.println("Completed C32 Document Build Example");

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
