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
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform;

import java.util.Collection;
import java.util.Map;

import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Abstract base class for model transformations.
 */
public abstract class AbstractTransform extends UMLSwitch<Object> {
	protected TransformerOptions transformerOptions;

	protected final IBaseModelReflection baseModelReflection;

	public AbstractTransform(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		transformerOptions = options;
		this.baseModelReflection = baseModelReflection;
	}

	public void removeModelElement(Element element) {
		if (element != null && !isRemoved(element)) {
			transformerOptions.getDeletedElementList().add(element);
		}
	}

	public boolean isRemoved(Element element) {
		return transformerOptions.getDeletedElementList().contains(element);
	}

	protected <C extends Classifier> C getBaseClass(C userClass) {
		return baseModelReflection.getBaseClass(userClass);
	}

	protected Package getBaseModel(Classifier userClass) {
		Package result = baseModelReflection.getBaseModel(userClass);

		if (result == null) {
			// maybe it's not explicitly imported
			Classifier baseClass = getBaseClass(userClass);
			if (baseClass != null) {
				result = UMLUtil.getTopPackage(baseClass);
			}
		}

		return result;
	}

	protected boolean isBaseModel(Element userElement, Element baseElement) {
		return baseModelReflection.isBaseModelElement(userElement, baseElement);
	}

	protected boolean isDatatypesModelElement(Element context, Element base) {
		return baseModelReflection.isDatatypesModelElement(context, base);
	}

	protected Property getBaseProperty(Property templateProperty) {
		return baseModelReflection.getBaseProperty((Classifier) templateProperty.getOwner(), templateProperty);
	}

	/**
	 * Gets the datatype from the base datatypes model that the specified {@code umlDatatype} specializes, if any, and only if the {@code umlDatatype}
	 * is defined
	 * locally to the given {@code context} element (in the same model as it).
	 *
	 * @param umlDatatype
	 *            a class that may or may not be a specialization of a base datatype
	 * @param context
	 *            the context in which the datatype is used, or {code null} if the locality check is not required. This is often a {@link Property}
	 *            that is typed by the {@code umlDatatype}
	 *
	 * @return the base datatype of which the {@code umlDatatype} is a local subclass, or {@code null} if the {@code umlDatatype} is not a local
	 *         subclass of a base datatype
	 */
	protected <C extends Classifier> C getBaseDatatype(C umlDatatype, Element context) {
		C result = baseModelReflection.getBaseDatatype(umlDatatype);

		if (result != null) {
			// check conditions for distinguishing the base datatype from the original
			if ((result == umlDatatype) || ((context != null) &&
					!org.eclipse.mdht.uml.common.util.UMLUtil.isSameModel(umlDatatype, context))) {

				result = null;
			}
		}

		return result;
	}

	protected boolean isDatatypesModel(Element userElement, Element baseElement) {
		return baseModelReflection.isDatatypesModelElement(userElement, baseElement);
	}

	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 */
	protected Property getInheritedProperty(Property templateProperty) {
		// for CDA, we restrict to Classes, not other classifiers
		if (templateProperty.getClass_() == null) {
			return null;
		}

		return org.eclipse.mdht.uml.common.util.UMLUtil.getInheritedProperty(templateProperty);
	}

	public static String normalizeCodeName(String name) {
		String result = "";
		String[] parts = name.split(" ");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		result = UML2Util.getValidJavaIdentifier(result);
		return result;
	}

	public static String pluralize(String name) {
		if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		if (name.endsWith("ia")) {
			return name;
		}
		return name + "s";
	}

	public static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	/**
	 * Add an {@code element} to a {@code collection} if it's not {@code null}. Handy for a fluent style.
	 *
	 * @return the {@code collection}, for convenience of method chaining
	 */
	public static <E, C extends Collection<? super E>> C addIfNotNull(E element, C collection) {
		if (element != null) {
			collection.add(element);
		}
		return collection;
	}

	/**
	 * Add an {@code element} to a {@code map} if it's not {@code null}. Handy for a fluent style.
	 *
	 * @return the {@code map}, for convenience of method chaining
	 */
	public static <K, V, M extends Map<? super K, ? super V>> M putIfNotNull(K key, V element, M map) {
		if (element != null) {
			map.put(key, element);
		}
		return map;
	}
}
