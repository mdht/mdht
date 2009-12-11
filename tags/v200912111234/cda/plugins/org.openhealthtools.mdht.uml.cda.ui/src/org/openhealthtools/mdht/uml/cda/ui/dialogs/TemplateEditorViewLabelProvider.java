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
package org.openhealthtools.mdht.uml.cda.ui.dialogs;

import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;

/**
 *
 */
public class TemplateEditorViewLabelProvider extends SubclassEditorViewLabelProvider {

	public Image getImage(Object element) {
		if (element instanceof Property) {
			for (Profile profile : ((Property)element).getNearestPackage().getAllAppliedProfiles()) {
				// use the first notation provider found for an applied profile, ignore others
				String profileURI = profile.eResource().getURI().toString();
				INotationProvider provider = 
					NotationRegistry.INSTANCE.getProviderInstance(profileURI);
				if (provider != null) {
					Object image = provider.getAnnotationImage(((Property)element));
					if (image instanceof Image) {
						return (Image) image;
					}
				}
			}
		}
		
		return super.getImage(element);
	}

	public String getText(Object element) {
		return super.getText(element);
	}
}
