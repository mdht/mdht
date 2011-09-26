/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.util;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.xml.sax.SAXParseException;

// wrapper class for org.eclipse.emf.common.util.Diagnostic with additional convenience methods
public class CDADiagnostic implements Diagnostic {
	private Diagnostic diagnostic = null;

	public CDADiagnostic(Diagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}

	public int getSeverity() {
		return diagnostic.getSeverity();
	}

	public String getMessage() {
		return diagnostic.getMessage();
	}

	public String getSource() {
		return diagnostic.getSource();
	}

	public int getCode() {
		return diagnostic.getCode();
	}

	public Throwable getException() {
		return diagnostic.getException();
	}

	public List<?> getData() {
		return diagnostic.getData();
	}

	public List<Diagnostic> getChildren() {
		return diagnostic.getChildren();
	}

	public boolean isError() {
		return diagnostic.getSeverity() == Diagnostic.ERROR;
	}

	public boolean isWarning() {
		return diagnostic.getSeverity() == Diagnostic.WARNING;
	}

	public boolean isInfo() {
		return diagnostic.getSeverity() == Diagnostic.INFO;
	}

	public EObject getTarget() {
		if (!diagnostic.getData().isEmpty() && diagnostic.getData().get(0) instanceof EObject) {
			return (EObject) diagnostic.getData().get(0);
		}
		return null;
	}

	public String getPath() {
		EObject target = getTarget();
		if (target != null) {
			return CDAUtil.getPath(target);
		}
		return null;
	}

	public int getColumNumber() {
		if (!diagnostic.getData().isEmpty()) {
			if (diagnostic.getData().get(0) instanceof SAXParseException) {
				return ((SAXParseException) diagnostic.getData().get(0)).getColumnNumber();
			}
			if (diagnostic.getData().get(0) instanceof Resource.Diagnostic) {
				return ((Resource.Diagnostic) diagnostic.getData().get(0)).getColumn();
			}
		}
		return -1;
	}

	public int getLineNumber() {
		if (!diagnostic.getData().isEmpty()) {
			if (diagnostic.getData().get(0) instanceof SAXParseException) {
				return ((SAXParseException) diagnostic.getData().get(0)).getLineNumber();
			}
			if (diagnostic.getData().get(0) instanceof Resource.Diagnostic) {
				return ((Resource.Diagnostic) diagnostic.getData().get(0)).getLine();
			}
		}
		return -1;
	}
}
