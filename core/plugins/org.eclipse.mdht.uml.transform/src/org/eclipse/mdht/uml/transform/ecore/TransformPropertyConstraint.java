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
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.mdht.uml.transform.internal.Logger;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Transform UML property constraints for: multiplicity, type restriction, vocabulary.
 */
public abstract class TransformPropertyConstraint extends TransformAbstract {
	/* Ordering is important, as the first handler that can create the initializer annotation wins. */
	private final List<PropertyConstraintHandler> constraintHandlers = new java.util.ArrayList<PropertyConstraintHandler>();

	public TransformPropertyConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);

		createConstraintHandlers();
	}

	private void createConstraintHandlers() {
		// ordering is important, as the first handler that can create the initializer annotation wins
		@SuppressWarnings("deprecation")
		final List<ValidationStereotypeKind> kinds = Arrays.asList(
			// ValidationStereotypeKind.CONCEPT_DOMAIN,
			ValidationStereotypeKind.CODE_SYSTEM, ValidationStereotypeKind.VALUE_SET,
			ValidationStereotypeKind.VOCAB_SPECIFICATION, ValidationStereotypeKind.PROPERTY);

		for (ValidationStereotypeKind next : kinds) {
			addIfNotNull(createConstraintHandler(next), constraintHandlers);
		}
	}

	/**
	 * <p>
	 * Implemented by subclasses to create a constraint handler, if supported, for the specified validation stereotype.
	 * </p>
	 * <p>
	 * <b>NOTE</b> that this method is called by the superclass constructor, so the subclass instance will not yet be initialized. Therefore,
	 * implementers of this method may not rely on instance variables of their class having been initialized.
	 * </p>
	 *
	 * @param stereotypeKind
	 *            the kind of validation stereotype for which to create a constraint handler
	 *
	 * @return the appropriate constraint handler, or {@code null} if the specified validation stereotype is not supported
	 */
	protected abstract PropertyConstraintHandler createConstraintHandler(ValidationStereotypeKind stereotypeKind);

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
		Property baseProperty = getBaseProperty(property);
		if (baseProperty == null) {
			String message = "Cannot find base property for: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			return null;
		}
		if (property.getType() == null) {
			String message = "Property has no type: " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);
			// if property type is null, use type from redefined property
		}

		// check property type, including if redefined with restricted type
		if (!(isCodedType(property) || isEnumerationType(property))) {
			String message = "Property is not of CD or enumeration type: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			return null;
		}

		// both CD types and enumeration types are classifiers
		final Classifier propertyType = getNormalizedType(property);

		StringBuffer body = new StringBuffer();
		String selfName = "self." + baseProperty.getName();
		String baseTypeQName = baseProperty.getType().getQualifiedName();
		String templateTypeQName = (propertyType == null)
				? baseTypeQName
				: propertyType.getQualifiedName();

		if (property.getUpper() == 0) {
			// element is prohibited in redefinition
			// place-holder for when this is supported in UML 2.2
		} else if (baseProperty.getUpper() == 1) {
			// single-valued base property

			// No terminology constraint can be satisfied by a property that actually is null
			body.append("not ").append(selfName).append(".oclIsUndefined() and ");
			body.append(selfName).append(".oclIsKindOf(").append(templateTypeQName).append(")");

			// no need to test this condition again if we already did, above
			if (!isTestForDefinedValue(vocabExpression)) {
				body.append(" and ");
				body.append(LF);
				body.append("let value : ").append(templateTypeQName).append(" = ");
				body.append(selfName).append(".oclAsType(").append(templateTypeQName).append(") in ");
				body.append(LF);
				body.append(vocabExpression);
			}
		} else if (baseProperty.getUpper() > 0 || baseProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
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

	protected Classifier getNormalizedType(Property property) {
		Classifier result = (property.getType() instanceof Classifier)
				? (Classifier) property.getType()
				: null;

		if (result != null) {
			Classifier baseDatatype = getBaseDatatype(result, property);
			if (baseDatatype != null) {
				// we have already or will copy constraints from the subclass; we don't need the subclass, here
				result = baseDatatype;
			}
		}

		return result;
	}

	protected abstract boolean isCodedType(Property property);

	protected abstract boolean isSimpleCodedType(Property property);

	private boolean isEnumerationType(Property property) {
		return property.getType() instanceof Enumeration;
	}

	//
	// Nested types
	//

	protected final class PropertyContext {
		private final Property property;

		// need to preserve the order in which constraints are added to the map
		private final Map<ValidationStereotypeKind, Constraint> constraints = new java.util.LinkedHashMap<ValidationStereotypeKind, Constraint>();

		private final Set<String> constraintNames = new java.util.HashSet<String>();

		private boolean initializerAdded;

		private boolean consumed;

		PropertyContext(Property property) {
			this.property = property;
		}

		public final Property property() {
			return property;
		}

		public String adaptConstraintName(String name, PropertyConstraintHandler handler) {
			String result = name;
			String suffix = handler.suffix();

			for (int i = 1; !constraintNames.add(result); i++) {
				result = name + suffix;
				suffix = handler.suffix() + i;
			}

			return result;
		}

		public void addAnnotation(PropertyConstraintHandler handler) {
			// only create a single initializer annotation
			if (!initializerAdded) {
				initializerAdded = handler.addAnnotation(this);
			}
		}

		public void addConstraint(PropertyConstraintHandler handler) {
			// create as many constraints as we can
			putIfNotNull(handler.kind(), handler.addConstraint(this), constraints);
		}

		/* Consume our property, removing it from the transform target model. */
		public void consume() {
			consumed = true;
		}

		public void done() {
			if (consumed || !constraints.isEmpty()) {
				// consume the property
				removeModelElement(property());
			}

			setUpConstraintDependencies();

			constraints.clear();
		}

		// artf3030: Ensure that the <<propertyValidation>> constraint fires
		// before any of its dependents and record the dependencies
		private void setUpConstraintDependencies() {
			if (constraints.size() > 1) {
				Constraint propertyValidation = constraints.get(ValidationStereotypeKind.PROPERTY);
				if (propertyValidation != null) {
					Namespace context = propertyValidation.getContext();

					// remember that the map is in insertion order!
					Constraint firstConstraint = constraints.values().iterator().next();

					// do we need to sort anything?
					if (firstConstraint != propertyValidation) {
						if (context != null) {
							EList<Constraint> constraints = context.getOwnedRules();
							int index = constraints.indexOf(firstConstraint);
							if (index >= 0) {
								// put the property constraint there
								constraints.move(index, propertyValidation);
							}
						}
					}

					// create dependency annotations
					AnnotationsUtil annotations = getEcoreProfile().annotate(context);
					for (Constraint next : constraints.values()) {
						if (next != propertyValidation) {
							setConstraintDependency(annotations, next.getName(), propertyValidation.getName());
						}
					}
					annotations.saveAnnotations();
				}
			}
		}
	}

	protected abstract class PropertyConstraintHandler {
		private final ValidationStereotypeKind kind;

		private final String suffix;

		protected PropertyConstraintHandler(ValidationStereotypeKind kind, String suffix) {
			this.kind = kind;
			this.suffix = suffix;
		}

		public final ValidationStereotypeKind kind() {
			return kind;
		}

		final String suffix() {
			return suffix;
		}

		protected abstract boolean addAnnotation(PropertyContext context);

		protected abstract Constraint addConstraint(PropertyContext context);

		/**
		 * Configure the initializer annotation stereotype for the specified {@code property}.
		 *
		 * @return <code>true</code> if any initialization annotation details were set; <code>false</code> if no details were set at all
		 */
		protected final boolean addAnnotation(Property property, ValidationStereotypeKind stereotypeKind,
				String codeSystem, String codeSystemName, String code, String displayName, String codeSystemVersion) {

			boolean result = false;

			if (getEcoreProfile().getValidationSeverity(property, stereotypeKind) == ValidationSeverityKind.INFO) {
				ValidationSeverityKind propertySeverity = getEcoreProfile().getValidationSeverity(
					property, ValidationStereotypeKind.PROPERTY);
				if ((propertySeverity == null) || (propertySeverity == ValidationSeverityKind.INFO)) {
					// artf3233: omit annotation for MAY terminology constraints on properties that don't
					// also have SHOULD or SHALL property constraints
					return result;
				}
			}

			AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(property.getClass_());

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

			if (!(isSimpleCodedType(property) || isEnumerationType(property))) {
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

		protected final Constraint addVocabConstraint(PropertyContext context, ValidationStereotypeKind stereotypeKind,
				String oclVocabCondition) {
			final Property property = context.property();

			String ocl = oclVocabCondition;

			if (ocl == null || ocl.length() == 0) {
				// no vocabulary specified
				String message = "Could not generate vocabulary condition for property " + property.getQualifiedName();
				Logger.log(Logger.WARNING, message);
				return null;
			}

			if ((getEcoreProfile().getValidationSeverity(property, stereotypeKind) == ValidationSeverityKind.INFO) &&
					isCodedType(property)) {
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

			ValidationSeverityKind propSeverity = getEcoreProfile().getValidationSeverity(
				property, ValidationStereotypeKind.PROPERTY);
			ValidationSeverityKind csSeverity = getEcoreProfile().getValidationSeverity(
				property, ValidationStereotypeKind.CODE_SYSTEM);
			ValidationSeverityKind vsSeverity = getEcoreProfile().getValidationSeverity(
				property, ValidationStereotypeKind.VALUE_SET);
			// if all severities are empty, then it is considered an override for the sake of removal
			if (propSeverity == null && csSeverity == null && vsSeverity == null) {
				// except when we are
				body = new StringBuffer();
				body.append("true");
			}

			/*
			 * Fix for defect artf3329. Using inherited constraint name is causing redefined property constraint
			 * to replace message string in plugin.properties redefined message. May be several sub-templates
			 * redefining same inherited property, all replacing same superclass constraint message key.
			 * Also, this was inconsistently applied only for redefined terminology constraints.
			 */
			// if redefining parent template constraint, use parent constraint name to override.
			// String constraintName = createInheritedConstraintName(property, stereotypeKind);
			String constraintName = createConstraintName(property);

			return addConstraint(context, stereotypeKind, constraintName, body);
		}

		protected final Constraint addConstraint(PropertyContext context, ValidationStereotypeKind stereotypeKind,
				String constraintName, StringBuffer body) {

			final Property property = context.property();

			Constraint result = null;

			if (body.length() > 0) {
				if (constraintName == null) {
					constraintName = createConstraintName(property);
				}

				// ensure uniqueness of the name
				constraintName = context.adaptConstraintName(constraintName, this);

				result = addOCLConstraint(property, stereotypeKind, body, constraintName);
			}

			return result;
		}
	}
}
