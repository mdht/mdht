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
package org.eclipse.mdht.uml.cda.ant.taskdefs;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectComponent;
import org.apache.tools.ant.Task;
import org.eclipse.mdht.transform.core.ConsoleTransformMonitor;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.impl.AbortTransformationException;

/**
 * A transform monitor that sends messages to an Ant project's logger.
 */
class AntTransformMonitor implements ITransformMonitor {
	private final ProjectComponent component;

	/**
	 * Initializes me with my project component context.
	 *
	 * @param component
	 *            my Ant project component
	 */
	private AntTransformMonitor(ProjectComponent component) {
		if (component == null) {
			throw new IllegalArgumentException("Null project component");
		}

		this.component = component;
	}

	/**
	 * Creates the most appropriate monitor for the given project {@code component}.
	 *
	 * @param component
	 *            the contextual Ant project component, or {@code null} if we are not running in the context of a component
	 *
	 * @return a suitable transform monitor (never {@code null})
	 */
	public static ITransformMonitor createMonitor(ProjectComponent component) {
		return (component != null)
				? new AntTransformMonitor(component)
				: new ConsoleTransformMonitor();
	}

	private void log(String message, int severity, Throwable exception) {
		if (exception != null) {
			if (component instanceof Task) {
				component.getProject().log((Task) component, message, exception, severity);
			} else {
				component.getProject().log(message, exception, severity);
			}
		} else {
			component.log(message, severity);
		}
	}

	public void abort(String message, Throwable exception) {
		log(message, Project.MSG_ERR, exception);

		throw new AbortTransformationException(message, exception);
	}

	public void abort(String message) {
		log(message, Project.MSG_ERR, null);

		throw new AbortTransformationException(message);
	}

	public void error(String message, Throwable exception) {
		log(message, Project.MSG_ERR, exception);
	}

	public void error(String message) {
		error(message, null);
	}

	public void warning(String message, Throwable exception) {
		log(message, Project.MSG_WARN, exception);
	}

	public void warning(String message) {
		warning(message, null);
	}

	public void info(String message, Throwable exception) {
		log(message, Project.MSG_INFO, exception);
	}

	public void info(String message) {
		info(message, null);
	}

	public void debug(String message, Throwable exception) {
		log(message, Project.MSG_DEBUG, exception);
	}

	public void debug(String message) {
		debug(message, null);
	}

}
