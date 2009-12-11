/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.CascadingAnnotationElementKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Cascade Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#isClassifierNameExact <em>Classifier Name Exact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getContextClassName <em>Context Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getRimFeatureName <em>Rim Feature Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationCascadeInfoImpl#isTargetClassNameExact <em>Target Class Name Exact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationCascadeInfoImpl extends PackageRefImpl implements AnnotationCascadeInfo {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef datatype;

	/**
	 * The default value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierName() <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierName()
	 * @generated
	 * @ordered
	 */
	protected String classifierName = CLASSIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isClassifierNameExact() <em>Classifier Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassifierNameExact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASSIFIER_NAME_EXACT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isClassifierNameExact() <em>Classifier Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassifierNameExact()
	 * @generated
	 * @ordered
	 */
	protected boolean classifierNameExact = CLASSIFIER_NAME_EXACT_EDEFAULT;

	/**
	 * This is true if the Classifier Name Exact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classifierNameExactESet;

	/**
	 * The default value of the '{@link #getContextClassName() <em>Context Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextClassName() <em>Context Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextClassName()
	 * @generated
	 * @ordered
	 */
	protected String contextClassName = CONTEXT_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final CascadingAnnotationElementKind ELEMENT_TYPE_EDEFAULT = CascadingAnnotationElementKind.STATIC_MODEL;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected CascadingAnnotationElementKind elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Element Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementTypeESet;

	/**
	 * The default value of the '{@link #getRimFeatureName() <em>Rim Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRimFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String RIM_FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRimFeatureName() <em>Rim Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRimFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String rimFeatureName = RIM_FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected String targetClassName = TARGET_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetClassNameExact() <em>Target Class Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetClassNameExact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_CLASS_NAME_EXACT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTargetClassNameExact() <em>Target Class Name Exact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetClassNameExact()
	 * @generated
	 * @ordered
	 */
	protected boolean targetClassNameExact = TARGET_CLASS_NAME_EXACT_EDEFAULT;

	/**
	 * This is true if the Target Class Name Exact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetClassNameExactESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationCascadeInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ANNOTATION_CASCADE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DatatypeRef newDatatype, NotificationChain msgs) {
		DatatypeRef oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE, oldDatatype, newDatatype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DatatypeRef newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierName() {
		return classifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierName(String newClassifierName) {
		String oldClassifierName = classifierName;
		classifierName = newClassifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME, oldClassifierName, classifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClassifierNameExact() {
		return classifierNameExact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierNameExact(boolean newClassifierNameExact) {
		boolean oldClassifierNameExact = classifierNameExact;
		classifierNameExact = newClassifierNameExact;
		boolean oldClassifierNameExactESet = classifierNameExactESet;
		classifierNameExactESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT, oldClassifierNameExact, classifierNameExact, !oldClassifierNameExactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassifierNameExact() {
		boolean oldClassifierNameExact = classifierNameExact;
		boolean oldClassifierNameExactESet = classifierNameExactESet;
		classifierNameExact = CLASSIFIER_NAME_EXACT_EDEFAULT;
		classifierNameExactESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT, oldClassifierNameExact, CLASSIFIER_NAME_EXACT_EDEFAULT, oldClassifierNameExactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassifierNameExact() {
		return classifierNameExactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextClassName() {
		return contextClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextClassName(String newContextClassName) {
		String oldContextClassName = contextClassName;
		contextClassName = newContextClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__CONTEXT_CLASS_NAME, oldContextClassName, contextClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadingAnnotationElementKind getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(CascadingAnnotationElementKind newElementType) {
		CascadingAnnotationElementKind oldElementType = elementType;
		elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
		boolean oldElementTypeESet = elementTypeESet;
		elementTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE, oldElementType, elementType, !oldElementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementType() {
		CascadingAnnotationElementKind oldElementType = elementType;
		boolean oldElementTypeESet = elementTypeESet;
		elementType = ELEMENT_TYPE_EDEFAULT;
		elementTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE, oldElementType, ELEMENT_TYPE_EDEFAULT, oldElementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementType() {
		return elementTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRimFeatureName() {
		return rimFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRimFeatureName(String newRimFeatureName) {
		String oldRimFeatureName = rimFeatureName;
		rimFeatureName = newRimFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__RIM_FEATURE_NAME, oldRimFeatureName, rimFeatureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetClassName() {
		return targetClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassName(String newTargetClassName) {
		String oldTargetClassName = targetClassName;
		targetClassName = newTargetClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME, oldTargetClassName, targetClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetClassNameExact() {
		return targetClassNameExact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassNameExact(boolean newTargetClassNameExact) {
		boolean oldTargetClassNameExact = targetClassNameExact;
		targetClassNameExact = newTargetClassNameExact;
		boolean oldTargetClassNameExactESet = targetClassNameExactESet;
		targetClassNameExactESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT, oldTargetClassNameExact, targetClassNameExact, !oldTargetClassNameExactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetClassNameExact() {
		boolean oldTargetClassNameExact = targetClassNameExact;
		boolean oldTargetClassNameExactESet = targetClassNameExactESet;
		targetClassNameExact = TARGET_CLASS_NAME_EXACT_EDEFAULT;
		targetClassNameExactESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT, oldTargetClassNameExact, TARGET_CLASS_NAME_EXACT_EDEFAULT, oldTargetClassNameExactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetClassNameExact() {
		return targetClassNameExactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE:
				return basicSetDatatype(null, msgs);
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
			case Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE:
				return getDatatype();
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME:
				return getClassifierName();
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT:
				return isClassifierNameExact() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CONTEXT_CLASS_NAME:
				return getContextClassName();
			case Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE:
				return getElementType();
			case Mif2Package.ANNOTATION_CASCADE_INFO__RIM_FEATURE_NAME:
				return getRimFeatureName();
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME:
				return getTargetClassName();
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT:
				return isTargetClassNameExact() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE:
				setDatatype((DatatypeRef)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME:
				setClassifierName((String)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT:
				setClassifierNameExact(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CONTEXT_CLASS_NAME:
				setContextClassName((String)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE:
				setElementType((CascadingAnnotationElementKind)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__RIM_FEATURE_NAME:
				setRimFeatureName((String)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME:
				setTargetClassName((String)newValue);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT:
				setTargetClassNameExact(((Boolean)newValue).booleanValue());
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
			case Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE:
				setDatatype((DatatypeRef)null);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME:
				setClassifierName(CLASSIFIER_NAME_EDEFAULT);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT:
				unsetClassifierNameExact();
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CONTEXT_CLASS_NAME:
				setContextClassName(CONTEXT_CLASS_NAME_EDEFAULT);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE:
				unsetElementType();
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__RIM_FEATURE_NAME:
				setRimFeatureName(RIM_FEATURE_NAME_EDEFAULT);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME:
				setTargetClassName(TARGET_CLASS_NAME_EDEFAULT);
				return;
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT:
				unsetTargetClassNameExact();
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
			case Mif2Package.ANNOTATION_CASCADE_INFO__DATATYPE:
				return datatype != null;
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME:
				return CLASSIFIER_NAME_EDEFAULT == null ? classifierName != null : !CLASSIFIER_NAME_EDEFAULT.equals(classifierName);
			case Mif2Package.ANNOTATION_CASCADE_INFO__CLASSIFIER_NAME_EXACT:
				return isSetClassifierNameExact();
			case Mif2Package.ANNOTATION_CASCADE_INFO__CONTEXT_CLASS_NAME:
				return CONTEXT_CLASS_NAME_EDEFAULT == null ? contextClassName != null : !CONTEXT_CLASS_NAME_EDEFAULT.equals(contextClassName);
			case Mif2Package.ANNOTATION_CASCADE_INFO__ELEMENT_TYPE:
				return isSetElementType();
			case Mif2Package.ANNOTATION_CASCADE_INFO__RIM_FEATURE_NAME:
				return RIM_FEATURE_NAME_EDEFAULT == null ? rimFeatureName != null : !RIM_FEATURE_NAME_EDEFAULT.equals(rimFeatureName);
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? targetClassName != null : !TARGET_CLASS_NAME_EDEFAULT.equals(targetClassName);
			case Mif2Package.ANNOTATION_CASCADE_INFO__TARGET_CLASS_NAME_EXACT:
				return isSetTargetClassNameExact();
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
		result.append(" (classifierName: ");
		result.append(classifierName);
		result.append(", classifierNameExact: ");
		if (classifierNameExactESet) result.append(classifierNameExact); else result.append("<unset>");
		result.append(", contextClassName: ");
		result.append(contextClassName);
		result.append(", elementType: ");
		if (elementTypeESet) result.append(elementType); else result.append("<unset>");
		result.append(", rimFeatureName: ");
		result.append(rimFeatureName);
		result.append(", targetClassName: ");
		result.append(targetClassName);
		result.append(", targetClassNameExact: ");
		if (targetClassNameExactESet) result.append(targetClassNameExact); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AnnotationCascadeInfoImpl
