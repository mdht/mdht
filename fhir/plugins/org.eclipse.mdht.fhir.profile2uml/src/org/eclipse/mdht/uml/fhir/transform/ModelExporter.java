/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.transform;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.Uri;

public class ModelExporter implements ModelConstants {

	private ModelIndexer modelIndexer = new ModelIndexer();
	
	public void indexContents(Package umlPackage) {
		modelIndexer.indexMembers(umlPackage);
	}
	
	public StructureDefinition createStrucureDefinition(Class umlClass) {
		org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = 
				(org.eclipse.mdht.uml.fhir.StructureDefinition) EcoreUtil.getObjectByType(
						umlClass.getStereotypeApplications(), FHIRPackage.eINSTANCE.getStructureDefinition());
		
		StructureDefinition structureDef = FhirFactory.eINSTANCE.createStructureDefinition();

		if (structureDefStereotype != null) {
			structureDef.setId(createFhirId(structureDefStereotype.getId()));
			structureDef.setUrl(createFhirUri(structureDefStereotype.getUri()));
			structureDef.setName(createFhirString(structureDefStereotype.getName()));

			if (structureDefStereotype.getDisplay() != null) {
				structureDef.setDisplay(createFhirString(structureDefStereotype.getDisplay()));
			}
			
			for (Classifier parent : umlClass.getGenerals()) {
				Uri baseUri = getFhirUri(parent);
				if (baseUri != null) {
					structureDef.setBase(baseUri);
				}
			}
			
			StructureDefinitionDifferential differential = FhirFactory.eINSTANCE.createStructureDefinitionDifferential();
			structureDef.setDifferential(differential);
			for (Property property : umlClass.getOwnedAttributes()) {
				ElementDefinition elementDef = createElementDefinition(property);
				differential.getElement().add(elementDef);
			}
		}
		
		return structureDef;
	}

	private Uri getFhirUri(Classifier umlClass) {
		Uri uri = null;
		org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = 
				(org.eclipse.mdht.uml.fhir.StructureDefinition) EcoreUtil.getObjectByType(
						umlClass.getStereotypeApplications(), FHIRPackage.eINSTANCE.getStructureDefinition());
		if (structureDefStereotype != null && structureDefStereotype.getUri() != null) {
			uri = FhirFactory.eINSTANCE.createUri();
			uri.setValue(structureDefStereotype.getUri());
		}
		
		return uri;
	}
	
	private ElementDefinition createElementDefinition(Property property) {
		org.eclipse.mdht.uml.fhir.ElementDefinition elementDefStereotype = 
				(org.eclipse.mdht.uml.fhir.ElementDefinition) EcoreUtil.getObjectByType(
						property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getElementDefinition());
		ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();

		elementDef.setPath(createFhirString(property.getName()));
		elementDef.setMin(createFhirInteger(property.getLower()));
		elementDef.setMax(createFhirString(property.getUpper() == -1 ? "*" : Integer.toString(property.getUpper())));

		TypeChoice typeChoice = (TypeChoice) EcoreUtil.getObjectByType(
				property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null) {
			for (Classifier type : typeChoice.getTypes()) {
				ElementDefinitionType elementType = createType(type.getName());
				elementDef.getType().add(elementType);
			}
		}
		else if (property.getType() != null) {
			ElementDefinitionType elementType = createType(property.getType().getName());
			elementDef.getType().add(elementType);
		}
		
		if (elementDefStereotype != null) {
			if (elementDefStereotype.getId() != null) {
				elementDef.setId(elementDefStereotype.getId());
			}
			if (elementDefStereotype.getName() != null) {
				elementDef.setName(createFhirString(elementDefStereotype.getName()));
			}
			if (elementDefStereotype.getIsSummary() != null) {
				elementDef.setIsSummary(createFhirBoolean(elementDefStereotype.getIsSummary()));
			}
			if (elementDefStereotype.getIsModifier() != null) {
				elementDef.setIsModifier(createFhirBoolean(elementDefStereotype.getIsModifier()));
			}
			if (elementDefStereotype.getMustSupport() != null) {
				elementDef.setMustSupport(createFhirBoolean(elementDefStereotype.getMustSupport()));
			}
		}
		
		return elementDef;
	}
	
	private Id createFhirId(String value) {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(value);
		return id;
	}

	private Uri createFhirUri(String value) {
		Uri uri = FhirFactory.eINSTANCE.createUri();
		uri.setValue(value);
		return uri;
	}

	private org.hl7.fhir.String createFhirString(String value) {
		org.hl7.fhir.String fhirString = FhirFactory.eINSTANCE.createString();
		fhirString.setValue(value);
		return fhirString;
	}

	private org.hl7.fhir.Boolean createFhirBoolean(boolean value) {
		org.hl7.fhir.Boolean fhirBoolean = FhirFactory.eINSTANCE.createBoolean();
		fhirBoolean.setValue(value);
		return fhirBoolean;
	}

	private org.hl7.fhir.Integer createFhirInteger(int value) {
		org.hl7.fhir.Integer fhirInteger = FhirFactory.eINSTANCE.createInteger();
		fhirInteger.setValue(value);
		return fhirInteger;
	}

	private org.hl7.fhir.Code createFhirCode(String value) {
		org.hl7.fhir.Code fhirCode = FhirFactory.eINSTANCE.createCode();
		fhirCode.setValue(value);
		return fhirCode;
	}

	private ElementDefinitionType createType(String typeName) {
		ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
		elementDefType.setCode(createFhirCode(typeName));
		return elementDefType;
	}

	private ElementDefinitionType createType(String typeName, String profileUri) {
		ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
		elementDefType.setCode(createFhirCode(typeName));
		elementDefType.getProfile().add(createFhirUri(profileUri));
		return elementDefType;
	}

	private Classifier getConstrainedType(Classifier profileClass) {
		if (modelIndexer.isDefinedType(profileClass)) {
			return profileClass;
		}
		for (Classifier parent : profileClass.allParents()) {
			if (modelIndexer.isDefinedType(parent)) {
				return parent;
			}
		}
		
		return null;
	}
	
}
