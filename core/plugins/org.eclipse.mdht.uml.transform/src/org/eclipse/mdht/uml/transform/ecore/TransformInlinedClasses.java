/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Christian W. Damus - support nested datatype subclasses (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;

public class TransformInlinedClasses extends TransformAbstract {
	public TransformInlinedClasses(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object caseClass(Class umlClass) {

		// check for a nested class
		if (umlClass.getOwner() instanceof Class) {
			Element owner = umlClass.getOwner();
			while (owner.getOwner() instanceof Class) {
				owner = owner.getOwner();
			}
			AnnotationsUtil innerClassAnnotations = getEcoreProfile().annotate(umlClass);

			AnnotationsUtil ownerAnnotations = getEcoreProfile().annotate(
				owner, UML2Util.getValidJavaIdentifier(umlClass.getQualifiedName()));

			ownerAnnotations.copyAnnotation(innerClassAnnotations);

			ownerAnnotations.saveAnnotations();

			removeModelElement(umlClass);
		} else if (getBaseDatatype(umlClass, umlClass) != null) { // check for a shared sub-type of a CDA datatype
			// we've already generated property constraints from this data type, so just remove it
			removeModelElement(umlClass);
		}

		return umlClass;
	}
}
