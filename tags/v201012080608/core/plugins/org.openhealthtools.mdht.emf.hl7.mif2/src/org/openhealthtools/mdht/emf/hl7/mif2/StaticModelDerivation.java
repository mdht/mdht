/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Model Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to a StaticModel
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation#getTargetStaticModel <em>Target Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation#getStaticModelDerivationId <em>Static Model Derivation Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDerivation()
 * @model extendedMetaData="name='StaticModelDerivation' kind='elementOnly'"
 * @generated
 */
public interface StaticModelDerivation extends Derivation {
	/**
	 * Returns the value of the '<em><b>Target Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package name of the static model from which the current model is derived.
	 * UML: Absolute package path (using package names)to the supplying model on the derivationSupplier dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Static Model</em>' containment reference.
	 * @see #setTargetStaticModel(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDerivation_TargetStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getTargetStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation#getTargetStaticModel <em>Target Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Static Model</em>' containment reference.
	 * @see #getTargetStaticModel()
	 * @generated
	 */
	void setTargetStaticModel(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Static Model Derivation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the static model derivation for reference by other derivations within the model.
	 * UML: No mapping.  This is internal XML shorthand to avoid copying the package reference each time a class, association or element is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model Derivation Id</em>' attribute.
	 * @see #setStaticModelDerivationId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDerivation_StaticModelDerivationId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='staticModelDerivationId'"
	 * @generated
	 */
	String getStaticModelDerivationId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation#getStaticModelDerivationId <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Model Derivation Id</em>' attribute.
	 * @see #getStaticModelDerivationId()
	 * @generated
	 */
	void setStaticModelDerivationId(String value);

} // StaticModelDerivation
