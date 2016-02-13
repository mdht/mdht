/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.transform.core;

/**
 * Common protocol of the constituents of a transformation.
 */
public interface ITransformationComponent {
	/**
	 * Obtains a string that uniquely identifies me.
	 *
	 * @return my unique identifier
	 */
	String getID();

	/**
	 * Obtains a label for diagnostic output or other purposes, which is suitable for presentation to the user.
	 *
	 * @return my label
	 */
	String getLabel();

	/**
	 * Initializes me, to prepare for execution.
	 *
	 * @param ctx
	 *            the current transformation context
	 *
	 * @throws TransformationException
	 *             if I cannot be initialized correctly and the transformation is not viable
	 */
	void initialize(ITransformContext ctx) throws TransformationException;
}
