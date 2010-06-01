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
package org.openhealthtools.mdht.uml.cda.transform;

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
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;

public class PluginPropertiesUtil {

	private IFile pluginProperties;
	private Properties properties;
	private List<String> newProperties = new ArrayList<String>();
	
	public PluginPropertiesUtil(IFile pluginProperties) {
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

	public void addProperty(String key, String value) {
		// test if key exists
		if (!properties.containsKey(key)) {
			properties.setProperty(key, value);
			newProperties.add(key);
		}
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
		}
		else if (resource.getURI().isPlatformResource()) {
			IResource iResource = workspace.getRoot().findMember(new Path(resource.getURI().path()).removeFirstSegments(1));
			if (iResource != null)
				project = iResource.getProject();
		}
		
		if (project != null) {
			IResource file = project.findMember("plugin.properties");
			if (file instanceof IFile) {
				pluginProperties = (IFile)file;
			}
			else {
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
		String header = copyFileHeader();
		
		FileOutputStream out = null;
		try {
			List<String> propertyKeys = new ArrayList<String>();
			
			// append only new keys
//			out = new FileOutputStream(pluginProperties.getLocation().toFile(), true);
//			propertyKeys.addAll(newProperties);
			
			// append all new keys after last #
			out = new FileOutputStream(pluginProperties.getLocation().toFile(), false);
			PrintStream printStream = new PrintStream(out);
			printStream.print(header);
			
			for (Object key : properties.keySet()) {
				propertyKeys.add(key.toString());
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
		}
		finally {
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
	
	private String copyFileHeader() {
		StringBuffer header = new StringBuffer();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(pluginProperties.getLocation().toFile()));
			while (reader.ready()) {
				String line = reader.readLine();
				header.append(line).append("\n");
				if (line.startsWith("# Constraint messages")) {
					break;
				}
			}
			
		} catch (Exception e) {
			// ignore and allow save to create a new file
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		return header.toString();
	}
}
