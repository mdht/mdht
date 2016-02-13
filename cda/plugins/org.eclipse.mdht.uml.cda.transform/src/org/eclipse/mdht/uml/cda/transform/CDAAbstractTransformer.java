/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.transform.AbstractTransformer;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @author dcarlson
 *
 */
public abstract class CDAAbstractTransformer extends AbstractTransformer {

	protected TransformerOptions transformerOptions;

	private final IBaseModelReflection baseModelReflection = new CDABaseModelReflection();

	public CDAAbstractTransformer() {
		this(new TransformerOptions());
	}

	public CDAAbstractTransformer(TransformerOptions options) {
		transformerOptions = options;
	}

	public final IBaseModelReflection getBaseModelReflection() {
		return baseModelReflection;
	}

	@Override
	public abstract void transformModelElement(Element element);

	@Override
	public abstract void saveResources();

	@Override
	protected Package initializeModelPackageFrom(Element element, String newModelPath, String suffix, String nsPrefix,
			String prefix) {
		Package sourcePkg = element.getNearestPackage();
		Package newModelPkg = null;

		URI newModelURI = null;
		if (newModelPath != null) {
			newModelURI = URI.createFileURI(newModelPath);
		}
		if (newModelURI == null) {
			newModelURI = sourcePkg.eResource().getURI();
			newModelURI = newModelURI.trimFileExtension();
			newModelURI = newModelURI.trimSegments(1).appendSegment(newModelURI.lastSegment() + "_" + suffix);
			// newModelURI = newModelURI.trimSegments(1).appendSegment(sourcePkg.getName() + "_" + suffix);
			newModelURI = newModelURI.appendFileExtension(sourcePkg.eResource().getURI().fileExtension());
		}

		// create model if necessary, assign default EPackage stereotype values
		Resource newModelResource = element.eResource().getResourceSet().createResource(newModelURI);
		newModelPkg = UMLFactory.eINSTANCE.createPackage();
		newModelResource.getContents().add(newModelPkg);

		// apply CDA profile
		Profile cdaProfile = CDAProfileUtil.getCDAProfile(element.eResource().getResourceSet());
		if (cdaProfile != null) {
			newModelPkg.applyProfile(cdaProfile);
		}

		// assign Ecore EPackage stereotype
		Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(sourcePkg, UMLUtil.STEREOTYPE__E_PACKAGE);
		UMLUtil.safeApplyStereotype(newModelPkg, ePackage);

		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_PREFIX, nsPrefix);
		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX, prefix);

		String modelPackageName = null;
		String modelNsURI = null;
		String modelBasePackage = null;

		Stereotype modelCodeGen = CDAProfileUtil.getAppliedCDAStereotype(
			sourcePkg, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (modelCodeGen != null) {
			modelPackageName = (String) sourcePkg.getValue(
				modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);
			modelNsURI = (String) sourcePkg.getValue(modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
			modelBasePackage = (String) sourcePkg.getValue(
				modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
		}

		newModelPkg.setName(sourcePkg.getName());
		newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME, sourcePkg.getName());

		if (modelBasePackage != null && modelPackageName != null) {
			newModelPkg.setValue(
				ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE, modelBasePackage + "." + modelPackageName);
		}

		if (modelNsURI != null) {
			newModelPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_URI, modelNsURI + "/" + nsPrefix);
		}

		return newModelPkg;
	}

}
