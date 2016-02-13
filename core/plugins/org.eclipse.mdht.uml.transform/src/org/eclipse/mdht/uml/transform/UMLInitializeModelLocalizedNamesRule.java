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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.AbstractRule;

/**
 * An initialization rule that adds the localized names map to the transformation context for access by transformation rules.
 */
public class UMLInitializeModelLocalizedNamesRule extends AbstractRule {
	private Map<String, String> localizedNames;

	public UMLInitializeModelLocalizedNamesRule(Map<String, String> localizedNames) {
		super(
			IUMLTransformIDs.INIT_MODEL_LOCALIZED_NAMES_RULE, RuleKind.INITIALIZATION,
			"Initialize localized model names");

		this.localizedNames = localizedNames;
	}

	@Override
	public void initialize(ITransformContext ctx) throws TransformationException {
		super.initialize(ctx);

		ctx.put(IUMLTransformIDs.LOCALIZED_NAMES, localizedNames);
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		return localizedNames;
	}

}
