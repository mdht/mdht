/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatement <em>Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementDirectory <em>Statement Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementList <em>Statement List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementMsg <em>Statement Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assertion about a CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">2</sub> model element.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_Statement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Statement' namespace='##targetNamespace'"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Statement Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Directory</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Statement Directory</em>' containment reference.
	 * @see #setStatementDirectory(StatementDirectory)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_StatementDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatementDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementDirectory getStatementDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementDirectory <em>Statement Directory</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement Directory</em>' containment reference.
	 * @see #getStatementDirectory()
	 * @generated
	 */
	void setStatementDirectory(StatementDirectory value);

	/**
	 * Returns the value of the '<em><b>Statement List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement List</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Statement List</em>' containment reference.
	 * @see #setStatementList(StatementList)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_StatementList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatementList' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementList getStatementList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementList <em>Statement List</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement List</em>' containment reference.
	 * @see #getStatementList()
	 * @generated
	 */
	void setStatementList(StatementList value);

	/**
	 * Returns the value of the '<em><b>Statement Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Msg</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Statement Msg</em>' containment reference.
	 * @see #setStatementMsg(StatementMsg)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getDocumentRoot_StatementMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatementMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementMsg getStatementMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.DocumentRoot#getStatementMsg <em>Statement Msg</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement Msg</em>' containment reference.
	 * @see #getStatementMsg()
	 * @generated
	 */
	void setStatementMsg(StatementMsg value);

} // DocumentRoot
