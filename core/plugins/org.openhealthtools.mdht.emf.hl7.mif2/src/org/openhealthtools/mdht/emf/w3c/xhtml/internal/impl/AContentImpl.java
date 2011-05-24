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

import org.openhealthtools.mdht.emf.w3c.xhtml.AContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Abbr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Acronym;
import org.openhealthtools.mdht.emf.w3c.xhtml.B;
import org.openhealthtools.mdht.emf.w3c.xhtml.Big;
import org.openhealthtools.mdht.emf.w3c.xhtml.Br;
import org.openhealthtools.mdht.emf.w3c.xhtml.Cite;
import org.openhealthtools.mdht.emf.w3c.xhtml.Code;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dfn;
import org.openhealthtools.mdht.emf.w3c.xhtml.Em;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.Q;
import org.openhealthtools.mdht.emf.w3c.xhtml.Samp;
import org.openhealthtools.mdht.emf.w3c.xhtml.Small;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tt;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AContent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AContentImpl extends EObjectImpl implements AContent {
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
	protected AContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.ACONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.ACONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(XhtmlPackage.Literals.ACONTENT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Br> getBr() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Span> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> getObject() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Img> getImg() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tt> getTt() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getI() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getB() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Big> getBig() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Small> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Em> getEm() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strong> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dfn> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQ() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Samp> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kbd> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cite> getCite() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbr> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acronym> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sup> getSup() {
		return getGroup().list(XhtmlPackage.Literals.ACONTENT__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.ACONTENT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__GROUP:
				return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__BR:
				return ((InternalEList<?>) getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__SPAN:
				return ((InternalEList<?>) getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__OBJECT:
				return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__IMG:
				return ((InternalEList<?>) getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__TT:
				return ((InternalEList<?>) getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__I:
				return ((InternalEList<?>) getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__B:
				return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__BIG:
				return ((InternalEList<?>) getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__SMALL:
				return ((InternalEList<?>) getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__EM:
				return ((InternalEList<?>) getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__STRONG:
				return ((InternalEList<?>) getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__DFN:
				return ((InternalEList<?>) getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__CODE:
				return ((InternalEList<?>) getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__Q:
				return ((InternalEList<?>) getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__SAMP:
				return ((InternalEList<?>) getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__KBD:
				return ((InternalEList<?>) getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__VAR:
				return ((InternalEList<?>) getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__CITE:
				return ((InternalEList<?>) getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__ABBR:
				return ((InternalEList<?>) getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__ACRONYM:
				return ((InternalEList<?>) getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__SUB:
				return ((InternalEList<?>) getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.ACONTENT__SUP:
				return ((InternalEList<?>) getSup()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.ACONTENT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case XhtmlPackage.ACONTENT__GROUP:
				if (coreType) {
					return getGroup();
				}
				return ((FeatureMap.Internal) getGroup()).getWrapper();
			case XhtmlPackage.ACONTENT__BR:
				return getBr();
			case XhtmlPackage.ACONTENT__SPAN:
				return getSpan();
			case XhtmlPackage.ACONTENT__OBJECT:
				return getObject();
			case XhtmlPackage.ACONTENT__IMG:
				return getImg();
			case XhtmlPackage.ACONTENT__TT:
				return getTt();
			case XhtmlPackage.ACONTENT__I:
				return getI();
			case XhtmlPackage.ACONTENT__B:
				return getB();
			case XhtmlPackage.ACONTENT__BIG:
				return getBig();
			case XhtmlPackage.ACONTENT__SMALL:
				return getSmall();
			case XhtmlPackage.ACONTENT__EM:
				return getEm();
			case XhtmlPackage.ACONTENT__STRONG:
				return getStrong();
			case XhtmlPackage.ACONTENT__DFN:
				return getDfn();
			case XhtmlPackage.ACONTENT__CODE:
				return getCode();
			case XhtmlPackage.ACONTENT__Q:
				return getQ();
			case XhtmlPackage.ACONTENT__SAMP:
				return getSamp();
			case XhtmlPackage.ACONTENT__KBD:
				return getKbd();
			case XhtmlPackage.ACONTENT__VAR:
				return getVar();
			case XhtmlPackage.ACONTENT__CITE:
				return getCite();
			case XhtmlPackage.ACONTENT__ABBR:
				return getAbbr();
			case XhtmlPackage.ACONTENT__ACRONYM:
				return getAcronym();
			case XhtmlPackage.ACONTENT__SUB:
				return getSub();
			case XhtmlPackage.ACONTENT__SUP:
				return getSup();
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
			case XhtmlPackage.ACONTENT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case XhtmlPackage.ACONTENT__GROUP:
				((FeatureMap.Internal) getGroup()).set(newValue);
				return;
			case XhtmlPackage.ACONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends Br>) newValue);
				return;
			case XhtmlPackage.ACONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends Span>) newValue);
				return;
			case XhtmlPackage.ACONTENT__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends org.openhealthtools.mdht.emf.w3c.xhtml.Object>) newValue);
				return;
			case XhtmlPackage.ACONTENT__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends Img>) newValue);
				return;
			case XhtmlPackage.ACONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends Tt>) newValue);
				return;
			case XhtmlPackage.ACONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends I>) newValue);
				return;
			case XhtmlPackage.ACONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends B>) newValue);
				return;
			case XhtmlPackage.ACONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends Big>) newValue);
				return;
			case XhtmlPackage.ACONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends Small>) newValue);
				return;
			case XhtmlPackage.ACONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends Em>) newValue);
				return;
			case XhtmlPackage.ACONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends Strong>) newValue);
				return;
			case XhtmlPackage.ACONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends Dfn>) newValue);
				return;
			case XhtmlPackage.ACONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>) newValue);
				return;
			case XhtmlPackage.ACONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends Q>) newValue);
				return;
			case XhtmlPackage.ACONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends Samp>) newValue);
				return;
			case XhtmlPackage.ACONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends Kbd>) newValue);
				return;
			case XhtmlPackage.ACONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>) newValue);
				return;
			case XhtmlPackage.ACONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends Cite>) newValue);
				return;
			case XhtmlPackage.ACONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends Abbr>) newValue);
				return;
			case XhtmlPackage.ACONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends Acronym>) newValue);
				return;
			case XhtmlPackage.ACONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>) newValue);
				return;
			case XhtmlPackage.ACONTENT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends Sup>) newValue);
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
			case XhtmlPackage.ACONTENT__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.ACONTENT__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.ACONTENT__BR:
				getBr().clear();
				return;
			case XhtmlPackage.ACONTENT__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.ACONTENT__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.ACONTENT__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.ACONTENT__TT:
				getTt().clear();
				return;
			case XhtmlPackage.ACONTENT__I:
				getI().clear();
				return;
			case XhtmlPackage.ACONTENT__B:
				getB().clear();
				return;
			case XhtmlPackage.ACONTENT__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.ACONTENT__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.ACONTENT__EM:
				getEm().clear();
				return;
			case XhtmlPackage.ACONTENT__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.ACONTENT__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.ACONTENT__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.ACONTENT__Q:
				getQ().clear();
				return;
			case XhtmlPackage.ACONTENT__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.ACONTENT__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.ACONTENT__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.ACONTENT__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.ACONTENT__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.ACONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.ACONTENT__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.ACONTENT__SUP:
				getSup().clear();
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
			case XhtmlPackage.ACONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.ACONTENT__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.ACONTENT__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.ACONTENT__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.ACONTENT__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.ACONTENT__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.ACONTENT__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.ACONTENT__I:
				return !getI().isEmpty();
			case XhtmlPackage.ACONTENT__B:
				return !getB().isEmpty();
			case XhtmlPackage.ACONTENT__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.ACONTENT__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.ACONTENT__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.ACONTENT__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.ACONTENT__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.ACONTENT__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.ACONTENT__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.ACONTENT__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.ACONTENT__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.ACONTENT__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.ACONTENT__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.ACONTENT__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.ACONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.ACONTENT__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.ACONTENT__SUP:
				return !getSup().isEmpty();
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

} // AContentImpl
