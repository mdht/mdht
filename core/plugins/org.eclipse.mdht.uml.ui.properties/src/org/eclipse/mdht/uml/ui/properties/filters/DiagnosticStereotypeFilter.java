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
package org.eclipse.mdht.uml.ui.properties.filters;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.validation.ValidationPackage;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;

/**
 * A filter that selects <tt>«diagnostic» {@link Constraint}</tt>s.
 */
public class DiagnosticStereotypeFilter extends EObjectFilter {

	public DiagnosticStereotypeFilter() {
		super();
	}

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		return (element instanceof Constraint) && (EcoreUtil.getObjectByType(
			((Constraint) element).getStereotypeApplications(), ValidationPackage.Literals.DIAGNOSTIC) != null);
	}

}
