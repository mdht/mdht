/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @author dcarlson
 *
 */
public class GreenDatatypesUtil {
	public static final String GREEN_DATATYPES_FILE_NAME = "green_datatypes.uml";

	private Package greenDatatypes = null;

	public GreenDatatypesUtil() {
	}

	public void loadGreenDatatypesFromBase(ResourceSet resourceSet, URI uriBase) {
		URI greenURI = uriBase.appendSegment(GREEN_DATATYPES_FILE_NAME);
		Resource resource = resourceSet.getResource(greenURI, true);
		if (resource.getContents().size() > 0) {
			greenDatatypes = (Package) resource.getContents().get(0);
		}

	}

	public Classifier getGreenTypeFor(Classifier classifier) {
		Classifier greenType = null;

		if (greenDatatypes != null) {
			String greenTypeName = mapToGreenType(classifier.getName());
			if (greenDatatypes != null) {
				greenType = (Classifier) greenDatatypes.getOwnedType(
					greenTypeName, false, UMLPackage.eINSTANCE.getClassifier(), false);
			}
		}

		return greenType;
	}

	public String mapToGreenType(String typeName) {
		String greenTypeName = null;
		if ("AD".equals(typeName)) {
			greenTypeName = "PostalAddress";
		} else if ("ED".equals(typeName)) {
			greenTypeName = "EncapsulatedData";
		} else if ("CD".equals(typeName)) {
			greenTypeName = "ConceptDescriptor";
		} else if ("CE".equals(typeName)) {
			greenTypeName = "CodedWithEquivalents";
		} else if ("CS".equals(typeName)) {
			greenTypeName = "CodedSimpleValue";
		} else if ("II".equals(typeName)) {
			greenTypeName = "InstanceIdentifier";
		} else if ("ON".equals(typeName)) {
			greenTypeName = "OrganizationName";
		} else if ("PN".equals(typeName)) {
			greenTypeName = "PersonName";
		} else if ("PQ".equals(typeName)) {
			greenTypeName = "PhysicalQuantity";
		} else if ("INT".equals(typeName)) {
			greenTypeName = "IntegerNumber";
		} else if ("IVL_INT".equals(typeName)) {
			greenTypeName = "IntervalOfInteger";
		} else if ("MO".equals(typeName)) {
			greenTypeName = "MonetaryAmount";
		} else if ("TS".equals(typeName)) {
			greenTypeName = "Timestamp";
		} else if ("IVL_TS".equals(typeName)) {
			greenTypeName = "IntervalOfTimestamps";
		} else if ("SXCM_TS".equals(typeName)) {
			greenTypeName = "IntervalOfTimestamps";
		} else if ("TEL".equals(typeName)) {
			greenTypeName = "TelecomAddress";
		} else if ("RTO_PQ_PQ".equals(typeName)) {
			greenTypeName = "Ratio";
		} else {
			greenTypeName = typeName;
		}

		return greenTypeName;
	}
}
