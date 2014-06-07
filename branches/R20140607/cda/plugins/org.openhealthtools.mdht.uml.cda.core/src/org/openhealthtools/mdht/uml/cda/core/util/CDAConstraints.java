/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software)  - initial implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import org.eclipse.osgi.util.NLS;

public class CDAConstraints extends NLS {
	private static final String BUNDLE_NAME = "org.openhealthtools.mdht.uml.cda.core.util.CDAConstraints"; //$NON-NLS-1$

	public static String CDATemplateIdConstraint;

	public static String CDATemplateIdConstraintMarkup;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CDAConstraints.class);
	}

	private CDAConstraints() {
	}
}
