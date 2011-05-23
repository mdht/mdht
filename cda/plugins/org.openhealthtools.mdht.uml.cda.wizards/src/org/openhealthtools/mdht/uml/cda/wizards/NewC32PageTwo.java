/*******************************************************************************
 * Copyright (c) 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.wizards;

import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.uml.Type;

public class NewC32PageTwo extends WizardPage {

	HashMap<String, Button> components = new HashMap<String, Button>();

	protected NewC32PageTwo(String pageName, String title, ImageDescriptor titleImage,
			HashMap<String, Type> cdaDocuments) {
		super(pageName, title, titleImage);
	}

	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();

		layout.numColumns = 1;

		composite.setLayout(layout);

		setControl(composite);

		Label sections = new Label(composite, SWT.NONE);
		sections.setText("C32 Secctions, Select which components you wish to populate");

		Button componentButton;

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you need to add Comment(s), HITSP/C83 Section 2.2.2.11 ");
		components.put("COMMENT", componentButton);

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you want to populate Healthcare Provider(s), HITSP/C83 Section 2.2.2.4 ");
		components.put("PROVIDER", componentButton);

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you want to populate Person Information, HITSP/C83 Section 2.2.2.1 ");
		components.put("PERSON", componentButton);

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you want to populate Information Source, HITSP/C83 Section 2.2.2.10 ");
		components.put("SOURCE", componentButton);

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you want to populate Author Information");
		components.put("AUTHOR", componentButton);

		componentButton = new Button(composite, SWT.CHECK | SWT.RIGHT);
		componentButton.setText("Do you want to populate Custodian Information");
		components.put("CUSTODIAN", componentButton);

	}

}
