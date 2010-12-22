/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - Refactor into utility class 
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints;

import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;

/**
 * RIMConstraintsUtil contains several methods utilized by the various rim
 * constraints. These methods might be of use else where and migrating them to
 * the common rim utility class might be beneficial
 * 
 */
public class RIMConstraintsUtil {

	/**
	 * getRIMSupplier returns the for the uml class based on the the applied HDF
	 * stereotype
	 * 
	 * @param umlClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Class getRIMSupplier(Class umlClass) {

		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				umlClass, IHDFProfileConstants.HDF_CLASS);

		Class result = null;

		if (stereotype != null) {
			Object value = umlClass.getValue(stereotype,
					IHDFProfileConstants.DERIVATION_SUPPLIER);
			if (value instanceof List) {
				List<Class> derivations = (List<Class>) value;
				for (Iterator<Class> iter = derivations.iterator(); iter
						.hasNext();) {
					Class supplier = (Class) iter.next();
					if ("RIM".equals(supplier.getModel().getName())) {
						result = supplier;
						break;
					}
				}
			}
		}

		return result;
	}

	/**
	 * getRIMSupplier returns the for the uml property based on the the applied
	 * HDF stereotype
	 * 
	 * @param property
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Property getRIMSupplier(Property property) {

		Property result = null;

		if (property != null) {

			// use abstract HDFProperty
			Stereotype propertyStereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.HDF_ATTRIBUTE);

			if (propertyStereotype == null) {
				propertyStereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.HDF_ASSOCIATION_END);
			}

			if (propertyStereotype != null) {
				Object value = property.getValue(propertyStereotype, IHDFProfileConstants.DERIVATION_SUPPLIER);
				if (value instanceof List) {
					List<Property> derivations = (List<Property>) value;
					for (Iterator<Property> iter = derivations.iterator(); iter.hasNext();) {
						Property supplier = iter.next();
						
						if (supplier.getModel() != null) {
							if ("RIM".equals(supplier.getModel().getName())) {
								result = supplier;
							}
						}
						
					}
				}
			} else {

				// try to find a matching property in the RIM class
				if (property.getClass_() != null) {
					Class rimClass = RIMConstraintsUtil.getRIMSupplier(property.getClass_());
					if (rimClass != null) {
						result = (Property) rimClass.getInheritedMember(property.getName(), false, UMLPackage.eINSTANCE.getProperty());
					}
				}
			}

		}
		return result;
	}

	/**
	 * @param rimClass
	 * @return
	 */
	public static boolean  isAct(Class rimClass)
	{
		return isRim(IRIMProfileConstants.ACT,rimClass);
	}

	/**
	 * @param rimClass
	 * @return
	 */
	public static boolean isActRelationship(Class rimClass)
	{
		return isRim(IRIMProfileConstants.ACT_RELATIONSHIP,rimClass);
	}

	/**
	 * @param rimClass
	 * @return
	 */
	public static boolean isEntity(Class rimClass)
	{
		return isRim(IRIMProfileConstants.ENTITY,rimClass);
	}

	/**
	 * @param rimClass
	 * @return
	 */
	public static boolean isParticipation(Class rimClass)
	{
		return isRim(IRIMProfileConstants.PARTICIPATION,rimClass);
	}

	/**
	 * isRim(String rim,Class rimClass) determines if the class extends a RIM
	 * core class
	 * 
	 * @param rim
	 * @param rimClass
	 * @return
	 */
	public static boolean isRim(String rim,Class rimClass)
	{
		boolean isRim = false;
		
		List<String> allParentNames = UMLUtil.getAllParentNames(rimClass);
		
		if (allParentNames != null)
		{
			if (allParentNames.contains(rim))
			{
				isRim = true;
			}		
		}
		
		return isRim;
	}

	/**
	 * @param rimClass
	 * @return
	 */
	public static boolean isRole(Class rimClass)
	{
		return isRim(IRIMProfileConstants.ROLE,rimClass);
	}

}
