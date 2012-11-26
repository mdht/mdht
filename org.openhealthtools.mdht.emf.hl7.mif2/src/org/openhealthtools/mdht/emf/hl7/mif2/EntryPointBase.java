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
 * A representation of the model object '<em><b>Entry Point Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Stereotype of Interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getUseKind <em>Use Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase()
 * @model extendedMetaData="name='EntryPointBase' kind='elementOnly'"
 * @generated
 */
public interface EntryPointBase extends Interface {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with an entry point.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(EntryPointAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryPointAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(EntryPointAnnotations value);

	/**
	 * Returns the value of the '<em><b>Graphic Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the entry-point for the purpose of linking it to its graphical rendering information.  Note: This id will not necessarily be consistent each time the artifact is persisted and must never be used to reference the element from outside the model.
	 * UML: Links the ModelElement to its corresponding UML1GraphicInformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #setGraphicLinkId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase_GraphicLinkId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid"
	 *        extendedMetaData="kind='attribute' name='graphicLinkId'"
	 * @generated
	 */
	String getGraphicLinkId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getGraphicLinkId <em>Graphic Link Id</em>}' attribute.
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
	 * Deprecated: The 'old'-style identifier associated with the model that is tied to the entry-point
	 * UML: Would be an attribute on the stereotype, but it's going away soon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase_Id()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the entry-point
	 * UML: Would an attribute on the stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of content represented by the model when entered from this entry point.  The contentType determines whether the model is legitimate content for a classStub from another model.
	 * UML: Corresponds to the name (inherited from ModelElement) of the interface being implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind
	 * @see #isSetUseKind()
	 * @see #unsetUseKind()
	 * @see #setUseKind(StaticModelUseKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getEntryPointBase_UseKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='useKind'"
	 * @generated
	 */
	StaticModelUseKind getUseKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getUseKind <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind
	 * @see #isSetUseKind()
	 * @see #unsetUseKind()
	 * @see #getUseKind()
	 * @generated
	 */
	void setUseKind(StaticModelUseKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getUseKind <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseKind()
	 * @see #getUseKind()
	 * @see #setUseKind(StaticModelUseKind)
	 * @generated
	 */
	void unsetUseKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase#getUseKind <em>Use Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Kind</em>' attribute is set.
	 * @see #unsetUseKind()
	 * @see #getUseKind()
	 * @see #setUseKind(StaticModelUseKind)
	 * @generated
	 */
	boolean isSetUseKind();

} // EntryPointBase
