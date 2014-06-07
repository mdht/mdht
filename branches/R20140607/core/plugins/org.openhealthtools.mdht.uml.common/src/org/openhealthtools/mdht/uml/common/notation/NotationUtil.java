/*******************************************************************************
 * Copyright (c) 2011-20113 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.notation;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * @author dcarlson
 * 
 */
public class NotationUtil {

	/*
	 * TODO: Add priority to notation extensions.
	 * Use profile URI for notation extensions.
	 * Sort extensions by priority, iterate through extensions and return first non-null result.
	 */

	/*
	 * public static List<Object> getDesignationNamespaces(Element element) {
	 * List<Object> namespaces = null;
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * namespaces = provider.getDesignationNamespaces(element);
	 * }
	 * }
	 * return namespaces;
	 * }
	 * 
	 * public static List<String> getDesignations(Element element) {
	 * List<String> designations = null;
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * designations = provider.getDesignations(element);
	 * }
	 * }
	 * return designations;
	 * }
	 * 
	 * public static List<String> getDesignations(Element element, String language) {
	 * List<String> designations = null;
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * designations = provider.getDesignations(element, language);
	 * }
	 * }
	 * return designations;
	 * }
	 * 
	 * public static List<String> getDesignations(Element element, Object namespace) {
	 * List<String> designations = null;
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * designations = provider.getDesignations(element, namespace);
	 * }
	 * }
	 * return designations;
	 * }
	 * 
	 * public static List<String> getDesignations(Element element, Object namespace, String language) {
	 * List<String> designations = null;
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * designations = provider.getDesignations(element, namespace, language);
	 * }
	 * }
	 * return designations;
	 * }
	 */

	public static String getPrintString(Element element) {
		String text = null;
		if (element != null) {
			INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
			if (provider != null) {
				text = provider.getPrintString(element);
			}
		}

		if (text == null) {
			// return default UML standard annotations, if no extensions found
			if (element instanceof Class) {
				text = ClassNotationUtil.getCustomLabel((Class) element, IUMLNotation.DEFAULT_UML_CLASS);
			} else if (element instanceof Property) {
				text = PropertyNotationUtil.getCustomLabel((Property) element, IUMLNotation.DEFAULT_UML_PROPERTY);
			}

			// TODO else, get from UML adapter provider
		}

		return text;
	}

	public static Object getElementImage(Element element) {
		if (element != null) {
			INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
			if (provider != null) {
				return provider.getElementImage(element);
			}
		}

		return null;
	}

	public static String getAnnotation(Element element) {
		String annotation = null;

		if (element != null) {
			INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
			if (provider != null) {
				annotation = provider.getAnnotation(element);
			}
		}

		if (annotation == null) {
			// return default UML standard annotations, if no extensions found
			if (element instanceof Class) {
				annotation = ClassNotationUtil.getCustomLabel(
					(Class) element, IUMLNotation.DEFAULT_UML_CLASS_ANNOTATIONS);
			} else if (element instanceof Property) {
				annotation = PropertyNotationUtil.getCustomLabel(
					(Property) element, IUMLNotation.DEFAULT_UML_PROPERTY_ANNOTATIONS);
			}
		}

		return annotation;
	}

	public static Object getAnnotationImage(Element element) {
		if (element != null) {
			INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
			if (provider != null) {
				return provider.getAnnotationImage(element);
			}
		}

		return null;
	}

	/*
	 * public static AdapterFactory getAdapterFactory(Element element) {
	 * if (element != null) {
	 * INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
	 * if (provider != null) {
	 * return provider.getAdapterFactory(element);
	 * }
	 * }
	 * 
	 * return null;
	 * }
	 */
}
