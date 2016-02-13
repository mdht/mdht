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
package org.eclipse.mdht.uml.common.ui.dialogs;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.mdht.uml.common.notation.INotationProvider;
import org.eclipse.mdht.uml.common.notation.NotationRegistry;
import org.eclipse.mdht.uml.common.notation.NotationUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Property;

public class SubclassEditorViewLabelProvider extends AdapterFactoryLabelProvider implements ILabelProvider {

	public SubclassEditorViewLabelProvider() {
		super(SubclassEditorComposedAdapterFactory.getAdapterFactory());
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Property) {
			Property property = (Property) element;
			INotationProvider provider = NotationRegistry.INSTANCE.getNotationProvider(property);
			if (provider != null) {
				Object image = null;
				if (property.getAssociation() != null) {
					image = provider.getAnnotationImage(property.getAssociation());
				} else {
					image = provider.getAnnotationImage(property);
				}

				if (image instanceof Image) {
					return (Image) image;
				}
			}

			if (property.getAssociation() != null) {
				return super.getImage(property.getAssociation());
			} else {
				return super.getImage(property);
			}
		}

		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		String text = null;
		if (element instanceof Property) {
			text = NotationUtil.getPrintString((Property) element);
		} else {
			text = super.getText(element);
		}
		return text;
	}
}
