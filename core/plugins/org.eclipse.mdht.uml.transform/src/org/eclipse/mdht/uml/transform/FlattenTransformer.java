/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.common.util.ModelConsolidator;
import org.eclipse.mdht.uml.transform.internal.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * @author dcarlson
 *
 */
public class FlattenTransformer extends AbstractTransformer {

	protected ModelConsolidator consolidator = null;

	private Package flattenedPackage = null;

	private Package flattenedVocabPackage = null;

	public FlattenTransformer() {
		this(new TransformerOptions());
	}

	public FlattenTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	protected ModelConsolidator createModelConsolidator() {
		consolidator = new ModelConsolidator();
		return consolidator;
	}

	public Package getFlattenedPackage() {
		return flattenedPackage;
	}

	public Package getFlattenedVocabPackage() {
		return flattenedVocabPackage;
	}

	@Override
	public void transformModelElement(Element element) {
		if (consolidator == null) {
			initialize(element.getNearestPackage());
		}

		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				if (child instanceof Class) {
					consolidator.consolidateClass((Class) child);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	public void initialize(Package sourcePackage) {
		flattenedPackage = initializeConsolidationPackageFrom(sourcePackage);
		if (transformerOptions.getVocabModelPath() != null) {
			flattenedVocabPackage = initializeVocabPackageFrom(flattenedPackage);
		}

		// consolidator = new ModelConsolidator(sourcePackage, flattenedPackage, flattenedVocabPackage);
		consolidator = createModelConsolidator();
		consolidator.initialize(sourcePackage, flattenedPackage);
		consolidator.setIncludeBaseModel(transformerOptions.isIncludeBaseModel());
	}

	@Override
	public void saveResources() {
		// remove EAnnotations used during consolidation
		consolidator.removeAllConsolidationAnnotations();

		// replace qualified class names in OCL expressions
		consolidator.renameReferencesInOCL();
	}

	private Package initializeConsolidationPackageFrom(Element element) {
		return initializeModelPackageFrom(
			element, transformerOptions.getOutputModelPath(), "flattened", "consol", "Consol");
	}

	private Package initializeVocabPackageFrom(Element element) {
		Package vocabPkg = initializeModelPackageFrom(
			element, transformerOptions.getVocabModelPath(), "flattened_vocab", "vocab", "Vocab");
		// Profile termProfile = TermProfileUtil.getTerminologyProfile(vocabPkg.eResource().getResourceSet());
		// if (termProfile != null) {
		// vocabPkg.applyProfile(termProfile);
		// }

		return vocabPkg;
	}

}
