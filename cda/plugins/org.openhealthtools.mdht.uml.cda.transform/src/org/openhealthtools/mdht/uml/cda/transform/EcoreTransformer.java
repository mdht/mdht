/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;

public class EcoreTransformer {
	
	private EcoreTransformerOptions transformerOptions;

	public EcoreTransformer() {
		transformerOptions = new EcoreTransformerOptions();
	}

	public EcoreTransformer(EcoreTransformerOptions options) {
		transformerOptions = options;
	}
	
	public void transformElement(Element element) {
		PluginPropertiesUtil propertiesUtil = new PluginPropertiesUtil(element.eResource());
		transformerOptions.setPluginPropertiesUtil(propertiesUtil);

		UMLSwitch transformTemplateIdentifier = 
			new TransformTemplateIdentifier(transformerOptions);
		UMLSwitch transformVocabConstraint = 
			new TransformVocabConstraint(transformerOptions);
		UMLSwitch transformPropertyConstraint = 
			new TransformPropertyConstraint(transformerOptions);

		try {
			TreeIterator iterator = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				transformTemplateIdentifier.doSwitch(child);
				transformVocabConstraint.doSwitch(child);
				transformPropertyConstraint.doSwitch(child);
			}
		}
		catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
		
		// save the updated plugin.properties file
		propertiesUtil.save();
		
		for (Element deleted : transformerOptions.getDeletedElementList()) {
			deleted.destroy();
		}

	}
	
}
