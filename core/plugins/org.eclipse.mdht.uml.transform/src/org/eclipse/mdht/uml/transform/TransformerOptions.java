/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson.
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
package org.eclipse.mdht.uml.transform;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.runtime.Platform;
import org.eclipse.mdht.uml.transform.internal.Activator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 *
 */
public class TransformerOptions {

	public static final String GENERATE_DOMAIN_INTERFACE = "generateDomainInterface";

	public static final String GENERATE_DOMAIN_CLASSES = "generateDomainClasses";

	public static final String GENERATE_BUILDER_CLASSES = "generateBuilderClasses";

	public static final String GENERATE_CONSOLIDATED_MODEL = "generateConsolidatedModel";

	public static final String INCLUDE_INTERFACE_REALIZATION = "includeInterfaceRealization";

	public static final String INCLUDE_FIXED_VALUE_GETTERS = "includeFixedValueGetters";

	public static final String INCLUDE_BASE_MODEL = "includeBaseModel";

	public static final String USE_BUSINESS_NAMES = "useBusinessNames";

	public static final String DOMAIN_BASE_PACKAGE = "domainBasePackage";

	public static final String DOMAIN_PACKAGE_NAME = "domainPackageName";

	public static final String DOMAIN_NSURI = "domainNsURI";

	private boolean generateDomainInterface;

	private boolean generateDomainClasses;

	private boolean generateBuilderClasses;

	private boolean generateConsolidatedModel;

	private boolean includeFixedValueGetters;

	private boolean includeInterfaceRealization;

	private boolean includeBaseModel;

	private boolean useBusinessNames;

	private String domainModelPath;

	private String domainBasePackage;

	private String domainPackageName;

	private String domainNsURI;

	private String outputModelPath;

	private String vocabModelPath;

	private Package domainInterfacePackage;

	// use Vector for a thread-safe synchronized List
	private List<Element> deletedElementList = new Vector<Element>();

	private PluginPropertiesUtil pluginPropertiesUtil = null;

	public TransformerOptions() {
		initializePreferences();
	}

	private void initializePreferences() {
		generateDomainInterface = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, GENERATE_DOMAIN_INTERFACE, false, null);
		generateDomainClasses = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, GENERATE_DOMAIN_CLASSES, false, null);
		generateBuilderClasses = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, GENERATE_BUILDER_CLASSES, false, null);
		generateConsolidatedModel = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, GENERATE_CONSOLIDATED_MODEL, false, null);
		includeFixedValueGetters = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, INCLUDE_FIXED_VALUE_GETTERS, false, null);
		includeInterfaceRealization = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, INCLUDE_INTERFACE_REALIZATION, false, null);
		includeBaseModel = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, INCLUDE_BASE_MODEL, false, null);
		useBusinessNames = Platform.getPreferencesService().getBoolean(
			Activator.PLUGIN_ID, USE_BUSINESS_NAMES, true, null);
	}

	public boolean isGenerateDomainInterface() {
		return generateDomainInterface;
	}

	public void setGenerateDomainInterface(boolean generateDomainInterface) {
		this.generateDomainInterface = generateDomainInterface;
	}

	public boolean isIncludeFixedValueGetters() {
		return includeFixedValueGetters;
	}

	public void setIncludeFixedValueGetters(boolean includeFixedValueGetters) {
		this.includeFixedValueGetters = includeFixedValueGetters;
	}

	public boolean isIncludeInterfaceRealization() {
		return includeInterfaceRealization;
	}

	public void setIncludeInterfaceRealization(boolean includeInterfaceRealization) {
		this.includeInterfaceRealization = includeInterfaceRealization;
	}

	public boolean isGenerateDomainClasses() {
		return generateDomainClasses;
	}

	public void setGenerateDomainClasses(boolean generateDomainClasses) {
		this.generateDomainClasses = generateDomainClasses;
	}

	public boolean isIncludeBaseModel() {
		return includeBaseModel;
	}

	public void setIncludeBaseModel(boolean includeBaseModel) {
		this.includeBaseModel = includeBaseModel;
	}

	public boolean isUseBusinessNames() {
		return useBusinessNames;
	}

	public void setUseBusinessNames(boolean useBusinessNames) {
		this.useBusinessNames = useBusinessNames;
	}

	public List<Element> getDeletedElementList() {
		return deletedElementList;
	}

	public PluginPropertiesUtil getPluginPropertiesUtil() {
		return pluginPropertiesUtil;
	}

	public void setPluginPropertiesUtil(PluginPropertiesUtil util) {
		pluginPropertiesUtil = util;
	}

	public String getOutputModelPath() {
		return outputModelPath;
	}

	public void setOutputModelPath(String outputModelPath) {
		this.outputModelPath = outputModelPath;
	}

	public String getVocabModelPath() {
		return vocabModelPath;
	}

	public void setVocabModelPath(String vocabModelPath) {
		this.vocabModelPath = vocabModelPath;
	}

	public Package getDomainInterfacePackage() {
		return domainInterfacePackage;
	}

	public void setDomainInterfacePackage(Package domainInterfacePackage) {
		this.domainInterfacePackage = domainInterfacePackage;
	}

	public String getDomainModelPath() {
		return domainModelPath;
	}

	public void setDomainModelPath(String domainModelPath) {
		this.domainModelPath = domainModelPath;
	}

	public String getDomainBasePackage() {
		return domainBasePackage;
	}

	public void setDomainBasePackage(String domainBasePackage) {
		this.domainBasePackage = domainBasePackage;
	}

	public String getDomainPackageName() {
		return domainPackageName;
	}

	public void setDomainPackageName(String domainPackageName) {
		this.domainPackageName = domainPackageName;
	}

	public String getDomainNsURI() {
		return domainNsURI;
	}

	public void setDomainNsURI(String domainNsURI) {
		this.domainNsURI = domainNsURI;
	}

	public boolean isGenerateConsolidatedModel() {
		return generateConsolidatedModel;
	}

	public void setGenerateConsolidatedModel(boolean generateConsolidatedModel) {
		this.generateConsolidatedModel = generateConsolidatedModel;
	}

	public boolean isGenerateBuilderClasses() {
		return generateBuilderClasses;
	}

	public void setGenerateBuilderClasses(boolean generateBuilderClasses) {
		this.generateBuilderClasses = generateBuilderClasses;
	}

}
