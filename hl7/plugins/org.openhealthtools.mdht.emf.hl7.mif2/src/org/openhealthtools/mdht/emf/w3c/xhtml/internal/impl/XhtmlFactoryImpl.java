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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.mdht.emf.w3c.xhtml.A;
import org.openhealthtools.mdht.emf.w3c.xhtml.AContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Abbr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Acronym;
import org.openhealthtools.mdht.emf.w3c.xhtml.AlignType;
import org.openhealthtools.mdht.emf.w3c.xhtml.B;
import org.openhealthtools.mdht.emf.w3c.xhtml.Big;
import org.openhealthtools.mdht.emf.w3c.xhtml.Block;
import org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote;
import org.openhealthtools.mdht.emf.w3c.xhtml.Br;
import org.openhealthtools.mdht.emf.w3c.xhtml.Caption;
import org.openhealthtools.mdht.emf.w3c.xhtml.Cite;
import org.openhealthtools.mdht.emf.w3c.xhtml.Code;
import org.openhealthtools.mdht.emf.w3c.xhtml.Col;
import org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dd;
import org.openhealthtools.mdht.emf.w3c.xhtml.Del;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dfn;
import org.openhealthtools.mdht.emf.w3c.xhtml.Div;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dl;
import org.openhealthtools.mdht.emf.w3c.xhtml.Dt;
import org.openhealthtools.mdht.emf.w3c.xhtml.Em;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;
import org.openhealthtools.mdht.emf.w3c.xhtml.Hr;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ins;
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.Li;
import org.openhealthtools.mdht.emf.w3c.xhtml.MediaType;
import org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType;
import org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Param;
import org.openhealthtools.mdht.emf.w3c.xhtml.ParamName;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.PreContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Q;
import org.openhealthtools.mdht.emf.w3c.xhtml.Samp;
import org.openhealthtools.mdht.emf.w3c.xhtml.Shape;
import org.openhealthtools.mdht.emf.w3c.xhtml.Small;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.TFrame;
import org.openhealthtools.mdht.emf.w3c.xhtml.TRules;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tbody;
import org.openhealthtools.mdht.emf.w3c.xhtml.Td;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot;
import org.openhealthtools.mdht.emf.w3c.xhtml.Th;
import org.openhealthtools.mdht.emf.w3c.xhtml.Thead;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tt;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.ValignType;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlFactory;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlFactoryImpl extends EFactoryImpl implements XhtmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XhtmlFactory init() {
		try {
			XhtmlFactory theXhtmlFactory = (XhtmlFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/1999/xhtml");
			if (theXhtmlFactory != null) {
				return theXhtmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XhtmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XhtmlPackage.A:
				return createA();
			case XhtmlPackage.ABBR:
				return createAbbr();
			case XhtmlPackage.ACONTENT:
				return createAContent();
			case XhtmlPackage.ACRONYM:
				return createAcronym();
			case XhtmlPackage.B:
				return createB();
			case XhtmlPackage.BIG:
				return createBig();
			case XhtmlPackage.BLOCK:
				return createBlock();
			case XhtmlPackage.BLOCKQUOTE:
				return createBlockquote();
			case XhtmlPackage.BR:
				return createBr();
			case XhtmlPackage.CAPTION:
				return createCaption();
			case XhtmlPackage.CITE:
				return createCite();
			case XhtmlPackage.CODE:
				return createCode();
			case XhtmlPackage.COL:
				return createCol();
			case XhtmlPackage.COLGROUP:
				return createColgroup();
			case XhtmlPackage.DD:
				return createDd();
			case XhtmlPackage.DEL:
				return createDel();
			case XhtmlPackage.DFN:
				return createDfn();
			case XhtmlPackage.DIV:
				return createDiv();
			case XhtmlPackage.DL:
				return createDl();
			case XhtmlPackage.DT:
				return createDt();
			case XhtmlPackage.EM:
				return createEm();
			case XhtmlPackage.FLOW:
				return createFlow();
			case XhtmlPackage.HR:
				return createHr();
			case XhtmlPackage.I:
				return createI();
			case XhtmlPackage.IMG:
				return createImg();
			case XhtmlPackage.INLINE:
				return createInline();
			case XhtmlPackage.INS:
				return createIns();
			case XhtmlPackage.KBD:
				return createKbd();
			case XhtmlPackage.LI:
				return createLi();
			case XhtmlPackage.OBJECT:
				return createObject();
			case XhtmlPackage.OL:
				return createOl();
			case XhtmlPackage.P:
				return createP();
			case XhtmlPackage.PARAM:
				return createParam();
			case XhtmlPackage.PRE:
				return createPre();
			case XhtmlPackage.PRE_CONTENT:
				return createPreContent();
			case XhtmlPackage.Q:
				return createQ();
			case XhtmlPackage.SAMP:
				return createSamp();
			case XhtmlPackage.SMALL:
				return createSmall();
			case XhtmlPackage.SPAN:
				return createSpan();
			case XhtmlPackage.STRONG:
				return createStrong();
			case XhtmlPackage.SUB:
				return createSub();
			case XhtmlPackage.SUP:
				return createSup();
			case XhtmlPackage.TABLE:
				return createTable();
			case XhtmlPackage.TBODY:
				return createTbody();
			case XhtmlPackage.TD:
				return createTd();
			case XhtmlPackage.TFOOT:
				return createTfoot();
			case XhtmlPackage.TH:
				return createTh();
			case XhtmlPackage.THEAD:
				return createThead();
			case XhtmlPackage.TR:
				return createTr();
			case XhtmlPackage.TT:
				return createTt();
			case XhtmlPackage.UL:
				return createUl();
			case XhtmlPackage.VAR:
				return createVar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.IMAGE_KIND:
				return createImageKindFromString(eDataType, initialValue);
			case XhtmlPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case XhtmlPackage.MIF_CLASS_TYPE:
				return createMifClassTypeFromString(eDataType, initialValue);
			case XhtmlPackage.OBJECT_NAME:
				return createObjectNameFromString(eDataType, initialValue);
			case XhtmlPackage.PARAM_NAME:
				return createParamNameFromString(eDataType, initialValue);
			case XhtmlPackage.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			case XhtmlPackage.STYLE_SHEET:
				return createStyleSheetFromString(eDataType, initialValue);
			case XhtmlPackage.TFRAME:
				return createTFrameFromString(eDataType, initialValue);
			case XhtmlPackage.TRULES:
				return createTRulesFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case XhtmlPackage.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case XhtmlPackage.COORDS:
				return createCoordsFromString(eDataType, initialValue);
			case XhtmlPackage.IMAGE_KIND_OBJECT:
				return createImageKindObjectFromString(eDataType, initialValue);
			case XhtmlPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case XhtmlPackage.MEDIA_TYPE_OBJECT:
				return createMediaTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.MIF_CLASS_TYPE_OBJECT:
				return createMifClassTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.MULTI_LENGTH:
				return createMultiLengthFromString(eDataType, initialValue);
			case XhtmlPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case XhtmlPackage.OBJECT_NAME_OBJECT:
				return createObjectNameObjectFromString(eDataType, initialValue);
			case XhtmlPackage.PARAM_NAME_OBJECT:
				return createParamNameObjectFromString(eDataType, initialValue);
			case XhtmlPackage.PARAM_VALUE:
				return createParamValueFromString(eDataType, initialValue);
			case XhtmlPackage.PIXELS:
				return createPixelsFromString(eDataType, initialValue);
			case XhtmlPackage.SHAPE_OBJECT:
				return createShapeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.STYLE_SHEET_OBJECT:
				return createStyleSheetObjectFromString(eDataType, initialValue);
			case XhtmlPackage.TEXT:
				return createTextFromString(eDataType, initialValue);
			case XhtmlPackage.TFRAME_OBJECT:
				return createTFrameObjectFromString(eDataType, initialValue);
			case XhtmlPackage.TRULES_OBJECT:
				return createTRulesObjectFromString(eDataType, initialValue);
			case XhtmlPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.IMAGE_KIND:
				return convertImageKindToString(eDataType, instanceValue);
			case XhtmlPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case XhtmlPackage.MIF_CLASS_TYPE:
				return convertMifClassTypeToString(eDataType, instanceValue);
			case XhtmlPackage.OBJECT_NAME:
				return convertObjectNameToString(eDataType, instanceValue);
			case XhtmlPackage.PARAM_NAME:
				return convertParamNameToString(eDataType, instanceValue);
			case XhtmlPackage.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			case XhtmlPackage.STYLE_SHEET:
				return convertStyleSheetToString(eDataType, instanceValue);
			case XhtmlPackage.TFRAME:
				return convertTFrameToString(eDataType, instanceValue);
			case XhtmlPackage.TRULES:
				return convertTRulesToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case XhtmlPackage.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case XhtmlPackage.COORDS:
				return convertCoordsToString(eDataType, instanceValue);
			case XhtmlPackage.IMAGE_KIND_OBJECT:
				return convertImageKindObjectToString(eDataType, instanceValue);
			case XhtmlPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case XhtmlPackage.MEDIA_TYPE_OBJECT:
				return convertMediaTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.MIF_CLASS_TYPE_OBJECT:
				return convertMifClassTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.MULTI_LENGTH:
				return convertMultiLengthToString(eDataType, instanceValue);
			case XhtmlPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case XhtmlPackage.OBJECT_NAME_OBJECT:
				return convertObjectNameObjectToString(eDataType, instanceValue);
			case XhtmlPackage.PARAM_NAME_OBJECT:
				return convertParamNameObjectToString(eDataType, instanceValue);
			case XhtmlPackage.PARAM_VALUE:
				return convertParamValueToString(eDataType, instanceValue);
			case XhtmlPackage.PIXELS:
				return convertPixelsToString(eDataType, instanceValue);
			case XhtmlPackage.SHAPE_OBJECT:
				return convertShapeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.STYLE_SHEET_OBJECT:
				return convertStyleSheetObjectToString(eDataType, instanceValue);
			case XhtmlPackage.TEXT:
				return convertTextToString(eDataType, instanceValue);
			case XhtmlPackage.TFRAME_OBJECT:
				return convertTFrameObjectToString(eDataType, instanceValue);
			case XhtmlPackage.TRULES_OBJECT:
				return convertTRulesObjectToString(eDataType, instanceValue);
			case XhtmlPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A createA() {
		AImpl a = new AImpl();
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abbr createAbbr() {
		AbbrImpl abbr = new AbbrImpl();
		return abbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AContent createAContent() {
		AContentImpl aContent = new AContentImpl();
		return aContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Acronym createAcronym() {
		AcronymImpl acronym = new AcronymImpl();
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B createB() {
		BImpl b = new BImpl();
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Big createBig() {
		BigImpl big = new BigImpl();
		return big;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blockquote createBlockquote() {
		BlockquoteImpl blockquote = new BlockquoteImpl();
		return blockquote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Br createBr() {
		BrImpl br = new BrImpl();
		return br;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caption createCaption() {
		CaptionImpl caption = new CaptionImpl();
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cite createCite() {
		CiteImpl cite = new CiteImpl();
		return cite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Col createCol() {
		ColImpl col = new ColImpl();
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colgroup createColgroup() {
		ColgroupImpl colgroup = new ColgroupImpl();
		return colgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dd createDd() {
		DdImpl dd = new DdImpl();
		return dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Del createDel() {
		DelImpl del = new DelImpl();
		return del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dfn createDfn() {
		DfnImpl dfn = new DfnImpl();
		return dfn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dl createDl() {
		DlImpl dl = new DlImpl();
		return dl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dt createDt() {
		DtImpl dt = new DtImpl();
		return dt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Em createEm() {
		EmImpl em = new EmImpl();
		return em;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hr createHr() {
		HrImpl hr = new HrImpl();
		return hr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I createI() {
		IImpl i = new IImpl();
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img createImg() {
		ImgImpl img = new ImgImpl();
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline createInline() {
		InlineImpl inline = new InlineImpl();
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ins createIns() {
		InsImpl ins = new InsImpl();
		return ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kbd createKbd() {
		KbdImpl kbd = new KbdImpl();
		return kbd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Li createLi() {
		LiImpl li = new LiImpl();
		return li;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.openhealthtools.mdht.emf.w3c.xhtml.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ol createOl() {
		OlImpl ol = new OlImpl();
		return ol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pre createPre() {
		PreImpl pre = new PreImpl();
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreContent createPreContent() {
		PreContentImpl preContent = new PreContentImpl();
		return preContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Q createQ() {
		QImpl q = new QImpl();
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Samp createSamp() {
		SampImpl samp = new SampImpl();
		return samp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Small createSmall() {
		SmallImpl small = new SmallImpl();
		return small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strong createStrong() {
		StrongImpl strong = new StrongImpl();
		return strong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sup createSup() {
		SupImpl sup = new SupImpl();
		return sup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tbody createTbody() {
		TbodyImpl tbody = new TbodyImpl();
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Td createTd() {
		TdImpl td = new TdImpl();
		return td;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tfoot createTfoot() {
		TfootImpl tfoot = new TfootImpl();
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Th createTh() {
		ThImpl th = new ThImpl();
		return th;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thead createThead() {
		TheadImpl thead = new TheadImpl();
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tr createTr() {
		TrImpl tr = new TrImpl();
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tt createTt() {
		TtImpl tt = new TtImpl();
		return tt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ul createUl() {
		UlImpl ul = new UlImpl();
		return ul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageKind createImageKindFromString(EDataType eDataType, String initialValue) {
		ImageKind result = ImageKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifClassType createMifClassTypeFromString(EDataType eDataType, String initialValue) {
		MifClassType result = MifClassType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMifClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectName createObjectNameFromString(EDataType eDataType, String initialValue) {
		ObjectName result = ObjectName.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamName createParamNameFromString(EDataType eDataType, String initialValue) {
		ParamName result = ParamName.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet createStyleSheetFromString(EDataType eDataType, String initialValue) {
		StyleSheet result = StyleSheet.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleSheetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameFromString(EDataType eDataType, String initialValue) {
		TFrame result = TFrame.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesFromString(EDataType eDataType, String initialValue) {
		TRules result = TRules.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(XhtmlPackage.Literals.ALIGN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(XhtmlPackage.Literals.ALIGN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createContentTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMediaTypeFromString(XhtmlPackage.Literals.MEDIA_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		} catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		} catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) {
			return result;
		}

		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		if (XhtmlPackage.Literals.MEDIA_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertMediaTypeToString(XhtmlPackage.Literals.MEDIA_TYPE, instanceValue);
				if (value != null) {
					return value;
				}
			} catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) {
					return value;
				}
			} catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '" + instanceValue + "' for datatype :" +
				eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCoordsFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageKind createImageKindObjectFromString(EDataType eDataType, String initialValue) {
		return createImageKindFromString(XhtmlPackage.Literals.IMAGE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImageKindToString(XhtmlPackage.Literals.IMAGE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMediaTypeFromString(XhtmlPackage.Literals.MEDIA_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMediaTypeToString(XhtmlPackage.Literals.MEDIA_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifClassType createMifClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMifClassTypeFromString(XhtmlPackage.Literals.MIF_CLASS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMifClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMifClassTypeToString(XhtmlPackage.Literals.MIF_CLASS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMultiLengthFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(
			XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectName createObjectNameObjectFromString(EDataType eDataType, String initialValue) {
		return createObjectNameFromString(XhtmlPackage.Literals.OBJECT_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObjectNameToString(XhtmlPackage.Literals.OBJECT_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamName createParamNameObjectFromString(EDataType eDataType, String initialValue) {
		return createParamNameFromString(XhtmlPackage.Literals.PARAM_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamNameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParamNameToString(XhtmlPackage.Literals.PARAM_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParamValueFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPixelsFromString(EDataType eDataType, String initialValue) {
		return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(
			XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeObjectFromString(EDataType eDataType, String initialValue) {
		return createShapeFromString(XhtmlPackage.Literals.SHAPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShapeToString(XhtmlPackage.Literals.SHAPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet createStyleSheetObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleSheetFromString(XhtmlPackage.Literals.STYLE_SHEET, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleSheetObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleSheetToString(XhtmlPackage.Literals.STYLE_SHEET, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameObjectFromString(EDataType eDataType, String initialValue) {
		return createTFrameFromString(XhtmlPackage.Literals.TFRAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFrameToString(XhtmlPackage.Literals.TFRAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesObjectFromString(EDataType eDataType, String initialValue) {
		return createTRulesFromString(XhtmlPackage.Literals.TRULES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTRulesToString(XhtmlPackage.Literals.TRULES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(XhtmlPackage.Literals.VALIGN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(XhtmlPackage.Literals.VALIGN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlPackage getXhtmlPackage() {
		return (XhtmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XhtmlPackage getPackage() {
		return XhtmlPackage.eINSTANCE;
	}

} // XhtmlFactoryImpl
