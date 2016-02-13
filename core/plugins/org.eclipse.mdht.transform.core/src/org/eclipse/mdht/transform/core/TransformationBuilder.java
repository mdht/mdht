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

import org.eclipse.mdht.transform.core.impl.Transformation;

/**
 * <p>
 * A <i>Builder</i> of {@link ITransformation}s. Transformations initially contain
 * </p>
 * <ul>
 * <li>An {@linkplain #initialization() initialization} phase</li>
 * <li>An {@linkplain #finalization() finalization} phase</li>
 * </ul>
 *
 * @see PhaseBuilder
 * @see RuleBuilder
 */
public class TransformationBuilder {
	private final Transformation product;

	protected TransformationBuilder(ITransformation product) {
		this.product = (Transformation) product;
	}

	/**
	 * Creates a new transformation builder.
	 *
	 * @return the transformation builder
	 */
	public static TransformationBuilder create() {
		return new TransformationBuilder(new Transformation());
	}

	/**
	 * Creates a builder to edit an existing transformation.
	 *
	 * @param transformation
	 *            the transformation to edit
	 *
	 * @return the builder
	 */
	public static TransformationBuilder on(ITransformation transformation) {
		return new TransformationBuilder(transformation);
	}

	public PhaseBuilder phase(String id, String label) {
		return new PhaseBuilder(this, product, id, label);
	}

	public PhaseBuilder initialization() {
		return new PhaseBuilder(this, product.getInitialization());
	}

	/**
	 * Gets an builder to modify an existing phase.
	 *
	 * @param id
	 *            the phase ID to get. This phase must already exist
	 */
	public PhaseBuilder getPhase(String id) {
		return new PhaseBuilder(this, product.getPhase(id));
	}

	public PhaseBuilder finalization() {
		return new PhaseBuilder(this, product.getFinalization());
	}

	public ITransformation build() {
		return product;
	}
}
