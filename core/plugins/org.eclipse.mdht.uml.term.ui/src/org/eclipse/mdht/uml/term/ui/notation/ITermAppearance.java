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
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.notation;

import org.eclipse.mdht.uml.common.notation.IUMLNotation;

/**
 * Display style constants for diagram notation and annotations.
 */
public interface ITermAppearance extends IUMLNotation {

	/**
	 * Style constant for vocabulary binding display in labels.
	 */
	public final static int DISP_VOCABULARY = 1 << 9;

	/**
	 * Style constant for template ID display in labels.
	 */
	public final static int DISP_IDENTIFIER = 1 << 10;

	/**
	 * Default UML property display.
	 */
	public final static int DEFAULT_UML_PROPERTY = DISP_DERIVE | DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY |
			DISP_DFLT_VALUE | DISP_MOFIFIERS;

}
