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
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.IPhase;
import org.eclipse.mdht.transform.core.IRule;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.ITransformation;
import org.eclipse.mdht.transform.core.PhaseKind;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;

/**
 * Default implementation of a transformation phase.
 */
public class Phase extends AbstractTransformComponent<PhaseKind> implements IPhase {
	private final ITransformation transformation;

	private final List<IRule> rules = new java.util.ArrayList<IRule>();

	public Phase(ITransformation transformation, String id, PhaseKind kind, String label) {
		super(id, kind, label);

		this.transformation = transformation;
		init(kind);
	}

	private void init(PhaseKind kind) {
		switch (kind) {
			case INITIALIZATION:
				// this needs to be the first rule, so that all subsequent rules see a fully-initialized context
				addRule(new InitializeContextRule());
				break;
			case FINALIZATION:
				// add a rule by default that saves the transformed model
				addRule(new SaveModelRule());
				break;
			default:
				addRule(new DepthFirstWalkRule());
				break;
		}
	}

	/**
	 * Initializes my rules. Overrides must call {@code super}.
	 */
	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);

		for (IRule next : rules) {
			try {
				next.initialize(ctx);
			} catch (AbortTransformationException e) {
				throw new TransformationException(
					String.format(
						"Transformation aborted in initialization of rule '%s' (%s).", next.getLabel(), next.getID()),
					e);
			} catch (RuntimeException e) {
				throw new TransformationException(
					String.format(
						"Uncaught exception in initialization of rule '%s' (%s).", next.getLabel(), next.getID()),
					e);
			}
		}
	}

	public ITransformation getTransformation() {
		return transformation;
	}

	public List<? extends IRule> getRules() {
		return Collections.unmodifiableList(rules);
	}

	public IRule getRule(String id) {
		IRule result = null;

		for (IRule next : rules) {
			if (next.getID().equals(id)) {
				result = next;
				break;
			}
		}

		return result;
	}

	public void execute(Iterable<? extends EObject> inputs, ITransformMonitor monitor) throws TransformationException {
		switch (getKind()) {
			case INITIALIZATION:
			case FINALIZATION:
				// these phases don't walk the model
				Iterator<? extends EObject> iter = inputs.iterator();
				if (iter.hasNext()) {
					EObject input = iter.next();
					for (IRule next : rules) {
						safeApply(next, input, monitor);
					}
				}
				break;
			default:
				for (EObject input : inputs) {
					for (EObject element = input; element != null;) {
						Iterator<IRule> ruleIter = rules.iterator();

						// the first is the walk rule. It gives us the element to work on
						element = (EObject) safeApply(ruleIter.next(), element, monitor);

						if (element != null) {
							while (ruleIter.hasNext()) {
								safeApply(ruleIter.next(), element, monitor);
							}
						}
					}
				}
				break;
		}
	}

	private static Object safeApply(IRule rule, EObject input, ITransformMonitor monitor)
			throws TransformationException {
		try {
			return rule.apply(input, monitor);
		} catch (AbortTransformationException e) {
			throw new TransformationException(
				String.format(
					"Transformation aborted in application of rule '%s' to '%s' (%s).", rule.getLabel(), input,
					rule.getID()),
				e);
		} catch (RuntimeException e) {
			throw new TransformationException(
				String.format(
					"Uncaught exception in application of rule '%s' to '%s' (%s).", rule.getLabel(), input,
					rule.getID()),
				e);
		}
	}

	//
	// Internal API
	//

	public final void addRule(IRule rule) {
		checkRule(rule);

		// find the place to insert the rule in the order
		ListIterator<IRule> iter = rules.listIterator();

		out: while (iter.hasNext()) {
			IRule cur = iter.next();

			if (rule.getID().equals(cur.getID())) {
				// replace this rule, if permitted
				if (rule.getKind() != cur.getKind()) {
					throw new IllegalArgumentException("Cannot replace a rule with a rule of a different kind.");
				}
				iter.set(rule);
				break out;
			} else if ((rule.getKind() == RuleKind.WALK) && (cur.getKind() == RuleKind.WALK)) {
				// can only have one walk rule
				iter.set(rule);
				break out;
			} else if (cur.getKind().ordinal() > rule.getKind().ordinal()) {
				// insert here
				iter.previous();
				iter.add(rule);
				break out;
			}
		}

		if (!iter.hasNext()) {
			// append
			iter.add(rule);
		}
	}

	private void checkRule(IRule rule) {
		switch (getKind()) {
			case INITIALIZATION:
				if (rule.getKind() != RuleKind.INITIALIZATION) {
					throw new IllegalArgumentException(
						"May only add initialization rules to the initialization phase.");
				}
				break;
			case FINALIZATION:
				switch (rule.getKind()) {
					case SAVE:
					case FINALIZATION:
						break;
					default:
						throw new IllegalArgumentException(
							"Mafy only add save and finalization rules to the finalization phase.");
				}
				break;
			default:
				// pass
				break;
		}

	}
}
