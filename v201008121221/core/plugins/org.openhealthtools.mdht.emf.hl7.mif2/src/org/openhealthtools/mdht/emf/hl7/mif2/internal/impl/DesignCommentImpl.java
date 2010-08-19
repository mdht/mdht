/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignCommentTagKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DesignCommentImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignCommentImpl extends CascadableAnnotationImpl implements DesignComment {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final DesignCommentTagKind TAG_EDEFAULT = DesignCommentTagKind.TODO;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected DesignCommentTagKind tag = TAG_EDEFAULT;

	/**
	 * This is true if the Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DESIGN_COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignCommentTagKind getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(DesignCommentTagKind newTag) {
		DesignCommentTagKind oldTag = tag;
		tag = newTag == null ? TAG_EDEFAULT : newTag;
		boolean oldTagESet = tagESet;
		tagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DESIGN_COMMENT__TAG, oldTag, tag, !oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		DesignCommentTagKind oldTag = tag;
		boolean oldTagESet = tagESet;
		tag = TAG_EDEFAULT;
		tagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DESIGN_COMMENT__TAG, oldTag, TAG_EDEFAULT, oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return tagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.DESIGN_COMMENT__TAG:
				return getTag();
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
			case Mif2Package.DESIGN_COMMENT__TAG:
				setTag((DesignCommentTagKind)newValue);
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
			case Mif2Package.DESIGN_COMMENT__TAG:
				unsetTag();
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
			case Mif2Package.DESIGN_COMMENT__TAG:
				return isSetTag();
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
		result.append(" (tag: ");
		if (tagESet) result.append(tag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DesignCommentImpl
