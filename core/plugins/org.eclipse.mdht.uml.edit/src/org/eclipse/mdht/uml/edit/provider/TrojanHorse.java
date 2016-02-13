/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.provider.WrapperItemProvider;

/**
 * An object wrapper that lets an object into a command that otherwise would reject it.
 * Some item providers reject certain commands that otherwise would be expected to be supported, to constrain the user workflows to promote correct
 * modeling.
 * However, internally, the composition of a complex command may need to invoke the restricted command in a controlled way. The {@code TrojanHorse}
 * makes
 * that possible by signalling the internal, programmatic use case.
 */
public class TrojanHorse extends WrapperItemProvider {

	public TrojanHorse(Object value, Object owner, EStructuralFeature feature, int index,
			AdapterFactory adapterFactory) {
		super(value, owner, feature, index, adapterFactory);
	}

	public static IWrapperItemProvider wrap(Object object, Object owner, EStructuralFeature feature,
			AdapterFactory adapterFactory) {
		return wrap(object, owner, feature, Notification.NO_INDEX, adapterFactory);
	}

	public static IWrapperItemProvider wrap(Object object, Object owner, EStructuralFeature feature, int index,
			AdapterFactory adapterFactory) {
		// re-wrap the object, in case it's already a wrapper
		return new TrojanHorse(AdapterFactoryEditingDomain.unwrap(object), owner, feature, index, adapterFactory);
	}

	public static Collection<? extends IWrapperItemProvider> wrap(Collection<?> objects, Object owner,
			EStructuralFeature feature, AdapterFactory adapterFactory) {
		return wrap(objects, owner, feature, Notification.NO_INDEX, adapterFactory);
	}

	public static Collection<? extends IWrapperItemProvider> wrap(Collection<?> objects, Object owner,
			EStructuralFeature feature, int index, AdapterFactory adapterFactory) {
		List<IWrapperItemProvider> result = new java.util.ArrayList<IWrapperItemProvider>(objects.size());

		for (Object next : objects) {
			result.add(wrap(next, owner, feature, index, adapterFactory));
		}

		return result;
	}

	/**
	 * Queries whether an {@code object} is a Trojan horse carrying some object.
	 *
	 * @param object
	 *            an object
	 *
	 * @return whether it is a Trojan horse
	 */
	public static boolean isTrojanHorse(Object object) {
		return object instanceof TrojanHorse;
	}

	/**
	 * Queries whether none of the given {@code objects} are of a forbidden type. Any that are wrapped in Trojan horses pass unseen by the filter, and
	 * are thus accepted.
	 *
	 * @param objects
	 *            a set of objects to scan
	 * @param rejectedType
	 *            a type of which no instances must be in the {@code objects} collection, unless hidden in a Trojan horse
	 *
	 * @return {@code true} if all of the {@code objects} look acceptable; {@code false} if any of them is a bare-faced {@code rejectedType}
	 */
	public static boolean filter(Collection<?> objects, Class<?> rejectedType) {
		boolean result = true;

		if (objects != null) {
			for (Object next : objects) {
				if (!isTrojanHorse(next) && rejectedType.isInstance(AdapterFactoryEditingDomain.unwrap(next))) {
					result = false;
					break;
				}
			}
		}

		return result;
	}
}
