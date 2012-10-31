/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A collection of one or more filters. The result of applying a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Filter</i> component is the <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">intersection</i> of the sets of qualifying elements. As an example, a filter having two components
 * - one which
 * says that the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">rights</i> attribute must exist and a second that says that the text "SNOMED"
 * must appear in the synopsis would return all resources having BOTH a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">rights</i> attribute and
 * "SNOMED" in the
 * description.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Filter#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFilter()
 * @model extendedMetaData="name='Filter' kind='elementOnly'"
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.FilterComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFilter_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterComponent> getComponent();

} // Filter
