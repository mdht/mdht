/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.w3c.xhtml.Caption;
import org.openhealthtools.mdht.emf.w3c.xhtml.Col;
import org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup;
import org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType;
import org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet;
import org.openhealthtools.mdht.emf.w3c.xhtml.TFrame;
import org.openhealthtools.mdht.emf.w3c.xhtml.TRules;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tbody;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot;
import org.openhealthtools.mdht.emf.w3c.xhtml.Thead;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getHl7Id <em>Hl7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected Caption caption;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<Col> col;

	/**
	 * The cached value of the '{@link #getColgroup() <em>Colgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Colgroup> colgroup;

	/**
	 * The cached value of the '{@link #getThead() <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThead()
	 * @generated
	 * @ordered
	 */
	protected Thead thead;

	/**
	 * The cached value of the '{@link #getTfoot() <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfoot()
	 * @generated
	 * @ordered
	 */
	protected Tfoot tfoot;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected EList<Tbody> tbody;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<Tr> tr;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLPADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected String cellpadding = CELLPADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected String cellspacing = CELLSPACING_EDEFAULT;

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
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final TFrame FRAME_EDEFAULT = TFrame.VOID;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected TFrame frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

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
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final TRules RULES_EDEFAULT = TRules.NONE;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected TRules rules = RULES_EDEFAULT;

	/**
	 * This is true if the Rules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rulesESet;

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
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(Caption newCaption, NotificationChain msgs) {
		Caption oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__CAPTION, oldCaption, newCaption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(Caption newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Col> getCol() {
		if (col == null) {
			col = new EObjectContainmentEList<Col>(Col.class, this, XhtmlPackage.TABLE__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Colgroup> getColgroup() {
		if (colgroup == null) {
			colgroup = new EObjectContainmentEList<Colgroup>(Colgroup.class, this, XhtmlPackage.TABLE__COLGROUP);
		}
		return colgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thead getThead() {
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(Thead newThead, NotificationChain msgs) {
		Thead oldThead = thead;
		thead = newThead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__THEAD, oldThead, newThead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThead(Thead newThead) {
		if (newThead != thead) {
			NotificationChain msgs = null;
			if (thead != null)
				msgs = ((InternalEObject)thead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__THEAD, null, msgs);
			if (newThead != null)
				msgs = ((InternalEObject)newThead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__THEAD, null, msgs);
			msgs = basicSetThead(newThead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__THEAD, newThead, newThead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tfoot getTfoot() {
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(Tfoot newTfoot, NotificationChain msgs) {
		Tfoot oldTfoot = tfoot;
		tfoot = newTfoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__TFOOT, oldTfoot, newTfoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTfoot(Tfoot newTfoot) {
		if (newTfoot != tfoot) {
			NotificationChain msgs = null;
			if (tfoot != null)
				msgs = ((InternalEObject)tfoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__TFOOT, null, msgs);
			if (newTfoot != null)
				msgs = ((InternalEObject)newTfoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE__TFOOT, null, msgs);
			msgs = basicSetTfoot(newTfoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__TFOOT, newTfoot, newTfoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tbody> getTbody() {
		if (tbody == null) {
			tbody = new EObjectContainmentEList<Tbody>(Tbody.class, this, XhtmlPackage.TABLE__TBODY);
		}
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tr> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<Tr>(Tr.class, this, XhtmlPackage.TABLE__TR);
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(BigInteger newBorder) {
		BigInteger oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellpadding() {
		return cellpadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellpadding(String newCellpadding) {
		String oldCellpadding = cellpadding;
		cellpadding = newCellpadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__CELLPADDING, oldCellpadding, cellpadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellspacing() {
		return cellspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellspacing(String newCellspacing) {
		String oldCellspacing = cellspacing;
		cellspacing = newCellspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__CELLSPACING, oldCellspacing, cellspacing));
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
		class_ = newClass == null ? CLASS_EDEFAULT : newClass;
		boolean oldClassESet = classESet;
		classESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__CLASS, oldClass, class_, !oldClassESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE__CLASS, oldClass, CLASS_EDEFAULT, oldClassESet));
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
	public TFrame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(TFrame newFrame) {
		TFrame oldFrame = frame;
		frame = newFrame == null ? FRAME_EDEFAULT : newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrame() {
		TFrame oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrame() {
		return frameESet;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__HL7_ID, oldHl7Id, hl7Id));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(TRules newRules) {
		TRules oldRules = rules;
		rules = newRules == null ? RULES_EDEFAULT : newRules;
		boolean oldRulesESet = rulesESet;
		rulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__RULES, oldRules, rules, !oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRules() {
		TRules oldRules = rules;
		boolean oldRulesESet = rulesESet;
		rules = RULES_EDEFAULT;
		rulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE__RULES, oldRules, RULES_EDEFAULT, oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRules() {
		return rulesESet;
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
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__STYLE, oldStyle, style, !oldStyleESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.TABLE__CAPTION:
				return basicSetCaption(null, msgs);
			case XhtmlPackage.TABLE__COL:
				return ((InternalEList<?>)getCol()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE__COLGROUP:
				return ((InternalEList<?>)getColgroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE__THEAD:
				return basicSetThead(null, msgs);
			case XhtmlPackage.TABLE__TFOOT:
				return basicSetTfoot(null, msgs);
			case XhtmlPackage.TABLE__TBODY:
				return ((InternalEList<?>)getTbody()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.TABLE__CAPTION:
				return getCaption();
			case XhtmlPackage.TABLE__COL:
				return getCol();
			case XhtmlPackage.TABLE__COLGROUP:
				return getColgroup();
			case XhtmlPackage.TABLE__THEAD:
				return getThead();
			case XhtmlPackage.TABLE__TFOOT:
				return getTfoot();
			case XhtmlPackage.TABLE__TBODY:
				return getTbody();
			case XhtmlPackage.TABLE__TR:
				return getTr();
			case XhtmlPackage.TABLE__BORDER:
				return getBorder();
			case XhtmlPackage.TABLE__CELLPADDING:
				return getCellpadding();
			case XhtmlPackage.TABLE__CELLSPACING:
				return getCellspacing();
			case XhtmlPackage.TABLE__CLASS:
				return getClass_();
			case XhtmlPackage.TABLE__FRAME:
				return getFrame();
			case XhtmlPackage.TABLE__HL7_ID:
				return getHl7Id();
			case XhtmlPackage.TABLE__LANG:
				return getLang();
			case XhtmlPackage.TABLE__RULES:
				return getRules();
			case XhtmlPackage.TABLE__STYLE:
				return getStyle();
			case XhtmlPackage.TABLE__WIDTH:
				return getWidth();
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
			case XhtmlPackage.TABLE__CAPTION:
				setCaption((Caption)newValue);
				return;
			case XhtmlPackage.TABLE__COL:
				getCol().clear();
				getCol().addAll((Collection<? extends Col>)newValue);
				return;
			case XhtmlPackage.TABLE__COLGROUP:
				getColgroup().clear();
				getColgroup().addAll((Collection<? extends Colgroup>)newValue);
				return;
			case XhtmlPackage.TABLE__THEAD:
				setThead((Thead)newValue);
				return;
			case XhtmlPackage.TABLE__TFOOT:
				setTfoot((Tfoot)newValue);
				return;
			case XhtmlPackage.TABLE__TBODY:
				getTbody().clear();
				getTbody().addAll((Collection<? extends Tbody>)newValue);
				return;
			case XhtmlPackage.TABLE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends Tr>)newValue);
				return;
			case XhtmlPackage.TABLE__BORDER:
				setBorder((BigInteger)newValue);
				return;
			case XhtmlPackage.TABLE__CELLPADDING:
				setCellpadding((String)newValue);
				return;
			case XhtmlPackage.TABLE__CELLSPACING:
				setCellspacing((String)newValue);
				return;
			case XhtmlPackage.TABLE__CLASS:
				setClass((MifClassType)newValue);
				return;
			case XhtmlPackage.TABLE__FRAME:
				setFrame((TFrame)newValue);
				return;
			case XhtmlPackage.TABLE__HL7_ID:
				setHl7Id((String)newValue);
				return;
			case XhtmlPackage.TABLE__LANG:
				setLang((String)newValue);
				return;
			case XhtmlPackage.TABLE__RULES:
				setRules((TRules)newValue);
				return;
			case XhtmlPackage.TABLE__STYLE:
				setStyle((StyleSheet)newValue);
				return;
			case XhtmlPackage.TABLE__WIDTH:
				setWidth((String)newValue);
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
			case XhtmlPackage.TABLE__CAPTION:
				setCaption((Caption)null);
				return;
			case XhtmlPackage.TABLE__COL:
				getCol().clear();
				return;
			case XhtmlPackage.TABLE__COLGROUP:
				getColgroup().clear();
				return;
			case XhtmlPackage.TABLE__THEAD:
				setThead((Thead)null);
				return;
			case XhtmlPackage.TABLE__TFOOT:
				setTfoot((Tfoot)null);
				return;
			case XhtmlPackage.TABLE__TBODY:
				getTbody().clear();
				return;
			case XhtmlPackage.TABLE__TR:
				getTr().clear();
				return;
			case XhtmlPackage.TABLE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case XhtmlPackage.TABLE__CELLPADDING:
				setCellpadding(CELLPADDING_EDEFAULT);
				return;
			case XhtmlPackage.TABLE__CELLSPACING:
				setCellspacing(CELLSPACING_EDEFAULT);
				return;
			case XhtmlPackage.TABLE__CLASS:
				unsetClass();
				return;
			case XhtmlPackage.TABLE__FRAME:
				unsetFrame();
				return;
			case XhtmlPackage.TABLE__HL7_ID:
				setHl7Id(HL7_ID_EDEFAULT);
				return;
			case XhtmlPackage.TABLE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.TABLE__RULES:
				unsetRules();
				return;
			case XhtmlPackage.TABLE__STYLE:
				unsetStyle();
				return;
			case XhtmlPackage.TABLE__WIDTH:
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
			case XhtmlPackage.TABLE__CAPTION:
				return caption != null;
			case XhtmlPackage.TABLE__COL:
				return col != null && !col.isEmpty();
			case XhtmlPackage.TABLE__COLGROUP:
				return colgroup != null && !colgroup.isEmpty();
			case XhtmlPackage.TABLE__THEAD:
				return thead != null;
			case XhtmlPackage.TABLE__TFOOT:
				return tfoot != null;
			case XhtmlPackage.TABLE__TBODY:
				return tbody != null && !tbody.isEmpty();
			case XhtmlPackage.TABLE__TR:
				return tr != null && !tr.isEmpty();
			case XhtmlPackage.TABLE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case XhtmlPackage.TABLE__CELLPADDING:
				return CELLPADDING_EDEFAULT == null ? cellpadding != null : !CELLPADDING_EDEFAULT.equals(cellpadding);
			case XhtmlPackage.TABLE__CELLSPACING:
				return CELLSPACING_EDEFAULT == null ? cellspacing != null : !CELLSPACING_EDEFAULT.equals(cellspacing);
			case XhtmlPackage.TABLE__CLASS:
				return isSetClass();
			case XhtmlPackage.TABLE__FRAME:
				return isSetFrame();
			case XhtmlPackage.TABLE__HL7_ID:
				return HL7_ID_EDEFAULT == null ? hl7Id != null : !HL7_ID_EDEFAULT.equals(hl7Id);
			case XhtmlPackage.TABLE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.TABLE__RULES:
				return isSetRules();
			case XhtmlPackage.TABLE__STYLE:
				return isSetStyle();
			case XhtmlPackage.TABLE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (border: ");
		result.append(border);
		result.append(", cellpadding: ");
		result.append(cellpadding);
		result.append(", cellspacing: ");
		result.append(cellspacing);
		result.append(", class: ");
		if (classESet) result.append(class_); else result.append("<unset>");
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", hl7Id: ");
		result.append(hl7Id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rules: ");
		if (rulesESet) result.append(rules); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TableImpl
