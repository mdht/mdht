/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - implement handling of live validation roll-back (artf3318)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * @author dcarlson
 *
 */
public class AssociationCommentSection extends CommentSection {

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		if (element instanceof View) {
			element = ((View) element).getElement();
		}

		if (element instanceof Association) {
			if (((Association) element).getOwnedComments().isEmpty()) {
				Property navEnd = UMLUtil.getNavigableEnd((Association) element);
				if (navEnd != null) {
					element = navEnd;
				}
			}
			this.umlElement = (Element) element;

		} else {
			this.umlElement = null;
		}
	}

}
