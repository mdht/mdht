/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.notation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.openhealthtools.mdht.uml.common.internal.Logger;

public class NotationRegistry {
	public static final NotationRegistry INSTANCE = new NotationRegistry();

	private Map<String, INotationProvider> providers = null;

	private static final String EXTENSION_POINT = "org.openhealthtools.mdht.uml.common.notation";

	private static final String PROVIDER_ELEMENT = "provider";

	private static final String ATT_PROFILE_URI = "profileURI";

	private static final String ATT_CLASS = "class";

	private NotationRegistry() {
	}

	private void load() {
		providers = new HashMap<String, INotationProvider>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		if (registry != null) {
			IExtensionPoint point = registry.getExtensionPoint(EXTENSION_POINT);
			if (point != null) {
				for (IExtension extension : point.getExtensions()) {
					for (IConfigurationElement element : extension.getConfigurationElements()) {
						if (PROVIDER_ELEMENT.equals(element.getName()) && validateProvider(element)) {
							try {
								Object providerInstance = element.createExecutableExtension(ATT_CLASS);
								if (providerInstance instanceof INotationProvider) {
									String profileURI = element.getAttribute(ATT_PROFILE_URI);
									// Always put and get profile URI in all lower case
									providers.put(profileURI.toLowerCase(), (INotationProvider) providerInstance);
								} else {
									String className = element.getAttribute(ATT_CLASS);
									Logger.log(Logger.ERROR, className + " is not instanceof INotationProvider.");
								}
							} catch (CoreException e) {
								e.printStackTrace();
								Logger.logException(e);
							}
						}
					}
				}
			}
		}
	}

	private boolean validateProvider(IConfigurationElement element) {
		return (element.getAttribute(ATT_PROFILE_URI) != null && element.getAttribute(ATT_CLASS) != null);
	}

	private INotationProvider getProviderInstance(String profileURI) {
		if (providers == null) {
			load();
		}
		return providers.get(profileURI.toLowerCase());
	}

	public INotationProvider getNotationProvider(Element element) {
		// package is null for deleted elements. fixes runtime NPE during table refresh.
		if (element.getNearestPackage() != null) {
			for (Profile profile : element.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider;
					}
				}
			}
		}

		return null;
	}
}
