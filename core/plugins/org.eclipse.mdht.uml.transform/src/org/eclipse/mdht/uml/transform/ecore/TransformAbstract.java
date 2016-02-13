/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added template parameter
 *     Christian W. Damus - generate multiple OCL constraints from one property (artf3121)
 *                        - discriminate multiple property constraints (artf3185)
 *                        - implement terminology constraint dependencies (artf3030)
 *                        - support nested datatype subclasses (artf3350)
 *     Rama Ramakrishnan  - Generated OCL for subclassed datatypes does not check nullFlavor(artf3450)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.mdht.uml.transform.AbstractTransform;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.PluginPropertiesUtil;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.mdht.uml.transform.internal.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Abstract base class for UML-to-Ecore model transformations.
 */
public abstract class TransformAbstract extends AbstractTransform {
	public static final String LF = System.getProperty("line.separator");

	public static final String VALIDATION_ERROR = "constraints.validation.error";

	public static final String VALIDATION_WARNING = "constraints.validation.warning";

	public static final String VALIDATION_INFO = "constraints.validation.info";

	private static final String VALIDATION_QUERY = "constraints.validation.query";

	public static final String PARENT_CLASS_NULLFLAVOR_CHECK_STRING_PREPEND = " ( self.isNullFlavorUndefined() implies (";

	public static final String PARENT_CLASS_NULLFLAVOR_CHECK_STRING_APPEND = " ))";

	private final IEcoreProfileReflection ecoreProfile;

	public TransformAbstract(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);

		ecoreProfile = baseModelReflection.getAdapter(IEcoreProfileReflection.class);
		if (ecoreProfile == null) {
			throw new IllegalArgumentException(
				"baseModelReflection does not provide IEcoreProfileReflection adapter required for UML-to-Ecore transformation");
		}
	}

	protected final IEcoreProfileReflection getEcoreProfile() {
		return ecoreProfile;
	}

	public boolean hasValidationSupport(Element element) {
		return getEcoreProfile().getAppliedValidationStereotype(element) != null;
	}

	public void addValidationSupport(Property property, ValidationStereotypeKind kind, String constraintName) {
		ValidationSeverityKind severity = getEcoreProfile().getValidationSeverity(property, kind);
		String message = getEcoreProfile().getValidationMessage(property, kind);

		Class constrainedClass = property.getClass_();
		if (severity != null) {

			switch (severity) {
				case INFO:
					addValidationInfo(constrainedClass, constraintName, message);
					break;
				case WARNING:
					addValidationWarning(constrainedClass, constraintName, message);
					break;
				default:
					addValidationError(constrainedClass, constraintName, message);
					break;
			}
		} else {
			addValidationError(constrainedClass, constraintName, message);
		}
	}

	public void addValidationError(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_ERROR, constraintName);
		annotationsUtil.saveAnnotations();

		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationWarning(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_WARNING, constraintName);
		annotationsUtil.saveAnnotations();

		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationInfo(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_INFO, constraintName);
		annotationsUtil.saveAnnotations();

		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationMessage(Class constrainedClass, String constraintName, String message) {
		if (message == null) {
			message = constraintName + " error message";
		}

		PluginPropertiesUtil properties = transformerOptions.getPluginPropertiesUtil();
		if (properties != null) {
			properties.addProperty(generatePropertyMessageKey(constrainedClass, constraintName), message);
		}
	}

	protected String generatePropertyMessageKey(Class constrainedClass, String constraintName) {
		String propertyMessageKey = constrainedClass.getQualifiedName() + constraintName;
		if (constrainedClass.getNearestPackage() != null) {
			propertyMessageKey = propertyMessageKey.replaceFirst(
				constrainedClass.getNearestPackage().getName() + "::", "");
		}
		return propertyMessageKey.replace("::", "");

	}

	protected void addOCLConstraint(Property property, ValidationStereotypeKind stereotype, StringBuffer body) {
		addOCLConstraint(property, stereotype, body, null);
	}

	protected Constraint addOCLConstraint(Property property, ValidationStereotypeKind stereotype, StringBuffer body,
			String constraintName) {
		if (constraintName == null) {
			constraintName = createConstraintName(property);
		}

		if (property.getClass_().getOwnedRule(constraintName) != null) {
			String message = "Constraint name already defined: '" + constraintName + "' in " +
					property.getClass_().getQualifiedName();
			Logger.log(Logger.WARNING, message);

			// add validation message, if included in the model
			addValidationSupport(property, stereotype, constraintName);

			return null;
		}

		Property baseProperty = getBaseProperty(property);
		String selfName = "self." + baseProperty.getName();

		String nullFlavorBody = body.toString();
		boolean hasNullFlavor = false;

		if (baseProperty.getType() instanceof Class) {
			hasNullFlavor = isSubTypeOfANY((Class) baseProperty.getType());
		}

		if (enableVariation_UseOriginalLowerbound()) {
			if (hasNullFlavor && property.getLower() == 0) {
				if (baseProperty.upperBound() == 1) {
					nullFlavorBody = "((not " + selfName + ".oclIsUndefined()) and " + selfName +
							".isNullFlavorUndefined()) implies (" + body + ")";
				} else {
					// must have size()==1 to have nullFlavor
					nullFlavorBody = "((not " + selfName + "->isEmpty()) and " + selfName +
							"->exists(element | element.isNullFlavorUndefined()))" + " implies (" + body + ")";
				}
			} else if (property.getLower() == 0) {
				if (baseProperty.upperBound() == 1) {
					nullFlavorBody = "(not " + selfName + ".oclIsUndefined()) implies (" + body + ")";
				} else {
					nullFlavorBody = "(not " + selfName + "->isEmpty()) implies (" + body + ")";
				}
			}
		} else if (hasNullFlavor && !getEcoreProfile().isMandatory(property)) {
			if (baseProperty.upperBound() == 1) {
				nullFlavorBody = "(" + selfName + ".oclIsUndefined() or " + selfName +
						".isNullFlavorUndefined()) implies (" + body + ")";
			} else {
				// must have size()==1 to have nullFlavor
				nullFlavorBody = "(" + selfName + "->isEmpty() or " + selfName +
						"->exists(element | element.isNullFlavorUndefined()))" + " implies (" + body + ")";
			}
		}
		if (property.getUpper() == 0 && property.getLower() == 0) {
			if (baseProperty.upperBound() == 1) {
				nullFlavorBody = selfName + ".oclIsUndefined()";
			} else {
				nullFlavorBody = selfName + "->isEmpty()";
			}
		}

		// Add nullFlavor checks for the enclosing parent (if necessary)
		// This check will be relaxed further if the parent attribute is Mandatory, in which case the check is not required.
		if (property.eContainer() instanceof Class) {

			if (isSubTypeOfANY((Class) property.eContainer())) {
				nullFlavorBody = PARENT_CLASS_NULLFLAVOR_CHECK_STRING_PREPEND + nullFlavorBody +
						PARENT_CLASS_NULLFLAVOR_CHECK_STRING_APPEND;
			}
		}

		Constraint result = property.getClass_().createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		result.getConstrainedElements().add(property.getClass_());

		OpaqueExpression expression = (OpaqueExpression) result.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(nullFlavorBody);

		addValidationSupport(property, stereotype, constraintName);

		result.getConstrainedElements().add(property);

		return result;
	}

	protected String createInheritedConstraintName(Property property, ValidationStereotypeKind stereotype) {
		String constraintName = null;
		if (getEcoreProfile().getValidationSeverity(property, stereotype) == ValidationSeverityKind.ERROR) {
			Property inheritedProperty = org.eclipse.mdht.uml.common.util.UMLUtil.getInheritedProperty(property);
			if (getEcoreProfile().inheritsConstraintName(property, inheritedProperty, stereotype)) {
				constraintName = createInheritedConstraintName(inheritedProperty, stereotype);
			}
		}

		if (constraintName == null) {
			constraintName = createConstraintName(property);
		}

		return constraintName;
	}

	Class getInitialTemplateClass(Property property) {

		Class c = property.getClass_();

		for (Property p : property.getRedefinedProperties()) {
			if (!isBaseModel(property.getClass_(), p) && !isDatatypesModelElement(property.getClass_(), p)) {
				c = getInitialTemplateClass(p);
			}
		}

		return c;
	}

	Property getInitialProperty(Property property) {

		Property pp = property;

		for (Property p : property.getRedefinedProperties()) {
			if (!isBaseModel(property.getClass_(), p) && !isDatatypesModelElement(property.getClass_(), p)) {
				pp = getInitialProperty(p);
			}
		}

		return pp;
	}

	private String generatePrefix(NamedElement constrainedClass) {
		String prefix = constrainedClass.getQualifiedName().replace("::", "").replace(
			constrainedClass.getNearestPackage().getName(), "");
		return prefix;
	}

	private static String reverseCamelCase(String name) {
		if (!StringUtils.isEmpty(name)) {
			return StringUtils.capitalise(name);
		}
		return name;
	}

	protected String createConstraintName(NamedElement property, String suffix) {
		return createConstraintName(property) + suffix;
	}

	public Constraint getConstraintByName(Constraint constraint) {
		for (Classifier parent : ((Classifier) constraint.getOwner()).allParents()) {
			for (Constraint c : parent.getOwnedRules()) {
				String inheritedName = generatePrefix(parent) + constraint.getName();
				if (constraint.getName().equalsIgnoreCase(c.getName()) || inheritedName.equalsIgnoreCase(c.getName())) {
					return c;
				}
			}
		}
		return constraint;
	}

	protected String createConstraintName(NamedElement namedElement) {
		String constraintName = "";

		NamedElement baseNamedElement = null;
		if (namedElement instanceof Property) {
			baseNamedElement = getInitialProperty((Property) namedElement);
		} else if (namedElement instanceof Constraint) {
			baseNamedElement = getConstraintByName((Constraint) namedElement);
		} else {
			baseNamedElement = namedElement;
		}
		if (baseNamedElement != null) {
			if (baseNamedElement.getOwner() instanceof NamedElement) {
				constraintName = generatePrefix((NamedElement) baseNamedElement.getOwner());
			}
			// If the constraint is a cusomt ocl override - it will have the correct prefix already
			if (baseNamedElement.getName().startsWith(constraintName)) {
				constraintName = reverseCamelCase(baseNamedElement.getName());
			} else {
				constraintName = constraintName + reverseCamelCase(baseNamedElement.getName());
			}
		}
		return constraintName;

	}

	protected String getConstraintDependency(AnnotationsUtil annotations, String constraintName) {
		return annotations.getAnnotation("constraints.validation.dependOn." + constraintName);
	}

	protected void setConstraintDependency(AnnotationsUtil annotations, String constraintName, String dependencyName) {
		// for now, we only support a single dependency (terminology on property)
		annotations.setAnnotation("constraints.validation.dependOn." + constraintName, dependencyName);
	}

	protected void annotateQueryConstraint(Constraint constraint, Class context) {
		AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(context);
		annotationsUtil.addAnnotation(VALIDATION_QUERY, constraint.getName());
		annotationsUtil.saveAnnotations();
	}

	public static String normalizeConstraintName(String constraintName) {
		String result = "";
		String[] parts = constraintName.split("_");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		return result;
	}

	/**
	 * Checks if the Class is a subtype of datatpes::ANY
	 *
	 * @return
	 */
	public boolean isSubTypeOfANY(Classifier clazz) {
		boolean retVal = false;
		// Check if the property is of type Class
		if (clazz instanceof Class) {
			List<String> parentNames = org.eclipse.mdht.uml.common.util.UMLUtil.getAllParentNames(clazz);
			retVal = parentNames.contains("ANY");
		}
		return retVal;
	}

	/**
	 * Enable change type 2.
	 *
	 * Even as the original type is not available in the Java runtime for the generated Java code, it is useful to know the original type for
	 * Schematron purposes,
	 * as the Schematron generator can generate special type checking xpath for the specialized type.
	 *
	 * @return whether to use the type system of the concrete UML model (<code>true</code>) or the CDA base model (<code>false</code>)
	 */
	public boolean enableVariation_UseOriginalType() {
		return false;
	}

	/**
	 * Enable change type 3/4.
	 *
	 * In order to report that a conformance requirement is not met, we need a scenario that fails.
	 * In order to accomplish this, we imply a lower bound of 1 for all constraints.
	 * If not we would be checking for size >=0 and size <=1 which would not fail
	 *
	 * @return whether to use the original lower bound value (<code>true</code>) or the implied one (<code>false</code>)
	 */
	public boolean enableVariation_UseOriginalLowerbound() {
		return false;
	}
}
