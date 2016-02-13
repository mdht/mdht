/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

/**
 * Partial implementation of the {@link IBaseModelReflection} protocol.
 */
public abstract class AbstractBaseModelReflection implements IBaseModelReflection {

	public AbstractBaseModelReflection() {
		super();
	}

	public <T> T getAdapter(java.lang.Class<T> adapterType) {
		T result;

		if (adapterType.isInstance(this)) {
			result = adapterType.cast(this);
		} else {
			result = adapt(adapterType);
		}

		return result;
	}

	protected <T> T adapt(java.lang.Class<T> adapterType) {
		return null;
	}

	public Package getBaseModel(Element context) {
		Package result = null;

		// search package imports
		for (Package local = context.getNearestPackage(); (result == null) &&
				(local != null); local = local.getNestingPackage()) {
			for (Package imported : local.getImportedPackages()) {
				if (isBaseModel(context, imported)) {
					result = imported;
					break;
				}
			}

			if (result == null) {
				// recurse on the imports
				for (Package imported : local.getImportedPackages()) {
					result = getBaseModel(imported);
					if (result != null) {
						break;
					}
				}
			}
		}

		return result;
	}

	public Package getDatatypesModel(Element context) {
		Package result = null;

		// search package imports
		for (Package local = context.getNearestPackage(); (result == null) &&
				(local != null); local = local.getNestingPackage()) {
			for (Package imported : local.getImportedPackages()) {
				if (isDatatypesModel(context, imported)) {
					result = imported;
					break;
				}
			}

			if (result == null) {
				// recurse on the imports
				for (Package imported : local.getImportedPackages()) {
					result = getDatatypesModel(imported);
					if (result != null) {
						break;
					}
				}
			}
		}

		return result;
	}

	public <C extends Classifier> C getBaseClass(C userClass) {
		C result = null;

		// do we recognize this as a base model element in and of itself? (some domains have an absolute notion of what the base model is)
		if (isBaseModelElement(userClass, userClass)) {
			result = userClass;
		} else {
			for (C next : getTraceabilityChain(userClass)) {
				if (isBaseModelElement(userClass, next)) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	public <C extends Classifier> C getBaseDatatype(C userDatatype) {
		C result = null;

		// do we recognize this as a datatypes model element in and of itself? (some domains have an absolute notion of what the datatypes model is)
		if (isDatatypesModelElement(userDatatype, userDatatype)) {
			result = userDatatype;
		} else {
			for (C next : getTraceabilityChain(userDatatype)) {
				if (isDatatypesModelElement(userDatatype, next)) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	private Property getBasePropertyThroughRedefines(Property property) {

		Property pp = null;

		for (Property p : property.getRedefinedProperties()) {
			if (isBaseModelElement(property.getClass_(), p) || isDatatypesModelElement(property.getClass_(), p)) {
				return p;
			} else {
				pp = getBasePropertyThroughRedefines(p);
			}
		}
		if (pp == null) {
			for (Property p : property.getSubsettedProperties()) {
				if (isBaseModelElement(property.getClass_(), p) || isDatatypesModelElement(property.getClass_(), p)) {
					return p;
				} else {
					pp = getBasePropertyThroughRedefines(p);
				}
			}
		}

		return pp;
	}

	public Property getBaseProperty(Classifier owner, Property property) {
		Property result = null;

		out: for (Classifier next : getTraceabilityChain(owner)) {
			for (Property base : next.getAttributes()) {
				if ((base.getName() != null) && base.getName().equals(property.getName()) &&
						(isBaseModelElement(owner, base) || isDatatypesModelElement(owner, base))) {

					result = base;
					break out;
				}
			}
		}

		if (result == null) {
			result = getBasePropertyThroughRedefines(property);
		}
		return result;
	}

	/**
	 * Gets the chain of traceability, from least to most abstract, of a user-model classifier. This default implementation traces by generalization
	 * relationships.
	 *
	 * @param userType
	 *            a classifier in the user model
	 *
	 * @return a chain of progressively more abstract classifiers that it traces to
	 */
	protected <C extends Classifier> Iterable<C> getTraceabilityChain(final C userType) {
		return new Iterable<C>() {
			public Iterator<C> iterator() {
				return new Iterator<C>() {
					@SuppressWarnings("unchecked")
					// this is safe because we only want to return instances of the same class as 'userType'
					private final java.lang.Class<? extends C> instanceClass = (java.lang.Class<? extends C>) userType.getClass();

					private final Iterator<Classifier> delegate = userType.allParents().iterator();

					private C preparedNext;

					public boolean hasNext() {
						if (preparedNext == null) {
							prepareNext();
						}

						return preparedNext != null;
					}

					private void prepareNext() {
						while (delegate.hasNext()) {
							Classifier next = delegate.next();

							if (instanceClass.isInstance(next)) {
								preparedNext = instanceClass.cast(next);
								break;
							}
						}
					}

					public C next() {
						if (!hasNext()) {
							throw new NoSuchElementException();
						}

						C result = preparedNext;
						preparedNext = null;
						return result;
					}

					public void remove() {
						throw new UnsupportedOperationException("Iterator::remove");
					}
				};
			}
		};
	}

	public boolean isBaseModelElement(Element context, Element base) {
		boolean result = false;

		if (base != null) {
			for (Package package_ = base.getNearestPackage(); !result &&
					(package_ != null); package_ = package_.getNestingPackage()) {
				result = isBaseModel(context, package_);
			}
		}

		return result;
	}

	public boolean isDatatypesModelElement(Element context, Element base) {
		boolean result = false;

		if (base != null) {
			for (Package package_ = base.getNearestPackage(); !result &&
					(package_ != null); package_ = package_.getNestingPackage()) {
				result = isDatatypesModel(context, package_);
			}
		}

		return result;
	}

	/**
	 * Queries whether the specified package is the base model for the given {@code context} element in the user model.
	 *
	 * @param context
	 *            an element in the user model
	 * @param base
	 *            a package that may or may not be the base package. This will always be a root package; it is expected that
	 *            base models may have nested packages, but that nested packages do not stand alone as base models
	 *
	 * @return whether the package is the base for the user model
	 */
	protected abstract boolean isBaseModel(Element context, Package base);

	/**
	 * Queries whether the specified package is the datatypes model for the given {@code context} element in the user model.
	 *
	 * @param context
	 *            an element in the user model
	 * @param datatypes
	 *            a package that may or may not be the datatypes package. This will always be a root package; it is expected that
	 *            datatypes models may have nested packages, but that nested packages do not stand alone as datatypes models
	 *
	 * @return whether the package is the datatypes model for the user model
	 */
	protected abstract boolean isDatatypesModel(Element context, Package datatypes);
}
