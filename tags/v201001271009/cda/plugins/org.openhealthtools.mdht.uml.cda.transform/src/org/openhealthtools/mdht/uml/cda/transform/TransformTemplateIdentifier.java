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

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformTemplateIdentifier extends TransformAbstract {
	public TransformTemplateIdentifier(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseClass(Class umlClass) {
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
				umlClass, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			addConstraint(umlClass, hl7Template);
			addAnnotation(umlClass, hl7Template);
			addExtensionPoint(umlClass, hl7Template);
		}

		return umlClass;
	}
	
	private void addConstraint(Class umlClass, Stereotype hl7Template) {
//		String constraintName = umlClass.getName() + "_templateId";
		String constraintName = createConstraintName(umlClass, "TemplateId");
		Constraint constraint = umlClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(umlClass);

		String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		OpaqueExpression expression = (OpaqueExpression)constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		String body = "self.hasTemplateId('" + templateId + "')";
		expression.getBodies().add(body);

		String message = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE);
		if (message == null) {
			message = "The template identifier for " + umlClass.getName() + " must be " + templateId + ".";
		}
		addValidationError(umlClass, constraintName, message);
	}

	private void addAnnotation(Class umlClass, Stereotype hl7Template) {
		String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(umlClass);
		annotationsUtil.setAnnotation("templateId.root", templateId);
		annotationsUtil.saveAnnotations();
	}
	
	private void addExtensionPoint(Class umlClass, Stereotype hl7Template) {
		String templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		String nsURI = null;

		// get nsURI from the ePackage stereotype
		org.eclipse.uml2.uml.Package umlPackage = umlClass.getNearestPackage();
		Stereotype ePackage = EcoreTransformUtil.getEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
		if (umlPackage.isStereotypeApplied(ePackage)) {
			nsURI = (String) umlPackage.getValue(ePackage, "nsURI");
		}
		else {
			UMLUtil.safeApplyStereotype(umlPackage, ePackage);
		}
		if (nsURI == null) {
			nsURI = "http://www.openhealthtools.org/" + umlPackage.eResource().getURI().lastSegment();
			umlPackage.setValue(ePackage, "nsURI", nsURI);
		}

		IFile pluginXML = findPluginXML(umlClass);
		
		if (pluginXML != null && templateId != null) {
			//insert extension point into plugin.xml
			PluginXMLUtil pluginUtil = new PluginXMLUtil(pluginXML);
			pluginUtil.addTemplateExtension(umlClass.getName(), templateId, nsURI);
		}
	}
	
	private IFile findPluginXML(Element element) {
		IFile pluginXML = null;
		
		// get project file path
		String modelFilePath = element.eResource().getURI().toFileString();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath modelLocation = Path.fromOSString(modelFilePath);
		IFile[] files = workspace.getRoot().findFilesForLocation(modelLocation);
		if (files.length > 0) {
			IProject project = files[0].getProject();
			IResource file = project.findMember("plugin.xml");
			if (file instanceof IFile) {
				pluginXML = (IFile)file;
			}
			else {
				// create new plugin.xml
				pluginXML = project.getFile("plugin.xml");
			}
			
			if (!pluginXML.exists()) {
				ByteArrayInputStream is = new ByteArrayInputStream(new byte[0]);
				try {
					pluginXML.create(is, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		
		return pluginXML;
	}
}
