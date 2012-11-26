/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ant.taskdefs;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * A {@link DiagnosticChain} that logs problems to the Ant log as they are added to it.
 */
public class LoggingDiagnosticChain extends BasicDiagnostic {
	private final Task owner;

	public LoggingDiagnosticChain(Task owner) {
		super();

		this.owner = owner;
	}

	@Override
	public void add(Diagnostic diagnostic) {
		super.add(diagnostic);

		switch (diagnostic.getSeverity()) {
			case Diagnostic.INFO:
				log(Project.MSG_INFO, "Info:    " + diagnostic.getMessage());
				break;
			case Diagnostic.WARNING:
				log(Project.MSG_WARN, "Warning: " + diagnostic.getMessage());
				break;
			case Diagnostic.ERROR:
			case Diagnostic.CANCEL:
				log(Project.MSG_ERR, "ERROR:   " + diagnostic.getMessage());
				break;
			default: // including OK
				// pass
				break;
		}
	}

	private void log(int severity, String message) {
		if (owner.getProject() != null) {
			owner.log(message, severity);
		}
	}
}
