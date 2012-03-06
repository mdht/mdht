/*******************************************************************************
 * Copyright (c) 2012 ramakrishnanr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     ramakrishnanr - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consoltoc.tests;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.util.CDADiagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;

/**
 * @author ramakrishnanr
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=========================");
//		testDS("DS.sample.l3.conformances");
		validateAndLog("DS.sample.l3.conformances");
		System.out.println("=========================");
	}

	public static void testDS(String fileName) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/";
		ConsoltocPackage.eINSTANCE.eClass();
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument clinicalDocument = CDAUtil.load((new FileInputStream(path + fileName + ".xml")), result);
			
			System.out.println(clinicalDocument);
			System.out.println(clinicalDocument.getAllSections().size());
			for (Object j : clinicalDocument.getAllSections()) {
				System.out.println(j);
			}
			
			DischargeSummary ds = (DischargeSummary)clinicalDocument ;
			System.out.println(ds.getAllergiesSectionEntriesOptional());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeLog(String fileName, StringBuffer sb) {
		String path = "log/" ;
		try {
			FileWriter fw = new FileWriter(path + fileName + ".log" );
			BufferedWriter out = new BufferedWriter(fw);
			out.write(sb.toString());
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static StringBuffer validate(String fileName) {
		StringBuffer sb = new StringBuffer();
		String path = "samples/" ;
		
		ValidationResult result = new ValidationResult();
		try {
			ClinicalDocument clinicalDocument = CDAUtil.load ( (new FileInputStream(path +fileName + ".xml")),result);	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
//		for (Diagnostic d: result.getInfoDiagnostics()) {
//			CDADiagnostic cdaDiagnostic = new CDADiagnostic(d);
//			sb.append("INFO|"+cdaDiagnostic.getMessage() +"|"+cdaDiagnostic.getPath()+ "|"+ cdaDiagnostic.getCode() + "|" + cdaDiagnostic.getSource());
//			sb.append("\n");
//		}
		for (Diagnostic dq: result.getErrorDiagnostics()) {
			CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
			sb.append("ERROR|"+cdaDiagnosticq.getMessage() +"|"+ cdaDiagnosticq.getPath()+ "|" + cdaDiagnosticq.getCode() + "|" + cdaDiagnosticq.getSource() );
			sb.append("\n");
		}
//		for (Diagnostic dw: result.getWarningDiagnostics()) {
//			CDADiagnostic cdaDiagnosticw = new CDADiagnostic(dw);
//			sb.append("WARN|"+cdaDiagnosticw.getMessage() +"|"+ cdaDiagnosticw.getPath()+ "|"+ cdaDiagnosticw.getSource() + "|" + cdaDiagnosticw.getCode() + "|" + cdaDiagnosticw.getSource() );
//			sb.append("\n");
//		}
		System.out.println(sb.toString());
		return sb;
	}
	
	public static void validateAndLog(String fileName) {
		ConsoltocPackage.eINSTANCE.eClass();
		StringBuffer sb = validate(fileName);
		writeLog(fileName, sb);
	}


}
