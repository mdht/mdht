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
 * A representation of the model object '<em><b>Basic Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An annotation that allows complex internal markup
 * UML: Stereotype on Comment or Constraint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getCombinedText <em>Combined Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getAppendAnnotationId <em>Append Annotation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getPrependAnnotationId <em>Prepend Annotation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation()
 * @model extendedMetaData="name='BasicAnnotation' kind='elementOnly'"
 * @generated
 */
public interface BasicAnnotation extends AnnotationBase {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The textual content of the annotation, with the associated language indicated. CURRENT-1..1
	 * UML: Tag on the BasicAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_Text()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getText();

	/**
	 * Returns the value of the '<em><b>Combined Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The textual content of the annotation fully combined with any prepended and appended annotations  FUTURE_USE
	 * UML: Tag on the BasicAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Text</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_CombinedText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComplexMarkupWithLanguage> getCombinedText();

	/**
	 * Returns the value of the '<em><b>Append Annotation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference of the identifer of the annotation whose content should be appended to the annotation for rendering FUTURE_USE
	 * UML: Tag on the BasicAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append Annotation Id</em>' attribute.
	 * @see #setAppendAnnotationId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_AppendAnnotationId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='appendAnnotationId'"
	 * @generated
	 */
	String getAppendAnnotationId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getAppendAnnotationId <em>Append Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Annotation Id</em>' attribute.
	 * @see #getAppendAnnotationId()
	 * @generated
	 */
	void setAppendAnnotationId(String value);

	/**
	 * Returns the value of the '<em><b>Graphic Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the annotation for the purpose of linking it to its graphical rendering information.  Note: This id will not necessarily be consistent each time the artifact is persisted and must never be used to reference the element from outside the model.
	 * UML: Links the ModelElement to its corresponding UML1GraphicInformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #setGraphicLinkId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_GraphicLinkId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid"
	 *        extendedMetaData="kind='attribute' name='graphicLinkId'"
	 * @generated
	 */
	String getGraphicLinkId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getGraphicLinkId <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #getGraphicLinkId()
	 * @generated
	 */
	void setGraphicLinkId(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of the annotation for external reference, including derivation
	 * UML: Tag on the BasicAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_Id()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Prepend Annotation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference of the identifer of the annotation whose content should be pre-pended to the annotation for rendering FUTURE_USE
	 * UML: Tag on the BasicAnnotation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prepend Annotation Id</em>' attribute.
	 * @see #setPrependAnnotationId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_PrependAnnotationId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='prependAnnotationId'"
	 * @generated
	 */
	String getPrependAnnotationId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getPrependAnnotationId <em>Prepend Annotation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepend Annotation Id</em>' attribute.
	 * @see #getPrependAnnotationId()
	 * @generated
	 */
	void setPrependAnnotationId(String value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBasicAnnotation_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // BasicAnnotation
