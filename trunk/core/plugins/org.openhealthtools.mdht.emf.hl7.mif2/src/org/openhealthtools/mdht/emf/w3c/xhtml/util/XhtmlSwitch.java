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
package org.openhealthtools.mdht.emf.w3c.xhtml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XhtmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlSwitch() {
		if (modelPackage == null) {
			modelPackage = XhtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XhtmlPackage.A: {
				A a = (A) theEObject;
				T result = caseA(a);
				if (result == null) {
					result = caseAContent(a);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.ABBR: {
				Abbr abbr = (Abbr) theEObject;
				T result = caseAbbr(abbr);
				if (result == null) {
					result = caseInline(abbr);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.ACONTENT: {
				AContent aContent = (AContent) theEObject;
				T result = caseAContent(aContent);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.ACRONYM: {
				Acronym acronym = (Acronym) theEObject;
				T result = caseAcronym(acronym);
				if (result == null) {
					result = caseInline(acronym);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.B: {
				B b = (B) theEObject;
				T result = caseB(b);
				if (result == null) {
					result = caseInline(b);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.BIG: {
				Big big = (Big) theEObject;
				T result = caseBig(big);
				if (result == null) {
					result = caseInline(big);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.BLOCK: {
				Block block = (Block) theEObject;
				T result = caseBlock(block);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.BLOCKQUOTE: {
				Blockquote blockquote = (Blockquote) theEObject;
				T result = caseBlockquote(blockquote);
				if (result == null) {
					result = caseBlock(blockquote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.BR: {
				Br br = (Br) theEObject;
				T result = caseBr(br);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.CAPTION: {
				Caption caption = (Caption) theEObject;
				T result = caseCaption(caption);
				if (result == null) {
					result = caseInline(caption);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.CITE: {
				Cite cite = (Cite) theEObject;
				T result = caseCite(cite);
				if (result == null) {
					result = caseInline(cite);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.CODE: {
				Code code = (Code) theEObject;
				T result = caseCode(code);
				if (result == null) {
					result = caseInline(code);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.COL: {
				Col col = (Col) theEObject;
				T result = caseCol(col);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.COLGROUP: {
				Colgroup colgroup = (Colgroup) theEObject;
				T result = caseColgroup(colgroup);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DD: {
				Dd dd = (Dd) theEObject;
				T result = caseDd(dd);
				if (result == null) {
					result = caseFlow(dd);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DEL: {
				Del del = (Del) theEObject;
				T result = caseDel(del);
				if (result == null) {
					result = caseFlow(del);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DFN: {
				Dfn dfn = (Dfn) theEObject;
				T result = caseDfn(dfn);
				if (result == null) {
					result = caseInline(dfn);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DIV: {
				Div div = (Div) theEObject;
				T result = caseDiv(div);
				if (result == null) {
					result = caseFlow(div);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DL: {
				Dl dl = (Dl) theEObject;
				T result = caseDl(dl);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.DT: {
				Dt dt = (Dt) theEObject;
				T result = caseDt(dt);
				if (result == null) {
					result = caseInline(dt);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.EM: {
				Em em = (Em) theEObject;
				T result = caseEm(em);
				if (result == null) {
					result = caseInline(em);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.FLOW: {
				Flow flow = (Flow) theEObject;
				T result = caseFlow(flow);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.HR: {
				Hr hr = (Hr) theEObject;
				T result = caseHr(hr);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.I: {
				I i = (I) theEObject;
				T result = caseI(i);
				if (result == null) {
					result = caseInline(i);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.IMG: {
				Img img = (Img) theEObject;
				T result = caseImg(img);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.INLINE: {
				Inline inline = (Inline) theEObject;
				T result = caseInline(inline);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.INS: {
				Ins ins = (Ins) theEObject;
				T result = caseIns(ins);
				if (result == null) {
					result = caseFlow(ins);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.KBD: {
				Kbd kbd = (Kbd) theEObject;
				T result = caseKbd(kbd);
				if (result == null) {
					result = caseInline(kbd);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.LI: {
				Li li = (Li) theEObject;
				T result = caseLi(li);
				if (result == null) {
					result = caseFlow(li);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.OBJECT: {
				org.openhealthtools.mdht.emf.w3c.xhtml.Object object = (org.openhealthtools.mdht.emf.w3c.xhtml.Object) theEObject;
				T result = caseObject(object);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.OL: {
				Ol ol = (Ol) theEObject;
				T result = caseOl(ol);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.P: {
				P p = (P) theEObject;
				T result = caseP(p);
				if (result == null) {
					result = caseInline(p);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.PARAM: {
				Param param = (Param) theEObject;
				T result = caseParam(param);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.PRE: {
				Pre pre = (Pre) theEObject;
				T result = casePre(pre);
				if (result == null) {
					result = casePreContent(pre);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.PRE_CONTENT: {
				PreContent preContent = (PreContent) theEObject;
				T result = casePreContent(preContent);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.Q: {
				Q q = (Q) theEObject;
				T result = caseQ(q);
				if (result == null) {
					result = caseInline(q);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.SAMP: {
				Samp samp = (Samp) theEObject;
				T result = caseSamp(samp);
				if (result == null) {
					result = caseInline(samp);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.SMALL: {
				Small small = (Small) theEObject;
				T result = caseSmall(small);
				if (result == null) {
					result = caseInline(small);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.SPAN: {
				Span span = (Span) theEObject;
				T result = caseSpan(span);
				if (result == null) {
					result = caseInline(span);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.STRONG: {
				Strong strong = (Strong) theEObject;
				T result = caseStrong(strong);
				if (result == null) {
					result = caseInline(strong);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.SUB: {
				Sub sub = (Sub) theEObject;
				T result = caseSub(sub);
				if (result == null) {
					result = caseInline(sub);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.SUP: {
				Sup sup = (Sup) theEObject;
				T result = caseSup(sup);
				if (result == null) {
					result = caseInline(sup);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TABLE: {
				Table table = (Table) theEObject;
				T result = caseTable(table);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TBODY: {
				Tbody tbody = (Tbody) theEObject;
				T result = caseTbody(tbody);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TD: {
				Td td = (Td) theEObject;
				T result = caseTd(td);
				if (result == null) {
					result = caseFlow(td);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TFOOT: {
				Tfoot tfoot = (Tfoot) theEObject;
				T result = caseTfoot(tfoot);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TH: {
				Th th = (Th) theEObject;
				T result = caseTh(th);
				if (result == null) {
					result = caseFlow(th);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.THEAD: {
				Thead thead = (Thead) theEObject;
				T result = caseThead(thead);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TR: {
				Tr tr = (Tr) theEObject;
				T result = caseTr(tr);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.TT: {
				Tt tt = (Tt) theEObject;
				T result = caseTt(tt);
				if (result == null) {
					result = caseInline(tt);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.UL: {
				Ul ul = (Ul) theEObject;
				T result = caseUl(ul);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case XhtmlPackage.VAR: {
				Var var = (Var) theEObject;
				T result = caseVar(var);
				if (result == null) {
					result = caseInline(var);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA(A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbr(Abbr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAContent(AContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acronym</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acronym</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcronym(Acronym object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB(B object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBig(Big object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockquote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockquote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockquote(Blockquote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Br</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Br</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBr(Br object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaption(Caption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCite(Cite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCol(Col object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColgroup(Colgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDd(Dd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Del</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Del</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDel(Del object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dfn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dfn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDfn(Dfn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDl(Dl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDt(Dt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Em</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Em</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEm(Em object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHr(Hr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI(I object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Img</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Img</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImg(Img object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIns(Ins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kbd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kbd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKbd(Kbd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Li</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Li</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLi(Li object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOl(Ol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP(P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePre(Pre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreContent(PreContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQ(Q object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Samp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Samp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamp(Samp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmall(Small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrong(Strong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSub(Sub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSup(Sup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbody(Tbody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Td</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Td</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTd(Td object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tfoot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tfoot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfoot(Tfoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTh(Th object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThead(Thead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTr(Tr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTt(Tt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ul</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ul</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUl(Ul object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVar(Var object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // XhtmlSwitch
