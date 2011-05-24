/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Analysis Model Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Descriptive information about the domain analysis model.
 * UML: A collector for the comments associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainAnalysisModelAnnotations()
 * @model extendedMetaData="name='DomainAnalysisModelAnnotations' kind='elementOnly'"
 * @generated
 */
public interface DomainAnalysisModelAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation related to the domain analysis model
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(DomainAnalysisModelDocumentation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainAnalysisModelAnnotations_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainAnalysisModelDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(DomainAnalysisModelDocumentation value);

	/**
	 * Returns the value of the '<em><b>App Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting programmatic information related to the domain analysis model which has descriptive componenents
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Info</em>' containment reference.
	 * @see #setAppInfo(DomainAnalysisModelAppInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainAnalysisModelAnnotations_AppInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainAnalysisModelAppInfo getAppInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations#getAppInfo <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Info</em>' containment reference.
	 * @see #getAppInfo()
	 * @generated
	 */
	void setAppInfo(DomainAnalysisModelAppInfo value);

} // DomainAnalysisModelAnnotations
