/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.resource;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.openhealthtools.mdht.emf.runtime.resource.impl.FleXMLLoadImpl;

public class CDALoadImpl extends FleXMLLoadImpl {
	public CDALoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected boolean shouldThrow(Exception exception) {
		Throwable cause = exception.getCause();
		if (cause != null) {
			String message = cause.getMessage();
			if ((message != null && message.contains("is not a valid enumerator of")) ||
					cause instanceof NumberFormatException) {
				return false;
			}
		}
		return true;
	}
}
