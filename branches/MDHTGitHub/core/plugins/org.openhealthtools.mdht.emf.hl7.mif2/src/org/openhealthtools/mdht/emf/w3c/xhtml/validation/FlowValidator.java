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
package org.openhealthtools.mdht.emf.w3c.xhtml.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

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

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FlowValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);

	boolean validateGroup(FeatureMap value);

	boolean validateP(EList<P> value);

	boolean validateDiv(EList<Div> value);

	boolean validateUl(EList<Ul> value);

	boolean validateOl(EList<Ol> value);

	boolean validateDl(EList<Dl> value);

	boolean validatePre(EList<Pre> value);

	boolean validateHr(EList<Hr> value);

	boolean validateBlockquote(EList<Blockquote> value);

	boolean validateTable(EList<Table> value);

	boolean validateA(EList<A> value);

	boolean validateBr(EList<Br> value);

	boolean validateSpan(EList<Span> value);

	boolean validateObject(EList<org.openhealthtools.mdht.emf.w3c.xhtml.Object> value);

	boolean validateImg(EList<Img> value);

	boolean validateTt(EList<Tt> value);

	boolean validateI(EList<I> value);

	boolean validateB(EList<B> value);

	boolean validateBig(EList<Big> value);

	boolean validateSmall(EList<Small> value);

	boolean validateEm(EList<Em> value);

	boolean validateStrong(EList<Strong> value);

	boolean validateDfn(EList<Dfn> value);

	boolean validateCode(EList<Code> value);

	boolean validateQ(EList<Q> value);

	boolean validateSamp(EList<Samp> value);

	boolean validateKbd(EList<Kbd> value);

	boolean validateVar(EList<Var> value);

	boolean validateCite(EList<Cite> value);

	boolean validateAbbr(EList<Abbr> value);

	boolean validateAcronym(EList<Acronym> value);

	boolean validateSub(EList<Sub> value);

	boolean validateSup(EList<Sup> value);
}
