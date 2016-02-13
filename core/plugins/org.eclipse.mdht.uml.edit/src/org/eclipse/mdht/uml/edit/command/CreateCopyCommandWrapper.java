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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChildrenToCopyProvider;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateCopyCommand;
import org.eclipse.uml2.uml.Element;

/**
 * A create-copy-command wrapper that includes stereotype applications associated with UML elements as "children to copy" in the copy operation.
 */
public class CreateCopyCommandWrapper implements UMLCommandWrapper {
	public boolean canWrap(Class<? extends Command> requestedType, CommandParameter parameter) {
		return requestedType == CreateCopyCommand.class;
	}

	public Command wrap(Command createCopyCommand, CommandParameter parameter) {
		Command result = createCopyCommand;

		if (parameter.getOwner() instanceof Element) {
			final Element element = (Element) parameter.getOwner();
			final Collection<? extends EObject> stereotypeApplications = AddCommandWrapper.StereotypesCache.getStereotypeApplications(
				element);

			if (!stereotypeApplications.isEmpty()) {
				class Impl extends CommandWrapper implements ChildrenToCopyProvider {
					Impl(Command delegate) {
						super(delegate);
					}

					public Collection<?> getChildrenToCopy() {
						Collection<Object> result = new java.util.ArrayList<Object>(
							element.eContents().size() + stereotypeApplications.size());

						if (getCommand() instanceof ChildrenToCopyProvider) {
							result.addAll(((ChildrenToCopyProvider) getCommand()).getChildrenToCopy());
						} else {
							result.addAll(element.eContents());
						}

						result.addAll(stereotypeApplications);

						return result;
					}
				}

				result = new Impl(createCopyCommand);
			}
		}

		return result;
	}
}
