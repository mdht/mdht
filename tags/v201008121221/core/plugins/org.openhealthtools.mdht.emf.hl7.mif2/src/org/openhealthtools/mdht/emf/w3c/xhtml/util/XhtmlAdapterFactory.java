/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.A;
import org.openhealthtools.mdht.emf.w3c.xhtml.AContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Abbr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Acronym;
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
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ins;
import org.openhealthtools.mdht.emf.w3c.xhtml.Kbd;
import org.openhealthtools.mdht.emf.w3c.xhtml.Li;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Param;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.PreContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Q;
import org.openhealthtools.mdht.emf.w3c.xhtml.Samp;
import org.openhealthtools.mdht.emf.w3c.xhtml.Small;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tbody;
import org.openhealthtools.mdht.emf.w3c.xhtml.Td;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot;
import org.openhealthtools.mdht.emf.w3c.xhtml.Th;
import org.openhealthtools.mdht.emf.w3c.xhtml.Thead;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tt;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XhtmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XhtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XhtmlSwitch<Adapter> modelSwitch =
		new XhtmlSwitch<Adapter>() {
			@Override
			public Adapter caseA(A object) {
				return createAAdapter();
			}
			@Override
			public Adapter caseAbbr(Abbr object) {
				return createAbbrAdapter();
			}
			@Override
			public Adapter caseAContent(AContent object) {
				return createAContentAdapter();
			}
			@Override
			public Adapter caseAcronym(Acronym object) {
				return createAcronymAdapter();
			}
			@Override
			public Adapter caseB(B object) {
				return createBAdapter();
			}
			@Override
			public Adapter caseBig(Big object) {
				return createBigAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseBlockquote(Blockquote object) {
				return createBlockquoteAdapter();
			}
			@Override
			public Adapter caseBr(Br object) {
				return createBrAdapter();
			}
			@Override
			public Adapter caseCaption(Caption object) {
				return createCaptionAdapter();
			}
			@Override
			public Adapter caseCite(Cite object) {
				return createCiteAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCol(Col object) {
				return createColAdapter();
			}
			@Override
			public Adapter caseColgroup(Colgroup object) {
				return createColgroupAdapter();
			}
			@Override
			public Adapter caseDd(Dd object) {
				return createDdAdapter();
			}
			@Override
			public Adapter caseDel(Del object) {
				return createDelAdapter();
			}
			@Override
			public Adapter caseDfn(Dfn object) {
				return createDfnAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter caseDl(Dl object) {
				return createDlAdapter();
			}
			@Override
			public Adapter caseDt(Dt object) {
				return createDtAdapter();
			}
			@Override
			public Adapter caseEm(Em object) {
				return createEmAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseHr(Hr object) {
				return createHrAdapter();
			}
			@Override
			public Adapter caseI(I object) {
				return createIAdapter();
			}
			@Override
			public Adapter caseImg(Img object) {
				return createImgAdapter();
			}
			@Override
			public Adapter caseInline(Inline object) {
				return createInlineAdapter();
			}
			@Override
			public Adapter caseIns(Ins object) {
				return createInsAdapter();
			}
			@Override
			public Adapter caseKbd(Kbd object) {
				return createKbdAdapter();
			}
			@Override
			public Adapter caseLi(Li object) {
				return createLiAdapter();
			}
			@Override
			public Adapter caseObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseOl(Ol object) {
				return createOlAdapter();
			}
			@Override
			public Adapter caseP(P object) {
				return createPAdapter();
			}
			@Override
			public Adapter caseParam(Param object) {
				return createParamAdapter();
			}
			@Override
			public Adapter casePre(Pre object) {
				return createPreAdapter();
			}
			@Override
			public Adapter casePreContent(PreContent object) {
				return createPreContentAdapter();
			}
			@Override
			public Adapter caseQ(Q object) {
				return createQAdapter();
			}
			@Override
			public Adapter caseSamp(Samp object) {
				return createSampAdapter();
			}
			@Override
			public Adapter caseSmall(Small object) {
				return createSmallAdapter();
			}
			@Override
			public Adapter caseSpan(Span object) {
				return createSpanAdapter();
			}
			@Override
			public Adapter caseStrong(Strong object) {
				return createStrongAdapter();
			}
			@Override
			public Adapter caseSub(Sub object) {
				return createSubAdapter();
			}
			@Override
			public Adapter caseSup(Sup object) {
				return createSupAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTbody(Tbody object) {
				return createTbodyAdapter();
			}
			@Override
			public Adapter caseTd(Td object) {
				return createTdAdapter();
			}
			@Override
			public Adapter caseTfoot(Tfoot object) {
				return createTfootAdapter();
			}
			@Override
			public Adapter caseTh(Th object) {
				return createThAdapter();
			}
			@Override
			public Adapter caseThead(Thead object) {
				return createTheadAdapter();
			}
			@Override
			public Adapter caseTr(Tr object) {
				return createTrAdapter();
			}
			@Override
			public Adapter caseTt(Tt object) {
				return createTtAdapter();
			}
			@Override
			public Adapter caseUl(Ul object) {
				return createUlAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A
	 * @generated
	 */
	public Adapter createAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Abbr
	 * @generated
	 */
	public Adapter createAbbrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent
	 * @generated
	 */
	public Adapter createAContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Acronym
	 * @generated
	 */
	public Adapter createAcronymAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.B
	 * @generated
	 */
	public Adapter createBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Big <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Big
	 * @generated
	 */
	public Adapter createBigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote
	 * @generated
	 */
	public Adapter createBlockquoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Br <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Br
	 * @generated
	 */
	public Adapter createBrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Caption
	 * @generated
	 */
	public Adapter createCaptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Cite
	 * @generated
	 */
	public Adapter createCiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col
	 * @generated
	 */
	public Adapter createColAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup
	 * @generated
	 */
	public Adapter createColgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dd
	 * @generated
	 */
	public Adapter createDdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Del <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Del
	 * @generated
	 */
	public Adapter createDelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dfn
	 * @generated
	 */
	public Adapter createDfnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl
	 * @generated
	 */
	public Adapter createDlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dt
	 * @generated
	 */
	public Adapter createDtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Em <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Em
	 * @generated
	 */
	public Adapter createEmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Hr
	 * @generated
	 */
	public Adapter createHrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.I <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.I
	 * @generated
	 */
	public Adapter createIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img
	 * @generated
	 */
	public Adapter createImgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline
	 * @generated
	 */
	public Adapter createInlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ins <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ins
	 * @generated
	 */
	public Adapter createInsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Kbd
	 * @generated
	 */
	public Adapter createKbdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Li <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Li
	 * @generated
	 */
	public Adapter createLiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol
	 * @generated
	 */
	public Adapter createOlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.P
	 * @generated
	 */
	public Adapter createPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre
	 * @generated
	 */
	public Adapter createPreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent
	 * @generated
	 */
	public Adapter createPreContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q
	 * @generated
	 */
	public Adapter createQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Samp
	 * @generated
	 */
	public Adapter createSampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Small <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Small
	 * @generated
	 */
	public Adapter createSmallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Span
	 * @generated
	 */
	public Adapter createSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Strong
	 * @generated
	 */
	public Adapter createStrongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sub
	 * @generated
	 */
	public Adapter createSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sup
	 * @generated
	 */
	public Adapter createSupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody
	 * @generated
	 */
	public Adapter createTbodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td
	 * @generated
	 */
	public Adapter createTdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot
	 * @generated
	 */
	public Adapter createTfootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th
	 * @generated
	 */
	public Adapter createThAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead
	 * @generated
	 */
	public Adapter createTheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr
	 * @generated
	 */
	public Adapter createTrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tt
	 * @generated
	 */
	public Adapter createTtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul
	 * @generated
	 */
	public Adapter createUlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XhtmlAdapterFactory
