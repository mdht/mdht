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
package org.eclipse.mdht.uml.edit.provider;

import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.notify.Adapter;
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
	protected BasicEList<Adapter> eAdapters;

	private List<Object> members = new Vector<Object>();

	public SimpleListNotifier() {
	}

	public List<Object> getMembers() {
		return members;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SimpleListNotifier) {
			return true;
		}
		return false;
	}

	@Override
	public EList<Adapter> eAdapters() {
		if (eAdapters == null) {
			eAdapters = new EAdapterList<Adapter>(this);
		}
		return eAdapters;
	}

	@Override
	protected BasicEList<Adapter> eBasicAdapters() {
		return eAdapters;
	}

}
