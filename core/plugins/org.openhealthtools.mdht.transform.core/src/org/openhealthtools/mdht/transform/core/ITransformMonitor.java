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
package org.openhealthtools.mdht.transform.core;

/**
 * A sink for diagnostic messages and progress of activity.
 */
public interface ITransformMonitor {
	/**
	 * Reports a fatal error. The transformation is immediately stopped.
	 * 
	 * @param message
	 *            the message to report
	 * @param exception
	 *            an exception that traces the failure
	 */
	void abort(String message, Throwable exception);

	/**
	 * Reports a fatal error. The transformation is immediately stopped.
	 * 
	 * @param message
	 *            the message to report
	 */
	void abort(String message);

	void error(String message, Throwable exception);

	void error(String message);

	void warning(String message, Throwable exception);

	void warning(String message);

	void info(String message, Throwable exception);

	void info(String message);

	void debug(String message, Throwable exception);

	void debug(String message);
}
