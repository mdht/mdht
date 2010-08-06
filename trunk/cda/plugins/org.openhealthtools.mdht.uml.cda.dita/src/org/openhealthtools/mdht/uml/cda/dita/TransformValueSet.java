package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class TransformValueSet extends TransformAbstract {

	public TransformValueSet(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseEnumeration(Enumeration umlEnumeration) {
		String pathFolder = "terminology";
		String fileName = validFileName(umlEnumeration.getName()) + ".dita";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder)
				.addTrailingSeparator().append(fileName);
		File file = filePath.toFile();
		PrintWriter writer = null;
		
//		if (!file.exists()) {
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
//		}

		transformerOptions.getValueSetList().add(fileName);

		return umlEnumeration;
	}
	
	private void appendHeader(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlEnumeration));
		writer.println("</title>");
		
		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
		CodeSystemVersion codeSystem = null;
		Enumeration codeSystemEnum = null;
		if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null) {
			codeSystem = valueSetVersion.getCodeSystem();
			codeSystemEnum = codeSystem.getBase_Enumeration();
		}
		
		writer.print("<shortdesc id=\"shortdesc\">");
		if (valueSetVersion != null) {
			writer.print("[OID <tt>" + valueSetVersion.getIdentifier() + "</tt>");
			if (codeSystemEnum != null) {
				writer.print(" from code system: " + fixNonXMLCharacters(codeSystemEnum.getName()));
			}
			writer.print("]");
		}
		writer.println("</shortdesc>");
		
		writer.println("<prolog id=\"prolog\">");
		if (valueSetVersion != null) {
			writer.println("<resourceid id=\"" + valueSetVersion.getIdentifier() + "\"/>");
		}
		writer.println("</prolog>");
	}

	private void appendBody(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println("<body>");
		writer.println("<!-- THIS IS GENERATED CONTENT, DO NOT EDIT -->");

		appendDocumentation(writer, umlEnumeration);
		appendConcepts(writer, umlEnumeration);
		
		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendDocumentation(PrintWriter writer, Enumeration umlEnumeration) {
		writer.println("<section id=\"description\">");
		
		// TODO if blank line, wrap before and after contents in <p>
		
		for (Comment comment : umlEnumeration.getOwnedComments()) {
			String body = comment.getBody().trim();
			if (body.startsWith("<p>")) {
				writer.println(comment.getBody());
			}
			else {
				writer.println("<p>" + comment.getBody() + "</p>");
			}
		}
		
		writer.println("</section>");
	}

	private void appendConcepts(PrintWriter writer, Enumeration umlEnumeration) {
		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(umlEnumeration);
		if (valueSetVersion != null) {
			writer.println("<p>OID: " + valueSetVersion.getIdentifier() + "</p>");
			writer.println("<p>Name: " + fixNonXMLCharacters(valueSetVersion.getFullName()) + "</p>");
			if (valueSetVersion.getCodeSystem() != null) {
				writer.println("<p>Code System: " + valueSetVersion.getCodeSystem().getIdentifier() + "</p>");
				writer.println("<p>Code System Name: " + fixNonXMLCharacters(valueSetVersion.getCodeSystem().getBase_Enumeration().getName()) + "</p>");
			}
			if (valueSetVersion.getDefinition() != null) {
				writer.println("<p>" + fixNonXMLCharacters(valueSetVersion.getDefinition()) + "</p>");
			}
		}

		if (!umlEnumeration.getOwnedLiterals().isEmpty()) {
			writer.println("<table><tgroup cols=\"4\"><thead><row>");
			writer.println("<entry>Code</entry><entry>Display Name</entry><entry>Code System</entry><entry>Code System Name</entry>");
			writer.println("</row></thead><tbody>");
			
			for (EnumerationLiteral literal : umlEnumeration.getOwnedLiterals()) {
				ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(literal);
				writer.print("<row>");
				writer.print("<entry>" + literal.getName() + "</entry>");
				if (valueSetCode != null) {
					writer.print("<entry>" + fixNonXMLCharacters(valueSetCode.getConceptName()) + "</entry>");
					if (valueSetCode.getCodeSystem() != null) {
						writer.print("<entry>" + valueSetCode.getCodeSystem().getIdentifier() + "</entry>");
						writer.print("<entry>" + valueSetCode.getCodeSystem().getBase_Enumeration().getName() + "</entry>");
					}
				}
				writer.println("</row>");
			}
			
			writer.println("</tbody></tgroup></table>");
		}
	}
}
