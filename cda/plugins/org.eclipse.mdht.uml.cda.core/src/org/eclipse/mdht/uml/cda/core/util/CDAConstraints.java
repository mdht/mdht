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
package org.eclipse.mdht.uml.cda.core.util;

import org.eclipse.osgi.util.NLS;

@Deprecated
public class CDAConstraints extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.mdht.uml.cda.core.util.CDAConstraints"; //$NON-NLS-1$

	public static String CDATemplateIdConstraint;

	public static String CDATemplateIdConstraintMarkup;

	public static String CDAVersionTemplateIdConstraint;

	public static String CDAVersionTemplateIdConstraintMarkup;

	public static String CDATemplateIdConstraintDiffMultip;

	public static String CDATemplateIdConstraintMarkupDiffMultip;

	public static String CDAVersionTemplateIdConstraintDiffMultip;

	public static String CDAVersionTemplateIdConstraintMarkupDiffMultip;

	static {
		NLS.initializeMessages(BUNDLE_NAME, CDAConstraints.class);
	}

	private CDAConstraints() {
	}
}
