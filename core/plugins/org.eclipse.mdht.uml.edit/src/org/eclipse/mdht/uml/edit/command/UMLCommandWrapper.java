/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus.
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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;

/**
 * The protocol for a wrapper of UML edit commands. A wrapper is installed in an editing domain's command factory, usually the item-providers that it
 * delegates to, and indicates whether it {@linkplain #canWrap(Class, CommandParameter) can wrap} a given command. If it can, it then provides that
 * wrapper (which may
 * nonetheless be the original command unadorned; that is a perfectly valid way to handle wrapping a command).
 */
public interface UMLCommandWrapper {
	boolean canWrap(Class<? extends Command> requestedType, CommandParameter parameter);

	Command wrap(Command command, CommandParameter parameter);
}
