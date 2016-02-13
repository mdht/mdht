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
package org.eclipse.mdht.uml.cda.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAModelFilter;
import org.eclipse.mdht.uml.cda.transform.internal.Logger;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * @author dcarlson
 *
 */
public class FilterTransformer extends CDAAbstractTransformer {

	private CDAModelFilter modelFilter;

	private Package filteredPackage = null;

	public FilterTransformer() {
		this(new TransformerOptions());
	}

	public FilterTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	public Package getFilteredPackage() {
		return filteredPackage;
	}

	@Override
	public void transformModelElement(Element element) {
		if (modelFilter == null) {
			initialize(element.getNearestPackage());
		}

		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				if (child instanceof Class) {
					modelFilter.filterClass((Class) child);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	public void initialize(Package sourcePackage) {
		filteredPackage = initializeModelPackageFrom(
			sourcePackage, transformerOptions.getOutputModelPath(), "filtered", "flat", "Flat");
		modelFilter = new CDAModelFilter(sourcePackage, filteredPackage);
	}

	@Override
	public void saveResources() {

	}

}
