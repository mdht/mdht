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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 *
 * @version $Id: $
 */
public class ModelSearch {

	/**
	 * 
	 */
	private ModelSearch() { }

	public static List findAllOf(ResourceSet resourceSet, IElementFilter filter) {
		List elementList = new ArrayList();
		TreeIterator iterator = EcoreUtil.getAllContents(resourceSet.getResources());

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
			
			else if (Model.class.isInstance(element)) {
//				if ("uml2".equals(((Model)element).getQualifiedName()))
//					iterator.prune();
				if (UMLResource.UML_METAMODEL_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.ECORE_METAMODEL_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				
			}

			else if (element instanceof Element && filter.accept((Element)element)) {
				elementList.add(element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		
		return elementList;
	}
	
	//TODO include source object in params, also test Classifier::conformsTo
	public static List findAllOf(Model model, Class type) {
		List elementList = new ArrayList();
		TreeIterator iterator = model.eAllContents();

		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			//if (type.isInstance(element)) {
			if (type == element.getClass()) {
				elementList.add(element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		return elementList;
	}
	
	public static List findAllOf(ResourceSet resourceSet, Class type) {
		List elementList = new ArrayList();
		TreeIterator iterator = EcoreUtil.getAllContents(resourceSet.getResources());

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
			
			else if (Model.class.isInstance(element)) {
//				if ("uml2".equals(((Model)element).getQualifiedName()))
//					iterator.prune();
				if (UMLResource.UML_METAMODEL_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
				else if (UMLResource.ECORE_METAMODEL_URI.equals(
						((Model)element).eResource().getURI().toString()))
					iterator.prune();
//				else if (UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Model)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Model)element).eResource().getURI().toString()))
//					iterator.prune();
//				else if (UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI.equals(
//						((Model)element).eResource().getURI().toString()))
//					iterator.prune();
				
			}

			else if (type.isInstance(element)) {
				elementList.add(element);
			}
			else if (!Package.class.isInstance(element)) {
				iterator.prune();
			}
		}
		
		return elementList;
	}
	
}
