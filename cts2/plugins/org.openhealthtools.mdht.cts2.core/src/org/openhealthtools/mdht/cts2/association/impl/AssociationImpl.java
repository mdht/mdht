/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationDerivation;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.impl.ChangeableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getAssociationQualifier <em>Association Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getAssertedBy <em>Asserted By</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getAssertedIn <em>Asserted In</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getDerivationReasoningAlgorithm <em>Derivation Reasoning Algorithm</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getAssociationID <em>Association ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getDerivation <em>Derivation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationImpl#getLocalID <em>Local ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationImpl extends ChangeableImpl implements Association {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName subject;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected PredicateReference predicate;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementTarget> target;

	/**
	 * The cached value of the '{@link #getAssociationQualifier() <em>Association Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociationQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> associationQualifier;

	/**
	 * The cached value of the '{@link #getAssertedBy() <em>Asserted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference assertedBy;

	/**
	 * The cached value of the '{@link #getAssertedIn() <em>Asserted In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedIn()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference assertedIn;

	/**
	 * The cached value of the '{@link #getDerivationReasoningAlgorithm() <em>Derivation Reasoning Algorithm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDerivationReasoningAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<ReasoningAlgorithmReference> derivationReasoningAlgorithm;

	/**
	 * The default value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STATEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected String sourceStatements = SOURCE_STATEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociationID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationID() <em>Association ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociationID()
	 * @generated
	 * @ordered
	 */
	protected String associationID = ASSOCIATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationDerivation DERIVATION_EDEFAULT = AssociationDerivation.ASSERTED;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected AssociationDerivation derivation = DERIVATION_EDEFAULT;

	/**
	 * This is true if the Derivation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean derivationESet;

	/**
	 * The default value of the '{@link #getLocalID() <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocalID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalID() <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocalID()
	 * @generated
	 * @ordered
	 */
	protected String localID = LOCAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationImpl() {
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
		return AssociationPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSubject(URIAndEntityName newSubject, NotificationChain msgs) {
		URIAndEntityName oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(URIAndEntityName newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null) {
				msgs = ((InternalEObject) subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__SUBJECT, null, msgs);
			}
			if (newSubject != null) {
				msgs = ((InternalEObject) newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__SUBJECT, null, msgs);
			}
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__SUBJECT, newSubject, newSubject));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PredicateReference getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredicate(PredicateReference newPredicate, NotificationChain msgs) {
		PredicateReference oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__PREDICATE, oldPredicate, newPredicate);
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
	public void setPredicate(PredicateReference newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null) {
				msgs = ((InternalEObject) predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__PREDICATE, null, msgs);
			}
			if (newPredicate != null) {
				msgs = ((InternalEObject) newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__PREDICATE, null, msgs);
			}
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__PREDICATE, newPredicate, newPredicate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StatementTarget> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<StatementTarget>(
				StatementTarget.class, this, AssociationPackage.ASSOCIATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getAssociationQualifier() {
		if (associationQualifier == null) {
			associationQualifier = new EObjectContainmentEList<Property>(
				Property.class, this, AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER);
		}
		return associationQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getAssertedBy() {
		return assertedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssertedBy(CodeSystemVersionReference newAssertedBy, NotificationChain msgs) {
		CodeSystemVersionReference oldAssertedBy = assertedBy;
		assertedBy = newAssertedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__ASSERTED_BY, oldAssertedBy, newAssertedBy);
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
	public void setAssertedBy(CodeSystemVersionReference newAssertedBy) {
		if (newAssertedBy != assertedBy) {
			NotificationChain msgs = null;
			if (assertedBy != null) {
				msgs = ((InternalEObject) assertedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__ASSERTED_BY, null, msgs);
			}
			if (newAssertedBy != null) {
				msgs = ((InternalEObject) newAssertedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__ASSERTED_BY, null, msgs);
			}
			msgs = basicSetAssertedBy(newAssertedBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__ASSERTED_BY, newAssertedBy, newAssertedBy));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getAssertedIn() {
		return assertedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAssertedIn(CodeSystemVersionReference newAssertedIn, NotificationChain msgs) {
		CodeSystemVersionReference oldAssertedIn = assertedIn;
		assertedIn = newAssertedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__ASSERTED_IN, oldAssertedIn, newAssertedIn);
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
	public void setAssertedIn(CodeSystemVersionReference newAssertedIn) {
		if (newAssertedIn != assertedIn) {
			NotificationChain msgs = null;
			if (assertedIn != null) {
				msgs = ((InternalEObject) assertedIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__ASSERTED_IN, null, msgs);
			}
			if (newAssertedIn != null) {
				msgs = ((InternalEObject) newAssertedIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION__ASSERTED_IN, null, msgs);
			}
			msgs = basicSetAssertedIn(newAssertedIn, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__ASSERTED_IN, newAssertedIn, newAssertedIn));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ReasoningAlgorithmReference> getDerivationReasoningAlgorithm() {
		if (derivationReasoningAlgorithm == null) {
			derivationReasoningAlgorithm = new EObjectContainmentEList<ReasoningAlgorithmReference>(
				ReasoningAlgorithmReference.class, this, AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM);
		}
		return derivationReasoningAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceStatements() {
		return sourceStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceStatements(String newSourceStatements) {
		String oldSourceStatements = sourceStatements;
		sourceStatements = newSourceStatements;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS, oldSourceStatements,
				sourceStatements));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAssociationID() {
		return associationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationID(String newAssociationID) {
		String oldAssociationID = associationID;
		associationID = newAssociationID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__ASSOCIATION_ID, oldAssociationID, associationID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDerivation getDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDerivation(AssociationDerivation newDerivation) {
		AssociationDerivation oldDerivation = derivation;
		derivation = newDerivation == null
				? DERIVATION_EDEFAULT
				: newDerivation;
		boolean oldDerivationESet = derivationESet;
		derivationESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__DERIVATION, oldDerivation, derivation,
				!oldDerivationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDerivation() {
		AssociationDerivation oldDerivation = derivation;
		boolean oldDerivationESet = derivationESet;
		derivation = DERIVATION_EDEFAULT;
		derivationESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, AssociationPackage.ASSOCIATION__DERIVATION, oldDerivation,
				DERIVATION_EDEFAULT, oldDerivationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDerivation() {
		return derivationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLocalID() {
		return localID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocalID(String newLocalID) {
		String oldLocalID = localID;
		localID = newLocalID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION__LOCAL_ID, oldLocalID, localID));
		}
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
			case AssociationPackage.ASSOCIATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case AssociationPackage.ASSOCIATION__PREDICATE:
				return basicSetPredicate(null, msgs);
			case AssociationPackage.ASSOCIATION__TARGET:
				return ((InternalEList<?>) getTarget()).basicRemove(otherEnd, msgs);
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
				return ((InternalEList<?>) getAssociationQualifier()).basicRemove(otherEnd, msgs);
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
				return basicSetAssertedBy(null, msgs);
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
				return basicSetAssertedIn(null, msgs);
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
				return ((InternalEList<?>) getDerivationReasoningAlgorithm()).basicRemove(otherEnd, msgs);
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
			case AssociationPackage.ASSOCIATION__SUBJECT:
				return getSubject();
			case AssociationPackage.ASSOCIATION__PREDICATE:
				return getPredicate();
			case AssociationPackage.ASSOCIATION__TARGET:
				return getTarget();
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
				return getAssociationQualifier();
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
				return getAssertedBy();
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
				return getAssertedIn();
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
				return getDerivationReasoningAlgorithm();
			case AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS:
				return getSourceStatements();
			case AssociationPackage.ASSOCIATION__ASSOCIATION_ID:
				return getAssociationID();
			case AssociationPackage.ASSOCIATION__DERIVATION:
				return getDerivation();
			case AssociationPackage.ASSOCIATION__LOCAL_ID:
				return getLocalID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssociationPackage.ASSOCIATION__SUBJECT:
				setSubject((URIAndEntityName) newValue);
				return;
			case AssociationPackage.ASSOCIATION__PREDICATE:
				setPredicate((PredicateReference) newValue);
				return;
			case AssociationPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends StatementTarget>) newValue);
				return;
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
				getAssociationQualifier().clear();
				getAssociationQualifier().addAll((Collection<? extends Property>) newValue);
				return;
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) newValue);
				return;
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
				setAssertedIn((CodeSystemVersionReference) newValue);
				return;
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
				getDerivationReasoningAlgorithm().clear();
				getDerivationReasoningAlgorithm().addAll((Collection<? extends ReasoningAlgorithmReference>) newValue);
				return;
			case AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS:
				setSourceStatements((String) newValue);
				return;
			case AssociationPackage.ASSOCIATION__ASSOCIATION_ID:
				setAssociationID((String) newValue);
				return;
			case AssociationPackage.ASSOCIATION__DERIVATION:
				setDerivation((AssociationDerivation) newValue);
				return;
			case AssociationPackage.ASSOCIATION__LOCAL_ID:
				setLocalID((String) newValue);
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
			case AssociationPackage.ASSOCIATION__SUBJECT:
				setSubject((URIAndEntityName) null);
				return;
			case AssociationPackage.ASSOCIATION__PREDICATE:
				setPredicate((PredicateReference) null);
				return;
			case AssociationPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				return;
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
				getAssociationQualifier().clear();
				return;
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
				setAssertedBy((CodeSystemVersionReference) null);
				return;
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
				setAssertedIn((CodeSystemVersionReference) null);
				return;
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
				getDerivationReasoningAlgorithm().clear();
				return;
			case AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS:
				setSourceStatements(SOURCE_STATEMENTS_EDEFAULT);
				return;
			case AssociationPackage.ASSOCIATION__ASSOCIATION_ID:
				setAssociationID(ASSOCIATION_ID_EDEFAULT);
				return;
			case AssociationPackage.ASSOCIATION__DERIVATION:
				unsetDerivation();
				return;
			case AssociationPackage.ASSOCIATION__LOCAL_ID:
				setLocalID(LOCAL_ID_EDEFAULT);
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
			case AssociationPackage.ASSOCIATION__SUBJECT:
				return subject != null;
			case AssociationPackage.ASSOCIATION__PREDICATE:
				return predicate != null;
			case AssociationPackage.ASSOCIATION__TARGET:
				return target != null && !target.isEmpty();
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
				return associationQualifier != null && !associationQualifier.isEmpty();
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
				return assertedBy != null;
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
				return assertedIn != null;
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
				return derivationReasoningAlgorithm != null && !derivationReasoningAlgorithm.isEmpty();
			case AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS:
				return SOURCE_STATEMENTS_EDEFAULT == null
						? sourceStatements != null
						: !SOURCE_STATEMENTS_EDEFAULT.equals(sourceStatements);
			case AssociationPackage.ASSOCIATION__ASSOCIATION_ID:
				return ASSOCIATION_ID_EDEFAULT == null
						? associationID != null
						: !ASSOCIATION_ID_EDEFAULT.equals(associationID);
			case AssociationPackage.ASSOCIATION__DERIVATION:
				return isSetDerivation();
			case AssociationPackage.ASSOCIATION__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null
						? localID != null
						: !LOCAL_ID_EDEFAULT.equals(localID);
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
		result.append(" (sourceStatements: ");
		result.append(sourceStatements);
		result.append(", associationID: ");
		result.append(associationID);
		result.append(", derivation: ");
		if (derivationESet) {
			result.append(derivation);
		} else {
			result.append("<unset>");
		}
		result.append(", localID: ");
		result.append(localID);
		result.append(')');
		return result.toString();
	}

} // AssociationImpl
