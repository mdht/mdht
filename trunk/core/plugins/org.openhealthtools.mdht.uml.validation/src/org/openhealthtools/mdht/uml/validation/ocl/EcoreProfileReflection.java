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
package org.openhealthtools.mdht.uml.validation.ocl;

import java.util.Iterator;

import org.eclipse.ocl.uml.internal.UMLReflectionImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

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
}
