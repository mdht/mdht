/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

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
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XhtmlValidator INSTANCE = new XhtmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.emf.w3c.xhtml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XhtmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XhtmlPackage.A:
				return validateA((A)value, diagnostics, context);
			case XhtmlPackage.ABBR:
				return validateAbbr((Abbr)value, diagnostics, context);
			case XhtmlPackage.ACONTENT:
				return validateAContent((AContent)value, diagnostics, context);
			case XhtmlPackage.ACRONYM:
				return validateAcronym((Acronym)value, diagnostics, context);
			case XhtmlPackage.B:
				return validateB((B)value, diagnostics, context);
			case XhtmlPackage.BIG:
				return validateBig((Big)value, diagnostics, context);
			case XhtmlPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case XhtmlPackage.BLOCKQUOTE:
				return validateBlockquote((Blockquote)value, diagnostics, context);
			case XhtmlPackage.BR:
				return validateBr((Br)value, diagnostics, context);
			case XhtmlPackage.CAPTION:
				return validateCaption((Caption)value, diagnostics, context);
			case XhtmlPackage.CITE:
				return validateCite((Cite)value, diagnostics, context);
			case XhtmlPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case XhtmlPackage.COL:
				return validateCol((Col)value, diagnostics, context);
			case XhtmlPackage.COLGROUP:
				return validateColgroup((Colgroup)value, diagnostics, context);
			case XhtmlPackage.DD:
				return validateDd((Dd)value, diagnostics, context);
			case XhtmlPackage.DEL:
				return validateDel((Del)value, diagnostics, context);
			case XhtmlPackage.DFN:
				return validateDfn((Dfn)value, diagnostics, context);
			case XhtmlPackage.DIV:
				return validateDiv((Div)value, diagnostics, context);
			case XhtmlPackage.DL:
				return validateDl((Dl)value, diagnostics, context);
			case XhtmlPackage.DT:
				return validateDt((Dt)value, diagnostics, context);
			case XhtmlPackage.EM:
				return validateEm((Em)value, diagnostics, context);
			case XhtmlPackage.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case XhtmlPackage.HR:
				return validateHr((Hr)value, diagnostics, context);
			case XhtmlPackage.I:
				return validateI((I)value, diagnostics, context);
			case XhtmlPackage.IMG:
				return validateImg((Img)value, diagnostics, context);
			case XhtmlPackage.INLINE:
				return validateInline((Inline)value, diagnostics, context);
			case XhtmlPackage.INS:
				return validateIns((Ins)value, diagnostics, context);
			case XhtmlPackage.KBD:
				return validateKbd((Kbd)value, diagnostics, context);
			case XhtmlPackage.LI:
				return validateLi((Li)value, diagnostics, context);
			case XhtmlPackage.OBJECT:
				return validateObject((org.openhealthtools.mdht.emf.w3c.xhtml.Object)value, diagnostics, context);
			case XhtmlPackage.OL:
				return validateOl((Ol)value, diagnostics, context);
			case XhtmlPackage.P:
				return validateP((P)value, diagnostics, context);
			case XhtmlPackage.PARAM:
				return validateParam((Param)value, diagnostics, context);
			case XhtmlPackage.PRE:
				return validatePre((Pre)value, diagnostics, context);
			case XhtmlPackage.PRE_CONTENT:
				return validatePreContent((PreContent)value, diagnostics, context);
			case XhtmlPackage.Q:
				return validateQ((Q)value, diagnostics, context);
			case XhtmlPackage.SAMP:
				return validateSamp((Samp)value, diagnostics, context);
			case XhtmlPackage.SMALL:
				return validateSmall((Small)value, diagnostics, context);
			case XhtmlPackage.SPAN:
				return validateSpan((Span)value, diagnostics, context);
			case XhtmlPackage.STRONG:
				return validateStrong((Strong)value, diagnostics, context);
			case XhtmlPackage.SUB:
				return validateSub((Sub)value, diagnostics, context);
			case XhtmlPackage.SUP:
				return validateSup((Sup)value, diagnostics, context);
			case XhtmlPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case XhtmlPackage.TBODY:
				return validateTbody((Tbody)value, diagnostics, context);
			case XhtmlPackage.TD:
				return validateTd((Td)value, diagnostics, context);
			case XhtmlPackage.TFOOT:
				return validateTfoot((Tfoot)value, diagnostics, context);
			case XhtmlPackage.TH:
				return validateTh((Th)value, diagnostics, context);
			case XhtmlPackage.THEAD:
				return validateThead((Thead)value, diagnostics, context);
			case XhtmlPackage.TR:
				return validateTr((Tr)value, diagnostics, context);
			case XhtmlPackage.TT:
				return validateTt((Tt)value, diagnostics, context);
			case XhtmlPackage.UL:
				return validateUl((Ul)value, diagnostics, context);
			case XhtmlPackage.VAR:
				return validateVar((Var)value, diagnostics, context);
			case XhtmlPackage.ALIGN_TYPE:
				return validateAlignType((AlignType)value, diagnostics, context);
			case XhtmlPackage.IMAGE_KIND:
				return validateImageKind((ImageKind)value, diagnostics, context);
			case XhtmlPackage.MEDIA_TYPE:
				return validateMediaType((MediaType)value, diagnostics, context);
			case XhtmlPackage.MIF_CLASS_TYPE:
				return validateMifClassType((MifClassType)value, diagnostics, context);
			case XhtmlPackage.OBJECT_NAME:
				return validateObjectName((ObjectName)value, diagnostics, context);
			case XhtmlPackage.PARAM_NAME:
				return validateParamName((ParamName)value, diagnostics, context);
			case XhtmlPackage.SHAPE:
				return validateShape((Shape)value, diagnostics, context);
			case XhtmlPackage.STYLE_SHEET:
				return validateStyleSheet((StyleSheet)value, diagnostics, context);
			case XhtmlPackage.TFRAME:
				return validateTFrame((TFrame)value, diagnostics, context);
			case XhtmlPackage.TRULES:
				return validateTRules((TRules)value, diagnostics, context);
			case XhtmlPackage.VALIGN_TYPE:
				return validateValignType((ValignType)value, diagnostics, context);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return validateAlignTypeObject((AlignType)value, diagnostics, context);
			case XhtmlPackage.CHARACTER:
				return validateCharacter((String)value, diagnostics, context);
			case XhtmlPackage.CONTENT_TYPE:
				return validateContentType(value, diagnostics, context);
			case XhtmlPackage.COORDS:
				return validateCoords((String)value, diagnostics, context);
			case XhtmlPackage.IMAGE_KIND_OBJECT:
				return validateImageKindObject((ImageKind)value, diagnostics, context);
			case XhtmlPackage.LENGTH:
				return validateLength((String)value, diagnostics, context);
			case XhtmlPackage.MEDIA_TYPE_OBJECT:
				return validateMediaTypeObject((MediaType)value, diagnostics, context);
			case XhtmlPackage.MIF_CLASS_TYPE_OBJECT:
				return validateMifClassTypeObject((MifClassType)value, diagnostics, context);
			case XhtmlPackage.MULTI_LENGTH:
				return validateMultiLength((String)value, diagnostics, context);
			case XhtmlPackage.NUMBER:
				return validateNumber((BigInteger)value, diagnostics, context);
			case XhtmlPackage.OBJECT_NAME_OBJECT:
				return validateObjectNameObject((ObjectName)value, diagnostics, context);
			case XhtmlPackage.PARAM_NAME_OBJECT:
				return validateParamNameObject((ParamName)value, diagnostics, context);
			case XhtmlPackage.PARAM_VALUE:
				return validateParamValue((String)value, diagnostics, context);
			case XhtmlPackage.PIXELS:
				return validatePixels((BigInteger)value, diagnostics, context);
			case XhtmlPackage.SHAPE_OBJECT:
				return validateShapeObject((Shape)value, diagnostics, context);
			case XhtmlPackage.STYLE_SHEET_OBJECT:
				return validateStyleSheetObject((StyleSheet)value, diagnostics, context);
			case XhtmlPackage.TEXT:
				return validateText((String)value, diagnostics, context);
			case XhtmlPackage.TFRAME_OBJECT:
				return validateTFrameObject((TFrame)value, diagnostics, context);
			case XhtmlPackage.TRULES_OBJECT:
				return validateTRulesObject((TRules)value, diagnostics, context);
			case XhtmlPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return validateValignTypeObject((ValignType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateA(A a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbbr(Abbr abbr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abbr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAContent(AContent aContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcronym(Acronym acronym, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acronym, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateB(B b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBig(Big big, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(big, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockquote(Blockquote blockquote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockquote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBr(Br br, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(br, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaption(Caption caption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCite(Cite cite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCol(Col col, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(col, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColgroup(Colgroup colgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colgroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDd(Dd dd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDel(Del del, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(del, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDfn(Dfn dfn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dfn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiv(Div div, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(div, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDl(Dl dl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDt(Dt dt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEm(Em em, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(em, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHr(Hr hr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI(I i, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(i, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImg(Img img, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(img, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInline(Inline inline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIns(Ins ins, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ins, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKbd(Kbd kbd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kbd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLi(Li li, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(li, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(object, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOl(Ol ol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP(P p, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(p, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParam(Param param, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(param, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePre(Pre pre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreContent(PreContent preContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQ(Q q, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(q, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSamp(Samp samp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(samp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmall(Small small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(small, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpan(Span span, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(span, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrong(Strong strong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strong, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSub(Sub sub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSup(Sup sup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTbody(Tbody tbody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbody, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTd(Td td, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(td, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTfoot(Tfoot tfoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tfoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTh(Th th, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(th, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThead(Thead thead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thead, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTr(Tr tr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTt(Tt tt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUl(Ul ul, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ul, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVar(Var var, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(var, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType(AlignType alignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageKind(ImageKind imageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaType(MediaType mediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMifClassType(MifClassType mifClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectName(ObjectName objectName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamName(ParamName paramName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSheet(StyleSheet styleSheet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFrame(TFrame tFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRules(TRules tRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValignType(ValignType valignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject(AlignType alignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacter_MinLength(character, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_MaxLength(character, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MinLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XhtmlPackage.Literals.CHARACTER, character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MaxLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XhtmlPackage.Literals.CHARACTER, character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(Object contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateContentType_MemberTypes(contentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType_MemberTypes(Object contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XhtmlPackage.Literals.MEDIA_TYPE.isInstance(contentType)) {
				if (validateMediaType((MediaType)contentType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(contentType)) {
				if (xmlTypeValidator.validateString((String)contentType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XhtmlPackage.Literals.MEDIA_TYPE.isInstance(contentType)) {
				if (validateMediaType((MediaType)contentType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(contentType)) {
				if (xmlTypeValidator.validateString((String)contentType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoords(String coords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCoords_Pattern(coords, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoords_MaxLength(coords, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCoords_Pattern
	 */
	public static final  PatternMatcher [][] COORDS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%)(,\\s*[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Coords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoords_Pattern(String coords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XhtmlPackage.Literals.COORDS, coords, COORDS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Coords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoords_MaxLength(String coords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = coords.length();
		boolean result = length <= 500;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XhtmlPackage.Literals.COORDS, coords, length, 500, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageKindObject(ImageKind imageKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(length, diagnostics, context);
		if (result || diagnostics != null) result &= validateLength_MaxLength(length, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLength_Pattern
	 */
	public static final  PatternMatcher [][] LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_Pattern(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XhtmlPackage.Literals.LENGTH, length, LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLength_MaxLength(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// refactored generated code to modify duplicate variable name
		//int length = length.length();  
		int len = length.length();  
		boolean result = len <= 10;
		if (!result && diagnostics != null) 
			reportMaxLengthViolation(XhtmlPackage.Literals.LENGTH, len, len, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaTypeObject(MediaType mediaTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMifClassTypeObject(MifClassType mifClassTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength(String multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMultiLength_Pattern(multiLength, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiLength_MaxLength(multiLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMultiLength_Pattern
	 */
	public static final  PatternMatcher [][] MULTI_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%)|[1-9]?(\\d+)?\\*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Multi Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength_Pattern(String multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XhtmlPackage.Literals.MULTI_LENGTH, multiLength, MULTI_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Multi Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength_MaxLength(String multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = multiLength.length();
		boolean result = length <= 500;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XhtmlPackage.Literals.MULTI_LENGTH, multiLength, length, 500, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(number, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_Pattern(number, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_Max(number, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumber_Pattern
	 */
	public static final  PatternMatcher [][] NUMBER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Pattern(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(XhtmlPackage.Literals.NUMBER, number, NUMBER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumber_Max
	 */
	public static final BigInteger NUMBER__MAX__VALUE = new BigInteger("100");

	/**
	 * Validates the Max constraint of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Max(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = number.compareTo(NUMBER__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XhtmlPackage.Literals.NUMBER, number, NUMBER__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNameObject(ObjectName objectNameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamNameObject(ParamName paramNameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamValue(String paramValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixels(BigInteger pixels, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(pixels, diagnostics, context);
		if (result || diagnostics != null) result &= validatePixels_Max(pixels, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePixels_Max
	 */
	public static final BigInteger PIXELS__MAX__VALUE = new BigInteger("10000");

	/**
	 * Validates the Max constraint of '<em>Pixels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixels_Max(BigInteger pixels, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = pixels.compareTo(PIXELS__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(XhtmlPackage.Literals.PIXELS, pixels, PIXELS__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeObject(Shape shapeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSheetObject(StyleSheet styleSheetObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(String text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateText_MinLength(text, diagnostics, context);
		if (result || diagnostics != null) result &= validateText_MaxLength(text, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_MinLength(String text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = text.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XhtmlPackage.Literals.TEXT, text, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText_MaxLength(String text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = text.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XhtmlPackage.Literals.TEXT, text, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFrameObject(TFrame tFrameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRulesObject(TRules tRulesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURI_MinLength(uri, diagnostics, context);
		if (result || diagnostics != null) result &= validateURI_MaxLength(uri, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI_MinLength(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uri.length();
		boolean result = length >= 5;
		if (!result && diagnostics != null)
			reportMinLengthViolation(XhtmlPackage.Literals.URI, uri, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI_MaxLength(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uri.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(XhtmlPackage.Literals.URI, uri, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValignTypeObject(ValignType valignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XhtmlValidator
