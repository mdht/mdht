package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformTemplateRules extends TransformAbstract {

	public TransformTemplateRules(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class template) {
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template,
				ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template == null) {
			return null;
		}
		
		IPath filePath = transformerOptions.getOutputPath().append("classes")
				.addTrailingSeparator().append("generated").addTrailingSeparator().append(
						"_"+template.getName()).addFileExtension("dita");
		File file = filePath.toFile();
		PrintWriter writer = null;

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

		return template;
	}

	private void appendHeader(PrintWriter writer, Class template) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"template\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(template));
		writer.print(" - conformance rules");
		writer.println("</title>");
		
		Class cdaClass = CDAModelUtil.getCDAClass(template);
		String cdaClassName = cdaClass != null ? cdaClass.getName() : "MISSING_CDA_CLASS";
		writer.print("<shortdesc id=\"shortdesc\">");
		writer.print("[" + cdaClassName + ": templateId <tt>" 
				+ CDAModelUtil.getTemplateId(template) + "</tt>]");
		writer.println("</shortdesc>");
		
		writer.println("<prolog id=\"prolog\">");
		writer.println("<metadata><category>" + cdaClassName + "</category></metadata>");
		writer.println("<resourceid id=\"" + CDAModelUtil.getTemplateId(template) + "\"/>");
		writer.println("</prolog>");
	}

	private void appendBody(PrintWriter writer, Class template) {
		writer.println("<body>");
		writer.println("<ol id=\"conformance\">");
		
		boolean hasRules = false;
		for (Generalization generalization : template.getGeneralizations()) {
			String rule = CDAModelUtil.computeConformanceMessage(generalization, true);
			if (rule.length() > 0) {
				hasRules = true;
				writer.println("<li>" + rule + "</li>");
			}
		}
		for (Property property : template.getOwnedAttributes()) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true) + "</li>");
		}
		for (Constraint constraint : template.getOwnedRules()) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(constraint, true) + "</li>");
		}
		
		if (!hasRules) {
			writer.println("<li></li>");
		}

		writer.println("</ol>");
		writer.println("</body>");
		writer.println("</topic>");
	}

}
