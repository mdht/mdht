/**
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   David A Carlson (XMLmodeling.com) - initial API and implementation
 *   
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.mif2uml.mapping;

import org.eclipse.core.runtime.Preferences;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.Activator;

/**
 *
 */
public class MIFImporterOptions {

	public static final String CREATE_ASSOCIATION_CLASSES = "createAssociationClasses";
	public static final String USE_PACKAGE_TITLE = "usePackageTitle";
	public static final String CREATE_STRUCTURAL_ATTRIBUTES = "createStructuralAttributes";
	public static final String USE_XHTML = "useXHTML";
	public static final String CREATE_FILE_PER_PACKAGE = "createFilePerPackage";
	public static final String SUPPRESS_DATATYPE_COLLECTIONS = "suppressDatatypeCollections";
	
	private boolean createAssociationClasses;
	private boolean usePackageTitle;
	private boolean createStructuralAttributes;
	private boolean useXHTML = false;
	private boolean createFilePerPackage;
	private boolean suppressDatatypeCollections;
	
	public MIFImporterOptions() {
		initializePreferences();
	}
	
	private void initializePreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		createAssociationClasses = 
			store.getBoolean(CREATE_ASSOCIATION_CLASSES);
		createStructuralAttributes = 
			store.getBoolean(CREATE_STRUCTURAL_ATTRIBUTES);
		createFilePerPackage = 
			store.getBoolean(CREATE_FILE_PER_PACKAGE);
		usePackageTitle = 
			store.getBoolean(USE_PACKAGE_TITLE);
		useXHTML = 
			store.getBoolean(USE_XHTML);
		suppressDatatypeCollections = 
			store.getBoolean(SUPPRESS_DATATYPE_COLLECTIONS);
	}

	public boolean isCreateAssociationClasses() {
		return createAssociationClasses;
	}

	public void setCreateAssociationClasses(boolean createAssociationClasses) {
		this.createAssociationClasses = createAssociationClasses;
	}

	public boolean isUsePackageTitle() {
		return usePackageTitle;
	}

	public void setUsePackageTitle(boolean usePackageTitle) {
		this.usePackageTitle = usePackageTitle;
	}

	public boolean isCreateStructuralAttributes() {
		return createStructuralAttributes;
	}

	public void setCreateStructuralAttributes(boolean createStructuralAttributes) {
		this.createStructuralAttributes = createStructuralAttributes;
	}

	public boolean isUseXHTML() {
		return useXHTML;
	}

	public void setUseXHTML(boolean useXHTML) {
		this.useXHTML = useXHTML;
	}

	public boolean isCreateFilePerPackage() {
		return createFilePerPackage;
	}

	public void setCreateFilePerPackage(boolean createFilePerPackage) {
		this.createFilePerPackage = createFilePerPackage;
	}

	public boolean isSuppressDatatypeCollections() {
		return suppressDatatypeCollections;
	}

	public void setSuppressDatatypeCollections(boolean suppressDatatypeCollections) {
		this.suppressDatatypeCollections = suppressDatatypeCollections;
	}

}
