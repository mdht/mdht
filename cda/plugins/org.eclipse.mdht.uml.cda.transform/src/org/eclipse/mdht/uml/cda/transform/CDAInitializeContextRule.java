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
package org.eclipse.mdht.uml.cda.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.AbstractRule;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.PluginPropertiesUtil;
import org.eclipse.mdht.uml.transform.TransformerOptions;

/**
 * A transform initialization rule that sets up the CDA transformation context. For example, this includes making a {@link PluginPropertiesUtil}
 * available for transformation rules to use.
 */
public class CDAInitializeContextRule extends AbstractRule {
	public CDAInitializeContextRule() {
		super(
			ICDAEcoreTransformIDs.INITIALIZE_CONTEXT_RULE, RuleKind.INITIALIZATION, "Initialize CDA transform context");
	}

	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);

		final TransformerOptions options = ctx.get(TransformerOptions.class);

		// create the properties-file utility
		options.setPluginPropertiesUtil(new PluginPropertiesUtil());
		ctx.put(PluginPropertiesUtil.class, options.getPluginPropertiesUtil());

		// add the base-model reflection utility
		ctx.put(IBaseModelReflection.class, new CDABaseModelReflection());
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		ITransformContext ctx = getContext();

		// initialize the properties-file utility with the input resource
		ctx.get(PluginPropertiesUtil.class).initPluginProperties(input.eResource());

		return ctx;
	}

}
