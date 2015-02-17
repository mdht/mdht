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
package org.openhealthtools.mdht.uml.hl7.mif2uml.mapping;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.uml2.uml.Model;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelElement;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer.MIFProcessor;

public class MIFImporter {

	private MIFProcessor mifProcessor;

	public MIFImporter() {
		mifProcessor = new MIFProcessor();
	}

	public Model getUMLModel() {
		return mifProcessor.getUMLModel();
	}

	public void setUMLModel(Model model) {
		mifProcessor.setUMLModel(model);
	}

	public void processMIF(ModelElement modelElement) {
		mifProcessor.transformElement(modelElement);
	}

	public Diagnostic getDiagnostics() {
		return mifProcessor.getDiagnostics();
	}

	public String getVocabularyErrors() {
		return mifProcessor.getVocabularyErrors();
	}

	public void setCreateAssociationClasses(boolean create) {
		mifProcessor.setCreateAssociationClasses(create);
	}

	public void setCreateStructuralAttributes(boolean create) {
		mifProcessor.setCreateStructuralAttributes(create);
	}

	public void setCreateFilePerPackage(boolean create) {
		mifProcessor.setCreateFilePerPackage(create);
	}

	public void setUsePackageTitle(boolean usePackageTitle) {
		mifProcessor.setUsePackageTitle(usePackageTitle);
	}

	public void setUseXHTML(boolean useXHTML) {
		mifProcessor.setUseXHTML(useXHTML);
	}

	public void setSuppressDatatypeCollections(boolean suppress) {
		mifProcessor.setSuppressDatatypeCollections(suppress);
	}

	/**
	 * Import contents of a MIF model into an existing UML package.
	 */
	// public void processMIFContent(PackageBase mifModel, Package umlPackage) {
	// mifProcessor.importPackageContent(mifModel, umlPackage);
	// }

}
