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
 *                        - discriminate multiple property constraints (artf3185)
 *                        - implement terminology constraint dependencies (artf3030)
 *                        - ensure terminology initializer for property constraints (artf3233)
 *                        - support nested datatype subclasses (artf3350)
 *     Dan Brown (Ai)     - update constraint override logic
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.cda.transform.internal.Logger;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.term.transform.ecore.TransformPropertyTerminologyConstraint;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.AnnotationsUtil;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

/**
 * Transform UML property constraints for: multiplicity, type restriction, vocabulary.
 */
public class TransformCDAPropertyConstraint extends TransformPropertyTerminologyConstraint {
	public TransformCDAPropertyConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@SuppressWarnings("deprecation")
	@Override
	protected PropertyConstraintHandler createConstraintHandler(ValidationStereotypeKind stereotypeKind) {
		PropertyConstraintHandler result;

		switch (stereotypeKind) {
			case PROPERTY:
				result = new PropertyValidationHandler("P");
				break;
			case VOCAB_SPECIFICATION:
				result = new VocabSpecificationHandler("Vo");
				break;
			default:
				result = super.createConstraintHandler(stereotypeKind);
				break;
		}

		return result;
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

	private boolean isTextProperty(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type == null) {
			Property cdaProperty = getBaseProperty(property);
			if (cdaProperty != null) {
				type = (Classifier) cdaProperty.getType();
			} else {
				return false;
			}
		}

		List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
		allTypes.add(0, type);

		for (Classifier classifier : allTypes) {
			if ("datatypes::ED".equals(classifier.getQualifiedName()) ||
					"datatypes::EN".equals(classifier.getQualifiedName()) ||
					"datatypes::ON".equals(classifier.getQualifiedName()) ||
					"datatypes::AD".equals(classifier.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	//
	// Nested types
	//

	@Deprecated
	class VocabSpecificationHandler extends PropertyConstraintHandler {
		VocabSpecificationHandler(String suffix) {
			super(ValidationStereotypeKind.VOCAB_SPECIFICATION, suffix);
		}

		@Override
		protected boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			Stereotype vocabSpecification = getEcoreProfile().getAppliedValidationStereotype(
				property, ValidationStereotypeKind.VOCAB_SPECIFICATION);

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
					code = (String) property.getValue(
						vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
				}
				displayName = (String) property.getValue(
					vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);

				result = addAnnotation(
					property, ValidationStereotypeKind.VOCAB_SPECIFICATION, codeSystem, codeSystemName, code,
					displayName, codeSystemVersion);
			}

			return result;
		}

		@Override
		protected Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			Stereotype vocabSpecification = getEcoreProfile().getAppliedValidationStereotype(
				property, ValidationStereotypeKind.VOCAB_SPECIFICATION);
			if (vocabSpecification != null) {
				result = addVocabConstraint(
					context, ValidationStereotypeKind.VOCAB_SPECIFICATION,
					getVocabSpecificationOCL(property, vocabSpecification));
			}

			return result;
		}
	}

	class PropertyValidationHandler extends PropertyConstraintHandler {
		PropertyValidationHandler(String suffix) {
			super(ValidationStereotypeKind.PROPERTY, suffix);
		}

		@Override
		protected boolean addAnnotation(PropertyContext context) {
			// I don't handle the initializer
			return false;
		}

		@Override
		protected Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();

			// don't process properties that are part of an Association
			if (property.getAssociation() != null) {
				return null;
			}

			Property cdaProperty = getBaseProperty(property);
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
			if (inheritedProperty.getType() == null) {
				String message = "Redefined property has no type: " + inheritedProperty.getQualifiedName();
				Logger.log(Logger.ERROR, message);
				// if property type is null, use type from redefined property
			}
			if (property.getType() == null) {
				String message = "Property has no type: " + property.getQualifiedName();
				Logger.log(Logger.WARNING, message);
				removeModelElement(property);
				return null;
			}

			final Classifier inheritedPropertyType = getNormalizedType(inheritedProperty);
			final Classifier propertyType = getNormalizedType(property);

			StringBuffer body = new StringBuffer();
			String selfName = "self." + cdaProperty.getName();
			String inheritedTypeQName = inheritedPropertyType.getQualifiedName();
			String templateTypeQName = (propertyType == null)
					? inheritedTypeQName
					: propertyType.getQualifiedName();

			// inherited property may also have non-conformant type
			if (!inheritedPropertyType.conformsTo(cdaProperty.getType())) {
				// use the CDA property type
				inheritedTypeQName = cdaProperty.getType().getQualifiedName();
				templateTypeQName = inheritedTypeQName;
			} else if ((propertyType != null) && !propertyType.conformsTo(inheritedPropertyType)) {
				// don't log error for structural attributes with enumeration type
				if (!(propertyType instanceof Enumeration)) {
					String message = "Property type does not conform to redefined property type: " +
							property.getQualifiedName();
					Logger.log(Logger.ERROR, message);
				}

				// use the inherited property type
				templateTypeQName = inheritedTypeQName;
			}

			// Have we changed the property cardinality

			if (property.getLower() != inheritedProperty.getLower() ||
					property.getUpper() != inheritedProperty.getUpper()) {

				// If CDA property upper is 1 - treat as property
				// else treat as collection
				if (cdaProperty.getUpper() == 1) {
					if (property.getLower() == 1) {
						if (propertyType instanceof Enumeration) {
							body.append("isDefined('" + cdaProperty.getName() + "')");
						} else {
							body.append("not " + selfName + ".oclIsUndefined()");
						}
					} else if (property.getUpper() == 0) {
						if (propertyType instanceof Enumeration) {
							body.append(" not isDefined('" + cdaProperty.getName() + "')");
						} else {
							body.append(" " + selfName + ".oclIsUndefined()");
						}
					}
				} else {

					// Keep this for some level of backwards compatibility else check size for upper and lower
					if (property.getLower() == 1 && property.getUpper() == 1) {
						body.append(selfName + "->size() = 1");
					} else {
						if (property.getLower() != 0) {
							// "..->size() >= 0" is an unnecessary tautology, so skip this case
							body.append(selfName + "->size() >= " + property.getLower());
						}
						if (property.getUpper() != LiteralUnlimitedNatural.UNLIMITED) {
							if (body.length() > 0) {
								body.append(" and ");
							}
							body.append(selfName + "->size() <= " + property.getUpper());
						}
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
			if (((propertyType instanceof Enumeration) || (propertyType instanceof PrimitiveType)) &&
					(property.getDefault() != null)) {

				AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(property.getClass_());
				annotationsUtil.setAnnotation(property.getName(), property.getDefault());
				annotationsUtil.saveAnnotations();

				// read only (fixed) properties also generate an OCL constraint
				if (property.isReadOnly()) {
					if (body.length() > 0) {
						body.append(" and ");
					}
					if (propertyType instanceof Enumeration) {
						body.append(selfName + "=" + templateTypeQName + "::" + property.getDefault());
					} else if (isTypeString(propertyType)) {
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
			Stereotype nullFlavor = getEcoreProfile().getAppliedValidationStereotype(
				property, ValidationStereotypeKind.NULL_FLAVOR);
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
						body.append(
							"self." + property.getName() + ".nullFlavor = vocab::NullFlavor::" + nullFlavorValue);

						AnnotationsUtil annotationUtil = getEcoreProfile().annotate(class_);
						annotationUtil.setAnnotation(property.getName() + ".nullFlavor", nullFlavorValue);
						annotationUtil.saveAnnotations();

						// constraintName = class_.getName() + "_" + property.getName() + "_nullFlavor";
						// constraintName = class_.getName() + property.getName().substring(0, 1).toUpperCase() +
						// property.getName().substring(1) + "NullFlavor";
						constraintName = createConstraintName(property, "NullFlavor");
						// class_, property.getName().substring(0, 1).toUpperCase() +
						// property.getName().substring(1) + "NullFlavor", "");
					}
				}
			}

			/*
			 * Test for <<textValue>> stereotype
			 */
			Stereotype textValue = getEcoreProfile().getAppliedValidationStereotype(
				property, ValidationStereotypeKind.TEXT_VALUE);
			if (textValue != null && isTextProperty(property)) {
				String value = (String) property.getValue(textValue, ICDAProfileConstants.TEXT_VALUE_VALUE);
				if (value != null) {
					Class class_ = property.getClass_();
					if (class_ != null) {
						if (body.length() > 0) {
							body.append(" and ");
						}
						if (cdaProperty.getUpper() == 1) {
							body.append("self." + cdaProperty.getName() + ".getText() = " + "'" + value + "'");
						} else {
							body.append(
								"self." + cdaProperty.getName() + "->reject(" + cdaProperty.getName() +
										" : datatypes::" + cdaProperty.getType().getName() + " |" +
										cdaProperty.getName() + ".getText()='" + value + "')->size() = 0");
						}
						AnnotationsUtil annotationUtil = getEcoreProfile().annotate(class_);
						annotationUtil.setAnnotation(property.getName() + ".mixed", value);
						annotationUtil.saveAnnotations();
					}
				}
			}

			// this is a validation property; consume it
			context.consume();

			Constraint result = null;

			/*
			 * add OCL constraint if severity level is set else assume it is an override and add a constraint that will not fire
			 */
			ValidationSeverityKind severity = getEcoreProfile().getValidationSeverity(
				property, ValidationStereotypeKind.PROPERTY);
			if (severity != null) {
				if (body.length() > 0) {
					// addOCLConstraint(property, body);
					addConstraint(context, ValidationStereotypeKind.PROPERTY, constraintName, body);
				} else {
					// Constraints that have no multiplicity or type restriction
					// TODO is this adequate to catch MAY or SHOULD constraints?
					if (cdaProperty.getUpper() == 1) {
						if (propertyType instanceof Enumeration) {
							body.append("isDefined('" + cdaProperty.getName() + "')");
						} else {
							body.append("not " + selfName + ".oclIsUndefined()");
						}
					} else {
						// body.append(selfName + "->exists(value : datatypes::ANY | not value.oclIsUndefined())");
						body.append("not " + selfName + "->isEmpty()");
					}
					result = addConstraint(context, ValidationStereotypeKind.PROPERTY, constraintName, body);
				}
			} else {
				// property severity is empty
				ValidationSeverityKind csSeverity = getEcoreProfile().getValidationSeverity(
					property, ValidationStereotypeKind.CODE_SYSTEM);
				ValidationSeverityKind vsSeverity = getEcoreProfile().getValidationSeverity(
					property, ValidationStereotypeKind.VALUE_SET);
				if (csSeverity == null && vsSeverity == null) {
					// property and terminology (codeSystem/valueSet) severities are empty
					// so we can safely override the property for the sake of removal
					// note: w/o this check we would generate a pointless true property for every constraint which includes a terminology check only
					body = new StringBuffer();
					body.append("true");
					result = addConstraint(context, ValidationStereotypeKind.PROPERTY, constraintName, body);
				}
			}

			return result;
		}
	}

	public boolean isTypeString(Type type) {
		Stereotype eDataType = EcoreTransformUtil.getEcoreStereotype(
			type, org.eclipse.uml2.uml.util.UMLUtil.STEREOTYPE__E_DATA_TYPE);
		String instanceClassName = null;
		if (type.isStereotypeApplied(eDataType)) {
			instanceClassName = (String) type.getValue(
				eDataType, org.eclipse.uml2.uml.util.UMLUtil.TAG_DEFINITION__INSTANCE_CLASS_NAME);
		}
		return UMLUtil.isTypeString(type) || "java.lang.String".equals(instanceClassName);
	}
}
