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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventProcessor;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventRegistry;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * CDADirectoryPoller Sample directory poller application using the processor to
 * poll a directory for cda documents.
 * 
 * The implementation takes a document count and caches processed documents - so
 * instead of deleting or moving them so you can rerun inplace with out moving
 * files around 
 * 
 * The document count allows provides a simple shutdown versus some signal logic
 * 
 */
public class CDADirectoryPoller {

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
				System.out.println("Specified directory does not exist or is not a directory.");
				System.exit(0);
			} else {

				for (int i = 0; i < cdaFiles.length; i++) {
					String cdaFileName = cdaDirectory.getAbsolutePath() + System.getProperty("file.separator") +
							cdaFiles[i];

					// Instead of deleting or moving the file -
					// create a cache of processed files so you do not have to
					// keep moving files around
					// This polling logic does not take into account changes to
					// existing files
					if (!processedFiles.containsKey(cdaFileName)) {
						try {

							System.out.println("Processing File : " + cdaFileName);
							loadAndProcess(new FileInputStream(cdaFileName));
							System.out.println("");

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

	public static ClinicalDocument loadAndProcess(InputStream in) throws Exception {

		ClinicalDocument clinicalDocument = CDAUtil.load(in);

		CDADocumentEventRegistry.processCDADocumentEvent(clinicalDocument);

		return clinicalDocument;

	}

	public static void main(String[] args) throws Exception {

		if (args.length != 2) {
			System.out.println("Missing required arguments - CDA Directory and CDA Document Count");
			System.exit(-1);
		}

		// Defining a CDA Document Event Handler
		CDADocumentEventRegistry.registerCDADocumentEventProcessor(
			CDAPackage.eINSTANCE.getClinicalDocument(), new CDADocumentEventProcessor<ClinicalDocument>() {

				private void validate(ClinicalDocument clinicalDocument) throws Exception {
					boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
						@Override
						public void handleError(Diagnostic diagnostic) {
							System.out.println("ERROR: " + diagnostic.getMessage());
						}

						@Override
						public void handleWarning(Diagnostic diagnostic) {
							System.out.println("WARNING: " + diagnostic.getMessage());
						}

						@Override
						public void handleInfo(Diagnostic diagnostic) {
							System.out.println("INFO: " + diagnostic.getMessage());
						}
					});

					if (valid) {
						System.out.println("CDA Document is valid");
					} else {
						System.out.println("CDA Document is invalid");
					}
				}

				@Override
				public void ProcessCDADocumentEvent(ClinicalDocument cdaDocumentInstance) {
					try {

						System.out.println("Validating all ClinicalDocument Recieved ");

						// validate(cdaDocumentInstance);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return;
				}
			});

		CDADocumentEventRegistry.registerCDADocumentEventProcessor(
			ConsolPackage.eINSTANCE.getGeneralHeaderConstraints(),
			new CDADocumentEventProcessor<GeneralHeaderConstraints>() {

				@Override
				public void ProcessCDADocumentEvent(GeneralHeaderConstraints cdaDocumentInstance) {
					// Have general GeneralHeaderConstraints type documens processing here
					System.out.println("Generic for documents conforming to the General Header " +
							cdaDocumentInstance.getClass().getSimpleName());

				}

			});

		CDADocumentEventRegistry.registerCDADocumentEventProcessor(
			ConsolPackage.eINSTANCE.getContinuityOfCareDocument(),
			new CDADocumentEventProcessor<ContinuityOfCareDocument>() {

				@Override
				public void ProcessCDADocumentEvent(ContinuityOfCareDocument cdaDocumentInstance) {
					// Have specific ContinuityOfCareDocument processing here
					System.out.println("Specific Processing for Consol ContinuityOfCareDocument Document");
				}

			});

		CDADocumentEventRegistry.registerCDADocumentEventProcessor(
			ConsolPackage.eINSTANCE.getDischargeSummary(), new CDADocumentEventProcessor<DischargeSummary>() {

				@Override
				public void ProcessCDADocumentEvent(DischargeSummary cdaDocumentInstance) {
					// Have specific ContinuityOfCareDocument processing here
					System.out.println("Specific Processing for Consol DischargeSummary Document");
				}

			});

		Timer timer = new Timer();
		timer.schedule(new CDADirectoryPollingTask(args[0], Integer.valueOf(args[1])), 0, 2 * 1000);
	}

}
