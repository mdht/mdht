/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKMSoftware) - initial implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.properties;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.IVocabularyConstraint;

public class AbstractConstraintSection extends AbstractModelerPropertySection {

	Property property;

	Button vocabularyBrowseButton;

	static IConfigurationElement[] config = null;

	boolean hasVocabularyExtension() {
		boolean hasVocabularyExtension = false;

		if (config == null) {
			config = Platform.getExtensionRegistry().getConfigurationElementsFor(
				IVocabularySelectionDelegate.EXTENSION_POINT);
		}

		if (config.length > 0) {
			hasVocabularyExtension = true;
		}
		return hasVocabularyExtension;
	}

	public IVocabularyConstraint browseVocabulary(IVocabularySelectionDelegate.Constraint constraint) {

		try {

			for (IConfigurationElement configrationElement : config) {

				Object vocabularyDelegateTarget = configrationElement.createExecutableExtension(IVocabularySelectionDelegate.SELECTION_DELEGATE);

				IVocabularySelectionDelegate vocabularySelectionDelegate = (IVocabularySelectionDelegate) vocabularyDelegateTarget;

				if (vocabularySelectionDelegate.isConfigured()) {
					return vocabularySelectionDelegate.chooseVocabularyConstraint(
						getPart().getSite().getShell(), property, constraint);
				}
			}

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getButtonHeight() {
		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();
		return buttonHeight;
	}

	protected void updateViews() {

		Notification notification = new NotificationImpl(Notification.SET, null, property.getName()) {
			@Override
			public Object getNotifier() {
				return property;
			}

			@Override
			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		property.eNotify(notification);

	}
}
