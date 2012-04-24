/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - added copy annotation method
 *     Christian W. Damus - reuse one annotation store for all utils on an element (artf3030)
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

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.EcoreTransformUtil;

public class AnnotationsUtil {

	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";

	private static final Pattern ANNOTATION_PATTERN = Pattern.compile("\\G\\s*((?>\\\\.|\\S)+)((?:\\s+(?>\\\\.|\\S)+\\s*+=\\s*(['\"])((?>\\\\.|.)*?)\\3)*)");

	private static final Pattern ANNOTATION_DETAIL_PATTERN = Pattern.compile("\\s+((?>\\\\.|\\S)+)\\s*+=\\s*((['\"])((?>\\\\.|.)*?)\\3)");

	private Element element;

	private String annotationSource = CDA_ANNOTATION_SOURCE;

	private AnnotationStore store;

	public AnnotationsUtil(Class umlClass, String annotationSource) {
		this.annotationSource = annotationSource;
		this.element = umlClass;
	}

	public AnnotationsUtil(Class umlClass) {
		this.element = umlClass;
	}

	public AnnotationsUtil(Property property) {
		this.element = property;
	}

	public AnnotationsUtil(Package umlPackage) {
		this.element = umlPackage;
	}

	public AnnotationsUtil(Namespace namespace) {
		this.element = namespace;
	}

	private AnnotationStore getStore() {
		if (store == null) {
			store = (AnnotationStore) EcoreUtil.getExistingAdapter(element, annotationSource);
			if (store == null) {
				store = new AnnotationStore(annotationSource);
				element.eAdapters().add(store);
			}
		}

		return store;
	}

	/**
	 * Get an annotation value for the given key.
	 * 
	 * @param key
	 */
	public String getAnnotation(String key) {
		return getStore().getAnnotation(key);
	}

	/**
	 * Set an annotation value for the given key, or replace the value if this key
	 * already exists in annotations.
	 * 
	 * @param key
	 * @param value
	 */
	public void setAnnotation(String key, String value) {
		getStore().setAnnotation(key, value);
	}

	public void copyAnnotation(AnnotationsUtil source) {
		getStore().copyAnnotation(source);
	}

	/**
	 * Remove an annotation key.
	 * 
	 * @param key
	 */
	public void removeAnnotation(String key) {
		getStore().removeAnnotation(key);
	}

	/**
	 * Append to list of existing values for the given key.
	 * Verify that given value is not already in list of values for this key.
	 * 
	 * @param key
	 * @param value
	 */
	public void addAnnotation(String key, String newValue) {
		getStore().addAnnotation(key, newValue);
	}

	static Stereotype getStereotypeKind(Element element) {
		Stereotype stereotype = null;
		if (element instanceof Class) {
			stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_CLASS);
		} else if (element instanceof Property) {
			Property property = (Property) element;
			if (property.getType() instanceof DataType) {
				stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_ATTRIBUTE);
			} else {
				stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_REFERENCE);
			}
		} else if (element instanceof Package) {
			stereotype = EcoreTransformUtil.getEcoreStereotype(element, UMLUtil.STEREOTYPE__E_PACKAGE);
		}

		return stereotype;
	}

	public void saveAnnotations() {
		getStore().save();
	}

	//
	// Nested types
	//

	private static final class AnnotationStore extends AdapterImpl {
		private final String annotationSource;

		private final Map<String, String> cdaAnnotations = new HashMap<String, String>();

		private boolean dirty;

		private Integer cdaAnnotationIndex = null;

		AnnotationStore(String annotationSource) {
			this.annotationSource = annotationSource;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return annotationSource.equals(type);
		}

		@Override
		public void setTarget(Notifier newTarget) {
			super.setTarget(newTarget);

			Element element = (Element) newTarget;
			cdaAnnotations.clear();

			Stereotype stereotype = getStereotypeKind(element);

			if (stereotype != null && element.isStereotypeApplied(stereotype)) {
				@SuppressWarnings("unchecked")
				List<String> annotations = (List<String>) element.getValue(stereotype, "annotations");
				// find the CDA annotation source(s)
				for (String annotation : annotations) {
					// regex pattern adapted from UMLUtil annotations parser
					Matcher matcher = ANNOTATION_PATTERN.matcher(annotation);
					if (matcher.find()) {
						String sourceURI = matcher.group(1);
						if (sourceURI == null || !sourceURI.trim().equals(annotationSource)) {
							continue;
						}

						cdaAnnotationIndex = annotations.indexOf(annotation);
						for (Matcher detailMatcher = ANNOTATION_DETAIL_PATTERN.matcher(matcher.group(2)); detailMatcher.find();) {
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

		@Override
		public void unsetTarget(Notifier oldTarget) {
			cdaAnnotations.clear();

			super.unsetTarget(oldTarget);
		}

		String getAnnotation(String key) {
			return cdaAnnotations.get(key);
		}

		void setAnnotation(String key, String value) {
			dirty = true;
			cdaAnnotations.put(key, value);
		}

		void copyAnnotation(AnnotationsUtil source) {
			Map<String, String> store = source.getStore().cdaAnnotations;
			if (!store.isEmpty()) {
				dirty = true;
				cdaAnnotations.putAll(store);
			}
		}

		void removeAnnotation(String key) {
			if (cdaAnnotations.containsKey(key)) {
				dirty = true;
				cdaAnnotations.remove(key);
			}
		}

		void addAnnotation(String key, String newValue) {
			List<String> valueList = null;
			String values = cdaAnnotations.get(key);
			if (values != null) {
				valueList = Arrays.asList(values.split("\\s+"));
			} else {
				values = "";
			}

			if (valueList == null || !valueList.contains(newValue)) {
				if (values.length() > 0) {
					values += " ";
				}
				values += newValue;
				dirty = true;
				cdaAnnotations.put(key, values);
			}
		}

		@SuppressWarnings("unchecked")
		void save() {
			if (!dirty) {
				return;
			}

			Element element = (Element) getTarget();

			StringBuffer cdaAnnotation = new StringBuffer();
			cdaAnnotation.append(annotationSource);

			for (String key : cdaAnnotations.keySet()) {
				String value = cdaAnnotations.get(key);
				String annotation = " " + key + "='" + value + "'";
				cdaAnnotation.append(annotation);
			}

			// assure that the EClass stereotype is applied
			Stereotype stereotype = getStereotypeKind(element);
			if (stereotype != null) {
				UMLUtil.safeApplyStereotype(element, stereotype);
				String annotation = cdaAnnotations.keySet().isEmpty()
						? null
						: cdaAnnotation.toString();

				if (cdaAnnotationIndex != null) {
					List<String> allAnnotations = (List<String>) element.getValue(stereotype, "annotations");
					if (annotation == null && allAnnotations.size() == 1) {
						element.setValue(stereotype, "annotations", new ArrayList<String>());
					} else {
						// replace previous CDA annotation
						element.setValue(stereotype, "annotations[" + cdaAnnotationIndex + "]", annotation);
					}
				} else if (annotation != null) {
					// append to annotations list
					List<String> annotationList = (List<String>) element.getValue(stereotype, "annotations");
					annotationList.add(annotation);
					element.setValue(stereotype, "annotations", annotationList);
				}
			}

			dirty = false;
		}

	}
}
