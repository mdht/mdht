package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
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
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
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
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
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
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Class) {
				selectedElement = (Class) selected;
			}
		}
		if (selectedElement != null) {
			if (CDAProfileUtil.getAppliedCDAProfile(selectedElement) != null || CDAModelUtil.getCDAClass(selectedElement) != null) {
				action.setEnabled(true);
			} else {
				action.setEnabled(false);
			}
		} else {
			action.setEnabled(false);
		}
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
	 * Returns jar location from symboic name used in generatexml to load the
	 * uml and cda resources appropriately
	 * 
	 * @param symbolicName
	 * @return
	 */
	private String getJarLocation(String symbolicName) {

		try {
			Bundle bundle = Platform.getBundle(symbolicName);
			URL url = bundle.getEntry("/");
			url = FileLocator.resolve(url);
			return url.getFile();

		} catch (IOException e) {

		}

		return "";
	}

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
						String generateProjectLocation = (index < 0) ? segments[1] : segments[1].substring(0, index);

						IProject generateProject = root.getProject(generateProjectLocation);

						// Need to have CDA Core to run in workspace mode -
						boolean hasCDACore = false;

						if (generateProject.exists() && generateProject.isOpen()) {
							Manifest projectManifest = new Manifest(getManifest(generateProject).getContents());

							Attributes attributes = projectManifest.getMainAttributes();

							String requiredBundles = attributes.getValue("Require-Bundle");

							if (requiredBundles.contains("org.openhealthtools.mdht.uml.cda.core")) {
								hasCDACore = true;
							}
						}
						// If the generation project is in the workspace -
						// launch as java
						if (hasCDACore && index >= 0 && generateProject.exists() && generateProject.isOpen()) {

							ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

							ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);

							ILaunchConfigurationWorkingCopy workingCopy;
							try {
								workingCopy = type.newInstance(null, "generateXML");

								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "org.openhealthtools.mdht.uml.cda.core.internal.generate.Generate");
								String cdaGenerateArguments = String.format(" \"%s\" \"%s\" \"jar:%s\" \"jar:%s\" ", file.getRawLocation().toOSString(), selectedElement.getName(),
										getJarLocation("org.eclipse.uml2.uml.resources"), getJarLocation("org.openhealthtools.mdht.uml.cda.resources"));
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, cdaGenerateArguments);
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, generateProject.getName());
								workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
								workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, true);
								workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);

								workingCopy.launch(ILaunchManager.RUN_MODE, null);

								workingCopy.doSave();

							} catch (CoreException e1) {
								e1.printStackTrace();
							}
						} else {

							MessageConsole myConsole = findConsole("GENERATEXML");

							myConsole.clearConsole();

							MessageConsoleStream out = myConsole.newMessageStream();

							out.println("Generated Sample XML for " + selectedElement.getName());
							out.println();
							if (generateProject.exists() && generateProject.isOpen()) {
								out.println("****************************");
								out.println("Not Running Workspace Mode! \nTemporarily add 'org.openhealthtools.mdht.uml.cda.core;visibility:=reexport' \nto the 'Require-Bundle:' section of project "
										+ generateProject.getName() + " MANIFEST.MF file  \nto enable workspace projects versus installed plugins ");
								out.println("****************************");
							}

							out.println();
							out.println();
							InstanceGenerator generator = new InstanceGenerator(false);
							EObject instance = generator.createInstance(selectedElement, 5);
							PrintWriter writer = new PrintWriter(out);
							generator.save(instance, writer);

							out.println();
							out.println();
							out.println();
							out.println("Done Generating");

							writer.close();

							try {

								IWorkbench wb = PlatformUI.getWorkbench();
								IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
								IWorkbenchPage page = win.getActivePage();
								String id = IConsoleConstants.ID_CONSOLE_VIEW;
								IConsoleView view;
								view = (IConsoleView) page.showView(id);
								view.display(myConsole);

							} catch (PartInitException e) {
							}

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
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	/*******************************************************************************
	 * Copyright (c) 2010 IBM Corporation and others. All rights reserved. This
	 * program and the accompanying materials are made available under the terms
	 * of the Eclipse Public License v1.0 which accompanies this distribution,
	 * and is available at http://www.eclipse.org/legal/epl-v10.html
	 * 
	 * Contributors: IBM Corporation - initial API and implementation
	 *******************************************************************************/

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

	/** Constant for the string <code>META-INF/MANIFEST.MF</code> */
	public final static String BUNDLE_FILENAME_DESCRIPTOR = "META-INF/MANIFEST.MF"; //$NON-NLS-1$

	public static IPath MANIFEST_PATH = new Path(BUNDLE_FILENAME_DESCRIPTOR);

	/**
	 * Returns the resource in the specified project corresponding to its
	 * <code>MANIFEST.MF</code> file.
	 * 
	 * @param project
	 *            project
	 * @return <code>MANIFEST.MF</code> file that may or may not exist
	 */
	public static IFile getManifest(IProject project) {
		return getBundleRelativeFile(project, MANIFEST_PATH);
	}

	public static IFile getGenModel(IProject project, IPath genmodelPath) {

		return getBundleRelativeFile(project, genmodelPath);
	}

	public static IFile getECoreModel(IProject project, IPath genmodelPath) {

		return getBundleRelativeFile(project, genmodelPath);
	}

	/**
	 * Returns the resource in the specified project corresponding to its
	 * <code>plugin.xml</code>file.
	 * 
	 * @param project
	 *            project
	 * @return <code>plugin.xml</code> file that may or may not exist
	 */
	public static IFile getPluginXml(IProject project) {
		return getBundleRelativeFile(project, ICoreConstants.PLUGIN_PATH);
	}

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

}
