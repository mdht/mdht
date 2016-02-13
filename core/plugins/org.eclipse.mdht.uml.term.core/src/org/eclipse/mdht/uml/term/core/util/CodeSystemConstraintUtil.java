/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added CS type check
 *     Christian W. Damus - Generate OCL for enumeration properties (artf3099)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.util;

import static org.eclipse.mdht.uml.term.core.util.TermProfileUtil.getSmallEnumeration;
import static org.eclipse.mdht.uml.term.core.util.TermProfileUtil.isCSType;

import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

public class CodeSystemConstraintUtil {

	public static String getOCL(Property property) {
		String result;

		if (property.getType() instanceof Enumeration) {
			result = getOCLForEnumeration(property);
		} else {
			result = getOCLForCD(property);
		}

		return result;
	}

	private static String getOCLForCD(Property property) {
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

	private static String getOCLForEnumeration(Property property) {
		StringBuilder result = null;

		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
		if (codeSystemConstraint == null) {
			return null;
		}

		if ((codeSystemConstraint != null) && (codeSystemConstraint.getReference() != null)) {
			result = new StringBuilder();

			final String enumTypeName = property.getType().getQualifiedName();

			final Enumeration base = codeSystemConstraint.getReference().getBase_Enumeration();
			final Iterable<EnumerationLiteral> literals = getSmallEnumeration(base);

			if (literals != null) {
				boolean needsOr = false;
				for (EnumerationLiteral next : base.getOwnedLiterals()) {
					// only consider literals that represent value-set codes
					ValueSetCode code = TermProfileUtil.getValueSetCode(next);

					if (code != null) {
						if (needsOr) {
							result.append(" or ");
						}
						result.append("value = ");

						// the enumeration to compare against is in the namespace of the
						// property type, not the value-set constraint
						result.append(enumTypeName).append(NamedElement.SEPARATOR).append(next.getName());

						needsOr = true;
					}
				}
			}

			// even if there were literals, maybe they weren't stereotyped as <<valueSetCode>>
			if (result.length() == 0) {
				String code = codeSystemConstraint.getCode();
				if ((code != null) && (code.length() > 0)) {
					result.append("value = ");

					// the enumeration to compare against is in the namespace of the
					// property type, not the value-set constraint
					result.append(enumTypeName).append(NamedElement.SEPARATOR).append(code);
				} else {
					result.append("not value.oclIsUndefined()");
				}
			}
		}

		return (result == null)
				? null
				: result.toString();
	}

}
