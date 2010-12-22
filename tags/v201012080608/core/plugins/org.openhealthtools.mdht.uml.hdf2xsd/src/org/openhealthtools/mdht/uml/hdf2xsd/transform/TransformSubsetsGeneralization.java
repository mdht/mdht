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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf2xsd.internal.Logger;

public class TransformSubsetsGeneralization {

	private XSDTransformerOptions transformerOptions;

	private List<Generalization> generalizations = new ArrayList<Generalization>();

	public TransformSubsetsGeneralization(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// first, find all <<subsets>> generalizations
			TreeIterator iterator = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();
				
				UMLSwitch choiceSwitch = new UMLSwitch() {
					public Object caseGeneralization(Generalization generalization) {
						Classifier specific = (Classifier) generalization.getSpecific();
						
						Stereotype subsetsStereotype = 
							HL7ResourceUtil.getAppliedHDFStereotype(generalization, IHDFProfileConstants.SUBSETS_GENERALIZATION);
						if (subsetsStereotype != null) {
							// don't use this generalization in Ecore generation
							generalizations.add(generalization);
						}
						
						/*
						 * TODO test for IHDFProfileConstants.EXCLUDED_PROPERTY in subclass properties 
						 * and find some way to support this in Ecore.
						 */

						return specific;
					}
				};
				
				choiceSwitch.doSwitch(child);
			}
			
			// second, remove the generalizations
			Generalization[] generalizationArray = new Generalization[generalizations.size()];
			generalizationArray = generalizations.toArray(generalizationArray);
			for (int i = 0; i < generalizationArray.length; i++) {
				if (generalizationArray[i] != null)
					transformSubsetsGeneralization(generalizationArray[i]);
			}
			
		}
		catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}
	
	private void transformSubsetsGeneralization(Generalization generalization) {
		generalization.destroy();
	}
	
}
