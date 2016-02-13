/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Rama Ramakrishnan  - 1/27/2012 - Added check for CS data type
 *     Christian W. Damus - Generate OCL for enumeration properties (artf3099)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.util;

import static org.eclipse.mdht.uml.term.core.util.TermProfileUtil.getSmallEnumeration;
import static org.eclipse.mdht.uml.term.core.util.TermProfileUtil.isCSType;

import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

public class ValueSetConstraintUtil {

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

			Iterable<EnumerationLiteral> literals = valueSetConstraint.getReference().getBase_Enumeration() != null
					? getSmallEnumeration(valueSetConstraint.getReference().getBase_Enumeration())
					: null;
			if (literals != null) {
				if (needsAnd) {
					body.append(" and (");
				}
				boolean firstCode = true;
				for (EnumerationLiteral literal : literals) {
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

	private static String getOCLForEnumeration(Property property) {
		StringBuilder result = null;

		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
		if ((valueSetConstraint != null) && (valueSetConstraint.getReference() != null)) {
			result = new StringBuilder();

			final String enumTypeName = property.getType().getQualifiedName();

			final Enumeration base = valueSetConstraint.getReference().getBase_Enumeration();
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
				result.append("not value.oclIsUndefined()");
			}
		}

		return (result == null)
				? null
				: result.toString();
	}
}
