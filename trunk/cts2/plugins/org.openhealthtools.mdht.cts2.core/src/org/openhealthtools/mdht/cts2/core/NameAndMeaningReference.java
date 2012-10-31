/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name And Meaning Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">NameAndMeaningReference</i> consists of a local identifier that references a unique meaning
 * within the context of a given domain in a CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service instance and a globally unique
 * URI that
 * identifies the intended meaning of the identifier.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getHref <em>Href</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNameAndMeaningReference()
 * @model extendedMetaData="name='NameAndMeaningReference' kind='simple'"
 * @generated
 */
public interface NameAndMeaningReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNameAndMeaningReference_Value()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">RenderingURI</i> that, when dereferenced, results in a CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> compliant representation of the meaning of the given <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">NameAndMeaningReference</i>. This must be present if the
	 * implementing CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service is aware of a CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> resource that carries the definition.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNameAndMeaningReference_Href()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ExternalURI</i> that references the meaning of a <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">name</i>. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Meaning</i> is optional only
	 * because the meaning of some of the elements have not been fully specified in some legacy
	 * terminology resources. If <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">meaning</i> is not supplied, the intent of a reference cannot be
	 * shared among services or between other resources.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getNameAndMeaningReference_Uri()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // NameAndMeaningReference
