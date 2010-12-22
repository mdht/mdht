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
 * A representation of the model object '<em><b>Vocabulary Limitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a vocabulary domain, code-system or value-set which is not fully supported, along with a different domain, code-system or value-set which should be interpretted in its place.
 * UML: Complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getDefinedVocabularyElement <em>Defined Vocabulary Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getSubstituteVocabularyElement <em>Substitute Vocabulary Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getMinimumUpdateTime <em>Minimum Update Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyLimitation()
 * @model extendedMetaData="name='VocabularyLimitation' kind='elementOnly'"
 * @generated
 */
public interface VocabularyLimitation extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined Vocabulary Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the domain, code-system or value-set that is not fully supported
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Vocabulary Element</em>' containment reference.
	 * @see #setDefinedVocabularyElement(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyLimitation_DefinedVocabularyElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definedVocabularyElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getDefinedVocabularyElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getDefinedVocabularyElement <em>Defined Vocabulary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Vocabulary Element</em>' containment reference.
	 * @see #getDefinedVocabularyElement()
	 * @generated
	 */
	void setDefinedVocabularyElement(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Substitute Vocabulary Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the domain, code-system or value-set that should be interpretted in place of the non-supported vocabulary element
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitute Vocabulary Element</em>' containment reference.
	 * @see #setSubstituteVocabularyElement(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyLimitation_SubstituteVocabularyElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substituteVocabularyElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getSubstituteVocabularyElement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getSubstituteVocabularyElement <em>Substitute Vocabulary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute Vocabulary Element</em>' containment reference.
	 * @see #getSubstituteVocabularyElement()
	 * @generated
	 */
	void setSubstituteVocabularyElement(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Minimum Update Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum amount of time that may elapse between a change in the contents of the specified domain, code-system or value-set and the time the system is expected to reflect the change (by accepting and being able to send new codes and not sending deprecated ones).
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Update Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetMinimumUpdateTime()
	 * @see #unsetMinimumUpdateTime()
	 * @see #setMinimumUpdateTime(DurationUnitsKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyLimitation_MinimumUpdateTime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='minimumUpdateTime'"
	 * @generated
	 */
	DurationUnitsKind getMinimumUpdateTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getMinimumUpdateTime <em>Minimum Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Update Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetMinimumUpdateTime()
	 * @see #unsetMinimumUpdateTime()
	 * @see #getMinimumUpdateTime()
	 * @generated
	 */
	void setMinimumUpdateTime(DurationUnitsKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getMinimumUpdateTime <em>Minimum Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumUpdateTime()
	 * @see #getMinimumUpdateTime()
	 * @see #setMinimumUpdateTime(DurationUnitsKind)
	 * @generated
	 */
	void unsetMinimumUpdateTime();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation#getMinimumUpdateTime <em>Minimum Update Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Update Time</em>' attribute is set.
	 * @see #unsetMinimumUpdateTime()
	 * @see #getMinimumUpdateTime()
	 * @see #setMinimumUpdateTime(DurationUnitsKind)
	 * @generated
	 */
	boolean isSetMinimumUpdateTime();

} // VocabularyLimitation
