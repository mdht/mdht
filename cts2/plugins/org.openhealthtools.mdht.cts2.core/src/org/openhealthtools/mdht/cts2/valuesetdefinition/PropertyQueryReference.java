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

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.FilterComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Query Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A description of a set of entity references that are determined by applying a filter to the attribute(s) or property(s) that appear in an <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">EntityDescription</i> in a specified code system.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystemVersion <em>Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getPropertyQueryReference()
 * @model extendedMetaData="name='PropertyQueryReference' kind='elementOnly'"
 * @generated
 */
public interface PropertyQueryReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code system that contains the assertions that form the attributes or properties to be tested.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getPropertyQueryReference_CodeSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystem <em>Code System</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the code system that makes the assertions. If present, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">codeSystemVersion</i> must be a version of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">codeSystem</i>. If this attribute is present, the referenced version of the code
	 * system will always be used to resolve the attributes or properties. If absent, the specific version of the code system to be used in resolution
	 * is determined in the resolve value set definition call
	 * itself.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version</em>' containment reference.
	 * @see #setCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getPropertyQueryReference_CodeSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getCodeSystemVersion
	 * <em>Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version</em>' containment reference.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The filter to be applied to entities in the referenced code system.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterComponent)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getPropertyQueryReference_Filter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterComponent getFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference#getFilter <em>Filter</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterComponent value);

} // PropertyQueryReference
