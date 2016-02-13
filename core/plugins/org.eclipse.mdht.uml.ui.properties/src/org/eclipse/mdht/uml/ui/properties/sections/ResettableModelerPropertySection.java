/*******************************************************************************
 * Copyright (c) 2011, 2012 Kenn Hussey and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kenn Hussey - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.sections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Abstract parent class for properties sections whose fields can be reset (i.e.,
 * their values restored to their defaults) via a "Restore Default Values" button.
 */
public abstract class ResettableModelerPropertySection extends WrapperAwareModelerPropertySection {

	protected Button restoreDefaultsButton;

	protected abstract void resetFields();

	protected void createRestoreDefaultsButton(Composite parent) {
		restoreDefaultsButton = getWidgetFactory().createButton(parent, null, SWT.PUSH);

		restoreDefaultsButton.setToolTipText("Restore Default Values");
		restoreDefaultsButton.setImage(
			AbstractUIPlugin.imageDescriptorFromPlugin(
				"org.eclipse.mdht.uml.ui.properties", "icons/full/elcl16/restore_defaults.gif").createImage());

		restoreDefaultsButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent se) {
				resetFields();
			}

			public void widgetSelected(SelectionEvent se) {
				resetFields();
			}
		});
	}
}
