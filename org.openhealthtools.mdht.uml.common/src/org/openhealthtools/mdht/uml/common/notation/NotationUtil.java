/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
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

	public static String getPrintString(Element element) {
		String text = null;
		INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
		if (provider != null) {
			text = provider.getPrintString(element);
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
		// TODO get from UML adapter provider
		return null;
	}

	public static String getAnnotation(Element element) {
		String annotation = null;

		INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
		if (provider != null) {
			annotation = provider.getAnnotation(element);
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
		INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(element);
		if (provider != null) {
			return provider.getAnnotationImage(element);
		}

		return null;
	}

}
