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
package org.openhealthtools.mdht.uml.cda.ui.util;

/**
 * Display style constants for HL7 diagram notation.
 */
public interface IHL7Appearance {

	/**
	 * Style constant for visibility display in labels.
	 */
	public final static int DISP_VISIBILITY = 1 << 1;

	/**
	 * Style constant for isDerive display in labels.
	 */
	public final static int DISP_DERIVE = 1 << 2;

	/**
	 * Style constant for name display in labels.
	 */
	public final static int DISP_NAME = 1 << 3;

	/**
	 * Style constant for type display in labels.
	 */
	public final static int DISP_TYPE = 1 << 4;

	/**
	 * Style constant for multiplicity display in labels.
	 */
	public final static int DISP_MULTIPLICITY = 1 << 5;

	/**
	 * Style constant for default value display in labels.
	 */
	public final static int DISP_DFLT_VALUE = 1 << 6;

	/**
	 * Style constant for modifiers display in labels.
	 */
	public final static int DISP_MOFIFIERS = 1 << 7;

	/**
	 * Style constant for stereotype display in labels.
	 */
	public final static int DISP_STEREOTYPES = 1 << 8;

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

	

	/** Style constant for carriage return in labels */
	public final static int DISP_MULTI_LINE = 1 << 20;

	/**
	 * Default UML property display.
	 */
	public final static int DEFAULT_UML_PROPERTY = DISP_VISIBILITY | DISP_DERIVE | DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY | DISP_DFLT_VALUE | DISP_MOFIFIERS;

	/**
	 * Default HL7 property display.
	 */
	public final static int DEFAULT_HL7_PROPERTY = DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY | DISP_DFLT_VALUE | DISP_VOCABULARY | DISP_UPDATE_MODE;

}
