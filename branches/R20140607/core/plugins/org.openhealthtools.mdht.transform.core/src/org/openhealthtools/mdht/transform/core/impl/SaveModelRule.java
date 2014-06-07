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
package org.openhealthtools.mdht.transform.core.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.RuleKind;
import org.openhealthtools.mdht.transform.core.TransformationException;

/**
 * Default implementation of the rules that saves the transformation result. It assumes an in-place transformation, so it actually just saves the
 * resource that contains the input element.
 */
public class SaveModelRule extends AbstractRule {

	public SaveModelRule() {
		super(ID_SAVE_MODEL, RuleKind.SAVE, "Initialize transformed model");
	}

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		Resource result = input.eResource();

		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			result.save(saveOptions);
		} catch (IOException e) {
			throw new TransformationException("Failed to save transformed model.", e);
		}

		return result;
	}

}
