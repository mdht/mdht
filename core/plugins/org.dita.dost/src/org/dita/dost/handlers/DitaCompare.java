/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, JKM Software LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir, JKM Software LLC. - initial API and implementation
 *
 *******************************************************************************/
package org.dita.dost.handlers;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.util.CompareResultVisitor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

/**
 * @author fhim
 *
 */
/*
 *
 * Package
 * Association Added
 * Class Added
 * Delta
 * results
 * package element
 */

public class DitaCompare implements CompareResultVisitor {

	private static String getEscapedElementName(NamedElement ne) {
		return StringEscapeUtils.escapeHtml(ne.getName());
	}

	static class DeltaDisplay extends org.eclipse.uml2.uml.util.UMLSwitch<String> {
		static final DeltaDisplay DELTADISPLAY = new DeltaDisplay();

		public Element leftElement;

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseComment(org.eclipse.uml2.uml.Comment)
		 */
		@Override
		public String caseComment(Comment comment) {
			return "Comment : " + StringEscapeUtils.escapeHtml(comment.getBody());
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseProperty(org.eclipse.uml2.uml.Property)
		 */
		@Override
		public String caseProperty(Property object) {
			StringBuilder sb = new StringBuilder();
			sb.append(Display.DISPLAYINSTANCE.doSwitch(object));
			if (leftElement != null) {
				sb.append(" to ").append(Display.DISPLAYINSTANCE.doSwitch(leftElement));
			}
			return sb.toString();

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
		 */
		@Override
		public String casePackage(Package object) {
			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseClass(org.eclipse.uml2.uml.Class)
		 */
		@Override
		public String caseClass(Class object) {
			return getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			return Display.DISPLAYINSTANCE.doSwitch(object);
		}

	}

	static class ElementDisplay extends org.eclipse.uml2.uml.util.UMLSwitch<String> {
		static final ElementDisplay ELEMENTDISPLAYINSTANCE = new ElementDisplay();

		/*
		 *
		 * /*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseProperty(org.eclipse.uml2.uml.Property)
		 */
		@Override
		public String caseProperty(Property object) {
			return "Property " + getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseComment(org.eclipse.uml2.uml.Comment)
		 */
		@Override
		public String caseComment(Comment object) {
			return "Comment ";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseGeneralization(org.eclipse.uml2.uml.Generalization)
		 */
		@Override
		public String caseGeneralization(Generalization generalization) {
			return "Generalization";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseEnumeration(org.eclipse.uml2.uml.Enumeration)
		 */
		@Override
		public String caseEnumeration(Enumeration object) {
			return "Enumeration " + getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseNamedElement(org.eclipse.uml2.uml.NamedElement)
		 */
		@Override
		public String caseNamedElement(NamedElement object) {
			return getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			return object.toString();
		}

	}

	static class Display extends org.eclipse.uml2.uml.util.UMLSwitch<String> {
		static final Display DISPLAYINSTANCE = new Display();

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseNamedElement(org.eclipse.uml2.uml.NamedElement)
		 */
		@Override
		public String caseNamedElement(NamedElement object) {
			if (object.getName() != null) {
				return getEscapedElementName(object);
			} else {
				return super.caseNamedElement(object);
			}

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseClassifier(org.eclipse.uml2.uml.Classifier)
		 */
		@Override
		public String caseClassifier(Classifier object) {
			return "Class " + getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
		 */
		@Override
		public String casePackage(Package object) {
			return "Package " + getEscapedElementName(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseProperty(org.eclipse.uml2.uml.Property)
		 */
		@Override
		public String caseProperty(Property object) {
			return "Property " + getEscapedElementName(object) + " [" + object.getLower() + ".." +
					(object.getUpper() >= 0
							? object.getUpper()
							: "*") +
					"] " + (object.getType() != null
							? object.getType().getName()
							: "NULL");
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseAssociation(org.eclipse.uml2.uml.Association)
		 */
		@Override
		public String caseAssociation(Association assocation) {
			StringBuffer result = new StringBuffer();

			for (Property p : assocation.getMemberEnds()) {
				if (!StringUtils.isEmpty(p.getName())) {
					result.append("Association from ");
					result.append((p.getOwner() instanceof Class
							? (getEscapedElementName((Class) p.getOwner())) + " "
							: ""));
					result.append("::" + getEscapedElementName(p) + " to ").append(getEscapedElementName(p.getType()));
				}
			}

			return result.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseComment(org.eclipse.uml2.uml.Comment)
		 */
		@Override
		public String caseComment(Comment comment) {
			return StringEscapeUtils.escapeHtml(comment.getBody());
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseGeneralization(org.eclipse.uml2.uml.Generalization)
		 */
		@Override
		public String caseGeneralization(Generalization generalization) {
			StringBuilder sb = new StringBuilder();
			sb.append("Generalization from ");
			if (generalization.getSpecific() != null) {
				sb.append(generalization.getSpecific().getName() + " to ");
			} else {
				sb.append(" null to ");
			}

			if (generalization.getGeneral() != null) {

				sb.append(generalization.getGeneral().getName());
			} else {
				sb.append(" null ");
			}

			return sb.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseLiteralUnlimitedNatural(org.eclipse.uml2.uml.LiteralUnlimitedNatural)
		 */
		@Override
		public String caseLiteralUnlimitedNatural(LiteralUnlimitedNatural lun) {

			return String.valueOf(lun.getValue());

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseLiteralInteger(org.eclipse.uml2.uml.LiteralInteger)
		 */
		@Override
		public String caseLiteralInteger(LiteralInteger li) {
			return String.valueOf(li.getValue());
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			return object.getClass().getName();
		}

	}

	// public Element leftElement;

	StringBuilder buffer = new StringBuilder();

	IProgressMonitor monitor;

	public DitaCompare(String version1, String version2, IProgressMonitor monitor) {
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		buffer.append("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\" [ ");
		buffer.append("<!ENTITY rsquo \"&#160;\"> ");
		buffer.append("<!ENTITY ldquo \"&#160;\"> ");
		buffer.append("<!ENTITY rdquo \"&#160;\"> ");
		buffer.append("<!ENTITY ndash \"&#160;\"> ");
		buffer.append("<!ENTITY lsquo \"&#160;\"> ");

		buffer.append("]>");

		buffer.append("<topic id=\"modelupdates\" xml:lang=\"en-us\">");
		buffer.append("<title id=\"title\">Model Updates</title>");
		buffer.append("<shortdesc>Model Updates</shortdesc>");
		buffer.append("<body id=\"modelupdatesbody\" >");
		buffer.append("<section id=\"modelupdatesdescription\" >");
		buffer.append("<title>Model Updates</title>");
		buffer.append(
			"<table colsep=\"1\" rowsep=\"1\"> " + "<tgroup cols=\"2\">" +
					" <colspec colname=\"col1\" colwidth=\"2*\"/> <colspec colname=\"col2\" colwidth=\"1*\"/> <colspec colname=\"col3\" colwidth=\"1*\"/> <colspec colname=\"col4\" colwidth=\"2*\"/>" +
					"<thead>" + "<row><entry namest=\"col1\" nameend =\"col2\" valign=\"top\">Intial Version " +
					version1 + "</entry><entry namest=\"col3\" nameend =\"col4\" valign=\"top\">Target Version " +
					version2 + "</entry></row>" +
					"<row><entry colname=\"col1\" valign=\"top\">Domain</entry><entry colname=\"col2\" valign=\"top\">Class</entry><entry colname=\"col3\" valign=\"top\">Action</entry><entry colname=\"col4\" valign=\"top\">Element</entry></row>" +
					"</thead><tbody>").append(System.getProperty("line.separator"));
		;

		this.monitor = monitor;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.common.util.CompareResultInterface#startElement(org.eclipse.uml2.uml.NamedElement)
	 */
	public void startElement(NamedElement element) {
		if (monitor != null) {
			monitor.subTask("Comparing " + element.getName());
			monitor.worked(1);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.common.util.CompareResultInterface#addedElement(org.eclipse.uml2.uml.NamedElement,
	 * org.eclipse.uml2.uml.Element)
	 */
	public void addedElement(NamedElement owner, Element element) {
		if (owner instanceof Package && element instanceof Class) {
			DeltaDisplay.DELTADISPLAY.leftElement = null;
			buffer.append(
				"<row><entry>" + StringEscapeUtils.escapeHtml(owner.getNearestPackage().getQualifiedName()) +
						"</entry><entry>" + ElementDisplay.ELEMENTDISPLAYINSTANCE.doSwitch(element) +
						"</entry><entry>Added</entry><entry></entry></row>").append(
							System.getProperty("line.separator"));
			;
		} else if (owner instanceof Class) {
			DeltaDisplay.DELTADISPLAY.leftElement = null;
			buffer.append(
				"<row><entry>" + StringEscapeUtils.escapeHtml(owner.getNearestPackage().getQualifiedName()) +
						"</entry><entry>" + ElementDisplay.ELEMENTDISPLAYINSTANCE.doSwitch(owner) +
						"</entry><entry>Added</entry><entry>" + DeltaDisplay.DELTADISPLAY.doSwitch(element) +
						"</entry></row>").append(System.getProperty("line.separator"));
			;
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.common.util.CompareResultInterface#deletedElement(org.eclipse.uml2.uml.NamedElement,
	 * org.eclipse.uml2.uml.Element)
	 */
	public void deletedElement(NamedElement owner, Element element) {
		if (owner instanceof Package && element instanceof Class) {
			DeltaDisplay.DELTADISPLAY.leftElement = null;
			buffer.append(
				"<row><entry>" + StringEscapeUtils.escapeHtml(owner.getNearestPackage().getQualifiedName()) +
						"</entry><entry>" + ElementDisplay.ELEMENTDISPLAYINSTANCE.doSwitch(element) +
						"</entry><entry>Deleted</entry><entry></entry></row>").append(
							System.getProperty("line.separator"));
			;
		} else if (owner instanceof Class) {
			DeltaDisplay.DELTADISPLAY.leftElement = null;
			buffer.append(
				"<row><entry>" + StringEscapeUtils.escapeHtml(owner.getNearestPackage().getQualifiedName()) +
						"</entry><entry>" + ElementDisplay.ELEMENTDISPLAYINSTANCE.doSwitch(owner) +
						"</entry><entry>Deleted</entry><entry>" + DeltaDisplay.DELTADISPLAY.doSwitch(element) +
						"</entry></row>").append(System.getProperty("line.separator"));
			;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.common.util.CompareResultInterface#changedElement(org.eclipse.uml2.uml.NamedElement,
	 * org.eclipse.uml2.uml.Element)
	 */
	public void changedElement(NamedElement owner, Element origialElement, Element upatedElement) {
		if (owner instanceof Class) {
			DeltaDisplay.DELTADISPLAY.leftElement = origialElement;
			buffer.append(
				"<row><entry>" + StringEscapeUtils.escapeHtml(owner.getNearestPackage().getQualifiedName()) +
						"</entry><entry>" + ElementDisplay.ELEMENTDISPLAYINSTANCE.doSwitch(owner) +
						"</entry><entry>Updated</entry><entry>" + DeltaDisplay.DELTADISPLAY.doSwitch(upatedElement) +
						"</entry></row>").append(System.getProperty("line.separator"));
			;
		}
	}

	String getResults() {
		buffer.append("</tbody></tgroup></table>");
		buffer.append("</section>");
		buffer.append("</body>");
		buffer.append("</topic>").append(System.getProperty("line.separator"));
		;
		return buffer.toString();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.common.util.CompareResultInterface#endElement(org.eclipse.uml2.uml.NamedElement)
	 */
	public void endElement(NamedElement element) {

	}

}
