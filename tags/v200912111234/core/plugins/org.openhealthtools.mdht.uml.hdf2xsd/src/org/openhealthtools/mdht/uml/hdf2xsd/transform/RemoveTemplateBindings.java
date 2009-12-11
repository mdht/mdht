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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf2xsd.internal.Logger;

public class RemoveTemplateBindings {

	private XSDTransformerOptions transformerOptions;

	private List<Classifier> bindings = new ArrayList<Classifier>();

	public RemoveTemplateBindings(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// first, find all template bindings
			TreeIterator iterator = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();
				
				UMLSwitch choiceSwitch = new UMLSwitch() {
					public Object caseClass(Class umlClass) {
						if (UMLUtil.isTemplateBinding(umlClass)) {
							bindings.add(umlClass);
						}
						
						for (Classifier nested : umlClass.getNestedClassifiers()) {
							doSwitch(nested);
						}
						return umlClass;
					}
				};
				
				choiceSwitch.doSwitch(child);
			}
			
			// second, remove the bindings
			Classifier[] bindingsArray = new Classifier[bindings.size()];
			bindingsArray = bindings.toArray(bindingsArray);
			for (int i = 0; i < bindingsArray.length; i++) {
				if (bindingsArray[i] != null)
					bindingsArray[i].destroy();
			}
			
		}
		catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}
}
