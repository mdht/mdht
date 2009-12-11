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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import org.eclipse.core.runtime.Preferences;
import org.openhealthtools.mdht.uml.hdf2xsd.internal.Activator;

/**
 *
 */
public class XSDTransformerOptions {

	public static final String INCLUDE_VOCABULARY_CONSTRAINTS = "includeVocabularyConstraints";

	public static final String INCLUDE_EMPTY_ASSOCIATION_CLASSES = "includeEmptyAssociationClasses";
	
	private boolean includeVocabularyConstraints;
	private boolean includeEmptyAssociationClasses;
	
	public XSDTransformerOptions() {
		initializePreferences();
	}
	
	private void initializePreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		includeVocabularyConstraints = 
			store.getBoolean(INCLUDE_VOCABULARY_CONSTRAINTS);
		includeEmptyAssociationClasses = 
			store.getBoolean(INCLUDE_EMPTY_ASSOCIATION_CLASSES);
	}

	public boolean isIncludeVocabularyConstraints() {
		return includeVocabularyConstraints;
	}

	public void setIncludeVocabularyConstraints(boolean includeVocabularyConstraints) {
		this.includeVocabularyConstraints = includeVocabularyConstraints;
	}

	public boolean isIncludeEmptyAssociationClasses() {
		return includeEmptyAssociationClasses;
	}

	public void setIncludeEmptyAssociationClasses(
			boolean includeEmptyAssociationClasses) {
		this.includeEmptyAssociationClasses = includeEmptyAssociationClasses;
	}

}
