/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.providers.RIMDefaultViewProvider.IViewCustomizer;

/**
 * 
 * @generated
 */
public class RoleClassViewCustomizer implements IViewCustomizer {

	/**
	 * @generated
	 */
	public static RoleClassViewCustomizer INSTANCE = new RoleClassViewCustomizer();

	/**
	 * @generated
	 */
	private RoleClassViewCustomizer() {
		// private constructor
	}

	/**
	 * @generated
	 */
	public void customizeView(View view) {
		EPackage umlnotationEPackage = EPackage.Registry.INSTANCE.getEPackage("http://www.ibm.com/xtools/1.5.2/Umlnotation"); //$NON-NLS-1$
		EFactory umlnotationEFactory = umlnotationEPackage.getEFactoryInstance();

		EClass umlshapestyleEClass = (EClass) umlnotationEPackage.getEClassifier("UMLShapeStyle"); //$NON-NLS-1$
		if (umlshapestyleEClass != null) {
			Style style = view.getStyle(umlshapestyleEClass);
			if (style == null) {
				style = (Style) umlnotationEFactory.create(umlshapestyleEClass);
				view.getStyles().add(style);
			}
			EStructuralFeature showStereotypeFeature = umlshapestyleEClass.getEStructuralFeature("showStereotype"); //$NON-NLS-1$
			if (showStereotypeFeature != null && showStereotypeFeature.getEType() instanceof EDataType) {
				EDataType showStereotypeFeatureType = (EDataType) showStereotypeFeature.getEType();
				style.eSet(
					showStereotypeFeature,
					showStereotypeFeatureType.getEPackage().getEFactoryInstance().createFromString(
						showStereotypeFeatureType, "Image")); //$NON-NLS-1$
			}
		}

	}
}
