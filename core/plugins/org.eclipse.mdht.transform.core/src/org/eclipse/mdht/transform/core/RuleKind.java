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
 * Enumeration of the functional roles of transformation rules.
 */
public enum RuleKind {
	/** A rule that directs the walking of the model. */
	WALK,
	/**
	 * A rule that initializes some part of the transformation's context (in the general sense, not necessarily just the {@link ITransformContext}.
	 */
	INITIALIZATION,
	/** A rule that actually does the transformation of an input element to some kind of output. */
	TRANSFORM,
	/** A rule that saves transformation outputs. Save rules run before {@linkplain #FINALIZATION finalization} rules. */
	SAVE,
	/** A rule that cleans up. Finalization rules run after {@linkplain #SAVE save} rules. */
	FINALIZATION;
}
