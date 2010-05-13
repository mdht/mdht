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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;

public class CDARegistry {
	public static final CDARegistry INSTANCE = new CDARegistry();
	private Map<String, EClass> classes = null;
	private Map<EClass, RegistryDelegate> delegates = null;
	private static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	private static final String TEMPLATE_ID_ROOT = "templateId.root";
	private static final String CONTEXT_DEPENDENT = "contextDependent";
	private static final String REGISTRY_DELEGATE = "registryDelegate";
	
	private CDARegistry() {
		classes = new HashMap<String, EClass>();
		delegates = new HashMap<EClass, RegistryDelegate>();
		load();
	}
	
	public synchronized void load() {
	

		classes.clear();
		delegates.clear();
		
		/*
		 * EPackage.Registry.INSTANCE.keySet() does not support multithreaded
		 * iterations in a for loop and causes an exception. We create a local
		 * copy of the key set to iterate over
		 */

		Object[] keys = EPackage.Registry.INSTANCE.keySet().toArray();

		for (Object key : keys) {
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage((String) key);
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				String templateId = EcoreUtil.getAnnotation(eClassifier, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
				if (templateId != null) {
					String contextDependent = EcoreUtil.getAnnotation(eClassifier, CDA_ANNOTATION_SOURCE, CONTEXT_DEPENDENT);
					if ("true".equals(contextDependent)) {
						String registryDelegate = EcoreUtil.getAnnotation(ePackage, CDA_ANNOTATION_SOURCE, REGISTRY_DELEGATE);
						EClass eClass = (EClass) ePackage.getEClassifier(registryDelegate);
						classes.put(templateId, eClass);
						if (!delegates.containsKey(eClass)) {
							delegates.put(eClass, (RegistryDelegate) EcoreUtil.create(eClass));
						}
					} else {
						classes.put(templateId, (EClass) eClassifier);
					}
				}
			}
		}
	
	}
	
	public synchronized EClass getEClass(String templateId, Object context) {
		EClass eClass = classes.get(templateId);
		if (delegates.containsKey(eClass)) {
			RegistryDelegate delegate = delegates.get(eClass);
			eClass = delegate.getEClass(templateId, context);
		}
		return eClass;
	}
}
