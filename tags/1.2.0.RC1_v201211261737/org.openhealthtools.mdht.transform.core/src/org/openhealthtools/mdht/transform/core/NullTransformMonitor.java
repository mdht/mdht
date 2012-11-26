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
 * A transform monitor that does almost nothing. It doesn't send messages anywhere, but the {@link #abort(String, Throwable) abort} APIs do stop the
 * transformation.
 */
public class NullTransformMonitor implements ITransformMonitor {

	public NullTransformMonitor() {
		super();
	}

	public void abort(String message, Throwable exception) {
		// I do need to abort
		throw new AbortTransformationException(message, exception);
	}

	public void abort(String message) {
		// I do need to abort
		throw new AbortTransformationException(message);
	}

	public void error(String message, Throwable exception) {
		// pass
	}

	public void error(String message) {
		// pass
	}

	public void warning(String message, Throwable exception) {
		// pass
	}

	public void warning(String message) {
		// pass
	}

	public void info(String message, Throwable exception) {
		// pass
	}

	public void info(String message) {
		// pass
	}

	public void debug(String message, Throwable exception) {
		// pass
	}

	public void debug(String message) {
		// pass
	}

}
