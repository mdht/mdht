/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package traceability.util;

import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceabilityFactory;
import traceability.Traces;

public class TraceabilityUtils {

	/**
	 * @return login username
	 */
	public static String getUsername() {
		try {
			Class<?> c = null;
			Object o = null;
			Method method = null;
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {

				c = Class.forName("com.sun.security.auth.module.NTSystem");

				o = Class.forName("com.sun.security.auth.module.NTSystem").newInstance();

				method = c.getDeclaredMethod("getName");

			}

			if (System.getProperty("os.name").toLowerCase().contains("linux")) {

				c = Class.forName("com.sun.security.auth.module.UnixSystem");

				o = Class.forName("com.sun.security.auth.module.UnixSystem").newInstance();

				method = c.getDeclaredMethod("getUsername");

			}

			if (System.getProperty("os.name").toLowerCase().contains("solaris")) {

				c = Class.forName("com.sun.security.auth.module.SolarisSystem");

				o = Class.forName("com.sun.security.auth.module.SolarisSystem").newInstance();

				method = c.getDeclaredMethod("getUsername");

			}

			if (c != null) {
				return (String) method.invoke(o);
			}
		} catch (Exception e) {
			// do nothing
		}

		return System.getProperty("user.name");

	}

	public static String getProjectName(Resource resource) {
		if (resource != null && resource.getURI().isPlatformResource()) {
			String result = resource.getURI().segment(1);
			if (BETTER_DESCRIPTION.containsKey(result))
				result = BETTER_DESCRIPTION.get(result);
			return result;
		}
		return null;
	}

	/**
	 * @param eObject
	 * @return the project name the given object resides in
	 */
	public static String getProjectName(EObject eObject) {
		return getProjectName(eObject.eResource());
	}

	public static Map<String, String> BETTER_DESCRIPTION = new WeakHashMap<String, String>();

	public static <T> boolean addTrace(Traces currentCategory, T result) {
		if (result instanceof Trace || result instanceof LogEntry) {
			currentCategory.getTraces().add((EObject) result);
			return true;
		}
		return false;
	}

	/**
	 * Creates a trace model and initializes some fields of it
	 * 
	 * @param uri
	 * @param originalSourceURL
	 * @param resourceSet
	 * @return
	 */
	static public Traces createTraceModel(URI uri, String originalSourceURL, ResourceSet resourceSet, boolean loadIfExists, String fullName) {
		Resource traces = null;
		try {
			traces = resourceSet.getResource(uri, false);
		} catch (Exception e) {
			// not found in resourceset, next load or create it
		}
		if (traces == null && loadIfExists) {
			try {
				traces = resourceSet.getResource(uri, true);
			} catch (Exception e) {
				// cannot be loaded, next create it
			}
		}
		if (traces == null) {
			traces = resourceSet.createResource(uri);
		}
		int index = -1;
		for (EObject eObject : new ArrayList<EObject>(traces.getContents())) {
			if (eObject instanceof Traces) {
				Traces tracesRoot = (Traces) eObject;
				if (fullName.equals(tracesRoot.getFullName())) {
					index = traces.getContents().indexOf(eObject);
					traces.getContents().remove(eObject);
				} else if (tracesRoot.getFullName() == null) {
					traces.getContents().remove(eObject);
				}
			} else {
				traces.getContents().remove(eObject);
			}
		}
		if (index == -1)
			index = traces.getContents().size();
		Traces tracesRoot = TraceabilityFactory.eINSTANCE.createTraces();
		tracesRoot.setOriginalSourceURL(originalSourceURL);
		tracesRoot.setDate(new Date());
		tracesRoot.setUsername(getUsername());
		tracesRoot.setFullName(fullName);
		try {
			tracesRoot.setLocation(Inet4Address.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		traces.getContents().add(index, tracesRoot);
		return tracesRoot;

	}

}
