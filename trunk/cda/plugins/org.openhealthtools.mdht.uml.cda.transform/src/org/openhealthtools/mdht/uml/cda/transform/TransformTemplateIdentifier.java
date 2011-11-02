/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added support for contextDependent
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;

public class TransformTemplateIdentifier extends TransformAbstract {
	private static final String REGISTRY_DELEGATE_NAME = "RegistryDelegate";

	public TransformTemplateIdentifier(TransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class umlClass) {
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(umlClass, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			addConstraint(umlClass, hl7Template);
			addAnnotation(umlClass, hl7Template);
			// addExtensionPoint(umlClass, hl7Template);
		}

		return umlClass;
	}

	private void addConstraint(Class umlClass, Stereotype hl7Template) {
		String constraintName = createTemplateConstraintName(umlClass);

		Constraint constraint = umlClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(umlClass);

		String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		// String body = "self.hasTemplateId('" + templateId + "')";
		String body = "self.templateId->exists(id : datatypes::II | id.root = '" + templateId + "')";
		expression.getBodies().add(body);

		String message = CDAModelUtil.getValidationMessage(umlClass);
		if (message == null) {
			message = "The template identifier for " + umlClass.getName() + " must be " + templateId + ".";
		}
		// addValidationError(umlClass, constraintName, message);
		addValidationError(umlClass, createConstraintName(umlClass, "TemplateId"), message);
	}

	private void addAnnotation(Class umlClass, Stereotype hl7Template) {
		String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		Boolean contextDependent = false;
		try {
			contextDependent = (Boolean) umlClass.getValue(
				hl7Template, ICDAProfileConstants.CDA_TEMPLATE_CONTEXT_DEPENDENT);
		} catch (IllegalArgumentException e) {
		}

		AnnotationsUtil annotationsUtil = new AnnotationsUtil(umlClass);
		annotationsUtil.setAnnotation("templateId.root", templateId);
		if (contextDependent) {
			createRegistryDelegate(umlClass);
			annotationsUtil.setAnnotation("contextDependent", "true");
		}

		annotationsUtil.saveAnnotations();
	}

	private void createRegistryDelegate(Class umlClass) {
		org.eclipse.uml2.uml.Package umlPackage = umlClass.getNearestPackage();
		Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
		if (umlPackage.isStereotypeApplied(ePackage)) {
			String prefix = (String) umlPackage.getValue(ePackage, UMLUtil.TAG_DEFINITION__PREFIX);
			String name = prefix + "RegistryDelegate";
			if (umlPackage.getOwnedType(name) == null) {
				org.eclipse.uml2.uml.Package cdaPackage = getCDAPackage(umlClass);
				if (cdaPackage != null) {
					Interface delegateInterface = (Interface) cdaPackage.getOwnedType(REGISTRY_DELEGATE_NAME);
					if (delegateInterface != null) {
						Class delegateClass = umlPackage.createOwnedClass(name, false);
						delegateClass.createInterfaceRealization(null, delegateInterface);
						AnnotationsUtil annotationsUtil = new AnnotationsUtil(umlPackage);
						annotationsUtil.setAnnotation("registryDelegate", name);
						annotationsUtil.saveAnnotations();
					}
				}
			}
		}
	}

	// @SuppressWarnings("unused")
	// private void addExtensionPoint(Class umlClass, Stereotype hl7Template) {
	// String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
	// String nsURI = null;
	//
	// // get nsURI from the ePackage stereotype
	// org.eclipse.uml2.uml.Package umlPackage = umlClass.getNearestPackage();
	// Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
	// if (umlPackage.isStereotypeApplied(ePackage)) {
	// nsURI = (String) umlPackage.getValue(ePackage, "nsURI");
	// }
	// else {
	// UMLUtil.safeApplyStereotype(umlPackage, ePackage);
	// }
	// if (nsURI == null) {
	// nsURI = "http://www.openhealthtools.org/" + umlPackage.eResource().getURI().lastSegment();
	// umlPackage.setValue(ePackage, "nsURI", nsURI);
	// }
	//
	// IFile pluginXML = findPluginXML(umlClass);
	//
	// if (pluginXML != null && templateId != null) {
	// //insert extension point into plugin.xml
	// PluginXMLUtil pluginUtil = new PluginXMLUtil(pluginXML);
	// pluginUtil.addTemplateExtension(umlClass.getName(), templateId, nsURI);
	// }
	// }

	// private IFile findPluginXML(Element element) {
	// IFile pluginXML = null;
	//
	// // get project file path
	// String modelFilePath = element.eResource().getURI().toFileString();
	// IWorkspace workspace = ResourcesPlugin.getWorkspace();
	// IPath modelLocation = Path.fromOSString(modelFilePath);
	// IFile[] files = workspace.getRoot().findFilesForLocation(modelLocation);
	// if (files.length > 0) {
	// IProject project = files[0].getProject();
	// IResource file = project.findMember("plugin.xml");
	// if (file instanceof IFile) {
	// pluginXML = (IFile)file;
	// }
	// else {
	// // create new plugin.xml
	// pluginXML = project.getFile("plugin.xml");
	// }
	//
	// if (!pluginXML.exists()) {
	// ByteArrayInputStream is = new ByteArrayInputStream(new byte[0]);
	// try {
	// pluginXML.create(is, true, null);
	// } catch (CoreException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// return pluginXML;
	// }
}
