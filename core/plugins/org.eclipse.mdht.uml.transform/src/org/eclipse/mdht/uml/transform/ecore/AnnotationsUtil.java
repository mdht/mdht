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
 *                        - maintain consistent ordering of annotations (artf3306)
 *                        - factor out CDA dependencies from UML-to-Ecore transformation (artf3350)
 *                        - flexible, pluggable instance initializers (artf3272)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class AnnotationsUtil {

	private static final Pattern ANNOTATION_PATTERN = Pattern.compile(
		"\\G\\s*((?>\\\\.|\\S)+)((?:\\s+(?>\\\\.|\\S)+\\s*+=\\s*(['\"])((?>\\\\.|.)*?)\\3)*)");

	private static final Pattern ANNOTATION_DETAIL_PATTERN = Pattern.compile(
		"\\s+((?>\\\\.|\\S)+)\\s*+=\\s*((['\"])((?>\\\\.|.)*?)\\3)");

	private final Element element;

	private final String annotationSource;

	private AnnotationStore store;

	public AnnotationsUtil(Element element, String annotationSource) {
		this.annotationSource = annotationSource;
		this.element = element;
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

		private final Map<String, String> annotations = new java.util.LinkedHashMap<String, String>();

		private boolean dirty;

		private Integer annotationIndex = null;

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
			annotations.clear();

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

						annotationIndex = annotations.indexOf(annotation);
						for (Matcher detailMatcher = ANNOTATION_DETAIL_PATTERN.matcher(
							matcher.group(2)); detailMatcher.find();) {
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
			annotations.clear();

			super.unsetTarget(oldTarget);
		}

		String getAnnotation(String key) {
			return annotations.get(key);
		}

		void setAnnotation(String key, String value) {
			dirty = true;
			annotations.put(key, value);
		}

		void copyAnnotation(AnnotationsUtil source) {
			Map<String, String> store = source.getStore().annotations;
			if (!store.isEmpty()) {
				dirty = true;
				annotations.putAll(store);
			}
		}

		void removeAnnotation(String key) {
			if (annotations.containsKey(key)) {
				dirty = true;
				annotations.remove(key);
			}
		}

		void addAnnotation(String key, String newValue) {
			List<String> valueList = null;
			String values = annotations.get(key);
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
				annotations.put(key, values);
			}
		}

		@SuppressWarnings("unchecked")
		void save() {
			if (!dirty) {
				return;
			}

			Element element = (Element) getTarget();

			StringBuilder annotationBuf = new StringBuilder();
			annotationBuf.append(annotationSource);

			for (String key : annotations.keySet()) {
				String value = annotations.get(key);
				String annotation = " " + key + "='" + value + "'";
				annotationBuf.append(annotation);
			}

			// assure that the EClass stereotype is applied
			Stereotype stereotype = getStereotypeKind(element);
			if (stereotype != null) {
				UMLUtil.safeApplyStereotype(element, stereotype);
				String annotation = annotations.keySet().isEmpty()
						? null
						: annotationBuf.toString();

				if (annotationIndex != null) {
					List<String> allAnnotations = (List<String>) element.getValue(stereotype, "annotations");
					if (annotation == null && allAnnotations.size() == 1) {
						// remove only existing annotation, which was ours
						element.setValue(stereotype, "annotations", new ArrayList<String>());
						annotationIndex = null; // forget our index
					} else {
						// replace/remove previous CDA annotation
						element.setValue(stereotype, "annotations[" + annotationIndex + "]", annotation);
					}
				} else if (annotation != null) {
					// append to annotations list
					List<String> annotationList = (List<String>) element.getValue(stereotype, "annotations");
					annotationIndex = annotationList.size(); // compute our index
					annotationList.add(annotation);
					element.setValue(stereotype, "annotations", annotationList);
				}
			}

			dirty = false;
		}

	}
}
