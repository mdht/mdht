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
 *                        - generate multiple OCL constraints from one property (artf3121)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.util.CodeSystemConstraintUtil;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;
import org.openhealthtools.mdht.uml.term.core.util.ValueSetConstraintUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * Transform UML property constraints for: multiplicity, type restriction, vocabulary.
 */
public class TransformPropertyConstraint extends TransformAbstract {
	/* Ordering is important, as the first handler that can create the initializer annotation wins. */
	private final List<PropertyConstraintHandler> constraintHandlers = Arrays.asList(
	/* new ConceptDomainConstraintHandler("CD"), */
	new CodeSystemConstraintHandler("CS"), //
		new ValueSetConstraintHandler("VS"), //
		new VocabSpecificationHandler("Vo"), //
		new PropertyValidationHandler("P"));

	public TransformPropertyConstraint(TransformerOptions options) {
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

		PropertyContext ctx = new PropertyContext(property);

		for (final PropertyConstraintHandler next : constraintHandlers) {
			ctx.addAnnotation(next);
			ctx.addConstraint(next);
		}

		ctx.done();

		return property;
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

	private boolean isEDType(Property property) {
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
			if ("datatypes::ED".equals(classifier.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	//
	// Nested types
	//

	class PropertyContext {
		private final Property property;

		private final List<Constraint> constraints = new java.util.ArrayList<Constraint>(3);

		private final Set<String> constraintNames = new java.util.HashSet<String>();

		private boolean initializerAdded;

		private boolean consumed;

		PropertyContext(Property property) {
			this.property = property;
		}

		final Property property() {
			return property;
		}

		String adaptConstraintName(String name, PropertyConstraintHandler handler) {
			String result = name;
			String suffix = handler.suffix();

			for (int i = 1; !constraintNames.add(result); i++) {
				result = name + suffix;
				suffix = handler.suffix() + i;
			}

			return result;
		}

		void addAnnotation(PropertyConstraintHandler handler) {
			// only create a single initializer annotation
			if (!initializerAdded) {
				initializerAdded = handler.addAnnotation(this);
			}
		}

		void addConstraint(PropertyConstraintHandler handler) {
			// create as many constraints as we can
			addIfNotNull(handler.addConstraint(this), constraints);
		}

		/* Consume our property, removing it from the transform target model. */
		void consume() {
			consumed = true;
		}

		void done() {
			if (consumed || !constraints.isEmpty()) {
				// consume the property
				removeModelElement(property());
			}
		}
	}

	abstract class PropertyConstraintHandler {
		private final String suffix;

		PropertyConstraintHandler(String suffix) {
			this.suffix = suffix;
		}

		final String suffix() {
			return suffix;
		}

		abstract boolean addAnnotation(PropertyContext context);

		abstract Constraint addConstraint(PropertyContext context);

		/**
		 * Configure the initializer annotation stereotype for the specified {@code property}.
		 * 
		 * @return <code>true</code> if any initialization annotation details were set; <code>false</code> if no details were set at all
		 */
		final boolean addAnnotation(Property property, String codeSystem, String codeSystemName, String code,
				String displayName, String codeSystemVersion) {

			boolean result = false;

			if (SEVERITY_INFO.equals(CDAModelUtil.getValidationSeverity(property))) {
				// omit annotation for MAY constraints
				return result;
			}

			AnnotationsUtil annotationsUtil = new AnnotationsUtil(property.getClass_());

			if (isEnumerationType(property)) {
				// fall back on the default value, if any, of an enumeration property
				ValueSpecification defaultValue = property.getDefaultValue();

				// this works for InstanceValues referencing EnumerationLiterals as well as for LiteralStrings
				if (defaultValue != null) {
					String enumCode = defaultValue.stringValue();
					if ((enumCode != null) && (enumCode.length() > 0)) {
						if ((code == null) || (code.length() == 0)) {
							// fall back
							code = enumCode;
						} else if (!code.equals(enumCode)) {
							// the constraint is overriding the default. Warn.
							String message = "Vocabulary constraint contradicts enumeration default value in property: " +
									property.getQualifiedName();
							Logger.log(Logger.WARNING, message);
						}
					}
				}
			}

			if (code != null) {
				if (isEnumerationType(property)) {
					annotationsUtil.setAnnotation(property.getName(), code);
					result = true;
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

			return result;
		}

		final Constraint addVocabConstraint(PropertyContext context, String oclVocabCondition) {
			final Property property = context.property();

			String ocl = oclVocabCondition;

			if (ocl == null || ocl.length() == 0) {
				// no vocabulary specified
				String message = "Could not generate vocabulary condition for property " + property.getQualifiedName();
				Logger.log(Logger.WARNING, message);
				return null;
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
				return null;
			}

			// if redefining parent template constraint, use parent constraint name to override.
			String constraintName = createInheritedConstraintName(property);

			return addConstraint(context, constraintName, body);
		}

		final Constraint addConstraint(PropertyContext context, String constraintName, StringBuffer body) {
			final Property property = context.property();

			Constraint result = null;

			if (body.length() > 0) {
				if (constraintName == null) {
					constraintName = createConstraintName(property);
				}

				// ensure uniqueness of the name
				constraintName = context.adaptConstraintName(constraintName, this);

				result = addOCLConstraint(property, body, constraintName);
			}

			return result;
		}
	}

	// class ConceptDomainConstraintHandler extends VocabConstraintHondler {
	//
	// }

	class CodeSystemConstraintHandler extends PropertyConstraintHandler {
		CodeSystemConstraintHandler(String suffix) {
			super(suffix);
		}

		@Override
		boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			String codeSystem = null;
			String codeSystemName = null;
			String codeSystemVersion = null;
			String code = null;
			String displayName = null;

			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
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
				code = codeSystemConstraint.getCode();
				displayName = codeSystemConstraint.getDisplayName();

				result = addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			}

			return result;
		}

		@Override
		Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null) {
				result = addVocabConstraint(context, CodeSystemConstraintUtil.getOCL(property));
			}

			return result;
		}
	}

	class ValueSetConstraintHandler extends PropertyConstraintHandler {
		ValueSetConstraintHandler(String suffix) {
			super(suffix);
		}

		@Override
		boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
			String codeSystem = null;
			String codeSystemName = null;
			String codeSystemVersion = null;
			String code = null;
			String displayName = null;

			if (valueSetConstraint != null) {
				if ((valueSetConstraint.getReference() != null) &&
						(valueSetConstraint.getReference().getCodeSystem() != null)) {
					CodeSystemVersion codeSystemDef = valueSetConstraint.getReference().getCodeSystem();
					codeSystem = codeSystemDef.getIdentifier();
					codeSystemName = codeSystemDef.getEnumerationName();
					// codeSystemVersion = codeSystemDef.getVersion();
				}

				result = addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			}

			return result;
		}

		@Override
		Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
			if (valueSetConstraint != null) {
				result = addVocabConstraint(context, ValueSetConstraintUtil.getOCL(property));
			}

			return result;
		}
	}

	@Deprecated
	class VocabSpecificationHandler extends PropertyConstraintHandler {
		VocabSpecificationHandler(String suffix) {
			super(suffix);
		}

		@Override
		boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);

			String codeSystem = null;
			String codeSystemName = null;
			String codeSystemVersion = null;
			String code = null;
			String displayName = null;

			if (vocabSpecification != null) {
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

				result = addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			}

			return result;
		}

		@Override
		Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
			if (vocabSpecification != null) {
				result = addVocabConstraint(context, getVocabSpecificationOCL(property, vocabSpecification));
			}

			return result;
		}
	}

	class PropertyValidationHandler extends PropertyConstraintHandler {
		PropertyValidationHandler(String suffix) {
			super(suffix);
		}

		@Override
		boolean addAnnotation(PropertyContext context) {
			// I don't handle the initializer
			return false;
		}

		@Override
		Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();

			// don't process properties that are part of an Association
			if (property.getAssociation() != null) {
				return null;
			}

			Property cdaProperty = getCDAProperty(property);
			Property inheritedProperty = getInheritedProperty(property);
			if (cdaProperty == null) {
				String message = "Cannot find CDA property for: " + property.getQualifiedName();
				Logger.log(Logger.ERROR, message);
				removeModelElement(property);
				return null;
			}
			if (inheritedProperty == null) {
				String message = "Cannot find inherited property for: " + property.getQualifiedName();
				Logger.log(Logger.ERROR, message);
				removeModelElement(property);
				return null;
			}
			if (property.getType() == null) {
				String message = "Property has no type: " + property.getQualifiedName();
				Logger.log(Logger.WARNING, message);
				// if property type is null, use type from redefined property
			}

			StringBuffer body = new StringBuffer();
			String selfName = "self." + cdaProperty.getName();
			String inheritedTypeQName = inheritedProperty.getType().getQualifiedName();
			String templateTypeQName = property.getType() == null
					? inheritedTypeQName
					: property.getType().getQualifiedName();

			// inherited property may also have non-conformant type
			if (!inheritedProperty.getType().conformsTo(cdaProperty.getType())) {
				// use the CDA property type
				inheritedTypeQName = cdaProperty.getType().getQualifiedName();
				templateTypeQName = inheritedTypeQName;
			} else if (property.getType() != null && !property.getType().conformsTo(inheritedProperty.getType())) {
				// don't log error for structural attributes with enumeration type
				if (!(property.getType() instanceof Enumeration)) {
					String message = "Property type does not conform to redefined property type: " +
							property.getQualifiedName();
					Logger.log(Logger.ERROR, message);
				}

				// use the inherited property type
				templateTypeQName = inheritedTypeQName;
			}

			/*
			 * Test for multiplicity restriction
			 */
			if (property.getLower() != inheritedProperty.getLower() ||
					property.getUpper() != inheritedProperty.getUpper()) {

				if (property.getUpper() == 0) {
					// element is prohibited in redefinition
					// place-holder for when this is supported in UML 2.2
				} else if (cdaProperty.getUpper() == 1) {
					// single-valued CDA property
					if (property.getLower() == 1) {
						if (property.getType() instanceof Enumeration) {
							body.append("isDefined('" + cdaProperty.getName() + "')");
						} else {
							body.append("not " + selfName + ".oclIsUndefined()");
						}
					}
				} else if (cdaProperty.getUpper() > 0 || cdaProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
					// multi-valued CDA property
					if (property.getLower() == 1 && property.getUpper() == 1) {
						body.append(selfName + "->size() = 1");
					} else if (property.getLower() >= 1) {
						body.append("not " + selfName + "->isEmpty()");
					}
				}
			}

			/*
			 * Test for type restriction
			 */
			if (!templateTypeQName.equals(inheritedTypeQName)) {
				if (body.length() > 0) {
					body.append(" and ");
				}

				if (cdaProperty.getUpper() == 1) {
					body.append(selfName + ".oclIsTypeOf(" + templateTypeQName + ")");
				} else {
					body.append(selfName + "->forAll(element | element.oclIsTypeOf(" + templateTypeQName + "))");
				}
			}

			/*
			 * Test for enumeration or primitive type with default value.
			 */
			if ((property.getType() instanceof Enumeration || property.getType() instanceof PrimitiveType) &&
					property.getDefault() != null) {

				AnnotationsUtil annotationsUtil = new AnnotationsUtil(property.getClass_());
				annotationsUtil.setAnnotation(property.getName(), property.getDefault());
				annotationsUtil.saveAnnotations();

				// read only (fixed) properties also generate an OCL constraint
				if (property.isReadOnly()) {
					if (body.length() > 0) {
						body.append(" and ");
					}
					if (property.getType() instanceof Enumeration) {
						body.append(selfName + "=" + templateTypeQName + "::" + property.getDefault());
					} else if (UMLUtil.isTypeString(property.getType())) {
						body.append(selfName + "='" + property.getDefault() + "'");
					} else {
						body.append(selfName + "=" + property.getDefault());
					}
				}

			}

			/*
			 * Test for <<nullFlavor>> stereotype
			 */
			String constraintName = null;
			Stereotype nullFlavor = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.NULL_FLAVOR);
			if (nullFlavor != null) {
				Object value = property.getValue(nullFlavor, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);
				String nullFlavorValue = null;
				if (value instanceof EnumerationLiteral) {
					nullFlavorValue = ((EnumerationLiteral) value).getName();
				} else if (value instanceof Enumerator) {
					nullFlavorValue = ((Enumerator) value).getName();
				}
				if (nullFlavorValue != null) {
					Class class_ = property.getClass_();
					if (class_ != null) {
						if (body.length() > 0) {
							body.append(" and ");
						}
						body.append("self." + property.getName() + ".nullFlavor = vocab::NullFlavor::" +
								nullFlavorValue);

						AnnotationsUtil annotationUtil = new AnnotationsUtil(class_);
						annotationUtil.setAnnotation(property.getName() + ".nullFlavor", nullFlavorValue);
						annotationUtil.saveAnnotations();

						// constraintName = class_.getName() + "_" + property.getName() + "_nullFlavor";
						// constraintName = class_.getName() + property.getName().substring(0, 1).toUpperCase() +
						// property.getName().substring(1) + "NullFlavor";
						constraintName = createConstraintName(class_, property.getName().substring(0, 1).toUpperCase() +
								property.getName().substring(1) + "NullFlavor");
					}
				}
			}

			/*
			 * Test for <<textValue>> stereotype
			 */
			Stereotype textValue = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.TEXT_VALUE);
			if (textValue != null && isEDType(property)) {
				String value = (String) property.getValue(textValue, ICDAProfileConstants.TEXT_VALUE_VALUE);
				if (value != null) {
					Class class_ = property.getClass_();
					if (class_ != null) {
						if (body.length() > 0) {
							body.append(" and ");
						}
						body.append("self." + property.getName() + ".getText() = " + "'" + value + "'");

						AnnotationsUtil annotationUtil = new AnnotationsUtil(class_);
						annotationUtil.setAnnotation(property.getName() + ".mixed", value);
						annotationUtil.saveAnnotations();
					}
				}
			}

			// this is a validation property; consume it
			context.consume();

			Constraint result = null;

			/*
			 * Only add OCL constraint if severity level is set.
			 */
			String severity = CDAModelUtil.getValidationSeverity(property);
			if (severity != null) {
				if (body.length() > 0) {
					// addOCLConstraint(property, body);
					addConstraint(context, constraintName, body);
				} else {
					// Constraints that have no multiplicity or type restriction
					// TODO is this adequate to catch MAY or SHOULD constraints?
					if (cdaProperty.getUpper() == 1) {
						if (property.getType() instanceof Enumeration) {
							body.append("isDefined('" + cdaProperty.getName() + "')");
						} else {
							body.append("not " + selfName + ".oclIsUndefined()");
						}
					} else {
						// body.append(selfName + "->exists(value : datatypes::ANY | not value.oclIsUndefined())");
						body.append("not " + selfName + "->isEmpty()");
					}
					result = addConstraint(context, constraintName, body);
				}
			}

			return result;
		}
	}
}
