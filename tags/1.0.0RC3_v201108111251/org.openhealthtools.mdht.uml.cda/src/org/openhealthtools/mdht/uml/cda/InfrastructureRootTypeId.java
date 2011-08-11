/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Root Type Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getInfrastructureRootTypeId()
 * @model features="redefinedRoot redefinedExtension" 
 *        redefinedRootDefault="2.16.840.1.113883.1.3" redefinedRootUnsettable="true" redefinedRootDataType="org.openhealthtools.mdht.uml.hl7.datatypes.uid" redefinedRootRequired="true" redefinedRootOrdered="false" redefinedRootSuppressedGetVisibility="true" redefinedRootSuppressedSetVisibility="true" redefinedRootSuppressedIsSetVisibility="true" redefinedRootSuppressedUnsetVisibility="true"
 *        redefinedRootExtendedMetaData="name='root' kind='attribute'"
 *        redefinedExtensionDataType="org.openhealthtools.mdht.uml.hl7.datatypes.stType" redefinedExtensionRequired="true" redefinedExtensionOrdered="false" redefinedExtensionSuppressedGetVisibility="true" redefinedExtensionSuppressedSetVisibility="true"
 *        redefinedExtensionExtendedMetaData="name='extension' kind='attribute'"
 * @generated
 */
public interface InfrastructureRootTypeId extends II {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.root='2.16.840.1.113883.1.3'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.root=\'2.16.840.1.113883.1.3\''"
	 * @generated
	 */
	boolean validateRedefinedRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.extension.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.extension.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateRedefinedExtension(DiagnosticChain diagnostics, Map<Object, Object> context);
} // InfrastructureRootTypeId
