/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.actions;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class ReportConceptDomainsAction implements IObjectActionDelegate {
	protected IWorkbenchPart activePart;
	private List<NamedElement> elements = new ArrayList<NamedElement>();

	/** Comma-delimited log, suitable for import to spreadsheets. */
	private StringBuffer vocabularyReport = new StringBuffer();
	
	public ReportConceptDomainsAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			vocabularyReport = new StringBuffer();
			
			reportConceptDomains();
			
			saveReport();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		elements.clear();
		
		if (((IStructuredSelection)selection).size() >= 1) {
			for (Object selected : ((IStructuredSelection)selection).toList()) {
				if (selected instanceof IAdaptable) {
					selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
				}
				if (selected instanceof NamedElement) {
					elements.add((NamedElement) selected);
				}
			}
		}
		
		action.setEnabled(!elements.isEmpty());
	}


	private void reportConceptDomains() {
		UMLSwitch vocabulary = new UMLSwitch() {
			
			@Override
			public Object caseClass(Class clazz) {
				Stereotype choiceGroup = clazz.getAppliedStereotype(
				IHDFProfileConstants.HDF_PROFILE_NAME
						+ NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_GROUP);
				if (choiceGroup == null) {
					return null;
				}
				// choice group members may be in referenced CMETs
				List specializations = clazz.getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
				for (Iterator iter = specializations.iterator(); iter.hasNext();) {
					Generalization generalization = (Generalization) iter.next();
					Package memberPackage = generalization.getSpecific().getNearestPackage();
					if (clazz.getNearestPackage() != memberPackage
							&& !elements.contains(memberPackage)) {
						elements.add(memberPackage);
//							System.out.println("Adding choice CMET: " + memberPackage.getName());
					}
				}
				
				return super.caseClass(clazz);
			}

			@Override
			public Object caseProperty(Property property) {
//				Stereotype hdfAttr = property.getAppliedStereotype(
//						IHDFProfileConstants.HDF_PROFILE_NAME
//						+ NamedElement.SEPARATOR + IHDFProfileConstants.HDF_ATTRIBUTE);
//				if (hdfAttr != null) {
//					Enumeration domain = (Enumeration) property.getValue(hdfAttr, IHDFProfileConstants.VOCABULARY_DOMAIN);
//					EnumerationLiteral mnemonic = (EnumerationLiteral) property.getValue(hdfAttr, IHDFProfileConstants.VOCABULARY_DOMAIN_MNEMONIC);
//					if (domain != null || mnemonic != null) {
//						addVocabularyUse(property, 
//								domain != null ? domain.getName() : null, 
//								mnemonic != null ? mnemonic.getName() : null);
//					}
//				}
				
				// include all referenced CMETs in vocabulary report
				if (property.getType() != null) {
					Package typePackage = property.getType().getNearestPackage();
					if (property.getNearestPackage() != typePackage
							&& !elements.contains(typePackage)) {
						elements.add(typePackage);
//						System.out.println("Adding CMET: " + typePackage.getName());
					}
				}
				
				return property;
			}
		};

		int elementIndex = 0;
		while (elements.size() > elementIndex) {
			try {
				TreeIterator iterator = EcoreUtil.getAllContents(
						Collections.singletonList(elements.get(elementIndex)));
				while (iterator != null && iterator.hasNext()) {
					EObject child = (EObject) iterator.next();

					// add nested packages to the elements list
					if (child instanceof Package && !elements.contains(child)) {
						elements.add((Package)child);
//						System.out.println("Adding nested package: " + ((Package)child).getName());
					}
					else {
						vocabulary.doSwitch(child);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			elementIndex++;
		}
	}

	public String getVocabularyReport() {
		return vocabularyReport.toString();
	}
	
	protected void addVocabularyUse(NamedElement modelElement, String domainName, String mnemonic) {
		vocabularyReport.append(getPackageQualifiedName(modelElement));
		vocabularyReport.append(", ");
		vocabularyReport.append(domainName);
		if (mnemonic != null) {
			vocabularyReport.append(", ");
			vocabularyReport.append(mnemonic);
		}
		vocabularyReport.append(System.getProperty("line.separator"));
	}
	
	protected void saveReport() {
		NamedElement firstElement = elements.get(0);
		if (vocabularyReport.length() > 0) {
			URI reportURI = firstElement.eResource().getURI().trimFileExtension();
//			String fileName = reportURI.lastSegment();
			String fileName = firstElement.getName();
			reportURI = reportURI.trimSegments(1);
			reportURI = reportURI.appendSegment(fileName + "_vocabularyUse");
			reportURI = reportURI.appendFileExtension("txt");
			
			IPath reportPath = new Path(reportURI.toPlatformString(true));
			IFile reportFile = ResourcesPlugin.getWorkspace().getRoot().getFile(reportPath);
			try {
				ByteArrayInputStream input = new ByteArrayInputStream(vocabularyReport.toString().getBytes("UTF-8"));
				if (reportFile.exists()) {
					reportFile.setContents(input, IFile.FORCE, null);
				}
				else {
					reportFile.create(input, true, null);
				}
				reportFile.refreshLocal(IFile.DEPTH_ONE, null);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			IWorkbench workbench = PlatformUI.getWorkbench();
			IEditorDescriptor editorDescriptor = workbench.getEditorRegistry().getDefaultEditor(reportFile.getName());
			
			IEditorInput editorInput = new FileEditorInput(reportFile);
			try {
				IWorkbenchPage activePage = activePart.getSite().getPage();
				activePage.openEditor(editorInput, editorDescriptor.getId());
			} catch (PartInitException e) {
			}
		}
	}

	protected String getPackageQualifiedName(NamedElement namedElement) {
		if (namedElement.getName() == null)
			return null;
		
		StringBuffer qname = new StringBuffer(namedElement.getName());
		Element container = namedElement.getOwner();
		while (container instanceof NamedElement) {
			qname.insert(0, NamedElement.SEPARATOR);
			qname.insert(0, ((NamedElement)container).getName());
			if (container instanceof Package) {
				break;
			}
			container = container.getOwner();
		}
		return qname.toString();
	}
	
}
