/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDesignComment()
 * @model extendedMetaData="name='DesignComment' kind='elementOnly'"
 * @generated
 */
public interface DesignComment extends CascadableAnnotation {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DesignCommentTagKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Categorizes the type of comment being made for flagging in development environments
	 * UML: tag on DesignComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DesignCommentTagKind
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(DesignCommentTagKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDesignComment_Tag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	DesignCommentTagKind getTag();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DesignCommentTagKind
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(DesignCommentTagKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(DesignCommentTagKind)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(DesignCommentTagKind)
	 * @generated
	 */
	boolean isSetTag();

} // DesignComment
