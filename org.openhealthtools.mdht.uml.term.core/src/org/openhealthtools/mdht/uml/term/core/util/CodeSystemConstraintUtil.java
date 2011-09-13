/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added CS type check
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.core.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;

public class CodeSystemConstraintUtil {

	public static final String getOCL(Property property) {
		StringBuffer body = new StringBuffer();
		boolean needsAnd = false;

		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
		if (codeSystemConstraint == null) {
			return null;
		}

		String id = codeSystemConstraint.getIdentifier();
		String name = codeSystemConstraint.getName();
		String code = codeSystemConstraint.getCode();
		// String version = codeSystemConstraint.getVersion();

		if (codeSystemConstraint.getReference() != null) {
			id = codeSystemConstraint.getReference().getIdentifier();
			name = codeSystemConstraint.getReference().getEnumerationName();
			// version = codeSystemConstraint.getReference().getVersion();
		}

		if (code != null && code.length() > 0) {
			body.append("value.code = '");
			body.append(code);
			body.append("'");
			needsAnd = true;
		}

		if (id != null && id.length() > 0 && !isCSType(property)) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystem = '");
			body.append(id);
			body.append("'");
			needsAnd = true;
		}

		/*
		 * Only add this constraint if codeSystem is not specified.
		 */
		if ((id == null || id.length() == 0) && name != null && name.length() > 0 && !isCSType(property)) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystemName = '");
			body.append(name);
			body.append("'");
			needsAnd = true;
		}

		// if (version != null && version.length() > 0) {
		// if (needsAnd) {
		// body.append(" and ");
		// }
		// body.append("value.codeSystemVersion = '");
		// body.append(version);
		// body.append("'");
		// }

		return body.toString();
	}

	public static boolean isCSType(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type != null) {
			List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
			allTypes.add(0, type);
			for (Classifier classifier : allTypes) {
				if ("datatypes::CS".equals(classifier.getQualifiedName())) {
					return true;
				}
			}
		}
		return false;
	}
}
