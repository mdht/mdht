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
package org.openhealthtools.mdht.uml.cda.dita;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.dita.internal.Activator;

/**
 *
 */
public class DitaTransformerOptions {

	public static final String BASE_URL = "baseURL";

	public static final String INCLUDE_TABLE_VIEW = "includeTableView";

	public static final String INCLUDE_VOCABULARY_CONSTRAINTS = "includeVocabularyConstraints";

	private IPath outputPath = null;

	private String baseURL = null;

	private boolean includeTableView = false;

	private boolean includeVocabularyConstraints = false;

	private List<EPackage> ePackages = new Vector<EPackage>();

	// use Vector for a thread-safe synchronized List
	private List<Element> deletedElementList = new Vector<Element>();

	private Map<Package, List<String>> packageContentMap = new HashMap<Package, List<String>>();

	private List<String> documentList = new Vector<String>();

	private List<String> sectionList = new Vector<String>();

	private List<String> clinicalStatementList = new Vector<String>();

	private List<String> classList = new Vector<String>();

	private List<String> valueSetList = new Vector<String>();

	private List<Classifier> pubClassifiers = new Vector<Classifier>();

	public DitaTransformerOptions() {
		initializePreferences();
	}

	private void initializePreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		if (store.getString(BASE_URL) != null && store.getString(BASE_URL).length() > 0) {
			baseURL = store.getString(BASE_URL);
		}
		includeTableView = store.getBoolean(INCLUDE_TABLE_VIEW);
		includeVocabularyConstraints = store.getBoolean(INCLUDE_VOCABULARY_CONSTRAINTS);
	}

	public boolean isIncludeTableView() {
		return includeTableView;
	}

	public void setIncludeTableView(boolean includeTableView) {
		this.includeTableView = includeTableView;
	}

	public boolean isIncludeVocabularyConstraints() {
		return includeVocabularyConstraints;
	}

	public void setIncludeVocabularyConstraints(boolean includeVocabularyConstraints) {
		this.includeVocabularyConstraints = includeVocabularyConstraints;
	}

	public String getBaseURL() {
		return baseURL;
	}

	public void setBaseURL(String url) {
		this.baseURL = url;
	}

	public IPath getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(IPath path) {
		this.outputPath = path;
		if (!outputPath.hasTrailingSeparator()) {
			outputPath = outputPath.addTrailingSeparator();
		}
	}

	protected List<Classifier> getPubClassifiers() {
		return pubClassifiers;
	}

	protected List<Element> getDeletedElementList() {
		return deletedElementList;
	}

	protected Map<Package, List<String>> getPackageContentMap() {
		return packageContentMap;
	}

	protected List<String> getPackageContentList(Package pkg) {
		List<String> contentList = packageContentMap.get(pkg);
		if (contentList == null) {
			contentList = new Vector<String>();
			packageContentMap.put(pkg, contentList);
		}
		return contentList;
	}

	protected List<String> getDocumentList() {
		return documentList;
	}

	protected List<String> getSectionList() {
		return sectionList;
	}

	protected List<String> getClinicalStatementList() {
		return clinicalStatementList;
	}

	protected List<String> getClassList() {
		return classList;
	}

	protected List<String> getValueSetList() {
		return valueSetList;
	}

	public List<EPackage> getEPackages() {
		return ePackages;
	}

	public void setEPackages(List<EPackage> packages) {
		this.ePackages = packages;
	}

	public void addEPackage(Class<EPackage> ePackageClass) {
		try {
			EPackage ePackage = (EPackage) ePackageClass.getField("eINSTANCE").get(null);
			ePackages.add(ePackage);
		} catch (Exception e) {
			// ignore, leave as null
		}
	}

}
