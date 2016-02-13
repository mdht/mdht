/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.util;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;

@SuppressWarnings("restriction")
public class CDAUIUtil {

	/**
	 * Utility class to resolve plug-in and bundle files relative to a project
	 * specific bundle root location.
	 *
	 * @since 3.6
	 */

	/**
	 * Preference key for the project relative bundle root path
	 */
	public static final String BUNDLE_ROOT_PATH = "BUNDLE_ROOT_PATH"; //$NON-NLS-1$

	/** Constant for the string <code>META-INF/MANIFEST.MF</code> */
	public final static String BUNDLE_FILENAME_DESCRIPTOR = "META-INF/MANIFEST.MF"; //$NON-NLS-1$

	public static IPath MANIFEST_PATH = new Path(BUNDLE_FILENAME_DESCRIPTOR);

	public static IPath MODEL_PATH = new Path("model");

	public static IPath DITA_PATH = new Path("dita");

	/**
	 * Returns a file relative to the bundle root of the specified project.
	 *
	 * @param project
	 *            project
	 * @param path
	 *            bundle root relative path
	 * @return file that may or may not exist
	 */
	public static IFile getBundleRelativeFile(IProject project, IPath path) {
		return getBundleRoot(project).getFile(path);
	}

	/**
	 * Returns a folder relative to the bundle root of the specified project.
	 *
	 * @param project
	 *            project
	 * @param path
	 *            bundle root relative path
	 * @return folder that may or may not exist
	 */
	public static IFolder getBundleRelativeFolder(IProject project, IPath path) {
		return getBundleRoot(project).getFolder(path);
	}

	/**
	 * Returns the container in the specified project that corresponds to the
	 * root of bundle related artifacts. May return the project itself or a
	 * folder within the project.
	 *
	 * @param project
	 *            project
	 * @return container corresponding to the bundle root
	 */
	public static IContainer getBundleRoot(IProject project) {
		ProjectScope scope = new ProjectScope(project);
		IEclipsePreferences node = scope.getNode(PDECore.PLUGIN_ID);
		if (node != null) {
			String string = node.get(BUNDLE_ROOT_PATH, null);
			if (string != null) {
				IPath path = Path.fromPortableString(string);
				return project.getFolder(path);
			}
		}
		return project;
	}

	public static IFile getECoreModel(IProject project, IPath genmodelPath) {

		return getBundleRelativeFile(project, genmodelPath);
	}

	public static URI getGeneratorModel(IProject project) {
		IFile generatorModelFile = getProjectFile(project, MODEL_PATH, ".genmodel");
		if (generatorModelFile != null) {
			return URI.createFileURI(generatorModelFile.getRawLocation().toOSString());
		} else {
			return null;
		}
	}

	public static IPath getGeneratorModelFile(IProject project) {
		IFile generatorModelFile = getProjectFile(project, MODEL_PATH, ".genmodel");
		if (generatorModelFile != null) {
			return generatorModelFile.getFullPath();
		} else {
			return null;
		}

	}

	public static IFile getGenModel(IProject project, IPath genmodelPath) {
		return getBundleRelativeFile(project, genmodelPath);
	}

	/**
	 * Returns the resource in the specified project corresponding to its <code>MANIFEST.MF</code> file.
	 *
	 * @param project
	 *            project
	 * @return <code>MANIFEST.MF</code> file that may or may not exist
	 */
	public static IFile getManifest(IProject project) {
		return getBundleRelativeFile(project, MANIFEST_PATH);
	}

	/**
	 * Returns the resource in the specified project corresponding to its <code>plugin.xml</code>file.
	 *
	 * @param project
	 *            project
	 * @return <code>plugin.xml</code> file that may or may not exist
	 */
	public static IFile getPluginXml(IProject project) {
		return getBundleRelativeFile(project, ICoreConstants.PLUGIN_PATH);
	}

	public static IFile getProjectFile(IProject project, IPath folderPath, String fileExtension) {
		IFile fileResource = null;

		if (project.exists(folderPath)) {

			IFolder folder = project.getFolder(folderPath);

			try {
				folder.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e1) {

			}

			try {
				for (IResource resource : folder.members()) {
					if (resource.getName().endsWith(fileExtension)) {
						fileResource = (IFile) resource;
						break;
					}
				}
			} catch (CoreException e) {

			}
		}

		return fileResource;
	}

	public static URI getUMLEcoreModel(IProject project) {
		IFile generatorModelFile = getProjectFile(project, MODEL_PATH, "_Ecore.uml");
		if (generatorModelFile != null) {
			return URI.createFileURI(generatorModelFile.getRawLocation().toOSString());
		} else {
			return null;
		}
	}

	public static IPath getUMLEcoreModelFile(IProject project) {
		IFile generatorModelFile = getProjectFile(project, MODEL_PATH, "_Ecore.uml");
		if (generatorModelFile != null) {
			return generatorModelFile.getFullPath();
		} else {
			return null;
		}

	}

}
