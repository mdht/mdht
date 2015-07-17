/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and David A Carlson.
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

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.osgi.framework.Bundle;
import org.xml.sax.SAXException;

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

		org.openhealthtools.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		ResourceSet resourceSet = new ResourceSetImpl();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();

		Path model = new Path("model");

		for (IProject project : root.getProjects()) {
			if (project.exists(model)) {
				IFolder folder = project.getFolder(model);

				final IFile plugin = project.getFile("plugin.xml");
				try {
					for (IResource resource : folder.members()) {
						if (resource.getName().endsWith(".uml") && !resource.getName().contains("_Ecore")) {
							URI modelFile = null;
							if (plugin.exists()) {
								URI pathMap = org.openhealthtools.mdht.uml.common.UmlPlugin.getPathMap(plugin.getContents());
								if (pathMap != null) {
									modelFile = pathMap.appendSegment(resource.getName());
								} else {
									modelFile = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
								}
							} else {
								modelFile = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
							}
							PackageableElement pe = null;
							try {
								pe = (PackageableElement) EcoreUtil.getObjectByType(
									resourceSet.getResource(modelFile, true).getContents(),
									UMLPackage.eINSTANCE.getPackageableElement());
							} catch (Exception e) {
								// ignore models that cannot be loaded
							}

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
				} catch (XPathExpressionException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParserConfigurationException e) {
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

	public void loadCDAModelsfromPlugins() {
		new ResourceSetImpl();

		IExtensionRegistry registry = Platform.getExtensionRegistry();

		// Get all emf ecore plugins
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.emf.ecore.generated_package");

		if (point != null) {

			for (IExtension extension : point.getExtensions()) {
				Bundle bundle = Platform.getBundle(extension.getContributor().getName());
				for (IConfigurationElement ice : extension.getConfigurationElements()) {
					String packageClassName = ice.getAttribute("class");
					if (packageClassName != null) {
						try {
							Class<?> packageClass;
							packageClass = bundle.loadClass(packageClassName);
							if (packageClass != null) {
								Field eInstance = packageClass.getDeclaredField("eINSTANCE");
								Field ePrefix = packageClass.getDeclaredField("eNS_PREFIX");
								EPackage ePackage = (EPackage) eInstance.get(null);
								String prefix = (String) ePrefix.get(null);
								for (EClassifier eClassifier : ePackage.getEClassifiers()) {
									if (eClassifier instanceof EClass) {
										if (CDAPackage.eINSTANCE.getClinicalDocument().isSuperTypeOf(
											(EClass) eClassifier)) {
											cdaDocuments.put(prefix + "::" + eClassifier.getName(), null);
										}
									}
								}
							}
						} catch (Exception e) {
						}
					}
				}

			}
		}

	}
}
