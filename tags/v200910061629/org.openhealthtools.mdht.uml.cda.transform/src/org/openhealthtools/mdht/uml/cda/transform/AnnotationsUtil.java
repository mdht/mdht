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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AnnotationsUtil {

	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	private static final Pattern ANNOTATION_PATTERN = Pattern.compile("\\G\\s*((?>\\\\.|\\S)+)((?:\\s+(?>\\\\.|\\S)+\\s*+=\\s*(['\"])((?>\\\\.|.)*?)\\3)*)");
	private static final Pattern ANNOTATION_DETAIL_PATTERN = Pattern.compile("\\s+((?>\\\\.|\\S)+)\\s*+=\\s*((['\"])((?>\\\\.|.)*?)\\3)");

	private Element element;
	private Map<String,String> cdaAnnotations = null;
	private Integer cdaAnnotationIndex = null;
	
	public AnnotationsUtil(Class umlClass) {
		this.element = umlClass;
	}

	public AnnotationsUtil(Property property) {
		this.element = property;
	}

	/**
	 * Get an annotation value for the given key.
	 * 
	 * @param key
	 */
	public String getAnnotation(String key) {
		return getCDAAnnotations().get(key);
	}

	/**
	 * Set an annotation value for the given key, or replace the value if this key
	 * already exists in annotations.
	 * 
	 * @param key
	 * @param value
	 */
	public void setAnnotation(String key, String value) {
		getCDAAnnotations().put(key, value);
	}

	/**
	 * Remove an annotation key.
	 * 
	 * @param key
	 */
	public void removeAnnotation(String key) {
		getCDAAnnotations().remove(key);
	}

	/**
	 * Append to list of existing values for the given key.
	 * Verify that given value is not already in list of values for this key.
	 * 
	 * @param key
	 * @param value
	 */
	public void addAnnotation(String key, String newValue) {
		List<String> valueList = null;
		String values = getCDAAnnotations().get(key);
		if (values != null) {
			valueList = Arrays.asList(values.split("\\s+"));
		}
		else {
			values = "";
		}
		
		if (valueList == null || !valueList.contains(newValue)) {
			if (values.length() > 0) {
				values += " ";
			}
			values += newValue;
			getCDAAnnotations().put(key, values);
		}
	}
	
	private Stereotype getStereotypeKind() {
		Stereotype stereotype = null;
		if (element instanceof Class) {
			stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_CLASS);
		}
		else if (element instanceof Property) {
			Property property = (Property) element;
			if (property.getType() instanceof DataType)
				stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_ATTRIBUTE);
			else
				stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_REFERENCE);
		}
		
		return stereotype;
	}

	/**
	 * Return a map of key/value pairs.
	 */
	@SuppressWarnings("unchecked")
	private Map<String,String> getCDAAnnotations() {
		if (cdaAnnotations == null) {
			cdaAnnotations = new HashMap<String,String>();

			Stereotype stereotype = getStereotypeKind();
			
			if (stereotype != null && element.isStereotypeApplied(stereotype)) {
				List<String> annotations = (List<String>) element.getValue(stereotype, "annotations");
				// find the CDA annotation source(s)
				for (String annotation : annotations) {
					// regex pattern adapted from UMLUtil annotations parser
					Matcher matcher = ANNOTATION_PATTERN.matcher(annotation);
					if (matcher.find()) {
						String sourceURI = matcher.group(1);
						if (sourceURI == null || ! sourceURI.trim().equals(CDA_ANNOTATION_SOURCE)) {
							continue;
						}
						
						cdaAnnotationIndex = annotations.indexOf(annotation);
						for (Matcher detailMatcher = ANNOTATION_DETAIL_PATTERN
								.matcher(matcher.group(2)); detailMatcher.find();) {
							String name = detailMatcher.group(1);
							String value = detailMatcher.group(4);
							
							if (name != null && value != null) {
								setAnnotation(name, value.trim());
							}
						}
					}
				}
			}
		}
		
		return cdaAnnotations;
	}
	
	@SuppressWarnings("unchecked")
	public void saveAnnotations() {
		if (cdaAnnotations == null) {
			return;
		}
		StringBuffer cdaAnnotation = new StringBuffer();
		cdaAnnotation.append(CDA_ANNOTATION_SOURCE);
		
		for (String key : cdaAnnotations.keySet()) {
			String value = cdaAnnotations.get(key);
			String annotation = " " + key + "='" + value + "'";
			cdaAnnotation.append(annotation);
		}

		// assure that the EClass stereotype is applied
		Stereotype stereotype = getStereotypeKind();
		if (stereotype != null) {
			UMLUtil.safeApplyStereotype(element, stereotype);
			String annotation = cdaAnnotations.keySet().isEmpty() ? null : cdaAnnotation.toString();
			
			if (cdaAnnotationIndex != null) {
				List<String> allAnnotations = (List<String>) element.getValue(stereotype, "annotations");
				if (annotation == null && allAnnotations.size() == 1) {
					element.setValue(stereotype, "annotations", new ArrayList());
				}
				else {
					// replace previous CDA annotation
					element.setValue(stereotype, "annotations[" + cdaAnnotationIndex + "]", annotation);
				}
			}
			else if (annotation != null) {
				// append to annotations list
				List<String> annotationList = (List<String>) element.getValue(stereotype, "annotations");
				annotationList.add(annotation);
				element.setValue(stereotype, "annotations", annotationList);
			}
		}
	}
	
}
