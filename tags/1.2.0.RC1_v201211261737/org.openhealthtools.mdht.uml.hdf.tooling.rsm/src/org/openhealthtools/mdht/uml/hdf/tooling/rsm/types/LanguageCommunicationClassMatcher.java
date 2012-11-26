/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;

/**
 * @generated
 */
public class LanguageCommunicationClassMatcher implements IElementMatcher {

	/**
	 * @generated NOT
	 */
	public boolean matches(EObject eObject) {
		return RIMElementTypes._LANGUAGECOMMUNICATION__CLASS.getEClass() == eObject.eClass() &&
				RIMProfileUtil.isRIMType((Element) eObject, IRIMProfileConstants.LANGUAGE_COMMUNICATION);
	}
}
