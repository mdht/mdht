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
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.common.notation.PropertyNotationUtil;

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
			Property property = (Property) element;
			for (Profile profile : property.getNearestPackage().getAllAppliedProfiles()) {
				// use the first notation provider found for an applied profile, ignore others
				String profileURI = profile.eResource().getURI().toString();
				INotationProvider provider = 
					NotationRegistry.INSTANCE.getProviderInstance(profileURI);
				if (provider != null) {
					text = provider.getPrintString(property);
				}
			}
			// return default UML standard annotations, if no extensions found
			text = PropertyNotationUtil.getCustomLabel(property,
					IUMLNotation.DEFAULT_UML_PROPERTY);
			
		} 
		else {
			text = super.getText(element);
		}
		return text;
	}
}
