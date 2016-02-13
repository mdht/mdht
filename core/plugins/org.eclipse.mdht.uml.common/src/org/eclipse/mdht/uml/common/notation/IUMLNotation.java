/*****************************************************************************
 * Copyright (c) 2009 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann TANGUY (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  David Carlson (XMLmodeling.com) - modified from Eclipse Papyrus source
 *
 *****************************************************************************/
package org.eclipse.mdht.uml.common.notation;

/**
 * Display style constants for UML diagram notation.
 */
public interface IUMLNotation {

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

	/** Style constant for carriage return in labels */
	public final static int DISP_MULTI_LINE = 1 << 20;

	/**
	 * Default UML property display.
	 */
	public final static int DEFAULT_UML_PROPERTY = DISP_DERIVE | DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY |
			DISP_DFLT_VALUE | DISP_MOFIFIERS;

	/**
	 * Default UML property annotations.
	 */
	public final static int DEFAULT_UML_PROPERTY_ANNOTATIONS = DISP_MOFIFIERS;

	/**
	 * Default UML class display.
	 */
	public final static int DEFAULT_UML_CLASS = DISP_VISIBILITY | DISP_NAME;

	/**
	 * Default UML class annotations.
	 */
	public final static int DEFAULT_UML_CLASS_ANNOTATIONS = DISP_MOFIFIERS;

}
