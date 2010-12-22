package org.openhealthtools.mdht.uml.cda.wizards;

import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Type;



public class NewC32PageOne extends WizardPage {

	public HashMap<String, Button > sections= new HashMap<String, Button > ();



	protected NewC32PageOne(String pageName, String title, ImageDescriptor titleImage, HashMap<String, Type> cdaDocuments) {
		super(pageName, title, titleImage);

	}
	
	
	public static final String ALLERGIES="ALLERGIES";
	public static final String PROBLEMLIST="PROBLEMLIST";	
	public static final String ENCOUNTERS="ENCOUNTERS";
	public static final String IMMUNIZATIONS="IMMUNIZATIONS";
	public static final String PAYERS="PAYERS";
	public static final String MEDICATIONS="MEDICATIONS";
	public static final String SURGERIES="SURGERIES";
	public static final String VITALS="VITALS";
	public static final String DIAGNOSTICS="DIAGNOSTICS";
	
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		
		layout.numColumns = 1;
		
		composite.setLayout(layout);
		
		setControl(composite);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("C32 Content, Select which sections you wish to populate");

		Button sectionButton;
			
		sectionButton = new Button(composite,SWT.CHECK);		
		sectionButton.setText("Allergies and Other Adverse Reactions Section, HITSP/C83 Section 2.2.1.2");
		sections.put(ALLERGIES, sectionButton);

		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Problem List Section, HITSP/C83 Section 2.2.1.2");		
		sections.put(PROBLEMLIST, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Encounters Section, HITSP/C83 Section 2.2.1.27");
		sections.put(ENCOUNTERS, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Immunizations Section, HITSP/C83 Section 2.2.1.17");
		sections.put(IMMUNIZATIONS, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Payers Section, HITSP/C83 Section 2.2.1.1");
		sections.put(PAYERS, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Medications Section, HITSP/C83 Section 2.2.1.12");
		sections.put(MEDICATIONS, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("List of Surgeries Section, HITSP/C83 Section 2.2.1.8");
		sections.put(SURGERIES, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Vital Signs Section, HITSP/C83 Section 2.2.1.19");
		sections.put(VITALS, sectionButton);
		
		sectionButton = new Button(composite,SWT.CHECK);
		sectionButton.setText("Diagnostic Results Section, HITSP/C83 Section 2.2.1.22");
		sections.put(DIAGNOSTICS, sectionButton);
		
	}

}
