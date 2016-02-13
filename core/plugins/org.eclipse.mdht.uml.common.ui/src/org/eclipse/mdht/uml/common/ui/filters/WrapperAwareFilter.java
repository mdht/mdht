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
package org.eclipse.mdht.uml.common.ui.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.mdht.uml.common.ui.util.Selections;

/**
 * A base filter that knows how to handle object wrappers in the content tree.
 */
public abstract class WrapperAwareFilter implements IFilter {

	public WrapperAwareFilter() {
		super();
	}

	protected EObject getEObject(Object object) {
		return Selections.unwrap(object, EObject.class);
	}
}
