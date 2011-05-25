/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.builder.hibernate;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionManager;
import org.eclipse.emf.teneo.hibernate.HbContext;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.mapping.property.SyntheticPropertyHandler;
import org.eclipse.emf.teneo.hibernate.tuplizer.EMFTuplizer;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.QualifyingEntityNameStrategy;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.tuple.entity.EntityMetamodel;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;

public class CDASessionFactory {

	/**
	 * Extends Naming Strategy - Issue with Teneo not recognizing Struct_Text
	 * TODO Create issue with Teneo project
	 *
	 */
	public static class CDAQualifyingEntityNameStrategy extends QualifyingEntityNameStrategy {

		EClass eClass = null;

		@Override
		public EClass toEClass(String eClassStr) {
			int index = eClassStr.lastIndexOf(".");

			if (index != -1) {
				eClass = super.toEClass(eClassStr);
			} else {
			}

			return eClass;
		}

	}

	public static class CDAHbContext extends HbContext {

		@Override
		public Class<?> getEMFTuplizerClass(Configuration hbConfiguration) {
			return CDAEMFTuplizer.class;
		}

	}

	/**
	 * Extends EMFTuplizer to support the dynamic PersistenceRootID added to CDA Model
	 *
	 */
	public static class CDAEMFTuplizer extends EMFTuplizer {

		public CDAEMFTuplizer(EntityMetamodel entityMetamodel, PersistentClass mappedEntity) {
			super(entityMetamodel, mappedEntity);
		}

		@Override
		protected PropertyAccessor getPropertyAccessor(Property mappedProperty, PersistentClass pc) {

			if ("PatientID".equals(mappedProperty.getName())) {
				return new SyntheticPropertyHandler(mappedProperty.getName());
			} else {
				return super.getPropertyAccessor(mappedProperty, pc);
			}

		}

	}

	private static HbDataStore hbds;

	private static Properties connectionProperties = new Properties();

	private static EPackage patientPackage;

	public static final SessionFactory getSessionFactory(String database, EPackage[] ePackages) {
		if (hbds == null) {
			initializeDataStore(database, ePackages);
		}
		return hbds.getSessionFactory();

	}

	private static void initializeDataStore(String database, EPackage[] ePackages) {

		initializeConnectionProperties();

		hbds = HbHelper.INSTANCE.createRegisterDataStore(database);

		hbds.setProperties(connectionProperties);

		final ExtensionManager extensionManager = hbds.getExtensionManager();

		extensionManager.registerExtension(
			EntityNameStrategy.class.getName(), CDAQualifyingEntityNameStrategy.class.getName());

		extensionManager.registerExtension(HbContext.class.getName(), CDAHbContext.class.getName());

		ArrayList<EPackage> cdaPackages = new ArrayList<EPackage>();

		EClass root = createRoot();

		RIMPackage.eINSTANCE.getInfrastructureRoot().getESuperTypes().add(root);

		DatatypesPackage.eINSTANCE.getANY().getESuperTypes().add(root);

		cdaPackages.add(patientPackage);

		cdaPackages.addAll(Arrays.asList(ePackages));

		hbds.setEPackages((EPackage[]) cdaPackages.toArray(new EPackage[cdaPackages.size()]));

		hbds.initialize();

		logMapping();

	}

	private static void initializeConnectionProperties() {
		try {
			connectionProperties.load(new FileInputStream("hibernate.properties"));
		} catch (FileNotFoundException e1) {
			System.err.println("Unable to open hibernate properties files");
		} catch (IOException e1) {
			System.err.println("Unable to open hibernate properties files");
		}

		connectionProperties.setProperty("hibernate.hbm2ddl.auto", "create");

		connectionProperties.setProperty("hibernate.show.sql", "true");

		connectionProperties.setProperty(PersistenceOptions.MAXIMUM_SQL_NAME_LENGTH, "64");

		connectionProperties.setProperty(PersistenceOptions.SET_FOREIGN_KEY_NAME, "false");

		connectionProperties.setProperty(PersistenceOptions.PERSISTENCE_XML, "annotations.xml");

		connectionProperties.setProperty(PersistenceOptions.ALWAYS_VERSION, "false");

	}

	/**
	 * Creates new root class for CDA Model to support teneo/hibernate integration
	 */
	private static EClass createRoot() {

		patientPackage = EcoreFactory.eINSTANCE.createEPackage();

		patientPackage.setName(RIMPackage.eINSTANCE.getName() + "Teneo");

		patientPackage.setNsPrefix(RIMPackage.eINSTANCE.getNsPrefix() + "Teneo");

		patientPackage.setNsURI(RIMPackage.eINSTANCE.getNsURI() + "/Teneo");

		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();

		eAnnotation.setSource("teneo.jpa");

		eAnnotation.getDetails().put(
			"value",
			"@GenericGenerator(name = customizedIdGenerator, strategy = org.openhealthtools.mdht.builder.hibernate.PatientIDGenerator  ) ");

		patientPackage.getEAnnotations().add(eAnnotation);

		EPackage.Registry.INSTANCE.put(patientPackage.getNsURI(), patientPackage);

		EClass patient = null;

		patient = EcoreFactory.eINSTANCE.createEClass();

		patient.setName("Patient");

		EAttribute id = EcoreFactory.eINSTANCE.createEAttribute();

		id.setName("PatientID");

		id.setEType(EcorePackage.eINSTANCE.getEString());

		id.setLowerBound(1);

		id.setUpperBound(1);

		eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();

		eAnnotation.setSource("teneo.jpa");

		id.getEAnnotations().add(eAnnotation);

		eAnnotation.getDetails().put("value", "@Id @GeneratedValue(generator = customizedIdGenerator) ");

		patient.getEStructuralFeatures().add(id);

		patientPackage.getEClassifiers().add(patient);

		return patient;

	}

	/**
	 *  Logs mapping file to xml for debug purposes
	 */
	private static void logMapping() {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("cdamapping.xml"));
			out.write(hbds.getMappingXML());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

}
