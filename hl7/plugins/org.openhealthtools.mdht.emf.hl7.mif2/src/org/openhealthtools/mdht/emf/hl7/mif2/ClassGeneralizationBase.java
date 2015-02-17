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
 * A representation of the model object '<em><b>Class Generalization Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to Generalization
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGeneralizationBase()
 * @model abstract="true"
 *        extendedMetaData="name='ClassGeneralizationBase' kind='elementOnly'"
 * @generated
 */
public interface ClassGeneralizationBase extends Relationship {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a Generalization.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(GeneralizationAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGeneralizationBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralizationAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(GeneralizationAnnotations value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the element must be supported by implementors or not.  If not present, indicates that support is optional.
	 * UML: Tag value on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #setConformance(ConformanceKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGeneralizationBase_Conformance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	ConformanceKind getConformance();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(ConformanceKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	void unsetConformance();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getConformance <em>Conformance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformance</em>' attribute is set.
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	boolean isSetConformance();

	/**
	 * Returns the value of the '<em><b>Graphic Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the generalization for the purpose of linking it to its graphical rendering information.  Note: This id will not necessarily be consistent each time the artifact is persisted and must never be used to reference the element from outside the model.
	 * UML: Links the ModelElement to its corresponding UML1GraphicInformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #setGraphicLinkId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGeneralizationBase_GraphicLinkId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid"
	 *        extendedMetaData="kind='attribute' name='graphicLinkId'"
	 * @generated
	 */
	String getGraphicLinkId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getGraphicLinkId <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #getGraphicLinkId()
	 * @generated
	 */
	void setGraphicLinkId(String value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGeneralizationBase_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // ClassGeneralizationBase
