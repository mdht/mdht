/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - flexible XML resource implementation (artf3367)
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.w3c.dom.Element;

public class FleXMLSaveImpl extends XMLSaveImpl {
	public FleXMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		return o.eIsSet(f) || (keepDefaults && f.getDefaultValueLiteral() != null && f.getLowerBound() > 0);
	}

	@Override
	protected void saveTypeAttribute(EClass eClass) {
		declareXSI = true;
		if (!toDOM) {
			doc.addAttribute("xsi:type", eClass.getName());
		} else {
			((Element) currentNode).setAttributeNS(XMLResource.XSI_URI, "xsi:type", eClass.getName());
		}
	}
}
