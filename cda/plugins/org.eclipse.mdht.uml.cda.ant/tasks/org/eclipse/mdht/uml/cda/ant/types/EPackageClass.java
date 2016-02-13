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
package org.eclipse.mdht.uml.cda.ant.types;

import org.eclipse.emf.ecore.EPackage;

public class EPackageClass {

	private Class<EPackage> qname;

	public Class<EPackage> getQname() {
		return qname;
	}

	public void setQname(Class<EPackage> ePackage) {
		this.qname = ePackage;
	}

}
