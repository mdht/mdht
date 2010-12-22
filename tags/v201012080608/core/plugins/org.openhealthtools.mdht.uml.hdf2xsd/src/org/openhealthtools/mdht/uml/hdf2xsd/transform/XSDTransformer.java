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

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class XSDTransformer {
	
	private XSDTransformerOptions transformerOptions;

	public XSDTransformer() {
		transformerOptions = new XSDTransformerOptions();
	}
	
	public void setIncludeVocabularyConstraints(boolean include) {
		transformerOptions.setIncludeVocabularyConstraints(include);
	}

	public void setIncludeEmptyAssociationClasses(boolean include) {
		transformerOptions.setIncludeEmptyAssociationClasses(include);
	}

	public void transformElement(Element element) {
		
		TransformChoiceGroups transformChoiceGroups = new TransformChoiceGroups(transformerOptions);
		TransformAssociationClasses transformAssociationClasses = new TransformAssociationClasses(transformerOptions);
		TransformEntryPoint transformEntryPoints = new TransformEntryPoint(transformerOptions);
		TransformSubsetsGeneralization transformSubsetsGeneralization = new TransformSubsetsGeneralization(transformerOptions);
		RemoveTemplateBindings removeTemplateBindings = new RemoveTemplateBindings(transformerOptions);
		UMLSwitch transformPackageNames = new TransformPackageNames(transformerOptions);
		UMLSwitch transformAbstractDatatypes = new TransformAbstractDatatypes(transformerOptions);
		UMLSwitch addInfrastructureProperties = new AddInfrastructureProperties(transformerOptions);
		UMLSwitch addStructuralAttributes = new AddStructuralAttributes(transformerOptions);
		UMLSwitch addVocabularyConstraints = new AddVocabularyConstraints(transformerOptions);

		/*
		 * Execute all structure transformations first (copy, delete, create)
		 */
    	// must transform association classes before choice groups
		transformAssociationClasses.transformAllContents(element);
		transformSubsetsGeneralization.transformAllContents(element);
		transformChoiceGroups.transformAllContents(element);
		transformEntryPoints.transformAllContents(element);
		
		try {
			TreeIterator iterator = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				transformPackageNames.doSwitch(child);
				transformAbstractDatatypes.doSwitch(child);
			}
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// remove bindings after transforming abstract data types
		removeTemplateBindings.transformAllContents(element);

		// add new content
		try {
			TreeIterator iterator2 = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator2 != null && iterator2.hasNext()) {
				EObject child = (EObject) iterator2.next();

				// this also sorts content
				addInfrastructureProperties.doSwitch(child);
				
				// structural attributes must be added before vocabulary constraints
				addStructuralAttributes.doSwitch(child);
			}
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// modify new content
		try {
			TreeIterator iterator2 = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator2 != null && iterator2.hasNext()) {
				EObject child = (EObject) iterator2.next();

				addVocabularyConstraints.doSwitch(child);
			}
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
}
