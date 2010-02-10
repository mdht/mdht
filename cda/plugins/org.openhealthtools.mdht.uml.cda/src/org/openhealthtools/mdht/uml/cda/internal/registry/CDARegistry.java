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

public class CDARegistry {
	public static final CDARegistry INSTANCE = new CDARegistry();
	private Map<String, EClass> classes = null;
	private static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	private static final String TEMPLATE_ID_ROOT = "templateId.root";
	
	private CDARegistry() {
		classes = new HashMap<String, EClass>();
		load();
	}
	
	private void load() {
		for (String key : EPackage.Registry.INSTANCE.keySet()) {
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(key);
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				String templateId = EcoreUtil.getAnnotation(eClassifier, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
				if (templateId != null) {
					classes.put(templateId, (EClass) eClassifier);
				}
			}
		}
	}
	
	public EClass getEClass(String id) {
		return classes.get(id);
	}
}
