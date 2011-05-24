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
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Property;

public class CloneEditorViewLabelProvider extends AdapterFactoryLabelProvider implements ILabelProvider {

	public CloneEditorViewLabelProvider() {
		super(CloneEditorComposedAdapterFactory.getAdapterFactory());
	}

	@Override
	public Image getImage(Object element) {
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		String text = "";
		if (element instanceof Property) {
			text = ((Property) element).getName();
		} else {
			text = super.getText(element);
		}
		return text;
	}
}
