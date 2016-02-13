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

import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.mdht.emf.runtime.resource.impl.FleXMLLoadImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class CDALoadImpl extends FleXMLLoadImpl {
	public CDALoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected boolean shouldThrow(Exception exception) {
		if (exception instanceof IllegalValueException && CDAUtil.ignoreBadValues) {
			return false;
		}
		return true;
	}
}
