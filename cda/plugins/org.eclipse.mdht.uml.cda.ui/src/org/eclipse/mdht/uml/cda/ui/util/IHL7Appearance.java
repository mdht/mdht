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
package org.eclipse.mdht.uml.cda.ui.util;

import org.eclipse.mdht.uml.common.notation.IUMLNotation;

/**
 * Display style constants for HL7 diagram notation.
 */
public interface IHL7Appearance extends IUMLNotation {

	/**
	 * Style constant for vocabulary binding display in labels.
	 */
	public final static int DISP_VOCABULARY = 1 << 9;

	/**
	 * Style constant for vocabulary binding display in labels.
	 */
	public final static int DISP_LENGTH_LIMITS = 1 << 10;

	/**
	 * Style constant for vocabulary binding display in labels.
	 */
	public final static int DISP_UPDATE_MODE = 1 << 11;

	/**
	 * Style constant for business name display in labels.
	 */
	public final static int DISP_BUSINESS_NAME = 1 << 12;

	/**
	 * Style constant for template ID display in labels.
	 */
	public final static int DISP_TEMPLATE_ID = 1 << 13;

	/**
	 * Style constant for template constraint display in labels.
	 */
	public final static int DISP_TEMPLATE_CONSTRAINTS = 1 << 14;

	/**
	 * Default HL7 class display.
	 */
	public final static int DEFAULT_HL7_CLASS = DISP_NAME;

	/**
	 * Default HL7 property display.
	 */
	public final static int DEFAULT_HL7_PROPERTY = DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY | DISP_DFLT_VALUE |
			DISP_VOCABULARY | DISP_UPDATE_MODE;

}
