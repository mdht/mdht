/*******************************************************************************
 * Copyright (c) 2012 Christian Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

/**
 * Protocol for introspection of a UML model's base model in a layered/progressive-refinement model architecture, and the relationships of
 * model elements to elements in such base model.
 */
public interface IBaseModelReflection {
	/**
	 * Obtains an adapter to another reflection interface, for model transformation or other purposes.
	 *
	 * @param adapterType
	 *            the adapter type to request
	 *
	 * @return the requested adapter, or {@code null} if no adapter of that type is available
	 */
	<T> T getAdapter(java.lang.Class<T> adapterType);

	/**
	 * Gets the base model for the model that contains a given {@code context} element.
	 *
	 * @param context
	 *            an element in context of the transformation
	 *
	 * @return the base model, or {@code null} if there is none. This may happen if the user model isn't based on another, such as when it
	 *         is, itself, the root of a layered stack. A base model relative to the user model may, itself, be based on some more abstract model.
	 *         In some cases it may be desirable to treat a "root" model as based on itself; clients should be prepared for this result
	 *
	 * @see #isBaseModelElement(Element, Element)
	 */
	Package getBaseModel(Element context);

	/**
	 * Gets the model that defines standard reusable datatypes for the model that contains a given {@code context} element. This may be the
	 * same as the {@linkplain #getBaseModel(Element) base model}, or it may be different, if there is any at all.
	 *
	 * @param context
	 *            an element in context of the transformation
	 *
	 * @return the base datatypes model, or {@code null} if there is none
	 *
	 * @see #isDatatypesModelElement(Element, Element)
	 */
	Package getDatatypesModel(Element context);

	/**
	 * Finds the class in a user-model class's base model on which the user-model class is based. Although this is ususally determined by
	 * generalization, there are other mechanisms such as template binding that may also be employed.
	 *
	 * @param userClass
	 *            a classifier in the model that represents a "class" type defining object, not value, instances. A generic type is
	 *            used because classes are commonly represented as either {@link Class} or {@link Interface} types and UML requires consistent
	 *            metatypes
	 *            in relationships such as generalization and template binding
	 *
	 * @return the user class's base class, or {@code null} if it does not trace to a class in the base model
	 */
	<C extends Classifier> C getBaseClass(C userClass);

	/**
	 * Finds the datatype in a user-model datatype's base model on which the user-model datatype is based. Although this is ususally determined by
	 * generalization, there are other mechanisms such as template binding that may also be employed.
	 *
	 * @param userDatatype
	 *            a classifier in the model that represents a "data" type defining value, not object, instances. A generic type is
	 *            used because datatypes are commonly represented as either {@link Class} or {@link DataType} types and UML requires consistent
	 *            metatypes
	 *            in relationships such as generalization and template binding
	 *
	 * @return the user datatype's base datatype, or {@code null} if it does not trace to a datatype in the base model
	 */
	<C extends Classifier> C getBaseDatatype(C userDatatype);

	/**
	 * Gets the property in the specified {@code owner} classifier's base classifier (whether class or datatype) that the given {@code property}
	 * traces to, such as by redefinition or template binding.
	 *
	 * @param owner
	 *            the context classifier in which to look up the base property. This may be the type that defines (owns) the {@code property} or
	 *            it may inherit the {@code property} from a supertype
	 * @param property
	 *            the property for which to get its definition in the base model or datatypes package
	 *
	 * @return the base property definition, or {@code null} if there is none (it is a local property definition)
	 */
	Property getBaseProperty(Classifier owner, Property property);

	/**
	 * Queries whether the specified {@code base} element is from the {@linkplain #getBaseModel(Element) base model} to which a given {@code context}
	 * element traces.
	 *
	 * @param context
	 *            an element in the user model
	 * @param base
	 *            an element that may be of the base model
	 *
	 * @return whether the {@code base} element is of the {@code context} element's base model
	 *
	 * @see #getBaseModel(Element)
	 */
	boolean isBaseModelElement(Element context, Element base);

	/**
	 * Queries whether the specified {@code base} element is from the {@linkplain #getDatatypesModel(Element) datatypes model} to which a given
	 * {@code context} element traces.
	 *
	 * @param context
	 *            an element in the user model
	 * @param base
	 *            an element that may be of the datatypes model
	 *
	 * @return whether the {@code base} element is of the {@code context} element's datatypes model
	 *
	 * @see #getDatatypesModel(Element)
	 */
	boolean isDatatypesModelElement(Element context, Element base);
}
