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
import org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote;
import org.openhealthtools.mdht.emf.w3c.xhtml.Br;
import org.openhealthtools.mdht.emf.w3c.xhtml.Cite;
import org.openhealthtools.mdht.emf.w3c.xhtml.Code;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dfn;
import org.openhealthtools.mdht.emf.w3c.xhtml.Div;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dl;
import org.openhealthtools.mdht.emf.w3c.xhtml.Em;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;
import org.openhealthtools.mdht.emf.w3c.xhtml.Hr;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.Q;
import org.openhealthtools.mdht.emf.w3c.xhtml.Samp;
import org.openhealthtools.mdht.emf.w3c.xhtml.Small;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tt;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getP <em>P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getA <em>A</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends EObjectImpl implements Flow {
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
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.FLOW__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.Literals.FLOW__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<P> getP() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Div> getDiv() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ul> getUl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ol> getOl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dl> getDl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pre> getPre() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hr> getHr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Blockquote> getBlockquote() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getA() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Br> getBr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Span> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> getObject() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Img> getImg() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tt> getTt() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getI() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getB() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Big> getBig() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Small> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Em> getEm() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strong> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dfn> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQ() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Samp> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kbd> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cite> getCite() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbr> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acronym> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sup> getSup() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SUP:
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
			case XhtmlPackage.FLOW__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.FLOW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.FLOW__P:
				return getP();
			case XhtmlPackage.FLOW__DIV:
				return getDiv();
			case XhtmlPackage.FLOW__UL:
				return getUl();
			case XhtmlPackage.FLOW__OL:
				return getOl();
			case XhtmlPackage.FLOW__DL:
				return getDl();
			case XhtmlPackage.FLOW__PRE:
				return getPre();
			case XhtmlPackage.FLOW__HR:
				return getHr();
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.FLOW__TABLE:
				return getTable();
			case XhtmlPackage.FLOW__A:
				return getA();
			case XhtmlPackage.FLOW__BR:
				return getBr();
			case XhtmlPackage.FLOW__SPAN:
				return getSpan();
			case XhtmlPackage.FLOW__OBJECT:
				return getObject();
			case XhtmlPackage.FLOW__IMG:
				return getImg();
			case XhtmlPackage.FLOW__TT:
				return getTt();
			case XhtmlPackage.FLOW__I:
				return getI();
			case XhtmlPackage.FLOW__B:
				return getB();
			case XhtmlPackage.FLOW__BIG:
				return getBig();
			case XhtmlPackage.FLOW__SMALL:
				return getSmall();
			case XhtmlPackage.FLOW__EM:
				return getEm();
			case XhtmlPackage.FLOW__STRONG:
				return getStrong();
			case XhtmlPackage.FLOW__DFN:
				return getDfn();
			case XhtmlPackage.FLOW__CODE:
				return getCode();
			case XhtmlPackage.FLOW__Q:
				return getQ();
			case XhtmlPackage.FLOW__SAMP:
				return getSamp();
			case XhtmlPackage.FLOW__KBD:
				return getKbd();
			case XhtmlPackage.FLOW__VAR:
				return getVar();
			case XhtmlPackage.FLOW__CITE:
				return getCite();
			case XhtmlPackage.FLOW__ABBR:
				return getAbbr();
			case XhtmlPackage.FLOW__ACRONYM:
				return getAcronym();
			case XhtmlPackage.FLOW__SUB:
				return getSub();
			case XhtmlPackage.FLOW__SUP:
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
			case XhtmlPackage.FLOW__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.FLOW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.FLOW__P:
				getP().clear();
				getP().addAll((Collection<? extends P>)newValue);
				return;
			case XhtmlPackage.FLOW__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends Div>)newValue);
				return;
			case XhtmlPackage.FLOW__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends Ul>)newValue);
				return;
			case XhtmlPackage.FLOW__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends Ol>)newValue);
				return;
			case XhtmlPackage.FLOW__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends Dl>)newValue);
				return;
			case XhtmlPackage.FLOW__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends Pre>)newValue);
				return;
			case XhtmlPackage.FLOW__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends Hr>)newValue);
				return;
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends Blockquote>)newValue);
				return;
			case XhtmlPackage.FLOW__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>)newValue);
				return;
			case XhtmlPackage.FLOW__A:
				getA().clear();
				getA().addAll((Collection<? extends A>)newValue);
				return;
			case XhtmlPackage.FLOW__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends Br>)newValue);
				return;
			case XhtmlPackage.FLOW__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends Span>)newValue);
				return;
			case XhtmlPackage.FLOW__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends org.openhealthtools.mdht.emf.w3c.xhtml.Object>)newValue);
				return;
			case XhtmlPackage.FLOW__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends Img>)newValue);
				return;
			case XhtmlPackage.FLOW__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends Tt>)newValue);
				return;
			case XhtmlPackage.FLOW__I:
				getI().clear();
				getI().addAll((Collection<? extends I>)newValue);
				return;
			case XhtmlPackage.FLOW__B:
				getB().clear();
				getB().addAll((Collection<? extends B>)newValue);
				return;
			case XhtmlPackage.FLOW__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends Big>)newValue);
				return;
			case XhtmlPackage.FLOW__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends Small>)newValue);
				return;
			case XhtmlPackage.FLOW__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends Em>)newValue);
				return;
			case XhtmlPackage.FLOW__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends Strong>)newValue);
				return;
			case XhtmlPackage.FLOW__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends Dfn>)newValue);
				return;
			case XhtmlPackage.FLOW__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>)newValue);
				return;
			case XhtmlPackage.FLOW__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends Q>)newValue);
				return;
			case XhtmlPackage.FLOW__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends Samp>)newValue);
				return;
			case XhtmlPackage.FLOW__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends Kbd>)newValue);
				return;
			case XhtmlPackage.FLOW__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>)newValue);
				return;
			case XhtmlPackage.FLOW__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends Cite>)newValue);
				return;
			case XhtmlPackage.FLOW__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends Abbr>)newValue);
				return;
			case XhtmlPackage.FLOW__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends Acronym>)newValue);
				return;
			case XhtmlPackage.FLOW__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>)newValue);
				return;
			case XhtmlPackage.FLOW__SUP:
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
			case XhtmlPackage.FLOW__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.FLOW__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.FLOW__P:
				getP().clear();
				return;
			case XhtmlPackage.FLOW__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.FLOW__UL:
				getUl().clear();
				return;
			case XhtmlPackage.FLOW__OL:
				getOl().clear();
				return;
			case XhtmlPackage.FLOW__DL:
				getDl().clear();
				return;
			case XhtmlPackage.FLOW__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.FLOW__HR:
				getHr().clear();
				return;
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.FLOW__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.FLOW__A:
				getA().clear();
				return;
			case XhtmlPackage.FLOW__BR:
				getBr().clear();
				return;
			case XhtmlPackage.FLOW__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.FLOW__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.FLOW__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.FLOW__TT:
				getTt().clear();
				return;
			case XhtmlPackage.FLOW__I:
				getI().clear();
				return;
			case XhtmlPackage.FLOW__B:
				getB().clear();
				return;
			case XhtmlPackage.FLOW__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.FLOW__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.FLOW__EM:
				getEm().clear();
				return;
			case XhtmlPackage.FLOW__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.FLOW__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.FLOW__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.FLOW__Q:
				getQ().clear();
				return;
			case XhtmlPackage.FLOW__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.FLOW__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.FLOW__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.FLOW__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.FLOW__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.FLOW__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.FLOW__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.FLOW__SUP:
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
			case XhtmlPackage.FLOW__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.FLOW__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.FLOW__P:
				return !getP().isEmpty();
			case XhtmlPackage.FLOW__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.FLOW__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.FLOW__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.FLOW__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.FLOW__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.FLOW__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.FLOW__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.FLOW__A:
				return !getA().isEmpty();
			case XhtmlPackage.FLOW__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.FLOW__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.FLOW__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.FLOW__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.FLOW__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.FLOW__I:
				return !getI().isEmpty();
			case XhtmlPackage.FLOW__B:
				return !getB().isEmpty();
			case XhtmlPackage.FLOW__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.FLOW__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.FLOW__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.FLOW__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.FLOW__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.FLOW__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.FLOW__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.FLOW__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.FLOW__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.FLOW__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.FLOW__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.FLOW__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.FLOW__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.FLOW__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.FLOW__SUP:
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

} //FlowImpl
