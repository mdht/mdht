/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deprecation Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Mapping stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo#getDeprecationEffectiveVersion <em>Deprecation Effective Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDeprecationInfo()
 * @model extendedMetaData="name='DeprecationInfo' kind='elementOnly'"
 * @generated
 */
public interface DeprecationInfo extends ContextAnnotation {
	/**
	 * Returns the value of the '<em><b>Derivation Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the constraint from which the current deprecation information was derived.
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Supplier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDeprecationInfo_DerivationSupplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivationSupplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationDerivation> getDerivationSupplier();

	/**
	 * Returns the value of the '<em><b>Deprecation Effective Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of the version of the parent artifact in which the element became deprecated
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecation Effective Version</em>' attribute.
	 * @see #setDeprecationEffectiveVersion(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDeprecationInfo_DeprecationEffectiveVersion()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Version"
	 *        extendedMetaData="kind='attribute' name='deprecationEffectiveVersion'"
	 * @generated
	 */
	String getDeprecationEffectiveVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo#getDeprecationEffectiveVersion <em>Deprecation Effective Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecation Effective Version</em>' attribute.
	 * @see #getDeprecationEffectiveVersion()
	 * @generated
	 */
	void setDeprecationEffectiveVersion(String value);

} // DeprecationInfo
