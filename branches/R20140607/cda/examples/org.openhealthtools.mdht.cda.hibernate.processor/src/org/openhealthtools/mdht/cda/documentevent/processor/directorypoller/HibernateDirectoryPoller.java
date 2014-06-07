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
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Clob;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventProcessor;
import org.openhealthtools.mdht.cda.documentevent.processor.CDADocumentEventRegistry;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * HibernateDirectoryPoller is a CDA Document Processing example which persist
 * instances of CDA Documents as clobs and a configurable set of index values.
 * Using the hibernate.properties, you define the db connection and using the
 * cdaindex.properties you define the additional index columns for the store.
 * Current we have document id, patient id, and patient name
 * 
 */
public class HibernateDirectoryPoller {

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

		ClinicalDocument clinicalDocument = CDAUtil.load(in, null);

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

				/**
				 * CDADynamicIndex creates dynamic eclass based on the cdaindex.properties file.  Currently restricted to string types;
				 *
				 */
				class CDADynamicIndex {

					Properties properties = new Properties();

					final private static String CDAINDEX = "CDAIndex";

					final private static String CDAINDEXPROPERTIES = "cdaindex.properties";

					EcoreFactory ecoreFactory;

					EcorePackage ecorePackage;

					EPackage cdaIndexPackage;

					EClass cdaIndex;

					EAttribute cdaDocumentCLOB;

					/**
					 * Creates populated instance using ocl from properties
					 * @param clinicalDocument
					 * @return
					 */
					public EObject createCDAIndex(ClinicalDocument clinicalDocument) {

						// Create Instance of CDA Index Object
						EObject cdaIndexObjectInstance = cdaIndexPackage.getEFactoryInstance().create(cdaIndex);

						// Set column values using OCL
						Enumeration<Object> keys = properties.keys();
						while (keys.hasMoreElements()) {
							String columnName = (String) keys.nextElement();
							// Process OCL
							Object indexValue = null;
							try {

								indexValue = CDAUtil.query(clinicalDocument, properties.getProperty(columnName));

								if (indexValue instanceof ED) {
									cdaIndexObjectInstance.eSet(
										cdaIndex.getEStructuralFeature(columnName), ((ED) (indexValue)).getText());
								} else {
									cdaIndexObjectInstance.eSet(cdaIndex.getEStructuralFeature(columnName), indexValue);
								}

							} catch (Exception e) {

								System.out.println("Error processing OCL" + properties.getProperty(columnName));
								if (indexValue != null) {
									System.out.println("Can not process datatype " + indexValue.toString());
								} else {
									System.out.println("Can not process, result null");
								}

							}

						}

						// Stream CDA Document to clob
						Writer sw = new StringWriter();
						try {
							CDAUtil.save(clinicalDocument, sw);
							Clob clob = Hibernate.createClob(sw.toString());
							cdaIndexObjectInstance.eSet(cdaDocumentCLOB, clob);
						} catch (Exception e) {
							e.printStackTrace();
						}

						return cdaIndexObjectInstance;
					}

					/**
					 * Creates a dynamic ecore class to use in persistence
					 */
					private void createDyanicIndexClass() {

						ecoreFactory = EcoreFactory.eINSTANCE;

						ecorePackage = EcorePackage.eINSTANCE;

						cdaIndexPackage = ecoreFactory.createEPackage();

						cdaIndexPackage.setName("CDAIndexPackage");

						cdaIndexPackage.setNsPrefix("cda");

						cdaIndexPackage.setNsURI("http:///org.openhealthtools.mdht.com");

						cdaIndex = ecoreFactory.createEClass();

						cdaIndex.setName(CDAINDEX);

						EDataType blob = ecoreFactory.createEDataType();

						blob.setName("Blob");
						blob.setInstanceClassName("java.sql.Clob");

						try {
							properties.load(new FileInputStream(CDAINDEXPROPERTIES));

							Enumeration<Object> keys = properties.keys();

							while (keys.hasMoreElements()) {
								String columnName = (String) keys.nextElement();

								EAttribute indexAttribute = ecoreFactory.createEAttribute();
								indexAttribute.setName(columnName);

								indexAttribute.setEType(ecorePackage.getEString());

								cdaIndex.getEStructuralFeatures().add(indexAttribute);
							}

						} catch (IOException e) {
						}

						// Create CDA Document Clob
						cdaDocumentCLOB = ecoreFactory.createEAttribute();
						cdaDocumentCLOB.setName("document");
						cdaDocumentCLOB.setEType(blob);

						EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
						eAnnotation.setSource("teneo.jpa");
						cdaDocumentCLOB.getEAnnotations().add(eAnnotation);

						eAnnotation.getDetails().put("value", "@Lob @Column(length=1048576) @Type(type=\"clob\") ");

						cdaIndex.getEStructuralFeatures().add(cdaDocumentCLOB);

						cdaIndexPackage.getEClassifiers().add(cdaIndex);

					}

					public EPackage getCDAIndexPackage() {

						if (cdaIndexPackage == null) {
							createDyanicIndexClass();
						}

						return cdaIndexPackage;
					}

				}

				CDADynamicIndex cdaIndexModel = new CDADynamicIndex();

				HbDataStore hbds = null;

				SessionFactory sessionFactory = null;

				// Create a session and a transaction
				Session session = null;

				/**
				 * Creates Hibernate connections and registers cda index package
				 */
				public void intializeConnection() {

					// the name of the session factory
					String hbName = "CDA";

					// create the HbDataStore
					hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

					final Properties props = new Properties();

					try {
						props.load(new FileInputStream("hibernate.properties"));
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

					hbds.setProperties(props);

					// Allows for dymanic table creation based on cda index
					hbds.setEPackages(new EPackage[] { cdaIndexModel.getCDAIndexPackage() });

					// initialize, also creates the database tables
					hbds.initialize();

					sessionFactory = hbds.getSessionFactory();

					return;
				}

				@Override
				public ClinicalDocument ProcessCDADocumentEvent(ClinicalDocument cdaDocumentInstance) {
					try {

						if (hbds == null) {
							intializeConnection();
						}

						// Create a session and a transaction
						session = sessionFactory.openSession();

						Transaction tx = session.getTransaction();

						tx.begin();

						EObject index = cdaIndexModel.createCDAIndex(cdaDocumentInstance);

						session.save(index);

						tx.commit();

						session.close();

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}
			});

		Timer timer = new Timer();
		timer.schedule(new CDADirectoryPollingTask(args[0], Integer.valueOf(args[1])), 0, 2 * 1000);
	}

}
