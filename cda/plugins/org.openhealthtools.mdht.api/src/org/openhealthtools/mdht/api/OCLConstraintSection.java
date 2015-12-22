/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;
import org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintSection;

/**
 * Add link to generate Xpath or C# from OCL
 */
public class OCLConstraintSection extends ConstraintSection {

	private Hyperlink fromOclLabel;

	@SuppressWarnings("rawtypes")
	static public Map<String, OCLTransformation> OCL_TRANSFORMATIONS = new HashMap<String, OCLTransformation>();

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {

		// hide original
		Composite p = (Composite) parent.getParent().getChildren()[parent.getParent().getChildren().length - 2];
		p.setLayout(new GridLayout(0, false));

		// add C#
		// languages = new String[] { "Analysis", "OCL", "Java", "XPath", "StrucText"/* , "C#" */};

		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = languageCombo.getParent();
		createFromOclLink(composite);

	}

	/**
	 * @param composite
	 */
	private void createFromOclLink(final Composite composite) {
		FormData data;
		fromOclLabel = getWidgetFactory().createHyperlink(composite, "Get from OCL", 0); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bodyText, 0, SWT.LEFT);
		data.top = new FormAttachment(bodyText, -5, SWT.BOTTOM);
		fromOclLabel.setLayoutData(data);
		FontData[] fD = fromOclLabel.getFont().getFontData();
		fD[0].setHeight(fD[0].getHeight() * 3 / 4);
		fromOclLabel.setFont(new Font(Display.getCurrent(), fD[0]));
		fromOclLabel.addHyperlinkListener(new HyperlinkAdapter() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public void linkActivated(HyperlinkEvent e) {
				try {
					OCLTransformation trafo = OCL_TRANSFORMATIONS.get(languageCombo.getText());
					trafo.setResourceSet(constraint.getContext().eResource().getResourceSet());

					final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression) ? (OpaqueExpression) constraint.getSpecification() : null;

					int oclIndex = spec.getLanguages().indexOf("OCL");
					String xpath = trafo.transform(constraint.getContext(), spec.getBodies().get(oclIndex));
					bodyText.setText(xpath);
					bodyModified = true;
					modifyFields();

				} catch (Exception e2) {
					MessageDialog.openError(composite.getShell(), "Conversion error", e2.getMessage());
				}

			}
		});

	}

	@Override
	public void refresh() {
		super.refresh();
		final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression) ? (OpaqueExpression) constraint.getSpecification() : null;

		int oclIndex = spec != null ? spec.getLanguages().indexOf("OCL") : -1;
		fromOclLabel.setVisible(OCL_TRANSFORMATIONS.containsKey(languageCombo.getText()) && oclIndex >= 0 && oclIndex < spec.getBodies().size() && !UML2Util.isEmpty(spec.getBodies().get(oclIndex)));

	}

}
