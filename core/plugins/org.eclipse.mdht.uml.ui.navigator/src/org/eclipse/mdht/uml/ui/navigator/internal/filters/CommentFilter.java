/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.navigator.internal.filters;

import org.eclipse.gmf.runtime.common.core.util.IAdaptableSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

public class CommentFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		Element umlElement = null;
		if (element instanceof IAdaptableSelection) {
			umlElement = ((IAdaptableSelection) element).getAdapter(Element.class);
		}

		return umlElement instanceof Comment
				? false
				: true;
	}

}
