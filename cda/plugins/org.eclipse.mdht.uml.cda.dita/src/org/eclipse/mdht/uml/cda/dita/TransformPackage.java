/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.eclipse.mdht.uml.cda.dita;

import org.eclipse.uml2.uml.Package;

public class TransformPackage extends TransformAbstract {

	public TransformPackage(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object casePackage(Package umlPackage) {

		return umlPackage;
	}

}
