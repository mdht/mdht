/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An augmented rendering of a set of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Associations </i>where the linkage between subject
 * and target nodes has been normalized for easier traversal.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getFocusEntity <em>Focus Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getEntry <em>Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDepth <em>Expansion Depth</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection <em>Expansion Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus <em>Graph Focus</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph()
 * @model extendedMetaData="name='AssociationGraph' kind='elementOnly'"
 * @generated
 */
public interface AssociationGraph extends Directory {
	/**
	 * Returns the value of the '<em><b>Focus Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus Entity</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Focus Entity</em>' containment reference.
	 * @see #setFocusEntity(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph_FocusEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focusEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getFocusEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getFocusEntity <em>Focus Entity</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Focus Entity</em>' containment reference.
	 * @see #getFocusEntity()
	 * @generated
	 */
	void setFocusEntity(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.association.GraphNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GraphNode> getEntry();

	/**
	 * Returns the value of the '<em><b>Expansion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expansion Depth</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expansion Depth</em>' attribute.
	 * @see #setExpansionDepth(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph_ExpansionDepth()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NaturalNumber"
	 *        extendedMetaData="kind='attribute' name='expansionDepth'"
	 * @generated
	 */
	BigInteger getExpansionDepth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDepth <em>Expansion Depth</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expansion Depth</em>' attribute.
	 * @see #getExpansionDepth()
	 * @generated
	 */
	void setExpansionDepth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Expansion Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.association.GraphDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expansion Direction</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expansion Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @see #isSetExpansionDirection()
	 * @see #unsetExpansionDirection()
	 * @see #setExpansionDirection(GraphDirection)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph_ExpansionDirection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='expansionDirection'"
	 * @generated
	 */
	GraphDirection getExpansionDirection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection <em>Expansion Direction</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expansion Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.GraphDirection
	 * @see #isSetExpansionDirection()
	 * @see #unsetExpansionDirection()
	 * @see #getExpansionDirection()
	 * @generated
	 */
	void setExpansionDirection(GraphDirection value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection <em>Expansion Direction</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetExpansionDirection()
	 * @see #getExpansionDirection()
	 * @see #setExpansionDirection(GraphDirection)
	 * @generated
	 */
	void unsetExpansionDirection();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getExpansionDirection
	 * <em>Expansion Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Expansion Direction</em>' attribute is set.
	 * @see #unsetExpansionDirection()
	 * @see #getExpansionDirection()
	 * @see #setExpansionDirection(GraphDirection)
	 * @generated
	 */
	boolean isSetExpansionDirection();

	/**
	 * Returns the value of the '<em><b>Graph Focus</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.association.GraphFocus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Focus</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph Focus</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @see #isSetGraphFocus()
	 * @see #unsetGraphFocus()
	 * @see #setGraphFocus(GraphFocus)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationGraph_GraphFocus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='graphFocus'"
	 * @generated
	 */
	GraphFocus getGraphFocus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus <em>Graph Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Graph Focus</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.GraphFocus
	 * @see #isSetGraphFocus()
	 * @see #unsetGraphFocus()
	 * @see #getGraphFocus()
	 * @generated
	 */
	void setGraphFocus(GraphFocus value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus <em>Graph Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetGraphFocus()
	 * @see #getGraphFocus()
	 * @see #setGraphFocus(GraphFocus)
	 * @generated
	 */
	void unsetGraphFocus();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationGraph#getGraphFocus <em>Graph Focus</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Graph Focus</em>' attribute is set.
	 * @see #unsetGraphFocus()
	 * @see #getGraphFocus()
	 * @see #setGraphFocus(GraphFocus)
	 * @generated
	 */
	boolean isSetGraphFocus();

} // AssociationGraph
