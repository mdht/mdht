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
package org.openhealthtools.mdht.uml.ui.navigator.internal;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IActionFilter;
import org.eclipse.uml2.uml.Element;

public class UMLActionFilter implements IActionFilter {
	
	public static final String UML_TYPE = "umlType";
	public static final String UML_STRICT_TYPE = "umlStrictType";
	public static final String HAS_STEREOTYPE = "hasStereotype";

	public static final String UML_JAVA_PACKAGE = "org.eclipse.uml2.uml.";

	public boolean testAttribute(Object target, String name, String value) {
		Element element = null;
		if (target instanceof Element) {
			element = (Element) target;
		}
		else if (target instanceof IAdaptable) {
			element = (Element) ((IAdaptable)target).getAdapter(Element.class);
		}
		
		if (element != null) {
			if (UML_STRICT_TYPE.equals(name)) {
				return element.getClass().getName().equals(UML_JAVA_PACKAGE + value);
			}
			else if (UML_TYPE.equals(name)) {
				try {
					Class umlType = Class.forName(UML_JAVA_PACKAGE + value);
					return umlType.isAssignableFrom(element.getClass());
					
				} catch (ClassNotFoundException e) {
				}
			}
			else if (HAS_STEREOTYPE.equals(name)) {
				return null != element.getAppliedStereotype(value);
			}
		}
		
		return false;
	}

}
