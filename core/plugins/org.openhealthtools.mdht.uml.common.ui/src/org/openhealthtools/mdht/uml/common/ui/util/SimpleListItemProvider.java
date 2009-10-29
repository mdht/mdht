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
package org.openhealthtools.mdht.uml.common.ui.util;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

public class SimpleListItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {

	/**
	 * @param adapterFactory
	 */
	public SimpleListItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object element) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		return "root";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	public Object getParent(Object object) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		return SimpleListNotifier.class.isInstance(element) 
			&& !((SimpleListNotifier)element).getMembers().isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProvider#getChildren(java.lang.Object)
	 */
	public Collection getChildren(Object parentElement) {
		return ((SimpleListNotifier)parentElement).getMembers();
	}

}
