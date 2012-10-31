/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Value Set Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A reference to a value set that, when resolved, results in a set of entity references that are included in this entry. An entry of this type can
 * just name a value set, meaning that the specific definition is
 * determined in the resolve value set call, can name both a value set and value set definition, meaning that the specific definition is always used
 * in the resolution. It can also specify one or more code system versions to be
 * used in the resolution of the named value set.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSet <em>Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getReferenceCodeSystemVersion <em>Reference Code System
 * Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteValueSetReference()
 * @model extendedMetaData="name='CompleteValueSetReference' kind='elementOnly'"
 * @generated
 */
public interface CompleteValueSetReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the value set whose definition supplies a set of entity references.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteValueSetReference_ValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetReference getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSet <em>Value Set</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSetReference value);

	/**
	 * Returns the value of the '<em><b>Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a particular definition of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">valueSet</i> that is to be used in
	 * resolving this reference. If absent, the specific definition is determined by the resolve value set call. If present,
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">valueSetDefinition</i> must be a definition of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">valueSet</i> and will always be used to resolve this entity set.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #setValueSetDefinition(ValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteValueSetReference_ValueSetDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetReference getValueSetDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getValueSetDefinition
	 * <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Definition</em>' containment reference.
	 * @see #getValueSetDefinition()
	 * @generated
	 */
	void setValueSetDefinition(ValueSetReference value);

	/**
	 * Returns the value of the '<em><b>Reference Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">CodeSystemVersion</i> that will be used to resolve this
	 * call. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referenceCodeSystemVersion</i> will only be used if one or more
	 * components of the resolution of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">valueSet</i>
	 * identify a code system without specifying a specific version. At most, only one version of a given code system may appear in the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referenceCodeSystemVersion</i> list. While CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">2</sub> service implementations
	 * must resolve resolution calls for definitions that carry unused <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referenceCodeSystemVersion</i> entries, they may choose to issue a warning at
	 * the time the definition is created or loaded.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Reference Code System Version</em>' containment reference.
	 * @see #setReferenceCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteValueSetReference_ReferenceCodeSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceCodeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getReferenceCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference#getReferenceCodeSystemVersion
	 * <em>Reference Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Code System Version</em>' containment reference.
	 * @see #getReferenceCodeSystemVersion()
	 * @generated
	 */
	void setReferenceCodeSystemVersion(CodeSystemVersionReference value);

} // CompleteValueSetReference
