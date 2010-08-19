/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Code Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows referencing a code from a code system when the vocabulary model can be inferred from the the model associated with the referencing artifact.
 * UML: Code stereotype on ModelElement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodePrintName <em>Code Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystemVersion <em>Code System Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef()
 * @model extendedMetaData="name='VocabularyCodeRef' kind='elementOnly'"
 * @generated
 */
public interface VocabularyCodeRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies qualifiers that apply to the code being referenced
	 * UML: Complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyCodeRef> getQualifier();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique code or mnemonic from the CodeSystem
	 * UML: ModelElement.name for the code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_Code()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Code Print Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the code
	 * UML: Tag on ModelElement.name for the VocabularyValueSet
	 * Derive: Todo - derive by looking up the code in the code system in the vocabulary model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Print Name</em>' attribute.
	 * @see #setCodePrintName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_CodePrintName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='codePrintName'"
	 * @generated
	 */
	String getCodePrintName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodePrintName <em>Code Print Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Print Name</em>' attribute.
	 * @see #getCodePrintName()
	 * @generated
	 */
	void setCodePrintName(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the code system in which the code is defined
	 * UML: Package.name for the CodeSystem
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_CodeSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='codeSystem'"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the code system in which the code is defined
	 * UML: Tag on ModelElement.name for the VocabularyValueSet
	 * Derive: Todo - derive by looking up the code system in the vocabulary model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_CodeSystemName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='codeSystemName'"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystemName <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the version of the code system containing the code being referenced was published.  Only relevant when interpretation of a code might change with version
	 * UML: Tag on ModelElement.name for the VocabularyValueSet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Version</em>' attribute.
	 * @see #setCodeSystemVersion(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyCodeRef_CodeSystemVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='codeSystemVersion'"
	 * @generated
	 */
	XMLGregorianCalendar getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef#getCodeSystemVersion <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Version</em>' attribute.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(XMLGregorianCalendar value);

} // VocabularyCodeRef
