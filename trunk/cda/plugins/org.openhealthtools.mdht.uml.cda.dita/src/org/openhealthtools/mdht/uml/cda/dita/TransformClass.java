package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClass extends TransformAbstract {

	public TransformClass(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class umlClass) {
		String pathFolder = "classes";
		String fileName = umlClass.getName() + ".dita";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder)
				.addTrailingSeparator().append(umlClass.getName()).addFileExtension("dita");
		File file = filePath.toFile();
		PrintWriter writer = null;
		
		if (!file.exists()) {
			try {
				file.createNewFile();
				
				writer = new PrintWriter(file);
				appendHeader(writer, umlClass);
				appendBody(writer, umlClass);
				
			} catch (FileNotFoundException e) {
				Logger.logException(e);
			} catch (IOException e1) {
				Logger.logException(e1);
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		}

		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(umlClass,
				ICDAProfileConstants.CDA_TEMPLATE);
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (hl7Template != null && cdaClass != null) {
			if ("ClinicalDocument".equals(cdaClass.getName()))
				transformerOptions.getDocumentList().add(fileName);
			else if ("Section".equals(cdaClass.getName()))
				transformerOptions.getSectionList().add(fileName);
			else
				transformerOptions.getClinicalStatementList().add(fileName);
		}
		else {
			transformerOptions.getClassList().add(fileName);
		}

		return umlClass;
	}
	
	private void appendHeader(PrintWriter writer, Class umlClass) {
		String className = umlClass.getName();
		
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlClass));
		writer.println("</title>");
		writer.println("<shortdesc conref=\"generated/_" + className + ".dita#classId/shortdesc\"></shortdesc>");
		writer.println("<prolog conref=\"generated/_" + className + ".dita#classId/prolog\"></prolog>");
	}

	private void appendBody(PrintWriter writer, Class umlClass) {
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(umlClass,
				ICDAProfileConstants.CDA_TEMPLATE);
		String className = umlClass.getName();
		
		writer.println("<body>");
		if (umlClass.getOwnedComments().isEmpty()) {
			writer.println("<p>TODO: add class description</p>");
		}
		else {
			for (Comment comment : umlClass.getOwnedComments()) {
				String body = comment.getBody().trim();
				if (body.startsWith("<p>")) {
					writer.println(comment.getBody());
				}
				else {
					writer.println("<p>" + comment.getBody() + "</p>");
				}
			}
		}
		writer.println();
		writer.println("<ol conref=\"generated/_" + className + ".dita#classId/conformance\">");
//		writer.println("<ol conref=\"generated/_" + className + ".dita#classId/aggregate\">");
		writer.println("<li></li>");
		writer.println("</ol>");
//		if (hl7Template != null) {
			writer.println("<fig>");
			writer.println("<title>" + UMLUtil.splitName(umlClass) + " example</title>");
			writer.println("<codeblock conref=\"generated/_" + className + ".dita#classId/example\">");
			writer.println("</codeblock>");
			writer.println("</fig>");
//		}
		
		writer.println("</body>");
		writer.println("</topic>");
	}

}
