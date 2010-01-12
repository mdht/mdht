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
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformTemplate extends TransformAbstract {

	public TransformTemplate(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class template) {
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template,
				ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			String fileName = template.getName() + ".dita";
			IPath filePath = transformerOptions.getOutputPath().append("templates")
					.addTrailingSeparator().append(template.getName()).addFileExtension("dita");
			File file = filePath.toFile();
			PrintWriter writer = null;
			
			if (!file.exists()) {
				System.out.println("New file: " + file);

				try {
					file.createNewFile();
					
					writer = new PrintWriter(file);
					appendHeader(writer, template);
					appendBody(writer, template);
					
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
			
			Class cdaClass = CDAModelUtil.getCDAClass(template);
			if (cdaClass != null) {
				if ("ClinicalDocument".equals(cdaClass.getName()))
					transformerOptions.getDocumentList().add(fileName);
				else if ("Section".equals(cdaClass.getName()))
					transformerOptions.getSectionList().add(fileName);
				else
					transformerOptions.getClinicalStatementList().add(fileName);
			}
		}

		return template;
	}
	
	private void appendHeader(PrintWriter writer, Class template) {
		String className = template.getName();
		
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"template\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(className);
		writer.println("</title>");
		writer.println("<shortdesc conref=\"generated/_" + className + ".dita#template/shortdesc\"></shortdesc>");
		writer.println("<prolog conref=\"generated/_" + className + ".dita#template/prolog\"></prolog>");
	}

	private void appendBody(PrintWriter writer, Class template) {
		String className = template.getName();
		
		writer.println("<body>");
		if (template.getOwnedComments().isEmpty()) {
			writer.println("<p>TODO: add template description</p>");
		}
		else {
			for (Comment comment : template.getOwnedComments()) {
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
		writer.println("<ol conref=\"generated/_" + className + ".dita#template/conformance\">");
		writer.println("<li></li>");
		writer.println("</ol>");
		writer.println("<fig>");
		writer.println("<title>" + className + " example</title>");
		writer.println("<codeblock>TODO: XML document snippet</codeblock>");
		writer.println("</fig>");
		
		writer.println("</body>");
		writer.println("</topic>");
	}

}
