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
package org.eclipse.mdht.uml.edit.command;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.edit.command.ChildrenToCopyProvider;

/**
 * A command wrapper that exposes the {@link ChildrenToCopyProvider}-ness of its wrapped command.
 */
public class CommandWrapperWithChildrenToCopy extends CommandWrapper implements ChildrenToCopyProvider {
	private ChildrenToCopyProvider delegate;

	/**
	 * Wraps a command that provides children to copy.
	 *
	 * @param command
	 *            a command to wrap
	 *
	 * @throws IllegalArgumentException
	 *             if the {@code command} isn't a {@link ChildrenToCopyProvider}
	 */
	public CommandWrapperWithChildrenToCopy(Command command) {
		super(command);

		if (!(command instanceof ChildrenToCopyProvider)) {
			throw new IllegalArgumentException("command is not a ChildrenToCopyProvider");
		}

		this.delegate = (ChildrenToCopyProvider) command;
	}

	/**
	 * Wraps a command with a separate children-to-copy provider. This is useful for cases where one already has a command wrapper, but knows how to
	 * get the children to copy.
	 *
	 * @param command
	 *            a command to wrap
	 * @param a
	 *            children-to-copy provider
	 *
	 * @throws IllegalArgumentException
	 *             if the {@code command} isn't a {@link ChildrenToCopyProvider}
	 */
	public CommandWrapperWithChildrenToCopy(Command command, ChildrenToCopyProvider childrenToCopyProvider) {
		super(command);

		if (childrenToCopyProvider == null) {
			throw new IllegalArgumentException("childrenToCopyProvider is null");
		}

		this.delegate = childrenToCopyProvider;
	}

	public Collection<?> getChildrenToCopy() {
		return delegate.getChildrenToCopy();
	}

}
