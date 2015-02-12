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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;

public class TransformTemplateBinding extends UMLSwitch {

	private EcoreTransformerOptions transformerOptions;

	public TransformTemplateBinding(EcoreTransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public Object caseTemplateBinding(TemplateBinding binding) {
		TemplateableElement element = binding.getBoundElement();

		if (element instanceof Classifier) {
			Stereotype eGeneric = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_GENERIC_TYPE);
			if (eGeneric != null) {
				UMLUtil.safeApplyStereotype(element, eGeneric);
			}
		}

		return element;
	}

}
