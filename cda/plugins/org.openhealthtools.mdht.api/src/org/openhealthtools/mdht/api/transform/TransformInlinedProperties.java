/**
 * Copyright (c) 2011, 2012 JKM Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Sean Muir (JKM Software) - initial API and implementation
 *    Christian W. Damus - generate query invariants for in-line associations (artf3100)
 *                       - spurious constraint-name substring matches for severity (artf3185)
 *                       - implement terminology constraint dependencies (artf3030)
 *                       - support nested datatype subclasses (artf3350)
 *    Rama Ramakrishnan  - Made some operations public for access by sub classes
 *    					 - Also updated appendInlinedOCLConstraint to not create multiple constraints, when a constraint
 *    					   already exists for a  Property                   
 * $Id$
 */
package org.openhealthtools.mdht.api.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;

/**
 * Methods are copied from original TransformInlinedProperties due to visibility problems
 */
public class TransformInlinedProperties {

	/**
	 * This will be removed once we have a constraint based profle
	 * 
	 * @deprecated
	 * @param _class
	 * @return
	 */
	@Deprecated
	protected static boolean isInlineClassLocal(Class _class) {
		boolean inline = false;
		for (Comment comment : _class.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE")) {
				inline = true;
				break;
			}
		}

		return inline;

	}

	/**
	 * This will be removed once we establish a constraint based profile
	 * 
	 * @deprecated
	 * @param inlineClass
	 * @return
	 */
	@Deprecated
	protected static String getInlineFilterLocal(Class inlineClass) {
		String filter = "";
		for (Comment comment : inlineClass.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE&")) {
				String[] temp = comment.getBody().split("&");
				if (temp.length == 2) {
					filter = String.format("->select(%s)", temp[1]);
				}
				break;
			}
		}

		if ("".equals(filter)) {
			// search hierarchy
			for (Classifier next : inlineClass.getGenerals()) {
				if (next instanceof Class) {
					filter = getInlineFilterLocal((Class) next);
					if (!"".equals(filter)) {
						break;
					}
				}
			}
		}

		return filter;

	}

}
