/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.SetOperator;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getAssociatedEntities <em>Associated Entities</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getCompleteCodeSystem <em>Complete Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getCompleteValueSet <em>Complete Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getExternalValueSetDefinition <em>External Value Set
 * Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getPropertyQuery <em>Property Query</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getEntityList <em>Entity List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getEntryOrder <em>Entry Order</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionEntryImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetDefinitionEntryImpl extends EObjectImpl implements ValueSetDefinitionEntry {
	/**
	 * The cached value of the '{@link #getAssociatedEntities() <em>Associated Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociatedEntities()
	 * @generated
	 * @ordered
	 */
	protected AssociatedEntitiesReference associatedEntities;

	/**
	 * The cached value of the '{@link #getCompleteCodeSystem() <em>Complete Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCompleteCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CompleteCodeSystemReference completeCodeSystem;

	/**
	 * The cached value of the '{@link #getCompleteValueSet() <em>Complete Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCompleteValueSet()
	 * @generated
	 * @ordered
	 */
	protected CompleteValueSetReference completeValueSet;

	/**
	 * The cached value of the '{@link #getExternalValueSetDefinition() <em>External Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalValueSetDefinition()
	 * @generated
	 * @ordered
	 */
	protected ExternalValueSetDefinition externalValueSetDefinition;

	/**
	 * The cached value of the '{@link #getPropertyQuery() <em>Property Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertyQuery()
	 * @generated
	 * @ordered
	 */
	protected PropertyQueryReference propertyQuery;

	/**
	 * The cached value of the '{@link #getEntityList() <em>Entity List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityList()
	 * @generated
	 * @ordered
	 */
	protected SpecificEntityList entityList;

	/**
	 * The default value of the '{@link #getEntryOrder() <em>Entry Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENTRY_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryOrder() <em>Entry Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger entryOrder = ENTRY_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final SetOperator OPERATOR_EDEFAULT = SetOperator.UNION;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected SetOperator operator = OPERATOR_EDEFAULT;

	/**
	 * This is true if the Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean operatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociatedEntitiesReference getAssociatedEntities() {
		return associatedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssociatedEntities(AssociatedEntitiesReference newAssociatedEntities,
			NotificationChain msgs) {
		AssociatedEntitiesReference oldAssociatedEntities = associatedEntities;
		associatedEntities = newAssociatedEntities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES,
				oldAssociatedEntities, newAssociatedEntities);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociatedEntities(AssociatedEntitiesReference newAssociatedEntities) {
		if (newAssociatedEntities != associatedEntities) {
			NotificationChain msgs = null;
			if (associatedEntities != null) {
				msgs = ((InternalEObject) associatedEntities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES, null, msgs);
			}
			if (newAssociatedEntities != null) {
				msgs = ((InternalEObject) newAssociatedEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES, null, msgs);
			}
			msgs = basicSetAssociatedEntities(newAssociatedEntities, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES,
				newAssociatedEntities, newAssociatedEntities));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteCodeSystemReference getCompleteCodeSystem() {
		return completeCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCompleteCodeSystem(CompleteCodeSystemReference newCompleteCodeSystem,
			NotificationChain msgs) {
		CompleteCodeSystemReference oldCompleteCodeSystem = completeCodeSystem;
		completeCodeSystem = newCompleteCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM,
				oldCompleteCodeSystem, newCompleteCodeSystem);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCompleteCodeSystem(CompleteCodeSystemReference newCompleteCodeSystem) {
		if (newCompleteCodeSystem != completeCodeSystem) {
			NotificationChain msgs = null;
			if (completeCodeSystem != null) {
				msgs = ((InternalEObject) completeCodeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM, null, msgs);
			}
			if (newCompleteCodeSystem != null) {
				msgs = ((InternalEObject) newCompleteCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM, null, msgs);
			}
			msgs = basicSetCompleteCodeSystem(newCompleteCodeSystem, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM,
				newCompleteCodeSystem, newCompleteCodeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteValueSetReference getCompleteValueSet() {
		return completeValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCompleteValueSet(CompleteValueSetReference newCompleteValueSet,
			NotificationChain msgs) {
		CompleteValueSetReference oldCompleteValueSet = completeValueSet;
		completeValueSet = newCompleteValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET,
				oldCompleteValueSet, newCompleteValueSet);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCompleteValueSet(CompleteValueSetReference newCompleteValueSet) {
		if (newCompleteValueSet != completeValueSet) {
			NotificationChain msgs = null;
			if (completeValueSet != null) {
				msgs = ((InternalEObject) completeValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET, null, msgs);
			}
			if (newCompleteValueSet != null) {
				msgs = ((InternalEObject) newCompleteValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET, null, msgs);
			}
			msgs = basicSetCompleteValueSet(newCompleteValueSet, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET,
				newCompleteValueSet, newCompleteValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExternalValueSetDefinition getExternalValueSetDefinition() {
		return externalValueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExternalValueSetDefinition(
			ExternalValueSetDefinition newExternalValueSetDefinition, NotificationChain msgs) {
		ExternalValueSetDefinition oldExternalValueSetDefinition = externalValueSetDefinition;
		externalValueSetDefinition = newExternalValueSetDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET,
				ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION,
				oldExternalValueSetDefinition, newExternalValueSetDefinition);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExternalValueSetDefinition(ExternalValueSetDefinition newExternalValueSetDefinition) {
		if (newExternalValueSetDefinition != externalValueSetDefinition) {
			NotificationChain msgs = null;
			if (externalValueSetDefinition != null) {
				msgs = ((InternalEObject) externalValueSetDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION, null, msgs);
			}
			if (newExternalValueSetDefinition != null) {
				msgs = ((InternalEObject) newExternalValueSetDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION, null, msgs);
			}
			msgs = basicSetExternalValueSetDefinition(newExternalValueSetDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION,
				newExternalValueSetDefinition, newExternalValueSetDefinition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyQueryReference getPropertyQuery() {
		return propertyQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPropertyQuery(PropertyQueryReference newPropertyQuery, NotificationChain msgs) {
		PropertyQueryReference oldPropertyQuery = propertyQuery;
		propertyQuery = newPropertyQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY,
				oldPropertyQuery, newPropertyQuery);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPropertyQuery(PropertyQueryReference newPropertyQuery) {
		if (newPropertyQuery != propertyQuery) {
			NotificationChain msgs = null;
			if (propertyQuery != null) {
				msgs = ((InternalEObject) propertyQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY, null, msgs);
			}
			if (newPropertyQuery != null) {
				msgs = ((InternalEObject) newPropertyQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY, null, msgs);
			}
			msgs = basicSetPropertyQuery(newPropertyQuery, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY,
				newPropertyQuery, newPropertyQuery));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificEntityList getEntityList() {
		return entityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityList(SpecificEntityList newEntityList, NotificationChain msgs) {
		SpecificEntityList oldEntityList = entityList;
		entityList = newEntityList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST,
				oldEntityList, newEntityList);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityList(SpecificEntityList newEntityList) {
		if (newEntityList != entityList) {
			NotificationChain msgs = null;
			if (entityList != null) {
				msgs = ((InternalEObject) entityList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST, null, msgs);
			}
			if (newEntityList != null) {
				msgs = ((InternalEObject) newEntityList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST, null, msgs);
			}
			msgs = basicSetEntityList(newEntityList, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST,
				newEntityList, newEntityList));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getEntryOrder() {
		return entryOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntryOrder(BigInteger newEntryOrder) {
		BigInteger oldEntryOrder = entryOrder;
		entryOrder = newEntryOrder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER,
				oldEntryOrder, entryOrder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOperator(SetOperator newOperator) {
		SetOperator oldOperator = operator;
		operator = newOperator == null
				? OPERATOR_EDEFAULT
				: newOperator;
		boolean oldOperatorESet = operatorESet;
		operatorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR, oldOperator,
				operator, !oldOperatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetOperator() {
		SetOperator oldOperator = operator;
		boolean oldOperatorESet = operatorESet;
		operator = OPERATOR_EDEFAULT;
		operatorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR, oldOperator,
				OPERATOR_EDEFAULT, oldOperatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOperator() {
		return operatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
				return basicSetAssociatedEntities(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
				return basicSetCompleteCodeSystem(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
				return basicSetCompleteValueSet(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
				return basicSetExternalValueSetDefinition(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
				return basicSetPropertyQuery(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
				return basicSetEntityList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
				return getAssociatedEntities();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
				return getCompleteCodeSystem();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
				return getCompleteValueSet();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
				return getExternalValueSetDefinition();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
				return getPropertyQuery();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
				return getEntityList();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER:
				return getEntryOrder();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
				setAssociatedEntities((AssociatedEntitiesReference) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
				setCompleteCodeSystem((CompleteCodeSystemReference) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
				setCompleteValueSet((CompleteValueSetReference) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
				setExternalValueSetDefinition((ExternalValueSetDefinition) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
				setPropertyQuery((PropertyQueryReference) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
				setEntityList((SpecificEntityList) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER:
				setEntryOrder((BigInteger) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR:
				setOperator((SetOperator) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
				setAssociatedEntities((AssociatedEntitiesReference) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
				setCompleteCodeSystem((CompleteCodeSystemReference) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
				setCompleteValueSet((CompleteValueSetReference) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
				setExternalValueSetDefinition((ExternalValueSetDefinition) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
				setPropertyQuery((PropertyQueryReference) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
				setEntityList((SpecificEntityList) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER:
				setEntryOrder(ENTRY_ORDER_EDEFAULT);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR:
				unsetOperator();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
				return associatedEntities != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
				return completeCodeSystem != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
				return completeValueSet != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
				return externalValueSetDefinition != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
				return propertyQuery != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
				return entityList != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER:
				return ENTRY_ORDER_EDEFAULT == null
						? entryOrder != null
						: !ENTRY_ORDER_EDEFAULT.equals(entryOrder);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR:
				return isSetOperator();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entryOrder: ");
		result.append(entryOrder);
		result.append(", operator: ");
		if (operatorESet) {
			result.append(operator);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ValueSetDefinitionEntryImpl
