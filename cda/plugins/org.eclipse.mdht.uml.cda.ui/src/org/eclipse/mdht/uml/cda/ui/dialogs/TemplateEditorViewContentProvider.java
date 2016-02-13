/**
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 */
package org.eclipse.mdht.uml.cda.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;

/**
 *
 */
public class TemplateEditorViewContentProvider extends SubclassEditorViewContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		List<NamedElement> children = new ArrayList<NamedElement>();

		if (parentElement instanceof Class) {
			// add properties, owned and inherited
			PropertyList propertyList = new PropertyList((Class) parentElement);
			children.addAll(propertyList.getAttributes());
			children.addAll(propertyList.getAssociationEnds());
		}
		return children.toArray();
	}

}
