/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AnnotationsUtil {

	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	private Class umlClass;
	private Map<String,List<String>> cdaAnnotations = null;
	
	public AnnotationsUtil(Class umlClass) {
		this.umlClass = umlClass;
	}

	/**
	 * Set an annotation value for the given key, or replace the value if this key
	 * already exists in annotations.
	 * 
	 * @param umlClass
	 * @param key
	 * @param value
	 */
	public void setAnnotation(Class umlClass, String key, String value) {
		getCDAAnnotations().put(key, Collections.singletonList(value));
	}

	/**
	 * Set an annotation values for the given key, or replace the values if this key
	 * already exists in annotations.
	 * 
	 * @param umlClass
	 * @param key
	 * @param values
	 */
	public void setAnnotation(Class umlClass, String key, List<String> values) {
		getCDAAnnotations().put(key, values);
	}

	/**
	 * Append to list of existing values for the given key.
	 * 
	 * @param umlClass
	 * @param key
	 * @param value
	 */
	public void addAnnotation(Class umlClass, String key, String value) {
		List<String> values = getCDAAnnotations().get(key);
		if (values == null) {
			values = new ArrayList<String>();
			getCDAAnnotations().put(key, values);
		}
		values.add(value);
	}

	/**
	 * Return a map of key/value pairs, where value is a list of 1..* strings.
	 * Aggregates all values from the same key in separate annotation entries.
	 */
	private Map<String,List<String>> getCDAAnnotations() {
		if (cdaAnnotations == null) {
			cdaAnnotations = new HashMap<String,List<String>>();

			Stereotype eClassStereotype = EcoreTransformUtil.getEcoreStereotype(umlClass, UMLUtil.STEREOTYPE__E_CLASS);
			if (umlClass.isStereotypeApplied(eClassStereotype)) {
				List<String> annotations = (List<String>) umlClass.getValue(eClassStereotype, "annotations");
				// find the CDA annotation source(s)
				for (String annotation : annotations) {
					if (annotation.startsWith(CDA_ANNOTATION_SOURCE)) {
						String valueString = annotation.substring(CDA_ANNOTATION_SOURCE.length());
						
						//TODO this will not handle spaces between = and '
						// must be: key='value'
						StringTokenizer tokenizer = new StringTokenizer(valueString, "='");
						while (tokenizer.hasMoreTokens()) {
							String key = tokenizer.nextToken().trim();
							List<String> valueList = cdaAnnotations.get(key);
							if (valueList == null) {
								valueList = new ArrayList<String>();
								cdaAnnotations.put(key, valueList);
							}
							
							String values = (tokenizer.hasMoreTokens()) ? tokenizer.nextToken().trim() : "";

							StringTokenizer valueTokens = new StringTokenizer(values, ";");
							while (valueTokens.hasMoreTokens()) {
								String value = valueTokens.nextToken().trim();
								if (value.length() == 0) {
									continue;
								}
								valueList.add(value);
							}
						}
					}
				}
			}
		}
		
		return cdaAnnotations;
	}
	
	public void saveAnnotations() {
		StringBuffer annotations = new StringBuffer();
		annotations.append(CDA_ANNOTATION_SOURCE);
		
		for (String key : cdaAnnotations.keySet()) {
			StringBuffer values = new StringBuffer();
			for (String value : cdaAnnotations.get(key)) {
				if (values.length() > 0) {
					values.append("; ");
				}
				values.append(value);
			}
			String annotation = " " + key + "='" + values.toString() + "'";
			annotations.append(annotation);
		}

		// assure that the EClass stereotype is applied
		Stereotype eClassStereotype = EcoreTransformUtil.getEcoreStereotype(umlClass, UMLUtil.STEREOTYPE__E_CLASS);
		UMLUtil.safeApplyStereotype(umlClass, eClassStereotype);
		
		//TODO this will not retain non-CDA annotations
		umlClass.setValue(eClassStereotype, "annotations", 
				Collections.singletonList(annotations.toString()));
	}
	
}
