/*******************************************************************************
 * Copyright (c) 2011 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.wizards;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

public abstract class CDAWizard extends Wizard implements IWorkbenchWizard {

	protected HashMap<String, Package> cdaPackages = new HashMap<String, Package>();

	protected HashMap<String, Type> cdaDocuments = new HashMap<String, Type>();

	protected HashMap<String, IFile> cdaDocumentsManifest = new HashMap<String, IFile>();

	protected HashMap<String, IFile> cdaDocumentsGenModels = new HashMap<String, IFile>();

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

	IProject modelProject;

	IProject generatedProject;

	IProject docProject;

	String modelProjectName;

	String generateProjectName;

	String docProjectName;

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

		fPluginData.setVersion("0.1.0.qualifier");

		fProjectProvider = new IProjectProvider() {

			public IProject getProject() {

				return generatedProject;
			}

			public String getProjectName() {

				return generateProjectName;
			}

			public IPath getLocationPath() {

				return generatedProject.getFullPath();
			}

		};

	}

	IFolder createFolder(IProject project, String name) {
		try {
			IFolder folder = CDAUIUtil.getBundleRelativeFolder(project, new Path(name));
			folder.create(true, false, null);
			return folder;
		} catch (Exception e) {
			Logger.logException(e);
		}

		return null;
	}

	IFile createFile(IProject project, String name, InputStream contents) {

		try {

			IPath filePath = new Path(name);

			IFile file = CDAUIUtil.getBundleRelativeFile(project, filePath);

			file.create(contents, true, null);

			return file;

		} catch (Exception e) {
			Logger.logException(e);
		}

		return null;
	}

	void loadCDAModels() {
		loadCDAModelsfromWorkspace();
	}

	void loadCDAModelsfromWorkspace() {
		ResourceSet resourceSet = new ResourceSetImpl();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();

		Path model = new Path("model");

		for (IProject project : root.getProjects()) {
			if (project.exists(model)) {
				IFolder folder = project.getFolder(model);
				try {
					for (IResource resource : folder.members()) {
						if (resource.getName().endsWith(".uml") && !resource.getName().contains("_Ecore")) {
							URI modelFile = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
							PackageableElement pe = (PackageableElement) EcoreUtil.getObjectByType(
								resourceSet.getResource(modelFile, true).getContents(),
								UMLPackage.eINSTANCE.getPackageableElement());
							if (pe != null) {
								if (pe instanceof Package) {
									Package p = (Package) pe;
									if (p.getAppliedProfile("CDA") != null || p.getName().equals("cda")) {

										IProject generatedProject = project;
										if (project.getName().endsWith(".model")) {
											generatedProject = root.getProject(project.getName().replace(".model", ""));
										}

										cdaPackages.put(p.getQualifiedName(), p);
										cdaDocumentsManifest.put(
											p.getQualifiedName(), CDAUIUtil.getManifest(generatedProject));

										if (generatedProject.getFolder(model).exists()) {
											for (IResource genmodel : generatedProject.getFolder(model).members()) {
												if (genmodel.getName().endsWith(".genmodel")) {
													cdaDocumentsGenModels.put(
														p.getQualifiedName(),
														CDAUIUtil.getGenModel(
															generatedProject, genmodel.getProjectRelativePath()));
												}
											}
										}
										//
									}

								}

							}

						}

					}
				} catch (Exception e) {
					Logger.logException(e);
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
						cdaDocumentsManifest.put(
							type.getQualifiedName(), cdaDocumentsManifest.get(ps.getQualifiedName()));
						cdaDocumentsGenModels.put(
							type.getQualifiedName(), cdaDocumentsGenModels.get(ps.getQualifiedName()));
					}
				}

			}

		}

	}

	void loadCDAModelsfromPlugins() {
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

							java.net.URL umlFileURL = umlFiles.nextElement();

							// filter out cda uml_ecore models
							if (!umlFileURL.getFile().contains("_Ecore")) {

								URI foo = URI.createPlatformPluginURI(
									extension.getContributor().getName() + umlFileURL.getPath(), false);

								PackageableElement foo2 = (PackageableElement) EcoreUtil.getObjectByType(
									resourceSet.getResource(foo, true).getContents(),
									UMLPackage.eINSTANCE.getPackageableElement());

								if (foo2 instanceof Package) {

									Package p = (Package) foo2;
									// bit of hack checking to see if the
									// package is call cda or CDA Profile
									// applied
									if (p.getAppliedProfile("CDA") != null || p.getName().equals("cda")) {

										cdaPackages.put(p.getQualifiedName(), p);

										// Add model plugin to required bundles
										references.put(
											bundle.getSymbolicName(), new PluginReference(
												bundle.getSymbolicName(), null, 0));

										references.put("org.openhealthtools.mdht.builder.cda", new PluginReference(
											"org.openhealthtools.mdht.builder.cda", null, 0));

										// Add model plugin required bundles to
										// the plugin
										Object header = bundle.getHeaders().get(Constants.REQUIRE_BUNDLE);
										try {
											for (ManifestElement manifestElement : ManifestElement.parseHeader(
												Constants.REQUIRE_BUNDLE, (String) header)) {
												references.put(manifestElement.getValue(), new PluginReference(
													manifestElement.getValue(), null, 0));
											}
										} catch (Exception e) {
											Logger.logException(e);
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

	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

}
