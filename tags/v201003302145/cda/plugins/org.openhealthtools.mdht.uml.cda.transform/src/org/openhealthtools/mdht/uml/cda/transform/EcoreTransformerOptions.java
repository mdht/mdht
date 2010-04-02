/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.cda.transform.internal.Activator;

/**
 *
 */
public class EcoreTransformerOptions {

	public static final String INCLUDE_VOCABULARY_CONSTRAINTS = "includeVocabularyConstraints";
	
	private boolean includeVocabularyConstraints;
	
	// use Vector for a thread-safe synchronized List
	private List<Element> deletedElementList = new Vector<Element>();
	
	private PluginPropertiesUtil pluginPropertiesUtil = null;
	
	public EcoreTransformerOptions() {
		initializePreferences();
	}
	
	private void initializePreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		includeVocabularyConstraints = 
			store.getBoolean(INCLUDE_VOCABULARY_CONSTRAINTS);
	}

	public boolean isIncludeVocabularyConstraints() {
		return includeVocabularyConstraints;
	}

	public void setIncludeVocabularyConstraints(boolean includeVocabularyConstraints) {
		this.includeVocabularyConstraints = includeVocabularyConstraints;
	}

	protected List<Element> getDeletedElementList() {
		return deletedElementList;
	}
	
	protected PluginPropertiesUtil getPluginPropertiesUtil() {
		return pluginPropertiesUtil;
	}

	protected void setPluginPropertiesUtil(PluginPropertiesUtil util) {
		pluginPropertiesUtil = util;
	}

}
