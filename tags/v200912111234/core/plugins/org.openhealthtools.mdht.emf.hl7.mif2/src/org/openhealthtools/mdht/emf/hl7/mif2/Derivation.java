/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used for all 'derivationSupplier' elements
 * UML: Abstract stereotype on Dependency
 * DubinCore: 'relation' to source model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getReason <em>Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getAnnotationsReviewedBy <em>Annotations Reviewed By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#isAreAnnotationsReviewed <em>Are Annotations Reviewed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivation()
 * @model abstract="true"
 *        extendedMetaData="name='Derivation' kind='elementOnly'"
 * @generated
 */
public interface Derivation extends Dependency {
	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the reason why the derived element has changed from its source. FUTURE_USE
	 * UML: Tag on Derivation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivation_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getReason();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(Flow value);

	/**
	 * Returns the value of the '<em><b>Annotations Reviewed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the human responsible for the manual review of annotations. FUTURE_USE
	 * UML: Tag on Derivation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations Reviewed By</em>' attribute.
	 * @see #setAnnotationsReviewedBy(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivation_AnnotationsReviewedBy()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='annotationsReviewedBy'"
	 * @generated
	 */
	String getAnnotationsReviewedBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getAnnotationsReviewedBy <em>Annotations Reviewed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations Reviewed By</em>' attribute.
	 * @see #getAnnotationsReviewedBy()
	 * @generated
	 */
	void setAnnotationsReviewedBy(String value);

	/**
	 * Returns the value of the '<em><b>Are Annotations Reviewed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the analysis of the derivation has included review of changed annotations.  This is false if (a) the annotations are identical; (b) an automated process was able to take into account the changes in making the assessment of derivation relationship; or (c) a human has manually reviewed the changes. FUTURE_USE
	 * UML: Tag on Derivation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Are Annotations Reviewed</em>' attribute.
	 * @see #isSetAreAnnotationsReviewed()
	 * @see #unsetAreAnnotationsReviewed()
	 * @see #setAreAnnotationsReviewed(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivation_AreAnnotationsReviewed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='areAnnotationsReviewed'"
	 * @generated
	 */
	boolean isAreAnnotationsReviewed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#isAreAnnotationsReviewed <em>Are Annotations Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Are Annotations Reviewed</em>' attribute.
	 * @see #isSetAreAnnotationsReviewed()
	 * @see #unsetAreAnnotationsReviewed()
	 * @see #isAreAnnotationsReviewed()
	 * @generated
	 */
	void setAreAnnotationsReviewed(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#isAreAnnotationsReviewed <em>Are Annotations Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAreAnnotationsReviewed()
	 * @see #isAreAnnotationsReviewed()
	 * @see #setAreAnnotationsReviewed(boolean)
	 * @generated
	 */
	void unsetAreAnnotationsReviewed();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#isAreAnnotationsReviewed <em>Are Annotations Reviewed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Are Annotations Reviewed</em>' attribute is set.
	 * @see #unsetAreAnnotationsReviewed()
	 * @see #isAreAnnotationsReviewed()
	 * @see #setAreAnnotationsReviewed(boolean)
	 * @generated
	 */
	boolean isSetAreAnnotationsReviewed();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' attribute.
	 * The default value is <code>"restriction"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DerivationRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the relationship between the current element and the element it was derived from.
	 * UML: Each code corresponds to a distinct non-abstract stereotype under Derivation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DerivationRelationshipKind
	 * @see #isSetRelationship()
	 * @see #unsetRelationship()
	 * @see #setRelationship(DerivationRelationshipKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivation_Relationship()
	 * @model default="restriction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relationship'"
	 * @generated
	 */
	DerivationRelationshipKind getRelationship();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DerivationRelationshipKind
	 * @see #isSetRelationship()
	 * @see #unsetRelationship()
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(DerivationRelationshipKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationship()
	 * @see #getRelationship()
	 * @see #setRelationship(DerivationRelationshipKind)
	 * @generated
	 */
	void unsetRelationship();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation#getRelationship <em>Relationship</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship</em>' attribute is set.
	 * @see #unsetRelationship()
	 * @see #getRelationship()
	 * @see #setRelationship(DerivationRelationshipKind)
	 * @generated
	 */
	boolean isSetRelationship();

} // Derivation
