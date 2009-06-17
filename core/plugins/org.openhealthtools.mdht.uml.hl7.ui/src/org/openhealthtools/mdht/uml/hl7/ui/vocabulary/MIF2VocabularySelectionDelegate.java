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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate;
import org.openhealthtools.mdht.uml.hl7.ui.util.TreeSelectionDialog;

public class MIF2VocabularySelectionDelegate implements IVocabularySelectionDelegate {

	static public class ConceptConstraint implements IConceptConstraint {

		String concept;

		public ConceptConstraint(ConceptDomain conceptdomain) {
			super();
			this.concept = conceptdomain.getName();
		}

		
		public String getConcept() {
			// TODO Auto-generated method stub
			return concept;
		}

	}

	static public class CodeSystemConstraint implements ICodeSystemConstraint {

		String code;
		String codePrintName;
		String systemName;
		String systemOid;
		String systemVersion;

		public CodeSystemConstraint(Concept concept, ContextBinding contextBinding) {

			if (contextBinding.getVersionDate() != null) {
				systemVersion = contextBinding.getVersionDate().toString();
			}

			if (concept.getCode().size() > 0) {
				code = concept.getCode().get(0).getCode();
				if (concept.getCode().get(0).getPrintName().size() > 0) {
					codePrintName = concept.getCode().get(0).getPrintName().get(0).getText();
				}
			}

			systemOid = contextBinding.getValueSet();

			systemName = contextBinding.getConceptDomain();

		}

		
		public String getCode() {
			return code;
		}

		
		public String getCodePrintName() {
			return codePrintName;
		}

		
		public String getSystemName() {
			return systemName;
		}

		
		public String getSystemOid() {
			return systemOid;
		}

		
		public String getSystemVersion() {
			return systemVersion;
		}

	}

	static public class ValueSetConstraint implements IValueSetConstraint {

		public ValueSetConstraint(ValueSet valueSet) {
			id = valueSet.getId();
			name = valueSet.getName();
			if (valueSet.getVersion().size() > 0) {
				if (valueSet.getVersion().get(0).getVersionDate() != null) {
					versionDate = valueSet.getVersion().get(0).getVersionDate().toString();
				}
			}

		}

		String id;
		String name;
		String versionDate;

		
		public String getID() {
			// TODO Auto-generated method stub
			return id;
		}

		
		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}

		
		public String getVersionDate() {
			// TODO Auto-generated method stub
			return versionDate;
		}

	}

	
	public IVocabularyConstraint chooseVocabularyConstraint(Shell shell, Property property, Constraint constraint) {

		IVocabularyConstraint constraintResult = null;

		Mif2VocabularyContentProvider mif2VocabularyContentProvider = new Mif2VocabularyContentProvider(constraint);

		mif2VocabularyContentProvider.loadMIF2Vocabulary();

		if (mif2VocabularyContentProvider.getMIFModel() != null) {
			TreeSelectionDialog dlg = new TreeSelectionDialog(shell, mif2VocabularyContentProvider.getMIFModel(), mif2VocabularyContentProvider, new Mif2VocabularyLabelProvider(shell.getDisplay()), "Select Constraint");

			dlg.setTitle("MIF2 Vocabulary Constraint Selection");

			// If Ok
			if (dlg.open() == Window.OK) {
				// and something selected
				if (dlg.getResult().length > 0) {
					// The results are the selection path reversed tree path - so the 0 index is the selected leaf
					// the next on index 1 is the parent of 0 and so on
					Object[] results = dlg.getResult();
					if (constraint.equals(Constraint.CONCEPTS)) {
						if (results[0] instanceof ConceptDomain) {
							constraintResult = new ConceptConstraint((ConceptDomain) results[0]);
						}
					} else if (constraint.equals(Constraint.CODESYSTEMS)) {
						if (results[0] instanceof Concept) {
							constraintResult = new CodeSystemConstraint((Concept) results[0], (ContextBinding) results[1]);
						}
					} else if (constraint.equals(Constraint.VALUESSETS)) {
						if (results[0] instanceof ValueSet) {
							constraintResult = new ValueSetConstraint((ValueSet) results[0]);
						}
					}
				}

			}

		} else {

			IPath mif2VocabularyPath = ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(Mif2VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH);

			if (mif2VocabularyPath != null) {
				MessageDialog.openInformation(shell, "MIF2 Vocabulary", "Unable to open MIF2 vocabulary source " + mif2VocabularyPath.toString());
			} else {
				MessageDialog.openInformation(shell, "MIF2 Vocabulary", "You must set path to MIF Vocaubulary using " + Mif2VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH + " in General Preferences, Workspace, Linked Resources  ");
			}

		}
		return constraintResult;
	}

}
