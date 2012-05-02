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
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.openhealthtools.mdht.uml.common.util.ModelConsolidator;
import org.openhealthtools.mdht.uml.transform.FlattenTransformer;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

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

		((CDAModelConsolidator) consolidator).initializeVocab(getFlattenedVocabPackage());
	}

}
