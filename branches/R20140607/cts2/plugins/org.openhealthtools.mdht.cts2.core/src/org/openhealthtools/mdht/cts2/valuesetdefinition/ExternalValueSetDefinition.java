/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.openhealthtools.mdht.cts2.core.OpaqueData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Value Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A definition of a value set whose format and semantics is specified outside of the core CTS<sub
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">2</sub> specification. If a given CTS<sub
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">2</sub> service recognizes the syntax and semantics of this definition,
 * it may call the appropriate process to resolve it. If the definition is not recognized, a CTS<sub
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">2</sub> service implementation must not process the containing value set definition
 * and, instead, return an
 * error.
 * <!-- end-model-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getExternalValueSetDefinition()
 * @model extendedMetaData="name='ExternalValueSetDefinition' kind='elementOnly'"
 * @generated
 */
public interface ExternalValueSetDefinition extends OpaqueData {
} // ExternalValueSetDefinition
