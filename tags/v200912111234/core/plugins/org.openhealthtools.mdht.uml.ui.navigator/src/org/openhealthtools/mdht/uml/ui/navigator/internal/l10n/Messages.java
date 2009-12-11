/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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

package org.openhealthtools.mdht.uml.ui.navigator.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 * 
 * $Id: $
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.openhealthtools.mdht.uml.ui.navigator.internal.l10n.messages"; //$NON-NLS-1$

	public static String NavigatorGroupName_associations;

	public static String OpenModelAction_label;
	public static String OpenModelAction_errorTitle;
	public static String OpenModelAction_errorMessage;
	
	public static String CloseAllModelsAction_label;
	public static String CloseModelAction_label;
	public static String CloseModelAction_dialogTitle;
	public static String CloseModelAction_dialogMessage;
	public static String CloseModelAction_errorTitle;
	public static String CloseModelAction_errorMessage;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
