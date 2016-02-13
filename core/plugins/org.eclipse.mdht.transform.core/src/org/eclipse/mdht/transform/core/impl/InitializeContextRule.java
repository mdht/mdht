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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;

/**
 * A default initialization rule that creates the transform context instance. Useful as a target for fragments to perform additional
 * context data population before other rules get a chance to run.
 */
public class InitializeContextRule extends AbstractRule {

	public InitializeContextRule() {
		super(INTERNAL_COMPONENT_ID_BASE + "InitContext", RuleKind.INITIALIZATION, "Initialize transform context");
	}

	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		// pass
		return getContext();
	}

}
