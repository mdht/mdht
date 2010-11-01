package org.openhealthtools.mdht.uml.cda.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Type;

public class NewCDAJavaPage extends WizardPage {

	HashMap<String, Type> cdaDocuments;

	Combo combo;

	Combo applicationType;

	Text cdaDocumentName;

	public String getCDADocument() {
		return combo.getText();
	}

	public String getApplicationStyle() {
		return applicationType.getText();
	}

	protected NewCDAJavaPage(String pageName, String title, ImageDescriptor titleImage, HashMap<String, Type> cdaDocuments) {
		super(pageName, title, titleImage);

		this.cdaDocuments = cdaDocuments;

	}

	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();

		layout.numColumns = 2;

		composite.setLayout(layout);

		setControl(composite);

		new Label(composite, SWT.NONE).setText("Package ");

		new Label(composite, SWT.NONE).setText("CDA Document");

		combo = new org.eclipse.swt.widgets.Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

		new Label(composite, SWT.NONE).setText("Application Type");

		applicationType = new org.eclipse.swt.widgets.Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

		applicationType.add("Hello CDA World");

		applicationType.select(0);

		int current = 0;

		List<String> list = new ArrayList<String>();

		list.addAll(cdaDocuments.keySet());

		Collections.sort(list);

		for (String key : list) {
			combo.add(key);
			if (key.equalsIgnoreCase("cda::ClinicalDocument")) {
				combo.select(current);
			}
			current++;
		}

		ModifyListener listener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {

				setPageComplete(combo.getText().length() > 0);
			}

		};
		combo.addModifyListener(listener);

	}

}
