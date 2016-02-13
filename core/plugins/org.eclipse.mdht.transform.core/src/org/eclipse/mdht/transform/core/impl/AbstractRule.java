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
package org.eclipse.mdht.transform.core.impl;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.IPhase;
import org.eclipse.mdht.transform.core.IRule;
import org.eclipse.mdht.transform.core.IRuleFragment;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.ITransformation;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;

/**
 * A partial implementation of the {@link IRule} protocol.
 */
public abstract class AbstractRule extends AbstractTransformComponent<RuleKind> implements IRule {
	private IPhase phase;

	private List<IRuleFragment> fragments;

	private int firstAfter;

	public AbstractRule(String id, RuleKind kind, String label) {
		this(null, id, kind, label);
	}

	public AbstractRule(IPhase phase, String id, RuleKind kind, String label) {
		super(id, kind, label);

		this.phase = phase;
	}

	/**
	 * Initializes my fragments. Overrides must call {@code super}.
	 */
	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);

		if (fragments != null) {
			for (IRuleFragment next : fragments) {
				next.initialize(ctx);
			}
		}
	}

	public IPhase getPhase() {
		return phase;
	}

	public ITransformation getTransformation() {
		return getPhase().getTransformation();
	}

	public List<? extends IRuleFragment> getRuleFragments() {
		return (fragments == null)
				? Collections.<IRuleFragment> emptyList()
				: Collections.unmodifiableList(fragments);
	}

	public IRuleFragment getFragment(String id) {
		IRuleFragment result = null;

		if (fragments != null) {
			for (IRuleFragment next : fragments) {
				if (next.getID().equals(id)) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	public List<? extends IRuleFragment> getBefores() {
		return (fragments == null)
				? Collections.<IRuleFragment> emptyList()
				: Collections.unmodifiableList(fragments.subList(0, firstAfter));
	}

	public List<? extends IRuleFragment> getAfters() {
		return (fragments == null)
				? Collections.<IRuleFragment> emptyList()
				: Collections.unmodifiableList(fragments.subList(firstAfter, fragments.size()));
	}

	public Object apply(EObject input, ITransformMonitor monitor) throws TransformationException {
		Object result = null;

		if (fragments == null) {
			// simple case
			result = doApply(input, monitor);
		} else {
			for (IRuleFragment next : getBefores()) {
				Object output = next.apply(input, input, monitor);
				if (output instanceof EObject) {
					// the fragment changed the rule's input
					input = (EObject) output;
				}
			}

			result = doApply(input, monitor);

			for (IRuleFragment next : getAfters()) {
				result = next.apply(input, result, monitor);
			}
		}

		return result;
	}

	protected abstract Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException;

	//
	// Internal API
	//

	public void setPhase(IPhase phase) {
		if (this.phase != null) {
			throw new IllegalStateException("Rule already has a phase.");
		}

		this.phase = phase;
	}

	public void addFragment(IRuleFragment fragment) {
		boolean add = true;

		if (fragments == null) {
			fragments = new java.util.ArrayList<IRuleFragment>(3);
		} else {
			// replace an existing fragment?
			for (ListIterator<IRuleFragment> iter = fragments.listIterator(); iter.hasNext();) {
				IRuleFragment cur = iter.next();

				if (fragment.getID().equals(cur.getID())) {
					// replace this rule, if permitted
					if (fragment.getKind() != cur.getKind()) {
						throw new IllegalArgumentException(
							"Cannot replace a rule fragment with a fragment of a different kind.");
					}

					iter.set(fragment);
					add = false;
					break;
				}
			}
		}

		if (add) {
			// stack up befores and append afters
			switch (fragment.getKind()) {
				case BEFORE:
					fragments.add(0, fragment);
					firstAfter++;
					break;
				case AFTER:
					fragments.add(fragment);
					break;
			}
		} // else we replaced an existing fragment
	}
}
