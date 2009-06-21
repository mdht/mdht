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

package org.openhealthtools.mdht.uml.hl7.ui.vocabulary;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm;
import org.openhealthtools.mdht.emf.hl7.mif2.Code;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch;




/**
 * 
 * Mif2VocabularyLabelProvider Mif2VocabularyLabelProvider provides coloring and
 * text for vocabulary tree
 * 
 * @author eclipse
 * 
 */
public class Mif2VocabularyLabelProvider implements ILabelProvider, IColorProvider {

	Display display;

	public Mif2VocabularyLabelProvider(Display display) {
		super();
		this.display = display;
		vocabularyModelColorProviderSwitch = new VocabularyModelColorProviderSwitch(this.display);
		// TODO Auto-generated constructor stub
	}


	public Color getBackground(Object element) {
		// Currently no background changes
		return null;
	}

	public Color getForeground(Object element) {
		if (element instanceof EObject) {
			vocabularyModelColorProviderSwitch.doSwitch((EObject) element);
		}
		return vocabularyModelColorProviderSwitch.foregroundColor;
	}

	VocabularyModelLabelProviderSwitch vocabularyModelLabelProviderSwitch = new VocabularyModelLabelProviderSwitch();
	VocabularyModelColorProviderSwitch vocabularyModelColorProviderSwitch = null;

	/**
	 * 
	 * VocabularyModelColorProviderSwitch Local switch class to set colors on
	 * model entities
	 * 
	 * @author eclipse
	 * 
	 */
	private class VocabularyModelColorProviderSwitch extends Mif2Switch<Object> {

		// foreground color bucket set by the doSwitch
		public Color foregroundColor = null;

		Display display;

		public VocabularyModelColorProviderSwitch(Display display) {
			super();
			this.display = display;
		}

		public Object caseConcept(Concept object) {

			for (Code code : object.getCode()) {
				doSwitch(code);
				break;
			}

			return object;
		}

		
		
		public Object caseCodeSystem(CodeSystem codeSystem) {
			// TODO Auto-generated method stub
			
			if (codeSystem.getReleasedVersion().size() > 0)
			{
				if (!codeSystem.getReleasedVersion().get(0).isHl7ApprovedIndicator())
				{
					foregroundColor = display.getSystemColor(SWT.COLOR_RED);	
				}
			}
			
			return codeSystem;
		}

		
		public Object caseCode(Code object) {

			if (object.getStatus().equals(CodeStatusKind.PROPOSED)) {
				foregroundColor = display.getSystemColor(SWT.COLOR_GREEN);
			} else {
				foregroundColor = display.getSystemColor(SWT.COLOR_BLUE);
			}

			return object;
		}

		
		public Object defaultCase(EObject object) {
			foregroundColor = display.getSystemColor(SWT.COLOR_BLACK);
			return object;
		}

	}

	/**
	 * Local mif2switch to set label text
	 * 
	 * @author eclipse
	 * 
	 */
	private class VocabularyModelLabelProviderSwitch extends Mif2Switch<Object> {

		// label bucket set by the doSwitch
		public String label;

		
		
		
		
		public Object caseCodeSystem(CodeSystem codeSystem) {
					
			label = codeSystem.getName() + " : " + codeSystem.getCodeSystemId(); 

			return codeSystem;
		}

		
		public Object caseValueSet(ValueSet valueSet) {
			
			label = valueSet.getName() +" : " + valueSet.getId();
			
			return valueSet;
		}

		
		public Object caseBindingRealm(BindingRealm object) {
			// TODO Auto-generated method stub
			label = object.getName();
			return object;
		}

		
		public Object caseContextBinding(ContextBinding object) {
			label = object.getConceptDomain();// + ":" + object.getValueSet() +
			// ":" +
			// object.getEffectiveDate();
			return object;
		}
		
		 public Object caseConceptDomain(ConceptDomain conceptDomain)
		 {
			 label = conceptDomain.getName();
			 
			 
//				CommentSwitch commentSwitch = new CommentSwitch(transformerOptions);
				
				
			 return conceptDomain;
		 }

		
		public Object defaultCase(EObject object) {
			// If we can not find it - We set to class name to give some
			// guidance on troubleshooting and not just throw exception

			label = "default" + object.getClass().getCanonicalName();
			return object;
		}

		
		public Object caseConcept(Concept object) {

			// TODO We are only gettign one Code  and we grab it
			// need to figure out if that is the future
			if (object.getCode().size() > 0) {
				label = object.getCode().get(0).getCode();
				if (object.getPrintName().size() > 0) {
					label += " : " + object.getPrintName().get(0).getText();
				}
			}
	

			return object;
		}

	}

	public String getText(Object element) {
		// Fire the switch and use resulting label value
		if (element instanceof EObject) {
			vocabularyModelLabelProviderSwitch.doSwitch((EObject) element);
			return vocabularyModelLabelProviderSwitch.label;
		} else
		{
			return (String)element;
		}
	
	}

	public void addListener(ILabelProviderListener listener) {
		;
	}

	public void dispose() {
		;
	}

	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	public void removeListener(ILabelProviderListener listener) {
		;

	}

	public org.eclipse.swt.graphics.Image getImage(Object element) {		
		return null;
	}
	
	

}