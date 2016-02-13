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
package org.eclipse.mdht.uml.cda.validation.internal.packages;

import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * Constraints on CDA-based packages.
 */
public class PackageImportConstraints extends AbstractMultiConstraint {

	public PackageImportConstraints() {
		super();
	}

	public IStatus validatePackageHasExpectedImports(IValidationContext context) {
		IStatus result = null;

		Package package_ = (Package) context.getTarget();
		Set<Package> referenceClosure = getUsedPackages(package_);
		Set<Package> allImported = getAllImportedPackages(package_);
		referenceClosure.removeAll(allImported);

		if (!referenceClosure.isEmpty()) {
			// Package "{0}" should import packages "{1}" on which it depends.
			result = context.createFailureStatus(package_, referenceClosure);
		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

	private Set<Package> getAllImportedPackages(Package package_) {
		Set<Package> result = new java.util.HashSet<Package>();

		result.addAll(package_.getImportedPackages());
		for (Package nesting : package_.allOwningPackages()) {
			result.addAll(nesting.getImportedPackages());
		}

		return result;
	}

	private Set<Package> getUsedPackages(Package package_) {
		Set<Package> result = new java.util.HashSet<Package>();

		for (TreeIterator<?> iter = package_.eAllContents(); iter.hasNext();) {
			Object next = iter.next();
			if (next instanceof Package) {
				// it will be covered, itself
				iter.prune();
			} else if (next instanceof Element) {
				for (EObject xref : ((Element) next).eCrossReferences()) {
					// we only care about used classifiers in other packages
					if (xref instanceof Classifier) {
						result.add(((Classifier) xref).getNearestPackage());
					}
				}
			}
		}

		// in case of uncontained element (which should not happen!)
		result.remove(null);

		// and, we don't have to import ourselves or any nesting packages
		result.remove(package_);
		result.removeAll(package_.allOwningPackages());

		return result;
	}

	public IStatus validatePackageHasCDAImports(IValidationContext context) {
		IStatus result = null;

		Package package_ = (Package) context.getTarget();
		boolean cdaFound = false;
		boolean datatypesFound = false;

		for (Package imported : getAllImportedPackages(package_)) {
			if (!cdaFound) {
				cdaFound = CDAModelUtil.isCDAModel(imported);
			}
			if (!datatypesFound) {
				datatypesFound = CDAModelUtil.isDatatypeModel(imported);
			}

			if (cdaFound && datatypesFound) {
				break;
			}
		}

		if (cdaFound && datatypesFound) {
			// grant free pass to all nested packages because they get the imports from this package
			passNested(package_, context);
		} else {
			result = context.createFailureStatus(package_);
		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

	// pass the current constraint proactively for this package and its nested packages (recursively)
	private void passNested(Package package_, IValidationContext context) {
		for (Package next : package_.getNestedPackages()) {
			context.skipCurrentConstraintFor(package_);
			passNested(next, context);
		}
	}
}
