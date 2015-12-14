/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.api.transform.original;

import org.eclipse.core.runtime.IStatus;

/**
 * Simulates org.openhealthtools.mdht.uml.transform.internal.Logger that is not accessible by API
 */
public class Logger {

	public static final int ERROR = IStatus.ERROR;

	public static final int WARNING = IStatus.WARNING;

	public static void log(int error2, String message) {
		System.err.println(message);
	}

}
