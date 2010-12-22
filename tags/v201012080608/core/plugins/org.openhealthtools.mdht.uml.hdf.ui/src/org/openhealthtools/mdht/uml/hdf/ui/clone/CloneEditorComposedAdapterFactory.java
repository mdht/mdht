/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class CloneEditorComposedAdapterFactory 
{
	private static ComposedAdapterFactory mnCompAdapterFactory;
	
	public final static ComposedAdapterFactory getAdapterFactory()
	{
		if (mnCompAdapterFactory == null)
			mnCompAdapterFactory = new ComposedAdapterFactory(createFactoryList());
		return mnCompAdapterFactory;
	}
	
	public final static ArrayList<AdapterFactory> createFactoryList()
	{
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new CloneUMLItemProviderAdapterFactory());
		return factories;
	}
}
