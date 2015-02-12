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
package org.openhealthtools.mdht.transform.core.impl;

/**
 * An exception that safely aborts the current transformation.
 */
public class AbortTransformationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AbortTransformationException() {
		super();
	}

	public AbortTransformationException(String message) {
		super(message);
	}

	public AbortTransformationException(Throwable cause) {
		super(cause);
	}

	public AbortTransformationException(String message, Throwable cause) {
		super(message, cause);
	}

}
