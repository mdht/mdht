/*******************************************************************************
 * Copyright (c) 2008, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
  *     Sean Muir (JKM Software) - Added support for MIF associations
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.mif2uml.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.exporter.UMLProcessor;

public class MIFExporter {

	private UMLProcessor umlProcessor;

	public MIFExporter() {
		umlProcessor = new UMLProcessor();
	}
	
	public StaticModel createMIFModel(Element umlElement)
	{
		return umlProcessor.createMIFModel(umlElement);
	}
	
	public DocumentRoot getMIFDocumentRoot() {
		return umlProcessor.getMIFDocumentRoot();
	}

	public StaticModel getMIFModel() {
		return umlProcessor.getMIFModel();
	}

	public void processUML(EObject modelElement) {
		umlProcessor.transformElement(modelElement);
	}
	
	public void processGeneralizations(EObject modelElement) {
		umlProcessor.transformGeneralizations(modelElement);
	}
	
	public void setPackageName(String packageName) {
		umlProcessor.setMIFModelName(packageName);
	}
	
	public void saveMIFModel() {
		umlProcessor.saveMIFModel();
	}
}
