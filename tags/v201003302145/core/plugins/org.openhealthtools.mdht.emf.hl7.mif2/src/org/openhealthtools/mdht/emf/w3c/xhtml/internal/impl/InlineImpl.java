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
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;
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
 * An implementation of the model object '<em><b>Inline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getInline <em>Inline</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getA <em>A</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InlineImpl extends EObjectImpl implements Inline {
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
	protected InlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.INLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.INLINE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getInline() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.Literals.INLINE__INLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getA() {
		return getInline().list(XhtmlPackage.Literals.INLINE__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Br> getBr() {
		return getInline().list(XhtmlPackage.Literals.INLINE__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Span> getSpan() {
		return getInline().list(XhtmlPackage.Literals.INLINE__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> getObject() {
		return getInline().list(XhtmlPackage.Literals.INLINE__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Img> getImg() {
		return getInline().list(XhtmlPackage.Literals.INLINE__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tt> getTt() {
		return getInline().list(XhtmlPackage.Literals.INLINE__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getI() {
		return getInline().list(XhtmlPackage.Literals.INLINE__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getB() {
		return getInline().list(XhtmlPackage.Literals.INLINE__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Big> getBig() {
		return getInline().list(XhtmlPackage.Literals.INLINE__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Small> getSmall() {
		return getInline().list(XhtmlPackage.Literals.INLINE__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Em> getEm() {
		return getInline().list(XhtmlPackage.Literals.INLINE__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strong> getStrong() {
		return getInline().list(XhtmlPackage.Literals.INLINE__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dfn> getDfn() {
		return getInline().list(XhtmlPackage.Literals.INLINE__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		return getInline().list(XhtmlPackage.Literals.INLINE__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQ() {
		return getInline().list(XhtmlPackage.Literals.INLINE__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Samp> getSamp() {
		return getInline().list(XhtmlPackage.Literals.INLINE__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kbd> getKbd() {
		return getInline().list(XhtmlPackage.Literals.INLINE__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		return getInline().list(XhtmlPackage.Literals.INLINE__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cite> getCite() {
		return getInline().list(XhtmlPackage.Literals.INLINE__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbr> getAbbr() {
		return getInline().list(XhtmlPackage.Literals.INLINE__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acronym> getAcronym() {
		return getInline().list(XhtmlPackage.Literals.INLINE__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getInline().list(XhtmlPackage.Literals.INLINE__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sup> getSup() {
		return getInline().list(XhtmlPackage.Literals.INLINE__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.INLINE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__INLINE:
				return ((InternalEList<?>)getInline()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.INLINE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.INLINE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.INLINE__INLINE:
				if (coreType) return getInline();
				return ((FeatureMap.Internal)getInline()).getWrapper();
			case XhtmlPackage.INLINE__A:
				return getA();
			case XhtmlPackage.INLINE__BR:
				return getBr();
			case XhtmlPackage.INLINE__SPAN:
				return getSpan();
			case XhtmlPackage.INLINE__OBJECT:
				return getObject();
			case XhtmlPackage.INLINE__IMG:
				return getImg();
			case XhtmlPackage.INLINE__TT:
				return getTt();
			case XhtmlPackage.INLINE__I:
				return getI();
			case XhtmlPackage.INLINE__B:
				return getB();
			case XhtmlPackage.INLINE__BIG:
				return getBig();
			case XhtmlPackage.INLINE__SMALL:
				return getSmall();
			case XhtmlPackage.INLINE__EM:
				return getEm();
			case XhtmlPackage.INLINE__STRONG:
				return getStrong();
			case XhtmlPackage.INLINE__DFN:
				return getDfn();
			case XhtmlPackage.INLINE__CODE:
				return getCode();
			case XhtmlPackage.INLINE__Q:
				return getQ();
			case XhtmlPackage.INLINE__SAMP:
				return getSamp();
			case XhtmlPackage.INLINE__KBD:
				return getKbd();
			case XhtmlPackage.INLINE__VAR:
				return getVar();
			case XhtmlPackage.INLINE__CITE:
				return getCite();
			case XhtmlPackage.INLINE__ABBR:
				return getAbbr();
			case XhtmlPackage.INLINE__ACRONYM:
				return getAcronym();
			case XhtmlPackage.INLINE__SUB:
				return getSub();
			case XhtmlPackage.INLINE__SUP:
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
			case XhtmlPackage.INLINE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.INLINE__INLINE:
				((FeatureMap.Internal)getInline()).set(newValue);
				return;
			case XhtmlPackage.INLINE__A:
				getA().clear();
				getA().addAll((Collection<? extends A>)newValue);
				return;
			case XhtmlPackage.INLINE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends Br>)newValue);
				return;
			case XhtmlPackage.INLINE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends Span>)newValue);
				return;
			case XhtmlPackage.INLINE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends org.openhealthtools.mdht.emf.w3c.xhtml.Object>)newValue);
				return;
			case XhtmlPackage.INLINE__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends Img>)newValue);
				return;
			case XhtmlPackage.INLINE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends Tt>)newValue);
				return;
			case XhtmlPackage.INLINE__I:
				getI().clear();
				getI().addAll((Collection<? extends I>)newValue);
				return;
			case XhtmlPackage.INLINE__B:
				getB().clear();
				getB().addAll((Collection<? extends B>)newValue);
				return;
			case XhtmlPackage.INLINE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends Big>)newValue);
				return;
			case XhtmlPackage.INLINE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends Small>)newValue);
				return;
			case XhtmlPackage.INLINE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends Em>)newValue);
				return;
			case XhtmlPackage.INLINE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends Strong>)newValue);
				return;
			case XhtmlPackage.INLINE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends Dfn>)newValue);
				return;
			case XhtmlPackage.INLINE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>)newValue);
				return;
			case XhtmlPackage.INLINE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends Q>)newValue);
				return;
			case XhtmlPackage.INLINE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends Samp>)newValue);
				return;
			case XhtmlPackage.INLINE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends Kbd>)newValue);
				return;
			case XhtmlPackage.INLINE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>)newValue);
				return;
			case XhtmlPackage.INLINE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends Cite>)newValue);
				return;
			case XhtmlPackage.INLINE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends Abbr>)newValue);
				return;
			case XhtmlPackage.INLINE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends Acronym>)newValue);
				return;
			case XhtmlPackage.INLINE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case XhtmlPackage.INLINE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends Sup>)newValue);
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
			case XhtmlPackage.INLINE__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.INLINE__INLINE:
				getInline().clear();
				return;
			case XhtmlPackage.INLINE__A:
				getA().clear();
				return;
			case XhtmlPackage.INLINE__BR:
				getBr().clear();
				return;
			case XhtmlPackage.INLINE__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.INLINE__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.INLINE__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.INLINE__TT:
				getTt().clear();
				return;
			case XhtmlPackage.INLINE__I:
				getI().clear();
				return;
			case XhtmlPackage.INLINE__B:
				getB().clear();
				return;
			case XhtmlPackage.INLINE__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.INLINE__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.INLINE__EM:
				getEm().clear();
				return;
			case XhtmlPackage.INLINE__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.INLINE__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.INLINE__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.INLINE__Q:
				getQ().clear();
				return;
			case XhtmlPackage.INLINE__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.INLINE__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.INLINE__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.INLINE__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.INLINE__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.INLINE__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.INLINE__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.INLINE__SUP:
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
			case XhtmlPackage.INLINE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.INLINE__INLINE:
				return !getInline().isEmpty();
			case XhtmlPackage.INLINE__A:
				return !getA().isEmpty();
			case XhtmlPackage.INLINE__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.INLINE__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.INLINE__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.INLINE__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.INLINE__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.INLINE__I:
				return !getI().isEmpty();
			case XhtmlPackage.INLINE__B:
				return !getB().isEmpty();
			case XhtmlPackage.INLINE__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.INLINE__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.INLINE__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.INLINE__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.INLINE__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.INLINE__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.INLINE__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.INLINE__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.INLINE__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.INLINE__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.INLINE__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.INLINE__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.INLINE__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.INLINE__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.INLINE__SUP:
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //InlineImpl
