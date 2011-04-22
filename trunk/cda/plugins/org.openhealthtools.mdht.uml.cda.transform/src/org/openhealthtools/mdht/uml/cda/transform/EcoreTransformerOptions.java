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
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.runtime.Platform;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.internal.Activator;

/**
 *
 */
public class EcoreTransformerOptions {

	public static final String GENERATE_DOMAIN_INTERFACE = "generateDomainInterface";
	public static final String INCLUDE_FIXED_VALUE_GETTERS = "includeFixedValueGetters";
	public static final String INCLUDE_INTERFACE_REALIZATION = "includeInterfaceRealization";
	
	private boolean generateDomainInterface;
	private boolean includeFixedValueGetters;
	private boolean includeInterfaceRealization;
	
	// use Vector for a thread-safe synchronized List
	private List<Element> deletedElementList = new Vector<Element>();
	
	private Package domainInterfacePackage;
	
	private PluginPropertiesUtil pluginPropertiesUtil = null;
	
	public EcoreTransformerOptions() {
		initializePreferences();
	}
	
	private void initializePreferences() {
		generateDomainInterface = Platform.getPreferencesService().getBoolean(
				Activator.PLUGIN_ID, GENERATE_DOMAIN_INTERFACE, false, null);
		includeFixedValueGetters = Platform.getPreferencesService().getBoolean(
				Activator.PLUGIN_ID, INCLUDE_FIXED_VALUE_GETTERS, false, null);
		includeInterfaceRealization = Platform.getPreferencesService().getBoolean(
				Activator.PLUGIN_ID, INCLUDE_INTERFACE_REALIZATION, false, null);
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

	protected List<Element> getDeletedElementList() {
		return deletedElementList;
	}
	
	protected PluginPropertiesUtil getPluginPropertiesUtil() {
		return pluginPropertiesUtil;
	}

	protected void setPluginPropertiesUtil(PluginPropertiesUtil util) {
		pluginPropertiesUtil = util;
	}

	public Package getDomainInterfacePackage() {
		return domainInterfacePackage;
	}

	public void setDomainInterfacePackage(Package domainInterfacePackage) {
		this.domainInterfacePackage = domainInterfacePackage;
	}

}
