/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.EntityExpression;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax;
import org.openhealthtools.mdht.cts2.core.OpaqueData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl#getOntologyLanguageAndSyntax <em>Ontology Language And Syntax</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.EntityExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityExpressionImpl extends EObjectImpl implements EntityExpression {
	/**
	 * The cached value of the '{@link #getOntologyLanguageAndSyntax() <em>Ontology Language And Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOntologyLanguageAndSyntax()
	 * @generated
	 * @ordered
	 */
	protected OntologyLanguageAndSyntax ontologyLanguageAndSyntax;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityExpressionImpl() {
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
		return CorePackage.Literals.ENTITY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageAndSyntax getOntologyLanguageAndSyntax() {
		return ontologyLanguageAndSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOntologyLanguageAndSyntax(OntologyLanguageAndSyntax newOntologyLanguageAndSyntax,
			NotificationChain msgs) {
		OntologyLanguageAndSyntax oldOntologyLanguageAndSyntax = ontologyLanguageAndSyntax;
		ontologyLanguageAndSyntax = newOntologyLanguageAndSyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX,
				oldOntologyLanguageAndSyntax, newOntologyLanguageAndSyntax);
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
	public void setOntologyLanguageAndSyntax(OntologyLanguageAndSyntax newOntologyLanguageAndSyntax) {
		if (newOntologyLanguageAndSyntax != ontologyLanguageAndSyntax) {
			NotificationChain msgs = null;
			if (ontologyLanguageAndSyntax != null) {
				msgs = ((InternalEObject) ontologyLanguageAndSyntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX, null, msgs);
			}
			if (newOntologyLanguageAndSyntax != null) {
				msgs = ((InternalEObject) newOntologyLanguageAndSyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX, null, msgs);
			}
			msgs = basicSetOntologyLanguageAndSyntax(newOntologyLanguageAndSyntax, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX,
				newOntologyLanguageAndSyntax, newOntologyLanguageAndSyntax));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExpression(OpaqueData newExpression, NotificationChain msgs) {
		OpaqueData oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(OpaqueData newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null) {
				msgs = ((InternalEObject) expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_EXPRESSION__EXPRESSION, null, msgs);
			}
			if (newExpression != null) {
				msgs = ((InternalEObject) newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ENTITY_EXPRESSION__EXPRESSION, null, msgs);
			}
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ENTITY_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
			case CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX:
				return basicSetOntologyLanguageAndSyntax(null, msgs);
			case CorePackage.ENTITY_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX:
				return getOntologyLanguageAndSyntax();
			case CorePackage.ENTITY_EXPRESSION__EXPRESSION:
				return getExpression();
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
			case CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX:
				setOntologyLanguageAndSyntax((OntologyLanguageAndSyntax) newValue);
				return;
			case CorePackage.ENTITY_EXPRESSION__EXPRESSION:
				setExpression((OpaqueData) newValue);
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
			case CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX:
				setOntologyLanguageAndSyntax((OntologyLanguageAndSyntax) null);
				return;
			case CorePackage.ENTITY_EXPRESSION__EXPRESSION:
				setExpression((OpaqueData) null);
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
			case CorePackage.ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX:
				return ontologyLanguageAndSyntax != null;
			case CorePackage.ENTITY_EXPRESSION__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} // EntityExpressionImpl
