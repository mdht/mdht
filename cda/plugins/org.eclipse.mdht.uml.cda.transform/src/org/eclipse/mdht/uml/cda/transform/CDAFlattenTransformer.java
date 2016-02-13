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
package org.eclipse.mdht.uml.cda.transform;

import org.eclipse.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.eclipse.mdht.uml.common.util.ModelConsolidator;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.transform.FlattenTransformer;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * @author dcarlson
 *
 */
public class CDAFlattenTransformer extends FlattenTransformer {

	public CDAFlattenTransformer() {
		this(new TransformerOptions());
	}

	public CDAFlattenTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	protected ModelConsolidator createModelConsolidator() {
		consolidator = new CDAModelConsolidator();
		return consolidator;
	}

	@Override
	public void initialize(Package sourcePackage) {
		super.initialize(sourcePackage);

		if (getFlattenedVocabPackage() != null) {
			Package vocabPkg = getFlattenedVocabPackage();
			Profile termProfile = TermProfileUtil.getTerminologyProfile(vocabPkg.eResource().getResourceSet());
			if (termProfile != null) {
				vocabPkg.applyProfile(termProfile);
			}
		}

		((CDAModelConsolidator) consolidator).initializeVocab(getFlattenedVocabPackage());
	}

}
