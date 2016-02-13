/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Integration of new transformation framework (artf3240)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mdht.uml.transform.internal.Logger;

public class PluginPropertiesUtil {
	private static String CONSTRAINT_MESSAGE_MARKER = "# Constraint messages";

	private IFile pluginProperties;

	private Properties properties;

	private List<String> newProperties = new ArrayList<String>();

	public PluginPropertiesUtil() {
		super();
	}

	public PluginPropertiesUtil(IFile pluginProperties) {
		initPluginProperties(pluginProperties);
	}

	private void initPluginProperties(IFile pluginProperties) {
		this.pluginProperties = pluginProperties;

		properties = new Properties();
		try {
			properties.load(pluginProperties.getContents());
		} catch (Exception e) {
			Logger.logException(e);
		}
	}

	public PluginPropertiesUtil(Resource resource) {
		this(findPluginProperties(resource));
	}

	public void setPluginProperties(IFile pluginProperties) {
		initPluginProperties(pluginProperties);
	}

	public void initPluginProperties(Resource resource) {
		initPluginProperties(findPluginProperties(resource));
	}

	public void addProperty(String key, String value) {
		// test if key exists
		if (!properties.containsKey(key)) {
			newProperties.add(key);
		}

		// update existing property with new value or add new property key
		properties.setProperty(key, value);
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	/**
	 * Find plugin.properties file in Eclipse project containing the given resource.
	 *
	 * @param resource
	 * @return
	 */
	private static IFile findPluginProperties(Resource resource) {
		IFile pluginProperties = null;

		// get project file path
		IProject project = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		if (resource.getURI().isFile()) {
			IPath modelLocation = Path.fromOSString(resource.getURI().toFileString());
			IFile[] files = workspace.getRoot().findFilesForLocation(modelLocation);
			if (files.length > 0) {
				project = files[0].getProject();
			}
		} else if (resource.getURI().isPlatformResource()) {
			IResource iResource = workspace.getRoot().findMember(
				new Path(resource.getURI().path()).removeFirstSegments(1));
			if (iResource != null) {
				project = iResource.getProject();
			}
		}

		if (project != null) {
			IResource file = project.findMember("plugin.properties");
			if (file instanceof IFile) {
				pluginProperties = (IFile) file;
			} else {
				// create new plugin.properties
				pluginProperties = project.getFile("plugin.properties");
			}

			if (!pluginProperties.exists()) {
				ByteArrayInputStream is = new ByteArrayInputStream(new byte[0]);
				try {
					pluginProperties.create(is, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}

		return pluginProperties;
	}

	public void save() {
		FileOutputStream out = null;
		PrintStream printStream = null;
		List<String> propertyKeys = new ArrayList<String>();

		try {
			if (hasConstraintMessageMarker()) {
				// append all keys after comment tag
				String header = copyFileHeader();

				out = new FileOutputStream(pluginProperties.getLocation().toFile(), false);
				printStream = new PrintStream(out);
				printStream.print(header);

				for (Object key : properties.keySet()) {
					propertyKeys.add(key.toString());
				}
			} else {
				// append only new keys
				out = new FileOutputStream(pluginProperties.getLocation().toFile(), true);
				printStream = new PrintStream(out);

				propertyKeys.addAll(newProperties);
			}

			Collections.sort(propertyKeys);
			for (String key : propertyKeys) {
				if (!"pluginName".equals(key) && !"providerName".equals(key)) {
					String value = (String) properties.get(key);
					printStream.println(key + " = " + value);
				}
			}

		} catch (FileNotFoundException e) {
			Logger.logException(e);
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					Logger.logException(e);
				}
			}
		}

		// refresh the workspace file
		try {
			pluginProperties.getParent().refreshLocal(IResource.DEPTH_ONE, null);
		} catch (CoreException e) {
			Logger.logException(e);
		}
	}

	private boolean hasConstraintMessageMarker() {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(pluginProperties.getLocation().toFile()));
			while (reader.ready()) {
				String line = reader.readLine();
				if (line.startsWith(CONSTRAINT_MESSAGE_MARKER)) {
					return true;
				}
			}

		} catch (Exception e) {
			// ignore and return false
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	private String copyFileHeader() {
		StringBuffer header = new StringBuffer();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(pluginProperties.getLocation().toFile()));
			while (reader.ready()) {
				String line = reader.readLine();
				header.append(line).append("\n");
				if (line.startsWith(CONSTRAINT_MESSAGE_MARKER)) {
					break;
				}
			}

		} catch (Exception e) {
			// ignore and allow save to create a new file
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return header.toString();
	}
}
