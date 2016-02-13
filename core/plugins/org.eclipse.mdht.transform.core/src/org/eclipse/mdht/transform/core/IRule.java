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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A rule that transforms a specific input into some kind of output.
 * </p>
 * <p>
 * The type of output produced by the rule depends on its role in the transformation. For transformation rules, this is usually some kind of
 * {@link EObject}. For other rules, this isn't necessarily the case. For example, an {@linkplain RuleKind#INITIALIZATION initialization} rule is
 * expected to produce an {@link ITransformContext}.
 * </p>
 */
public interface IRule extends ITransformationComponent {
	String ID_SAVE_MODEL = "org.eclipse.mdht.transform.core.SaveModel";

	IPhase getPhase();

	ITransformation getTransformation();

	RuleKind getKind();

	List<? extends IRuleFragment> getRuleFragments();

	IRuleFragment getFragment(String id);

	List<? extends IRuleFragment> getBefores();

	List<? extends IRuleFragment> getAfters();

	/**
	 * Transforms the given {@code input} into an output.
	 *
	 * @param input
	 *            the input element to transform
	 * @param monitor
	 *            a sink for messages
	 *
	 * @return my output of transformation of the {@code input}
	 *
	 * @throws TransformationException
	 *             if I utterly fail to complete the transformation
	 */
	Object apply(EObject input, ITransformMonitor monitor) throws TransformationException;
}
