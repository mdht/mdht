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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.w3c.xhtml.AlignType;
import org.openhealthtools.mdht.emf.w3c.xhtml.Col;
import org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType;
import org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet;
import org.openhealthtools.mdht.emf.w3c.xhtml.ValignType;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Col</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getValign <em>Valign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColImpl extends EObjectImpl implements Col {
	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected String charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final MifClassType CLASS_EDEFAULT = MifClassType.INSERTED;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected MifClassType class_ = CLASS_EDEFAULT;

	/**
	 * This is true if the Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classESet;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPAN_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger span = SPAN_EDEFAULT;

	/**
	 * This is true if the Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spanESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleSheet STYLE_EDEFAULT = StyleSheet.REQUIREMENT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleSheet style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType VALIGN_EDEFAULT = ValignType.TOP;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.COL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null
				? ALIGN_EDEFAULT
				: newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, XhtmlPackage.COL__ALIGN, oldAlign, align, !oldAlignESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.COL__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.COL__CHAR, oldChar, char_));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharoff(String newCharoff) {
		String oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.COL__CHAROFF, oldCharoff, charoff));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifClassType getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(MifClassType newClass) {
		MifClassType oldClass = class_;
		class_ = newClass == null
				? CLASS_EDEFAULT
				: newClass;
		boolean oldClassESet = classESet;
		classESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, XhtmlPackage.COL__CLASS, oldClass, class_, !oldClassESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClass() {
		MifClassType oldClass = class_;
		boolean oldClassESet = classESet;
		class_ = CLASS_EDEFAULT;
		classESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.COL__CLASS, oldClass, CLASS_EDEFAULT, oldClassESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClass() {
		return classESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.COL__LANG, oldLang, lang));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(BigInteger newSpan) {
		BigInteger oldSpan = span;
		span = newSpan;
		boolean oldSpanESet = spanESet;
		spanESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.COL__SPAN, oldSpan, span, !oldSpanESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpan() {
		BigInteger oldSpan = span;
		boolean oldSpanESet = spanESet;
		span = SPAN_EDEFAULT;
		spanESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.COL__SPAN, oldSpan, SPAN_EDEFAULT, oldSpanESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpan() {
		return spanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleSheet newStyle) {
		StyleSheet oldStyle = style;
		style = newStyle == null
				? STYLE_EDEFAULT
				: newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, XhtmlPackage.COL__STYLE, oldStyle, style, !oldStyleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		StyleSheet oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.COL__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(ValignType newValign) {
		ValignType oldValign = valign;
		valign = newValign == null
				? VALIGN_EDEFAULT
				: newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, XhtmlPackage.COL__VALIGN, oldValign, valign, !oldValignESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValign() {
		ValignType oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, XhtmlPackage.COL__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValign() {
		return valignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.COL__WIDTH, oldWidth, width));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.COL__ALIGN:
				return getAlign();
			case XhtmlPackage.COL__CHAR:
				return getChar();
			case XhtmlPackage.COL__CHAROFF:
				return getCharoff();
			case XhtmlPackage.COL__CLASS:
				return getClass_();
			case XhtmlPackage.COL__LANG:
				return getLang();
			case XhtmlPackage.COL__SPAN:
				return getSpan();
			case XhtmlPackage.COL__STYLE:
				return getStyle();
			case XhtmlPackage.COL__VALIGN:
				return getValign();
			case XhtmlPackage.COL__WIDTH:
				return getWidth();
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
			case XhtmlPackage.COL__ALIGN:
				setAlign((AlignType) newValue);
				return;
			case XhtmlPackage.COL__CHAR:
				setChar((String) newValue);
				return;
			case XhtmlPackage.COL__CHAROFF:
				setCharoff((String) newValue);
				return;
			case XhtmlPackage.COL__CLASS:
				setClass((MifClassType) newValue);
				return;
			case XhtmlPackage.COL__LANG:
				setLang((String) newValue);
				return;
			case XhtmlPackage.COL__SPAN:
				setSpan((BigInteger) newValue);
				return;
			case XhtmlPackage.COL__STYLE:
				setStyle((StyleSheet) newValue);
				return;
			case XhtmlPackage.COL__VALIGN:
				setValign((ValignType) newValue);
				return;
			case XhtmlPackage.COL__WIDTH:
				setWidth((String) newValue);
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
			case XhtmlPackage.COL__ALIGN:
				unsetAlign();
				return;
			case XhtmlPackage.COL__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case XhtmlPackage.COL__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case XhtmlPackage.COL__CLASS:
				unsetClass();
				return;
			case XhtmlPackage.COL__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.COL__SPAN:
				unsetSpan();
				return;
			case XhtmlPackage.COL__STYLE:
				unsetStyle();
				return;
			case XhtmlPackage.COL__VALIGN:
				unsetValign();
				return;
			case XhtmlPackage.COL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case XhtmlPackage.COL__ALIGN:
				return isSetAlign();
			case XhtmlPackage.COL__CHAR:
				return CHAR_EDEFAULT == null
						? char_ != null
						: !CHAR_EDEFAULT.equals(char_);
			case XhtmlPackage.COL__CHAROFF:
				return CHAROFF_EDEFAULT == null
						? charoff != null
						: !CHAROFF_EDEFAULT.equals(charoff);
			case XhtmlPackage.COL__CLASS:
				return isSetClass();
			case XhtmlPackage.COL__LANG:
				return LANG_EDEFAULT == null
						? lang != null
						: !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.COL__SPAN:
				return isSetSpan();
			case XhtmlPackage.COL__STYLE:
				return isSetStyle();
			case XhtmlPackage.COL__VALIGN:
				return isSetValign();
			case XhtmlPackage.COL__WIDTH:
				return WIDTH_EDEFAULT == null
						? width != null
						: !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (align: ");
		if (alignESet) {
			result.append(align);
		} else {
			result.append("<unset>");
		}
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", class: ");
		if (classESet) {
			result.append(class_);
		} else {
			result.append("<unset>");
		}
		result.append(", lang: ");
		result.append(lang);
		result.append(", span: ");
		if (spanESet) {
			result.append(span);
		} else {
			result.append("<unset>");
		}
		result.append(", style: ");
		if (styleESet) {
			result.append(style);
		} else {
			result.append("<unset>");
		}
		result.append(", valign: ");
		if (valignESet) {
			result.append(valign);
		} else {
			result.append("<unset>");
		}
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} // ColImpl
