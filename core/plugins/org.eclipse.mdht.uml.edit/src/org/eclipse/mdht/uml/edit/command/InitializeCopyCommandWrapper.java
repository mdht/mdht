/*******************************************************************************
 * Copyright (c) 2012,2015 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     Sean Muir - extended support for business names
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.command;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.InitializeCopyCommand;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * A initialize-copy-command wrapper that stashes the copies of stereotype applications previously ensured by the {@link CreateCopyCommandWrapper} for
 * the {@link AddCommandWrapper} to add to the resource of the eventual paste destination.
 */
public class InitializeCopyCommandWrapper implements UMLCommandWrapper {
	public boolean canWrap(Class<? extends Command> requestedType, CommandParameter parameter) {
		return requestedType == InitializeCopyCommand.class;
	}

	public Command wrap(Command initializeCopyCommand, CommandParameter parameter) {
		Command result = initializeCopyCommand;

		if (parameter.getOwner() instanceof Element) {
			final Element element = (Element) parameter.getOwner();
			final Collection<? extends EObject> stereotypeApplications = AddCommandWrapper.StereotypesCache.getStereotypeApplications(
				element);
			final String businessName = parameter.getOwner() instanceof NamedElement
					? NamedElementUtil.getPropertyValue((NamedElement) parameter.getOwner(), "label")
					: null;

			if (!stereotypeApplications.isEmpty() || businessName != null) {
				final CopyCommand.Helper copyHelper = (CopyCommand.Helper) parameter.getValue();

				class Impl extends CommandWrapper {
					Impl(Command delegate) {
						super(delegate);
					}

					@Override
					public void execute() {
						super.execute();

						// and make sure that the CacheAdapter knows the stereotype application copies
						EObject copy = copyHelper.getCopy(element);
						if (copy != null) {

							if (businessName != null) {
								AddCommandWrapper.BusinessNamesCache.setBusinessNames(copy, businessName);
							}

							if (stereotypeApplications.isEmpty()) {
								Collection<EObject> stereotypeCopies = new java.util.ArrayList<EObject>(
									stereotypeApplications.size());

								for (EObject next : stereotypeApplications) {
									EObject stereotypeCopy = copyHelper.getCopy(next);
									if (stereotypeCopy != null) {
										stereotypeCopies.add(stereotypeCopy);
									}
								}

								// put the stereotype copies where the add-command wrapper can find them at paste time
								AddCommandWrapper.StereotypesCache.setStereotypeApplications(copy, stereotypeCopies);
							}

						}
					}
				}

				result = new Impl(initializeCopyCommand);
			}
		}

		return result;
	}
}
