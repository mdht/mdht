/*******************************************************************************
 * Copyright (c) 2010,2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Rama Ramakrishnan - modifications to the URL handling for instance generation.
 *     Sean Muir (NEHTA) - modifications to add cda.core to manifest on the fly
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class GenerateSampleInstanceAction implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Class selectedElement;

	public GenerateSampleInstanceAction() {
		super();
	}

	/**
	 * @throws IOException
	 * @throws CoreException
	 */
	private void createInstance() throws IOException, CoreException {

		if (selectedElement != null) {
			if (selectedElement.eContainer() != null) {
				if (selectedElement.eContainer().eResource() != null) {

					IWorkspace workspace = ResourcesPlugin.getWorkspace();

					IWorkspaceRoot root = workspace.getRoot();

					URI u = selectedElement.eContainer().eResource().getURI();

					String segments[] = u.segments();

					// Assumes the project is structured with the uml file in
					// the models directory
					IFile file = root.getProject(segments[1]).getFolder(segments[2]).getFile(segments[3]);

					if (file != null && file.exists()) {

						int index = segments[1].lastIndexOf(".model");

						// if not following mdht naming .model; do not attempt
						// to
						// find corresponding generation project
						String generateProjectLocation = (index < 0)
								? segments[1]
								: segments[1].substring(0, index);

						IProject generateProject = root.getProject(generateProjectLocation);

						// Need to have CDA Core to run in workspace mode -
						boolean neededCore = false;

						if (generateProject.exists() && generateProject.isOpen()) {
							Manifest projectManifest = new Manifest(
								CDAUIUtil.getManifest(generateProject).getContents());

							Attributes attributes = projectManifest.getMainAttributes();

							String requiredBundles = attributes.getValue("Require-Bundle");

							/*
							 * The org.openhealthtools.mdht.uml.cda.core bundle is required for the generate class
							 * If the org.openhealthtools.mdht.uml.cda.core bundle is not present add to the manifest on the fly
							 */
							if (!requiredBundles.contains("org.openhealthtools.mdht.uml.cda.core")) {
								neededCore = true;

								attributes.putValue("Require-Bundle", attributes.getValue("Require-Bundle") +
										",org.openhealthtools.mdht.uml.cda.core");
								ByteArrayOutputStream out = new ByteArrayOutputStream();
								projectManifest.write(out);
								InputStream inputStream = new ByteArrayInputStream(out.toByteArray());
								CDAUIUtil.getManifest(generateProject).setContents(inputStream, true, true, null);
							}
						}
						// If the generation project is in the workspace -
						// launch as java
						if (index >= 0 && generateProject.exists() && generateProject.isOpen()) {

							ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

							ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);

							ILaunchConfigurationWorkingCopy workingCopy;
							try {
								workingCopy = type.newInstance(null, "generateXML");

								workingCopy.setAttribute(
									IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
									"org.openhealthtools.mdht.uml.cda.core.internal.generate.Generate");
								String cdaGenerateArguments = String.format(
									" \"%s\" \"%s\" \"%s\" \"%s\" ", file.getRawLocation().toOSString(),
									selectedElement.getName(),
									getFormattedResourceLocation("org.eclipse.uml2.uml.resources"),
									getFormattedResourceLocation("org.openhealthtools.mdht.uml.cda.resources"));
								workingCopy.setAttribute(
									IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, cdaGenerateArguments);
								workingCopy.setAttribute(
									IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, generateProject.getName());
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
								workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, true);
								workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);

								workingCopy.launch(ILaunchManager.RUN_MODE, null);

								workingCopy.doSave();

							} catch (CoreException e1) {
								e1.printStackTrace();
							}
						}
						/*
						 * If we add the core - remove it
						 */
						if (neededCore) {

							Manifest projectManifest = new Manifest(
								CDAUIUtil.getManifest(generateProject).getContents());

							Attributes attributes = projectManifest.getMainAttributes();

							String requiredBundles = attributes.getValue("Require-Bundle");

							attributes.putValue(
								"Require-Bundle", requiredBundles.replace(",org.openhealthtools.mdht.uml.cda.core", ""));
							ByteArrayOutputStream out = new ByteArrayOutputStream();
							projectManifest.write(out);
							InputStream inputStream = new ByteArrayInputStream(out.toByteArray());
							CDAUIUtil.getManifest(generateProject).setContents(inputStream, true, true, null);

						}

					}

				}

			}
		}
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();

		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	/**
	 * Returns URL of the file /jar resource based on the symbolic name
	 * 
	 * @param symbolicName
	 * @return URL
	 */
	private URL getURLFromSymbolicName(String symbolicName) {

		try {
			Bundle bundle = Platform.getBundle(symbolicName);
			URL url = bundle.getEntry("/");
			url = FileLocator.resolve(url);
			return url;

		} catch (IOException e) {

		}

		return null;
	}

	/**
	 * Gets the formatted url with the type of resource.
	 * e.g. URL's with jar protocol will be returned as jar:file:/<resource-path>
	 * URL's with file protocol will be returned as file:/<resource-path>
	 * 
	 * @param resource
	 * @return
	 */
	private String getFormattedResourceLocation(String resource) {

		URL fileURL = getURLFromSymbolicName(resource);
		return fileURL.toExternalForm();
	}

	@SuppressWarnings("rawtypes")
	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection).iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = (View) ((IAdaptable) element).getAdapter(View.class);

			if (view != null) {
				return view;
			}
		}

		return null;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			createInstance();
		} catch (IOException e) {

		} catch (CoreException e) {
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
		selectedElement = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Class) {
				selectedElement = (Class) selected;
			}
		}
		if (selectedElement != null) {
			if (CDAProfileUtil.getAppliedCDAProfile(selectedElement) != null ||
					CDAModelUtil.getCDAClass(selectedElement) != null) {
				action.setEnabled(true);
			} else {
				action.setEnabled(false);
			}
		} else {
			action.setEnabled(false);
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}
}
