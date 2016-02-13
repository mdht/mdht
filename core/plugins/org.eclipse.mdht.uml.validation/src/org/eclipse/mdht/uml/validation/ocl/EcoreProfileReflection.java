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
package org.eclipse.mdht.uml.validation.ocl;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.ocl.uml.internal.UMLReflectionImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;

/**
 * Specialized UML reflection facility for Ecore semantics.
 */
class EcoreProfileReflection extends UMLReflectionImpl {

	EcoreProfileReflection(EcoreProfileEnvironment env) {
		super(env);
	}

	@Override
	public Classifier getOCLType(Object metaElement) {
		if (metaElement instanceof Property) {
			// Ecore doesn't support property redefinition to narrow the type
			metaElement = getRootDefinition((Property) metaElement);
		}

		return super.getOCLType(metaElement);
	}

	private Property getRootDefinition(Property property) {
		Property result = property;

		if (property.getOwner() instanceof Classifier) {
			final String name = property.getName();
			for (Iterator<Classifier> iter = ((Classifier) property.getOwner()).allParents().iterator(); iter.hasNext();) {
				Property redefined = iter.next().getAttribute(name, null);
				if (redefined != null) {
					result = redefined;
				}
			}
		}

		return result;
	}

	/**
	 * Because Ecore doesn't support property redefinition, extend the inherited implementation to filter out rename redefinitions and replace them
	 * with the renamed element. Redefinitions that don't rename the property are not a concern because determination of the property type is handled
	 * by the overridden {@link #getOCLType(Object)} method.
	 *
	 * @see <a href="https://www.projects.openhealthtools.org/sf/tracker/do/viewArtifact/projects.mdht/tracker.user_stories/artf3317">artf3317</a>
	 */
	@Override
	public List<Property> getAttributes(Classifier classifier) {
		List<Property> result = super.getAttributes(classifier);

		for (ListIterator<Property> iter = result.listIterator(); iter.hasNext();) {
			Property next = iter.next();

			// don't worry about implicit redefinition by name; property look-up is only a problem for renames, which require explicit redefinition
			if (isRenameRedefinition(next)) {
				// create a new list with redefinitions filtered out
				int index = iter.previousIndex();
				List<Property> filtered = new BasicEList<Property>(result.size());

				filtered.addAll(result.subList(0, index)); // don't add this redefinition
				filtered.add(getRenamedElement(next)); // substitute the original name
				while (iter.hasNext()) {
					// scan for remaining non-renames
					next = iter.next();
					if (isRenameRedefinition(next)) {
						filtered.add(getRenamedElement(next));
					} else {
						filtered.add(next);
					}
				}

				result = filtered;
				break;
			}
		}

		return result;
	}

	private boolean isRenameRedefinition(RedefinableElement element) {
		boolean result = false;

		List<RedefinableElement> redefined = element.getRedefinedElements();
		if (!redefined.isEmpty()) {
			String name = element.getName();
			for (RedefinableElement next : redefined) {
				if (!UML2Util.safeEquals(name, next.getName())) {
					result = true;
					break;
				}
			}
		}

		return result;
	}

	private <T extends RedefinableElement> T getRenamedElement(T element) {
		T result;

		@SuppressWarnings("unchecked")
		// obviously this is a safe cast
		java.lang.Class<? extends T> type = (java.lang.Class<? extends T>) element.getClass();

		// at each step, follow the first branch because that's how the UML-to-Ecore mapping works
		for (result = element; !result.getRedefinedElements().isEmpty();) {
			RedefinableElement next = result.getRedefinedElements().get(0);
			if (type.isInstance(next)) {
				result = type.cast(next);
			} else {
				break; // invalid redefinition
			}
		}

		return result;
	}
}
