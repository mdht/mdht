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
package org.openhealthtools.mdht.uml.hdf2ecore.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf2ecore.internal.Logger;

public class TransformChoiceGroups {

	private List<Class> choiceGroups = new ArrayList<Class>();

	private EcoreTransformerOptions transformerOptions;

	public TransformChoiceGroups(EcoreTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// first, find all choice groups
			TreeIterator iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				UMLSwitch choiceSwitch = new UMLSwitch() {
					@Override
					public Object caseClass(Class umlClass) {
						// a choice group must have <<choiceGroup>> stereotype
						Stereotype choiceGroup = umlClass.getAppliedStereotype(IHDFProfileConstants.HDF_PROFILE_NAME +
								NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_GROUP);
						if (choiceGroup != null) {
							choiceGroups.add(umlClass);
							return umlClass;
						} else {
							return null;
						}
					}
				};

				choiceSwitch.doSwitch(child);
			}

			// second, transform the choice groups
			Class[] choiceGroupsArray = new Class[choiceGroups.size()];
			choiceGroupsArray = choiceGroups.toArray(choiceGroupsArray);
			for (int i = 0; i < choiceGroupsArray.length; i++) {
				if (choiceGroupsArray[i] != null) {
					transformChoiceGroup(choiceGroupsArray[i]);
				}
			}

		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	private void transformChoiceGroup(Class choiceClass) {
		// TODO
	}

}
