/*******************************************************************************
 * Copyright (c) 2009, 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added support for TransformAssociation
 *     Sean Muir (JKM Software) - added support for Inlined Transformations
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.transform.internal.Logger;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.PluginPropertiesUtil;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.TransformClass;
import org.eclipse.mdht.uml.transform.ecore.TransformInlinedClasses;
import org.eclipse.mdht.uml.transform.ecore.TransformInlinedProperties;
import org.eclipse.mdht.uml.transform.ecore.TransformPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * @deprecated Use the {@link EcoreTransformationBuilder}, instead.
 */
@Deprecated
public class EcoreTransformer extends CDAAbstractTransformer {

	private PluginPropertiesUtil propertiesUtil;

	UMLSwitch<Object> transformPackage;

	UMLSwitch<Object> transformClass;

	UMLSwitch<Object> transformConstraint;

	UMLSwitch<Object> transformClinicalDocument;

	UMLSwitch<Object> transformTemplateIdentifier;

	UMLSwitch<Object> transformPropertyConstraint;

	UMLSwitch<Object> transformAssociation;

	UMLSwitch<Object> transformInlinedAssociations;

	UMLSwitch<Object> transformInnerClasses;

	public EcoreTransformer() {
		this(new TransformerOptions());
	}

	public EcoreTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public void transformModelElement(Element element) {
		if (transformPackage == null) {
			initialize(element.getNearestPackage());
		}

		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				transformPackage.doSwitch(child);
				transformConstraint.doSwitch(child);
				transformClinicalDocument.doSwitch(child);
				transformTemplateIdentifier.doSwitch(child);
				transformPropertyConstraint.doSwitch(child);

				transformAssociation.doSwitch(child);
				transformClass.doSwitch(child);

			}

			iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();
				transformInlinedAssociations.doSwitch(child);
			}

			// transformInnerClasses drops any constraints from the inner class definitions so it must be run last
			iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();
				transformInnerClasses.doSwitch(child);
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	public void initialize(Package sourcePackage) {
		propertiesUtil = new PluginPropertiesUtil(sourcePackage.eResource());
		transformerOptions.setPluginPropertiesUtil(propertiesUtil);

		IBaseModelReflection baseModelReflection = getBaseModelReflection();

		transformPackage = new TransformPackage(transformerOptions, baseModelReflection);
		transformClass = new TransformClass(transformerOptions, baseModelReflection);
		transformConstraint = new TransformLogicalConstraint(transformerOptions, baseModelReflection);
		transformClinicalDocument = new TransformClinicalDocument(transformerOptions, baseModelReflection);
		transformTemplateIdentifier = new TransformTemplateIdentifier(transformerOptions, baseModelReflection);
		transformPropertyConstraint = new TransformCDAPropertyConstraint(transformerOptions, baseModelReflection);
		transformAssociation = new TransformCDAAssociation(transformerOptions, baseModelReflection);
		transformInlinedAssociations = new TransformInlinedProperties(transformerOptions, baseModelReflection);

		transformInnerClasses = new TransformInlinedClasses(transformerOptions, baseModelReflection);

	}

	@Override
	public void saveResources() {
		// save the updated plugin.properties file
		propertiesUtil.save();

		for (Element deleted : transformerOptions.getDeletedElementList()) {
			deleted.destroy();
		}
	}

}
