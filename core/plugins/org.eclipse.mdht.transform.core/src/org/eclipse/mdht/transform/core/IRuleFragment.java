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

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A fragment of transformation that decorates a rule, filtering either its input or its output.
 * </p>
 * <p>
 * The type of output that I yield depends on my role. For {@linkplain FragmentKind#BEFORE before} fragments, this must be some kind of
 * {@link EObject} type to feed into the next before fragment or the rule as the input. For {@linkplain FragmentKind#AFTER after} fragments, this must
 * be a type conforming to the output kind of the rule that I decorate.
 * </p>
 */
public interface IRuleFragment extends ITransformationComponent {
	FragmentKind getKind();

	/**
	 * Filters the application of a rule on an {@code input} element.
	 *
	 * @param input
	 *            the input element
	 * @param output
	 *            the output element either of a previous fragment or of the rule that I decorate
	 * @param monitor
	 *
	 * @return my filtered output, to pass along to the next fragment or the rule that I decorate
	 *
	 * @throws TransformationException
	 *             if I utterly fail to complete my work
	 */
	Object apply(EObject input, Object output, ITransformMonitor monitor) throws TransformationException;
}
