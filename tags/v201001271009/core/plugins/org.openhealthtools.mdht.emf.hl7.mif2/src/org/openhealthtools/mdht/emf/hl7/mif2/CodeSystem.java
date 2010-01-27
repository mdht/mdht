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
 * A representation of the model object '<em><b>Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a code system that has been registered for potential use by HL7
 * UML: A stereotype of Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem#getReleasedVersion <em>Released Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystem()
 * @model extendedMetaData="name='CodeSystem' kind='elementOnly'"
 * @generated
 */
public interface CodeSystem extends CodeSystemBase {
	/**
	 * Returns the value of the '<em><b>Released Version</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a particular release associated with the code system.
	 * UML: A package contained within the current package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Released Version</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystem_ReleasedVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='releasedVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemVersion> getReleasedVersion();

} // CodeSystem
