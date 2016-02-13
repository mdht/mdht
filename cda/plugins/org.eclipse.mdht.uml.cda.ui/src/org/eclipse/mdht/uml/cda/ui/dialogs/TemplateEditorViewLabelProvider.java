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

import org.eclipse.mdht.uml.common.notation.INotationProvider;
import org.eclipse.mdht.uml.common.notation.NotationRegistry;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Property;

/**
 *
 */
public class TemplateEditorViewLabelProvider extends SubclassEditorViewLabelProvider {

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
		}

		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return super.getText(element);
	}
}
