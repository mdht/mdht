/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
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
package org.eclipse.mdht.uml.cda.ui.filters;

import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Selects an object if it is a UML Property with
 * a Terminology stereotype applied.
 */
public class TerminologyConstraintFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Property) {
			Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				element, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
			if (stereotype == null) {
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					element, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
			}
			if (stereotype == null) {
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					element, ITermProfileConstants.VALUE_SET_CONSTRAINT);
			}

			return stereotype != null;
		}
		return false;
	}

}
