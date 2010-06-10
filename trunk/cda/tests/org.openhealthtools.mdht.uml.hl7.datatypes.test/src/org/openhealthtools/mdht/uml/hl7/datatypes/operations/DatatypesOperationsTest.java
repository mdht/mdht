/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public abstract class DatatypesOperationsTest {

	final protected Map<Object, Object> map = new HashMap<Object, Object>();

	protected abstract EObject getEObjectToTest();

	protected String createUnsupportedOperationFailureMessage(
			final UnsupportedOperationException uoe) {
		return "The test failed because of \"" + uoe.getMessage()
				+ "\".  This is likely due to errors in the OCL.";
	}

	protected String createAssertionFailureMessage(
			final BasicDiagnostic diagnostician) {
		final StringBuilder sb = new StringBuilder();
		for (final Diagnostic diagnostic : diagnostician.getChildren()) {
			sb.append(" ");
			sb.append(diagnostic.getMessage());
		}
		return sb.toString();
	}

} // DatatypesOperationsTest