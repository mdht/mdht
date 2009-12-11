/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 * 
 * $Id: $
 */
public class UIMessages extends NLS {

	private static final String BUNDLE_NAME = "org.openhealthtools.mhdt.uml.hl7.ui.internal.l10n.messages"; //$NON-NLS-1$

	public static String ConsoleName_default;

	public static String ModelSave_task;
	public static String FileSaveError;

	static {
		NLS.initializeMessages(BUNDLE_NAME, UIMessages.class);
	}
}
