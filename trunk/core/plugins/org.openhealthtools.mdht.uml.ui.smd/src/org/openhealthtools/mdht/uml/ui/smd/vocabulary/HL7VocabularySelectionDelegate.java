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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.HelpEvent;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate;
import org.openhealthtools.mdht.uml.ui.smd.util.TreeSelectionDialog;

public class HL7VocabularySelectionDelegate implements IVocabularySelectionDelegate {

	/**
	 * VocabularyHelp uses the help event to display the current documentation
	 * on the node selected. This is not typical used of the help feature and
	 * will proable need to change event accordingly.
	 * 
	 */
	static public class VocabularyHelp implements HelpListener {

		Shell shell;

		TreeSelectionDialog treeSelectionDialog;

		/**
		 * HelpSwitch fires correct documentation switch
		 * 
		 * @author eclipse
		 * 
		 */
		public class HelpSwitch extends VocabularymetamodelSwitch<Object> {

			String helpContent = "";

			public String getHelp() {
				return helpContent;
			}

			/*
			 * <valueSets xmi:type="vocab:HL7ValueSet" xmi:id="_z_E8AdW6Ed6UEa6sU6uJ5w" name="AcknowledgementDetailCode"
			 * id="2.16.840.1.113883.1.11.19638">
			 * <content xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8AtW6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <unionWithContents xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8A9W6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <codeSets xmi:type="vocab:HL7SimpleCodeSet" xmi:id="_z_E8BNW6Ed6UEa6sU6uJ5w"
			 * codes="_z-j-VNW6Ed6UEa6sU6uJ5w _z-j-TtW6Ed6UEa6sU6uJ5w _z-j-UdW6Ed6UEa6sU6uJ5w _z-j-SNW6Ed6UEa6sU6uJ5w _z-j-S9W6Ed6UEa6sU6uJ5w"/>
			 * </unionWithContents>
			 * <unionWithContents xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8BdW6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <codeSets xmi:type="vocab:HL7ValueSetReferenceCodeSet" xmi:id="_z_E8BtW6Ed6UEa6sU6uJ5w" valueSet="_z_E8DNW6Ed6UEa6sU6uJ5w"/>
			 * </unionWithContents>
			 * <unionWithContents xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8B9W6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <unionWithContents xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8CNW6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <codeSets xmi:type="vocab:HL7ValueSetReferenceCodeSet" xmi:id="_z_E8CdW6Ed6UEa6sU6uJ5w" valueSet="_z_E8D9W6Ed6UEa6sU6uJ5w"/>
			 * </unionWithContents>
			 * <excludeContents xmi:type="vocab:HL7ContentDefinition" xmi:id="_z_E8CtW6Ed6UEa6sU6uJ5w" codeSystem="_z-j-D9W6Ed6UEa6sU6uJ5w">
			 * <codeSets xmi:type="vocab:HL7SimpleCodeSet" xmi:id="_z_E8C9W6Ed6UEa6sU6uJ5w" codes="_z-j-LdW6Ed6UEa6sU6uJ5w"/>
			 * </excludeContents>
			 * </unionWithContents>
			 * </content>
			 * </valueSets>
			 * 
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.util.VocabularymetamodelSwitch#caseHL7ValueSet(org.openhealthtools
			 * .hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ValueSet)
			 */
			@Override
			public Object caseHL7ValueSet(HL7ValueSet object) {

				StringBuffer sb = new StringBuffer();

				sb.append(object.getName() + " Codes \n");
				if (object.getContent() != null) {
					for (HL7ContentDefinition cd : object.getContent().getUnionWithContents()) {

						for (HL7CodeSet cs : cd.getCodeSets()) {
							if (cs instanceof HL7SimpleCodeSet) {
								for (HL7Code c : ((HL7SimpleCodeSet) cs).getCodes()) {
									sb.append(c.getCode() + "\n");
								}

							}

							if (cs instanceof HL7ValueSetReferenceCodeSet) {
								sb.append("+ " + ((HL7ValueSetReferenceCodeSet) cs).getValueSet().getName() + "\n");

							}

						}

					}
					for (HL7CodeSet cs : object.getContent().getCodeSets()) {

						if (cs instanceof HL7ChildCodeSet) {

							{
								sb.append(((HL7ChildCodeSet) cs).getCode().getCode() + "\n");
							}

						}
						// for (HL7Concept c : cs.getContainedConcepts())
						// {
						// for (String name : c.getPrintNames() )
						// {
						// sb.append(name);
						// }
						// // sb.add
						// }

					}

				}

				helpContent = sb.toString();

				return object;
			}

			@Override
			public Object defaultCase(EObject object) {
				helpContent = "No Help Available";
				return object;
			}

		}

		public VocabularyHelp(Shell shell, TreeSelectionDialog treeSelectionDialog) {
			super();
			this.shell = shell;
			this.treeSelectionDialog = treeSelectionDialog;
		}

		public void helpRequested(HelpEvent e) {

			ITreeSelection selection = (ITreeSelection) treeSelectionDialog.getViewer().getSelection();

			if (!selection.isEmpty()) {
				TreePath treePath = selection.getPaths()[0];

				Object selectedNode = treePath.getLastSegment();

				HelpSwitch helpSwitch = new HelpSwitch();
				if (selectedNode instanceof EObject) {

					helpSwitch.doSwitch((EObject) selectedNode);
				}

				MessageDialog.openInformation(shell, "HL7 Vocabulary Definition", helpSwitch.getHelp());

			} else {
				MessageDialog.openInformation(
					shell, "HL7 Vocabulary Definition", "GENERAL HELP FOR HL7 Vocabulary Browser");
			}

		}

	}

	/**
	 * Implementations of Vocabulary Constraint Interfaces used by Vocabulary Extension Delegate
	 * 
	 */
	static public class ConceptConstraint implements IConceptConstraint {

		String concept;

		public ConceptConstraint(HL7ConceptDomain conceptdomain) {
			super();
			this.concept = conceptdomain.getName();
		}

		public String getConcept() {

			return concept;
		}

	}

	static public class CodeSystemConstraint implements ICodeSystemConstraint {

		String code;

		String codePrintName;

		String systemName;

		String systemOid;

		String systemVersion;

		public CodeSystemConstraint(HL7CodeSystem codeSystem, HL7Concept concept) {

			this.systemName = codeSystem.getName();

			this.systemOid = codeSystem.getId();

			if (concept != null) {
				// If code list has at least one - pop first one
				if (concept.getCodes().size() >= 1) {
					this.code = concept.getCodes().get(0).getCode();
				}

				if (concept.getPrintNames().size() >= 1) {
					this.codePrintName = concept.getPrintNames().get(0);
				}
			}

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

		public ValueSetConstraint(HL7ValueSet valueSet) {

			id = valueSet.getId();

			name = valueSet.getName();

			// if (contextBinding != null) {
			// versionDate = contextBinding.getEffectiveDate().toString();
			//
			// codingStrength = contextBinding.getCodingStrength().getLiteral();
			// }

		}

		String id;

		String name;

		String versionDate;

		String codingStrength;

		String rootCode;

		String revisionFrequency;

		public String getID() {

			return id;
		}

		public String getName() {

			return name;
		}

		public String getVersionDate() {

			return versionDate;
		}

		public String getCodingStrength() {

			return codingStrength;
		}

		public String getRevisionFrequency() {

			return revisionFrequency;
		}

		public String getRootCode() {

			return rootCode;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate#chooseVocabularyConstraint(org.eclipse.swt.widgets.Shell,
	 * org.eclipse.uml2.uml.Property, org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.Constraint)
	 */
	public IVocabularyConstraint chooseVocabularyConstraint(Shell shell, Property property, Constraint constraint) {

		IVocabularyConstraint constraintResult = null;

		HL7VocabularyContentProvider.BROWSEFILTER = constraint;

		HL7VocabularyContentProvider hl7smdVocabularyContentProvider = new HL7VocabularyContentProvider();

		Cursor originalCursor = shell.getCursor();

		shell.setCursor(shell.getDisplay().getSystemCursor(SWT.CURSOR_WAIT));

		hl7smdVocabularyContentProvider.loadMIF2Vocabulary();

		shell.setCursor(originalCursor);

		if (hl7smdVocabularyContentProvider.getHL7VocabularyModel() != null) {

			TreeSelectionDialog treeSelectionDialog = new TreeSelectionDialog(
				shell, hl7smdVocabularyContentProvider.getHL7VocabularyModel(), hl7smdVocabularyContentProvider,
				new HL7VocabularyLabelProvider(shell.getDisplay()), "Select Constraint");

			// // Set the help listener
			VocabularyHelp vocabularyHelp = new VocabularyHelp(shell, treeSelectionDialog);
			//
			treeSelectionDialog.setHelpListener(vocabularyHelp);

			if (treeSelectionDialog.open() == Window.OK && treeSelectionDialog.getResult() != null) {

				if (treeSelectionDialog.getResult().length > 0) {
					// The results are the selection path reversed tree path -
					// so the 0 index is the selected leaf
					// the next on index 1 is the parent of 0 and so on
					Object[] results = treeSelectionDialog.getResult();
					if (constraint.equals(Constraint.CONCEPTS)) {

						constraintResult = new ConceptConstraint((HL7ConceptDomain) results[0]);

						// if (results[0] instanceof ConceptDomain) {
						// constraintResult = new ConceptConstraint((ConceptDomain) results[0]);
						// }
					} else if (constraint.equals(Constraint.CODESYSTEMS)) {

						switch (results.length) {
							case 1:
								constraintResult = new CodeSystemConstraint((HL7CodeSystem) results[0], null);
								break;
							case 2:
								constraintResult = new CodeSystemConstraint(
									(HL7CodeSystem) results[1], (HL7Concept) results[0]);
								break;
						}

						// TODO - ugly refactor SWM
						// if (results[0] instanceof CodeSystem) {
						// constraintResult = new CodeSystemConstraint((CodeSystem) results[0], null);
						// } else if (results[0] instanceof Concept) {
						// constraintResult = new CodeSystemConstraint((CodeSystem) results[1], (Concept) results[0]);
						// } else if (results[0] instanceof CodeSystemSupplement) {
						// constraintResult = new CodeSystemConstraint((CodeSystemSupplement) results[0], null);
						// } else if (results[0] instanceof ConceptSupplement) {
						// constraintResult = new CodeSystemConstraint((CodeSystemSupplement) results[1], (ConceptSupplement) results[0]);
						// }
					} else if (constraint.equals(Constraint.VALUESSETS)) {
						if (results[0] instanceof HL7ValueSet) {
							constraintResult = new ValueSetConstraint((HL7ValueSet) results[0]);
						}

						// if (results[0] instanceof ValueSet) {
						// ValueSet valueSet = (ValueSet) results[0];
						// ContextBinding contextBinding = mif2VocabularyContentProvider.getActiveBinding(valueSet);
						// constraintResult = new ValueSetConstraint(contextBinding, valueSet);
						//
						// }
					}
				}

			}
		}

		//
		// if (mif2VocabularyContentProvider.getHL7VocabularyModel() != null) {
		// TreeSelectionDialog treeSelectionDialog = new TreeSelectionDialog(shell, mif2VocabularyContentProvider.getHL7VocabularyModel(),
		// mif2VocabularyContentProvider, new HL7VocabularyLabelProvider(
		// shell.getDisplay()), "Select Constraint");
		//
		// String realm = null;
		// Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property.getNearestPackage(), IHDFProfileConstants.HDF_PACKAGE);
		// if (stereotype != null) {
		// realm = (String) property.getNearestPackage().getValue(stereotype, IHDFProfileConstants.PACKAGE_REALM_NAMESPACE);
		// }
		//
		// treeSelectionDialog.setTitle("MIF2 Vocabulary Constraint (Realm=\"" + realm + "\")");
		//
		//
		// // Set the initial selection - if any
		// if (constraint.equals(Constraint.CONCEPTS)) {
		// treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getConceptDomainSelection());
		// } else if (constraint.equals(Constraint.CODESYSTEMS)) {
		// treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getCodeSystemSelection());
		// }
		// if (constraint.equals(Constraint.VALUESSETS)) {
		// treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getValueSetSelection());
		// }
		//
		//
		// // Set the help listener
		// VocabularyHelp vocabularyHelp = new VocabularyHelp(shell,treeSelectionDialog);
		//
		// treeSelectionDialog.setHelpListener(vocabularyHelp);
		//
		// // Open dialog and if ok result and something selected - create the vocabulary constraints
		// if (treeSelectionDialog.open() == Window.OK && treeSelectionDialog.getResult() != null) {
		// // and something selected
		// if (treeSelectionDialog.getResult().length > 0) {
		// // The results are the selection path reversed tree path -
		// // so the 0 index is the selected leaf
		// // the next on index 1 is the parent of 0 and so on
		// Object[] results = treeSelectionDialog.getResult();
		// if (constraint.equals(Constraint.CONCEPTS)) {
		// if (results[0] instanceof ConceptDomain) {
		// constraintResult = new ConceptConstraint((ConceptDomain) results[0]);
		// }
		// } else if (constraint.equals(Constraint.CODESYSTEMS)) {
		//
		//
		// // TODO - ugly refactor SWM
		// if (results[0] instanceof CodeSystem) {
		// constraintResult = new CodeSystemConstraint((CodeSystem) results[0], null);
		// } else if (results[0] instanceof Concept) {
		// constraintResult = new CodeSystemConstraint((CodeSystem) results[1], (Concept) results[0]);
		// } else if (results[0] instanceof CodeSystemSupplement) {
		// constraintResult = new CodeSystemConstraint((CodeSystemSupplement) results[0], null);
		// } else if (results[0] instanceof ConceptSupplement) {
		// constraintResult = new CodeSystemConstraint((CodeSystemSupplement) results[1], (ConceptSupplement) results[0]);
		// }
		//
		//
		// } else if (constraint.equals(Constraint.VALUESSETS)) {
		// if (results[0] instanceof ValueSet) {
		// ValueSet valueSet = (ValueSet) results[0];
		// ContextBinding contextBinding = mif2VocabularyContentProvider.getActiveBinding(valueSet);
		// constraintResult = new ValueSetConstraint(contextBinding, valueSet);
		//
		// }
		// }
		// }
		//
		// }
		//
		// } else {
		//
		// IPath mif2VocabularyPath =
		// ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(HL7VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH);
		//
		// if (mif2VocabularyPath != null) {
		// MessageDialog.openInformation(shell, "MIF2 Vocabulary", "Unable to open MIF2 vocabulary source " + mif2VocabularyPath.toString());
		// } else {
		// MessageDialog.openInformation(shell, "MIF2 Vocabulary", "You must set path to MIF Vocaubulary using " +
		// HL7VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH
		// + " in General Preferences, Workspace, Linked Resources  ");
		// }
		//
		// }
		return constraintResult;
	}

	@Override
	public boolean isConfigured() {
		boolean configured = false;

		IPath smdVocabularyPath = ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(
			HL7VocabularyContentProvider.HL7_SMD_VOCABULARY_PATH);

		if (smdVocabularyPath != null) {
			configured = true;
		}
		return configured;
	}

}
