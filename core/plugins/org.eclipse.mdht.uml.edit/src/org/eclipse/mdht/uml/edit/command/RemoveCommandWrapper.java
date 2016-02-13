/*******************************************************************************
 * Copyright (c) 2012,2015 Christian W. Damus.
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
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CutToClipboardCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * A wrapper for the removed command that ensures stereotype applications are cut out of the model
 * as well as their base elements, and that they will be pasted from the clipboard as expected in the case
 * that the remove command is used by a {@link CutToClipboardCommand}. This is implemented as a remove
 * wrapper rather than a cut-to-clipboard wrapper because the latter command is not delegated by the
 * editing domain to item providers.
 */
public class RemoveCommandWrapper implements UMLCommandWrapper {

	public boolean canWrap(Class<? extends Command> requestedType, CommandParameter parameter) {
		return requestedType == RemoveCommand.class;
	}

	public Command wrap(Command removeCommand, CommandParameter parameter) {
		// propagate the result of the first command (index 0, the removal of the cut elements)
		CompoundCommand result = new CompoundCommand(0, removeCommand.getLabel(), removeCommand.getDescription());

		final Map<EObject, Collection<? extends EObject>> byBaseElement = new java.util.HashMap<EObject, Collection<? extends EObject>>();
		final Map<Resource, Collection<EObject>> byResource = new java.util.HashMap<Resource, Collection<EObject>>();
		final Map<String, org.eclipse.emf.common.util.URI> businessNames = new java.util.HashMap<String, org.eclipse.emf.common.util.URI>();

		for (Iterator<?> iter = EcoreUtil.getAllContents(parameter.getCollection()); iter.hasNext();) {
			final Object next = iter.next();
			if (next instanceof NamedElement) {

				String businessName = NamedElementUtil.getPropertyValue((NamedElement) next, "label");

				if (businessName != null) {
					AddCommandWrapper.BusinessNamesCache.setBusinessNames((EObject) next, businessName);
					if (((NamedElement) next).eResource() != null) {
						businessNames.put(
							NamedElementUtil.getPropertyKey((NamedElement) next, "label"),
							UMLUtil.getPropertiesURI(((NamedElement) next).eResource()));
					}

				}

			}
		}

		// collect the stereotype applications of all the objects we're cutting
		for (Iterator<?> iter = EcoreUtil.getAllContents(parameter.getCollection()); iter.hasNext();) {
			final Object next = iter.next();
			if (next instanceof Element) {
				final Element element = (Element) next;
				Collection<? extends EObject> stereotypeApplications = element.getStereotypeApplications();

				if (!stereotypeApplications.isEmpty()) {
					// collect stereotypes per element for tracking on the clipboard
					byBaseElement.put(element, stereotypeApplications);

					// collect stereotypes per resource for removal from the resources that contain them
					for (EObject stereo : stereotypeApplications) {
						Collection<EObject> list = byResource.get(stereo.eResource());
						if (list == null) {
							list = new java.util.ArrayList<EObject>();
							byResource.put(stereo.eResource(), list);
						}

						list.add(stereo);
					}
				}
			}
		}

		if (!byBaseElement.isEmpty()) {
			result.append(new CommandWrapper(removeCommand) {
				@Override
				public void execute() {
					// first, grab a snapshot of the stereotype applications in case of eventual paste from the clipboard
					for (Map.Entry<EObject, Collection<? extends EObject>> next : byBaseElement.entrySet()) {
						// track these stereotype applications, because once the element's cut out of a resource
						// set context and put on the clipboard, it will no longer be able to find them
						AddCommandWrapper.StereotypesCache.setStereotypeApplications(next.getKey(), next.getValue());
					}

					// then, do the cut
					super.execute();
				}
			});
		} else {
			// do the remove
			result.append(removeCommand);
		}

		// and finally, remove the stereotype applications
		if (!byResource.isEmpty()) {
			for (Map.Entry<Resource, ? extends Collection<? extends EObject>> next : byResource.entrySet()) {
				// don't need an editing domain because we don't want the remove to be overridden
				result.append(new RemoveCommand(null, next.getKey().getContents(), next.getValue()));
			}
		}

		result.append(new CommandWrapper(removeCommand) {
			@Override
			public void execute() {
				for (String key : businessNames.keySet()) {
					removePropertyValue(businessNames.get(key), key);
				}
			}
		});

		return result.unwrap();
	}

	/**
	 * Copied from NamedElementUtils - We do not have a resource when processing so need to have an api that exposes URI
	 *
	 *
	 * @param uri
	 * @param key
	 * @return
	 */
	private static String removePropertyValue(URI uri, String key) {

		String properties = UMLUtil.readProperties(uri);

		if (properties != null) {
			Map<String, String> parsedProperties = UMLUtil.parseProperties(properties);
			String property = parsedProperties.remove(key);

			if (property != null && UMLUtil.writeProperties(uri, parsedProperties)) {
				int index = property.indexOf('=');

				if (index > 0) {
					return property.substring(index + 1).trim();
				}
			}
		}

		return null;
	}
}
