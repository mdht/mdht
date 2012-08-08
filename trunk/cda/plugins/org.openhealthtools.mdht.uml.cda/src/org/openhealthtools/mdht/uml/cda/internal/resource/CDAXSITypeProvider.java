/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Sean Muir (JKM Software) - updated registry to support threading
 *     Dave Carlson (XMLmodeling.com) - added document class registry
 *     Christian W. Damus - refactored CDAResource, CDAUtil, CDARegistry on the new flexible XML resource (artf3367)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.resource;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.openhealthtools.mdht.emf.runtime.resource.XSITypeProvider;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * The pluggable <tt>xsi:type</tt> provider for CDA, which finds the appropriate <tt>xsi:type</tt> {@link EClass}es by CDA Template ID.
 * The CDA document {@code EClass} may optionally be specified in cases where look-up of the document type by template ID is to be averted.
 */
public class CDAXSITypeProvider implements XSITypeProvider {

	private static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	private static final String TEMPLATE_ID_ROOT = "templateId.root";

	private static final String CONTEXT_DEPENDENT = "contextDependent";

	private static final String REGISTRY_DELEGATE = "registryDelegate";

	/** key=qualified name, value=EClass */
	private final Map<String, EClass> allDocumentClasses = new java.util.HashMap<String, EClass>();

	/** key=templateId, value=EClass */
	private final Map<String, EClass> classes = new java.util.HashMap<String, EClass>();

	private final Map<EClass, RegistryDelegate> delegates = new java.util.HashMap<EClass, RegistryDelegate>();

	private final EClass documentClass;

	/**
	 * Initializes me without a document {@link EClass}, so that I will discover it by template ID.
	 */
	public CDAXSITypeProvider() {
		this((EClass) null);
	}

	/**
	 * Initializes me with the {@link EClass} that I should use to instantiate the CDA document, instead of discovering it based on the template ID.
	 * 
	 * @param documentClass my forced document class, or {@code null} to discover the document class by template ID
	 */
	public CDAXSITypeProvider(EClass documentClass) {
		super();

		load();

		this.documentClass = documentClass;
	}

	/**
	 * Initializes me with the qualified name (e.g. <tt>ccd::ContinuityOfCareDocument</tt>) of the {@link EClass} to use 
	 * as the document root.
	 * 
	 * @param documentClassQName my forced document class's qualified name, or {@code null} to discover the document class by template ID
	 */
	public CDAXSITypeProvider(String documentClassQName) {
		super();

		load();

		this.documentClass = (documentClassQName == null)
				? null
				: allDocumentClasses.get(documentClassQName);
	}

	public EClass getXSIType(Element element) {
		EClass result = null;
		int last = 0;
		NodeList nodeList = element.getChildNodes();

		EClass type = getType(element);

		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element e = (Element) nodeList.item(i);
				if ("templateId".equals(e.getLocalName())) {
					EClass eClass = getEClass(e.getAttributeNS(null, "root"), element);
					if ((eClass != null) && !eClass.isAbstract() && conformsTo(eClass, type) &&
							(eClass.getEAllSuperTypes().size() > last)) {
						result = eClass;
						last = eClass.getEAllSuperTypes().size();
					}
				}
			}
		}

		return result;
	}

	private List<String> getPath(Element element) {
		LinkedList<String> result = new LinkedList<String>();
		result.addFirst(element.getLocalName());
		Node parent = element.getParentNode();
		while (parent instanceof Element) {
			Element e = (Element) parent;
			result.addFirst(e.getLocalName());
			parent = e.getParentNode();
		}
		return result;
	}

	private EClass getType(Element element) {
		EClass eClass = CDAPackage.Literals.DOCUMENT_ROOT;
		List<String> path = getPath(element);
		for (String component : path) {
			EStructuralFeature feature = getEStructuralFeature(eClass, component);
			if (feature instanceof EReference) {
				eClass = (EClass) feature.getEType();
			} else {
				return null;
			}
		}
		return eClass;
	}

	private EStructuralFeature getEStructuralFeature(EClass eClass, String name) {
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (name.equals(getName(feature))) {
				return feature;
			}
		}
		return null;
	}

	private boolean conformsTo(EClass eClass, EClass type) {
		if (eClass == null || type == null) {
			return false;
		}
		return type.isSuperTypeOf(eClass);
	}

	private String getName(ENamedElement eNamedElement) {
		String result = EcoreUtil.getAnnotation(eNamedElement, ExtendedMetaData.ANNOTATION_URI, "name");
		if (result != null) {
			return result;
		}
		return eNamedElement.getName();
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
