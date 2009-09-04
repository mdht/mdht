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

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
		String modelFilePath = resource.getURI().toFileString();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath modelLocation = Path.fromOSString(modelFilePath);
		IFile[] files = workspace.getRoot().findFilesForLocation(modelLocation);
		if (files.length > 0) {
			IProject project = files[0].getProject();
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
		// for testing
//		try {
//			properties.store(System.out, "updated properties");
//		} catch (IOException e) {
//			Logger.logException(e);
//		}
		
		FileOutputStream out = null;
		try {
			// append to existing file
			out = new FileOutputStream(pluginProperties.getLocation().toFile(), true);
			PrintStream printStream = new PrintStream(out);
			
			Collections.sort(newProperties);
			for (String key : newProperties) {
				String value = (String) properties.get(key);
				printStream.println(key + " = " + value);
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
}
