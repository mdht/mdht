/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;

public class SystemOutValidationHandler implements ValidationHandler {
	public void handleError(Diagnostic diagnostic) {
		System.out.println("ERROR: " + diagnostic.getMessage());
	}

	public void handleWarning(Diagnostic diagnostic) {
		System.out.println("Warning: " + diagnostic.getMessage());
	}

	public void handleInfo(Diagnostic diagnostic) {
		System.out.println("Info: " + diagnostic.getMessage());
	}
}
