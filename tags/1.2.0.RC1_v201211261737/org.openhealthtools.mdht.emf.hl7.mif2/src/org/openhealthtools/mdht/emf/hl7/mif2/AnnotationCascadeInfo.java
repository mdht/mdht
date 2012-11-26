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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Cascade Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information defining how the annotation should be cascaded to different models and different artifacts
 * UML: Complex tag on Annotation stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isClassifierNameExact <em>Classifier Name Exact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getContextClassName <em>Context Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getRimFeatureName <em>Rim Feature Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isTargetClassNameExact <em>Target Class Name Exact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo()
 * @model extendedMetaData="name='AnnotationCascadeInfo' kind='elementOnly'"
 * @generated
 */
public interface AnnotationCascadeInfo extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraints the annotation to only apply to attributes whose type matches the specified datatype
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_Datatype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getDatatype();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of class or datatype (or general kind of class) the annotation applies to 
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_ClassifierName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName"
	 *        extendedMetaData="kind='attribute' name='classifierName'"
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name Exact</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the class name must match the name exactly, or can match it approximately based on classCode and/or mood for the annotation to apply
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Name Exact</em>' attribute.
	 * @see #isSetClassifierNameExact()
	 * @see #unsetClassifierNameExact()
	 * @see #setClassifierNameExact(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_ClassifierNameExact()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='classifierNameExact'"
	 * @generated
	 */
	boolean isClassifierNameExact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isClassifierNameExact <em>Classifier Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name Exact</em>' attribute.
	 * @see #isSetClassifierNameExact()
	 * @see #unsetClassifierNameExact()
	 * @see #isClassifierNameExact()
	 * @generated
	 */
	void setClassifierNameExact(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isClassifierNameExact <em>Classifier Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassifierNameExact()
	 * @see #isClassifierNameExact()
	 * @see #setClassifierNameExact(boolean)
	 * @generated
	 */
	void unsetClassifierNameExact();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isClassifierNameExact <em>Classifier Name Exact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classifier Name Exact</em>' attribute is set.
	 * @see #unsetClassifierNameExact()
	 * @see #isClassifierNameExact()
	 * @see #setClassifierNameExact(boolean)
	 * @generated
	 */
	boolean isSetClassifierNameExact();

	/**
	 * Returns the value of the '<em><b>Context Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the parent class of the class to which the annotation applies.
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Class Name</em>' attribute.
	 * @see #setContextClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_ContextClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName"
	 *        extendedMetaData="kind='attribute' name='contextClassName'"
	 * @generated
	 */
	String getContextClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getContextClassName <em>Context Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Class Name</em>' attribute.
	 * @see #getContextClassName()
	 * @generated
	 */
	void setContextClassName(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CascadingAnnotationElementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what sort of element this annotation applies to
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CascadingAnnotationElementKind
	 * @see #isSetElementType()
	 * @see #unsetElementType()
	 * @see #setElementType(CascadingAnnotationElementKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_ElementType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='elementType'"
	 * @generated
	 */
	CascadingAnnotationElementKind getElementType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CascadingAnnotationElementKind
	 * @see #isSetElementType()
	 * @see #unsetElementType()
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(CascadingAnnotationElementKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementType()
	 * @see #getElementType()
	 * @see #setElementType(CascadingAnnotationElementKind)
	 * @generated
	 */
	void unsetElementType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getElementType <em>Element Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Type</em>' attribute is set.
	 * @see #unsetElementType()
	 * @see #getElementType()
	 * @see #setElementType(CascadingAnnotationElementKind)
	 * @generated
	 */
	boolean isSetElementType();

	/**
	 * Returns the value of the '<em><b>Rim Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the RIM name of the attribute or association end
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rim Feature Name</em>' attribute.
	 * @see #setRimFeatureName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_RimFeatureName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName"
	 *        extendedMetaData="kind='attribute' name='rimFeatureName'"
	 * @generated
	 */
	String getRimFeatureName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getRimFeatureName <em>Rim Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rim Feature Name</em>' attribute.
	 * @see #getRimFeatureName()
	 * @generated
	 */
	void setRimFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name of the target class of the association (or general kind of class) the annotation applies to
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Class Name</em>' attribute.
	 * @see #setTargetClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_TargetClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName"
	 *        extendedMetaData="kind='attribute' name='targetClassName'"
	 * @generated
	 */
	String getTargetClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#getTargetClassName <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class Name</em>' attribute.
	 * @see #getTargetClassName()
	 * @generated
	 */
	void setTargetClassName(String value);

	/**
	 * Returns the value of the '<em><b>Target Class Name Exact</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the target class name must match the name exactly, or can match it approximately based on classCode and/or mood for the annotation to apply
	 * UML: Component of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Class Name Exact</em>' attribute.
	 * @see #isSetTargetClassNameExact()
	 * @see #unsetTargetClassNameExact()
	 * @see #setTargetClassNameExact(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationCascadeInfo_TargetClassNameExact()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='targetClassNameExact'"
	 * @generated
	 */
	boolean isTargetClassNameExact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isTargetClassNameExact <em>Target Class Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class Name Exact</em>' attribute.
	 * @see #isSetTargetClassNameExact()
	 * @see #unsetTargetClassNameExact()
	 * @see #isTargetClassNameExact()
	 * @generated
	 */
	void setTargetClassNameExact(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isTargetClassNameExact <em>Target Class Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetClassNameExact()
	 * @see #isTargetClassNameExact()
	 * @see #setTargetClassNameExact(boolean)
	 * @generated
	 */
	void unsetTargetClassNameExact();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo#isTargetClassNameExact <em>Target Class Name Exact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Class Name Exact</em>' attribute is set.
	 * @see #unsetTargetClassNameExact()
	 * @see #isTargetClassNameExact()
	 * @see #setTargetClassNameExact(boolean)
	 * @generated
	 */
	boolean isSetTargetClassNameExact();

} // AnnotationCascadeInfo
