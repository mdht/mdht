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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Mapping stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceArtifact <em>Source Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getStrength <em>Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping()
 * @model extendedMetaData="name='Mapping' kind='elementOnly'"
 * @generated
 */
public interface Mapping extends CascadableAnnotation {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Derivation Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the constraint from which the current constraint was derived.
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Supplier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_DerivationSupplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivationSupplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationDerivation> getDerivationSupplier();

	/**
	 * Returns the value of the '<em><b>Source Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model or other identifier associated with the item being mapped to
	 * UML: sourceId tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Artifact</em>' containment reference.
	 * @see #setSourceArtifact(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_SourceArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getSourceArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceArtifact <em>Source Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Artifact</em>' containment reference.
	 * @see #getSourceArtifact()
	 * @generated
	 */
	void setSourceArtifact(PackageOrArtifactRef value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the constraint
	 * UML: name attribute inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the standard from which the reference is taken.
	 * UML: sourceName tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_SourceName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.MappingSourceKind" required="true"
	 *        extendedMetaData="kind='attribute' name='sourceName'"
	 * @generated
	 */
	Object getSourceName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(Object value);

	/**
	 * Returns the value of the '<em><b>Source Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version number or label associated with the item being mapped to
	 * UML: sourceVersion tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Version</em>' attribute.
	 * @see #setSourceVersion(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_SourceVersion()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='sourceVersion'"
	 * @generated
	 */
	String getSourceVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getSourceVersion <em>Source Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Version</em>' attribute.
	 * @see #getSourceVersion()
	 * @generated
	 */
	void setSourceVersion(String value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the quality of the mapping.
	 * UML: strength tag on Mapping stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind
	 * @see #isSetStrength()
	 * @see #unsetStrength()
	 * @see #setStrength(MapRelationshipKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapping_Strength()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='strength'"
	 * @generated
	 */
	MapRelationshipKind getStrength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind
	 * @see #isSetStrength()
	 * @see #unsetStrength()
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(MapRelationshipKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrength()
	 * @see #getStrength()
	 * @see #setStrength(MapRelationshipKind)
	 * @generated
	 */
	void unsetStrength();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping#getStrength <em>Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strength</em>' attribute is set.
	 * @see #unsetStrength()
	 * @see #getStrength()
	 * @see #setStrength(MapRelationshipKind)
	 * @generated
	 */
	boolean isSetStrength();

} // Mapping
