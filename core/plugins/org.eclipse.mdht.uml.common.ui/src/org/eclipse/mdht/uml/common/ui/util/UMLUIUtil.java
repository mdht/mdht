/*******************************************************************************
 * Copyright (c) 2015 Sean Muir - JKM Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - JKM Software - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @author seanmuir
 *
 */
public class UMLUIUtil {

	public static ResourceSet loadModelsfromWorkspace() {

		org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();

		Path model = new Path("model");

		for (IProject project : root.getProjects()) {
			if (project.isOpen() && project.exists(model)) {

				final IFile plugin = project.getFile("plugin.xml");

				IFolder folder = project.getFolder(model);
				try {
					for (IResource resource : folder.members()) {
						if (resource.getName().endsWith(".uml") && !resource.getName().contains("_Ecore")) {

							URI modelFile = null;
							if (plugin.exists()) {
								URI pathMap = org.eclipse.mdht.uml.common.UmlPlugin.getPathMap(plugin.getContents());
								if (pathMap != null) {
									modelFile = pathMap.appendSegment(resource.getName());
								} else {
									modelFile = URI.createFileURI(
										project.getFolder(model).getFile(
											resource.getName()).getRawLocation().toOSString());
								}
							} else {
								modelFile = URI.createFileURI(
									project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
							}

							EcoreUtil.getObjectByType(
								resourceSet.getResource(modelFile, true).getContents(),
								UMLPackage.eINSTANCE.getPackageableElement());

						}

					}
				} catch (Exception e) {
					// Logger.logException(e);
				}

			}

		}

		return resourceSet;
	}

}
