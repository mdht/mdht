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
package org.eclipse.mdht.uml.ui.navigator;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.gmf.runtime.common.core.util.IAdaptableSelection;

public abstract class UMLAbstractNavigatorItem extends PlatformObject implements IAdaptableSelection {

	private Object myParent;

	protected UMLAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	public Object getParent() {
		return myParent;
	}

}
