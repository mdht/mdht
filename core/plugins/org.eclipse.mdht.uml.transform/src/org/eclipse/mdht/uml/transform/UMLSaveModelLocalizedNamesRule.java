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
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.AbstractRule;
import org.eclipse.mdht.uml.common.util.UMLUtil;

/**
 * A rule that saves the model's localized names to the its properties file.
 */
public class UMLSaveModelLocalizedNamesRule extends AbstractRule {
	public UMLSaveModelLocalizedNamesRule() {
		super(IUMLTransformIDs.SAVE_MODEL_LOCALIZED_NAMES_RULE, RuleKind.SAVE, "Save localized model names");
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		@SuppressWarnings("unchecked")
		Map<String, String> localizedNames = (Map<String, String>) getContext().get(IUMLTransformIDs.LOCALIZED_NAMES);

		if ((localizedNames != null) && !localizedNames.isEmpty()) {
			UMLUtil.writeProperties(UMLUtil.getPropertiesURI(input.eResource()), localizedNames);
		}

		return localizedNames;
	}

}
