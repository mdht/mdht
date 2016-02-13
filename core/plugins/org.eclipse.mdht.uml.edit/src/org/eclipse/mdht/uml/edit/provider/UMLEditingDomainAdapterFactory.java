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

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateCopyCommand;
import org.eclipse.emf.edit.command.InitializeCopyCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderDecorator;
import org.eclipse.mdht.uml.edit.command.AddCommandWrapper;
import org.eclipse.mdht.uml.edit.command.CreateCopyCommandWrapper;
import org.eclipse.mdht.uml.edit.command.InitializeCopyCommandWrapper;
import org.eclipse.mdht.uml.edit.command.RemoveCommandWrapper;
import org.eclipse.mdht.uml.edit.command.UMLCommandWrapper;

/**
 * A wrapper adapter factory that intercepts the editing-domain item-provider request to customize commands.
 */
public class UMLEditingDomainAdapterFactory implements AdapterFactory {
	// for now, we only intercept one provider interface
	private final Set<? extends Class<?>> providerInterfaces = Collections.singleton(IEditingDomainItemProvider.class);

	private final AdapterFactory delegate;

	/**
	 * Initializes me with my delegate, which provides item providers that actually do stuff.
	 *
	 * @param delegate
	 *            my delegate
	 */
	public UMLEditingDomainAdapterFactory(AdapterFactory delegate) {
		this.delegate = delegate;
	}

	protected Object intercept(Object adapter, Object type) {
		Object result = adapter;

		// let's not complicate matters by trying to intercept objects that are their own adapters,
		// which isn't a plausible case for the item provider protocols that we want to intercept
		if (adapter instanceof Adapter) {
			result = intercept((Adapter) adapter, type);
		}

		return result;
	}

	protected Adapter intercept(Adapter adapter, Object type) {
		Adapter result = adapter;

		// be careful not to re-intercept
		if (providerInterfaces.contains(type) && ((Class<?>) type).isInstance(adapter) &&
				!(adapter instanceof Interceptor)) {
			result = new Interceptor(this, (IChangeNotifier) adapter);
		}

		return result;
	}

	//
	// Delegation methods
	//

	public boolean isFactoryForType(Object type) {
		return delegate.isFactoryForType(type);
	}

	public Object adapt(Object object, Object type) {
		return intercept(delegate.adapt(object, type), type);
	}

	public Adapter adapt(Notifier target, Object type) {
		return intercept(delegate.adapt(target, type), type);
	}

	public Adapter adaptNew(Notifier target, Object type) {
		return intercept(delegate.adaptNew(target, type), type);
	}

	public void adaptAllNew(Notifier notifier) {
		// nothing to intercept, here, because my client doesn't get the adapters
		delegate.adaptAllNew(notifier);
	}

	//
	// Nested types
	//

	protected static class Interceptor extends ItemProviderDecorator implements Adapter, IEditingDomainItemProvider {
		private final Map<Class<? extends Command>, UMLCommandWrapper> commandWrappers = createCommandWrappers();

		protected Interceptor(AdapterFactory adapterFactory, IChangeNotifier adapter) {
			super(adapterFactory);

			setDecoratedItemProvider(adapter);
		}

		private static Map<Class<? extends Command>, UMLCommandWrapper> createCommandWrappers() {
			Map<Class<? extends Command>, UMLCommandWrapper> result = new java.util.HashMap<Class<? extends Command>, UMLCommandWrapper>();

			result.put(AddCommand.class, new AddCommandWrapper());
			result.put(CreateCopyCommand.class, new CreateCopyCommandWrapper());
			result.put(InitializeCopyCommand.class, new InitializeCopyCommandWrapper());
			result.put(RemoveCommand.class, new RemoveCommandWrapper());

			return Collections.unmodifiableMap(result);
		}

		/* Don't let subclasses override this because we call it from our constructor. */
		@Override
		public final void setDecoratedItemProvider(IChangeNotifier decoratedItemProvider) {
			super.setDecoratedItemProvider(decoratedItemProvider);
		}

		public Notifier getTarget() {
			// I don't actually track an adapted object
			return null;
		}

		public void setTarget(Notifier newTarget) {
			// I don't actually track an adapted object
		}

		//
		// Item-provider protocol intercepts
		//

		@Override
		public Command createCommand(Object object, EditingDomain domain, Class<? extends Command> commandClass,
				CommandParameter commandParameter) {

			// get the basic command
			Command result = super.createCommand(object, domain, commandClass, commandParameter);

			// wrap it if we have a wrapper available
			UMLCommandWrapper wrapper = commandWrappers.get(commandClass);
			if ((wrapper != null) && wrapper.canWrap(commandClass, commandParameter)) {
				result = wrapper.wrap(result, commandParameter);
			}

			return result;
		}
	}
}
