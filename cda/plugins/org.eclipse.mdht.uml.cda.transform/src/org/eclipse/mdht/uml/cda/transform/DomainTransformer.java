/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.eclipse.mdht.uml.cda.transform.internal.Logger;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * @author dcarlson
 *
 */
public class DomainTransformer extends CDAAbstractTransformer {

	private CDAModelConsolidator consolidator = null;

	UMLSwitch<Object> genDomainInterface;

	public DomainTransformer() {
		this(new TransformerOptions());
	}

	public DomainTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public void transformModelElement(Element element) {
		if (genDomainInterface == null) {
			initialize(element.getNearestPackage());
		}

		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();
				Class consolidatedClass = null;

				if (child instanceof Class) {
					if (consolidator != null) {
						consolidatedClass = consolidator.consolidateClass((Class) child);
					} else {
						consolidatedClass = (Class) child;
					}

					if (transformerOptions.isGenerateDomainInterface() ||
							transformerOptions.isGenerateDomainClasses()) {
						genDomainInterface.doSwitch(consolidatedClass);
					}
					if (transformerOptions.isGenerateBuilderClasses()) {
						// TODO
					}

				}

			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	public void initialize(Package sourcePackage) {
		genDomainInterface = new GenDomainInterface(transformerOptions, null, getBaseModelReflection());

	}

	@Override
	public void saveResources() {
		// generate all imported classes
		if (consolidator != null) {
			while (!consolidator.getImportedClassifiers().isEmpty()) {
				Classifier classifier = consolidator.getImportedClassifiers().remove(0);
				genDomainInterface.doSwitch(classifier);
			}
		}

	}
}
