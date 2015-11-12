/*******************************************************************************
 * Copyright (c) 2011 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.internal.generate;

import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.UmlPlugin;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class Generate {

	public static void main(String[] args) {

		if (args.length != 4) {
			System.out.println("Error running XML Generate, Invalid arguments");
			return;
		}

		System.out.println("XML Sample Snippet generated for " + args[1]);
		System.out.println();
		System.out.println();
		System.out.println();

		ResourceSet resourceSet = new ResourceSetImpl();

		// Initialize registry
		Registry packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		packageRegistry.put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
		packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);

		// CDA Profile to registry
		packageRegistry.put(CDAPackage.eNS_URI, CDAPackage.eINSTANCE);

		String umlPluginLocation = args[2];
		String cdaResourcePluginLocation = args[3];
		String cdaProfileLocation = org.openhealthtools.mdht.uml.cda.resources.util.CDAResource.CDA_PROFILE_URI +
				"#_cxOJEIEVEd6H8o-hO3-B4Q";

		String umlModelLocation = args[0];
		String umlClassName = args[1];

		// Initialize pathmaps
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();

		// Create and Add UML PathMaps
		URI uri = URI.createURI(umlPluginLocation);
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));

		// Create and Add CDA Profile PathMaps
		URI cdaresourceURI = URI.createURI(cdaResourcePluginLocation);
		URI cdaPathmap = URI.createURI(org.openhealthtools.mdht.uml.cda.resources.util.CDAResource.PROFILES_PATHMAP);
		uriMap.put(cdaPathmap, cdaresourceURI.appendSegment("profiles").appendSegment(""));
		UMLPlugin.getEPackageNsURIToProfileLocationMap().put(
			org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage.eNS_URI, URI.createURI(cdaProfileLocation));

		// Load the CDA Packages
		UmlPlugin.computeModelPathMapExtensions();

		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		CDAUtil.loadPackages();

		// Open the model
		URI modelFile = URI.createFileURI(umlModelLocation);

		Resource umlResource = resourceSet.getResource(modelFile, true);

		Package umlPackage = (Package) EcoreUtil.getObjectByType(
			umlResource.getContents(), UMLPackage.eINSTANCE.getPackage());

		if (umlPackage != null) {

			EcoreUtil.resolveAll(umlPackage);

			Class generationTarget = UMLUtil.getClassByName(umlPackage, umlClassName);

			if (generationTarget != null) {

				InstanceGenerator generator = new InstanceGenerator(true);

				EObject instance = generator.createInstance(generationTarget, 50);

				PrintWriter writer = new PrintWriter(System.out);

				generator.save(instance, writer);

				writer.close();

			}

		}

	}

}
