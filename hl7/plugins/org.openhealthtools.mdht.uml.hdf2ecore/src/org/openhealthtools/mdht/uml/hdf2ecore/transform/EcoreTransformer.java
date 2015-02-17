/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf2ecore.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class EcoreTransformer {

	private EcoreTransformerOptions transformerOptions;

	public EcoreTransformer() {
		transformerOptions = new EcoreTransformerOptions();
	}

	public EcoreTransformer(EcoreTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformElement(Element element) {

		TransformSubsetsGeneralization transformSubsetsGeneralization = new TransformSubsetsGeneralization(
			transformerOptions);
		TransformChoiceGroups transformChoiceGroups = new TransformChoiceGroups(transformerOptions);
		UMLSwitch transformTemplateBinding = new TransformTemplateBinding(transformerOptions);

		/*
		 * Execute all structure transformations first (copy, delete, create)
		 */
		transformSubsetsGeneralization.transformAllContents(element);
		transformChoiceGroups.transformAllContents(element);

		try {
			TreeIterator iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				transformTemplateBinding.doSwitch(child);
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
