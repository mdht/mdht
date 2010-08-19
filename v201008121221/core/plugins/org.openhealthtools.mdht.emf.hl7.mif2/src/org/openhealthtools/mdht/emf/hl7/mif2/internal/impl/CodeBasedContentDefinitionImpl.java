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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeBasedContentDefinitionImpl#getHeadCodes <em>Head Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeBasedContentDefinitionImpl#getIncludeRelatedCodes <em>Include Related Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeBasedContentDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeBasedContentDefinitionImpl#isIncludeHeadCode <em>Include Head Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeBasedContentDefinitionImpl extends EObjectImpl implements CodeBasedContentDefinition {
	/**
	 * The cached value of the '{@link #getHeadCodes() <em>Head Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadCodes()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition headCodes;

	/**
	 * The cached value of the '{@link #getIncludeRelatedCodes() <em>Include Related Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRelatedCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeRelatedCodes> includeRelatedCodes;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeHeadCode() <em>Include Head Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeHeadCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_HEAD_CODE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncludeHeadCode() <em>Include Head Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeHeadCode()
	 * @generated
	 * @ordered
	 */
	protected boolean includeHeadCode = INCLUDE_HEAD_CODE_EDEFAULT;

	/**
	 * This is true if the Include Head Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeHeadCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBasedContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_BASED_CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getHeadCodes() {
		return headCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeadCodes(ContentDefinition newHeadCodes, NotificationChain msgs) {
		ContentDefinition oldHeadCodes = headCodes;
		headCodes = newHeadCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES, oldHeadCodes, newHeadCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadCodes(ContentDefinition newHeadCodes) {
		if (newHeadCodes != headCodes) {
			NotificationChain msgs = null;
			if (headCodes != null)
				msgs = ((InternalEObject)headCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES, null, msgs);
			if (newHeadCodes != null)
				msgs = ((InternalEObject)newHeadCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES, null, msgs);
			msgs = basicSetHeadCodes(newHeadCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES, newHeadCodes, newHeadCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeRelatedCodes> getIncludeRelatedCodes() {
		if (includeRelatedCodes == null) {
			includeRelatedCodes = new EObjectContainmentEList<IncludeRelatedCodes>(IncludeRelatedCodes.class, this, Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES);
		}
		return includeRelatedCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_BASED_CONTENT_DEFINITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeHeadCode() {
		return includeHeadCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeHeadCode(boolean newIncludeHeadCode) {
		boolean oldIncludeHeadCode = includeHeadCode;
		includeHeadCode = newIncludeHeadCode;
		boolean oldIncludeHeadCodeESet = includeHeadCodeESet;
		includeHeadCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE, oldIncludeHeadCode, includeHeadCode, !oldIncludeHeadCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncludeHeadCode() {
		boolean oldIncludeHeadCode = includeHeadCode;
		boolean oldIncludeHeadCodeESet = includeHeadCodeESet;
		includeHeadCode = INCLUDE_HEAD_CODE_EDEFAULT;
		includeHeadCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE, oldIncludeHeadCode, INCLUDE_HEAD_CODE_EDEFAULT, oldIncludeHeadCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncludeHeadCode() {
		return includeHeadCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES:
				return basicSetHeadCodes(null, msgs);
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES:
				return ((InternalEList<?>)getIncludeRelatedCodes()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES:
				return getHeadCodes();
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES:
				return getIncludeRelatedCodes();
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__CODE:
				return getCode();
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE:
				return isIncludeHeadCode() ? Boolean.TRUE : Boolean.FALSE;
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
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES:
				setHeadCodes((ContentDefinition)newValue);
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES:
				getIncludeRelatedCodes().clear();
				getIncludeRelatedCodes().addAll((Collection<? extends IncludeRelatedCodes>)newValue);
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__CODE:
				setCode((String)newValue);
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE:
				setIncludeHeadCode(((Boolean)newValue).booleanValue());
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
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES:
				setHeadCodes((ContentDefinition)null);
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES:
				getIncludeRelatedCodes().clear();
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE:
				unsetIncludeHeadCode();
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
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__HEAD_CODES:
				return headCodes != null;
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_RELATED_CODES:
				return includeRelatedCodes != null && !includeRelatedCodes.isEmpty();
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION__INCLUDE_HEAD_CODE:
				return isSetIncludeHeadCode();
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
		result.append(" (code: ");
		result.append(code);
		result.append(", includeHeadCode: ");
		if (includeHeadCodeESet) result.append(includeHeadCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CodeBasedContentDefinitionImpl
