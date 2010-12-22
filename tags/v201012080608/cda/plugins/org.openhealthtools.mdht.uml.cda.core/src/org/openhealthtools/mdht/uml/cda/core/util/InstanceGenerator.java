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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

public class InstanceGenerator {

	private Map<String,EPackage> packageURIMap = new HashMap<String,EPackage>();
		
	private CDARegistry cdaRegistry = new CDARegistry();
	
	public InstanceGenerator() {
	}
	
	private EPackage getEPackageForURI(String ePackageURI) {
		EPackage ePackage = packageURIMap.get(ePackageURI);
		if (! packageURIMap.containsKey(ePackageURI)) {
			ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageURI);
			packageURIMap.put(ePackageURI, ePackage);
			
			if (ePackage == null) {
				System.err.println("Cannot load EPackage for: " + ePackageURI);
			}
		}
		
		return ePackage;
	}

	public EClass getEClass(Type umlType) {
		String ePackageURI = CDAModelUtil.getEcorePackageURI(umlType);
		if (ePackageURI != null) {
			EPackage ePackage = getEPackageForURI(ePackageURI);
			if (ePackage != null) {
				EClassifier eClassifier = ePackage.getEClassifier(umlType.getName());
				if (eClassifier instanceof EClass) {
					return (EClass) eClassifier;
				}
			}
		}
		
		return null;
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

			//add assigningAuthorityName to all templateId elements
			List<EObject> templateIds = getChildElements(eObject, "templateId");
			for (EObject templateId : templateIds) {
				if (templateId instanceof II) {
					EClass templateClass = cdaRegistry.getEClass(
							((II) templateId).getRoot(), eObject);
					if (templateClass != null) {
						StringBuffer className = new StringBuffer();
						className.append(templateClass.getEPackage().getName().toUpperCase());
						for (String token : UMLUtil.splitName(templateClass.getName())) {
							className.append(" ").append(token);
						}
						
						((II)templateId).setAssigningAuthorityName(className.toString());
					}
				}
			}
			
			// for draft IGs, template IDs may not be filled
			String thisTemplateId = CDAModelUtil.getTemplateId(umlClass);
			if (thisTemplateId == null) {
				// insert new element without root attribute
				II templateId = DatatypesFactory.eINSTANCE.createII();
				templateId.setAssigningAuthorityName(CDAModelUtil.getPrefixedSplitName(umlClass));

				EStructuralFeature feature = eClass.getEStructuralFeature("templateId");
				if (feature != null) {
//					EList<II> ids = new BasicEList<II>();
//					ids.add(templateId);
//					eObject.eSet(feature, ids);
					
					Object ids = eObject.eGet(feature);
					if (ids instanceof EList<?>) {
						((EList)ids).add(templateId);
					}
				}
			}

			//If section has no 'title' and does have 'code', set title to code.displayName
			if (eObject instanceof Section) {
				Section section = (Section)eObject;
				if (section.getTitle() == null && section.getCode() != null
						&& section.getCode().getDisplayName() != null) {
					section.setTitle(DatatypesFactory.eINSTANCE.createST(
							section.getCode().getDisplayName()));
				}
			}
			
			List<Property> conformanceRules = getAllConformanceRules(umlClass);
			for (Property property : conformanceRules) {
				if (property.getType() != null) {
					EClass typeEClass = getEClass(property.getType());
					if (typeEClass != null && typeEClass.getEPackage().getName().equals("datatypes")) {
						setDatatypeValue(property, eObject, typeEClass);
					}
				}
			}
			if (levels > 0) {
				// for now, only include inherited associations from same model, to exclude overridden
				for (Property property : conformanceRules) {
					if (property.getType() != null && property.getAssociation() != null
							&& UMLUtil.getTopPackage(property).equals(UMLUtil.getTopPackage(umlClass))) {
						EObject type = createInstance((Class)property.getType(), --levels);
						addChild(eObject, type);
					}
				}
			}

			// if not specified, set a reasonable default value for classCode and moodCode
			if (eObject instanceof Act) {
				Act act = (Act)eObject;
				if (!act.isSetClassCode()) {
					act.setClassCode(x_ActClassDocumentEntryAct.ACT);
				}
				if (!act.isSetMoodCode()) {
					act.setMoodCode(x_DocumentActMood.EVN);
				}
			}
			else if (eObject instanceof Observation) {
				Observation observation = (Observation)eObject;
				if (!observation.isSetClassCode()) {
					observation.setClassCode(ActClassObservation.OBS);
				}
				if (!observation.isSetMoodCode()) {
					observation.setMoodCode(x_ActMoodDocumentObservation.EVN);
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

				setDefaultValues(property, value);
				
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
	
	public void setDefaultValues(Property property, EObject dataValue) {
		if (dataValue instanceof IVL_TS) {
			IVXB_TS lowValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			lowValue.setValue("1972");
			IVXB_TS highValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			highValue.setValue("2008");
			
			((IVL_TS)dataValue).setLow(lowValue);
			((IVL_TS)dataValue).setHigh(highValue);
		}
		else if(dataValue instanceof II) {
			((II)dataValue).setRoot(UUID.randomUUID().toString());
		}

// This is already done by init() method.
//		else if(dataValue instanceof ED) {
//			TextValue textValue = CDAProfileUtil.getTextValue(property);
//			if (textValue != null && textValue.getValue() != null) {
//				((ED)dataValue).addText(textValue.getValue());
//			}
//		}
		
// This is already done by init() method.
//		else if(dataValue instanceof CD) {
//			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
//			CodeSystemVersion codeSystemVersion = codeSystemConstraint==null ? null : codeSystemConstraint.getReference();
//			
//			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
//			ValueSetVersion valueSetVersion = valueSetConstraint==null ? null : valueSetConstraint.getReference();
//
//			String codeSystemName = null;
//			String codeSystemId = null;
//			if (codeSystemConstraint != null) {
//				if (codeSystemConstraint.getCode() != null) {
//					((CD)dataValue).setCode(codeSystemConstraint.getCode());
//				}
//				codeSystemName = codeSystemVersion==null ? codeSystemConstraint.getName() : codeSystemVersion.getBase_Enumeration().getName();
//				codeSystemId = codeSystemVersion==null ? codeSystemConstraint.getIdentifier() : codeSystemVersion.getIdentifier();
//			}
//			else if (valueSetConstraint != null) {
//				if (valueSetVersion != null) {
//					codeSystemVersion = valueSetVersion.getCodeSystem();
//					
//					codeSystemName = codeSystemVersion==null ? null : codeSystemVersion.getBase_Enumeration().getName();
//					codeSystemId = codeSystemVersion==null ? null : codeSystemVersion.getIdentifier();
//				}
//			}
//
//			if (codeSystemName != null) {
//				((CD)dataValue).setCodeSystemName(codeSystemName);
//			}
//			if (codeSystemId != null) {
//				((CD)dataValue).setCodeSystem(codeSystemId);
//			}
//		}
	}

	@SuppressWarnings("unchecked")
	private List<EObject> getChildElements(EObject eObject, String name) {
		List<EObject> results = new ArrayList<EObject>();

		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(name);
		if (feature != null) {
			if (feature.isMany()) {
				for (Object object : (List<Object>)eObject.eGet(feature)) {
					if (object instanceof EObject)
						results.add((EObject)object);
				}
			} else {
				Object object = eObject.eGet(feature);
				if (object instanceof EObject)
					results.add((EObject)object);
			}
		}
		
		return results;
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
	
//	================================================
// copied from CDA model internal package, for use here
	protected class CDARegistry {
		private Map<String, EClass> classes = null;
		private Map<EClass, RegistryDelegate> delegates = null;
		private static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
		private static final String TEMPLATE_ID_ROOT = "templateId.root";
		private static final String CONTEXT_DEPENDENT = "contextDependent";
		private static final String REGISTRY_DELEGATE = "registryDelegate";

		private CDARegistry() {
			classes = new HashMap<String, EClass>();
			delegates = new HashMap<EClass, RegistryDelegate>();
			load();
		}

		private void load() {
			EPackage.Registry registry = EPackage.Registry.INSTANCE;
			for (String key : registry.keySet().toArray(new String[registry.size()])) {
				try {
					EPackage ePackage = registry.getEPackage(key);
					for (EClassifier eClassifier : ePackage.getEClassifiers()) {
						String templateId = EcoreUtil.getAnnotation(eClassifier, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
						if (templateId != null) {
							String contextDependent = EcoreUtil.getAnnotation(eClassifier, CDA_ANNOTATION_SOURCE, CONTEXT_DEPENDENT);
							if ("true".equals(contextDependent)) {
								String registryDelegate = EcoreUtil.getAnnotation(ePackage, CDA_ANNOTATION_SOURCE, REGISTRY_DELEGATE);
								EClass eClass = (EClass) ePackage.getEClassifier(registryDelegate);
								classes.put(templateId, eClass);
								if (!delegates.containsKey(eClass)) {
									delegates.put(eClass, (RegistryDelegate) EcoreUtil.create(eClass));
								}
							} else {
								classes.put(templateId, (EClass) eClassifier);
							}
						}
					}
				}
				catch (java.lang.NoClassDefFoundError e1) {}
				catch (Exception e2) {}
			}
		}

		public EClass getEClass(String templateId, Object context) {
			EClass eClass = classes.get(templateId);
			if (delegates.containsKey(eClass)) {
				RegistryDelegate delegate = delegates.get(eClass);
				eClass = delegate.getEClass(templateId, context);
			}
			return eClass;
		}
	}
}
