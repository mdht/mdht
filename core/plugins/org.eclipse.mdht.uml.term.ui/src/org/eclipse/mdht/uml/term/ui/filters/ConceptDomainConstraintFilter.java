/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.term.ui.filters;

import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Selects an object if it is a UML Property with
 * ConceptDomainConstraint stereotype applied.
 */
public class ConceptDomainConstraintFilter extends TermFilter {

	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Property) {
			Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
				element, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
			return stereotype != null;
		}
		return false;
	}

}
