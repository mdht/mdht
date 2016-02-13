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

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;

/**
 * The default rule for walking the model just does a simple depth-first tree iteration.
 */
public class DepthFirstWalkRule extends AbstractRule {
	private TreeIterator<EObject> iter;

	public DepthFirstWalkRule() {
		super(INTERNAL_COMPONENT_ID_BASE + "DepthFirstWalk", RuleKind.WALK, "Depth-first walk");
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		if (iter == null) {
			iter = EcoreUtil.getAllContents(Collections.singleton(input));
		}

		EObject result = iter.hasNext()
				? iter.next()
				: null;
		while ((result != null) && !accept(result)) {
			iter.prune();

			if (iter.hasNext()) {
				result = iter.next();
			} else {
				result = null;
			}
		}

		return result;
	}

	protected boolean accept(EObject element) {
		return true;
	}
}
