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
package org.eclipse.mdht.uml.validation.provider;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.URIMappingRegistryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.validation.internal.provider.ProfileClientSelector;
import org.eclipse.mdht.uml.validation.internal.provider.ValidationProfileUtil;
import org.eclipse.uml2.uml.Package;

/**
 * A client-context selector that matches objects that are in MDHT UML models, optionally qualified as importing specific base models via the
 * <tt>baseModelURI</tt> extension initialization attribute and/or having profiles applied identified by the <tt>appliedProfileURI</tt> attribute.
 */
public class MDHTClientSelector extends ProfileClientSelector implements IExecutableExtension {
	private static final String BASE_MODEL_URI_PARAM = "baseModelURI";

	private static final String APPLIED_PROFILE_URI_PARAM = "appliedProfileURI";

	private List<URI> baseModelURIs;

	private List<URI> appliedProfileURIs;

	private final Map<URI, URI> platformURIMap = EcorePlugin.computePlatformURIMap();

	public MDHTClientSelector() {
		super();
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {

		if (data instanceof String) {
			parseURIMap((String) data);
		} else if (data instanceof Map<?, ?>) {
			baseModelURIs = parseURIs((String) ((Map<?, ?>) data).get(BASE_MODEL_URI_PARAM));
			appliedProfileURIs = parseURIs((String) ((Map<?, ?>) data).get(APPLIED_PROFILE_URI_PARAM));
		}
	}

	@Override
	public boolean selects(Object object) {
		boolean result = super.selects(object);

		if (result && ((baseModelURIs != null) || (appliedProfileURIs != null))) {
			// if superclass accepted, then we know there's a root package
			Package root = getRootPackage(object);
			result = result && checkBaseModelURIs(root) && checkAppliedProfiles(root);
		}

		return result;
	}

	private boolean checkBaseModelURIs(Package root) {
		boolean result = true;

		if (baseModelURIs != null) {
			final URIConverter converter = getPlatformlyNormalizingURIConverter(
				ValidationProfileUtil.getURIConverter(root));

			for (URI uri : baseModelURIs) {
				result = findPackage(
					converter.normalize(uri), converter, ValidationProfileUtil.getAllImportedPackages(root)) != null;

				if (!result) {
					// didn't find the base model. We're done, here
					break;
				}
			}
		}

		return result;
	}

	private boolean checkAppliedProfiles(Package root) {
		boolean result = true;

		if (appliedProfileURIs != null) {
			final URIConverter converter = getPlatformlyNormalizingURIConverter(
				ValidationProfileUtil.getURIConverter(root));

			for (URI uri : appliedProfileURIs) {
				result = findPackage(converter.normalize(uri), converter, root.getAllAppliedProfiles()) != null;

				if (!result) {
					// didn't find the profile. We're done, here
					break;
				}
			}
		}

		return result;
	}

	private <T extends Package> T findPackage(URI uri, URIConverter converter, Iterable<? extends T> packages) {
		T result = null;

		final boolean hasFragment = uri.hasFragment();

		for (T next : packages) {
			// EcoreUtil handles proxies, too
			final URI nextURI = hasFragment
					? EcoreUtil.getURI(next)
					: EcoreUtil.getURI(next).trimFragment();

			if (converter.normalize(nextURI).equals(uri)) {
				result = next;
				break;
			}
		}

		return result;
	}

	private URIConverter getPlatformlyNormalizingURIConverter(URIConverter converter) {
		final ExtensibleURIConverterImpl.URIMap delegate = (ExtensibleURIConverterImpl.URIMap) converter.getURIMap();

		URIConverter result = new ExtensibleURIConverterImpl(
			converter.getURIHandlers(), converter.getContentHandlers()) {
			@SuppressWarnings("serial")
			@Override
			protected URIMap getInternalURIMap() {
				if (uriMap == null) {
					uriMap = (URIMap) new URIMappingRegistryImpl() {
						@Override
						protected URI delegatedGetURI(URI uri) {
							return delegate.getURI(uri);
						};
					}.map();
				}

				return super.getInternalURIMap();
			}
		};

		result.getURIMap().putAll(platformURIMap);

		return result;
	}

	private List<URI> parseURIs(String uriList) {
		List<URI> result = null;
		String[] uris = (uriList == null)
				? null
				: uriList.split("\\s*;\\s*");

		if ((uris != null) && (uris.length > 0)) {
			result = new java.util.ArrayList<URI>(uris.length);
			for (String next : uris) {
				result.add(URI.createURI(next));
			}
		}

		return result;
	}

	private void parseURIMap(String uriMap) {
		final Pattern pairPattern = Pattern.compile("([^=]+)=(.+)");
		final Matcher m = pairPattern.matcher("");

		String[] pairs = uriMap.split("\\s*;\\s*");

		if ((pairs != null) && (pairs.length > 0)) {
			Map<String, List<URI>> map = new java.util.HashMap<String, List<URI>>();

			for (String next : pairs) {
				m.reset(next);
				if (m.matches()) {
					final String key = m.group(1);

					if (key.equalsIgnoreCase(BASE_MODEL_URI_PARAM)) {
						List<URI> uris = map.get(BASE_MODEL_URI_PARAM);
						if (uris == null) {
							uris = new java.util.ArrayList<URI>(3); // anticipate a small number
							map.put(BASE_MODEL_URI_PARAM, uris);
						}
						uris.add(URI.createURI(m.group(2).trim()));
					} else if (key.equalsIgnoreCase(APPLIED_PROFILE_URI_PARAM)) {
						List<URI> uris = map.get(APPLIED_PROFILE_URI_PARAM);
						if (uris == null) {
							uris = new java.util.ArrayList<URI>(3); // anticipate a small number
							map.put(APPLIED_PROFILE_URI_PARAM, uris);
						}
						uris.add(URI.createURI(m.group(2).trim()));
					}
				}
			}

			if (map.containsKey(BASE_MODEL_URI_PARAM)) {
				this.baseModelURIs = map.get(BASE_MODEL_URI_PARAM);
			}
			if (map.containsKey(APPLIED_PROFILE_URI_PARAM)) {
				this.appliedProfileURIs = map.get(BASE_MODEL_URI_PARAM);
			}
		}
	}
}
