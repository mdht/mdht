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
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.search;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

/**
 * @author dcarlson
 *
 */
public class GeneralizationTypeFilter implements IElementFilter {
	private Classifier subtype;

	public GeneralizationTypeFilter(Classifier subtype) {
		this.subtype = subtype;
	}

	public boolean accept(Element element) {
		return element instanceof Classifier && subtype != (Classifier) element &&
				subtype.maySpecializeType((Classifier) element);
	}

}
