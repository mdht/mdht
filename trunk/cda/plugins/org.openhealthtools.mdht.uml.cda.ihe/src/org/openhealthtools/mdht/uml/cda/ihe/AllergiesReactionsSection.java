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
package org.openhealthtools.mdht.uml.cda.ihe;

import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergies Reactions Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The adverse and other adverse reactions section shall contain a narrative description of the substance intolerances and the
 * associated adverse reactions suffered by the patient.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getAllergiesReactionsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.13' constraints.validation.error='AlertsSectionTemplateId'"
 *        annotation="uml2.alias Allergies\040and\040Other\040Adverse\040Reactions\040Section='null'"
 * @generated
 */
public interface AllergiesReactionsSection extends AlertsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection init();
} // AllergiesReactionsSection
