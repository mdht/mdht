/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *                        - flexible, pluggable instance initializers (artf3272)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.IEPackageDetails;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class TransformPackage extends TransformAbstract {
	public TransformPackage(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object casePackage(Package umlPackage) {
		IEPackageDetails details = getEcoreProfile().getEPackageDetails(umlPackage);
		if (details != null) {
			Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
			if (!umlPackage.isStereotypeApplied(ePackage)) {
				UMLUtil.safeApplyStereotype(umlPackage, ePackage);
			}

			if (details.getPackageName() != null) {
				umlPackage.setValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME, details.getPackageName());
			}

			if (details.getNamespaceURI() != null) {
				umlPackage.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_URI, details.getNamespaceURI());
			}

			if (details.getNamespacePrefix() != null) {
				umlPackage.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_PREFIX, details.getNamespacePrefix());
			}

			if (details.getGenBasePackage() != null) {
				umlPackage.setValue(ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE, details.getGenBasePackage());
			}

			if (details.getGenPrefix() != null) {
				umlPackage.setValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX, details.getGenPrefix());
			}

			// Do NOT unapply stereotype. Needed for getting model prefix while transforming content.
			// CDAProfileUtil.unapplyCDAStereotype(umlPackage, ICDAProfileConstants.CODEGEN_SUPPORT);
		}

		addInitializersAnnotation(umlPackage);

		return umlPackage;
	}

	protected void addInitializersAnnotation(Package umlPackage) {
		Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
		if (!umlPackage.isStereotypeApplied(ePackage)) {
			UMLUtil.safeApplyStereotype(umlPackage, ePackage);
		}

		String basePackage = (String) umlPackage.getValue(ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE);
		if (basePackage == null) {
			basePackage = "org.openhealthtools.mdht.uml.cda";
		}

		String packageName = (String) umlPackage.getValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME);
		if (packageName == null) {
			packageName = umlPackage.getName();
		}

		if ((basePackage != null) && (packageName != null)) {
			AnnotationsUtil annotations = new AnnotationsUtil(
				umlPackage, Initializer.Util.INITIALIZERS_ANNOTATION_SOURCE);
			annotations.setAnnotation(
				Initializer.Util.INITIALIZERS_ANNOTATION_DETAIL, String.format("%s.%s", basePackage, packageName));
			annotations.saveAnnotations();
		}
	}
}
