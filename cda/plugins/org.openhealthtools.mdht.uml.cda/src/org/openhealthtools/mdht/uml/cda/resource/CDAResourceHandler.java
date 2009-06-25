/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.resource;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

public class CDAResourceHandler extends BasicResourceHandler {
	@Override
	public void preLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
		System.out.println("CDAResourceHandler.preLoad");
	}
	
	@Override
	public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
		System.out.println("CDAResourceHandler.postLoad");
		final Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
		for (EObject key : extMap.keySet()) {
			AnyType value = extMap.get(key);
			handleUnknownData(key, value);
		}
	}
	
	private void handleUnknownData(EObject eObj, AnyType unknownData) {
		handleUnknownFeatures(eObj, unknownData.getMixed());
		handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
	}

	private void handleUnknownFeatures(EObject owner, FeatureMap featureMap) {
		for (Iterator<FeatureMap.Entry> iter = featureMap.iterator(); iter.hasNext();) {
			FeatureMap.Entry entry = iter.next();
			EStructuralFeature feature = entry.getEStructuralFeature();
			System.out.println("Unknown Feature: feature=" + feature +", value=" + entry.getValue());
			if (handleUnknownFeature(owner, feature, entry.getValue())) {
//				iter.remove();
			}
		}
	}
	
	private boolean handleUnknownFeature(EObject owner, EStructuralFeature feature, Object value) {
		return true;
	}
}
