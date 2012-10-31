/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.SetOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An element of a value set definition that, when resolved yields a set of entity references that are to be included in, excluded from or intersected
 * with the set of elements that represent the full resolution of
 * the definition.Note that only <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ACTIVE</i> entity references are included. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">INACTIVE</i> entity references may never be considered for inclusion or exclusion in
 * the resolution of a value set definition.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getAssociatedEntities <em>Associated Entities</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteCodeSystem <em>Complete Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteValueSet <em>Complete Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getExternalValueSetDefinition <em>External Value Set Definition
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getPropertyQuery <em>Property Query</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntityList <em>Entity List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntryOrder <em>Entry Order</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry()
 * @model extendedMetaData="name='ValueSetDefinitionEntry' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDefinitionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Associated Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Entities</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Associated Entities</em>' containment reference.
	 * @see #setAssociatedEntities(AssociatedEntitiesReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_AssociatedEntities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedEntities' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociatedEntitiesReference getAssociatedEntities();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getAssociatedEntities
	 * <em>Associated Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Associated Entities</em>' containment reference.
	 * @see #getAssociatedEntities()
	 * @generated
	 */
	void setAssociatedEntities(AssociatedEntitiesReference value);

	/**
	 * Returns the value of the '<em><b>Complete Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Code System</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Complete Code System</em>' containment reference.
	 * @see #setCompleteCodeSystem(CompleteCodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_CompleteCodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completeCodeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CompleteCodeSystemReference getCompleteCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteCodeSystem
	 * <em>Complete Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Complete Code System</em>' containment reference.
	 * @see #getCompleteCodeSystem()
	 * @generated
	 */
	void setCompleteCodeSystem(CompleteCodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Complete Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Value Set</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Complete Value Set</em>' containment reference.
	 * @see #setCompleteValueSet(CompleteValueSetReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_CompleteValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='completeValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CompleteValueSetReference getCompleteValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getCompleteValueSet
	 * <em>Complete Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Complete Value Set</em>' containment reference.
	 * @see #getCompleteValueSet()
	 * @generated
	 */
	void setCompleteValueSet(CompleteValueSetReference value);

	/**
	 * Returns the value of the '<em><b>External Value Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Value Set Definition</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>External Value Set Definition</em>' containment reference.
	 * @see #setExternalValueSetDefinition(ExternalValueSetDefinition)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_ExternalValueSetDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalValueSetDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalValueSetDefinition getExternalValueSetDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getExternalValueSetDefinition
	 * <em>External Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>External Value Set Definition</em>' containment reference.
	 * @see #getExternalValueSetDefinition()
	 * @generated
	 */
	void setExternalValueSetDefinition(ExternalValueSetDefinition value);

	/**
	 * Returns the value of the '<em><b>Property Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Query</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Query</em>' containment reference.
	 * @see #setPropertyQuery(PropertyQueryReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_PropertyQuery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyQueryReference getPropertyQuery();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getPropertyQuery
	 * <em>Property Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Property Query</em>' containment reference.
	 * @see #getPropertyQuery()
	 * @generated
	 */
	void setPropertyQuery(PropertyQueryReference value);

	/**
	 * Returns the value of the '<em><b>Entity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity List</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity List</em>' containment reference.
	 * @see #setEntityList(SpecificEntityList)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_EntityList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entityList' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificEntityList getEntityList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntityList <em>Entity List</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity List</em>' containment reference.
	 * @see #getEntityList()
	 * @generated
	 */
	void setEntityList(SpecificEntityList value);

	/**
	 * Returns the value of the '<em><b>Entry Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Order</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry Order</em>' attribute.
	 * @see #setEntryOrder(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_EntryOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='entryOrder'"
	 * @generated
	 */
	BigInteger getEntryOrder();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getEntryOrder <em>Entry Order</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry Order</em>' attribute.
	 * @see #getEntryOrder()
	 * @generated
	 */
	void setEntryOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.SetOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * instructions for how the results of the entry evaluation will be applied to the set of entities in the base definition. Results can be added to
	 * the set (<i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">UNION</i>), intersected with members already in
	 * the set (<i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">INTERSECT</i>) or be removed from the set (<i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">DIFFERENCE</i>)
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #setOperator(SetOperator)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getValueSetDefinitionEntry_Operator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='operator'"
	 * @generated
	 */
	SetOperator getOperator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator <em>Operator</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Operator</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.SetOperator
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SetOperator value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator <em>Operator</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetOperator()
	 * @see #getOperator()
	 * @see #setOperator(SetOperator)
	 * @generated
	 */
	void unsetOperator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry#getOperator
	 * <em>Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Operator</em>' attribute is set.
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @see #setOperator(SetOperator)
	 * @generated
	 */
	boolean isSetOperator();

} // ValueSetDefinitionEntry
