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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.XSDDatatypeUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeUtil;

public class TransformAbstractDatatypes extends UMLSwitch {

	private XSDTransformerOptions transformerOptions;

	public TransformAbstractDatatypes(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public Object caseProperty(Property property) {
		String typeName = null;
		Classifier classifier = (Classifier) property.getType();
		if (UMLUtil.isTemplateBinding(classifier)) {
			// get HL7 XSD data types underscore name for template bindings
			typeName = getTemplateBindingName(classifier);
		} else if (DatatypeUtil.isAbstractDatatype(classifier)) {
			typeName = classifier.getName();

			// GTS maps to SXCM_TS
			if ("GTS".equals(typeName)) {
				typeName = "SXCM_TS";
			}
		}

		if (typeName != null) {
			Package basePackage = UMLUtil.getTopPackage(property);
			Classifier xsdDatatype = XSDDatatypeUtil.getDatatypeByName(basePackage, typeName);
			if (xsdDatatype != null) {
				property.setType(xsdDatatype);
			} else {
				property.setType(null);
				System.out.println("Cannot map HL7 data type: '" + typeName + "' on property: " +
						UMLUtil.getPackageQualifiedName(property));
			}
		}

		return classifier;
	}

	/**
	 * @param classifier
	 * @return type name as mapped to XSD data types
	 */
	private String getTemplateBindingName(Classifier classifier) {
		if (!UMLUtil.isTemplateBinding(classifier)) {
			return classifier.getName();
		}

		StringBuffer name = new StringBuffer();
		Classifier template = UMLUtil.getTemplate(classifier);
		if (!"SET".equals(template.getName()) && !"BAG".equals(template.getName()) &&
				!"LIST".equals(template.getName())) {

			if (name.length() > 0) {
				name.append("_");
			}
			name.append(template.getName());
		}

		List<Classifier> params = UMLUtil.getTemplateBindingParameters(classifier);
		for (Classifier param : params) {
			if (name.length() > 0) {
				name.append("_");
			}
			name.append(getTemplateBindingName(param));
		}

		return name.toString();
	}

}
