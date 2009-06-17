/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Code;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PrintName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getCodeProperty <em>Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getPropertyGroup <em>Property Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getRetirementDate <em>Retirement Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeImpl extends EObjectImpl implements Code {
	/**
	 * The cached value of the '{@link #getPrintName() <em>Print Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintName()
	 * @generated
	 * @ordered
	 */
	protected EList<PrintName> printName;

	/**
	 * The cached value of the '{@link #getCodeProperty() <em>Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> codeProperty;

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
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyGroup() <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyGroup() <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected String propertyGroup = PROPERTY_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetirementDate() <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RETIREMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetirementDate() <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar retirementDate = RETIREMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CodeStatusKind STATUS_EDEFAULT = CodeStatusKind.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeStatusKind status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintName> getPrintName() {
		if (printName == null) {
			printName = new EObjectContainmentEList<PrintName>(PrintName.class, this, Mif2Package.CODE__PRINT_NAME);
		}
		return printName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getCodeProperty() {
		if (codeProperty == null) {
			codeProperty = new EObjectContainmentEList<ConceptProperty>(ConceptProperty.class, this, Mif2Package.CODE__CODE_PROPERTY);
		}
		return codeProperty;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(XMLGregorianCalendar newEffectiveDate) {
		XMLGregorianCalendar oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyGroup() {
		return propertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyGroup(String newPropertyGroup) {
		String oldPropertyGroup = propertyGroup;
		propertyGroup = newPropertyGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE__PROPERTY_GROUP, oldPropertyGroup, propertyGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRetirementDate() {
		return retirementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetirementDate(XMLGregorianCalendar newRetirementDate) {
		XMLGregorianCalendar oldRetirementDate = retirementDate;
		retirementDate = newRetirementDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE__RETIREMENT_DATE, oldRetirementDate, retirementDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeStatusKind getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeStatusKind newStatus) {
		CodeStatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		CodeStatusKind oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE__PRINT_NAME:
				return ((InternalEList<?>)getPrintName()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE__CODE_PROPERTY:
				return ((InternalEList<?>)getCodeProperty()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE__PRINT_NAME:
				return getPrintName();
			case Mif2Package.CODE__CODE_PROPERTY:
				return getCodeProperty();
			case Mif2Package.CODE__CODE:
				return getCode();
			case Mif2Package.CODE__EFFECTIVE_DATE:
				return getEffectiveDate();
			case Mif2Package.CODE__PROPERTY_GROUP:
				return getPropertyGroup();
			case Mif2Package.CODE__RETIREMENT_DATE:
				return getRetirementDate();
			case Mif2Package.CODE__STATUS:
				return getStatus();
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
			case Mif2Package.CODE__PRINT_NAME:
				getPrintName().clear();
				getPrintName().addAll((Collection<? extends PrintName>)newValue);
				return;
			case Mif2Package.CODE__CODE_PROPERTY:
				getCodeProperty().clear();
				getCodeProperty().addAll((Collection<? extends ConceptProperty>)newValue);
				return;
			case Mif2Package.CODE__CODE:
				setCode((String)newValue);
				return;
			case Mif2Package.CODE__EFFECTIVE_DATE:
				setEffectiveDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.CODE__PROPERTY_GROUP:
				setPropertyGroup((String)newValue);
				return;
			case Mif2Package.CODE__RETIREMENT_DATE:
				setRetirementDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.CODE__STATUS:
				setStatus((CodeStatusKind)newValue);
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
			case Mif2Package.CODE__PRINT_NAME:
				getPrintName().clear();
				return;
			case Mif2Package.CODE__CODE_PROPERTY:
				getCodeProperty().clear();
				return;
			case Mif2Package.CODE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Mif2Package.CODE__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case Mif2Package.CODE__PROPERTY_GROUP:
				setPropertyGroup(PROPERTY_GROUP_EDEFAULT);
				return;
			case Mif2Package.CODE__RETIREMENT_DATE:
				setRetirementDate(RETIREMENT_DATE_EDEFAULT);
				return;
			case Mif2Package.CODE__STATUS:
				unsetStatus();
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
			case Mif2Package.CODE__PRINT_NAME:
				return printName != null && !printName.isEmpty();
			case Mif2Package.CODE__CODE_PROPERTY:
				return codeProperty != null && !codeProperty.isEmpty();
			case Mif2Package.CODE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Mif2Package.CODE__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case Mif2Package.CODE__PROPERTY_GROUP:
				return PROPERTY_GROUP_EDEFAULT == null ? propertyGroup != null : !PROPERTY_GROUP_EDEFAULT.equals(propertyGroup);
			case Mif2Package.CODE__RETIREMENT_DATE:
				return RETIREMENT_DATE_EDEFAULT == null ? retirementDate != null : !RETIREMENT_DATE_EDEFAULT.equals(retirementDate);
			case Mif2Package.CODE__STATUS:
				return isSetStatus();
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
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", propertyGroup: ");
		result.append(propertyGroup);
		result.append(", retirementDate: ");
		result.append(retirementDate);
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CodeImpl
