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
 * Enumeration of the functional roles of transformation phases.
 */
public enum PhaseKind {
	/** The initialization phase, to set up the transformation before actually doing it. */
	INITIALIZATION,
	/** A phase that does part of the work of the model transformation. */
	TRANSFORM,
	/** A phase that saves the outputs of the transformation and then cleans up. */
	FINALIZATION;
}
