/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.notify.impl.BasicNotifierImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * A simple list to serve as root of tree viewer.
 * 
 */
public class SimpleListNotifier extends BasicNotifierImpl {
	
	/**
	 * The list of {@link org.eclipse.emf.common.notify.Adapter}s
	 * associated with the notifier.
	 */
	protected BasicEList eAdapters;
	
	private List members = new Vector();

	public SimpleListNotifier() {
	}
	
	public List getMembers() {
		return members;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj instanceof SimpleListNotifier) {
			return true;
		}
		return false;
	}

	public EList eAdapters() {
		if (eAdapters == null) {
			eAdapters = new EAdapterList(this);
		}
		return eAdapters;
	}

	protected BasicEList eBasicAdapters() {
		return eAdapters;
	}

}
