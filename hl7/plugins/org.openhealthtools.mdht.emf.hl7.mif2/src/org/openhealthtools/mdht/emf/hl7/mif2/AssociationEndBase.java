/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to AssociationEnd
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getChoiceItem <em>Choice Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getExtensionOID <em>Extension OID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMaximumRecursionDepth <em>Maximum Recursion Depth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isNameLocked <em>Name Locked</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isReferenceHistory <em>Reference History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModeDefault <em>Update Mode Default</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModesAllowed <em>Update Modes Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase()
 * @model extendedMetaData="name='AssociationEndBase' kind='elementOnly'"
 * @generated
 */
public interface AssociationEndBase extends Relationship {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_BusinessName()
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
	 * UML: A collector for the comments and constraints associated with a association end.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AssociationEndAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationEndAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AssociationEndAnnotations value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the corresponding association in a model from which the current model has been derived.  NOTE: When deriving from the RIM, reference the class in which the association is defined, not the class to which it is inherited
	 * UML: derivationSupplier dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationEndDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Choice Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For association ends pointing to CMETs whose root is a choice, identifies the classes within the choice and the association names tied to those classes.
	 * UML: Identifies classes that specialize the paricipant class for this association end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice Item</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_ChoiceItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choiceItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationEndSpecialization> getChoiceItem();

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the element must be supported by implementors or not.  If not present, indicates that support is optional.
	 * UML: Tag value on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #setConformance(ConformanceKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_Conformance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	ConformanceKind getConformance();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(ConformanceKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	void unsetConformance();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getConformance <em>Conformance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformance</em>' attribute is set.
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	boolean isSetConformance();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_ExtensionOID()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='extensionOID'"
	 * @generated
	 */
	String getExtensionOID();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getExtensionOID <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension OID</em>' attribute.
	 * @see #getExtensionOID()
	 * @generated
	 */
	void setExtensionOID(String value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, null values may not be sent for this element.
	 * UML: Tag value on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_IsMandatory()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isMandatory'"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	void unsetIsMandatory();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isIsMandatory <em>Is Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Mandatory</em>' attribute is set.
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	boolean isSetIsMandatory();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_MaximumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UnlimitedInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='maximumMultiplicity'"
	 * @generated
	 */
	Object getMaximumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMaximumMultiplicity <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Multiplicity</em>' attribute.
	 * @see #getMaximumMultiplicity()
	 * @generated
	 */
	void setMaximumMultiplicity(Object value);

	/**
	 * Returns the value of the '<em><b>Maximum Recursion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum number of times the class may appear in the a descendant hierarchy.  Used to place physical limits on the recursive depth applications must cope with.
	 * UML: Tag on HL7AssociationEnd stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Recursion Depth</em>' attribute.
	 * @see #setMaximumRecursionDepth(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_MaximumRecursionDepth()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maximumRecursionDepth'"
	 * @generated
	 */
	BigInteger getMaximumRecursionDepth();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMaximumRecursionDepth <em>Maximum Recursion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Recursion Depth</em>' attribute.
	 * @see #getMaximumRecursionDepth()
	 * @generated
	 */
	void setMaximumRecursionDepth(BigInteger value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_MinimumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='minimumMultiplicity'"
	 * @generated
	 */
	BigInteger getMinimumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getMinimumMultiplicity <em>Minimum Multiplicity</em>}' attribute.
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
	 * The unique formal name for the association.
	 * UML: Inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the name should not be changed when the renaming algorithm is run.
	 * UML: Tag on HL7AssociationEnd stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Locked</em>' attribute.
	 * @see #isSetNameLocked()
	 * @see #unsetNameLocked()
	 * @see #setNameLocked(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_NameLocked()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nameLocked'"
	 * @generated
	 */
	boolean isNameLocked();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isNameLocked <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Locked</em>' attribute.
	 * @see #isSetNameLocked()
	 * @see #unsetNameLocked()
	 * @see #isNameLocked()
	 * @generated
	 */
	void setNameLocked(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isNameLocked <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameLocked()
	 * @see #isNameLocked()
	 * @see #setNameLocked(boolean)
	 * @generated
	 */
	void unsetNameLocked();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isNameLocked <em>Name Locked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Locked</em>' attribute is set.
	 * @see #unsetNameLocked()
	 * @see #isNameLocked()
	 * @see #setNameLocked(boolean)
	 * @generated
	 */
	boolean isSetNameLocked();

	/**
	 * Returns the value of the '<em><b>Reference History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the element can include a reference to its history LLOYD DEFINTION SHOULD TO THE HIST PARAMETERIZED TYPE _ TALK TO GRIEVE
	 * Deprecated: Simply use HIST_X as your type.  This will be supported in Datatypes R2.
	 * UML: tag from UpdateMode stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference History</em>' attribute.
	 * @see #isSetReferenceHistory()
	 * @see #unsetReferenceHistory()
	 * @see #setReferenceHistory(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_ReferenceHistory()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='referenceHistory'"
	 * @generated
	 */
	boolean isReferenceHistory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isReferenceHistory <em>Reference History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference History</em>' attribute.
	 * @see #isSetReferenceHistory()
	 * @see #unsetReferenceHistory()
	 * @see #isReferenceHistory()
	 * @generated
	 */
	void setReferenceHistory(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isReferenceHistory <em>Reference History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceHistory()
	 * @see #isReferenceHistory()
	 * @see #setReferenceHistory(boolean)
	 * @generated
	 */
	void unsetReferenceHistory();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#isReferenceHistory <em>Reference History</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference History</em>' attribute is set.
	 * @see #unsetReferenceHistory()
	 * @see #isReferenceHistory()
	 * @see #setReferenceHistory(boolean)
	 * @generated
	 */
	boolean isSetReferenceHistory();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getSortKey <em>Sort Key</em>}' attribute.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_UpdateModeDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='updateModeDefault'"
	 * @generated
	 */
	UpdateModeKind getUpdateModeDefault();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModeDefault <em>Update Mode Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModeDefault <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateModeDefault()
	 * @see #getUpdateModeDefault()
	 * @see #setUpdateModeDefault(UpdateModeKind)
	 * @generated
	 */
	void unsetUpdateModeDefault();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModeDefault <em>Update Mode Default</em>}' attribute is set.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndBase_UpdateModesAllowed()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeCodes" many="false"
	 *        extendedMetaData="kind='attribute' name='updateModesAllowed'"
	 * @generated
	 */
	List<UpdateModeKind> getUpdateModesAllowed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase#getUpdateModesAllowed <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Modes Allowed</em>' attribute.
	 * @see #getUpdateModesAllowed()
	 * @generated
	 */
	void setUpdateModesAllowed(List<UpdateModeKind> value);

} // AssociationEndBase
