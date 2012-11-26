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
 * The protocol of a model transformation.
 */
public interface ITransformation {
	void initialize() throws TransformationException;

	List<? extends IPhase> getPhases();

	IPhase getPhase(String id);

	/**
	 * Obtains the standard {@linkplain IPhase#ID_INITIALIZATION initialization} phase.
	 * 
	 * @return my initialization phase
	 */
	IPhase getInitialization();

	/**
	 * Obtains the standard {@linkplain IPhase#ID_FINALIZATION finalization} phase.
	 * 
	 * @return my finalization phase
	 */
	IPhase getFinalization();

	/**
	 * Transforms the specified elements.
	 * 
	 * @param inputs
	 *            elements to transform
	 * @param monitor
	 *            a sink for messages
	 * 
	 * @throws TransformationException
	 *             on failure to complete the transformation
	 */
	void execute(Iterable<? extends EObject> inputs, ITransformMonitor monitor) throws TransformationException;

	/**
	 * Transforms the specified element.
	 * 
	 * @param inputs
	 *            an element to transform
	 * @param monitor
	 *            a sink for messages
	 * 
	 * @throws TransformationException
	 *             on failure to complete the transformation
	 * 
	 * @see #execute(Iterable, ITransformMonitor)
	 */
	void execute(EObject input, ITransformMonitor monitor) throws TransformationException;
}
