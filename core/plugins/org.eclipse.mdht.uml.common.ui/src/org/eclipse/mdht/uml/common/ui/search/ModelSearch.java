/*******************************************************************************
 * Copyright (c) 2004, 2015 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (NEHTA) - modified model search to use path maps
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.search;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 *
 * @version $Id: $
 */
public class ModelSearch {

	/**
	 *
	 */
	private ModelSearch() {
	}

	private static boolean implementsInterface(Object object, Class<?> anInterface) {
		Class<?>[] interfaces = object.getClass().getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			if (interfaces[i] == anInterface) {
				return true;
			}
		}

		return false;
	}

	public static List<EObject> findStereotypeApplications(ResourceSet resourceSet, Stereotype stereotype) {
		List<EObject> elementList = new ArrayList<EObject>();
		for (Resource resource : resourceSet.getResources()) {
			String uri = resource.getURI().toString();
			if (uri.equals(UMLResource.UML_METAMODEL_URI) || uri.equals(UMLResource.ECORE_METAMODEL_URI)) {
				continue;
			}

			elementList.addAll(findStereotypeApplications(resource, stereotype));
		}

		return elementList;
	}

	public static List<EObject> findStereotypeApplications(Resource resource, Stereotype stereotype) {
		List<EObject> elementList = new ArrayList<EObject>();
		for (EObject eObject : resource.getContents()) {
			if (stereotype.equals(UMLUtil.getStereotype(eObject))) {
				elementList.add(eObject);
			}
		}

		return elementList;
	}

	public static List<Element> findAllOf(ResourceSet resourceSet, IElementFilter filter) {
		List<Element> elementList = new ArrayList<Element>();
		// TreeIterator<EObject> iterator = EcoreUtil.getAllProperContents(resourceSet.getResources(), true);
		TreeIterator<Notifier> iterator = resourceSet.getAllContents();

		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (Resource.class.isInstance(element)) {
				continue;
			} else if (ProfileApplication.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			} else if (Profile.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			} else if (EAnnotation.class.isInstance(element)) {
				iterator.prune();
			}

			else if (Package.class.isInstance(element)) {
				// if ("uml2".equals(((Package)element).getQualifiedName()))
				// iterator.prune();
				if (UMLResource.UML_METAMODEL_URI.equals(((Package) element).eResource().getURI().toString())) {
					iterator.prune();
				} else if (UMLResource.ECORE_METAMODEL_URI.equals(
					((Package) element).eResource().getURI().toString())) {
					iterator.prune();
					// else if (UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI.equals(
					// ((Package)element).eResource().getURI().toString()))
					// iterator.prune();
					// else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI.equals(
					// ((Package)element).eResource().getURI().toString()))
					// iterator.prune();
					// else if (UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI.equals(
					// ((Package)element).eResource().getURI().toString()))
					// iterator.prune();
				} else if (filter.accept((Element) element)) {
					elementList.add((Element) element);
				}
			}

			else if (element instanceof Element && filter.accept((Element) element)) {
				elementList.add((Element) element);
			} else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}

		return elementList;
	}

	public static List<Element> findAllOf(Package umlPackage, IElementFilter filter) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<EObject> iterator = umlPackage.eAllContents();

		while (iterator != null && iterator.hasNext()) {
			EObject element = iterator.next();
			if (element instanceof ElementImport) {
				element = ((ElementImport) element).getImportedElement();

				// exclude metaclasses
				if (UMLResource.UML_METAMODEL_URI.equals(element.eResource().getURI().toString())) {
					continue;
				}
			} else if (element instanceof PackageImport) {
				Package importedPackage = ((PackageImport) element).getImportedPackage();
				// exclude metaclasses
				if (importedPackage != null && !importedPackage.eIsProxy() &&
						!UMLResource.UML_METAMODEL_URI.equals(importedPackage.eResource().getURI().toString())) {
					element = importedPackage;
					elementList.addAll(findAllOf(importedPackage, filter));
				} else {
					continue;
				}
			}

			if (element instanceof Element && filter.accept((Element) element)) {
				elementList.add((Element) element);
			} else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}

		return elementList;
	}

	// TODO include source object in params, also test Classifier::conformsTo
	public static List<Element> findAllOf(Package umlPackage, Class<?> type) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<EObject> iterator = umlPackage.eAllContents();

		while (iterator != null && iterator.hasNext()) {
			EObject element = iterator.next();
			if (element instanceof ElementImport) {
				element = ((ElementImport) element).getImportedElement();

				if (!UMLResource.UML_METAMODEL_URI.equals(element.eResource().getURI().toString())) {
					// exclude metaclasses
					elementList.add((Element) element);
				}
			} else if (element instanceof PackageImport) {
				Package importedPackage = ((PackageImport) element).getImportedPackage();
				// exclude metaclasses
				if (!UMLResource.UML_METAMODEL_URI.equals(importedPackage.eResource().getURI().toString())) {
					elementList.addAll(findAllOf(importedPackage, type));
				}
				continue;
			}

			if (element instanceof Element && implementsInterface(element, type)) {
				elementList.add((Element) element);
			} else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}

		return elementList;
	}

	public static List<Element> findAllOf(Resource resource, Class<?> type) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(resource, true);

		while (iterator != null && iterator.hasNext()) {
			EObject element = iterator.next();
			if (type.isInstance(element) && element instanceof Element) {
				elementList.add((Element) element);
			} else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}

		return elementList;
	}

	public static List<org.eclipse.uml2.uml.Class> findUMLMetaclasses(ResourceSet resourceSet) {
		List<org.eclipse.uml2.uml.Class> classList = new ArrayList<org.eclipse.uml2.uml.Class>();

		Resource umlMetamodel = resourceSet.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		if (umlMetamodel != null) {
			TreeIterator<Object> iterator = EcoreUtil.getAllProperContents(umlMetamodel, true);
			while (iterator != null && iterator.hasNext()) {
				Object element = iterator.next();
				if (element instanceof org.eclipse.uml2.uml.Class) {
					classList.add((org.eclipse.uml2.uml.Class) element);
				}
			}
		}

		return classList;
	}

	/**
	 * findAllOf search the set of open models within the workspace and returns using corresponding path map uri
	 *
	 * TODO replace the loop with a resource visitor
	 *
	 * @param resourceSetold
	 * @param type
	 * @return
	 */
	public static List<Element> findAllOf(ResourceSet resourceSetold, Class<?> type) {
		List<Element> elementList = new ArrayList<Element>();

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

							TreeIterator<Object> iterator = EcoreUtil.getAllProperContents(
								resourceSet.getResource(modelFile, true), true);

							while (iterator != null && iterator.hasNext()) {
								Object element = iterator.next();

								if (Resource.class.isInstance(element)) {
									continue;
								}

								// prune profile and metamodel contents
								if (ProfileApplication.class.isInstance(element)) {
									// ignore the the applied profiles
									iterator.prune();
									continue;
								} else if (Profile.class.isInstance(element) && Stereotype.class != type) {
									// ignore the the applied profiles
									iterator.prune();
									continue;
								} else if (EAnnotation.class.isInstance(element)) {
									iterator.prune();
									continue;
								} else if (Package.class.isInstance(element)) {
									if (UMLResource.UML_METAMODEL_URI.equals(
										((Package) element).eResource().getURI().toString())) {
										iterator.prune();
										continue;
									} else if (UMLResource.ECORE_METAMODEL_URI.equals(
										((Package) element).eResource().getURI().toString())) {
										iterator.prune();
										continue;
									}
								}

								// select based on filter
								if (type.isInstance(element) && element instanceof Element) {
									elementList.add((Element) element);
								} else if (!Package.class.isInstance(element)) {
									iterator.prune();
								}

							}
						}
					}
				} catch (Exception e) {
				}
			}
		}
		return elementList;
	}

}
