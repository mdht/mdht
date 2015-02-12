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
package org.openhealthtools.mdht.transform.core.impl;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.transform.core.IPhase;
import org.openhealthtools.mdht.transform.core.ITransformContext;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.ITransformation;
import org.openhealthtools.mdht.transform.core.NullTransformMonitor;
import org.openhealthtools.mdht.transform.core.PhaseKind;
import org.openhealthtools.mdht.transform.core.TransformationException;

/**
 * Default implementation of a transformation.
 */
public class Transformation implements ITransformation {
	private final List<IPhase> phases = new java.util.ArrayList<IPhase>(4);

	private boolean initialized;

	public Transformation() {
		phases.add(new Phase(this, IPhase.ID_INITIALIZATION, PhaseKind.INITIALIZATION, "Initialize"));
		phases.add(new Phase(this, IPhase.ID_FINALIZATION, PhaseKind.FINALIZATION, "Clean up"));
	}

	/**
	 * Initializes my phases. Overrides must call {@code super}.
	 */
	public void initialize() throws TransformationException {
		if (!initialized) {
			initialized = true;

			ITransformContext ctx = new TransformContext();

			for (IPhase next : phases) {
				try {
					next.initialize(ctx);
				} catch (AbortTransformationException e) {
					throw new TransformationException(
						String.format(
							"Transformation aborted in initialization of phase '%s' (%s).", next.getLabel(),
							next.getID()), e);
				} catch (RuntimeException e) {
					throw new TransformationException(String.format(
						"Uncaught exception in initialization of phase '%s' (%s).", next.getLabel(), next.getID()), e);
				}
			}
		}
	}

	public List<? extends IPhase> getPhases() {
		return Collections.unmodifiableList(phases);
	}

	public IPhase getPhase(String id) {
		IPhase result = null;

		for (IPhase next : phases) {
			if (next.getID().equals(id)) {
				result = next;
				break;
			}
		}

		return result;
	}

	public IPhase getInitialization() {
		IPhase result = null;

		for (IPhase next : phases) {
			if (next.getKind() == PhaseKind.INITIALIZATION) {
				result = next;
				break;
			}
		}

		return result;
	}

	public IPhase getFinalization() {
		IPhase result = null;

		for (IPhase next : phases) {
			if (next.getKind() == PhaseKind.FINALIZATION) {
				result = next;
				break;
			}
		}

		return result;
	}

	public void execute(EObject input, ITransformMonitor monitor) throws TransformationException {
		execute(Collections.singleton(input), monitor);
	}

	public void execute(Iterable<? extends EObject> inputs, ITransformMonitor monitor) throws TransformationException {
		if (monitor == null) {
			monitor = new NullTransformMonitor();
		}

		initialize();

		for (IPhase next : phases) {
			try {
				next.execute(inputs, monitor);
			} catch (AbortTransformationException e) {
				throw new TransformationException(String.format(
					"Transformation aborted in execution of phase '%s' (%s).", next.getLabel(), next.getID()), e);
			} catch (RuntimeException e) {
				throw new TransformationException(String.format(
					"Uncaught exception in execution of phase '%s' (%s).", next.getLabel(), next.getID()), e);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append(getClass().getSimpleName()).append('(');
		boolean comma = false;
		for (IPhase next : phases) {
			if (comma) {
				result.append(", ");
			} else {
				comma = true;
			}

			result.append(next.getKind()).append('(');
			result.append(next.getLabel());
			result.append(')');
		}
		result.append(')');

		return result.toString();
	}

	//
	// Internal API
	//

	public void addPhase(IPhase phase) {
		switch (phase.getKind()) {
			case INITIALIZATION:
				// we can only have one initialization phase
				phases.set(0, phase);
				break;
			case FINALIZATION:
				// we can only have one finalization phase
				phases.set(phases.size() - 1, phase);
				break;
			default:
				ListIterator<IPhase> iter = phases.listIterator();

				out: while (iter.hasNext()) {
					IPhase cur = iter.next();

					if (phase.getID().equals(cur.getID())) {
						// replace this phase, if permitted
						switch (cur.getKind()) {
							case INITIALIZATION:
							case FINALIZATION:
								throw new IllegalArgumentException(
									"Cannot replace init or fini phase with a phase of a different kind.");
							default:
								iter.set(phase);
								break out;
						}
					} else if (cur.getKind() == PhaseKind.FINALIZATION) {
						// insert before the finalization phase
						iter.previous();
						iter.add(phase);
						break out;
					}
				}
				break;
		}
	}
}
