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
package org.openhealthtools.mdht.uml.cda.internal.registry;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class CDARegistry {
	public static final CDARegistry INSTANCE = new CDARegistry();
	private Map<String, EClass> classes = null;
	
	private static final String CDA_EXTENSION = "org.openhealthtools.mdht.uml.cda.extension";
	private static final String ATT_NSURI = "nsURI";
	private static final String ATT_ECLASS = "eClass";
	private static final String ATT_ID = "id";
	
	private CDARegistry() {
		classes = new HashMap<String, EClass>();
	}
	
	private void load() {
		classes.clear();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry != null) {
			IExtensionPoint point = registry.getExtensionPoint(CDA_EXTENSION);
			if (point != null) {
				for (IExtension extension : point.getExtensions()) {
					for (IConfigurationElement element : extension.getConfigurationElements()) {
						if (validate(element)) {
							EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(element.getAttribute(ATT_NSURI));
							if (ePackage != null) {
								EClass eClass = (EClass) ePackage.getEClassifier(element.getAttribute(ATT_ECLASS));
								if (eClass != null) {
									classes.put(element.getAttribute(ATT_ID), eClass);
								}
							}
						}
					}
				}
			}
		}
	}
	
	private boolean validate(IConfigurationElement element) {
		return (element.getAttribute(ATT_NSURI) != null && element.getAttribute(ATT_ECLASS) != null && element.getAttribute(ATT_ID) != null);
	}
	
	public EClass getEClass(String id) {
		load();
		return classes.get(id);
	}
}
