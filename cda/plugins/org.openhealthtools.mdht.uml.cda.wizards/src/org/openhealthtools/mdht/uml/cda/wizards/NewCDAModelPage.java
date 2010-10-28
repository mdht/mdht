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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Type;



public class NewCDAModelPage extends WizardPage {

	HashMap<String, Type> cdaDocuments;

	Combo combo;

	Text modelName;

	Text cdaDocumentName;

	Text templateID;

	Text assigningAuthority;

	public String getModelName() {

		return modelName.getText();
	}

	public String getCDADocumentName() {

		return cdaDocumentName.getText();
	}

	public String getTemplateId() {

		return templateID.getText();
	}
	
	public String getTemplateAssigningAuthority() {

		return assigningAuthority.getText();
	}

	public String getCDADocument() {
		return combo.getText();
	}

	
	public boolean canFlipToNextPage() {
		return modelName.getText().length() > 0;
	}

	protected NewCDAModelPage(String pageName, String title, ImageDescriptor titleImage, HashMap<String, Type> cdaDocuments) {
		super(pageName, title, titleImage);

		this.cdaDocuments = cdaDocuments;

	}
	
	
	/*
	 * 				
	 * 			codegenSupport.setBasePackage("org.openhealthtools.mdht.uml.cda");
								
				codegenSupport.setNsURI("http://www.openhealthtools.org/mdht/uml/cda/"+newCDATemplatePage.getModelName().toLowerCase());
			
				codegenSupport.setNsPrefix(newCDATemplatePage.getModelName().toLowerCase());
				
				codegenSupport.setPackageName(newCDATemplatePage.getModelName().toLowerCase());

				codegenSupport.setPrefix(newCDATemplatePage.getModelName());
	
				clonePackage.setName(newCDATemplatePage.getModelName().toLowerCase());

	 */
	
	
	Text basePackage;

	Text nsPrefix;
	
	Text nsURI;
	
	Text packageName;
	
	Text prefix;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */

	
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		
		layout.numColumns = 2;
		
		composite.setLayout(layout);
		
		setControl(composite);
		
		new Label(composite, SWT.NONE).setText("Organization ");
		
		modelName = new Text(composite, SWT.NONE);
		modelName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		new Label(composite, SWT.NONE).setText("Document ");

		cdaDocumentName = new Text(composite, SWT.NONE);
		cdaDocumentName.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Document Conformance ");

		combo = new org.eclipse.swt.widgets.Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

		new Label(composite, SWT.NONE).setText("Template ID (Optional) ");

		templateID = new Text(composite, SWT.NONE);
		templateID.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		new Label(composite, SWT.NONE).setText("Assigning Authority (Optional) ");

		assigningAuthority = new Text(composite, SWT.NONE);
		assigningAuthority .setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		
		
		
		
		
		

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
				
				basePackage.setText("org.openhealthtools.mdht.cda");

				packageName.setText(cdaDocumentName.getText().toLowerCase());

				nsPrefix.setText(modelName.getText().toLowerCase());
				
				prefix.setText(modelName.getText().toUpperCase());
				
				nsURI.setText("http://www.openhealthtools.org/mdht/uml/cda/"+modelName.getText().toLowerCase());

				setPageComplete(modelName.getText().length() > 0);
			}

		};
		modelName.addModifyListener(listener);
		
		cdaDocumentName.addModifyListener(listener);
				
		new Label(composite, SWT.NONE).setText("Document Base Package");

		basePackage = new Text(composite, SWT.READ_ONLY|SWT.COLOR_GRAY);
		
		basePackage.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		//"http://www.openhealthtools.org/mdht/uml/cda/"

		new Label(composite, SWT.NONE).setText("Namespace URI");
		nsURI= new Text(composite, SWT.READ_ONLY|SWT.COLOR_GRAY);
		
		//GridData.HORIZONTAL_ALIGN_FILL
		GridData gd = new GridData();
		gd.widthHint=400;
		
		nsURI.setLayoutData(gd);

		
		
		new Label(composite, SWT.NONE).setText("Document Namespace Prefix ");

		nsPrefix = new Text(composite, SWT.READ_ONLY|SWT.COLOR_GRAY);
		nsPrefix .setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Package Name ");

		packageName = new Text(composite, SWT.READ_ONLY|SWT.COLOR_GRAY);
	
		packageName .setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		new Label(composite, SWT.NONE).setText("Prefix ");

		prefix = new Text(composite, SWT.READ_ONLY|SWT.COLOR_GRAY);
		prefix .setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		
		
		
		
		

	}

}
