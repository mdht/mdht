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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage;
import org.openhealthtools.mdht.uml.hl7.mif2uml.util.MIFUtil;


public class CommonModelElements {
	
	public static final String CMETINFO_COREMIF = "DEFN=UV=IFC=1.8.3.coremif";

	private StaticModelInterfacePackage cmePackage;
	
	private DiagnosticsHelper diagnostics;
	
	private List<URI> unresolvedResources = new ArrayList<URI>();
	
	public CommonModelElements(Resource referencingResource, DiagnosticsHelper diagnostics) {
		this.diagnostics = diagnostics;
		
		referencingResource.getResourceSet().getLoadOptions()
			.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,  Boolean.TRUE);
		
		Resource coremifResource = null;
		URI baseURI = referencingResource.getURI().trimSegments(1);
		URI coremifURI = baseURI.appendSegment(CMETINFO_COREMIF);
		try {
			coremifResource = referencingResource.getResourceSet().createResource(coremifURI);
			coremifResource.load(new HashMap());
		}
		catch (Exception e) {
			diagnostics.error("Errors loading " + CMETINFO_COREMIF, null);
		}

		if (coremifResource != null) {
			for (Iterator iter = coremifResource.getAllContents(); iter.hasNext();) {
				Object content = iter.next();
				if (content instanceof StaticModelInterfacePackage) {
					cmePackage = (StaticModelInterfacePackage) content;
					break;
				}
			}
		}
	}
	
	public CommonModelElementDefinition resolveCommonModelElement(String cmeRef) {
		if (cmePackage == null)
			return null;
		
		for (CommonModelElementDefinition definition : cmePackage.getCommonModelElementDefinition()) {
			if (definition.getName().equals(cmeRef)) {
				return definition;
			}
		}
		return null;
	}

	public StaticModel resolveCommonModel(CommonModelElementDefinition cme) {
		if (cmePackage == null)
			return null;
		
		StaticModel model = null;
		URI fileURI = getFileURI(cme);
		if (unresolvedResources.contains(fileURI)) {
			return null;
		}
		
		Resource mifResource = null;
		try {
			mifResource = cmePackage.eResource().getResourceSet().getResource(fileURI, true);
		} catch (Exception e) {
			unresolvedResources.add(fileURI);
			diagnostics.error("Cannot load resource: " + fileURI, null);
			return null;
		}
		
		for (Iterator iter = mifResource.getAllContents(); iter.hasNext();) {
			Object element = iter.next();
			if (element instanceof StaticModel) {
				model = (StaticModel) element;
				break;
			}
		}
		return model;
	}
	
	public ClassBase resolveCommonModelClass(CommonModelElementDefinition cme, StaticModel mifModel) {
		ClassBase mifClass = null;
		SpecializationClass specialization = cme.getEntryClass();
		// this error has been seen in HL7 IFC files
		if (specialization == null)
			return null;
		
		String className = specialization.getName();
		
		// find the referenced class
		for (ClassElement classElement : mifModel.getContainedClass()) {
			if (classElement.getClass_() != null
					&& ((ClassBase)classElement.getClass_()).getName().equals(className)) {
				mifClass = (ClassBase) classElement.getClass_();
				break;
			}
			if (classElement.getCommonModelElementRef() != null) {
				//TODO
			}
		}
		
		return mifClass;
	}
	
	private URI getFileURI(CommonModelElementDefinition cme) {
		URI fileURI = null;
		PackageRef pkgRef = cme.getBoundStaticModel();
		String pkgId = pkgRef.getId().toString();
		String mifFileName = MIFUtil.getPackageName(pkgRef, pkgId);
		mifFileName += ".mif";
		
		fileURI = cme.eResource().getURI().trimSegments(1);
		fileURI = fileURI.appendSegment(mifFileName.toString());
		
		return fileURI;
	}
	
}
