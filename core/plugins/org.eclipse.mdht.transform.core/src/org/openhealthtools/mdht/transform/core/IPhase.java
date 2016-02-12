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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * A phase of a transformation. Each phase makes a pass over the input model, partitioning rules into distinct groups.
 */
public interface IPhase extends ITransformationComponent {
	/** The ID of the standard initialization phase. */
	String ID_INITIALIZATION = "org.openhealthtools.mdht.transform.core.init";

	/** The ID of the standard finalization phase. */
	String ID_FINALIZATION = "org.openhealthtools.mdht.transform.core.fini";

	ITransformation getTransformation();

	PhaseKind getKind();

	List<? extends IRule> getRules();

	IRule getRule(String id);

	void execute(Iterable<? extends EObject> inputs, ITransformMonitor monitor) throws TransformationException;
}
