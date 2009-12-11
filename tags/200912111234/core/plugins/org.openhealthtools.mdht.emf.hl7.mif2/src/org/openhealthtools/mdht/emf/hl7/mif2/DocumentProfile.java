/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes how a particular document is used or should be used by a system.
 * UML: A stereotype on package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getDocument <em>Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getEffectiveStaticModel <em>Effective Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getProfileType <em>Profile Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile()
 * @model extendedMetaData="name='DocumentProfile' kind='elementOnly'"
 * @generated
 */
public interface DocumentProfile extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the document profile.
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(DocumentProfileAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentProfileAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(DocumentProfileAnnotations value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the interaction being profiled
	 * UML: The operation the profile is constraining
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile_Document()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Implementation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies general restrictions on the ability to support HL7 elements including realms, datatypes, vocabulary, ITSs, etc.  Any specified here override those specified at the conformance profile level.
	 * UML: Tag on DocumentProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #setImplementationConstraints(ImplementationConstraints)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile_ImplementationConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementationConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationConstraints getImplementationConstraints();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getImplementationConstraints <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #getImplementationConstraints()
	 * @generated
	 */
	void setImplementationConstraints(ImplementationConstraints value);

	/**
	 * Returns the value of the '<em><b>Effective Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shows the static model fully expanded including the contents of all models bound to stubs, expanding CMETs, etc.
	 * UML: The type for the parameter
	 * Derive: Fully unroll the static model, substituting all datatype and vocabulary substitutions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Static Model</em>' containment reference.
	 * @see #setEffectiveStaticModel(SerializedStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile_EffectiveStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='effectiveStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedStaticModel getEffectiveStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getEffectiveStaticModel <em>Effective Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Static Model</em>' containment reference.
	 * @see #getEffectiveStaticModel()
	 * @generated
	 */
	void setEffectiveStaticModel(SerializedStaticModel value);

	/**
	 * Returns the value of the '<em><b>Profile Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the profile relates to received documents, created documents or both
	 * UML Tag on DocumentProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileKind
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #setProfileType(DocumentProfileKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentProfile_ProfileType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='profileType'"
	 * @generated
	 */
	DocumentProfileKind getProfileType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileKind
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @generated
	 */
	void setProfileType(DocumentProfileKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(DocumentProfileKind)
	 * @generated
	 */
	void unsetProfileType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile#getProfileType <em>Profile Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Type</em>' attribute is set.
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(DocumentProfileKind)
	 * @generated
	 */
	boolean isSetProfileType();

} // DocumentProfile
