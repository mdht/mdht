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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This content module describes the general structure for a medication. All medication administration acts will be derived
 * from this content module.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getMedication()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Medication_templateId' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.7'"
 * @generated
 */
public interface Medication extends MedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.4.7\')'"
	 * @generated
	 */
	boolean Medication_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init();
} // Medication
