/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.EnumerationLiteral;

import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetCodeImpl#getConceptName <em>Concept Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetCodeImpl#getUsageNote <em>Usage Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetCodeImpl#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetCodeImpl#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetCodeImpl extends EObjectImpl implements ValueSetCode {
	/**
	 * The default value of the '{@link #getConceptName() <em>Concept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConceptName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConceptName() <em>Concept Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConceptName()
	 * @generated
	 * @ordered
	 */
	protected String conceptName = CONCEPT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageNote() <em>Usage Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsageNote()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageNote() <em>Usage Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsageNote()
	 * @generated
	 * @ordered
	 */
	protected String usageNote = USAGE_NOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersion codeSystem;

	/**
	 * The cached value of the '{@link #getBase_EnumerationLiteral() <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral base_EnumerationLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetCodeImpl() {
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
		return TermPackage.Literals.VALUE_SET_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getConceptName() {
		return conceptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConceptName(String newConceptName) {
		String oldConceptName = conceptName;
		conceptName = newConceptName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CODE__CONCEPT_NAME, oldConceptName, conceptName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUsageNote() {
		return usageNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUsageNote(String newUsageNote) {
		String oldUsageNote = usageNote;
		usageNote = newUsageNote;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CODE__USAGE_NOTE, oldUsageNote, usageNote));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersion getCodeSystem() {
		if (codeSystem != null && codeSystem.eIsProxy()) {
			InternalEObject oldCodeSystem = (InternalEObject) codeSystem;
			codeSystem = (CodeSystemVersion) eResolveProxy(oldCodeSystem);
			if (codeSystem != oldCodeSystem) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CODE__CODE_SYSTEM, oldCodeSystem, codeSystem));
				}
			}
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersion basicGetCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystem(CodeSystemVersion newCodeSystem) {
		CodeSystemVersion oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CODE__CODE_SYSTEM, oldCodeSystem, codeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationLiteral getBase_EnumerationLiteral() {
		if (base_EnumerationLiteral != null && base_EnumerationLiteral.eIsProxy()) {
			InternalEObject oldBase_EnumerationLiteral = (InternalEObject) base_EnumerationLiteral;
			base_EnumerationLiteral = (EnumerationLiteral) eResolveProxy(oldBase_EnumerationLiteral);
			if (base_EnumerationLiteral != oldBase_EnumerationLiteral) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL,
						oldBase_EnumerationLiteral, base_EnumerationLiteral));
				}
			}
		}
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationLiteral basicGetBase_EnumerationLiteral() {
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_EnumerationLiteral(EnumerationLiteral newBase_EnumerationLiteral) {
		EnumerationLiteral oldBase_EnumerationLiteral = base_EnumerationLiteral;
		base_EnumerationLiteral = newBase_EnumerationLiteral;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL,
				oldBase_EnumerationLiteral, base_EnumerationLiteral));
		}
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
			case TermPackage.VALUE_SET_CODE__CONCEPT_NAME:
				return getConceptName();
			case TermPackage.VALUE_SET_CODE__USAGE_NOTE:
				return getUsageNote();
			case TermPackage.VALUE_SET_CODE__CODE_SYSTEM:
				if (resolve) {
					return getCodeSystem();
				}
				return basicGetCodeSystem();
			case TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL:
				if (resolve) {
					return getBase_EnumerationLiteral();
				}
				return basicGetBase_EnumerationLiteral();
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
			case TermPackage.VALUE_SET_CODE__CONCEPT_NAME:
				setConceptName((String) newValue);
				return;
			case TermPackage.VALUE_SET_CODE__USAGE_NOTE:
				setUsageNote((String) newValue);
				return;
			case TermPackage.VALUE_SET_CODE__CODE_SYSTEM:
				setCodeSystem((CodeSystemVersion) newValue);
				return;
			case TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral) newValue);
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
			case TermPackage.VALUE_SET_CODE__CONCEPT_NAME:
				setConceptName(CONCEPT_NAME_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CODE__USAGE_NOTE:
				setUsageNote(USAGE_NOTE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CODE__CODE_SYSTEM:
				setCodeSystem((CodeSystemVersion) null);
				return;
			case TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral) null);
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
			case TermPackage.VALUE_SET_CODE__CONCEPT_NAME:
				return CONCEPT_NAME_EDEFAULT == null
						? conceptName != null
						: !CONCEPT_NAME_EDEFAULT.equals(conceptName);
			case TermPackage.VALUE_SET_CODE__USAGE_NOTE:
				return USAGE_NOTE_EDEFAULT == null
						? usageNote != null
						: !USAGE_NOTE_EDEFAULT.equals(usageNote);
			case TermPackage.VALUE_SET_CODE__CODE_SYSTEM:
				return codeSystem != null;
			case TermPackage.VALUE_SET_CODE__BASE_ENUMERATION_LITERAL:
				return base_EnumerationLiteral != null;
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
		result.append(" (conceptName: ");
		result.append(conceptName);
		result.append(", usageNote: ");
		result.append(usageNote);
		result.append(')');
		return result.toString();
	}

} // ValueSetCodeImpl
