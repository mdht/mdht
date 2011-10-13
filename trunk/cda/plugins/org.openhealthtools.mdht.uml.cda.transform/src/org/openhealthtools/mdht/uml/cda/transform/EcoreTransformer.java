/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added support for TransformAssociation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class EcoreTransformer {

	private EcoreTransformerOptions transformerOptions;

	private CDAModelConsolidator consolidator = null;

	private boolean useConsolidator = false;

	public EcoreTransformer() {
		this(new EcoreTransformerOptions());
	}

	public EcoreTransformer(EcoreTransformerOptions options) {
		transformerOptions = options;
		useConsolidator = transformerOptions.isGenerateConsolidatedModel() ||
				transformerOptions.isGenerateDomainClasses() || transformerOptions.isGenerateDomainInterface();
	}

	public void transformElement(Element element) {
		PluginPropertiesUtil propertiesUtil = new PluginPropertiesUtil(element.eResource());
		transformerOptions.setPluginPropertiesUtil(propertiesUtil);

		Package consolidatedPackage = null;
		Package consolidatedVocabPackage = null;
		Package flattenedPackage = null;
		if (useConsolidator && consolidator == null) {
			consolidatedPackage = initializeConsolidationPackageFrom(element);
			consolidatedVocabPackage = initializeVocabPackageFrom(element);
			flattenedPackage = initializeFlattenedPackageFrom(element);

			consolidator = new CDAModelConsolidator(
				element.getNearestPackage(), consolidatedPackage, consolidatedVocabPackage);
		}

		UMLSwitch<Object> genDomainInterface = new GenDomainInterface(transformerOptions, consolidator);

		UMLSwitch<Object> transformPackage = new TransformPackage(transformerOptions);
		UMLSwitch<Object> transformClass = new TransformClass(transformerOptions);
		UMLSwitch<Object> transformConstraint = new TransformConstraint(transformerOptions);
		UMLSwitch<Object> transformClinicalDocument = new TransformClinicalDocument(transformerOptions);
		UMLSwitch<Object> transformTemplateIdentifier = new TransformTemplateIdentifier(transformerOptions);
		UMLSwitch<Object> transformVocabConstraint = new TransformVocabConstraint(transformerOptions);
		UMLSwitch<Object> transformPropertyConstraint = new TransformPropertyConstraint(transformerOptions);
		UMLSwitch<Object> transformAssociation = new TransformAssociation(transformerOptions);

		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				if (consolidator != null && child instanceof Class) {
					consolidator.consolidateClass((Class) child);
				}

				if (transformerOptions.isGenerateDomainInterface() || transformerOptions.isGenerateDomainClasses()) {
					genDomainInterface.doSwitch(child);
				}
				if (transformerOptions.isGenerateBuilderClasses()) {
					// TODO
				}

				transformPackage.doSwitch(child);
				transformConstraint.doSwitch(child);
				transformClinicalDocument.doSwitch(child);
				transformTemplateIdentifier.doSwitch(child);
				transformVocabConstraint.doSwitch(child);
				transformPropertyConstraint.doSwitch(child);
				transformAssociation.doSwitch(child);
				transformClass.doSwitch(child);
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}

		if (useConsolidator) {
			// generate all imported classes
			while (!consolidator.getImportedClassifiers().isEmpty()) {
				Classifier classifier = consolidator.getImportedClassifiers().remove(0);
				genDomainInterface.doSwitch(classifier);
			}
		}

		if (consolidatedPackage != null) {
			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				consolidatedPackage.eResource().save(saveOptions);
			} catch (IOException e) {
				Logger.logException(e);
			}
		}

		if (consolidatedVocabPackage != null) {
			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				consolidatedVocabPackage.eResource().save(saveOptions);
			} catch (IOException e) {
				Logger.logException(e);
			}
		}

		if (flattenedPackage != null) {
			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				flattenedPackage.eResource().save(saveOptions);
			} catch (IOException e) {
				Logger.logException(e);
			}
		}

		if (transformerOptions.isGenerateDomainInterface() || transformerOptions.isGenerateDomainClasses()) {
			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformerOptions.getDomainInterfacePackage().eResource().save(saveOptions);
			} catch (IOException e) {
				Logger.logException(e);
			}
		}

		// save the updated plugin.properties file
		propertiesUtil.save();

		for (Element deleted : transformerOptions.getDeletedElementList()) {
			deleted.destroy();
		}

	}

	private Package initializeConsolidationPackageFrom(Element element) {
		return initializeModelPackageFrom(
			element, transformerOptions.getConsolidatedModelPath(), "consolidated", "consol", "Consol");
	}

	private Package initializeVocabPackageFrom(Element element) {
		Package vocabPkg = initializeModelPackageFrom(element, null, "consolidated_vocab", "vocab", "Vocab");
		Profile termProfile = TermProfileUtil.getTerminologyProfile(vocabPkg.eResource().getResourceSet());
		if (termProfile != null) {
			vocabPkg.applyProfile(termProfile);
		}

		return vocabPkg;
	}

	private Package initializeFlattenedPackageFrom(Element element) {
		return initializeModelPackageFrom(element, null, "flattened", "flat", "Flat");
	}

	private Package initializeModelPackageFrom(Element element, String newModelPath, String suffix, String nsPrefix,
			String prefix) {
		Package sourcePkg = element.getNearestPackage();
		Package newModelPkg = null;

		URI newModelURI = null;
		if (newModelPath != null) {
			newModelURI = URI.createFileURI(newModelPath);
		}
		if (newModelURI == null) {
			newModelURI = sourcePkg.eResource().getURI();
			newModelURI = newModelURI.trimFileExtension();
			// newModelURI = newModelURI.trimSegments(1).appendSegment(newModelURI.lastSegment() + "_" + suffix);
			newModelURI = newModelURI.trimSegments(1).appendSegment(sourcePkg.getName() + "_" + suffix);
			newModelURI = newModelURI.appendFileExtension(sourcePkg.eResource().getURI().fileExtension());
		}

		// create model if necessary, assign default EPackage stereotype values
		Resource newModelResource = element.eResource().getResourceSet().createResource(newModelURI);
		newModelPkg = UMLFactory.eINSTANCE.createPackage();
		newModelResource.getContents().add(newModelPkg);

		// assign Ecore EPackage stereotype
		Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(sourcePkg, UMLUtil.STEREOTYPE__E_PACKAGE);
		UMLUtil.safeApplyStereotype(newModelPkg, ePackage);

		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_PREFIX, nsPrefix);
		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX, prefix);

		String modelPackageName = null;
		String modelNsURI = null;
		String modelBasePackage = null;

		Stereotype modelCodeGen = CDAProfileUtil.getAppliedCDAStereotype(
			sourcePkg, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (modelCodeGen != null) {
			modelPackageName = (String) sourcePkg.getValue(
				modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);
			modelNsURI = (String) sourcePkg.getValue(modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
			modelBasePackage = (String) sourcePkg.getValue(
				modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
		}

		newModelPkg.setName(sourcePkg.getName());
		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME, sourcePkg.getName());

		if (modelBasePackage != null && modelPackageName != null) {
			newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE, modelBasePackage + "." +
					modelPackageName);
		}

		if (modelNsURI != null) {
			newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_URI, modelNsURI + "/" + nsPrefix);
		}

		return newModelPkg;
	}

}
