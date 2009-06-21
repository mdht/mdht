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

import java.util.Collections;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
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
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch;
import org.openhealthtools.mdht.emf.w3c.xhtml.A;
import org.openhealthtools.mdht.emf.w3c.xhtml.B;
import org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote;
import org.openhealthtools.mdht.emf.w3c.xhtml.Br;
import org.openhealthtools.mdht.emf.w3c.xhtml.Caption;
import org.openhealthtools.mdht.emf.w3c.xhtml.Col;
import org.openhealthtools.mdht.emf.w3c.xhtml.Div;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Li;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Param;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tbody;
import org.openhealthtools.mdht.emf.w3c.xhtml.Td;
import org.openhealthtools.mdht.emf.w3c.xhtml.Th;
import org.openhealthtools.mdht.emf.w3c.xhtml.Thead;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.util.XhtmlSwitch;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hl7.ui.util.TreeSelectionDialog;

public class MIF2VocabularySelectionDelegate implements IVocabularySelectionDelegate {
	
	
	/**
	 * DocumentationSwitch 
	 *
	 */
	public static class DocumentationSwitch extends XhtmlSwitch<Object> {

		// Prefix to remove/add xhtml: prefix -currently not very efficient from
		// a string management point of view, might need to be addressed
		String prefix = "";

		/**
		 * MIF2CommentSwitch is a cut and past reuse of comment switch used in the import of mif2.
		 * TODO If documentation functionality on the tree viewer is generally accepted, need to refactor and reuse the comment switch in import package.
		 *
		 */
		private class MIF2CommentSwitch extends Mif2Switch<Object> {

			
			public Object caseFormalConstraint(FormalConstraint formalConstraint) {

				for (ComplexMarkupWithLanguage complexMarkupWithLanguage : formalConstraint.getCombinedText()) {
					processFeatureMap("", "", complexMarkupWithLanguage.getMixed());
				}

				for (FormalExpression formalExpression : formalConstraint.getAlternateFormalExpression()) {
					processFeatureMap("", "", formalExpression.getMixed());
				}

				return formalConstraint;
			}

			
			public Object caseComplexMarkupWithLanguage(ComplexMarkupWithLanguage object) {

				processFeatureMap("", "", object.getMixed());

				return object;
			}

			
			public Object caseDesignComment(DesignComment designComment) {
				return designComment;
			}

			
			public Object caseCascadableAnnotation(CascadableAnnotation object) {
				return object;
			}

			
			public Object caseFormalExpression(FormalExpression formal) {

				processFeatureMap("<" + prefix + "pre>", "</" + prefix + "pre>", formal.getMixed());

				return formal;
			}

			
			public Object defaultCase(EObject object) {
				// Go Boom - We have something in the MIF2 that was not
				// expected!
				System.err.println("Unexpected class " + object.getClass().getCanonicalName());
				throw new RuntimeException("Unexpected class " + object.getClass().getCanonicalName());
			}

		}

		MIF2CommentSwitch mif2CommentSwitch = new MIF2CommentSwitch();

		public String getComment() {
			return commentBuffer.toString();
		}

		public DocumentationSwitch() {
			super();
			commentBuffer.append(" ");
		}

		protected StringBuffer commentBuffer = new StringBuffer();

		public void appendComment(String comment) {
			commentBuffer.append(comment);
		}

		
		public Object caseObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object objectTag) {

			processFeatureMap("<" + prefix + "object name=\"" + objectTag.getName().toString() + "\">", "</" + prefix + "object>", objectTag.getMixed());
			return objectTag;
		}

		
		public Object caseB(B b) {
			processFeatureMap("<" + prefix + "code>", "</" + prefix + "code>", b.getMixed());

			return b;
		}

		
		public Object caseThead(Thead object) {
			return object;
		}

		
		public Object caseCol(Col object) {

			return object;
		}

		
		public Object caseCaption(Caption caption) {
			processFeatureMap("<" + prefix + "code>", "</" + prefix + "code>", caption.getMixed());
			return caption;
		}

		
		public Object caseTable(Table table) {

			String attributes = new String();
			if (table.getWidth() != null) {
				attributes += "width=\"" + table.getWidth() + "\" ";
			}

			if (table.getHl7Id() != null) {
				attributes += "hl7id=\"" + table.getHl7Id() + "\" ";
			}

			if (table.getBorder() != null) {
				attributes += "border=\"" + table.getBorder() + "\" ";
			}

			if (table.getCellpadding() != null) {
				attributes += "cellpadding=\"" + table.getCellpadding() + "\" ";
			}

			if (table.getCellspacing() != null) {
				attributes += "cellspacing=\"" + table.getCellspacing() + "\" ";
			}

			if (table.getStyle() != null) {
				attributes += "style=\"" + table.getStyle() + "\" ";
			}

			commentBuffer.append("<" + prefix + "table" + attributes + " >");

			processFeatureMap("<" + prefix + "caption>", "</" + prefix + "caption>", table.getCaption().getMixed());

			if (table.getThead() != null) {
				commentBuffer.append("<" + prefix + "thead>");
				for (Tr tr : table.getThead().getTr()) {
					commentBuffer.append("<" + prefix + "tr>");
					for (Th th : tr.getTh()) {
						processFeatureMap("<" + prefix + "th>", "</" + prefix + "th>", th.getMixed());

					}
					commentBuffer.append("</" + prefix + "tr>");
				}
				commentBuffer.append("</" + prefix + "thead>");
			}

			if (table.getTbody() != null) {
				for (Tbody tbody : table.getTbody()) {
					commentBuffer.append("<" + prefix + "tbody>");
					for (Tr tr : tbody.getTr()) {
						commentBuffer.append("<" + prefix + "tr>");
						for (Td td : tr.getTd()) {
							processFeatureMap("<" + prefix + "td>", "</" + prefix + "td>", td.getMixed());

						}
						commentBuffer.append("</" + prefix + "tr>");
					}
					commentBuffer.append("</" + prefix + "tbody>");
				}
			}

			if (table.getTfoot() != null) {
				commentBuffer.append("<" + prefix + "tfoot>");
				for (Tr tr : table.getTfoot().getTr()) {
					commentBuffer.append("<" + prefix + "tr>");
					for (Th th : tr.getTh()) {
						processFeatureMap("<" + prefix + "th>", "</" + prefix + "th>", th.getMixed());

					}
					commentBuffer.append("</" + prefix + "tr>");
				}
				commentBuffer.append("</" + prefix + "tfoot>");
			}

			commentBuffer.append("</" + prefix + "table>");

			return table;
		}


		
		public Object caseParam(Param object) {
			commentBuffer.append("<" + prefix + "param name=\"" + object.getName().toString() + "\" value=\"" + object.getValue().toString() + "\"/></" + prefix + "param>");
			return object;
		}

		
		public Object caseSub(Sub sub) {
			processFeatureMap("<" + prefix + "sub>", "</" + prefix + "sub>", sub.getMixed());
			return sub;
		}

		
		public Object caseSup(Sup sup) {
			processFeatureMap("<" + prefix + "sup>", "</" + prefix + "sup>", sup.getMixed());
			return sup;
		}

		
		public Object caseVar(Var object) {
			return object;
		}

		
		public Object caseImg(Img img) {
			return img;
		}

		
		public Object caseI(I i) {
			processFeatureMap("<" + prefix + "i>", "</" + prefix + "i>", i.getMixed());
			return i;
		}

		
		public Object caseLi(Li li) {
			processFeatureMap("<" + prefix + "li>", "</" + prefix + "li>", li.getMixed());
			return li;
		}

		
		public Object caseOl(Ol object) {
			processFeatureMap("<" + prefix + "ol>", "</" + prefix + "ol>", object.getLi());
			return object;
		}

		
		public Object caseTbody(Tbody object) {
			return object;
		}

		
		public Object caseTd(Td object) {
			return object;
		}

		
		public Object caseTh(Th object) {
			return object;
		}

		
		public Object caseTr(Tr object) {
			return object;
		}

		
		public Object casePre(Pre pre) {
			processFeatureMap("<" + prefix + "pre>", "</" + prefix + "pre>", pre.getMixed());
			return pre;
		}

		
		public Object caseSpan(Span span) {
			processFeatureMap("<" + prefix + "span>", "</" + prefix + "span>", span.getMixed());
			return span;
		}

		
		public Object caseBlockquote(Blockquote blockquote) {
			processFeatureMap("<" + prefix + "blockquote>", "</" + prefix + "blockquote>", blockquote.getMixed());
			return blockquote;
		}

		
		public Object caseA(A anchor) {
			processFeatureMap("<" + prefix + "a>", "</" + prefix + "a>", anchor.getMixed());
			return anchor;
		}

		
		public Object caseStrong(Strong strong) {
			processFeatureMap("<" + prefix + "strong>", "</" + prefix + "strong>", strong.getMixed());
			return strong;
		}

		
		public Object caseBr(Br br) {

			commentBuffer.append("</" + prefix + "br>");

			return br;
		}

		
		public Object caseUl(Ul ul) {
			processFeatureMap("<" + prefix + "ul>", "</" + prefix + "ul>", ul.getLi());
			return ul;
		}

		private void processFeatureMap(String startTag, String endTag, FeatureMap featureMap) {
			for (FeatureMap.Entry entry : featureMap) {
				if (entry.getValue() instanceof String) {
					commentBuffer.append(entry.getValue());
				} else {
					this.doSwitch((EObject) entry.getValue());
				}
			}
		}

		
		public Object caseP(P paragraph) {

			processFeatureMap("<" + prefix + "p>", "</" + prefix + "p>", paragraph.getMixed());

			return paragraph;
		}

		
		public Object caseDiv(Div div) {
			processFeatureMap("<" + prefix + "div title=\" " + div.getTitle() + " \" >", "</" + prefix + "div>", div.getMixed());

			return div;
		}

		
		public Object defaultCase(EObject object) {
			mif2CommentSwitch.doSwitch(object);
			return object;
		}

	}
	
	
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
		 * @author eclipse
		 *
		 */
		public class HelpSwitch extends Mif2Switch<Object>
		{

			public String getHelp()
			{
				return documentationSwitch.getComment();				
			}
			 DocumentationSwitch documentationSwitch = new DocumentationSwitch();
			 
			
			public Object caseCodeSystem(CodeSystem codeSystem) {

			
				if ((codeSystem.getAnnotations() != null) &&
					(codeSystem.getAnnotations().getDocumentation() != null) &&
					(codeSystem.getAnnotations().getDocumentation().getDescription() != null) && 
					(codeSystem.getAnnotations().getDocumentation().getDescription().getText().size() > 0)) {
					for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections

					.singletonList(codeSystem.getAnnotations().getDocumentation().getDescription())); iterator.hasNext();) {

						EObject child = (EObject) iterator.next();

						if (child instanceof ComplexMarkupWithLanguage) {
							documentationSwitch.doSwitch(child);
						}
						if (child instanceof FormalConstraint) {
							documentationSwitch.doSwitch(child);
						}
					}

				} else {
					documentationSwitch.appendComment("No definition for "+codeSystem.getName());					
				}
				
				
				
				return codeSystem;
			}

			
			public Object caseConceptDomain(ConceptDomain conceptDomain) {

				if ( (conceptDomain.getAnnotations() != null) && 
					 (conceptDomain.getAnnotations().getDocumentation() != null) && 
					 (conceptDomain.getAnnotations().getDocumentation().getDefinition() != null) && 
					 (conceptDomain.getAnnotations().getDocumentation().getDefinition().getText().size() > 0) ) {
					for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections

					.singletonList(conceptDomain.getAnnotations().getDocumentation().getDefinition())); iterator.hasNext();) {

						EObject child = (EObject) iterator.next();

						if (child instanceof ComplexMarkupWithLanguage) {
							documentationSwitch.doSwitch(child);
						}
						if (child instanceof FormalConstraint) {
							documentationSwitch.doSwitch(child);
						}
					}

				}else {
					documentationSwitch.appendComment("No definition for "+conceptDomain.getName());					
				}

				return conceptDomain;
			}

			
			public Object caseValueSet(ValueSet valueSet) {
				

				if ( (valueSet.getAnnotations() != null) &&
					 (valueSet.getAnnotations().getDocumentation() != null) &&
					 (valueSet.getAnnotations().getDocumentation().getDescription() != null) && 
					 (valueSet.getAnnotations().getDocumentation().getDescription().getText().size() > 0) ) {
					for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections

					.singletonList(valueSet.getAnnotations().getDocumentation().getDescription())); iterator.hasNext();) {

						EObject child = (EObject) iterator.next();

						if (child instanceof ComplexMarkupWithLanguage) {
							documentationSwitch.doSwitch(child);
						}
						if (child instanceof FormalConstraint) {
							documentationSwitch.doSwitch(child);
						}
					}

				} else {
					documentationSwitch.appendComment("No definition for "+valueSet.getName());					
				}
				
				return valueSet;
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
				MessageDialog.openInformation(shell, "HL7 Vocabulary Definition", "GENERAL HELP FOR HL7 Vocabulary Browser");
			}

			
			
		
			  
			  
			  
			
		}
		
	}


	/**
	 * Implementations of Vocabulary Constraint Interfaces used by Vocabulary Extension Delegate
	 *
	 */
	static public class ConceptConstraint implements IConceptConstraint {

		String concept;

		public ConceptConstraint(ConceptDomain conceptdomain) {
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

		public CodeSystemConstraint(CodeSystem codeSystem) {

			codePrintName = codeSystem.getName();
			systemOid = codeSystem.getCodeSystemId();

			
			// If there is a released version and there is a date associated with it
			// Get the xml format of the date which appears to be  yyyy-mm-dd
			if (!codeSystem.getReleasedVersion().isEmpty() && 
				 codeSystem.getReleasedVersion().get(0).getReleaseDate() != null) {
				systemVersion = codeSystem.getReleasedVersion().get(0).getReleaseDate().toXMLFormat();

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

		public ValueSetConstraint(ContextBinding contextBinding, ValueSet valueSet) {

			id = valueSet.getId();

			name = valueSet.getName();

			if (contextBinding != null) {
				versionDate = contextBinding.getEffectiveDate().toString();

				codingStrength = contextBinding.getCodingStrength().getLiteral();
			}

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

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate#chooseVocabularyConstraint(org.eclipse.swt.widgets.Shell, org.eclipse.uml2.uml.Property, org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.Constraint)
	 */
	public IVocabularyConstraint chooseVocabularyConstraint(Shell shell, Property property, Constraint constraint) {

		IVocabularyConstraint constraintResult = null;

		Mif2VocabularyContentProvider mif2VocabularyContentProvider = new Mif2VocabularyContentProvider(property, constraint);
		
		Cursor originalCursor = shell.getCursor();
		
		shell.setCursor(shell.getDisplay().getSystemCursor(SWT.CURSOR_WAIT));
	
		mif2VocabularyContentProvider.loadMIF2Vocabulary();
		
		shell.setCursor(originalCursor);
		
		if (mif2VocabularyContentProvider.getMIFModel() != null) {
			TreeSelectionDialog treeSelectionDialog = new TreeSelectionDialog(shell, mif2VocabularyContentProvider.getMIFModel(), mif2VocabularyContentProvider, new Mif2VocabularyLabelProvider(
					shell.getDisplay()), "Select Constraint");

			String realm = null;
			Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property.getNearestPackage(), IHDFProfileConstants.HDF_PACKAGE);
			if (stereotype != null) {
				realm = (String) property.getNearestPackage().getValue(stereotype, IHDFProfileConstants.PACKAGE_REALM_NAMESPACE);
			}

			treeSelectionDialog.setTitle("MIF2 Vocabulary Constraint (Realm=\"" + realm + "\")");

			
			// Set the initial selection - if any
			if (constraint.equals(Constraint.CONCEPTS)) {
				treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getConceptDomainSelection());
			} else if (constraint.equals(Constraint.CODESYSTEMS)) {
				treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getCodeSystemSelection());
			}
			if (constraint.equals(Constraint.VALUESSETS)) {
				treeSelectionDialog.setInitialSelections(mif2VocabularyContentProvider.getValueSetSelection());
			}
		
			
			// Set the help listener
			VocabularyHelp vocabularyHelp = new VocabularyHelp(shell,treeSelectionDialog);
			
			treeSelectionDialog.setHelpListener(vocabularyHelp);

			// Open dialog and if ok result and something selected - create the vocabulary constraints 
			if (treeSelectionDialog.open() == Window.OK && treeSelectionDialog.getResult() != null) {
				// and something selected
				if (treeSelectionDialog.getResult().length > 0) {
					// The results are the selection path reversed tree path -
					// so the 0 index is the selected leaf
					// the next on index 1 is the parent of 0 and so on
					Object[] results = treeSelectionDialog.getResult();
					if (constraint.equals(Constraint.CONCEPTS)) {
						if (results[0] instanceof ConceptDomain) {
							constraintResult = new ConceptConstraint((ConceptDomain) results[0]);
						}
					} else if (constraint.equals(Constraint.CODESYSTEMS)) {
						if (results[0] instanceof CodeSystem) {
							constraintResult = new CodeSystemConstraint((CodeSystem) results[0]);
						}
					} else if (constraint.equals(Constraint.VALUESSETS)) {
						if (results[0] instanceof ValueSet) {
							ValueSet valueSet = (ValueSet) results[0];
							ContextBinding contextBinding = mif2VocabularyContentProvider.getActiveBinding(valueSet);
							constraintResult = new ValueSetConstraint(contextBinding, valueSet);

						}
					}
				}

			}

		} else {

			IPath mif2VocabularyPath = ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(Mif2VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH);

			if (mif2VocabularyPath != null) {
				MessageDialog.openInformation(shell, "MIF2 Vocabulary", "Unable to open MIF2 vocabulary source " + mif2VocabularyPath.toString());
			} else {
				MessageDialog.openInformation(shell, "MIF2 Vocabulary", "You must set path to MIF Vocaubulary using " + Mif2VocabularyContentProvider.HL7_MIF2_VOCABULARY_PATH
						+ " in General Preferences, Workspace, Linked Resources  ");
			}

		}
		return constraintResult;
	}

}
