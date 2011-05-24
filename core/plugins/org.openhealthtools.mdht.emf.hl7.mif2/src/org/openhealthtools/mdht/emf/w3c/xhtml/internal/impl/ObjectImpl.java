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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
import org.openhealthtools.mdht.emf.w3c.xhtml.Hr;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Param;
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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getP <em>P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getA <em>A</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getI <em>I</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getB <em>B</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getHl7Id <em>Hl7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements org.openhealthtools.mdht.emf.w3c.xhtml.Object {
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
	 * The default value of the '{@link #getHl7Id() <em>Hl7 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHl7Id()
	 * @generated
	 * @ordered
	 */
	protected static final String HL7_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHl7Id() <em>Hl7 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHl7Id()
	 * @generated
	 * @ordered
	 */
	protected String hl7Id = HL7_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectName NAME_EDEFAULT = ObjectName.CONSTRUCTED_ELEMENT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ObjectName name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.OBJECT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap) getMixed().<FeatureMap.Entry> list(XhtmlPackage.Literals.OBJECT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getParam() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<P> getP() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Div> getDiv() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ul> getUl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ol> getOl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dl> getDl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pre> getPre() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hr> getHr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Blockquote> getBlockquote() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<A> getA() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Br> getBr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Span> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> getObject() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Img> getImg() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tt> getTt() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<I> getI() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<B> getB() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Big> getBig() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Small> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Em> getEm() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strong> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dfn> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Q> getQ() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Samp> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kbd> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cite> getCite() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbr> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Acronym> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sub> getSub() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sup> getSup() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHl7Id() {
		return hl7Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHl7Id(String newHl7Id) {
		String oldHl7Id = hl7Id;
		hl7Id = newHl7Id;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT__HL7_ID, oldHl7Id, hl7Id));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ObjectName newName) {
		ObjectName oldName = name;
		name = newName == null
				? NAME_EDEFAULT
				: newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, XhtmlPackage.OBJECT__NAME, oldName, name, !oldNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		ObjectName oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.OBJECT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.OBJECT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__GROUP:
				return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__PARAM:
				return ((InternalEList<?>) getParam()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__P:
				return ((InternalEList<?>) getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__DIV:
				return ((InternalEList<?>) getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__UL:
				return ((InternalEList<?>) getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__OL:
				return ((InternalEList<?>) getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__DL:
				return ((InternalEList<?>) getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__PRE:
				return ((InternalEList<?>) getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__HR:
				return ((InternalEList<?>) getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__BLOCKQUOTE:
				return ((InternalEList<?>) getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__TABLE:
				return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__A:
				return ((InternalEList<?>) getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__BR:
				return ((InternalEList<?>) getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__SPAN:
				return ((InternalEList<?>) getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__OBJECT:
				return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__IMG:
				return ((InternalEList<?>) getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__TT:
				return ((InternalEList<?>) getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__I:
				return ((InternalEList<?>) getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__B:
				return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__BIG:
				return ((InternalEList<?>) getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__SMALL:
				return ((InternalEList<?>) getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__EM:
				return ((InternalEList<?>) getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__STRONG:
				return ((InternalEList<?>) getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__DFN:
				return ((InternalEList<?>) getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__CODE:
				return ((InternalEList<?>) getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__Q:
				return ((InternalEList<?>) getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__SAMP:
				return ((InternalEList<?>) getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__KBD:
				return ((InternalEList<?>) getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__VAR:
				return ((InternalEList<?>) getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__CITE:
				return ((InternalEList<?>) getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__ABBR:
				return ((InternalEList<?>) getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__ACRONYM:
				return ((InternalEList<?>) getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__SUB:
				return ((InternalEList<?>) getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT__SUP:
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
			case XhtmlPackage.OBJECT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case XhtmlPackage.OBJECT__GROUP:
				if (coreType) {
					return getGroup();
				}
				return ((FeatureMap.Internal) getGroup()).getWrapper();
			case XhtmlPackage.OBJECT__PARAM:
				return getParam();
			case XhtmlPackage.OBJECT__P:
				return getP();
			case XhtmlPackage.OBJECT__DIV:
				return getDiv();
			case XhtmlPackage.OBJECT__UL:
				return getUl();
			case XhtmlPackage.OBJECT__OL:
				return getOl();
			case XhtmlPackage.OBJECT__DL:
				return getDl();
			case XhtmlPackage.OBJECT__PRE:
				return getPre();
			case XhtmlPackage.OBJECT__HR:
				return getHr();
			case XhtmlPackage.OBJECT__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.OBJECT__TABLE:
				return getTable();
			case XhtmlPackage.OBJECT__A:
				return getA();
			case XhtmlPackage.OBJECT__BR:
				return getBr();
			case XhtmlPackage.OBJECT__SPAN:
				return getSpan();
			case XhtmlPackage.OBJECT__OBJECT:
				return getObject();
			case XhtmlPackage.OBJECT__IMG:
				return getImg();
			case XhtmlPackage.OBJECT__TT:
				return getTt();
			case XhtmlPackage.OBJECT__I:
				return getI();
			case XhtmlPackage.OBJECT__B:
				return getB();
			case XhtmlPackage.OBJECT__BIG:
				return getBig();
			case XhtmlPackage.OBJECT__SMALL:
				return getSmall();
			case XhtmlPackage.OBJECT__EM:
				return getEm();
			case XhtmlPackage.OBJECT__STRONG:
				return getStrong();
			case XhtmlPackage.OBJECT__DFN:
				return getDfn();
			case XhtmlPackage.OBJECT__CODE:
				return getCode();
			case XhtmlPackage.OBJECT__Q:
				return getQ();
			case XhtmlPackage.OBJECT__SAMP:
				return getSamp();
			case XhtmlPackage.OBJECT__KBD:
				return getKbd();
			case XhtmlPackage.OBJECT__VAR:
				return getVar();
			case XhtmlPackage.OBJECT__CITE:
				return getCite();
			case XhtmlPackage.OBJECT__ABBR:
				return getAbbr();
			case XhtmlPackage.OBJECT__ACRONYM:
				return getAcronym();
			case XhtmlPackage.OBJECT__SUB:
				return getSub();
			case XhtmlPackage.OBJECT__SUP:
				return getSup();
			case XhtmlPackage.OBJECT__HL7_ID:
				return getHl7Id();
			case XhtmlPackage.OBJECT__NAME:
				return getName();
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
			case XhtmlPackage.OBJECT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case XhtmlPackage.OBJECT__GROUP:
				((FeatureMap.Internal) getGroup()).set(newValue);
				return;
			case XhtmlPackage.OBJECT__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Param>) newValue);
				return;
			case XhtmlPackage.OBJECT__P:
				getP().clear();
				getP().addAll((Collection<? extends P>) newValue);
				return;
			case XhtmlPackage.OBJECT__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends Div>) newValue);
				return;
			case XhtmlPackage.OBJECT__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends Ul>) newValue);
				return;
			case XhtmlPackage.OBJECT__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends Ol>) newValue);
				return;
			case XhtmlPackage.OBJECT__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends Dl>) newValue);
				return;
			case XhtmlPackage.OBJECT__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends Pre>) newValue);
				return;
			case XhtmlPackage.OBJECT__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends Hr>) newValue);
				return;
			case XhtmlPackage.OBJECT__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends Blockquote>) newValue);
				return;
			case XhtmlPackage.OBJECT__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>) newValue);
				return;
			case XhtmlPackage.OBJECT__A:
				getA().clear();
				getA().addAll((Collection<? extends A>) newValue);
				return;
			case XhtmlPackage.OBJECT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends Br>) newValue);
				return;
			case XhtmlPackage.OBJECT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends Span>) newValue);
				return;
			case XhtmlPackage.OBJECT__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends org.openhealthtools.mdht.emf.w3c.xhtml.Object>) newValue);
				return;
			case XhtmlPackage.OBJECT__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends Img>) newValue);
				return;
			case XhtmlPackage.OBJECT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends Tt>) newValue);
				return;
			case XhtmlPackage.OBJECT__I:
				getI().clear();
				getI().addAll((Collection<? extends I>) newValue);
				return;
			case XhtmlPackage.OBJECT__B:
				getB().clear();
				getB().addAll((Collection<? extends B>) newValue);
				return;
			case XhtmlPackage.OBJECT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends Big>) newValue);
				return;
			case XhtmlPackage.OBJECT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends Small>) newValue);
				return;
			case XhtmlPackage.OBJECT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends Em>) newValue);
				return;
			case XhtmlPackage.OBJECT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends Strong>) newValue);
				return;
			case XhtmlPackage.OBJECT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends Dfn>) newValue);
				return;
			case XhtmlPackage.OBJECT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>) newValue);
				return;
			case XhtmlPackage.OBJECT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends Q>) newValue);
				return;
			case XhtmlPackage.OBJECT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends Samp>) newValue);
				return;
			case XhtmlPackage.OBJECT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends Kbd>) newValue);
				return;
			case XhtmlPackage.OBJECT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>) newValue);
				return;
			case XhtmlPackage.OBJECT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends Cite>) newValue);
				return;
			case XhtmlPackage.OBJECT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends Abbr>) newValue);
				return;
			case XhtmlPackage.OBJECT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends Acronym>) newValue);
				return;
			case XhtmlPackage.OBJECT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Sub>) newValue);
				return;
			case XhtmlPackage.OBJECT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends Sup>) newValue);
				return;
			case XhtmlPackage.OBJECT__HL7_ID:
				setHl7Id((String) newValue);
				return;
			case XhtmlPackage.OBJECT__NAME:
				setName((ObjectName) newValue);
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
			case XhtmlPackage.OBJECT__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.OBJECT__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.OBJECT__PARAM:
				getParam().clear();
				return;
			case XhtmlPackage.OBJECT__P:
				getP().clear();
				return;
			case XhtmlPackage.OBJECT__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.OBJECT__UL:
				getUl().clear();
				return;
			case XhtmlPackage.OBJECT__OL:
				getOl().clear();
				return;
			case XhtmlPackage.OBJECT__DL:
				getDl().clear();
				return;
			case XhtmlPackage.OBJECT__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.OBJECT__HR:
				getHr().clear();
				return;
			case XhtmlPackage.OBJECT__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.OBJECT__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.OBJECT__A:
				getA().clear();
				return;
			case XhtmlPackage.OBJECT__BR:
				getBr().clear();
				return;
			case XhtmlPackage.OBJECT__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.OBJECT__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.OBJECT__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.OBJECT__TT:
				getTt().clear();
				return;
			case XhtmlPackage.OBJECT__I:
				getI().clear();
				return;
			case XhtmlPackage.OBJECT__B:
				getB().clear();
				return;
			case XhtmlPackage.OBJECT__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.OBJECT__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.OBJECT__EM:
				getEm().clear();
				return;
			case XhtmlPackage.OBJECT__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.OBJECT__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.OBJECT__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.OBJECT__Q:
				getQ().clear();
				return;
			case XhtmlPackage.OBJECT__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.OBJECT__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.OBJECT__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.OBJECT__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.OBJECT__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.OBJECT__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.OBJECT__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.OBJECT__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.OBJECT__HL7_ID:
				setHl7Id(HL7_ID_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT__NAME:
				unsetName();
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
			case XhtmlPackage.OBJECT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.OBJECT__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.OBJECT__PARAM:
				return !getParam().isEmpty();
			case XhtmlPackage.OBJECT__P:
				return !getP().isEmpty();
			case XhtmlPackage.OBJECT__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.OBJECT__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.OBJECT__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.OBJECT__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.OBJECT__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.OBJECT__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.OBJECT__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.OBJECT__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.OBJECT__A:
				return !getA().isEmpty();
			case XhtmlPackage.OBJECT__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.OBJECT__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.OBJECT__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.OBJECT__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.OBJECT__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.OBJECT__I:
				return !getI().isEmpty();
			case XhtmlPackage.OBJECT__B:
				return !getB().isEmpty();
			case XhtmlPackage.OBJECT__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.OBJECT__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.OBJECT__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.OBJECT__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.OBJECT__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.OBJECT__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.OBJECT__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.OBJECT__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.OBJECT__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.OBJECT__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.OBJECT__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.OBJECT__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.OBJECT__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.OBJECT__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.OBJECT__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.OBJECT__HL7_ID:
				return HL7_ID_EDEFAULT == null
						? hl7Id != null
						: !HL7_ID_EDEFAULT.equals(hl7Id);
			case XhtmlPackage.OBJECT__NAME:
				return isSetName();
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
		result.append(", hl7Id: ");
		result.append(hl7Id);
		result.append(", name: ");
		if (nameESet) {
			result.append(name);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ObjectImpl
