/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial implementation
 *     David A Carlson (XMLmodeling.com) - generalize and move code into this util class
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.util;

import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

public class CDAProjectUtil {

	private Map<String, Package> cdaPackages = new HashMap<String, Package>();

	private Map<String, Type> cdaDocuments = new HashMap<String, Type>();

	private Map<String, IFile> cdaDocumentsManfiest = new HashMap<String, IFile>();

	private Map<String, IFile> cdaDocumentsGenModels = new HashMap<String, IFile>();

	private Map<String, PluginReference> references = new HashMap<String, PluginReference>();

	private Type clinicalDocument = null;

	public CDAProjectUtil() {
	}

	/**
	 * @return the cdaPackages
	 */
	public Map<String, Package> getCDAPackages() {
		return cdaPackages;
	}

	/**
	 * @return the cdaDocuments
	 */
	public Map<String, Type> getCDADocuments() {
		return cdaDocuments;
	}

	/**
	 * @return the cdaDocumentsManfiest
	 */
	public Map<String, IFile> getCDADocumentsManfiests() {
		return cdaDocumentsManfiest;
	}

	/**
	 * @return the cdaDocumentsGenModels
	 */
	public Map<String, IFile> getCDADocumentsGenModels() {
		return cdaDocumentsGenModels;
	}

	/**
	 * @return the references
	 */
	public Map<String, PluginReference> getReferences() {
		return references;
	}

	public void loadCDAModelsfromWorkspace() {
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
										cdaDocumentsManfiest.put(
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
									}
								}
							}
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
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
						cdaDocumentsManfiest.put(
							type.getQualifiedName(), cdaDocumentsManfiest.get(ps.getQualifiedName()));
						cdaDocumentsGenModels.put(
							type.getQualifiedName(), cdaDocumentsGenModels.get(ps.getQualifiedName()));
					}
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void loadCDAModelsfromPlugins() {
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
}
