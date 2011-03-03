/**
 * Copyright (c) 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors::
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.Filter;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;

// a class to collect diagnostics produced during XML schema validation and/or EMF validation
public class ValidationResult implements ValidationHandler {
	private static final String JAVA_XML_VALIDATOR_SOURCE = "javax.xml.validation.Validator";
	
	private List<Diagnostic> allDiagnostics = null;
	private List<Diagnostic> errorDiagnostics = null;
	private List<Diagnostic> warningDiagnostics = null;
	private List<Diagnostic> infoDiagnostics = null;

	public ValidationResult() {
		allDiagnostics = new ArrayList<Diagnostic>();
		errorDiagnostics = new ArrayList<Diagnostic>();
		warningDiagnostics = new ArrayList<Diagnostic>();
		infoDiagnostics = new ArrayList<Diagnostic>();
	}
	
	public void handleError(Diagnostic diagnostic) {
		allDiagnostics.add(diagnostic);
		errorDiagnostics.add(diagnostic);
	}

	public void handleWarning(Diagnostic diagnostic) {
		allDiagnostics.add(diagnostic);
		warningDiagnostics.add(diagnostic);
	}

	public void handleInfo(Diagnostic diagnostic) {
		allDiagnostics.add(diagnostic);
		infoDiagnostics.add(diagnostic);
	}
	
	public List<Diagnostic> getAllDiagnostics() {
		return Collections.unmodifiableList(allDiagnostics);
	}
	
	public List<Diagnostic> getErrorDiagnostics() {
		return Collections.unmodifiableList(errorDiagnostics);
	}
	
	public List<Diagnostic> getWarningDiagnostics() {
		return Collections.unmodifiableList(warningDiagnostics);
	}
	
	public List<Diagnostic> getInfoDiagnostics() {
		return Collections.unmodifiableList(infoDiagnostics);
	}
	
	public List<Diagnostic> getDiagnostics(Filter<Diagnostic> filter) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		for (Diagnostic diagnostic : getAllDiagnostics()) {
			if (filter.accept(diagnostic)) {
				diagnostics.add(diagnostic);
			}
		}
		return Collections.unmodifiableList(diagnostics);
	}
	
	// filter out diagnostics produced during XML schema validation
	public List<Diagnostic> getSchemaValidationDiagnostics() {
		return getDiagnostics(new Filter<Diagnostic>() {
			public boolean accept(Diagnostic item) {
				return JAVA_XML_VALIDATOR_SOURCE.equals(item.getSource()) ? true : false;
			}
		});
	}
	
	// filter out diagnostics produced during EMF validation
	public List<Diagnostic> getEMFValidationDiagnostics() {
		return getDiagnostics(new Filter<Diagnostic>() {
			public boolean accept(Diagnostic item) {
				return JAVA_XML_VALIDATOR_SOURCE.equals(item.getSource()) ? false : true;
			}
		});
	}
}
