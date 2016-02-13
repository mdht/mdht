/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.term.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.mdht.uml.term.ui.internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Actions
	// ==============================================================================

	public static String AddCodeSystemVersion_operation_title;

	public static String AddCodeSystemVersion_default_name;

	public static String AddValueSetVersion_operation_title;

	public static String AddValueSetVersion_default_name;

	public static String AddValueSetCode_operation_title;

	public static String AddValueSetCode_default_name;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
