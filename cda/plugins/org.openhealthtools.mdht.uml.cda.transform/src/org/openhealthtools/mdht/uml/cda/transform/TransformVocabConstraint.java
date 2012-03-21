/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
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
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.util.CodeSystemConstraintUtil;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;
import org.openhealthtools.mdht.uml.term.core.util.ValueSetConstraintUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class TransformVocabConstraint extends TransformAbstract {
	public TransformVocabConstraint(TransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}

		// only process properties that are owned by a Class
		if (property.getClass_() == null) {
			return null;
		}

		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.VOCAB_SPECIFICATION);

		String codeSystem = null;
		String codeSystemName = null;
		String codeSystemVersion = null;
		String code = null;
		String displayName = null;

		if (isEnumerationType(property)) {
			// prefer the default value, if any, of an enumeration property
			ValueSpecification defaultValue = property.getDefaultValue();

			// this works for InstanceValues referencing EnumerationLiterals as well as for LiteralStrings
			if (defaultValue != null) {
				code = defaultValue.stringValue();
				if ((code != null) && (code.length() == 0)) {
					code = null; // OK, forget it
				}
			}
		}

		if (codeSystemConstraint != null) {
			if (codeSystemConstraint.getReference() != null) {
				codeSystem = codeSystemConstraint.getReference().getIdentifier();
				codeSystemName = codeSystemConstraint.getReference().getEnumerationName();
				// codeSystemVersion = codeSystemConstraint.getReference().getVersion();
			} else {
				codeSystem = codeSystemConstraint.getIdentifier();
				codeSystemName = codeSystemConstraint.getName();
				// codeSystemVersion= codeSystemConstraint.getVersion();
			}
			String localCode = codeSystemConstraint.getCode();
			if ((localCode != null) && (localCode.length() > 0)) {
				if ((code != null) && !code.equals(localCode)) {
					// override the default and warn
					String message = "Code system constraint contradicts enumeration default value in property: " +
							property.getQualifiedName();
					Logger.log(Logger.WARNING, message);
				}
				code = localCode;
			}
			displayName = codeSystemConstraint.getDisplayName();

			addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			addConstraint(property);
			removeModelElement(property);
		} else if (valueSetConstraint != null) {
			if (valueSetConstraint.getReference() != null && valueSetConstraint.getReference().getCodeSystem() != null) {
				CodeSystemVersion codeSystemDef = valueSetConstraint.getReference().getCodeSystem();
				codeSystem = codeSystemDef.getIdentifier();
				codeSystemName = codeSystemDef.getEnumerationName();
				// codeSystemVersion = codeSystemDef.getVersion();
			}

			addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			addConstraint(property);
			removeModelElement(property);
		} else if (vocabSpecification != null) {
			codeSystem = (String) property.getValue(
				vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
			codeSystemName = (String) property.getValue(
				vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
			codeSystemVersion = (String) property.getValue(
				vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
			if (code == null) {
				code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
			}
			displayName = (String) property.getValue(
				vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);

			addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			addConstraint(property);
			removeModelElement(property);
		}

		return property;
	}

	private void addAnnotation(Property property, String codeSystem, String codeSystemName, String code,
			String displayName, String codeSystemVersion) {

		if (SEVERITY_INFO.equals(CDAModelUtil.getValidationSeverity(property))) {
			// omit annotation for MAY constraints
			return;
		}

		AnnotationsUtil annotationsUtil = new AnnotationsUtil(property.getClass_());

		if (code != null) {
			if (isEnumerationType(property)) {
				annotationsUtil.setAnnotation(property.getName(), code);
			} else {
				annotationsUtil.setAnnotation(property.getName() + ".code", code);
			}
		}

		if (!(TermProfileUtil.isCSType(property) || isEnumerationType(property))) {
			if (codeSystem != null) {
				annotationsUtil.setAnnotation(property.getName() + ".codeSystem", codeSystem);
			}
			if (codeSystemName != null) {
				annotationsUtil.setAnnotation(property.getName() + ".codeSystemName", codeSystemName);
			}
			if (codeSystemVersion != null) {
				annotationsUtil.setAnnotation(property.getName() + ".codeSystemVersion", codeSystemVersion);
			}
			if (displayName != null) {
				annotationsUtil.setAnnotation(property.getName() + ".displayName", displayName);
			}
		}

		annotationsUtil.saveAnnotations();
	}

	private void addConstraint(Property property) {
		String ocl = null;
		// if (conceptDomainConstraint != null) {
		// ocl = ConceptDomainConstraintUtil.getOCL(property);
		// }
		// else
		if (TermProfileUtil.getCodeSystemConstraint(property) != null) {
			ocl = CodeSystemConstraintUtil.getOCL(property);
		} else if (TermProfileUtil.getValueSetConstraint(property) != null) {
			ocl = ValueSetConstraintUtil.getOCL(property);
		} else {
			Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
			if (vocabSpecification != null) {
				ocl = getVocabSpecificationOCL(property, vocabSpecification);
			}
		}

		if (ocl == null || ocl.length() == 0) {
			// no vocabulary specified
			String message = "Could not generate vocabulary condition for property " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);
			return;
		}

		if (SEVERITY_INFO.equals(CDAModelUtil.getValidationSeverity(property)) && isCDType(property)) {
			// constraint only applies if code system is undefined. For enumeration types, the
			// code system is explicitly modelled
			ocl = "not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()";
		}

		StringBuffer body = getValueExpression(property, ocl);
		if (body == null) {
			String message = "Could not generate constraint for property: " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);
			return;
		}

		if (body.length() > 0) {
			// if redefining parent template constraint, use parent constraint name to override
			String constraintName = createInheritedConstraintName(property);
			addOCLConstraint(property, body, constraintName);
		}
	}

	private StringBuffer getValueExpression(Property property, String vocabExpression) {
		Property cdaProperty = CDAModelUtil.getCDAProperty(property);
		if (cdaProperty == null) {
			String message = "Cannot find CDA property for: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			return null;
		}
		if (property.getType() == null) {
			String message = "Property has no type: " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);
			// if property type is null, use type from redefined property
		}

		// check property type, including if redefined with restricted type
		if (!(isCDType(property) || isEnumerationType(property))) {
			String message = "Property is not of CD or enumeration type: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			return null;
		}

		StringBuffer body = new StringBuffer();
		String selfName = "self." + cdaProperty.getName();
		String cdaTypeQName = cdaProperty.getType().getQualifiedName();
		String templateTypeQName = property.getType() == null
				? cdaTypeQName
				: property.getType().getQualifiedName();

		if (property.getUpper() == 0) {
			// element is prohibited in redefinition
			// place-holder for when this is supported in UML 2.2
		} else if (cdaProperty.getUpper() == 1) {
			// single-valued CDA property
			final boolean required = property.getLower() == 1;
			if (required) {
				body.append("not ");
				body.append(selfName);
				body.append(".oclIsUndefined() and ");
			}
			body.append(selfName).append(".oclIsKindOf(").append(templateTypeQName).append(")");

			// no need to test this condition again if we already did, above
			if (!(required && isTestForDefinedValue(vocabExpression))) {
				body.append(" and ");
				body.append(LF);
				body.append("let value : ").append(templateTypeQName).append(" = ");
				body.append(selfName).append(".oclAsType(").append(templateTypeQName).append(") in ");
				body.append(LF);
				body.append(vocabExpression);
			}
		} else if (cdaProperty.getUpper() > 0 || cdaProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
			// multi-valued property

			if (property.getLower() == 1 && property.getUpper() == 1) {
				body.append(selfName);
				body.append("->size() = 1 and ");
			} else if (property.getLower() >= 1) {
				body.append("not ");
				body.append(selfName);
				body.append("->isEmpty() and ");
			}

			body.append(selfName);
			body.append("->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(").append(
				templateTypeQName).append(")");

			// no need to test this condition again
			if (!isTestForDefinedValue(vocabExpression)) {
				body.append(" and ");
				body.append(LF);
				body.append("let value : ").append(templateTypeQName);
				body.append(" = element.oclAsType(").append(templateTypeQName).append(") in ");
				body.append(LF);
				body.append(vocabExpression);
			}

			body.append(")"); // close the forAll iterator
		}

		return body;
	}

	private static boolean isTestForDefinedValue(String ocl) {
		return "not value.oclIsUndefined()".equals(ocl);
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	private String getVocabSpecificationOCL(Property property, Stereotype vocabSpecification) {
		String codeSystem = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
		String codeSystemName = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
		// String codeSystemVersion = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
		String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
		// String displayName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);

		StringBuffer body = new StringBuffer();
		boolean needsAnd = false;
		if (code != null && code.length() > 0) {
			body.append("value.code = '");
			body.append(code);
			body.append("'");
			needsAnd = true;
		}
		if (codeSystem != null && codeSystem.length() > 0) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystem = '");
			body.append(codeSystem);
			body.append("'");
			needsAnd = true;
		}

		/*
		 * Only add this constraint if codeSystem is not specified.
		 */
		if ((codeSystem == null || codeSystem.length() == 0) && codeSystemName != null && codeSystemName.length() > 0) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystemName = '");
			body.append(codeSystemName);
			body.append("'");
			needsAnd = true;
		}

		// if (codeSystemVersion != null && codeSystemVersion.length() > 0) {
		// if (needsAnd) {
		// body.append(" and ");
		// }
		// body.append("value.codeSystemVersion = '");
		// body.append(codeSystemVersion);
		// body.append("'");
		// }

		return body.toString();
	}

	private boolean isCDType(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type == null) {
			Property cdaProperty = getCDAProperty(property);
			if (cdaProperty != null) {
				type = (Classifier) cdaProperty.getType();
			} else {
				return false;
			}
		}

		List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
		allTypes.add(0, type);

		for (Classifier classifier : allTypes) {
			if ("datatypes::CD".equals(classifier.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	private boolean isEnumerationType(Property property) {
		return property.getType() instanceof Enumeration;
	}
}
