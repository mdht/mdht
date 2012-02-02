/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Sean Muir (JKM Software) - updated registry to support threading
 *     Dave Carlson (XMLmodeling.com) - added document class registry
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.registry;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.w3c.dom.Element;

public class CDARegistry {
	public static final CDARegistry INSTANCE = new CDARegistry();

	private EClass documentClass = null;

	/** key=qualified name, value=EClass */
	private Map<String, EClass> allDocumentClasses = null;

	/** key=templateId, value=EClass */
	private Map<String, EClass> classes = null;

	private Map<EClass, RegistryDelegate> delegates = null;

	private static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	private static final String TEMPLATE_ID_ROOT = "templateId.root";

	private static final String CONTEXT_DEPENDENT = "contextDependent";

	private static final String REGISTRY_DELEGATE = "registryDelegate";

	private CDARegistry() {
		classes = new HashMap<String, EClass>();
		delegates = new HashMap<EClass, RegistryDelegate>();
		allDocumentClasses = new HashMap<String, EClass>();
		load();
	}

	public EClass getEClass(String templateId, Object context) {
		if (documentClass != null && context instanceof Element &&
				((Element) context).getLocalName().equals("ClinicalDocument")) {
			return documentClass;
		}

		EClass eClass = classes.get(templateId);
		if (delegates.containsKey(eClass)) {
			RegistryDelegate delegate = delegates.get(eClass);
			eClass = delegate.getEClass(templateId, context);
		}
		return eClass;
	}

	public Map<String, EClass> getAllDocumentClasses() {
		return allDocumentClasses;
	}

	/**
	 * If not null, use this EClass as the document root.
	 */
	public EClass getDocumentClass() {
		return documentClass;
	}

	/**
	 * EClass to use as the document root, or set to null for default behavior of
	 * discovering EClass based on templateId.
	 */
	public void setDocumentClass(EClass documentClass) {
		this.documentClass = documentClass;
	}

	/**
	 * Model qualified name (e.g. ccd::ContinuityOfCareDocument) of the EClass to use 
	 * as the document root, or set to null for default behavior of
	 * discovering EClass based on templateId.
	 */
	public void setDocumentClassQName(String documentClassQName) {
		this.documentClass = allDocumentClasses.get(documentClassQName);
	}

	private void load() {
		EPackage.Registry registry = EPackage.Registry.INSTANCE;
		EClass clinicalDocumentClass = (EClass) CDAPackage.eINSTANCE.getEClassifier("ClinicalDocument");
		for (String key : registry.keySet().toArray(new String[registry.size()])) {
			try {
				EPackage ePackage = registry.getEPackage(key);
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					try {
						if (eClassifier instanceof EClass) {
							if (clinicalDocumentClass != null &&
									clinicalDocumentClass.isSuperTypeOf((EClass) eClassifier)) {
								String qname = eClassifier.getEPackage().getNsPrefix() + "::" + eClassifier.getName();
								allDocumentClasses.put(qname, (EClass) eClassifier);
							}
							String templateId = EcoreUtil.getAnnotation(
								eClassifier, CDA_ANNOTATION_SOURCE, TEMPLATE_ID_ROOT);
							if (templateId != null) {
								String contextDependent = EcoreUtil.getAnnotation(
									eClassifier, CDA_ANNOTATION_SOURCE, CONTEXT_DEPENDENT);
								if ("true".equals(contextDependent)) {
									String registryDelegate = EcoreUtil.getAnnotation(
										ePackage, CDA_ANNOTATION_SOURCE, REGISTRY_DELEGATE);
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
					} catch (Exception e) {
					}
				}
			} catch (Exception e) {
			}
		}
	}
}
