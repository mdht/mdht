/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
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

package org.openhealthtools.mdht.uml.ui.smd.vocabulary;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7Code;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7CodeSystem;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7Concept;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ConceptDomain;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ValueSet;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.util.VocabularymetamodelSwitch;

/**
 * 
 * Mif2VocabularyLabelProvider Mif2VocabularyLabelProvider provides coloring and
 * text for vocabulary tree
 * 
 * @author eclipse
 * 
 */
public class HL7VocabularyLabelProvider implements ILabelProvider, IColorProvider {

	Display display;

	public HL7VocabularyLabelProvider(Display display) {
		super();
		this.display = display;
		vocabularyModelColorProviderSwitch = new HL7VocabularyModelColorProviderSwitch(this.display);

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

	HL7VocabularyModelLabelProviderSwitch vocabularyModelLabelProviderSwitch = new HL7VocabularyModelLabelProviderSwitch();

	HL7VocabularyModelColorProviderSwitch vocabularyModelColorProviderSwitch = null;

	/**
	 * 
	 * VocabularyModelColorProviderSwitch Local switch class to set colors on
	 * model entities
	 * 
	 * @author eclipse
	 * 
	 */
	private class HL7VocabularyModelColorProviderSwitch extends VocabularymetamodelSwitch<Object> {

		// foreground color bucket set by the doSwitch
		public Color foregroundColor = null;

		Display display;

		public HL7VocabularyModelColorProviderSwitch(Display display) {
			super();
			this.display = display;
		}

		@Override
		public Object caseHL7ConceptDomain(HL7ConceptDomain object) {

			// if (object.getBindings().size() > 0)
			// {
			// foregroundColor = display.getSystemColor(SWT.COLOR_BLUE);
			// } else
			// {
			// foregroundColor = display.getSystemColor(SWT.COLOR_RED);
			// }

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
	private class HL7VocabularyModelLabelProviderSwitch extends VocabularymetamodelSwitch<Object> {

		// label bucket set by the doSwitch
		public String label;

		@Override
		public Object caseHL7CodeSystem(HL7CodeSystem hl7CodeSystem) {
			label = hl7CodeSystem.getName() + " : " + hl7CodeSystem.getId();
			return hl7CodeSystem;
		}

		@Override
		public Object caseHL7Concept(HL7Concept object) {

			label = "";
			if (!object.getCodes().isEmpty()) {
				label = object.getCodes().get(0).getCode() + " : ";
			}

			if (!object.getPrintNames().isEmpty()) {
				label += object.getPrintNames().get(0);
			}
			return object;
		}

		@Override
		public Object caseHL7ValueSet(HL7ValueSet object) {

			label = "VSID : " + object.getId() + " : " + object.getName();

			return object;
		}

		@Override
		public Object caseHL7ConceptDomain(HL7ConceptDomain object) {
			label = object.getName();

			if (object.getBindings().size() == 0) {
				label = "- " + label;
			}

			return object;
		}

		@Override
		public Object caseHL7Code(HL7Code object) {
			label = object.getCode();
			return object;
		}

		public Object defaultCase(EObject object) {
			// If we can not find it - We set to class name to give some
			// guidance on troubleshooting and not just throw exception
			label = "default" + object.getClass().getCanonicalName();
			return object;
		}

	};

	public String getText(Object element) {
		// Fire the switch and use resulting label value
		if (element instanceof EObject) {
			vocabularyModelLabelProviderSwitch.doSwitch((EObject) element);
			return vocabularyModelLabelProviderSwitch.label;
		} else {
			return (String) element;
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
