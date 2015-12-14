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
package org.openhealthtools.mdht.api.transform.original;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.TransformationException;
import org.openhealthtools.mdht.transform.core.impl.SaveModelRule;

public class APISaveModelRule extends SaveModelRule {

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		Resource result = input.eResource();

		// super.doApply(input, monitor);
		// do nothing

		return result;
	}
}
