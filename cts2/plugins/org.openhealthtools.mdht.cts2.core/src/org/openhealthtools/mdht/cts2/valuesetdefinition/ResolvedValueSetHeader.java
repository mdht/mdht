/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Value Set Header</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The information required to completely resolve a value set definition.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolutionOf <em>Resolution Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolvedUsingCodeSystem <em>Resolved Using Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getIncludesResolvedValueSet <em>Includes Resolved Value Set
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetHeader()
 * @model extendedMetaData="name='ResolvedValueSetHeader' kind='elementOnly'"
 * @generated
 */
public interface ResolvedValueSetHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Resolution Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the specific value set definition that was resolved
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resolution Of</em>' containment reference.
	 * @see #setResolutionOf(ValueSetDefinitionReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetHeader_ResolutionOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resolutionOf' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetDefinitionReference getResolutionOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader#getResolutionOf <em>Resolution Of</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolution Of</em>' containment reference.
	 * @see #getResolutionOf()
	 * @generated
	 */
	void setResolutionOf(ValueSetDefinitionReference value);

	/**
	 * Returns the value of the '<em><b>Resolved Using Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a code system version that was used in the resolution of this value set definition
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resolved Using Code System</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetHeader_ResolvedUsingCodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolvedUsingCodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemVersionReference> getResolvedUsingCodeSystem();

	/**
	 * Returns the value of the '<em><b>Includes Resolved Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value set includes other value sets, this contains the resolution information used to resolve the inner value sets.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Includes Resolved Value Set</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetHeader_IncludesResolvedValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includesResolvedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResolvedValueSetHeader> getIncludesResolvedValueSet();

} // ResolvedValueSetHeader
