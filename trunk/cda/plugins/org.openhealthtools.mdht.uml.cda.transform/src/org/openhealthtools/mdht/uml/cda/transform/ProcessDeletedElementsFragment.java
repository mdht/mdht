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
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.transform.core.FragmentKind;
import org.openhealthtools.mdht.transform.core.IRule;
import org.openhealthtools.mdht.transform.core.ITransformContext;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.RuleBuilder;
import org.openhealthtools.mdht.transform.core.TransformationException;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * A rule fragment, intended to go {@linkplain FragmentKind#BEFORE before} the {@linkplain IRule#ID_SAVE_MODEL save rule} that strips elements out of
 * the model that were marked for deletion during the progress of the transformation.
 */
public class ProcessDeletedElementsFragment implements RuleBuilder.IFragmentDelegate {

	public ProcessDeletedElementsFragment() {
		super();
	}

	public Object apply(EObject input, Object output, ITransformContext ctx, ITransformMonitor monitor)
			throws TransformationException {

		for (Element next : ctx.get(TransformerOptions.class).getDeletedElementList()) {
			next.destroy();
		}

		return output;
	}
}
