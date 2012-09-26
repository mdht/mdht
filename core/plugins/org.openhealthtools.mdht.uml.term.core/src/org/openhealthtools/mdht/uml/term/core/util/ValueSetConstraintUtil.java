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
 *     Rama Ramakrishnan  - 9/26/2012 - Literal checks for CS data type and inclusion of all /
 *     						subset of literal values, based on the property comment value (artf3432)
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.core.util;

import static org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil.getAllEnumerations;
import static org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil.getSmallEnumeration;
import static org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil.isCSType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;

public class ValueSetConstraintUtil {

	public static String getOCL(Property property) {
		String result;

		if (property.getType() instanceof Enumeration) {
			result = getOCLForEnumeration(property);
		} else if (isCSType(property)) {
			result = getOCLForCS(property);
		} else {
			result = getOCLForCD(property);
		}

		return result;
	}

	/**
	 * Method for creating OCL String for CS data type
	 * 
	 * @param property
	 * @return
	 */
	private static String getOCLForCS(Property property) {
		System.out.println("getOCLForCS for Property : " + property);

		StringBuffer body = new StringBuffer();
		boolean needsAnd = false;

		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
		if (valueSetConstraint == null) {
			return null;
		}

		if (valueSetConstraint.getReference() != null) {

			Enumeration referenceBaseEnum = valueSetConstraint.getReference().getBase_Enumeration();
			Iterable<EnumerationLiteral> literals = referenceBaseEnum != null
					? (isAllEnumGenerationRequired(property)
							? getAllEnumerations(referenceBaseEnum)
							: getSmallEnumeration(referenceBaseEnum))
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

	/**
	 * Returns true if all the literal values need to be specified in the OCL string
	 * 
	 * @param property
	 * @return
	 */
	private static boolean isAllEnumGenerationRequired(Property property) {
		boolean retVal = false;
		EList<Comment> comments = property.getOwnedComments();
		for (Comment c : comments) {
			if ((null != c) && (c.getBody().trim().length() > 0)) {
				if (c.getBody().trim().equalsIgnoreCase("ALLVALUES")) {
					retVal = true;
					break;
				}
			}
		}
		return retVal;

	}
}
