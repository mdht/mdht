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
package org.openhealthtools.mdht.transform.core;

import org.openhealthtools.mdht.transform.core.impl.Phase;
import org.openhealthtools.mdht.transform.core.impl.Transformation;

/**
 * <p>
 * A <i>Builder</i> of {@link IPhase}s. It is supplied by a {@link TransformationBuilder}. Phases initialially contain
 * </p>
 * <ul>
 * <li>An {@linkplain RuleKind#INITIALIZATION initialization} rule that creates the {@linkplain ITransformContext transform context}, if it is an
 * {@linkplain PhaseKind#INITIALIZATION initialization} phase</li>
 * <li>A {@linkplain RuleKind#WALK walk} rule, if it is a {@linkplain PhaseKind#TRANSFORM transform} phase</li>
 * <li>A {@linkplain RuleKind#SAVE save} rule, if it is a {@linkplain PhaseKind#FINALIZATION finalization} phase</li>
 * </ul>
 * 
 * @see TransformationBuilder
 * @see RuleBuilder
 */
public class PhaseBuilder {
	private final TransformationBuilder parent;

	private Phase product;

	PhaseBuilder(TransformationBuilder parent, Transformation transformation, String id, String label) {
		this(parent, new Phase(transformation, id, PhaseKind.TRANSFORM, label));

		transformation.addPhase(product);
	}

	PhaseBuilder(TransformationBuilder parent, IPhase phase) {
		this.parent = parent;
		this.product = (Phase) phase;
	}

	public RuleBuilder rule(IRule rule) {
		return new RuleBuilder(this, product, rule);
	}

	public RuleBuilder rule(String id, RuleKind kind, String label) {
		return new RuleBuilder(this, product, id, kind, label);
	}

	/**
	 * Gets an builder to modify an existing rule.
	 * 
	 * @param id
	 *            the rule ID to get. This rule must already exist
	 */
	public RuleBuilder getRule(String id) {
		return new RuleBuilder(this, product.getRule(id));
	}

	/**
	 * Finishes building the current phase and adds a sibling phase following me.
	 */
	public PhaseBuilder phase(String id, String label) {
		return parent.phase(id, label);
	}

	/**
	 * Finishes building phases and returns to the transformation builder.
	 * 
	 * @return the transformation builder
	 */
	public TransformationBuilder done() {
		return parent;
	}
}
