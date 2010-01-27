/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.emf.w3c.xhtml.A;
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
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.PreContent;
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
 * An implementation of the model object '<em><b>Pre Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getA <em>A</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl#getSpan <em>Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreContentImpl extends EObjectImpl implements PreContent {
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
	protected PreContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.PRE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.PRE_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.Literals.PRE_CONTENT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getA() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tt> getTt() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getI() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getB() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Big> getBig() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Small> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Em> getEm() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strong> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dfn> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQ() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Samp> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kbd> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cite> getCite() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbr> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acronym> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sup> getSup() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Br> getBr() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Span> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.PRE_CONTENT__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.PRE_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.PRE_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.PRE_CONTENT__A:
				return getA();
			case XhtmlPackage.PRE_CONTENT__TT:
				return getTt();
			case XhtmlPackage.PRE_CONTENT__I:
				return getI();
			case XhtmlPackage.PRE_CONTENT__B:
				return getB();
			case XhtmlPackage.PRE_CONTENT__BIG:
				return getBig();
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return getSmall();
			case XhtmlPackage.PRE_CONTENT__EM:
				return getEm();
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return getStrong();
			case XhtmlPackage.PRE_CONTENT__DFN:
				return getDfn();
			case XhtmlPackage.PRE_CONTENT__CODE:
				return getCode();
			case XhtmlPackage.PRE_CONTENT__Q:
				return getQ();
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return getSamp();
			case XhtmlPackage.PRE_CONTENT__KBD:
				return getKbd();
			case XhtmlPackage.PRE_CONTENT__VAR:
				return getVar();
			case XhtmlPackage.PRE_CONTENT__CITE:
				return getCite();
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return getAbbr();
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return getAcronym();
			case XhtmlPackage.PRE_CONTENT__SUB:
				return getSub();
			case XhtmlPackage.PRE_CONTENT__SUP:
				return getSup();
			case XhtmlPackage.PRE_CONTENT__BR:
				return getBr();
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return getSpan();
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__A:
				getA().clear();
				getA().addAll((Collection<? extends A>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends Tt>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends I>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends B>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends Big>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends Small>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends Em>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends Strong>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends Dfn>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends Q>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends Samp>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends Kbd>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends Cite>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends Abbr>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends Acronym>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends Sup>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends Br>)newValue);
				return;
			case XhtmlPackage.PRE_CONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends Span>)newValue);
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__A:
				getA().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__TT:
				getTt().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__I:
				getI().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__B:
				getB().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__EM:
				getEm().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__Q:
				getQ().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__BR:
				getBr().clear();
				return;
			case XhtmlPackage.PRE_CONTENT__SPAN:
				getSpan().clear();
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
			case XhtmlPackage.PRE_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.PRE_CONTENT__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.PRE_CONTENT__A:
				return !getA().isEmpty();
			case XhtmlPackage.PRE_CONTENT__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.PRE_CONTENT__I:
				return !getI().isEmpty();
			case XhtmlPackage.PRE_CONTENT__B:
				return !getB().isEmpty();
			case XhtmlPackage.PRE_CONTENT__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.PRE_CONTENT__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.PRE_CONTENT__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.PRE_CONTENT__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.PRE_CONTENT__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.PRE_CONTENT__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.PRE_CONTENT__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.PRE_CONTENT__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.PRE_CONTENT__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.PRE_CONTENT__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.PRE_CONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.PRE_CONTENT__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.PRE_CONTENT__SPAN:
				return !getSpan().isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //PreContentImpl
