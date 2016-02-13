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
import org.eclipse.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.TransformAbstract;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @author dcarlson
 *
 */
public abstract class TransformFacade extends TransformAbstract {

	protected CDAModelConsolidator consolidator;

	public TransformFacade(TransformerOptions options, CDAModelConsolidator consolidator,
			IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
		this.consolidator = consolidator;
	}

	private Package initializeDomainPackageFrom(Element element) {
		Package modelPkg = element.getNearestPackage();
		Package domainPkg = null;

		// TODO check option for custom domain package name
		if (transformerOptions.getDomainModelPath() == null) {
			// create a nested package
			domainPkg = modelPkg.getNestedPackage("domain");

			if (domainPkg == null) {
				domainPkg = modelPkg.createNestedPackage("domain");
			}
		} else {
			// create model if necessary, assign default CodeGen stereotype values
			URI domainModelURI = URI.createFileURI(transformerOptions.getDomainModelPath());
			Resource domainResource = element.eResource().getResourceSet().createResource(domainModelURI);
			if (domainResource.getContents().isEmpty() || !(domainResource.getContents().get(0) instanceof Package)) {
				domainPkg = UMLFactory.eINSTANCE.createPackage();
				domainResource.getContents().add(domainPkg);

				// assign Ecore EPackage stereotype
				Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(modelPkg, UMLUtil.STEREOTYPE__E_PACKAGE);
				UMLUtil.safeApplyStereotype(domainPkg, ePackage);

				domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_PREFIX, "domain");
				domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX, "Domain");

				String domainPackageName = transformerOptions.getDomainPackageName();
				String domainBasePackage = transformerOptions.getDomainBasePackage();
				String domainNsURI = transformerOptions.getDomainNsURI();

				String modelPackageName = null;
				String modelNsURI = null;
				String modelBasePackage = null;

				Stereotype modelCodeGen = CDAProfileUtil.getAppliedCDAStereotype(
					modelPkg, ICDAProfileConstants.CODEGEN_SUPPORT);
				if (modelCodeGen != null) {
					modelPackageName = (String) modelPkg.getValue(
						modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);
					modelNsURI = (String) modelPkg.getValue(modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
					modelBasePackage = (String) modelPkg.getValue(
						modelCodeGen, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
				}

				if (domainPackageName != null) {
					domainPkg.setName(domainPackageName);
					domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME, domainPackageName);
				} else {
					domainPkg.setName("domain");
					domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__PACKAGE_NAME, "domain");
				}

				if (domainBasePackage != null) {
					domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE, domainBasePackage);
				} else if (modelBasePackage != null && modelPackageName != null) {
					domainPkg.setValue(
						ePackage, UMLUtil.TAG_DEFINITION__BASE_PACKAGE, modelBasePackage + "." + modelPackageName);
				}

				if (domainNsURI != null) {
					domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_URI, domainNsURI);
				} else if (modelNsURI != null) {
					domainPkg.setValue(ePackage, UMLUtil.TAG_DEFINITION__NS_URI, modelNsURI + "/domain");
				}

			} else {
				domainPkg = (Package) domainResource.getContents().get(0);
			}
		}

		return domainPkg;
	}

	protected Package getDomainInterfacePackage(Element element) {
		Package domainPkg = transformerOptions.getDomainInterfacePackage();

		if (domainPkg == null) {
			domainPkg = initializeDomainPackageFrom(element);
			transformerOptions.setDomainInterfacePackage(domainPkg);
		}

		return domainPkg;
	}

	protected Classifier getDomainInterface(Type modelType) {
		String classifierName = normalizeCodeName(modelType.getName());
		if (transformerOptions.isUseBusinessNames()) {
			classifierName = normalizeCodeName(modelType.getLabel(false));
		}

		Package domainPkg = getDomainInterfacePackage(modelType);
		Classifier domainInterface;
		if (transformerOptions.isGenerateDomainInterface()) {
			domainInterface = (Interface) domainPkg.getOwnedType(
				classifierName, false, UMLPackage.eINSTANCE.getInterface(), true);
		} else {
			domainInterface = (Class) domainPkg.getOwnedType(
				classifierName, false, UMLPackage.eINSTANCE.getClass_(), true);
		}

		if (consolidator != null && modelType instanceof Classifier &&
				!consolidator.getProcessedClassifiers().contains(modelType)) {
			consolidator.addImportedClassifier((Classifier) modelType);
		}

		return domainInterface;
	}
}
