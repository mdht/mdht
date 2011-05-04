/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added support for TransformAssociation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

		UMLSwitch<Object> genDomainInterface = 
			new GenDomainInterface(transformerOptions);
		UMLSwitch<Object> genDomainProperty = 
			new GenDomainProperty(transformerOptions);

		UMLSwitch<Object> transformPackage = 
			new TransformPackage(transformerOptions);
		UMLSwitch<Object> transformClass = 
			new TransformClass(transformerOptions);
		UMLSwitch<Object> transformConstraint = 
			new TransformConstraint(transformerOptions);
		UMLSwitch<Object> transformClinicalDocument = 
			new TransformClinicalDocument(transformerOptions);
		UMLSwitch<Object> transformTemplateIdentifier = 
			new TransformTemplateIdentifier(transformerOptions);
		UMLSwitch<Object> transformVocabConstraint = 
			new TransformVocabConstraint(transformerOptions);
		UMLSwitch<Object> transformPropertyConstraint = 
			new TransformPropertyConstraint(transformerOptions);
		UMLSwitch<Object> transformAssociation = 
			new TransformAssociation(transformerOptions);
		
		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
					Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				if (transformerOptions.isGenerateDomainInterface() || transformerOptions.isGenerateDomainClasses()) {
					genDomainInterface.doSwitch(child);
					genDomainProperty.doSwitch(child);
				}
				
				transformPackage.doSwitch(child);
				transformConstraint.doSwitch(child);
				transformClinicalDocument.doSwitch(child);
				transformTemplateIdentifier.doSwitch(child);
				transformVocabConstraint.doSwitch(child);
				transformPropertyConstraint.doSwitch(child);
				transformAssociation.doSwitch(child);
				transformClass.doSwitch(child);
			}
		}
		catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
		

		if (transformerOptions.isGenerateDomainInterface() || transformerOptions.isGenerateDomainClasses()) {
			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformerOptions.getDomainInterfacePackage().eResource().save(saveOptions);
			} catch (IOException e) {
				Logger.logException(e);
			}
		}
		
		// save the updated plugin.properties file
		propertiesUtil.save();
		
		for (Element deleted : transformerOptions.getDeletedElementList()) {
			deleted.destroy();
		}

	}
	
}
