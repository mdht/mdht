/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers;

import org.eclipse.emf.validation.model.IClientSelector;

/**
 * An EMF validation client selector class with the simple property that the MSL
 * example plugin client context occurs when the {@link #running} flag is set to
 * true.
 * 
 * @author cmcgee
 */
public class ValidationDelegateClientSelector implements IClientSelector {

	public static boolean running = true;

	public boolean selects(Object object) {
		return running;
	}

}
