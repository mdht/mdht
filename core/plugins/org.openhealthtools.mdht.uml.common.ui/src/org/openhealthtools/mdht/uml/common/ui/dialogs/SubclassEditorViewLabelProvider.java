/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.ui.dialogs;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.IUMLNotation;
import org.openhealthtools.mdht.uml.common.util.PropertyNotationUtil;

public class SubclassEditorViewLabelProvider extends AdapterFactoryLabelProvider implements
		ILabelProvider {

	public SubclassEditorViewLabelProvider() {
		super(SubclassEditorComposedAdapterFactory.getAdapterFactory());
	}

	public Image getImage(Object element) {
		return super.getImage(element);
	}

	public String getText(Object element) {
		String text = "";
		if (element instanceof Property) {
			text = PropertyNotationUtil.getCustomLabel((Property) element,
					IUMLNotation.DEFAULT_UML_PROPERTY);
		} else {
			text = super.getText(element);
		}
		return text;
	}
}
