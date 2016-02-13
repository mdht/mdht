/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.properties;

import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The profile properties section for CDA Validation.
 */
public class AssociationValidationSection extends ValidationSection {

	@Override
	protected Stereotype getValidationStereotype() {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(modelElement, ICDAProfileConstants.ENTRY);
		if (stereotype == null) {
			stereotype = CDAProfileUtil.getAppliedCDAStereotype(modelElement, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		}
		if (stereotype == null) {
			String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR +
					ICDAProfileConstants.ASSOCIATION_VALIDATION;
			stereotype = modelElement.getApplicableStereotype(qname);
		}

		return stereotype;
	}

	@Override
	protected void modifyFields() {
		super.modifyFields();
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createGroup(parent, "Association Validation");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		addValidationControls(composite, 0, 1);
		addScope(composite, 0, 1);

		FormData data = null;

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		restoreDefaultsButton.setLayoutData(data);

	}

	@Override
	public void refresh() {
		super.refresh();

		Stereotype stereotype = getValidationStereotype();

		if (isReadOnly()) {
			restoreDefaultsButton.setEnabled(false);
		} else {
			restoreDefaultsButton.setEnabled(stereotype != null && modelElement.isStereotypeApplied(stereotype));
		}

	}

}
