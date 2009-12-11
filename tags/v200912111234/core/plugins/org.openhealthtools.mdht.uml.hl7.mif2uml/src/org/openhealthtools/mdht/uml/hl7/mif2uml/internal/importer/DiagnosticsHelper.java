/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.Activator;


/**
 * Utility class that holds diagnostics.
 * 
 * $Id: $
 */
public class DiagnosticsHelper {

	/** Collects warning and error messages during transformation */
	private DiagnosticChain diagnostics = new BasicDiagnostic(
			Activator.getDefault().getBundle().getSymbolicName(),
			0, "Root Diagnostic", new Object[0]);
	
	public Diagnostic getDiagnostics() {
		return (Diagnostic) diagnostics;
	}

	public DiagnosticChain getDiagnosticChain() {
		return diagnostics;
	}
	
	public void setDiagnostics(DiagnosticChain diagnosticChain) {
		diagnostics = diagnosticChain;
	}

	public void info(String message, Object source) {
		addDiagnostic(Diagnostic.INFO, message, source, null);
	}

	public void info(String message, Object source, Object feature) {
		addDiagnostic(Diagnostic.INFO, message, source, feature);
	}

	public void warning(String message, Object source) {
		addDiagnostic(Diagnostic.WARNING, message, source, null);
	}

	public void warning(String message, Object source, Object feature) {
		addDiagnostic(Diagnostic.WARNING, message, source, feature);
	}

	public void error(String message, Object source) {
		addDiagnostic(Diagnostic.ERROR, message, source, null);
	}

	public void error(String message, Object source, Object feature) {
		addDiagnostic(Diagnostic.ERROR, message, source, feature);
	}
	
	public void addDiagnostic(int severity, String message, Object source, Object feature) {
		Object[] data = {source, feature};
		diagnostics.add(new BasicDiagnostic(severity,
				Activator.getDefault().getBundle().getSymbolicName(),
				0, message, data));
	}

}
