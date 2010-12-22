/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a binding between a value set and a concept domain for resolution based on the realm-based context of the instance.
 * UML: Stereotype on dependency
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingPriority <em>Binding Priority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingRealmName <em>Binding Realm Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getCodingStrength <em>Coding Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getIgnoredValueSet <em>Ignored Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getMinimumValueSet <em>Minimum Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getVersionTime <em>Version Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding()
 * @model extendedMetaData="name='ContextBinding' kind='elementOnly'"
 * @generated
 */
public interface ContextBinding extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Binding Priority</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the relative preference for the coding system within the context.  Lower numbers indicate higher preference.  Implementors are strongly encouraged to use the 'most preferred' coding system.
	 * UML: Tag on a the RuntimeBinding dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Priority</em>' attribute.
	 * @see #isSetBindingPriority()
	 * @see #unsetBindingPriority()
	 * @see #setBindingPriority(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_BindingPriority()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='bindingPriority'"
	 * @generated
	 */
	BigInteger getBindingPriority();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingPriority <em>Binding Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Priority</em>' attribute.
	 * @see #isSetBindingPriority()
	 * @see #unsetBindingPriority()
	 * @see #getBindingPriority()
	 * @generated
	 */
	void setBindingPriority(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingPriority <em>Binding Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindingPriority()
	 * @see #getBindingPriority()
	 * @see #setBindingPriority(BigInteger)
	 * @generated
	 */
	void unsetBindingPriority();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingPriority <em>Binding Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Binding Priority</em>' attribute is set.
	 * @see #unsetBindingPriority()
	 * @see #getBindingPriority()
	 * @see #setBindingPriority(BigInteger)
	 * @generated
	 */
	boolean isSetBindingPriority();

	/**
	 * Returns the value of the '<em><b>Binding Realm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the binding realm in whose context the binding is occurring
	 * UML: Reference to an Enumeration Item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Realm Name</em>' attribute.
	 * @see #setBindingRealmName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_BindingRealmName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='bindingRealmName'"
	 * @generated
	 */
	String getBindingRealmName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getBindingRealmName <em>Binding Realm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Realm Name</em>' attribute.
	 * @see #getBindingRealmName()
	 * @generated
	 */
	void setBindingRealmName(String value);

	/**
	 * Returns the value of the '<em><b>Coding Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether codes are restricted to those expressed in the value set or not
	 * UML: Tag on a the RuntimeBinding dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coding Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind
	 * @see #isSetCodingStrength()
	 * @see #unsetCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_CodingStrength()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='codingStrength'"
	 * @generated
	 */
	CodingStrengthKind getCodingStrength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getCodingStrength <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding Strength</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind
	 * @see #isSetCodingStrength()
	 * @see #unsetCodingStrength()
	 * @see #getCodingStrength()
	 * @generated
	 */
	void setCodingStrength(CodingStrengthKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getCodingStrength <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodingStrength()
	 * @see #getCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @generated
	 */
	void unsetCodingStrength();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getCodingStrength <em>Coding Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coding Strength</em>' attribute is set.
	 * @see #unsetCodingStrength()
	 * @see #getCodingStrength()
	 * @see #setCodingStrength(CodingStrengthKind)
	 * @generated
	 */
	boolean isSetCodingStrength();

	/**
	 * Returns the value of the '<em><b>Concept Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the concept domain being bound to
	 * UML: Reference to a ModelElement that is the client of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Domain</em>' attribute.
	 * @see #setConceptDomain(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_ConceptDomain()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='conceptDomain'"
	 * @generated
	 */
	String getConceptDomain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getConceptDomain <em>Concept Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Domain</em>' attribute.
	 * @see #getConceptDomain()
	 * @generated
	 */
	void setConceptDomain(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when this particular binding first takes effect
	 * UML: Tag on the RuntimeBinding dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_EffectiveDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='effectiveDate'"
	 * @generated
	 */
	XMLGregorianCalendar getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date on which this binding is no longer effective.  (This will generally be the same as the effectiveDate of a new replacement binding)
	 * UML: Tag on the RuntimeBinding dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_ExpiryDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='expiryDate'"
	 * @generated
	 */
	XMLGregorianCalendar getExpiryDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Ignored Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of codes within the overall valueset that the implementer is willing to accept without raising an error, but whose content will be ignored and not processed in any useful manner
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignored Value Set</em>' attribute.
	 * @see #setIgnoredValueSet(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_IgnoredValueSet()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='ignoredValueSet'"
	 * @generated
	 */
	String getIgnoredValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getIgnoredValueSet <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignored Value Set</em>' attribute.
	 * @see #getIgnoredValueSet()
	 * @generated
	 */
	void setIgnoredValueSet(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of codes within the overall value set that must be supported by an implementer to be considered compliant
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Value Set</em>' attribute.
	 * @see #setMinimumValueSet(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_MinimumValueSet()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='minimumValueSet'"
	 * @generated
	 */
	String getMinimumValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getMinimumValueSet <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value Set</em>' attribute.
	 * @see #getMinimumValueSet()
	 * @generated
	 */
	void setMinimumValueSet(String value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the overall value set being bound to the concept domain.  This defines the overall set of codes that are available for use, though not all might necessarily be supported.
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' attribute.
	 * @see #setValueSet(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_ValueSet()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid" required="true"
	 *        extendedMetaData="kind='attribute' name='valueSet'"
	 * @generated
	 */
	String getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getValueSet <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' attribute.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(String value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the specific version of the value set being bound.  If missing, this is a dynamic binding.  If present, this is a static binding.
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Date</em>' attribute.
	 * @see #setVersionDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_VersionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='versionDate'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getVersionDate <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' attribute.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Version Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplements the versionDate to distingish value set versions where multiples occur on a single date
	 * UML: Reference to a Package that is the supplier of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Time</em>' attribute.
	 * @see #setVersionTime(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getContextBinding_VersionTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='attribute' name='versionTime'"
	 * @generated
	 */
	XMLGregorianCalendar getVersionTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding#getVersionTime <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Time</em>' attribute.
	 * @see #getVersionTime()
	 * @generated
	 */
	void setVersionTime(XMLGregorianCalendar value);

} // ContextBinding
