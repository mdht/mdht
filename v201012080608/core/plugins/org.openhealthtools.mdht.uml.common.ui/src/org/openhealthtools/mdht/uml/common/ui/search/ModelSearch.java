/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.common.ui.search;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
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
	private ModelSearch() { }

	public static List<EObject> findStereotypeApplications(ResourceSet resourceSet, Stereotype stereotype) {
		List<EObject> elementList = new ArrayList<EObject>();
		for (Resource resource : resourceSet.getResources()) {
			String uri = resource.getURI().toString();
			if (uri.equals(UMLResource.UML_METAMODEL_URI)
					|| uri.equals(UMLResource.ECORE_METAMODEL_URI)) {
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
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(resourceSet.getResources());

		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (Resource.class.isInstance(element)) {
				continue;
			}
			else if (ProfileApplication.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			}
			else if (Profile.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			}
			else if (EAnnotation.class.isInstance(element)) {
				iterator.prune();
			}
			
			else if (Package.class.isInstance(element)) {
//				if ("uml2".equals(((Package)element).getQualifiedName()))
//					iterator.prune();
				if (UMLResource.UML_METAMODEL_URI.equals(
						((Package)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.ECORE_METAMODEL_URI.equals(
						((Package)element).eResource().getURI().toString()))
					iterator.prune();
//				else if (UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
				
			}

			else if (element instanceof Element && filter.accept((Element)element)) {
				elementList.add((Element)element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		
		return elementList;
	}
	
	//TODO include source object in params, also test Classifier::conformsTo
	public static List<Element> findAllOf(Package umlPackage, Class type) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<EObject> iterator = umlPackage.eAllContents();

		while (iterator != null && iterator.hasNext()) {
			EObject element = iterator.next();
			if (type.isInstance(element) && element instanceof Element) {
				elementList.add((Element)element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		return elementList;
	}

	public static List<Element> findAllOf(Resource resource, Class type) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(resource, true);

		while (iterator != null && iterator.hasNext()) {
			EObject element = iterator.next();
			if (type.isInstance(element) && element instanceof Element) {
				elementList.add((Element)element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		return elementList;
	}
	
	public static List<Element> findAllOf(ResourceSet resourceSet, Class type) {
		List<Element> elementList = new ArrayList<Element>();
		TreeIterator<Object> iterator = EcoreUtil.getAllContents(resourceSet.getResources(), true);

		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (Resource.class.isInstance(element)) {
				continue;
			}
			else if (ProfileApplication.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			}
			else if (Profile.class.isInstance(element)) {
				// ignore the the applied profiles
				iterator.prune();
			}
			else if (EAnnotation.class.isInstance(element)) {
				iterator.prune();
			}
			
			else if (Package.class.isInstance(element)) {
//				if ("uml2".equals(((Package)element).getQualifiedName()))
//					iterator.prune();
				if (UMLResource.UML_METAMODEL_URI.equals(
						((Package)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.ECORE_METAMODEL_URI.equals(
						((Package)element).eResource().getURI().toString()))
					iterator.prune();
//				else if (UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Package)element).eResource().getURI().toString()))
//					iterator.prune();
				
			}

			else if (type.isInstance(element) && element instanceof Element) {
				elementList.add((Element)element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		return elementList;
	}
	
}
