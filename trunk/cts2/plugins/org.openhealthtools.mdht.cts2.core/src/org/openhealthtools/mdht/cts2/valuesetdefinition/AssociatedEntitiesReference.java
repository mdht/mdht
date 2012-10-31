/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associated Entities Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The description of a set of entities that are associated with a referenced entity. This description names a reference entity and an association
 * predicate, which identifies a set of entities that are related to
 * the reference entity according to a given code system. The description can reference the direct targets of the association (children), the direct
 * sources of the association (parents), the transitive closure of the
 * association targets (descendants), the transitive closure of the association sources (ancestors) and can state whether all intermediate nodes are
 * included in the closure or just the leaf nodes.Note that the terms "parent"
 * and "children" are asserted in reference to the predicate itself. As an example, in the association
 * "<i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">arm subClassOf bodyPart</i>", the "parent" is <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">arm</i> and the "child" is <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">bodyPart</i>.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getReferencedEntity <em>Referenced Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystemVersion <em>Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection <em>Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly <em>Leaf Only</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference()
 * @model extendedMetaData="name='AssociatedEntitiesReference' kind='elementOnly'"
 * @generated
 */
public interface AssociatedEntitiesReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the entity reference that is the root of the association description. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referencedEntity</i> is not considered to be part of the resolution of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">AssociatedEntitiesReference</i>. If it is to be
	 * included in the final set, it must be explicitly named in a second <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">SpecificEntityList</i> construct.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Referenced Entity</em>' containment reference.
	 * @see #setReferencedEntity(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_ReferencedEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getReferencedEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getReferencedEntity
	 * <em>Referenced Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Referenced Entity</em>' containment reference.
	 * @see #getReferencedEntity()
	 * @generated
	 */
	void setReferencedEntity(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system that makes the association assertions
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_CodeSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystem <em>Code System</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the version of the code system that makes the association assertions. If present, \\<i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">codeSystemVersion</i> must be a version of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">codeSystem</i>. If this attribute is present, the referenced version
	 * of the code system will always be used to resolve the associations. If absent, the specific version of the code system to be used in resolution
	 * is determined in the resolve value set definition call
	 * itself.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version</em>' containment reference.
	 * @see #setCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_CodeSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getCodeSystemVersion
	 * <em>Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version</em>' containment reference.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the association predicate to be used in resolving the definition entry.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateReference getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getPredicate <em>Predicate</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateReference value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that determines whether the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referencedEntity</i> serves in the
	 * source (<i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">SOURCE_TO_TARGET</i>) or target (<i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">TARGET_TO_SOURCE</i>) role.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(AssociationDirection)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_Direction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	AssociationDirection getDirection();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection <em>Direction</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Direction</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AssociationDirection value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection <em>Direction</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(AssociationDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getDirection
	 * <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(AssociationDirection)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Leaf Only</b></em>' attribute.
	 * The default value is <code>"ALL_INTERMEDIATE_NODES"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that determines whether all nodes in the transitive closure are to be included in the resulting set or only the nodes that
	 * terminate the closure. This indicator is ignored if
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">transitivity</i> is not <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">TRANSITIVE_CLOSURE</i>. Note that nodes that participate in cycles are not
	 * included if <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">leafOnly</i> is set to <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">LEAF_ONLY</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Leaf Only</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @see #isSetLeafOnly()
	 * @see #unsetLeafOnly()
	 * @see #setLeafOnly(LeafOrAll)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_LeafOnly()
	 * @model default="ALL_INTERMEDIATE_NODES" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='leafOnly'"
	 * @generated
	 */
	LeafOrAll getLeafOnly();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly <em>Leaf Only</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Leaf Only</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll
	 * @see #isSetLeafOnly()
	 * @see #unsetLeafOnly()
	 * @see #getLeafOnly()
	 * @generated
	 */
	void setLeafOnly(LeafOrAll value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly <em>Leaf Only</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetLeafOnly()
	 * @see #getLeafOnly()
	 * @see #setLeafOnly(LeafOrAll)
	 * @generated
	 */
	void unsetLeafOnly();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getLeafOnly
	 * <em>Leaf Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Leaf Only</em>' attribute is set.
	 * @see #unsetLeafOnly()
	 * @see #getLeafOnly()
	 * @see #setLeafOnly(LeafOrAll)
	 * @generated
	 */
	boolean isSetLeafOnly();

	/**
	 * Returns the value of the '<em><b>Transitivity</b></em>' attribute.
	 * The default value is <code>"DIRECTLY_ASSOCIATED"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that determines whether only entity references that participate in a direct association with the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">referencedEntity</i> are considered to be a part of the definition or whether
	 * all entity
	 * references that appear on the transitive closure of entity reference are to be included. Note that <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">leafOnly</i> further qualifies this result.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #setTransitivity(TransitiveClosure)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getAssociatedEntitiesReference_Transitivity()
	 * @model default="DIRECTLY_ASSOCIATED" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transitivity'"
	 * @generated
	 */
	TransitiveClosure getTransitivity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity
	 * <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @generated
	 */
	void setTransitivity(TransitiveClosure value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity
	 * <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(TransitiveClosure)
	 * @generated
	 */
	void unsetTransitivity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference#getTransitivity
	 * <em>Transitivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Transitivity</em>' attribute is set.
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(TransitiveClosure)
	 * @generated
	 */
	boolean isSetTransitivity();

} // AssociatedEntitiesReference
