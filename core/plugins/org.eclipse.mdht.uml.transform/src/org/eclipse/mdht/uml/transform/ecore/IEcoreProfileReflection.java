/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Protocol for introspection of the profiles and stereotypes applied to UML models that support transformation to Ecore.
 */
public interface IEcoreProfileReflection {
	/**
	 * Gets the first available validation stereotype that is applied to an {@code element}. This is equivalent to
	 * {@link #getAppliedValidationStereotype(Element, ValidationStereotypeKind) getAppliedValidationStereotype(element,
	 * ValidationStereotypeKind.ANY)}.
	 *
	 * @param element
	 *            an element in the model
	 *
	 * @return the first applied validation stereotype, if any
	 *
	 * @see #getAppliedValidationStereotype(Element, ValidationStereotypeKind)
	 */
	Stereotype getAppliedValidationStereotype(Element element);

	/**
	 * Gets the validation stereotype of a particular kind that is applied to the given {@code element}.
	 *
	 * @param element
	 *            an element in the model
	 * @param kind
	 *            the kind of (domain-specific) validation stereotype to look for
	 *
	 * @return the matching stereotype, if applied to the {@code element}, or {@code null} if no matching stereotype is applied
	 */
	Stereotype getAppliedValidationStereotype(Element element, ValidationStereotypeKind kind);

	/**
	 * Queries whether the specified {@code element} has validation meta-data specified on it. In practice, this means whether a validation stereotype
	 * is applied.
	 *
	 * @param element
	 *            an element in the model
	 *
	 * @return whether it has any validation meta-data attached
	 *
	 * @see #getAppliedValidationStereotype(Element, ValidationStereotypeKind)
	 */
	boolean hasValidationSupport(Element element);

	/**
	 * Obtains the severity attached to the given {@code element} for validation of a particular {@code kind} (or {@link ValidationStereotypeKind#ANY
	 * ANY}), if it has
	 * any validation meta-data attached.
	 *
	 * @param element
	 *            an element in the model
	 * @param kind
	 *            the kind of validation stereotype that may be applied to the {@code element} to inspect
	 *
	 * @return the validation severity of the given {@code kind}, or {@code null} if none is assigned or that particular stereotype is not applied
	 *
	 * @see #hasValidationSupport(Element)
	 * @see #getValidationMessage(Element, ValidationStereotypeKind)
	 */
	ValidationSeverityKind getValidationSeverity(Element element, ValidationStereotypeKind kind);

	/**
	 * Obtains the message attached to the given {@code element} for validation of a particular {@code kind} (or {@link ValidationStereotypeKind#ANY
	 * ANY}), if it has
	 * any validation meta-data attached.
	 *
	 * @param element
	 *            an element in the model
	 * @param kind
	 *            the kind of validation stereotype that may be applied to the {@code element} to inspect
	 *
	 * @return the validation message of the given {@code kind}, or {@code null} if none is assigned or that particular stereotype is not applied
	 *
	 * @see #hasValidationSupport(Element)
	 * @see #getValidationSeverity(Element, ValidationStereotypeKind)
	 */
	String getValidationMessage(Element element, ValidationStereotypeKind kind);

	/**
	 * Queries whether an element in the model (class or feature, usually) is marked as mandatory.
	 *
	 * @param element
	 *            an element in the model
	 *
	 * @return whether it is mandatory
	 */
	boolean isMandatory(Element element);

	/**
	 * Queries whether a {@code property} should inherit the constraint name from a property that it redefines (thus redefining/replacing the
	 * inherited constraint)
	 * for a particular kind of validation.
	 *
	 * @param property
	 *            a property of a class in the model
	 * @param redefinedProperty
	 *            a property that the first {@code property} redefines (from a superclass)
	 * @param stereotypeKind
	 *            the kind of validation for which a constraint is to be generated, which requires a name (possibly the same or unique)
	 *
	 * @return whether the {@code property} should use the inherited constraint name
	 */
	boolean inheritsConstraintName(Property property, Property redefinedProperty,
			ValidationStereotypeKind stereotypeKind);

	/**
	 * <p>
	 * Queries whether the specified class is a "primary" class in the model among those that should generate {@rode EClass}es in the Ecore model. It
	 * is a domain-specific variation point what "primary" means and which classes are thus categorized. Note that a false result from this method
	 * does not imply, necessarily, that the class will not generate an {@code EClass}.
	 * </p>
	 * <p>
	 * An example from the CDA domain is the template classes (those that have a template identifier) are considered as "primary" classes; all others
	 * are not.
	 * </p>
	 *
	 * @param class_
	 *            a class in the model
	 *
	 * @return whether it is a "primary" class generating an {@code EClass}, whatever that means to the domain
	 */
	boolean isPrimaryEClass(Class class_);

	/**
	 * Queries the model prefix for the specified element, to identify the element's domain in the generated natural-language "Analysis" text of a
	 * constraint.
	 *
	 * @param element
	 *            an element in the model
	 *
	 * @return its model prefix
	 *
	 * @see #getPrefixedSplitName(NamedElement)
	 */
	String getModelPrefix(NamedElement element);

	/**
	 * Generates an English rendering of an element's qualified name, prefixed by its {@linkplain #getModelPrefix(NamedElement) base model name}, to
	 * identify the
	 * element in the generated natural-language "Analysis" text of a constraint.
	 *
	 * @param element
	 *            an element in the model
	 *
	 * @return its natural-language qualified name
	 *
	 * @see #getModelPrefix(NamedElement)
	 */
	String getPrefixedSplitName(NamedElement element);

	/**
	 * Queries the details of the {@link EPackage} that is generated from the UML model.
	 *
	 * @param package_
	 *            the UML model
	 *
	 * @return details of the {@code EPackage} mapping, that will be used to populate the <tt>«ePackage»</tt> stereotype
	 */
	IEPackageDetails getEPackageDetails(Package package_);

	/**
	 * Creates an {@link AnnotationsUtil} on my annotation source.
	 *
	 * @param element
	 *            the element to annotate
	 *
	 * @return a new annotations utility
	 */
	AnnotationsUtil annotate(Element element);

	/**
	 * Creates an {@link AnnotationsUtil} on a specific {@code path} extension of the my annotation source annotation source.
	 *
	 * @param element
	 *            the element to annotate
	 * @param path
	 *            the path to append to the annotation source for a more specific annotation
	 *
	 * @return a new annotations utility
	 */
	AnnotationsUtil annotate(Element element, String path);

	//
	// Nested types
	//

	/**
	 * An enumeration of validation severities understood by the UML-to-Ecore transformation in the generation of constraints.
	 */
	enum ValidationSeverityKind {
		ERROR, WARNING, INFO
	}

	/**
	 * An enumeration of the different kinds of constraints understood, and generated, by the UML-to-Ecore transformation. These essentially map to
	 * stereotypes in the various domain-specific profiles defined by MDHT.
	 */
	enum ValidationStereotypeKind {
		/**
		 * A wildcard stereotype kind that matches the first available validation stereotype (in practice, it is often an abstract super-stereotype of
		 * the other validation stereotypes).
		 */
		ANY, //
		PROPERTY, ASSOCIATION, CONFORMS_TO, CONSTRAINT, TEXT_VALUE, NULL_FLAVOR, CODE_SYSTEM, VALUE_SET, CONCEPT_DOMAIN,
		/**
		 * @deprecated
		 */
		@Deprecated VOCAB_SPECIFICATION
	}

	/**
	 * A data-bag interface providing the details of the <tt>«ePackage»</tt> stereotype of the generated UML-Ecore model.
	 */
	interface IEPackageDetails {
		String getPackageName();

		String getNamespaceURI();

		String getNamespacePrefix();

		String getGenBasePackage();

		String getGenPrefix();
	}
}
