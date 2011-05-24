/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * An accessor class for externalized strings.
 * 
 * $Id: $
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.openhealthtools.mdht.uml.hdf.ui.internal.l10n.messages"; //$NON-NLS-1$

	public static String Conformance_I_label;

	public static String Conformance_NP_label;

	public static String Conformance_R_label;

	public static String VocabularyCodingStrength_CNE_label;

	public static String VocabularyCodingStrength_CWE_label;

	public static String RevisionFrequency_Edition_label;

	public static String RevisionFrequency_CodeSystem_label;

	public static String UpdateMode_A_label;

	public static String UpdateMode_D_label;

	public static String UpdateMode_R_label;

	public static String UpdateMode_AR_label;

	public static String UpdateMode_N_label;

	public static String UpdateMode_U_label;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
