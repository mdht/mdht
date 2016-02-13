/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sarp Kaya (NEHTA)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.dita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.mdht.uml.cda.dita.internal.Activator;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 *
 */
public class DitaTransformerOptions {

	public static final String BASE_URL = "baseURL";

	public static final String INCLUDE_TABLE_VIEW = "includeTableView";

	public static final String INCLUDE_USAGE_NOTES = "includeUsageNotes";

	public static final String INCLUDE_VOCABULARY_CONSTRAINTS = "includeVocabularyConstraints";

	public static final String CARDINALITY_AFTER_ELEMENT = "cardinalityAfterElement";

	public static final String APPEND_CONFORMANCE_RULES_ATTRIBUTE = "appendConformanceRules";

	public static final String EXAMPLE_DEPTH = "exampleDepth";

	private IPath outputPath = null;

	private String baseURL = null;

	private boolean includeTableView = false;

	private boolean includeUsageNotes = false;

	private boolean cardinalityAfterElement = false;

	private boolean appendConformanceRules = false;

	private boolean noVerticalLinesInTables;

	private boolean includeVocabularyConstraints = false;

	private boolean reset = false;

	/**
	 * @return the reset
	 */
	public boolean isReset() {
		return reset;
	}

	/**
	 * @param reset
	 *            the reset to set
	 */
	public void setReset(boolean reset) {
		this.reset = reset;
	}

	private int exampleDepth;

	/**
	 * @return the exampleDepth
	 */
	public int getExampleDepth() {
		return exampleDepth;
	}

	/**
	 * @param exampleDepth
	 *            the exampleDepth to set
	 */
	public void setExampleDepth(int exampleDepth) {
		this.exampleDepth = exampleDepth;
	}

	private List<EPackage> ePackages = new Vector<EPackage>();

	// use Vector for a thread-safe synchronized List
	private List<Element> deletedElementList = new Vector<Element>();

	private Map<Package, List<String>> packageContentMap = new HashMap<Package, List<String>>();

	private List<String> documentList = new Vector<String>();

	private List<String> sectionList = new Vector<String>();

	private List<String> clinicalStatementList = new Vector<String>();

	private List<String> classList = new Vector<String>();

	private List<String> valueSetList = new Vector<String>();

	private HashMap<String, String> referenceList = new HashMap<String, String>();

	private List<Classifier> pubClassifiers = new Vector<Classifier>();

	private String xmlGeneratorType = null;

	public DitaTransformerOptions() {
		initializePreferences();
	}

	private void initializePreferences() {
		Preferences store = Activator.getDefault().getPluginPreferences();

		if (store.getString(BASE_URL) != null && store.getString(BASE_URL).length() > 0) {
			baseURL = store.getString(BASE_URL);
		}
		includeTableView = store.getBoolean(INCLUDE_TABLE_VIEW);
		includeUsageNotes = store.getBoolean(INCLUDE_USAGE_NOTES);
		includeVocabularyConstraints = store.getBoolean(INCLUDE_VOCABULARY_CONSTRAINTS);
		cardinalityAfterElement = store.getBoolean(CARDINALITY_AFTER_ELEMENT);
		appendConformanceRules = store.getBoolean(APPEND_CONFORMANCE_RULES_ATTRIBUTE);

		exampleDepth = store.getInt(EXAMPLE_DEPTH);

	}

	public boolean isIncludeUsageNotes() {
		return includeUsageNotes;
	}

	public boolean isCardinalityAfterElement() {
		return cardinalityAfterElement;
	}

	/**
	 * The value of the appendConformanceRule attribute in the dita-transform ant task xml
	 *
	 * @return appendConformanceRules
	 */
	public boolean isAppendConformanceRules() {
		return appendConformanceRules;
	}

	/**
	 * The value of the noVerticalLinesInTables attribute in the dita-transform ant task xml
	 * If set, use <br>
	 *
	 * {@code
	 *
	<table frame="topbot" rowsep="1">
	 * } <br>
	 * instead of <br>
	 * {@code
	 *
	<table frame="all" rowsep="1" colsep="1">
	 *  }
	 *
	 * @return appendConformanceRules
	 */
	public boolean isNoVerticalLinesInTables() {
		return noVerticalLinesInTables;
	}

	public boolean isIncludeTableView() {
		return includeTableView;
	}

	public void setIncludeTableView(boolean includeTableView) {
		this.includeTableView = includeTableView;
	}

	public void setIncludeUsageNotes(boolean includeUsageNotes) {
		this.includeUsageNotes = includeUsageNotes;
	}

	public void setCardinalityAfterElement(boolean cardinalityAfterElement) {
		this.cardinalityAfterElement = cardinalityAfterElement;
	}

	public void setXmlGeneratorType(String xmlGeneratorType) {
		this.xmlGeneratorType = xmlGeneratorType;
	}

	public String getXmlGeneratorType() {
		return this.xmlGeneratorType;
	}

	/**
	 * @param appendConformanceRules
	 *            should the Dita transformation append conformance rules
	 */
	public void setAppendConformanceRules(boolean appendConformanceRules) {
		this.appendConformanceRules = appendConformanceRules;
	}

	/**
	 * @param noVerticalLinesInTables
	 *            should the Dita transformer disable vertical lines in tables
	 */
	public void setNoVerticalLinesInTables(Boolean noVerticalLinesInTables) {
		this.noVerticalLinesInTables = noVerticalLinesInTables;

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

	protected void addReference(String key, String value) {

		if (!referenceList.containsKey(key)) {
			referenceList.put(key, value);
		}

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

	/**
	 * @return
	 */
	public List<String> getReferencesList() {
		List<String> ls = new ArrayList<String>();
		ls.addAll(referenceList.values());
		return ls;
	}

}
