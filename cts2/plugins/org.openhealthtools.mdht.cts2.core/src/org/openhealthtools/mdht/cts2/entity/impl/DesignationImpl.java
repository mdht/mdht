/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CaseSignificanceReference;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.DesignationFidelityReference;
import org.openhealthtools.mdht.cts2.core.DesignationTypeReference;
import org.openhealthtools.mdht.cts2.core.impl.EntryDescriptionImpl;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DesignationRole;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getUsageContext <em>Usage Context</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getDesignationType <em>Designation Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getCaseSignificance <em>Case Significance</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getDegreeOfFidelity <em>Degree Of Fidelity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getAssertedInCodeSystemVersion <em>Asserted In Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getDesignationRole <em>Designation Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.DesignationImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DesignationImpl extends EntryDescriptionImpl implements Designation {
	/**
	 * The cached value of the '{@link #getUsageContext() <em>Usage Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsageContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextReference> usageContext;

	/**
	 * The cached value of the '{@link #getDesignationType() <em>Designation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignationType()
	 * @generated
	 * @ordered
	 */
	protected DesignationTypeReference designationType;

	/**
	 * The cached value of the '{@link #getCaseSignificance() <em>Case Significance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCaseSignificance()
	 * @generated
	 * @ordered
	 */
	protected CaseSignificanceReference caseSignificance;

	/**
	 * The cached value of the '{@link #getDegreeOfFidelity() <em>Degree Of Fidelity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDegreeOfFidelity()
	 * @generated
	 * @ordered
	 */
	protected DesignationFidelityReference degreeOfFidelity;

	/**
	 * The default value of the '{@link #getAssertedInCodeSystemVersion() <em>Asserted In Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssertedInCodeSystemVersion() <em>Asserted In Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String assertedInCodeSystemVersion = ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected String correspondingStatement = CORRESPONDING_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignationRole() <em>Designation Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignationRole()
	 * @generated
	 * @ordered
	 */
	protected static final DesignationRole DESIGNATION_ROLE_EDEFAULT = DesignationRole.ALTERNATIVE;

	/**
	 * The cached value of the '{@link #getDesignationRole() <em>Designation Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDesignationRole()
	 * @generated
	 * @ordered
	 */
	protected DesignationRole designationRole = DESIGNATION_ROLE_EDEFAULT;

	/**
	 * This is true if the Designation Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean designationRoleESet;

	/**
	 * The default value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String externalIdentifier = EXTERNAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DesignationImpl() {
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
		return EntityPackage.Literals.DESIGNATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ContextReference> getUsageContext() {
		if (usageContext == null) {
			usageContext = new EObjectContainmentEList<ContextReference>(
				ContextReference.class, this, EntityPackage.DESIGNATION__USAGE_CONTEXT);
		}
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationTypeReference getDesignationType() {
		return designationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDesignationType(DesignationTypeReference newDesignationType, NotificationChain msgs) {
		DesignationTypeReference oldDesignationType = designationType;
		designationType = newDesignationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__DESIGNATION_TYPE, oldDesignationType,
				newDesignationType);
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
	public void setDesignationType(DesignationTypeReference newDesignationType) {
		if (newDesignationType != designationType) {
			NotificationChain msgs = null;
			if (designationType != null) {
				msgs = ((InternalEObject) designationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__DESIGNATION_TYPE, null, msgs);
			}
			if (newDesignationType != null) {
				msgs = ((InternalEObject) newDesignationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__DESIGNATION_TYPE, null, msgs);
			}
			msgs = basicSetDesignationType(newDesignationType, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__DESIGNATION_TYPE, newDesignationType,
				newDesignationType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CaseSignificanceReference getCaseSignificance() {
		return caseSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCaseSignificance(CaseSignificanceReference newCaseSignificance,
			NotificationChain msgs) {
		CaseSignificanceReference oldCaseSignificance = caseSignificance;
		caseSignificance = newCaseSignificance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__CASE_SIGNIFICANCE, oldCaseSignificance,
				newCaseSignificance);
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
	public void setCaseSignificance(CaseSignificanceReference newCaseSignificance) {
		if (newCaseSignificance != caseSignificance) {
			NotificationChain msgs = null;
			if (caseSignificance != null) {
				msgs = ((InternalEObject) caseSignificance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__CASE_SIGNIFICANCE, null, msgs);
			}
			if (newCaseSignificance != null) {
				msgs = ((InternalEObject) newCaseSignificance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__CASE_SIGNIFICANCE, null, msgs);
			}
			msgs = basicSetCaseSignificance(newCaseSignificance, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__CASE_SIGNIFICANCE, newCaseSignificance,
				newCaseSignificance));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationFidelityReference getDegreeOfFidelity() {
		return degreeOfFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDegreeOfFidelity(DesignationFidelityReference newDegreeOfFidelity,
			NotificationChain msgs) {
		DesignationFidelityReference oldDegreeOfFidelity = degreeOfFidelity;
		degreeOfFidelity = newDegreeOfFidelity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY, oldDegreeOfFidelity,
				newDegreeOfFidelity);
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
	public void setDegreeOfFidelity(DesignationFidelityReference newDegreeOfFidelity) {
		if (newDegreeOfFidelity != degreeOfFidelity) {
			NotificationChain msgs = null;
			if (degreeOfFidelity != null) {
				msgs = ((InternalEObject) degreeOfFidelity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY, null, msgs);
			}
			if (newDegreeOfFidelity != null) {
				msgs = ((InternalEObject) newDegreeOfFidelity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY, null, msgs);
			}
			msgs = basicSetDegreeOfFidelity(newDegreeOfFidelity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY, newDegreeOfFidelity,
				newDegreeOfFidelity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAssertedInCodeSystemVersion() {
		return assertedInCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssertedInCodeSystemVersion(String newAssertedInCodeSystemVersion) {
		String oldAssertedInCodeSystemVersion = assertedInCodeSystemVersion;
		assertedInCodeSystemVersion = newAssertedInCodeSystemVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION,
				oldAssertedInCodeSystemVersion, assertedInCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCorrespondingStatement() {
		return correspondingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCorrespondingStatement(String newCorrespondingStatement) {
		String oldCorrespondingStatement = correspondingStatement;
		correspondingStatement = newCorrespondingStatement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT, oldCorrespondingStatement,
				correspondingStatement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationRole getDesignationRole() {
		return designationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDesignationRole(DesignationRole newDesignationRole) {
		DesignationRole oldDesignationRole = designationRole;
		designationRole = newDesignationRole == null
				? DESIGNATION_ROLE_EDEFAULT
				: newDesignationRole;
		boolean oldDesignationRoleESet = designationRoleESet;
		designationRoleESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__DESIGNATION_ROLE, oldDesignationRole,
				designationRole, !oldDesignationRoleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDesignationRole() {
		DesignationRole oldDesignationRole = designationRole;
		boolean oldDesignationRoleESet = designationRoleESet;
		designationRole = DESIGNATION_ROLE_EDEFAULT;
		designationRoleESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.DESIGNATION__DESIGNATION_ROLE, oldDesignationRole,
				DESIGNATION_ROLE_EDEFAULT, oldDesignationRoleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDesignationRole() {
		return designationRoleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getExternalIdentifier() {
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExternalIdentifier(String newExternalIdentifier) {
		String oldExternalIdentifier = externalIdentifier;
		externalIdentifier = newExternalIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER, oldExternalIdentifier,
				externalIdentifier));
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
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
				return ((InternalEList<?>) getUsageContext()).basicRemove(otherEnd, msgs);
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
				return basicSetDesignationType(null, msgs);
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
				return basicSetCaseSignificance(null, msgs);
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
				return basicSetDegreeOfFidelity(null, msgs);
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
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
				return getUsageContext();
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
				return getDesignationType();
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
				return getCaseSignificance();
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
				return getDegreeOfFidelity();
			case EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION:
				return getAssertedInCodeSystemVersion();
			case EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT:
				return getCorrespondingStatement();
			case EntityPackage.DESIGNATION__DESIGNATION_ROLE:
				return getDesignationRole();
			case EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
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
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
				getUsageContext().clear();
				getUsageContext().addAll((Collection<? extends ContextReference>) newValue);
				return;
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
				setDesignationType((DesignationTypeReference) newValue);
				return;
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
				setCaseSignificance((CaseSignificanceReference) newValue);
				return;
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
				setDegreeOfFidelity((DesignationFidelityReference) newValue);
				return;
			case EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION:
				setAssertedInCodeSystemVersion((String) newValue);
				return;
			case EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT:
				setCorrespondingStatement((String) newValue);
				return;
			case EntityPackage.DESIGNATION__DESIGNATION_ROLE:
				setDesignationRole((DesignationRole) newValue);
				return;
			case EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((String) newValue);
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
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
				getUsageContext().clear();
				return;
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
				setDesignationType((DesignationTypeReference) null);
				return;
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
				setCaseSignificance((CaseSignificanceReference) null);
				return;
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
				setDegreeOfFidelity((DesignationFidelityReference) null);
				return;
			case EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION:
				setAssertedInCodeSystemVersion(ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT);
				return;
			case EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT:
				setCorrespondingStatement(CORRESPONDING_STATEMENT_EDEFAULT);
				return;
			case EntityPackage.DESIGNATION__DESIGNATION_ROLE:
				unsetDesignationRole();
				return;
			case EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER:
				setExternalIdentifier(EXTERNAL_IDENTIFIER_EDEFAULT);
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
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
				return usageContext != null && !usageContext.isEmpty();
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
				return designationType != null;
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
				return caseSignificance != null;
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
				return degreeOfFidelity != null;
			case EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION:
				return ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT == null
						? assertedInCodeSystemVersion != null
						: !ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT.equals(assertedInCodeSystemVersion);
			case EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT:
				return CORRESPONDING_STATEMENT_EDEFAULT == null
						? correspondingStatement != null
						: !CORRESPONDING_STATEMENT_EDEFAULT.equals(correspondingStatement);
			case EntityPackage.DESIGNATION__DESIGNATION_ROLE:
				return isSetDesignationRole();
			case EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER:
				return EXTERNAL_IDENTIFIER_EDEFAULT == null
						? externalIdentifier != null
						: !EXTERNAL_IDENTIFIER_EDEFAULT.equals(externalIdentifier);
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
		result.append(" (assertedInCodeSystemVersion: ");
		result.append(assertedInCodeSystemVersion);
		result.append(", correspondingStatement: ");
		result.append(correspondingStatement);
		result.append(", designationRole: ");
		if (designationRoleESet) {
			result.append(designationRole);
		} else {
			result.append("<unset>");
		}
		result.append(", externalIdentifier: ");
		result.append(externalIdentifier);
		result.append(')');
		return result.toString();
	}

} // DesignationImpl
