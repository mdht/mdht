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

import org.openhealthtools.mdht.transform.core.impl.AbortTransformationException;

/**
 * A transform monitor that prints messages on the console.
 */
public class ConsoleTransformMonitor implements ITransformMonitor {

	public ConsoleTransformMonitor() {
		super();
	}

	public void abort(String message, Throwable exception) {
		System.err.println("FATAL: " + message);

		if (exception != null) {
			exception.printStackTrace(System.err);
		}

		throw new AbortTransformationException(message, exception);
	}

	public void abort(String message) {
		System.err.println("FATAL: " + message);
		throw new AbortTransformationException(message);
	}

	public void error(String message, Throwable exception) {
		System.err.println("ERROR: " + message);

		if (exception != null) {
			exception.printStackTrace(System.err);
		}
	}

	public void error(String message) {
		error(message, null);
	}

	public void warning(String message, Throwable exception) {
		System.out.println("WARN: " + message);

		if (exception != null) {
			exception.printStackTrace(System.out);
		}
	}

	public void warning(String message) {
		warning(message, null);
	}

	public void info(String message, Throwable exception) {
		System.out.println("INFO: " + message);

		if (exception != null) {
			exception.printStackTrace(System.out);
		}
	}

	public void info(String message) {
		info(message, null);
	}

	public void debug(String message, Throwable exception) {
		System.out.println("DEBUG: " + message);

		if (exception != null) {
			exception.printStackTrace(System.out);
		}
	}

	public void debug(String message) {
		debug(message, null);
	}

}
