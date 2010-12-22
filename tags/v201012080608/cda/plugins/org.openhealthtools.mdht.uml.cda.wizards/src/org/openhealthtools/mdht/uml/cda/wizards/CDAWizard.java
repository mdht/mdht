package org.openhealthtools.mdht.uml.cda.wizards;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

@SuppressWarnings("restriction")
public abstract class CDAWizard extends Wizard {

	protected HashMap<String, Package> cdaPackages = new HashMap<String, Package>();

	protected HashMap<String, Type> cdaDocuments = new HashMap<String, Type>();

	protected HashMap<String, PluginReference> references = new HashMap<String, PluginReference>();

	protected Type clinicalDocument = null;

	protected IPluginContentWizard contentWizard = new IPluginContentWizard() {

		public void addPages() {

		}

		public boolean canFinish() {

			return false;
		}

		public void createPageControls(Composite pageContainer) {

		}

		public void dispose() {

		}

		public IWizardContainer getContainer() {

			return null;
		}

		public Image getDefaultPageImage() {

			return null;
		}

		public IDialogSettings getDialogSettings() {

			return null;
		}

		public IWizardPage getNextPage(IWizardPage page) {

			return null;
		}

		public IWizardPage getPage(String pageName) {

			return null;
		}

		public int getPageCount() {

			return 0;
		}

		public IWizardPage[] getPages() {

			return null;
		}

		public IWizardPage getPreviousPage(IWizardPage page) {

			return null;
		}

		public IWizardPage getStartingPage() {

			return null;
		}

		public RGB getTitleBarColor() {

			return null;
		}

		public String getWindowTitle() {

			return null;
		}

		public boolean isHelpAvailable() {

			return false;
		}

		public boolean needsPreviousAndNextButtons() {

			return false;
		}

		public boolean needsProgressMonitor() {

			return false;
		}

		public boolean performCancel() {

			return false;
		}

		public boolean performFinish() {

			return false;
		}

		public void setContainer(IWizardContainer wizardContainer) {

		}

		public void init(IFieldData data) {

		}

		public IPluginReference[] getDependencies(String schemaVersion) {

			// currently simple sort keeps manifest readable - might need to
			// have more complex logic - SWM

			Comparator<IPluginReference> c = new Comparator<IPluginReference>() {

				public int compare(IPluginReference arg0, IPluginReference arg1) {
					return arg0.getId().compareTo(arg1.getId());
				}

			};

			List<IPluginReference> list = new ArrayList<IPluginReference>();

			list.addAll(references.values());

			Collections.sort(list, c);

			IPluginReference[] results = new IPluginReference[list.size()];

			list.toArray(results);

			return results;

		}

		public String[] getNewFiles() {

			return new String[] {};
		}

		public boolean performFinish(IProject project, IPluginModelBase model, IProgressMonitor monitor) {

			return false;
		}

	};

	protected IProjectProvider fProjectProvider;
	protected PluginFieldData fPluginData;

	IProject project;

	String name;

	public CDAWizard() {
		super();

		fPluginData = new PluginFieldData();
		fPluginData.setDoGenerateClass(false);
		fPluginData.setEnableAPITooling(false);
		fPluginData.setClassname(null);
		fPluginData.setSourceFolderName("src");
		fPluginData.setOutputFolderName("bin");
		fPluginData.setUIPlugin(false);
		fPluginData.setHasBundleStructure(true);
		fPluginData.setTargetVersion("3.5");
		fPluginData.setExecutionEnvironment("J2SE-1.5");

		fProjectProvider = new IProjectProvider() {

			public IProject getProject() {

				return project;
			}

			public String getProjectName() {

				return name;
			}

			public IPath getLocationPath() {

				return project.getFullPath();
			}

		};
	
	}

	IFolder createFolder(IProject project, String name) {
		try {
			IFolder folder = getBundleRelativeFolder(project, new Path(name));
			folder.create(true, false, null);
			return folder;
		} catch (CoreException e) {

			e.printStackTrace();
		}
		return null;
	}

	IFile createFile(IProject project, String name, InputStream contents) {

		try {

			IPath filePath = new Path(name);

			IFile file = getBundleRelativeFile(project, filePath);

			file.create(contents, true, null);

			return file;

		} catch (CoreException e) {

			e.printStackTrace();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	void loadCDAModels() {
		ResourceSet resourceSet = new ResourceSetImpl();

		IExtensionRegistry registry = Platform.getExtensionRegistry();

		// Get all emf ecore plugins
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.emf.ecore.generated_package");

		if (point != null) {

			for (IExtension extension : point.getExtensions()) {

				Bundle bundle = Platform.getBundle(extension.getContributor().getName());

				if (bundle != null) {

					// Get the uml files with the bundle
					Enumeration<URL> umlFiles = bundle.findEntries("model", "*.uml", true);

					if (umlFiles != null) {

						while (umlFiles.hasMoreElements()) {

							java.net.URL umlFileURL = (java.net.URL) umlFiles.nextElement();

							// filter out cda uml_ecore models
							if (!umlFileURL.getFile().contains("_Ecore")) {

								URI foo = URI.createPlatformPluginURI(extension.getContributor().getName() + umlFileURL.getPath(), false);

								PackageableElement foo2 = (PackageableElement) EcoreUtil.getObjectByType(resourceSet.getResource(foo, true).getContents(),
										UMLPackage.eINSTANCE.getPackageableElement());

								if (foo2 instanceof Package) {

									Package p = (Package) foo2;
									// bit of hack checking to see if the
									// package is call cda or CDA Profile
									// applied
									if (p.getAppliedProfile("CDA") != null || p.getName().equals("cda")) {

										cdaPackages.put(p.getQualifiedName(), p);

										// Add model plugin to required bundles
										references.put(bundle.getSymbolicName(), new PluginReference(bundle.getSymbolicName(), null, 0));

										references.put("org.openhealthtools.mdht.builder.cda", new PluginReference("org.openhealthtools.mdht.builder.cda", null, 0));

										// Add model plugin required bundles to
										// the plugin
										Object header = bundle.getHeaders().get(Constants.REQUIRE_BUNDLE);
										try {
											for (ManifestElement manifestElement : ManifestElement.parseHeader(Constants.REQUIRE_BUNDLE, (String) header)) {
												references.put(manifestElement.getValue(), new PluginReference(manifestElement.getValue(), null, 0));
											}
										} catch (BundleException e1) {

											e1.printStackTrace();
										}
									}
								}

							}
						}
					}

				}
			}
		}

		Package cdaPackage = cdaPackages.get("cda");

		// make sure the package is available
		if (cdaPackage != null) {
			clinicalDocument = cdaPackage.getOwnedType("ClinicalDocument");
			for (Package ps : cdaPackages.values()) {

				for (Type type : ps.getOwnedTypes()) {
					if (type.conformsTo(clinicalDocument)) {
						cdaDocuments.put(type.getQualifiedName(), type);
					}
				}

			}

		}

	}

	/*
	 * The following code is from helios build and included to support galileo
	 */

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

	/**
	 * Returns the resource in the specified project corresponding to its
	 * <code>MANIFEST.MF</code> file.
	 * 
	 * @param project
	 *            project
	 * @return <code>MANIFEST.MF</code> file that may or may not exist
	 */
	public static IFile getManifest(IProject project) {
		return getBundleRelativeFile(project, ICoreConstants.MANIFEST_PATH);
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
