/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TermDefinitionImpl#getTermTranslation <em>Term Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TermDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TermDefinitionImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TermDefinitionImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermDefinitionImpl extends EObjectImpl implements TermDefinition {
	/**
	 * The cached value of the '{@link #getTermTranslation() <em>Term Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> termTranslation;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexMarkupWithLanguage> definition;

	/**
	 * The cached value of the '{@link #getSeeAlso() <em>See Also</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected EList<String> seeAlso;

	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TERM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getTermTranslation() {
		if (termTranslation == null) {
			termTranslation = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.TERM_DEFINITION__TERM_TRANSLATION);
		}
		return termTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexMarkupWithLanguage> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<ComplexMarkupWithLanguage>(ComplexMarkupWithLanguage.class, this, Mif2Package.TERM_DEFINITION__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSeeAlso() {
		if (seeAlso == null) {
			seeAlso = new EDataTypeEList<String>(String.class, this, Mif2Package.TERM_DEFINITION__SEE_ALSO);
		}
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TERM_DEFINITION__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.TERM_DEFINITION__TERM_TRANSLATION:
				return ((InternalEList<?>)getTermTranslation()).basicRemove(otherEnd, msgs);
			case Mif2Package.TERM_DEFINITION__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.TERM_DEFINITION__TERM_TRANSLATION:
				return getTermTranslation();
			case Mif2Package.TERM_DEFINITION__DEFINITION:
				return getDefinition();
			case Mif2Package.TERM_DEFINITION__SEE_ALSO:
				return getSeeAlso();
			case Mif2Package.TERM_DEFINITION__TERM:
				return getTerm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.TERM_DEFINITION__TERM_TRANSLATION:
				getTermTranslation().clear();
				getTermTranslation().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.TERM_DEFINITION__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends ComplexMarkupWithLanguage>)newValue);
				return;
			case Mif2Package.TERM_DEFINITION__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends String>)newValue);
				return;
			case Mif2Package.TERM_DEFINITION__TERM:
				setTerm((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.TERM_DEFINITION__TERM_TRANSLATION:
				getTermTranslation().clear();
				return;
			case Mif2Package.TERM_DEFINITION__DEFINITION:
				getDefinition().clear();
				return;
			case Mif2Package.TERM_DEFINITION__SEE_ALSO:
				getSeeAlso().clear();
				return;
			case Mif2Package.TERM_DEFINITION__TERM:
				setTerm(TERM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.TERM_DEFINITION__TERM_TRANSLATION:
				return termTranslation != null && !termTranslation.isEmpty();
			case Mif2Package.TERM_DEFINITION__DEFINITION:
				return definition != null && !definition.isEmpty();
			case Mif2Package.TERM_DEFINITION__SEE_ALSO:
				return seeAlso != null && !seeAlso.isEmpty();
			case Mif2Package.TERM_DEFINITION__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (seeAlso: ");
		result.append(seeAlso);
		result.append(", term: ");
		result.append(term);
		result.append(')');
		return result.toString();
	}

} //TermDefinitionImpl
