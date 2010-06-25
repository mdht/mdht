/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;

public class InstanceGenerator {

	private Map<String,EPackage> packageQNameMap = new HashMap<String,EPackage>();
	private List<EPackage> ePackages = new ArrayList<EPackage>();
		
	public InstanceGenerator() {
//		getEPackage("org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage");
//		getEPackage("org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage");
//		getEPackage("org.openhealthtools.mdht.uml.cda.CDAPackage");
	}
	
	@SuppressWarnings("unchecked")
	public EPackage getEPackage(String ePackageClassQName) {
		EPackage ePackage = packageQNameMap.get(ePackageClassQName);
		if (! packageQNameMap.containsKey(ePackageClassQName)) {
			try {
				java.lang.Class ePackageClass = this.getClass().getClassLoader().loadClass(ePackageClassQName);
				if (EPackage.class.isAssignableFrom(ePackageClass)) {
					ePackage = getEPackage((java.lang.Class<EPackage>) ePackageClass);
					packageQNameMap.put(ePackageClassQName, ePackage);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				packageQNameMap.put(ePackageClassQName, null);
			}
		}
		
		return ePackage;
	}
	
    private EPackage getEPackage(java.lang.Class<EPackage> ePackageClass) {
    	EPackage modelPackage = null;
		try {
			modelPackage = (EPackage) ePackageClass.getField("eINSTANCE").get(null);
			if (modelPackage != null) {
				addEPackage(modelPackage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return modelPackage;
    }
	
	public void addEPackage(EPackage ePackage) {
		if (ePackage != null && !ePackages.contains(ePackage))
			ePackages.add(ePackage);
	}

	public EObject createInstance(Class umlClass, int levels) {
		EObject eObject = null;
		EClass eClass = getEClass(umlClass);
		
		if (eClass != null && !eClass.isAbstract()) {
			eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
			
			try {
				Method initMethod = eObject.getClass().getDeclaredMethod("init", new java.lang.Class[0]);
				if (initMethod != null) {
					initMethod.invoke(eObject, new Object[0]);
				}
			} catch (Exception e) {
				// ignore if no init() method
			}
			
			//TODO templateId.assigningAuthorityName = umlClass.getQualifiedName()

			//TODO if no 'title' and has 'code', set title to code.displayName
			
			List<Property> attributes = getAllConformanceRules(umlClass);
			for (Property property : attributes) {
				EClass typeEClass = getEClass(property.getType());
				if (typeEClass != null && typeEClass.getEPackage().getName().equals("datatypes")) {
					setDatatypeValue(property, eObject, typeEClass);
				}
			}
			if (levels > 0) {
				// for now, don't get inherited associations (too many redefined dups)
				List<Property> properties = umlClass.getAttributes();
				for (Property property : properties) {
					if (property.getAssociation() != null) {
						EObject type = createInstance((Class)property.getType(), --levels);
						addChild(eObject, type);
					}
				}
			}
		}
		
		return eObject;
	}
	
	public List<Property> getAllConformanceRules(Class umlClass) {
		List<Property> allProperties = new ArrayList<Property>();

		List<Classifier> classes = new ArrayList<Classifier>();
		classes.add(umlClass);
		classes.addAll(umlClass.allParents());
		for (Classifier parent : classes) {
			// exclude CDA model properties
			if (! CDAModelUtil.CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName())) {
				for (Property property : parent.getAttributes()) {
					allProperties.add(property);
				}
			}
		}
		
		return allProperties;
	}

	public EClass getEClass(Type umlType) {
		String ePackageClassQName = CDAModelUtil.getEcorePackageClassName(umlType);
		if (ePackageClassQName != null) {
			EPackage ePackage = getEPackage(ePackageClassQName);
			if (ePackage != null) {
				EClassifier eClassifier = ePackage.getEClassifier(umlType.getName());
				if (eClassifier instanceof EClass)
				return (EClass) eClassifier;
			}
		}
		
		return null;
	}
	
	public boolean addChild(EObject parent, EObject child) {
		//TODO change to ALL reflection using feature name
		EClass cdaSection = (EClass) CDAPackage.eINSTANCE.getEClassifier("Section");
		EClass cdaOrganizer = (EClass) CDAPackage.eINSTANCE.getEClassifier("Organizer");

		if (parent instanceof ClinicalDocument) {
			if (child instanceof Section) {
				((ClinicalDocument)parent).addSection((Section)child);
			}
			else {
				return false;
			}
		}
		else if (parent instanceof Section) {
			if (child instanceof Section) {
				((Section)parent).addSection((Section)child);
			}
			else if (child instanceof Organizer) {
//		if (cdaSection.isSuperTypeOf(parent.eClass())) {
//			if (cdaOrganizer.isSuperTypeOf(child.eClass())) {
				((Section)parent).addOrganizer((Organizer)child);
				
//				EClass entryClass = (EClass) cdaPackage.getEClassifier("Entry");
//				EObject entry = cdaPackage.getEFactoryInstance().create(entryClass);
//				EStructuralFeature entryFeature = parent.eClass().getEStructuralFeature("entry");
//				EList entries = (EList) parent.eGet(entryFeature);
//				entries.add(entry);
				
				
//				Entry entry = CDAFactory.eINSTANCE.createEntry();
//				EStructuralFeature organizerFeature = entry.eClass().getEStructuralFeature("organizer");
//				entry.eSet(organizerFeature, child);
//
//				section.getEntries().add(entry);
				
			}
			else if (child instanceof Act) {
				((Section)parent).addAct((Act)child);
			}
			else if (child instanceof Observation) {
				((Section)parent).addObservation((Observation)child);
			}
			else if (child instanceof Encounter) {
				((Section)parent).addEncounter((Encounter)child);
			}
			else if (child instanceof Procedure) {
				((Section)parent).addProcedure((Procedure)child);
			}
			else if (child instanceof SubstanceAdministration) {
				((Section)parent).addSubstanceAdministration((SubstanceAdministration)child);
			}
			else if (child instanceof Supply) {
				((Section)parent).addSupply((Supply)child);
			}
			else {
				return false;
			}
		}
		else if (parent instanceof Act) {
			if (child instanceof Act) {
				((Act)parent).addAct((Act)child);
			}
			else if (child instanceof Observation) {
				((Act)parent).addObservation((Observation)child);
			}
			else if (child instanceof ParticipantRole) {
				Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();
				((Act)parent).getParticipants().add(participant);
				participant.setParticipantRole((ParticipantRole)child);
			}
			else if (child instanceof AssignedEntity) {
				Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
				((Act)parent).getPerformers().add(performer);
				performer.setAssignedEntity((AssignedEntity)child);
			}
			else {
				return false;
			}
		}
		else if (parent instanceof Observation) {
			if (child instanceof Act) {
				((Observation)parent).addAct((Act)child);
			}
			else if (child instanceof Observation) {
				((Observation)parent).addObservation((Observation)child);
			}
			else {
				return false;
			}
		}
		else if (parent instanceof Organizer) {
			if (child instanceof Observation) {
				((Organizer)parent).addObservation((Observation)child);
			}
			else if (child instanceof Procedure) {
				((Organizer)parent).addProcedure((Procedure)child);
			}
			else {
				return false;
			}
		}
		else if (parent instanceof SubstanceAdministration) {
			if (child instanceof Observation) {
				((SubstanceAdministration)parent).addObservation((Observation)child);
			}
			else if (child instanceof Procedure) {
				((SubstanceAdministration)parent).addProcedure((Procedure)child);
			}
			else if (child instanceof Supply) {
				((SubstanceAdministration)parent).addSupply((Supply)child);
			}
			else if (child instanceof SubstanceAdministration) {
				((SubstanceAdministration)parent).addSubstanceAdministration((SubstanceAdministration)child);
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
		return true;
	}

	@SuppressWarnings("unchecked")
	public void setDatatypeValue(Property property, EObject owner, EClass typeClass) {
		Property cdaProperty = CDAModelUtil.getCDAProperty(property);
		if (cdaProperty == null) {
			return;
		}

		EClass ownerClass = owner.eClass();
		EStructuralFeature feature = ownerClass.getEStructuralFeature(cdaProperty.getName());

		Object currentValue = owner.eGet(feature);
		if (currentValue == null ||
				(currentValue instanceof EList && ((EList)currentValue).isEmpty())) {
			try {
				EObject value = typeClass.getEPackage().getEFactoryInstance().create(typeClass);

				setDefaultValues(value);
				
				if (currentValue instanceof EList) {
					owner.eSet(feature, Collections.singletonList(value));
				}
				else {
					try {
						owner.eSet(feature, value);
					}
					catch (ClassCastException e) {
						System.err.println("InstanceGenerator: " + 
								property.getQualifiedName() + ": " + e.getMessage());
					}
				}
			}
			catch (IllegalArgumentException e) {
				// occurs for invalid typeClass on factory
			}
		}
	}
	
	public void setDefaultValues(EObject dataValue) {
		if ("IVL_TS".equals(dataValue.eClass().getName())) {
			EStructuralFeature low = dataValue.eClass().getEStructuralFeature("low");
			EStructuralFeature high = dataValue.eClass().getEStructuralFeature("high");
			IVXB_TS lowValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			lowValue.setValue("1972");
			IVXB_TS highValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			highValue.setValue("2008");
			dataValue.eSet(low, lowValue);
			dataValue.eSet(high, highValue);
		}
		else if("II".equals(dataValue.eClass().getName())) {
			EStructuralFeature root = dataValue.eClass().getEStructuralFeature("root");
			dataValue.eSet(root, UUID.randomUUID().toString());
		}
	}
	
	public void save(EObject eObject, Writer writer) {
		boolean hasContent = false;
		ClinicalDocument doc = null;
		
		if (eObject instanceof ClinicalDocument) {
			doc = (ClinicalDocument) eObject;
			hasContent = true;
		}
		else {
			doc = CDAFactory.eINSTANCE.createClinicalDocument();
		
			if (eObject instanceof Section) {
				doc.addSection((Section)eObject);
				hasContent = true;
			}
			else {
				Section section = CDAFactory.eINSTANCE.createSection();
				doc.addSection(section);
				hasContent = addChild(section, eObject);
			}
		}
		
		if (hasContent) {
			try {
				CDAUtil.save(doc, writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
