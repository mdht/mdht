/*******************************************************************************
 * Copyright (c) 2013 dcarlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     dcarlson - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.editors;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.mdht.uml.edit.provider.SimpleListNotifier;

/**
 * @author dcarlson
 *
 */
public class TableEditorComposedAdapterFactory extends ComposedAdapterFactory {

	/**
	 *
	 */
	public TableEditorComposedAdapterFactory() {
		super();
	}

	/**
	 * @param adapterFactoryDescriptorRegistry
	 */
	public TableEditorComposedAdapterFactory(Registry adapterFactoryDescriptorRegistry) {
		super(adapterFactoryDescriptorRegistry);
	}

	/**
	 * @param adapterFactory
	 */
	public TableEditorComposedAdapterFactory(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @param adapterFactories
	 */
	public TableEditorComposedAdapterFactory(AdapterFactory[] adapterFactories) {
		super(adapterFactories);
	}

	/**
	 * @param adapterFactories
	 */
	public TableEditorComposedAdapterFactory(Collection<? extends AdapterFactory> adapterFactories) {
		super(adapterFactories);
	}

	@Override
	public Adapter adapt(Notifier target, Object type) {
		if (target instanceof SimpleListNotifier) {
			for (AdapterFactory factory : adapterFactories) {
				if (factory.isFactoryForType(type)) {
					return factory.adapt(target, type);
				}
			}
		}

		return super.adapt(target, type);
	}

	public List<AdapterFactory> getAdapterFactories() {
		return adapterFactories;
	}
}
