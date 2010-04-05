/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.cda.documentevent.processor.directorypoller;

import gov.nist.hitsp.validation.WSIndividualValidationResult;
import gov.nist.hitsp.validation.WSValidationResults;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.ServiceClient;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventProcessor;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventRegistry;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.xml.sax.SAXException;

/**
 * NIST Example
 * 
 * Building on the Directory Poller Example, the NIST Example validates
 * documents found in the directory against the MDHT Model and NIST WS.
 */
public class NISTDirectoryPoller {

	public static HashMap<String, String> schamtrontospec = new HashMap<String, String>();

	static public void FromToDiagnostic(String fromSource, String toSource,
			HashMap<String, ArrayList<String>> from,
			HashMap<String, ArrayList<String>> to) {

		for (String key : from.keySet()) {
			
			System.out.println("");
			
			System.out.println("Document Location : " + key);

			System.out.println("Initial Diagnostics reported by " + fromSource);
			
			Collections.sort(from.get(key));
			for (String message : from.get(key)) {
				System.out.println(message);
			}

			
			System.out.println("Corresponding Diagnostics reported by " + toSource);
			if (to.containsKey(key)) {
				Collections.sort(to.get(key));	
				for (String message : to.get(key)) {
					System.out.println(message);
				}

			} else {
				System.out.println("No Match");

			}
			System.out.println("");

			
		}
	}

	public static HashMap<String, ArrayList<String>> nistdiagnostics = new HashMap<String, ArrayList<String>>();

	static public void pushNISTDiagnostic(WSIndividualValidationResult validationResult) {
		
		// rudementary filtering
		if ( !errorsOnly  || validationResult.getSeverity().startsWith("error")) {
		
		pushMDHTDiagnostic(nistdiagnostics,validationResult.getContext(), String.format("%s : %s : %s : %s",getNISTSpecification(validationResult.getSpecification()),validationResult.getSeverity(),validationResult.getMessage(),validationResult.getTest()));

		}
		
	}
	
	public static String getNISTSpecification(String nistSpecification)
	{
		if (schamtrontospec.size() == 0){
			schamtrontospec.put("Schematron schema for validating conformance to CCD documents","org.openhealthtools.mdht.uml.cda.ccd");
		}

		if (schamtrontospec.containsKey(nistSpecification))
		{
			return schamtrontospec.get(nistSpecification);
		} else
		{
			return 	nistSpecification;
		}
			
	}

	public static HashMap<String, ArrayList<String>> mdhtdiagnostics = new HashMap<String, ArrayList<String>>();

	
	static public void pushMDHTDiagnostic(Diagnostic diagnostic)
	{
		String path="";
		String source="";
		String level="";
		String message="";
		String ocl="OCL Unavailable";
		
		// If diagnostic data has eobject
		if (diagnostic.getData().size() > 0 && diagnostic
				.getData().get(0) instanceof EObject) { 
		path  = getPath((EObject) diagnostic
				.getData().get(0));
		}
		
		source = diagnostic.getSource();
		
		level = getLevel(diagnostic.getSeverity());
		
		message = diagnostic.getMessage();
		 
		// if diagnostic has ocl
		if (diagnostic.getData().size() > 1
				&& diagnostic.getData().get(1) instanceof org.eclipse.ocl.Query) {
			org.eclipse.ocl.Query query = (org.eclipse.ocl.Query) diagnostic
					.getData().get(1);
			
			ocl = query.queryText();
		}	
		

		// rudementary filtering
		if ( !errorsOnly  || level.startsWith("error")) {
			pushMDHTDiagnostic(mdhtdiagnostics,path, String.format("%s : %s : %s : %s",source,level,message,ocl));
		}
	}

	
	 static public String getLevel(int level)
	{
		if (level == 1)
		{
			return "information";
		} else if (level == 2)
		{
			return "warning";
		} else {
			return "error";
		}
	}
	static public void pushMDHTDiagnostic(HashMap<String, ArrayList<String>> diagnostics,String path, String content) {

		String key = path.toLowerCase();

		if (!diagnostics.containsKey(key)) {
			diagnostics.put(key, new ArrayList<String>());
		}
		diagnostics.get(key).add(content);

	}

	static private class CDADirectoryPollingTask extends TimerTask {

		public CDADirectoryPollingTask(String cdaDirectory, int cdaDocumentCount) {
			super();
			this.cdaDocumentCount = cdaDocumentCount;
			this.cdaDirectory = new File(cdaDirectory);
		}

		int cdaDocumentCount = 0;

		File cdaDirectory = null;

		HashMap<String, String> processedFiles = new HashMap<String, String>();

		@Override
		public void run() {
			FilenameFilter xmlFilter = new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.endsWith(".xml");
				}
			};

			String[] cdaFiles = cdaDirectory.list(xmlFilter);
			if (cdaFiles == null) {
				System.out
						.println("Specified directory does not exist or is not a directory.");
				System.exit(0);
			} else {

				for (int i = 0; i < cdaFiles.length; i++) {
					String cdaFileName = cdaDirectory.getAbsolutePath()
							+ System.getProperty("file.separator")
							+ cdaFiles[i];

					// Instead of deleting or moving the file -
					// create a cache of processed files so you do not have to
					// keep moving files around
					// This polling logic does not take into account changes to
					// existing files
					if (!processedFiles.containsKey(cdaFileName)) {
						try {

							System.out.println("Processing File : "
									+ cdaFileName);

							loadAndProcess(new FileInputStream(cdaFileName));

						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						processedFiles.put(cdaFileName, cdaFileName);

						// Check to see if we have processed enough files
						if (--cdaDocumentCount <= 0) {
							System.out.println("Completed Processing");
							System.exit(0);
						}

					}

				}
			}

		}
	}

	public static ClinicalDocument loadAndProcess(InputStream in)
			throws Exception {

		ClinicalDocument clinicalDocument = CDAUtil.load(in, null);

		CDADocumentEventRegistry.processCDADocumentEvent(clinicalDocument);

		return clinicalDocument;

	}

	private static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof DocumentRoot)) {
			EStructuralFeature feature = eObject.eContainingFeature();
			EObject container = eObject.eContainer();
			Object value = container.eGet(feature);
			if (feature.isMany()) {
				List<EObject> list = (List<EObject>) value;
				int index = list.indexOf(eObject) + 1;
				path = "/" + feature.getName() + "[" + index + "]" + path;
			} else {
				path = "/" + feature.getName() + "[1]" + path;
			}
			eObject = eObject.eContainer();
		}
		return path;
	}

	static boolean errorsOnly = true;
	/*
	 * ID: cdar2
Name: CDA R2
Description: HL7 CDA R2 (with no extensions)

ID: ccd
Name: CCD
Description: Continuity of Care Document

ID: crs
Name: CRS Level 1 & 2
Description: HL7 Care Record Summary

ID: cda4Cdt
Name: CDA4CDT (header only)
Description: HL7 CDA For Common Document Types (CDA4CDT) -- header only

ID: c32_v2_5
Name: HITSP/C32 v2.5
Description: HITSP/C32 v2.5 Summary Documents Using HL7 CCD

ID: c32_v2_4
Name: HITSP/C32 v2.4
Description: HITSP/C32 v2.4 Summary Documents Using HL7 CCD

ID: c32
Name: HITSP/C32 v2.1
Description: HITSP/C32 v2.1 Summary Documents Using HL7 CCD

ID: summaryPatientRecord
Name: NHIN Summary Patient Record
Description: NHIN Summary Patient Record (based on HITSP/C32)

ID: iheLab
Name: IHE Lab 2008
Description: IHE Laboratory Report -- 2008 (CONNECTATHON ONLY!)

ID: c37
Name: HITSP/C37
Description: IHE Laboratory Report -- 2007

ID: c28nursing
Name: HITSP/C28 (Nursing)
Description: IHE PCC - Emergency Department Nursing Note -- 2008 -- DO NOT USE FOR NA2010 CONNECTATHON.  Use IHE PCC EDES documents.  See Bob Yencha for questions

ID: c28physician
Name: HITSP/C28 (Physician)
Description: IHE PCC - Emergency Department Physician Note -- 2008 -- DO NOT USE FOR NA2010 CONNECTATHON.  Use IHE PCC EDES documents.  See Bob Yencha for questions

ID: c28triage
Name: HITSP/C28 (Triage)
Description: IHE PCC - Emergency Department Triage Note -- 2008 -- DO NOT USE FOR NA2010 CONNECTATHON.  Use IHE PCC EDES documents.  See Bob Yencha for questions

ID: edNursing
Name: IHE EDES Nursing Note
Description: IHE PCC - Emergency Department Nursing Note -- 2009

ID: edPhysician
Name: IHE EDES Physician Note
Description: IHE PCC - Emergency Department Physician Note -- 2009

ID: edTriage
Name: IHE EDES Triage Note
Description: IHE PCC - Emergency Department Triage Note -- 2009

ID: edComposite
Name: IHE EDES Composite Triage and Nursing Note
Description: IHE PCC - Emergency Department Composite Triage and Nursing Note -- 2009

ID: c78
Name: HITSP/C78
Description: HITSP/C78 Immunization Document Component

ID: c48ref
Name: HITSP/C48 Referral
Description: HITSP/C48 Encounter Document Using IHE Medical Summary (XDS-MS) Component -- Referral

ID: c48dis
Name: HITSP/C48 Discharge
Description: HITSP/C48 Encounter Document Using IHE Medical Summary (XDS-MS) Component -- Discharge

ID: iheXdsMsReferral
Name: XDS-MS Referral Summary
Description: IHE PCC - XDS-MS Referral Summary -- 2009

ID: iheXdsMsDischarge
Name: XDS-MS Discharge Summary
Description: IHE PCC - XDS-MS Discharge Summary -- 2009

ID: iheEdReferral
Name: IHE ED Referral
Description: IHE PCC - Emergency Department Referral -- 2009

ID: ihePhrExtract
Name: IHE PHR Extract
Description: IHE PCC - PHR Extract (from XPHR Profile) -- 2009

ID: ihePhrUpdate
Name: IHE PHR Update
Description: IHE PCC - PHR Update (from XPHR Profile) -- 2009

ID: iheAps
Name: IHE APS
Description: IHE PCC - Antepartum Summary -- 2009

ID: iheAphp
Name: IHE APHP
Description: IHE PCC - Antepartum History and Physical -- 2009

ID: iheApe
Name: IHE APE
Description: IHE PCC - Antepartum Education -- 2009

ID: iheId
Name: IHE IC
Description: IHE PCC - Immunization Content -- 2009

ID: iheCrd
Name: IHE CRD
Description: IHE QRPH - Clinical Research Data Capture (CRD) -- CCD Option Only! -- 2009

ID: iheBppc
Name: IHE BPPC
Description: IHE Basic Patient Privacy Concern -- 2009

ID: iheMds
Name: IHE MDS
Description: IHE PCC - Labor and Delivery Record - Maternal Discharge Summary -- 2009

ID: iheLds
Name: IHE LDS
Description: IHE PCC - Labor and Delivery Record - Labor and Delivery Summary -- 2009

ID: iheLdhp
Name: IHE LDHP
Description: IHE PCC - Labor and Delivery Record - Labor and Delivery Admission History and Physical -- 2009


	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 2) {
			System.out
					.println("Missing required arguments - CDA Directory and CDA Document Count");
			System.exit(-1);
		}
		
		HITSPPackage.eINSTANCE.eClass();

		
		CDADocumentEventRegistry.registerCDADocumentEventProcessor(
				CDAPackage.eINSTANCE.getClinicalDocument(),new NISTDocumentEventProcessor("ccd"));

		Timer timer = new Timer();
		timer.schedule(new CDADirectoryPollingTask(args[0], Integer
				.valueOf(args[1])), 0, 2 * 1000);
	}
	
	
	
	
	
	
	public static class NISTDocumentEventProcessor extends CDADocumentEventProcessor<ClinicalDocument> {

		EndpointReference wsTarget = null;
		org.apache.axis2.client.Options options = null;
		ServiceClient serviceClient = null;
		OMFactory factory = null;
		OMNamespace namespace = null;
		String specification;
		
		
		

		public NISTDocumentEventProcessor(String specification) {
			super();
			this.specification = specification;
		}

		public void init(String target) throws AxisFault {
			if (target != null)
				wsTarget = new EndpointReference(target);
			else
				wsTarget = new EndpointReference(
						"http://xreg2.nist.gov:8080/ws/services/ValidationWebService");

			options = new org.apache.axis2.client.Options();
			options.setTo(wsTarget);
			options
					.setTransportInProtocol(Constants.TRANSPORT_HTTP);
			// options.setTransportInProtocol(Constants.TRANSPORT_JMS);
			serviceClient = new ServiceClient();
			serviceClient.setOptions(options);
			factory = OMAbstractFactory.getOMFactory();
			namespace = factory.createOMNamespace(
					"http://validation.hitsp.nist.gov", "nns");
		}

		public void validate(String cdadocument,
				String specificationId)
				throws ParserConfigurationException, IOException,
				SAXException {
			OMElement method = factory.createOMElement(
					"validateDocument", namespace);
			OMElement specification = factory.createOMElement(
					"specificationId", namespace);
			OMElement document = factory.createOMElement(
					"document", namespace);

			specification.addChild(factory.createOMText(
					specification, specificationId));
			String xml = cdadocument;
			document.addChild(factory.createOMText(document, xml));
			method.addChild(specification);
			method.addChild(document);
			OMElement result = serviceClient.sendReceive(method);
			WSValidationResults resultsProcessed = new WSValidationResults(
					result.getFirstElement());

			OMElement a = result.getFirstElement();

			WSIndividualValidationResult[] validationResults = resultsProcessed
					.getIssue();

			for (WSIndividualValidationResult validationResult : validationResults) {

				pushNISTDiagnostic(validationResult);

			}

		}

		private void validate(ClinicalDocument clinicalDocument)
				throws Exception {


			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			CDAUtil.save(clinicalDocument, buffer);

			if (wsTarget == null) {
				init(null);
			}

			validate(buffer.toString(), specification);

			boolean valid = CDAUtil.validate(clinicalDocument,
					new BasicValidationHandler() {
						@Override
						public void handleError(
								Diagnostic diagnostic) {
							pushMDHTDiagnostic(diagnostic);
						}

						@Override
						public void handleWarning(
								Diagnostic diagnostic) {
							pushMDHTDiagnostic(diagnostic);
						}

						@Override
						public void handleInfo(Diagnostic diagnostic) {
							pushMDHTDiagnostic(diagnostic);

						}
					});

			System.out.println("");
			System.out.println("Mapping NIST Diagnostics to MDHT Diagnostics");
			FromToDiagnostic("NIST", "MDHT", nistdiagnostics,
					mdhtdiagnostics);
			System.out.println("Mapping MDHT Diagnostics to NIST Diagnostics");
			FromToDiagnostic("MDHT", "NIST", mdhtdiagnostics,
					nistdiagnostics);

		}

		@Override
		public ClinicalDocument ProcessCDADocumentEvent(
				ClinicalDocument cdaDocumentInstance) {
			try {
				validate(cdaDocumentInstance);

			} catch (Exception e) {							
				e.printStackTrace();
			}
			return null;
		}
	}

}
