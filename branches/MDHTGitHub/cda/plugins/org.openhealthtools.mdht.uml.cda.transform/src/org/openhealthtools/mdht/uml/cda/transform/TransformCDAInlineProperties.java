/*******************************************************************************
 * Copyright (c) 2012 ramakrishnanr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Rama Ramakrishnan - initial API and implementation
 *     					 - Generated OCL for subclassed datatypes does not check nullFlavor(artf3450)
 *     Sean Muir		 - Refactored to extend the underlying inline transformation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties;

/**
 * @author ramakrishnanr
 * 
 */
public class TransformCDAInlineProperties extends TransformInlinedProperties {

	/**
	 * @param options
	 * @param baseModelReflection
	 */
	public TransformCDAInlineProperties(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * Within MDHT we support a level of simplification of associations between clinical documents and sections as well as sections and clinical
	 * statements
	 * As such we need to replace the path with a corresponding operation to use in the ocl
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties#getPath(org.eclipse.uml2.uml.Class, org.eclipse.uml2.uml.Class,
	 * org.eclipse.uml2.uml.Property)
	 */
	@Override
	public String getPath(Class baseSourceClass, Class targetClass, Property sourceProperty) {

		if (CDAModelUtil.isClinicalDocument(baseSourceClass) && CDAModelUtil.isSection(targetClass)) {
			return "getAllSections()";
		} else if (CDAModelUtil.isSection(baseSourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {

			Class cdaClass = CDAModelUtil.getCDAClass(targetClass);

			if (cdaClass != null) {
				if (cdaClass.getName().equals("Act")) {
					return "getActs()";
				}
				if (cdaClass.getName().equals("Encounter")) {
					return "getEncounters()";
				}
				if (cdaClass.getName().equals("Observation")) {
					return "getObservations()";
				}
				if (cdaClass.getName().equals("ObservationMedia")) {
					return "getObservationMedias()";
				}
				if (cdaClass.getName().equals("Organizer")) {
					return "getOrganizers()";
				}
				if (cdaClass.getName().equals("Procedure")) {
					return "getProcedures()";
				}
				if (cdaClass.getName().equals("RegionOfInterest")) {
					return "getRegionOfInterests()";
				}
				if (cdaClass.getName().equals("SubstanceAdministration")) {
					return "getSubstanceAdministrations()";
				}
				if (cdaClass.getName().equals("Supply")) {
					return "getSupplies()";
				}
			}
			return super.getPath(baseSourceClass, targetClass, sourceProperty);

		} else {
			return super.getPath(baseSourceClass, targetClass, sourceProperty);
		}
	}

	/*
	 * If the property type is a datatype and not mandatory, add a check for null flavor
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties#getNullSafePath(org.eclipse.uml2.uml.Class,
	 * org.eclipse.uml2.uml.Class, org.eclipse.uml2.uml.Property)
	 */
	@Override
	public String getNullSafePath(Class baseSourceClass, Class targetClass, Property sourceProperty) {
		if (isHL7Datatype(sourceProperty.getType()) && !CDAProfileUtil.isMandatory(sourceProperty)) {
			return super.getNullSafePath(baseSourceClass, targetClass, sourceProperty) +
					"->select(isNullFlavorUndefined())";
		} else {
			return super.getNullSafePath(baseSourceClass, targetClass, sourceProperty);

		}
	}

	private boolean isHL7Datatype(org.eclipse.uml2.uml.Type type) {
		boolean result = false;
		if (type instanceof Classifier) {
			if (CDAModelUtil.isDatatypeModel(type)) {
				result = true;
			} else {
				for (Classifier classifier : UMLUtil.getAllGeneralizations((Classifier) type)) {
					if (CDAModelUtil.isDatatypeModel(classifier)) {
						result = true;
						break;
					}
				}
			}
		}
		return result;
	}

}
