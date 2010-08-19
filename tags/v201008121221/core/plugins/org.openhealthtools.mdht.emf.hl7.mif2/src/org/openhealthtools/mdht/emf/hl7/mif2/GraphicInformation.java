/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Forms the bridge between the UML semantic content and it's diagramatic representation
 * UML: Represents the UML1GraphicInformation class from Data Interchange specification.  Have merged it with GraphicInformation for convenience.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphicInformation#getSemanticLinkId <em>Semantic Link Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphicInformation()
 * @model abstract="true"
 *        extendedMetaData="name='GraphicInformation' kind='empty'"
 * @generated
 */
public interface GraphicInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the specific model element being rendered by its graphicLinkId attribute.
	 * UML: manifestation of the linkage between UML1GraphicInformation and the associated ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Link Id</em>' attribute.
	 * @see #setSemanticLinkId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGraphicInformation_SemanticLinkId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid" required="true"
	 *        extendedMetaData="kind='attribute' name='semanticLinkId'"
	 * @generated
	 */
	String getSemanticLinkId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphicInformation#getSemanticLinkId <em>Semantic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Link Id</em>' attribute.
	 * @see #getSemanticLinkId()
	 * @generated
	 */
	void setSemanticLinkId(String value);

} // GraphicInformation
