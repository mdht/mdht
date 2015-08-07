/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.notation;

import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;

/**
 * Display style constants for diagram notation and annotations.
 */
public interface INotationConstants extends IUMLNotation {

	/**
	 * Style constant for vocabulary binding display in labels.
	 */
	public final static int DISP_VOCABULARY = 1 << 9;

	/**
	 * Style constant for element ID display in labels.
	 */
	public final static int DISP_IDENTIFIER = 1 << 10;

	/**
	 * Style constant for displaying type choice list in labels.
	 */
	public final static int DISP_TYPE_CHOICE = 1 << 11;

	/**
	 * Default UML property display.
	 */
	public final static int DEFAULT_UML_PROPERTY = DISP_DERIVE | DISP_NAME | DISP_TYPE | DISP_MULTIPLICITY |
			DISP_DFLT_VALUE | DISP_MOFIFIERS;

}
