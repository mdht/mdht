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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;

/**
 * Custom {@link XMLHelper} for the {@link FleXMLResource} implementation.
 */
public class FleXMLHelperImpl extends XMLHelperImpl {

	private int nsPrefixIndex;

	public FleXMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	@Override
	public String getName(ENamedElement obj) {
		if (extendedMetaData != null) {
			return obj instanceof EStructuralFeature
					? extendedMetaData.getName((EStructuralFeature) obj)
					: extendedMetaData.getName((EClassifier) obj);
		}

		if (xmlMap != null) {
			XMLResource.XMLInfo info = xmlMap.getInfo(obj);
			if (info != null) {
				String result = info.getName();
				if (result != null) {
					return result;
				}
			}
		}

		String result = EcoreUtil.getAnnotation(obj, ExtendedMetaData.ANNOTATION_URI, "name");

		if (result == null) {
			result = obj.getName();
		}

		return result;
	}

	@Override
	public String getPrefix(String namespaceURI) {
		String result = super.getPrefix(namespaceURI);
		if (result == null) {
			result = "_ns" + nsPrefixIndex;
			nsPrefixIndex++;
			addPrefix(result, namespaceURI);
		}

		return result;
	}

}
