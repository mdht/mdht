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
package org.eclipse.mdht.uml.validation.internal.provider;

import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.mdht.uml.validation.ConstraintProvider;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.mdht.uml.validation.internal.ValidationPlugin;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.osgi.framework.Bundle;

/**
 * Utilities for working with the validation profile.
 */
public class ValidationProfileUtil {

	private static final String ECORE_EPACKAGE_STEREOTYPE = UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR +
			UMLUtil.STEREOTYPE__E_PACKAGE;

	private static final String ECORE_EPACKAGE_NSURI = UMLUtil.TAG_DEFINITION__NS_URI;

	private static final Pattern BUNDLE_ID_PATTERN = Pattern.compile("^\\d+");

	private ValidationProfileUtil() {
		super();
	}

	public static Diagnostic getDiagnostic(Constraint constraint) {
		return getApplication(constraint, Diagnostic.class);
	}

	public static ConstraintProvider getConstraintProvider(Namespace namespace) {
		return getApplication(namespace, ConstraintProvider.class);
	}

	static <T extends EObject> T getApplication(Element element, java.lang.Class<? extends T> stereotype) {
		T result = null;

		for (EObject next : element.getStereotypeApplications()) {
			if (stereotype.isInstance(next)) {
				result = stereotype.cast(next);
				break;
			}
		}

		return result;
	}

	/**
	 * Finds the profiles applied to a package that are, themselves, profiled by the <tt>Validation</tt> profile.
	 *
	 * @param context
	 *            a package
	 *
	 * @return its validating profiles, if any
	 */
	public static Iterable<Profile> getValidatingProfiles(Package context) {
		List<Profile> result = new java.util.ArrayList<Profile>(context.getAppliedProfiles().size());
		for (Profile next : context.getAppliedProfiles()) {
			if (getConstraintProvider(next) != null) {
				result.add(next);
			}
		}
		return Collections.unmodifiableCollection(result);
	}

	/**
	 * Gets the most appropriate URI converter for the specified {@code context} object.
	 *
	 * @param context
	 *            an object
	 * @return the resource set's URI converter, if the {@code context} is in a resource set; the global converter, otherwise
	 */
	public static URIConverter getURIConverter(EObject context) {
		URIConverter result = URIConverter.INSTANCE;

		Resource res = context.eResource();
		ResourceSet rset = (res == null)
				? null
				: res.getResourceSet();
		if (rset != null) {
			result = rset.getURIConverter();
		}

		return result;
	}

	/**
	 * Finds the Eclipse bundle that registers the specified {@code profile}. It may be registered as a statically-generated profile, or as a dynamic
	 * profile, but it must be registered.
	 *
	 * @param profile
	 *            a profile
	 *
	 * @return the bundle ID that registers it, or {@code null} if none
	 */
	public static String getBundleName(Profile profile) {
		// first try the <<constraintProvider>> stereotype to see whether it names a bundle
		ConstraintProvider constraintProvider = getConstraintProvider(profile);
		String result = (constraintProvider == null)
				? null
				: constraintProvider.getBundleName();

		if (result == null) {
			// find the bundle that registers the profile
			String nsURI = (String) UMLUtil.getTaggedValue(profile, ECORE_EPACKAGE_STEREOTYPE, ECORE_EPACKAGE_NSURI);
			if (nsURI != null) {
				URI locationURI = UMLPlugin.getEPackageNsURIToProfileLocationMap().get(nsURI);
				if (locationURI != null) {
					locationURI = getURIConverter(profile).normalize(locationURI);
					if (locationURI.isPlatformPlugin()) {
						result = locationURI.segment(1); // segment 0 is "plugin"
					} else if ("bundleentry".equals(locationURI.scheme())) {
						String bundleID = locationURI.authority();

						Matcher m = BUNDLE_ID_PATTERN.matcher(bundleID);
						if (m.find()) {
							bundleID = m.group();
						}

						Bundle bundle = ValidationPlugin.getPlugin().getBundle().getBundleContext().getBundle(
							Long.parseLong(bundleID));
						result = (bundle == null)
								? null
								: bundle.getSymbolicName();
					}
				}
			}
		}

		// clean the result
		return nullSafeTrim(result, true);
	}

	public static String nullSafeTrim(String s) {
		String result = (s == null)
				? s
				: s.trim();
		return result;
	}

	public static String nullSafeTrim(String s, boolean preferNull) {
		String result = nullSafeTrim(s);

		return (preferNull && ((result == null) || (result.length() == 0)))
				? null
				: result;
	}

	/**
	 * Gets all packages transitively imported into some package.
	 *
	 * @param package_
	 *            a UML package
	 *
	 * @return all of the packages that it imports and that are imported (transitively) by its imports
	 */
	public static Iterable<Package> getAllImportedPackages(final Package package_) {
		final List<Package> result = new java.util.ArrayList<Package>();

		Queue<Package> queue = new java.util.LinkedList<Package>(package_.getImportedPackages());
		Set<Package> seen = new java.util.HashSet<Package>();
		seen.add(package_);

		for (Package next = queue.poll(); next != null; next = queue.poll()) {
			Package poll = queue.poll();
			if (poll == null) {
				break; // we're done
			} else if (seen.add(poll)) {
				// enqueue its imports
				queue.addAll(poll.getImportedPackages());

				// and add it
				result.add(poll);
			}
		}
		;

		return Collections.unmodifiableCollection(result);
	}

}
