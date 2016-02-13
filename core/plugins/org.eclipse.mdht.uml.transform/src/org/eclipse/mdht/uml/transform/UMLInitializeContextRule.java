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
package org.eclipse.mdht.uml.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.AbstractRule;

/**
 * A transform initialization rule that sets up the UML transformation context. For example, this includes making a {@link TransformerOptions}
 * available for transformation rules to use.
 */
public class UMLInitializeContextRule extends AbstractRule {
	private TransformerOptions options;

	public UMLInitializeContextRule() {
		this(new TransformerOptions());
	}

	public UMLInitializeContextRule(TransformerOptions options) {
		super(IUMLTransformIDs.INITIALIZE_CONTEXT_RULE, RuleKind.INITIALIZATION, "Initialize UML transform context");

		this.options = options;
	}

	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);

		// put the legacy options object into the context
		ctx.put(TransformerOptions.class, options);
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		ITransformContext ctx = getContext();

		return ctx;
	}

}
