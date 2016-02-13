/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.cda.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

/**
 * Class to be used by CDA instance generators to use sample data annotated to the UML model
 */
public class CDASampler {

	Map<String, String> samples = new HashMap<String, String>();

	private List<Map<String, String>> samplesStack = new ArrayList<Map<String, String>>();

	private String umlContext = "";

	/**
	 * whether custom data is actually retrieved by a call to getSample() (and then normally built into a model)
	 */
	private boolean customDataUsed;

	/**
	 * Merges the sample CDA content annotations for the givem UML class
	 *
	 * @param umlClass
	 * @param context
	 *            optional instance of the UML class, not used currently
	 */
	public void mergeSampleXML(Class umlClass, EObject context) {
		EAnnotation anno = umlClass.getEAnnotation("UMLSAMPLE");
		if (anno != null) {
			for (String name : anno.getDetails().keySet()) {
				String value = anno.getDetails().get(name);
				if (!"".equals(value) && !samples.containsKey(name)) {
					samples.put(name, value);
					// System.out.println(name + "=>" + value);
				}
			}
		}
	}

	protected Map<String, String> extractSampleData(Property property) {
		return extractSampleData(property.getName());
	}

	protected Map<String, String> extractSampleData(EStructuralFeature feature) {
		return extractSampleData(feature.getName());
	}

	/**
	 * Extracts the sample data for the given property; if data exist for multiple instances of this property (e.g. /property(1)/.. and
	 * /property(2)/..), extracts only of of them (while the others would be picked up in future calls of this method)
	 *
	 * @param property
	 * @return
	 */
	protected Map<String, String> extractSampleData(String property) {
		Map<String, String> result = new HashMap<String, String>();
		if ("mixed".equals(property)) {
			property = "text";
		}
		for (String name : new ArrayList<String>(samples.keySet())) {
			int toffset = 0;
			if (name.startsWith("/", toffset)) {
				toffset++;
			}
			if (name.startsWith("@", toffset)) {
				toffset++;
			}
			if (name.startsWith(property, toffset) && (toffset + property.length() == name.length() ||
					name.charAt(toffset + property.length()) == '(' && result.isEmpty() ||
					name.charAt(toffset + property.length()) == '/')) {
				int nextSlash = (name + "/").indexOf('/', toffset);
				if (result.isEmpty()) {
					property = name.substring(toffset, nextSlash);
				}
				result.put(name.substring(nextSlash), samples.get(name));
				samples.remove(name);
			}
		}
		return result;
	}

	/**
	 * Focuses the given property; after the given property is processed, ascentProperty() has to be called
	 *
	 * @param property
	 */
	public void descentProperty(Property property) {
		umlContext += "/" + property.getName();
		samplesStack.add(samples);
		samples = extractSampleData(property);
		// if (samples.size() > 0)
		// System.out.println("Descending " + umlContext + ":" + samples.size());
	}

	/**
	 * Descent that property from umlClass that corresponds to eStructuralFeature
	 *
	 * @param eStructuralFeature
	 * @param umlClass
	 * @return the property, or <code>null</code> if that not exists
	 */
	public Property descentProperty(EStructuralFeature eStructuralFeature, final Class umlClass) {
		for (Property property : CDACommonUtils.allAttributes(umlClass)) {
			Property cdaProperty = property;
			if (!property.getRedefinedProperties().isEmpty()) {
				cdaProperty = property.getRedefinedProperties().get(0);
			}
			if (eStructuralFeature.getName().equals(cdaProperty.getName())) {
				descentProperty(property);
				for (String key : samples.keySet()) {
					System.out.println(key + "=" + samples.get(key));
				}
				return property;
			}
		}

		samplesStack.add(samples);
		umlContext += "/cda:" + eStructuralFeature.getName();
		samples = new HashMap<String, String>();
		System.out.println(
			"Failed descending " + umlContext + " in cda:" + eStructuralFeature.getEContainingClass().getName() + "(" +
					umlClass.getName() + ")");
		return null;
	}

	/**
	 * Returns true if for an instance of the given property or its contained contents sample data is available, i.e. whether the property should be
	 * instantiated so that the sample data can be assigned later on
	 *
	 * @return
	 */
	public boolean hasData() {
		return !samples.isEmpty();
	}

	/**
	 * If a primitive-typed property is focused, returns a sample string for it if available
	 *
	 * @return
	 */
	public String getSample() {
		String result = samples.get("");
		this.customDataUsed |= result != null;
		return result;
	}

	public String getSample(String def) {
		if (getSample() != null) {
			return getSample();
		}
		return def;
	}

	/**
	 * The counterpart to descentProperty()
	 */
	public void ascentProperty() {
		samples = samplesStack.remove(samplesStack.size() - 1);
		if (umlContext.lastIndexOf("/") != -1) {
			umlContext = umlContext.substring(0, umlContext.lastIndexOf("/"));
		}
	}

	/**
	 * Tries to assign sample data to the given object's feature
	 *
	 * @param eObject
	 * @param structuralFeature
	 */
	public void assignSample(EObject eObject, EStructuralFeature structuralFeature) {
		if (getSample() != null && structuralFeature.getEType() instanceof EDataType) {
			EDataType eDataType = (EDataType) structuralFeature.getEType();
			try {
				Object def = EcoreUtil.createFromString(eDataType, getSample());
				if (def != null) {
					eObject.eSet(structuralFeature, def);
				}
			} catch (Exception e) {
				e.printStackTrace();
				// nothing to do
			}
		}
	}

	public boolean isCustomDataUsed() {
		return customDataUsed;
	}

}
