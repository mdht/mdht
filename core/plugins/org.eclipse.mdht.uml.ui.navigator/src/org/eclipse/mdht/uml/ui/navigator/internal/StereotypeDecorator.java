/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.navigator.internal;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class StereotypeDecorator implements ILabelDecorator {

	public Image decorateImage(Image image, Object element) {
		return image;
	}

	public String decorateText(String text, Object object) {
		Element element = null;
		if (object instanceof Element) {
			element = (Element) object;
		} else if (object instanceof IAdaptable) {
			element = ((IAdaptable) object).getAdapter(Element.class);
		}
		if (element != null && !element.getAppliedStereotypes().isEmpty()) {
			StringBuilder decorator = new StringBuilder();
			for (Iterator iterator = element.getAppliedStereotypes().iterator(); iterator.hasNext();) {
				Stereotype stereotype = (Stereotype) iterator.next();
				EAnnotation extensions = stereotype.getEAnnotation("uml2.extensions");
				boolean suppressed = extensions != null && extensions.getDetails() != null &&
						"true".equals(extensions.getDetails().get("suppressed"));
				if (!suppressed) {
					if (decorator.length() == 0) {
						decorator.append("<<");
					} else {
						decorator.append(", ");
					}
					// keyword gets localized name, or lowerCamelCase of Stereotype name
					decorator.append(stereotype.getKeyword());
				}
			}
			if (decorator.length() > 0) {
				decorator.append(">> ");
				decorator.append(text);
				return decorator.toString();
			}
		}
		return text;
	}

	public void dispose() {

	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void addListener(ILabelProviderListener listener) {

	}

	public void removeListener(ILabelProviderListener listener) {

	}

}
