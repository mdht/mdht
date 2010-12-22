/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascadable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An annotation that can cascade
 * UML: Stereotype on Comment or Constraint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation#getCascadeInfo <em>Cascade Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCascadableAnnotation()
 * @model extendedMetaData="name='CascadableAnnotation' kind='elementOnly'"
 * @generated
 */
public interface CascadableAnnotation extends BasicAnnotation {
	/**
	 * Returns the value of the '<em><b>Cascade Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information describing how the annotation cascades through models.  FUTURE_USE
	 * UML: Tag on the CascadableAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cascade Info</em>' containment reference.
	 * @see #setCascadeInfo(AnnotationCascadeInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCascadableAnnotation_CascadeInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascadeInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationCascadeInfo getCascadeInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation#getCascadeInfo <em>Cascade Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Info</em>' containment reference.
	 * @see #getCascadeInfo()
	 * @generated
	 */
	void setCascadeInfo(AnnotationCascadeInfo value);

} // CascadableAnnotation
