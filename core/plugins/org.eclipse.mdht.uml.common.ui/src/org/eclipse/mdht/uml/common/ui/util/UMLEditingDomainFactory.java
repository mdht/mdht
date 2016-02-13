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
package org.eclipse.mdht.uml.common.ui.util;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.mdht.uml.edit.provider.UML2ExtendedAdapterFactory;
import org.eclipse.mdht.uml.edit.provider.UMLEditingDomainAdapterFactory;

/**
 * An editing-domain factory for UML editors that hooks in interceptors of certain adapter factories.
 */
public class UMLEditingDomainFactory extends WorkspaceEditingDomainFactory {

	public UMLEditingDomainFactory() {
		super();
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain() {
		return hookEditingDomain(super.createEditingDomain());
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(IOperationHistory history) {
		return hookEditingDomain(super.createEditingDomain(history));
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		return hookEditingDomain(super.createEditingDomain(rset));
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(ResourceSet rset, IOperationHistory history) {
		return hookEditingDomain(super.createEditingDomain(rset, history));
	}

	protected TransactionalEditingDomain hookEditingDomain(TransactionalEditingDomain editingDomain) {
		TransactionalEditingDomain result = editingDomain;

		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			result = hookEditingDomain((AdapterFactoryEditingDomain) editingDomain);
		}

		return result;
	}

	protected TransactionalEditingDomain hookEditingDomain(final AdapterFactoryEditingDomain editingDomain) {
		AdapterFactory factory = editingDomain.getAdapterFactory();
		if (factory instanceof ComposedAdapterFactory) {
			// nice, happy case: can intercept only UML requests
			((ComposedAdapterFactory) factory).insertAdapterFactory(
				new UMLEditingDomainAdapterFactory(new UML2ExtendedAdapterFactory()));
		} else {
			// not so nice and happy: have to intercept all requests
			editingDomain.setAdapterFactory(new UMLEditingDomainAdapterFactory(factory));
		}

		return (TransactionalEditingDomain) editingDomain;
	}
}
