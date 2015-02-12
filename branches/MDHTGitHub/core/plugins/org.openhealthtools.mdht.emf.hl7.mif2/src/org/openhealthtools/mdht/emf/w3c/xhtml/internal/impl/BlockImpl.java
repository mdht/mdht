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
package org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.w3c.xhtml.Block;
import org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote;
import org.openhealthtools.mdht.emf.w3c.xhtml.Div;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dl;
import org.openhealthtools.mdht.emf.w3c.xhtml.Hr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getP <em>P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends EObjectImpl implements Block {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.BLOCK__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBlock() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(XhtmlPackage.Literals.BLOCK__BLOCK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<P> getP() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Div> getDiv() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ul> getUl() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ol> getOl() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dl> getDl() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pre> getPre() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hr> getHr() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Blockquote> getBlockquote() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		return getBlock().list(XhtmlPackage.Literals.BLOCK__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.BLOCK__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__BLOCK:
				return ((InternalEList<?>) getBlock()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__P:
				return ((InternalEList<?>) getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__DIV:
				return ((InternalEList<?>) getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__UL:
				return ((InternalEList<?>) getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__OL:
				return ((InternalEList<?>) getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__DL:
				return ((InternalEList<?>) getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__PRE:
				return ((InternalEList<?>) getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__HR:
				return ((InternalEList<?>) getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__BLOCKQUOTE:
				return ((InternalEList<?>) getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.BLOCK__TABLE:
				return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.BLOCK__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case XhtmlPackage.BLOCK__BLOCK:
				if (coreType) {
					return getBlock();
				}
				return ((FeatureMap.Internal) getBlock()).getWrapper();
			case XhtmlPackage.BLOCK__P:
				return getP();
			case XhtmlPackage.BLOCK__DIV:
				return getDiv();
			case XhtmlPackage.BLOCK__UL:
				return getUl();
			case XhtmlPackage.BLOCK__OL:
				return getOl();
			case XhtmlPackage.BLOCK__DL:
				return getDl();
			case XhtmlPackage.BLOCK__PRE:
				return getPre();
			case XhtmlPackage.BLOCK__HR:
				return getHr();
			case XhtmlPackage.BLOCK__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.BLOCK__TABLE:
				return getTable();
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
			case XhtmlPackage.BLOCK__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case XhtmlPackage.BLOCK__BLOCK:
				((FeatureMap.Internal) getBlock()).set(newValue);
				return;
			case XhtmlPackage.BLOCK__P:
				getP().clear();
				getP().addAll((Collection<? extends P>) newValue);
				return;
			case XhtmlPackage.BLOCK__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends Div>) newValue);
				return;
			case XhtmlPackage.BLOCK__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends Ul>) newValue);
				return;
			case XhtmlPackage.BLOCK__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends Ol>) newValue);
				return;
			case XhtmlPackage.BLOCK__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends Dl>) newValue);
				return;
			case XhtmlPackage.BLOCK__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends Pre>) newValue);
				return;
			case XhtmlPackage.BLOCK__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends Hr>) newValue);
				return;
			case XhtmlPackage.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends Blockquote>) newValue);
				return;
			case XhtmlPackage.BLOCK__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>) newValue);
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
			case XhtmlPackage.BLOCK__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.BLOCK__BLOCK:
				getBlock().clear();
				return;
			case XhtmlPackage.BLOCK__P:
				getP().clear();
				return;
			case XhtmlPackage.BLOCK__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.BLOCK__UL:
				getUl().clear();
				return;
			case XhtmlPackage.BLOCK__OL:
				getOl().clear();
				return;
			case XhtmlPackage.BLOCK__DL:
				getDl().clear();
				return;
			case XhtmlPackage.BLOCK__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.BLOCK__HR:
				getHr().clear();
				return;
			case XhtmlPackage.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.BLOCK__TABLE:
				getTable().clear();
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
			case XhtmlPackage.BLOCK__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.BLOCK__BLOCK:
				return !getBlock().isEmpty();
			case XhtmlPackage.BLOCK__P:
				return !getP().isEmpty();
			case XhtmlPackage.BLOCK__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.BLOCK__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.BLOCK__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.BLOCK__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.BLOCK__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.BLOCK__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.BLOCK__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.BLOCK__TABLE:
				return !getTable().isEmpty();
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // BlockImpl
