/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Rama Ramakrishnan  - 1/27/2012 - Added check for CS data type
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.core.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;

public class ValueSetConstraintUtil {

	public static final String getOCL(Property property) {
		StringBuffer body = new StringBuffer();
		boolean needsAnd = false;

		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
		if (valueSetConstraint == null) {
			return null;
		}

		if (valueSetConstraint.getReference() != null && valueSetConstraint.getReference().getCodeSystem() != null) {
			CodeSystemVersion codeSystem = valueSetConstraint.getReference().getCodeSystem();
			String id = codeSystem.getIdentifier();
			String name = codeSystem.getEnumerationName();
			// String version = codeSystem.getVersion();

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

			List<EnumerationLiteral> literals = valueSetConstraint.getReference().getBase_Enumeration().getOwnedLiterals();
			if (literals.size() > 0 && literals.size() < 20) {
				if (needsAnd) {
					body.append(" and (");
				}
				boolean firstCode = true;
				for (EnumerationLiteral literal : valueSetConstraint.getReference().getBase_Enumeration().getOwnedLiterals()) {
					if (firstCode) {
						firstCode = false;
					} else {
						body.append(" or ");
					}
					body.append("value.code = '");
					body.append(literal.getName());
					body.append("'");
				}
				if (needsAnd) {
					body.append(")");
				}

			} else {
				if (needsAnd) {
					body.append(" and ");
				}
				body.append("not value.code.oclIsUndefined()");
			}

		}

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
