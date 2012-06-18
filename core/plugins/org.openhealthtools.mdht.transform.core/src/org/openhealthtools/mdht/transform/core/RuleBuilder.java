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

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.transform.core.impl.AbstractRule;
import org.openhealthtools.mdht.transform.core.impl.AbstractRuleFragment;
import org.openhealthtools.mdht.transform.core.impl.Phase;

/**
 * <p>
 * A <i>Builder</i> of {@link IRule}s. It is supplied by a {@link PhaseBuilder}. Rules initially have no fragments attached.
 * </p>
 * 
 * @see TransformationBuilder
 * @see PhaseBuilder
 */
public class RuleBuilder {
	private final PhaseBuilder parent;

	private AbstractRule product;

	RuleBuilder(PhaseBuilder parent, IRule rule) {
		this.parent = parent;
		this.product = (AbstractRule) rule;
	}

	RuleBuilder(PhaseBuilder parent, Phase phase, IRule rule) {
		this(parent, rule);

		if (rule.getPhase() == null) {
			phase.addRule(rule);
			this.product.setPhase(phase);
		} else if (rule.getPhase() != phase) {
			throw new IllegalArgumentException("Rule is already in a different phase: " + rule.getPhase().getID());
		}
	}

	RuleBuilder(PhaseBuilder parent, Phase phase, String id, RuleKind kind, String label) {
		this(parent, phase, new DelegatingRule(id, kind, label));
	}

	public RuleBuilder delegateTo(IRuleDelegate delegate) {
		if (!(product instanceof DelegatingRule)) {
			throw new IllegalStateException("Not creating a delegating rule.");
		}

		((DelegatingRule) product).setDelegate(delegate);

		return this;
	}

	public RuleBuilder fragment(IRuleFragment fragment) {
		product.addFragment(fragment);
		return this;
	}

	public RuleBuilder before(String label, IFragmentDelegate delegate) {
		return before("fragment$" + product.getRuleFragments().size(), label, delegate);
	}

	public RuleBuilder before(IFragmentDelegate delegate) {
		return before("Before " + product.getLabel(), delegate);
	}

	public RuleBuilder before(String id, String label, IFragmentDelegate delegate) {
		DelegatingFragment fragment = new DelegatingFragment(id, FragmentKind.BEFORE, label);
		fragment.setDelegate(delegate);
		return fragment(fragment);
	}

	public RuleBuilder after(IFragmentDelegate delegate) {
		return after("After " + product.getLabel(), delegate);
	}

	public RuleBuilder after(String label, IFragmentDelegate delegate) {
		return after("fragment$" + product.getRuleFragments().size(), label, delegate);
	}

	public RuleBuilder after(String id, String label, IFragmentDelegate delegate) {
		DelegatingFragment fragment = new DelegatingFragment(id, FragmentKind.AFTER, label);
		fragment.setDelegate(delegate);
		return fragment(fragment);
	}

	/**
	 * Finishes building the current rule and adds a sibling rule following me.
	 */
	public RuleBuilder rule(IRule rule) {
		checkRule();

		return parent.rule(rule);
	}

	/**
	 * Finishes building the current rule and adds a sibling rule following me.
	 */
	public RuleBuilder rule(String id, RuleKind kind, String label) {
		checkRule();

		return parent.rule(id, kind, label);
	}

	/**
	 * Finishes building the current rule and adds a sibling rule following me.
	 */
	public RuleBuilder rule(String id, RuleKind kind, String label, IRuleDelegate delegate) {
		checkRule();

		return parent.rule(id, kind, label).delegateTo(delegate);
	}

	/**
	 * Finishes building rules and returns to the transformation builder.
	 * 
	 * @return the transformation builder
	 */
	public TransformationBuilder done() {
		checkRule();

		return parent.done();
	}

	private void checkRule() {
		if (product instanceof DelegatingRule) {
			checkRule((DelegatingRule) product);
		}
	}

	private void checkRule(DelegatingRule rule) {
		if (rule.getDelegate() == null) {
			throw new IllegalStateException("Rule does not have a delegate.");
		}
	}

	//
	// Nested types
	//

	public static interface IRuleDelegate {
		Object apply(EObject input, ITransformContext ctx, ITransformMonitor monitor) throws TransformationException;
	}

	private static final class DelegatingRule extends AbstractRule {
		private IRuleDelegate delegate;

		DelegatingRule(String id, RuleKind kind, String label) {
			super(id, kind, label);
		}

		void setDelegate(IRuleDelegate delegate) {
			this.delegate = delegate;
		}

		IRuleDelegate getDelegate() {
			return delegate;
		}

		@Override
		protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
			return getDelegate().apply(input, getContext(), monitor);
		}
	}

	public static interface IFragmentDelegate {
		Object apply(EObject input, Object output, ITransformContext ctx, ITransformMonitor monitor)
				throws TransformationException;
	}

	private static final class DelegatingFragment extends AbstractRuleFragment {
		private IFragmentDelegate delegate;

		DelegatingFragment(String id, FragmentKind kind, String label) {
			super(id, kind, label);
		}

		void setDelegate(IFragmentDelegate delegate) {
			this.delegate = delegate;
		}

		IFragmentDelegate getDelegate() {
			return delegate;
		}

		public Object apply(EObject input, Object output, ITransformMonitor monitor) throws TransformationException {
			return getDelegate().apply(input, output, getContext(), monitor);
		}
	}
}
