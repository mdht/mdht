/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Les Westberg - Fixed a problem related to generating the DITA for value sets
 *                    that were not contained in the vocab project and that are in
 *                    models which are not based on CDA
 *
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.dita.internal.Logger;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

public class TransformValueSet extends TransformAbstract {

	public TransformValueSet(DitaTransformerOptions options) {
		super(options);
	}

	public String getDefinition(Enumeration enumeration) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		pw.println("<section id=\"definition\">");

		appendDefinition(pw, enumeration);
		appendConcepts(pw, enumeration);

		pw.println("</section>");
		return sw.toString();
	}

	private void appendBody(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println("<body>");
		writer.println("<!-- THIS IS GENERATED CONTENT, DO NOT EDIT -->");
		writer.println("<section id=\"definition\">");

		appendDefinition(writer, umlEnumeration);
		appendConcepts(writer, umlEnumeration);

		writer.println("</section>");
		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendConcepts(PrintWriter writer, Enumeration umlEnumeration) {
		String codeSystemName = null;
		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
		if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null &&
				!valueSetVersion.getCodeSystem().eIsProxy()) {
			codeSystemName = valueSetVersion.getCodeSystem().getBase_Enumeration().getName();
		}

		if (!umlEnumeration.getOwnedLiterals().isEmpty()) {

			// print the <table> tag
			writer.println(getTableType());

			if (transformerOptions.isIncludeUsageNotes()) {
				writer.println("<tgroup cols=\"4\">");
				writer.println("<colspec colname=\"col1\" colwidth=\"1*\"/>");
				writer.println("<colspec colname=\"col2\" colwidth=\"1*\"/>");
				writer.println("<colspec colname=\"col3\" colwidth=\"1*\"/>");
				writer.println("<colspec colname=\"col4\" colwidth=\"2*\"/>");
				writer.println("<thead><row>");
				writer.println(
					"<entry>Code</entry><entry>Code System</entry><entry>Print Name</entry><entry>Usage Note</entry>");
				writer.println("</row></thead><tbody>");
			} else {
				writer.println("<tgroup cols=\"3\">");
				writer.println("<colspec colname=\"col1\" colwidth=\"1*\"/>");
				writer.println("<colspec colname=\"col2\" colwidth=\"1*\"/>");
				writer.println("<colspec colname=\"col3\" colwidth=\"2*\"/>");
				writer.println("<thead><row>");
				writer.println("<entry>Code</entry><entry>Code System</entry><entry>Print Name</entry>");
				writer.println("</row></thead><tbody>");
			}

			for (EnumerationLiteral literal : umlEnumeration.getOwnedLiterals()) {
				ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(literal);
				writer.print("<row>");
				// Concept Code
				writer.print("<entry>" + literal.getName() + "</entry>");

				// Code System
				writer.print("<entry>");
				if (valueSetCode != null && valueSetCode.getCodeSystem() != null) {
					writer.print(valueSetCode.getCodeSystem().getBase_Enumeration().getName());
				} else if (codeSystemName != null) {
					writer.print(codeSystemName);
				}
				writer.print("</entry>");

				// Print Name
				writer.print("<entry>");
				if (valueSetCode != null && valueSetCode.getConceptName() != null) {
					writer.print(CDAModelUtil.fixNonXMLCharacters(valueSetCode.getConceptName()));
				}
				writer.print("</entry>");

				if (transformerOptions.isIncludeUsageNotes()) {
					writer.print("<entry>");
					if (valueSetCode != null && valueSetCode.getUsageNote() != null) {
						writer.print(CDAModelUtil.fixNonXMLCharacters(valueSetCode.getUsageNote()));
					}
					writer.print("</entry>");
				}

				writer.println("</row>");
			}

			writer.println("</tbody></tgroup></table>");
		}
	}

	/**
	 * Using transformerOptions determine the correct table type to use for
	 * output
	 *
	 * @return either {@code <table frame=\"topbot\" rowsep=\"1\"> } if isNoVerticalLinesInTables is set
	 *         or {@code <table frame=\"all\" rowsep=\"1\" colsep=\"1\"> }
	 */
	private String getTableType() {
		return transformerOptions.isNoVerticalLinesInTables()
				? "<table frame=\"topbot\" rowsep=\"1\">"
				: "<table frame=\"all\" rowsep=\"1\" colsep=\"1\">";

	}

	private void appendDefinition(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println(getTableType());
		writer.println("<tgroup cols=\"2\">");
		writer.println("<colspec colname=\"col1\" colwidth=\"1*\"/>");
		writer.println("<colspec colname=\"col2\" colwidth=\"4*\"/>");
		writer.println("<tbody>");

		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
		if (valueSetVersion != null) {
			String valueSetId = valueSetVersion.getIdentifier() != null
					? valueSetVersion.getIdentifier()
					: "(OID not specified)";

			writer.print("<row><entry>Value Set</entry><entry>");
			writer.print(umlEnumeration.getName());
			writer.print(" - " + valueSetId);
			writer.println("</entry></row>");

			if (valueSetVersion.getCodeSystem() != null) {
				if (valueSetVersion.getCodeSystem().eIsProxy()) {
					System.err.println("Cannot load Code System ref from: " + umlEnumeration.getQualifiedName());
				} else {
					String codeSystemId = valueSetVersion.getCodeSystem().getIdentifier() != null
							? valueSetVersion.getCodeSystem().getIdentifier()
							: "(OID not specified)";
					writer.print("<row><entry>Code System</entry><entry>");
					writer.print(
						CDAModelUtil.fixNonXMLCharacters(
							valueSetVersion.getCodeSystem().getBase_Enumeration().getName()));
					writer.print(" - " + codeSystemId);
					writer.println("</entry></row>");
				}
			}

			if (valueSetVersion.getVersion() != null) {
				writer.print("<row><entry>Version</entry><entry>");
				writer.print(valueSetVersion.getVersion());
				writer.println("</entry></row>");
			}
			if (valueSetVersion.getSource() != null) {
				writer.print("<row><entry>Source</entry><entry>");
				writer.print(CDAModelUtil.fixNonXMLCharacters(valueSetVersion.getSource()));
				writer.println("</entry></row>");
			}
			if (valueSetVersion.getUrl() != null) {
				writer.print("<row><entry>Source URL</entry><entry>");
				writer.print(CDAModelUtil.fixNonXMLCharacters(valueSetVersion.getUrl()));
				writer.println("</entry></row>");
			}

			if (valueSetVersion.getDefinition() != null) {
				writer.print("<row><entry>Definition</entry><entry>");
				writer.print(CDAModelUtil.fixNonXMLCharacters(valueSetVersion.getDefinition()));
				writer.println("</entry></row>");
			}
		} else {
			writer.print("<row><entry>Value Set</entry><entry>");
			writer.print(umlEnumeration.getName());
			writer.println("</entry></row>");
		}

		for (Comment comment : umlEnumeration.getOwnedComments()) {
			writer.print("<row><entry>Description</entry><entry>");
			writer.println(comment.getBody());
			writer.println("</entry></row>");
		}

		writer.println("</tbody></tgroup></table>");
	}

	private static void appendHeader(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(TransformAbstract.getPublicationName(umlEnumeration));
		writer.println("</title>");

		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
		String valueSetId = valueSetVersion != null && valueSetVersion.getIdentifier() != null
				? valueSetVersion.getIdentifier()
				: "not specified";

		// CodeSystemVersion codeSystem = null;
		// Enumeration codeSystemEnum = null;
		// if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null) {
		// codeSystem = valueSetVersion.getCodeSystem();
		// codeSystemEnum = codeSystem.getBase_Enumeration();
		// }
		//

		// writer.print("<shortdesc id=\"shortdesc\">");
		// if (valueSetVersion != null) {
		// writer.print("[OID: <tt>" + valueSetId + "</tt>");
		// if (codeSystemEnum != null) {
		// writer.print(" from code system: " + CDAModelUtil.fixNonXMLCharacters(codeSystemEnum.getName()));
		// }
		// writer.print("]");
		// }
		// writer.println("</shortdesc>");

		writer.println("<prolog id=\"prolog\">");
		if (valueSetVersion != null) {
			writer.println("<resourceid id=\"" + valueSetId + "\"/>");
		}
		writer.println("</prolog>");
	}

	@Override
	public Object caseEnumeration(Enumeration umlEnumeration) {
		String fileName = normalizeCodeName(umlEnumeration.getName()) + ".dita";
		String pathFolder = "terminology";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder).addTrailingSeparator().append(fileName);
		File file = filePath.toFile();
		PrintWriter writer = null;

		// if (!file.exists()) {
		try {
			file.createNewFile();

			writer = new PrintWriter(file);
			appendHeader(writer, umlEnumeration);
			appendBody(writer, umlEnumeration);

		} catch (FileNotFoundException e) {
			Logger.logException(e);
		} catch (IOException e1) {
			Logger.logException(e1);
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		// }

		transformerOptions.getValueSetList().add(fileName);

		return umlEnumeration;
	}
}
