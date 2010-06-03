/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - Extended implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch;
import org.openhealthtools.mdht.emf.w3c.xhtml.A;
import org.openhealthtools.mdht.emf.w3c.xhtml.B;
import org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote;
import org.openhealthtools.mdht.emf.w3c.xhtml.Br;
import org.openhealthtools.mdht.emf.w3c.xhtml.Caption;
import org.openhealthtools.mdht.emf.w3c.xhtml.Code;
import org.openhealthtools.mdht.emf.w3c.xhtml.Col;
import org.openhealthtools.mdht.emf.w3c.xhtml.Div;
import org.openhealthtools.mdht.emf.w3c.xhtml.I;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;
import org.openhealthtools.mdht.emf.w3c.xhtml.Li;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ol;
import org.openhealthtools.mdht.emf.w3c.xhtml.P;
import org.openhealthtools.mdht.emf.w3c.xhtml.Param;
import org.openhealthtools.mdht.emf.w3c.xhtml.Pre;
import org.openhealthtools.mdht.emf.w3c.xhtml.Span;
import org.openhealthtools.mdht.emf.w3c.xhtml.Strong;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sub;
import org.openhealthtools.mdht.emf.w3c.xhtml.Sup;
import org.openhealthtools.mdht.emf.w3c.xhtml.Table;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tbody;
import org.openhealthtools.mdht.emf.w3c.xhtml.Td;
import org.openhealthtools.mdht.emf.w3c.xhtml.Th;
import org.openhealthtools.mdht.emf.w3c.xhtml.Thead;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.Ul;
import org.openhealthtools.mdht.emf.w3c.xhtml.Var;
import org.openhealthtools.mdht.emf.w3c.xhtml.util.XhtmlSwitch;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFImporterOptions;

public class CommentSwitch extends XhtmlSwitch {

	// Prefix to remove/add xhtml: prefix -currently not very efficient from
	// a string management point of view, might need to be addressed
	String prefix = "";

	private class MIF2CommentSwitch extends Mif2Switch {

		@Override
		public Object caseFormalConstraint(FormalConstraint formalConstraint) {

			for (ComplexMarkupWithLanguage complexMarkupWithLanguage : formalConstraint.getCombinedText()) {
				processFeatureMap("", "", complexMarkupWithLanguage.getMixed());
			}

			for (FormalExpression formalExpression : formalConstraint.getAlternateFormalExpression()) {
				processFeatureMap("", "", formalExpression.getMixed());
			}

			return formalConstraint;
		}

		@Override
		public Object caseComplexMarkupWithLanguage(ComplexMarkupWithLanguage object) {

			processFeatureMap("", "", object.getMixed());

			// System.err.println("ComplexMarkupWithLanguage ");
			return object;
		}

		@Override
		public Object caseDesignComment(DesignComment designComment) {
			// System.err.println("DesignComment ");
			return designComment;
		}

		@Override
		public Object caseCascadableAnnotation(CascadableAnnotation object) {
			// System.err.println("CascadableAnnotation ");

			// commentBuffer.append("Start caseCascadableAnnotation");
			// for (ComplexMarkupWithLanguage complexMarkupWithLanguage :
			// object.getText())
			// {
			// doSwitch(complexMarkupWithLanguage);
			// }
			// commentBuffer.append("end caseCascadableAnnotation");

			return object;
		}

		@Override
		public Object caseFormalExpression(FormalExpression formal) {

			processFeatureMap("<" + prefix + "pre>", "</" + prefix + "pre>", formal.getMixed());

			return formal;
		}

		@Override
		public Object defaultCase(EObject object) {
			// Go Boom - We have something in the MIF2 that was not
			// expected!
			System.err.println("Unexpected class " + object.getClass().getCanonicalName());
			throw new RuntimeException("Unexpected class " + object.getClass().getCanonicalName());
		}

	}

	MIF2CommentSwitch mif2CommentSwitch = new MIF2CommentSwitch();

	public String getComment() {
		return commentBuffer.toString();
		// There is an issue regarding formating of the actual comment
		// There is implicit formating in the current MIF2 documents - which
		// is generally bad form when it comes to html/ xhtml
		// .replaceAll("\\t\\s{2,}\\t",
		// " ").replaceAll("\\n", " ");
	}

	public CommentSwitch(MIFImporterOptions transformerOptions) {
		super();
//		if (transformerOptions.isUseXHTML()) {
//			prefix = "html:";
//		}
		commentBuffer.append(" ");
	}

	protected StringBuffer commentBuffer = new StringBuffer();

	public void appendComment(String comment) {
		commentBuffer.append(comment);
	}

	@Override
	public Object caseObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object objectTag) {

		processFeatureMap("<" + prefix + "object name=\"" + objectTag.getName().toString() + "\">", "</" + prefix + "object>", objectTag.getMixed());
		return objectTag;
	}

	@Override
	public Object caseB(B b) {
		processFeatureMap("<" + prefix + "code>", "</" + prefix + "code>", b.getMixed());

		return b;
	}

	@Override
	public Object caseThead(Thead object) {
		return object;
	}

	@Override
	public Object caseCol(Col object) {

		return object;
	}

	@Override
	public Object caseCaption(Caption caption) {
		processFeatureMap("<" + prefix + "code>", "</" + prefix + "code>", caption.getMixed());
		return caption;
	}

	@Override
	public Object caseTable(Table table) {

		String attributes = new String();
		if (table.getWidth() != null) {
			attributes += "width=\"" + table.getWidth() + "\" ";
		}

		if (table.getHl7Id() != null) {
			attributes += "hl7id=\"" + table.getHl7Id() + "\" ";
		}

		if (table.getBorder() != null) {
			attributes += "border=\"" + table.getBorder() + "\" ";
		}

		if (table.getCellpadding() != null) {
			attributes += "cellpadding=\"" + table.getCellpadding() + "\" ";
		}

		if (table.getCellspacing() != null) {
			attributes += "cellspacing=\"" + table.getCellspacing() + "\" ";
		}

		if (table.getStyle() != null) {
			attributes += "style=\"" + table.getStyle() + "\" ";
		}

		commentBuffer.append("<" + prefix + "table" + attributes + " >");

		processFeatureMap("<" + prefix + "caption>", "</" + prefix + "caption>", table.getCaption().getMixed());

		if (table.getThead() != null) {
			commentBuffer.append("<" + prefix + "thead>");
			for (Tr tr : table.getThead().getTr()) {
				commentBuffer.append("<" + prefix + "tr>");
				for (Th th : tr.getTh()) {
					processFeatureMap("<" + prefix + "th>", "</" + prefix + "th>", th.getMixed());

				}
				commentBuffer.append("</" + prefix + "tr>");
			}
			commentBuffer.append("</" + prefix + "thead>");
		}

		if (table.getTbody() != null) {
			for (Tbody tbody : table.getTbody()) {
				commentBuffer.append("<" + prefix + "tbody>");
				for (Tr tr : tbody.getTr()) {
					commentBuffer.append("<" + prefix + "tr>");
					for (Td td : tr.getTd()) {
						processFeatureMap("<" + prefix + "td>", "</" + prefix + "td>", td.getMixed());

					}
					commentBuffer.append("</" + prefix + "tr>");
				}
				commentBuffer.append("</" + prefix + "tbody>");
			}
		}

		if (table.getTfoot() != null) {
			commentBuffer.append("<" + prefix + "tfoot>");
			for (Tr tr : table.getTfoot().getTr()) {
				commentBuffer.append("<" + prefix + "tr>");
				for (Th th : tr.getTh()) {
					processFeatureMap("<" + prefix + "th>", "</" + prefix + "th>", th.getMixed());

				}
				commentBuffer.append("</" + prefix + "tr>");
			}
			commentBuffer.append("</" + prefix + "tfoot>");
		}

		commentBuffer.append("</" + prefix + "table>");

		return table;
	}

	@Override
	public Object caseCode(Code code) {
		processFeatureMap("<" + prefix + "code>", "</" + prefix + "code>", code.getMixed());
		return code;
	}

	@Override
	public Object caseParam(Param object) {
		commentBuffer.append("<" + prefix + "param name=\"" + object.getName().toString() + "\" value=\"" + object.getValue().toString() + "\"/></" + prefix + "param>");
		return object;
	}

	@Override
	public Object caseSub(Sub sub) {
		processFeatureMap("<" + prefix + "sub>", "</" + prefix + "sub>", sub.getMixed());
		return sub;
	}

	@Override
	public Object caseSup(Sup sup) {
		processFeatureMap("<" + prefix + "sup>", "</" + prefix + "sup>", sup.getMixed());
		return sup;
	}

	@Override
	public Object caseVar(Var object) {
		return object;
	}

	@Override
	public Object caseImg(Img img) {
		return img;
	}
	
	

	@Override
	public Object caseI(I i) {
		processFeatureMap("<" + prefix + "i>", "</" + prefix + "i>", i.getMixed());
		return i;
	}

	@Override
	public Object caseLi(Li li) {
		processFeatureMap("<" + prefix + "li>", "</" + prefix + "li>", li.getMixed());
		return li;
	}

	@Override
	public Object caseOl(Ol object) {
		processFeatureMap("<" + prefix + "ol>", "</" + prefix + "ol>", object.getLi());
		return object;
	}

	@Override
	public Object caseTbody(Tbody object) {
		return object;
	}

	@Override
	public Object caseTd(Td object) {
		return object;
	}

	@Override
	public Object caseTh(Th object) {
		return object;
	}

	@Override
	public Object caseTr(Tr object) {
		return object;
	}

	@Override
	public Object casePre(Pre pre) {
		processFeatureMap("<" + prefix + "pre>", "</" + prefix + "pre>", pre.getMixed());
		return pre;
	}

	@Override
	public Object caseSpan(Span span) {
		processFeatureMap("<" + prefix + "span>", "</" + prefix + "span>", span.getMixed());
		return span;
	}

	@Override
	public Object caseBlockquote(Blockquote blockquote) {
		processFeatureMap("<" + prefix + "blockquote>", "</" + prefix + "blockquote>", blockquote.getMixed());
		return blockquote;
	}

	@Override
	public Object caseA(A anchor) {
		processFeatureMap("<" + prefix + "a>", "</" + prefix + "a>", anchor.getMixed());
		return anchor;
	}

	@Override
	public Object caseStrong(Strong strong) {
		processFeatureMap("<" + prefix + "strong>", "</" + prefix + "strong>", strong.getMixed());
		return strong;
	}

	@Override
	public Object caseBr(Br br) {

		commentBuffer.append("</" + prefix + "br>");

		return br;
	}

	@Override
	public Object caseUl(Ul ul) {
		processFeatureMap("<" + prefix + "ul>", "</" + prefix + "ul>", ul.getLi());
		return ul;
	}

	private void processFeatureMap(String startTag, String endTag, FeatureMap featureMap) {
		commentBuffer.append(startTag);
		for (FeatureMap.Entry entry : featureMap) {
			if (entry.getValue() instanceof String) {
				commentBuffer.append(entry.getValue());
			} else {
				this.doSwitch((EObject) entry.getValue());
			}
		}
		commentBuffer.append(endTag);
	}

	@Override
	public Object caseP(P paragraph) {

		processFeatureMap("<" + prefix + "p>", "</" + prefix + "p>", paragraph.getMixed());

		return paragraph;
	}

	@Override
	public Object caseDiv(Div div) {
		processFeatureMap("<" + prefix + "div title=\" " + div.getTitle() + " \" >", "</" + prefix + "div>", div.getMixed());

		return div;
	}

	@Override
	public Object defaultCase(EObject object) {
		mif2CommentSwitch.doSwitch(object);
		return object;
	}

}