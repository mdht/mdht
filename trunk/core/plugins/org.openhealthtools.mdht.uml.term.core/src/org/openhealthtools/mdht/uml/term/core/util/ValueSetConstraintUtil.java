/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.core.util;

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
		
		if (valueSetConstraint.getReference() != null 
				&& valueSetConstraint.getReference().getCodeSystem() != null) {
			CodeSystemVersion codeSystem = valueSetConstraint.getReference().getCodeSystem();
			String id = codeSystem.getIdentifier();
			String name = codeSystem.getBase_Enumeration().getName();
//			String version = codeSystem.getVersion();

			if (id != null && id.length() > 0) {
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
			if ((id == null || id.length() == 0)
					&& name != null && name.length() > 0) {
				if (needsAnd) {
					body.append(" and ");
				}
				body.append("value.codeSystemName = '");
				body.append(name);
				body.append("'");
				needsAnd = true;
			}
			
//			if (version != null && version.length() > 0) {
//				if (needsAnd) {
//					body.append(" and ");
//				}
//				body.append("value.codeSystemVersion = '");
//				body.append(version);
//				body.append("'");
//			}

			if (valueSetConstraint.getReference().getBase_Enumeration()
					.getOwnedLiterals().size() < 20) {
				if (needsAnd) {
					body.append(" and (");
				}
				boolean firstCode = true;
				for (EnumerationLiteral literal : valueSetConstraint.getReference()
						.getBase_Enumeration().getOwnedLiterals()) {
					if (firstCode) {
						firstCode = false;
					}
					else {
						body.append(" or ");
					}
					body.append("value.code = '");
					body.append(literal.getName());
					body.append("'");
				}
				body.append(")");
			}
			
		}
		
		return body.toString();
	}
}
