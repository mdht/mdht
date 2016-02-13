/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Substitution;

public class TransformClass extends TransformAbstract {
	public TransformClass(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object caseClass(Class umlClass) {
		/*
		 * Remove annotations added into the CDA Consolidation model.
		 * There were to support consolidation process, not runtime code.
		 */
		EAnnotation annotation = umlClass.getEAnnotation("sourceClass");
		if (annotation != null) {
			umlClass.getEAnnotations().remove(annotation);
		}

		/*
		 * Remove relationships added into the CDA Consolidation model.
		 * There were to support consolidation process, not runtime code.
		 */
		for (Substitution substitution : umlClass.getSubstitutions()) {
			removeModelElement(substitution);
		}

		/*
		 * Scan for and remove invalid property redefines relationships.
		 * These cause error in Ecore genmodel reload.
		 */
		for (Property property : umlClass.getOwnedAttributes()) {
			List<Property> redefines = property.getRedefinedProperties();
			for (Property redef : new ArrayList<Property>(redefines)) {
				// redef reference cannot be resolved, or invalid redefine
				if (redef.eIsProxy() || !umlClass.getGenerals().contains(redef.getClass_())) {
					redefines.remove(redef);
				}

				// TODO isConsistentWith() seems to return false when OK
				// if (redef.eIsProxy() || !property.isConsistentWith(redef)) {
				// redefines.remove(redef);
				// }
			}
		}

		return umlClass;
	}
}
