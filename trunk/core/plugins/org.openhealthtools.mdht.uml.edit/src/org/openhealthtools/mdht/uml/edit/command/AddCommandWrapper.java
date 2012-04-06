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
package org.openhealthtools.mdht.uml.edit.command;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.RemoveCommand;

/**
 * An add-command wrapper that ensures correctness of cross-resource containment of the added objects, in the case that they are contained at the
 * root the same resource that contains the object to which they are being added.
 */
public class AddCommandWrapper {
	public static Command wrap(final Command addCommand, final EObject owner) {
		CompoundCommand result = new CompoundCommand(addCommand.getLabel(), addCommand.getDescription());
		result.append(addCommand);

		final Resource targetResource = (owner == null)
				? null
				: owner.eResource();
		if (targetResource != null) {
			result.append(new CommandWrapper() {
				@Override
				protected Command createCommand() {
					Command result = IdentityCommand.INSTANCE;

					Collection<EObject> objectsToDetach = getObjectsToDetach(addCommand.getResult(), targetResource);

					if (!objectsToDetach.isEmpty()) {
						// don't need an editing domain because we don't want the remove to be overridden
						result = new RemoveCommand(null, targetResource.getContents(), objectsToDetach);
					}

					return result;
				}
			});
		}

		return result.unwrap();
	}

	private static Collection<EObject> getObjectsToDetach(Collection<?> objects, Resource targetResource) {
		Collection<EObject> result = new java.util.ArrayList<EObject>();

		for (Object next : objects) {
			if ((next instanceof InternalEObject) && (((InternalEObject) next).eDirectResource() == targetResource)) {
				// this object is added to another object in the same resource. Don't let it be cross-resource-contained
				// by the same resource that it's already attached to
				result.add((EObject) next);
			}
		}

		return result;
	}
}
