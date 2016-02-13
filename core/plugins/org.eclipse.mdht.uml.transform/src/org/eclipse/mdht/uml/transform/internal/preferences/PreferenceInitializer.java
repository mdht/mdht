/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson.
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
package org.eclipse.mdht.uml.transform.internal.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.internal.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IEclipsePreferences node = new DefaultScope().getNode(Activator.PLUGIN_ID);

		node.putBoolean(TransformerOptions.GENERATE_DOMAIN_INTERFACE, false);
		node.putBoolean(TransformerOptions.GENERATE_DOMAIN_CLASSES, false);
		node.putBoolean(TransformerOptions.INCLUDE_FIXED_VALUE_GETTERS, false);
		node.putBoolean(TransformerOptions.INCLUDE_INTERFACE_REALIZATION, false);
		node.putBoolean(TransformerOptions.USE_BUSINESS_NAMES, true);
	}

}
