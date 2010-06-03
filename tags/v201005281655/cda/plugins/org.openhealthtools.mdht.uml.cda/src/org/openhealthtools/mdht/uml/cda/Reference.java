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
package org.openhealthtools.mdht.uml.cda;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getSeperatableInd <em>Seperatable Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalAct <em>External Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalObservation <em>External Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalProcedure <em>External Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalDocument <em>External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Seperatable Ind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seperatable Ind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seperatable Ind</em>' containment reference.
	 * @see #setSeperatableInd(BL)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_SeperatableInd()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	BL getSeperatableInd();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getSeperatableInd <em>Seperatable Ind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seperatable Ind</em>' containment reference.
	 * @see #getSeperatableInd()
	 * @generated
	 */
	void setSeperatableInd(BL value);

	/**
	 * Returns the value of the '<em><b>External Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Act</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Act</em>' containment reference.
	 * @see #setExternalAct(ExternalAct)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_ExternalAct()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalAct getExternalAct();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalAct <em>External Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Act</em>' containment reference.
	 * @see #getExternalAct()
	 * @generated
	 */
	void setExternalAct(ExternalAct value);

	/**
	 * Returns the value of the '<em><b>External Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Observation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Observation</em>' containment reference.
	 * @see #setExternalObservation(ExternalObservation)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_ExternalObservation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObservation getExternalObservation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalObservation <em>External Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Observation</em>' containment reference.
	 * @see #getExternalObservation()
	 * @generated
	 */
	void setExternalObservation(ExternalObservation value);

	/**
	 * Returns the value of the '<em><b>External Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Procedure</em>' containment reference.
	 * @see #setExternalProcedure(ExternalProcedure)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_ExternalProcedure()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalProcedure getExternalProcedure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalProcedure <em>External Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Procedure</em>' containment reference.
	 * @see #getExternalProcedure()
	 * @generated
	 */
	void setExternalProcedure(ExternalProcedure value);

	/**
	 * Returns the value of the '<em><b>External Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Document</em>' containment reference.
	 * @see #setExternalDocument(ExternalDocument)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_ExternalDocument()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalDocument getExternalDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getExternalDocument <em>External Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Document</em>' containment reference.
	 * @see #getExternalDocument()
	 * @generated
	 */
	void setExternalDocument(ExternalDocument value);

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_NullFlavor()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see #isSetNullFlavor()
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	void unsetNullFlavor();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getNullFlavor <em>Null Flavor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Flavor</em>' attribute is set.
	 * @see #unsetNullFlavor()
	 * @see #getNullFlavor()
	 * @see #setNullFlavor(NullFlavor)
	 * @generated
	 */
	boolean isSetNullFlavor();

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #setTypeCode(x_ActRelationshipExternalReference)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getReference_TypeCode()
	 * @model unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	x_ActRelationshipExternalReference getTypeCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(x_ActRelationshipExternalReference value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(x_ActRelationshipExternalReference)
	 * @generated
	 */
	void unsetTypeCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.cda.Reference#getTypeCode <em>Type Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Code</em>' attribute is set.
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(x_ActRelationshipExternalReference)
	 * @generated
	 */
	boolean isSetTypeCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag{self.externalAct.oclIsUndefined(), self.externalDocument.oclIsUndefined(), self.externalObservation.oclIsUndefined(), self.externalProcedure.oclIsUndefined()}->one(x | x = false)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='Bag{self.externalAct.oclIsUndefined(), self.externalDocument.oclIsUndefined(), self.externalObservation.oclIsUndefined(), self.externalProcedure.oclIsUndefined()}->one(x | x = false)'"
	 * @generated
	 */
	boolean validateExternalActChoice(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Reference
