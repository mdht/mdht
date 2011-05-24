/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class TransformEntryPoint extends UMLSwitch {

	private List<Interface> entryPoints = new ArrayList<Interface>();

	private XSDTransformerOptions transformerOptions;

	public TransformEntryPoint(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// first, find all entry points
			TreeIterator iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				UMLSwitch choiceSwitch = new UMLSwitch() {
					@Override
					public Object caseInterface(Interface umlInterface) {
						Stereotype entryPointStereotype = XSDTransformUtil.getHDFStereotype(
							umlInterface, IHDFProfileConstants.ENTRY_POINT);
						if (entryPointStereotype != null) {
							entryPoints.add(umlInterface);
						}

						return null;
					}
				};

				choiceSwitch.doSwitch(child);
			}

			// second, transform the entry points
			// create an array to avoid errors while deleting objects from an iterator
			Interface[] entryPointsArray = new Interface[entryPoints.size()];
			entryPointsArray = entryPoints.toArray(entryPointsArray);
			for (int i = 0; i < entryPointsArray.length; i++) {
				if (entryPointsArray[i] != null) {
					transformEntryPoint(entryPointsArray[i]);
				}
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private void transformEntryPoint(Interface entryPoint) {
		List<DirectedRelationship> realizations = entryPoint.getTargetDirectedRelationships(UMLPackage.Literals.REALIZATION);
		if (realizations.size() != 1 || ((Realization) realizations.get(0)).getClients().size() != 1) {
			entryPoint.destroy();
			return;
		}

		Class clientClass = (Class) ((Realization) realizations.get(0)).getClients().get(0);

		// if entry point is realization of a choice group, do not create a global element
		boolean isGroup = XSDProfileUtil.getAppliedXSDStereotype(clientClass, IXSDProfileConstants.GROUP) != null;
		if (!isGroup) {
			Model model = entryPoint.getModel();
			XSDProfileUtil.applyXSDProfile(model);
			Class globalClass = getGlobalElementsClass(entryPoint.getNearestPackage());

			Property globalProperty = UMLFactory.eINSTANCE.createProperty();
			globalClass.getOwnedAttributes().add(globalProperty);
			globalProperty.setName(entryPoint.getName());
			globalProperty.setType(clientClass);
			XSDProfileUtil.applyXSDStereotype(globalProperty, IXSDProfileConstants.GLOBAL_ELEMENT);

			// create a new list to avoid ConcurrentModificationException while moving comments
			List<Comment> comments = new ArrayList<Comment>(entryPoint.getOwnedComments());
			for (Comment comment : comments) {
				globalProperty.getOwnedComments().add(comment);
			}
		}

		// remove the EntryPoint interface and realization
		realizations.get(0).destroy();
		entryPoint.destroy();
	}

	private Class getGlobalElementsClass(Package umlPackage) {
		Class umlClass = (Class) umlPackage.getOwnedType(IXSDProfileConstants.GLOBAL_ELEMENTS_CLASS_NAME);

		if (umlClass == null) {
			umlClass = umlPackage.createOwnedClass(IXSDProfileConstants.GLOBAL_ELEMENTS_CLASS_NAME, false);
			XSDProfileUtil.applyXSDStereotype(umlClass, IXSDProfileConstants.GLOBAL_PROPERTY);
		}
		return umlClass;
	}

}
