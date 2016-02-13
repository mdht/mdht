/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;
import org.eclipse.uml2.uml.Element;

/**
 * Create a filter that is used assist in input filtering for the
 * propertySection extension point.
 *
 */
public class ModelElementTypeMapper implements ITypeMapper {

	/**
	 * Constructor for ModelElementTypeMapper.
	 */
	public ModelElementTypeMapper() {
		super();
	}

	public Class mapType(Object input) {
		Object mapped = null;
		if (input instanceof IAdaptable) {
			mapped = ((IAdaptable) input).getAdapter(Element.class);
			if (mapped == null) {
				mapped = ((IAdaptable) input).getAdapter(EObject.class);
			}
		} else {
			// unwrap a wrapper item provider
			mapped = AdapterFactoryEditingDomain.unwrap(input);
		}

		if (mapped instanceof View) {
			mapped = ((View) mapped).getElement();
		}
		if (mapped == null) {
			mapped = input;
		}

		return mapped.getClass();
	}

}
