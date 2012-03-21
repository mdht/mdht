/*******************************************************************************
 * Copyright (c) 2012 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class TransformInnerClasses extends TransformAbstract {
	public TransformInnerClasses(TransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class umlClass) {

		if (umlClass.getOwner() instanceof Class) {
			Element owner = umlClass.getOwner();
			while (owner.getOwner() instanceof Class) {
				owner = owner.getOwner();
			}
			AnnotationsUtil innerClassAnnotations = new AnnotationsUtil(umlClass);

			AnnotationsUtil ownerAnnotations = new AnnotationsUtil(
				(Class) owner, AnnotationsUtil.CDA_ANNOTATION_SOURCE + "/" +
						UML2Util.getValidJavaIdentifier(umlClass.getQualifiedName()));

			ownerAnnotations.copyAnnotation(innerClassAnnotations);

			ownerAnnotations.saveAnnotations();

			removeModelElement(umlClass);
		}

		return umlClass;
	}
}
