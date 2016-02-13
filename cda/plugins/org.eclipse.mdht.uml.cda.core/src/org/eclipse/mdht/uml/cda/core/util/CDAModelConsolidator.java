/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.common.util.ModelConsolidator;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

public class CDAModelConsolidator extends ModelConsolidator {

	private Package vocabPackage;

	private Map<String, Enumeration> vocabMapping;

	public CDAModelConsolidator() {
		super();

		this.vocabMapping = new HashMap<String, Enumeration>();
	}

	public CDAModelConsolidator(Package sourcePackage, Package consolPackage, Package vocabPackage) {
		super();
		initialize(sourcePackage, consolPackage);
		initializeVocab(vocabPackage);
	}

	public CDAModelConsolidator(Package sourcePackage, Package consolPackage) {
		super();
		initialize(sourcePackage, consolPackage);
		this.vocabMapping = new HashMap<String, Enumeration>();
	}

	public void initializeVocab(Package vocabPackage) {
		this.vocabPackage = vocabPackage;
		this.vocabMapping = new HashMap<String, Enumeration>();

		// assure that all proxies are resolved.
		if (vocabPackage != null) {
			EcoreUtil.resolveAll(vocabPackage.eResource());
		}
	}

	@Override
	public boolean isBaseModel(Element element) {
		return CDAModelUtil.isCDAModel(element);
	}

	@Override
	protected boolean isReferenceModel(Element element) {
		return RIMModelUtil.isRIMModel(element);
	}

	@Override
	protected Class getBaseModelClass(Classifier subClass) {
		return CDAModelUtil.getCDAClass(subClass);
	}

	@Override
	protected Property getBaseModelProperty(Property property) {
		return CDAModelUtil.getCDAProperty(property);
	}

	@Override
	public Class consolidateClass(Class sourceClass) {
		Class consolidatedClass = super.consolidateClass(sourceClass);

		if (consolidatedClass != null) {
			// if no templateId, copy from nearest parent
			String templateId = null;
			Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
				sourceClass, ICDAProfileConstants.CDA_TEMPLATE);
			if (hl7Template != null) {
				templateId = (String) sourceClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
			}
			if (templateId == null) {
				// this method gets inherited templateId, if missing
				templateId = CDAModelUtil.getTemplateId(sourceClass);
				if (templateId != null) {
					hl7Template = CDAProfileUtil.applyCDAStereotype(
						consolidatedClass, ICDAProfileConstants.CDA_TEMPLATE);
					consolidatedClass.setValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, templateId);
				}
			}
		}

		return consolidatedClass;
	}

	@Override
	protected void mergeInheritedProperties(Class sourceClass, Class umlClass) {
		super.mergeInheritedProperties(sourceClass, umlClass);

		// copy terminology and re-assign constraints to copied terms
		for (Property mergedProperty : umlClass.getOwnedAttributes()) {
			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(mergedProperty);
			if (valueSetConstraint != null) {
				ValueSetVersion valueSetVersion = valueSetConstraint.getReference();
				if (valueSetVersion != null) {
					Enumeration mappedValueSet = copyToConsolVocab(valueSetVersion.getBase_Enumeration());

					if (mappedValueSet != null) {
						ValueSetVersion mappedValueSetVersion = TermProfileUtil.getValueSetVersion(mappedValueSet);
						valueSetConstraint.setReference(mappedValueSetVersion);
					}
				}
			}
		}
	}

	@Override
	protected void mapExistingConsolidation() {
		super.mapExistingConsolidation();

		if (vocabPackage != null) {
			for (Type consolType : vocabPackage.getOwnedTypes()) {
				if (consolType instanceof Enumeration) {
					EAnnotation annotation = consolType.getEAnnotation("sourceClass");
					if (annotation != null && !annotation.getReferences().isEmpty()) {
						for (EObject reference : annotation.getReferences()) {
							if (reference instanceof Enumeration) {
								vocabMapping.put(EcoreUtil.getURI(reference).toString(), (Enumeration) consolType);
							}
						}
					}
				}
			}
		}
	}

	private Enumeration copyToConsolVocab(Enumeration vocabEnum) {
		if (vocabPackage != null) {
			Enumeration mappedEnum = vocabMapping.get(EcoreUtil.getURI(vocabEnum).toString());
			if (mappedEnum == null) {
				mappedEnum = EcoreUtil.copy(vocabEnum);

				vocabPackage.getOwnedTypes().add(mappedEnum);
				UMLUtil.cloneStereotypes(vocabEnum, mappedEnum);
				vocabMapping.put(EcoreUtil.getURI(vocabEnum).toString(), mappedEnum);
				// System.out.println("Consolidate Vocab: " + vocabEnum.getQualifiedName());

				// add Ecore annotation with source UML classifier reference
				EAnnotation sourceAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				sourceAnnotation.setSource("sourceClass");
				sourceAnnotation.getReferences().add(vocabEnum);
				mappedEnum.getEAnnotations().add(sourceAnnotation);
			}
			return mappedEnum;
		}

		return null;
	}

}
