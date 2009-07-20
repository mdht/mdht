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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class TransformTemplateIdentifier extends UMLSwitch {

	protected EcoreTransformerOptions transformerOptions;

	public TransformTemplateIdentifier(EcoreTransformerOptions options) {
		transformerOptions = options;
	}
	
	public Object caseClass(Class umlClass) {
		Stereotype hl7Template = EcoreTransformUtil.getAppliedHDFStereotype(
				umlClass, IHDFProfileConstants.HL7_TEMPLATE);
		if (hl7Template != null) {
			addConstraint(umlClass, hl7Template);
			addAnnotation(umlClass, hl7Template);
			addExtensionPoint(umlClass, hl7Template);
			addMessage(umlClass, hl7Template);
		}

		return umlClass;
	}
	
	private void addConstraint(Class umlClass, Stereotype hl7Template) {
		String name = umlClass.getName() + "_templateId";
		Constraint constraint = umlClass.createOwnedRule(name, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(umlClass);

		String templateId = (String) umlClass.getValue(hl7Template, IHDFProfileConstants.HL7_TEMPLATE_ID);
		OpaqueExpression expression = (OpaqueExpression)constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		String body = "self.hasTemplateId('" + templateId + "')";
		expression.getBodies().add(body);
		
		//TODO add error message to plugin.properties
	}

	private void addAnnotation(Class umlClass, Stereotype hl7Template) {
		Stereotype eClassStereotype = EcoreTransformUtil.getEcoreStereotype(umlClass, UMLUtil.STEREOTYPE__E_CLASS);
		UMLUtil.safeApplyStereotype(umlClass, eClassStereotype);
		
		//TODO need utility methods for parsing EClass annotations into key/value map
		List<String> annotations = (List<String>) umlClass.getValue(eClassStereotype, "annotations");
		//TODO check if this source/key already exits
		
		String templateId = (String) umlClass.getValue(hl7Template, IHDFProfileConstants.HL7_TEMPLATE_ID);
		annotations.add(CDAUtil.CDA_ANNOTATION_SOURCE + " templateId.root='" + templateId + "'");
		
		umlClass.setValue(eClassStereotype, "annotations", annotations);
	}
	
	private void addExtensionPoint(Class umlClass, Stereotype hl7Template) {
		String templateId = (String) umlClass.getValue(hl7Template, IHDFProfileConstants.HL7_TEMPLATE_ID);
		String nsURI = null;
		IFile pluginXML = null;

		// get nsURI from the ePackage stereotype
		org.eclipse.uml2.uml.Package umlPackage = umlClass.getNearestPackage();
		Stereotype ePackage = EcoreTransformUtil.getAppliedEcoreStereotype(umlPackage, UMLUtil.STEREOTYPE__E_PACKAGE);
		if (ePackage != null) {
			nsURI = (String) umlPackage.getValue(ePackage, "nsURI");
		}
		
		// get project file path
		String modelFilePath = umlClass.eResource().getURI().toFileString();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath location = Path.fromOSString(modelFilePath);
		IFile[] files = workspace.getRoot().findFilesForLocation(location);
		if (files.length > 0) {
			IProject project = files[0].getProject();
			IResource file = project.findMember("plugin.xml");
			if (file instanceof IFile && file.exists()) {
				pluginXML = (IFile)file;
			}
		}
		
		if (templateId != null && nsURI != null) {
			//insert extension point into plugin.xml
			PluginXMLUtil pluginUtil = new PluginXMLUtil(pluginXML);
			pluginUtil.addTemplateExtension(umlClass.getName(), templateId, nsURI);
		}
	}

	private void addMessage(Class umlClass, Stereotype hl7Template) {
		//TODO insert message key=value into plugin.properties
		
		// move this to a shared util class
	}
}
