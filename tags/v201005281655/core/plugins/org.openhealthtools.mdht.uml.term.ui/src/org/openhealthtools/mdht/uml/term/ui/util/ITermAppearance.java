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
package org.openhealthtools.mdht.uml.term.ui.util;

import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;

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

}
