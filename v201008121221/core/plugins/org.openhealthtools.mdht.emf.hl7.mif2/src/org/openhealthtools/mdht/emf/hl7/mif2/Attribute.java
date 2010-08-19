/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to Attribute
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getVocabulary <em>Vocabulary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getExtensionOID <em>Extension OID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#isIsImmutable <em>Is Immutable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModeDefault <em>Update Mode Default</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModesAllowed <em>Update Modes Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute()
 * @model extendedMetaData="name='Attribute' kind='elementOnly'"
 * @generated
 */
public interface Attribute extends StructuralFeature {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with an attribute.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AttributeAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AttributeAnnotations value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the corresponding attribute in a model from which the current model has been derived.  NOTE: When deriving from the RIM, reference the class in which the attribute is defined, not the class to which it is inherited
	 * UML: A derivationSupplier dependency associated with the attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the structure that may be used to convey the information in an attribute.
	 * UML: The 'type' association of the structural feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Vocabulary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the vocabulary constraints that apply to the attribute
	 * UML: A vocabularySupplier dependency associated with the attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary</em>' containment reference.
	 * @see #setVocabulary(VocabularySpecification)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_Vocabulary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vocabulary' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularySpecification getVocabulary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getVocabulary <em>Vocabulary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary</em>' containment reference.
	 * @see #getVocabulary()
	 * @generated
	 */
	void setVocabulary(VocabularySpecification value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates supplemental properties associated with the attribute
	 * UML: A tag on the Attribute class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Extension OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OID which is to act as a namespace for the extension element.  Should correspond to the OID for the conformance profile with which the extension element is associated
	 * UML: Corresponds to tag on Attribute and AssociationEnd
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension OID</em>' attribute.
	 * @see #setExtensionOID(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_ExtensionOID()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='extensionOID'"
	 * @generated
	 */
	String getExtensionOID();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getExtensionOID <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension OID</em>' attribute.
	 * @see #getExtensionOID()
	 * @generated
	 */
	void setExtensionOID(String value);

	/**
	 * Returns the value of the '<em><b>Is Immutable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the attribute is permitted to change after the object has been instantiated.  If true, changes are not permitted.  May also affect how the attribute appears in some ITSs.
	 * UML: Tag on Attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Immutable</em>' attribute.
	 * @see #isSetIsImmutable()
	 * @see #unsetIsImmutable()
	 * @see #setIsImmutable(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_IsImmutable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isImmutable'"
	 * @generated
	 */
	boolean isIsImmutable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#isIsImmutable <em>Is Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Immutable</em>' attribute.
	 * @see #isSetIsImmutable()
	 * @see #unsetIsImmutable()
	 * @see #isIsImmutable()
	 * @generated
	 */
	void setIsImmutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#isIsImmutable <em>Is Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsImmutable()
	 * @see #isIsImmutable()
	 * @see #setIsImmutable(boolean)
	 * @generated
	 */
	void unsetIsImmutable();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#isIsImmutable <em>Is Immutable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Immutable</em>' attribute is set.
	 * @see #unsetIsImmutable()
	 * @see #isIsImmutable()
	 * @see #setIsImmutable(boolean)
	 * @generated
	 */
	boolean isSetIsImmutable();

	/**
	 * Returns the value of the '<em><b>Maximum Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the maximum number of repetitions of this element that may occur within the containing element.
	 * UML: multiplicity (upper-bound)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Multiplicity</em>' attribute.
	 * @see #setMaximumMultiplicity(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_MaximumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UnlimitedInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='maximumMultiplicity'"
	 * @generated
	 */
	Object getMaximumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getMaximumMultiplicity <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Multiplicity</em>' attribute.
	 * @see #getMaximumMultiplicity()
	 * @generated
	 */
	void setMaximumMultiplicity(Object value);

	/**
	 * Returns the value of the '<em><b>Minimum Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the minimum number of repetitions of this element that may occur within the containing element.
	 * UML: multiplicity (lower-bound)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Multiplicity</em>' attribute.
	 * @see #setMinimumMultiplicity(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_MinimumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='minimumMultiplicity'"
	 * @generated
	 */
	BigInteger getMinimumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getMinimumMultiplicity <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Multiplicity</em>' attribute.
	 * @see #getMinimumMultiplicity()
	 * @generated
	 */
	void setMinimumMultiplicity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique formal name used to identify the attribute within the class and its ancestors.
	 * UML: Inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

	/**
	 * Returns the value of the '<em><b>Update Mode Default</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the update mode that should be assumed if no updateMode is specified.
	 * UML: tag from UpdateMode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Mode Default</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind
	 * @see #isSetUpdateModeDefault()
	 * @see #unsetUpdateModeDefault()
	 * @see #setUpdateModeDefault(UpdateModeKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_UpdateModeDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='updateModeDefault'"
	 * @generated
	 */
	UpdateModeKind getUpdateModeDefault();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModeDefault <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Mode Default</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind
	 * @see #isSetUpdateModeDefault()
	 * @see #unsetUpdateModeDefault()
	 * @see #getUpdateModeDefault()
	 * @generated
	 */
	void setUpdateModeDefault(UpdateModeKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModeDefault <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateModeDefault()
	 * @see #getUpdateModeDefault()
	 * @see #setUpdateModeDefault(UpdateModeKind)
	 * @generated
	 */
	void unsetUpdateModeDefault();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModeDefault <em>Update Mode Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Mode Default</em>' attribute is set.
	 * @see #unsetUpdateModeDefault()
	 * @see #getUpdateModeDefault()
	 * @see #setUpdateModeDefault(UpdateModeKind)
	 * @generated
	 */
	boolean isSetUpdateModeDefault();

	/**
	 * Returns the value of the '<em><b>Update Modes Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the list of update modes that may be used for this element.
	 * UML: tag from UpdateMode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Modes Allowed</em>' attribute.
	 * @see #setUpdateModesAllowed(List)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAttribute_UpdateModesAllowed()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeCodes" many="false"
	 *        extendedMetaData="kind='attribute' name='updateModesAllowed'"
	 * @generated
	 */
	List<UpdateModeKind> getUpdateModesAllowed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute#getUpdateModesAllowed <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Modes Allowed</em>' attribute.
	 * @see #getUpdateModesAllowed()
	 * @generated
	 */
	void setUpdateModesAllowed(List<UpdateModeKind> value);

} // Attribute
