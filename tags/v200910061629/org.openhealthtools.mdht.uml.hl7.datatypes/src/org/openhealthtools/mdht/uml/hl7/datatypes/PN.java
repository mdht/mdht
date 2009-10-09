/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PN</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPN()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface PN extends EN {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.family->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.given->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.prefix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.suffix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.delimiter->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.family->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.given->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.prefix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and self.suffix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))'"
	 * @generated
	 */
	boolean invariant(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PN
