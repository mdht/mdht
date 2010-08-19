/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a code system or code system supplement
 * UML: A stereotype of Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getPropertyGroup <em>Property Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getApproxCodeCount <em>Approx Code Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getCodeSystemId <em>Code System Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasHomonymy <em>Has Homonymy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasSynonymy <em>Has Synonymy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsCaseSensitive <em>Is Case Sensitive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsWhitespaceSensitive <em>Is Whitespace Sensitive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getPrimaryLanguage <em>Primary Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getPrimaryRealm <em>Primary Realm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase()
 * @model abstract="true"
 *        extendedMetaData="name='CodeSystemBase' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemBase extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General metadata information about the package
	 * UML: complex tag value on Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the code system.
	 * UML: A collector for the comments and constraints associated with a code system.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(CodeSystemAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(CodeSystemAnnotations value);

	/**
	 * Returns the value of the '<em><b>Property Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a group of properties and their values that commonly appear together to simplify serialization of code systems by minimizing repetition of property values
	 * UML: N/A.  Purely a serialization shortcut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_PropertyGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyGroup> getPropertyGroup();

	/**
	 * Returns the value of the '<em><b>Approx Code Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimate (order of magnitude only) of the number of codes in a code system.  Used for quick determination of how best to display or navigate the codes.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approx Code Count</em>' attribute.
	 * @see #setApproxCodeCount(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_ApproxCodeCount()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='approxCodeCount'"
	 * @generated
	 */
	BigInteger getApproxCodeCount();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getApproxCodeCount <em>Approx Code Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approx Code Count</em>' attribute.
	 * @see #getApproxCodeCount()
	 * @generated
	 */
	void setApproxCodeCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Code System Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique OID by which the code system is identified within HL7 message instances
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Id</em>' attribute.
	 * @see #setCodeSystemId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_CodeSystemId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid" required="true"
	 *        extendedMetaData="kind='attribute' name='codeSystemId'"
	 * @generated
	 */
	String getCodeSystemId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getCodeSystemId <em>Code System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Id</em>' attribute.
	 * @see #getCodeSystemId()
	 * @generated
	 */
	void setCodeSystemId(String value);

	/**
	 * Returns the value of the '<em><b>Has Homonymy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that some codes exist for more than one concept.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Homonymy</em>' attribute.
	 * @see #isSetHasHomonymy()
	 * @see #unsetHasHomonymy()
	 * @see #setHasHomonymy(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_HasHomonymy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='hasHomonymy'"
	 * @generated
	 */
	boolean isHasHomonymy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasHomonymy <em>Has Homonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Homonymy</em>' attribute.
	 * @see #isSetHasHomonymy()
	 * @see #unsetHasHomonymy()
	 * @see #isHasHomonymy()
	 * @generated
	 */
	void setHasHomonymy(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasHomonymy <em>Has Homonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasHomonymy()
	 * @see #isHasHomonymy()
	 * @see #setHasHomonymy(boolean)
	 * @generated
	 */
	void unsetHasHomonymy();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasHomonymy <em>Has Homonymy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Homonymy</em>' attribute is set.
	 * @see #unsetHasHomonymy()
	 * @see #isHasHomonymy()
	 * @see #setHasHomonymy(boolean)
	 * @generated
	 */
	boolean isSetHasHomonymy();

	/**
	 * Returns the value of the '<em><b>Has Synonymy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that some concepts have more than one code.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Synonymy</em>' attribute.
	 * @see #isSetHasSynonymy()
	 * @see #unsetHasSynonymy()
	 * @see #setHasSynonymy(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_HasSynonymy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='hasSynonymy'"
	 * @generated
	 */
	boolean isHasSynonymy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasSynonymy <em>Has Synonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Synonymy</em>' attribute.
	 * @see #isSetHasSynonymy()
	 * @see #unsetHasSynonymy()
	 * @see #isHasSynonymy()
	 * @generated
	 */
	void setHasSynonymy(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasSynonymy <em>Has Synonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasSynonymy()
	 * @see #isHasSynonymy()
	 * @see #setHasSynonymy(boolean)
	 * @generated
	 */
	void unsetHasSynonymy();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isHasSynonymy <em>Has Synonymy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Synonymy</em>' attribute is set.
	 * @see #unsetHasSynonymy()
	 * @see #isHasSynonymy()
	 * @see #setHasSynonymy(boolean)
	 * @generated
	 */
	boolean isSetHasSynonymy();

	/**
	 * Returns the value of the '<em><b>Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, indicates comparisons to codes are independent of whether characters are upper-case or lower-case.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Case Sensitive</em>' attribute.
	 * @see #isSetIsCaseSensitive()
	 * @see #unsetIsCaseSensitive()
	 * @see #setIsCaseSensitive(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_IsCaseSensitive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isCaseSensitive'"
	 * @generated
	 */
	boolean isIsCaseSensitive();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsCaseSensitive <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Case Sensitive</em>' attribute.
	 * @see #isSetIsCaseSensitive()
	 * @see #unsetIsCaseSensitive()
	 * @see #isIsCaseSensitive()
	 * @generated
	 */
	void setIsCaseSensitive(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsCaseSensitive <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCaseSensitive()
	 * @see #isIsCaseSensitive()
	 * @see #setIsCaseSensitive(boolean)
	 * @generated
	 */
	void unsetIsCaseSensitive();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsCaseSensitive <em>Is Case Sensitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Case Sensitive</em>' attribute is set.
	 * @see #unsetIsCaseSensitive()
	 * @see #isIsCaseSensitive()
	 * @see #setIsCaseSensitive(boolean)
	 * @generated
	 */
	boolean isSetIsCaseSensitive();

	/**
	 * Returns the value of the '<em><b>Is Whitespace Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, indicates that whitespace may be ignored when comparing codes.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Whitespace Sensitive</em>' attribute.
	 * @see #isSetIsWhitespaceSensitive()
	 * @see #unsetIsWhitespaceSensitive()
	 * @see #setIsWhitespaceSensitive(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_IsWhitespaceSensitive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isWhitespaceSensitive'"
	 * @generated
	 */
	boolean isIsWhitespaceSensitive();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsWhitespaceSensitive <em>Is Whitespace Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Whitespace Sensitive</em>' attribute.
	 * @see #isSetIsWhitespaceSensitive()
	 * @see #unsetIsWhitespaceSensitive()
	 * @see #isIsWhitespaceSensitive()
	 * @generated
	 */
	void setIsWhitespaceSensitive(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsWhitespaceSensitive <em>Is Whitespace Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsWhitespaceSensitive()
	 * @see #isIsWhitespaceSensitive()
	 * @see #setIsWhitespaceSensitive(boolean)
	 * @generated
	 */
	void unsetIsWhitespaceSensitive();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#isIsWhitespaceSensitive <em>Is Whitespace Sensitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Whitespace Sensitive</em>' attribute is set.
	 * @see #unsetIsWhitespaceSensitive()
	 * @see #isIsWhitespaceSensitive()
	 * @see #setIsWhitespaceSensitive(boolean)
	 * @generated
	 */
	boolean isSetIsWhitespaceSensitive();

	/**
	 * Returns the value of the '<em><b>Primary Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language in which the code system is primarily maintained.  This is the language from which other values were translated.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Language</em>' attribute.
	 * @see #setPrimaryLanguage(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_PrimaryLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='primaryLanguage'"
	 * @generated
	 */
	String getPrimaryLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getPrimaryLanguage <em>Primary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Language</em>' attribute.
	 * @see #getPrimaryLanguage()
	 * @generated
	 */
	void setPrimaryLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Primary Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The realm in which the code system is primarily maintained.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Realm</em>' attribute.
	 * @see #setPrimaryRealm(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_PrimaryRealm()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.RealmKind"
	 *        extendedMetaData="kind='attribute' name='primaryRealm'"
	 * @generated
	 */
	Object getPrimaryRealm();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getPrimaryRealm <em>Primary Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Realm</em>' attribute.
	 * @see #getPrimaryRealm()
	 * @generated
	 */
	void setPrimaryRealm(Object value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the package in circumstances where the 'name' is more of an identifier.
	 * UML: title tag on Package stereotype
	 * DublinCore: Equivalent to 'title'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemBase_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // CodeSystemBase
