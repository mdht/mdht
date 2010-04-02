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
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClassProperties extends TransformAbstract {

	public TransformClassProperties(DitaTransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseClass(Class umlClass) {
		String pathFolder = "classes";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder)
				.addTrailingSeparator().append("generated").addTrailingSeparator().append(
						"_"+umlClass.getName()).addFileExtension("dita");
		File file = filePath.toFile();
		PrintWriter writer = null;

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

		return umlClass;
	}

	private void appendHeader(PrintWriter writer, Class umlClass) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlClass));
		writer.print(" - conformance rules");
		writer.println("</title>");
		
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		String cdaClassName = cdaClass != null ? cdaClass.getName() : "MISSING_CDA_CLASS";
		if (cdaClass != null) {
			writer.print("<shortdesc id=\"shortdesc\">");
			if (!umlClass.equals(cdaClass)) {
				// xref markup not allowed in shortdesc
//				String xref = computeXrefCDA(umlClass, cdaClass);
//				String format = xref.endsWith(".html") ? "format=\"html\" " : "";
				
//				StringBuffer cdaReference = new StringBuffer();
//				cdaReference.append("<xref " + format + "href=\"" + xref + "\">");
//				cdaReference.append("CDA ").append(cdaClassName);
//				cdaReference.append("</xref>");
			
				writer.print("[" + cdaClassName + ": templateId <tt>" 
						+ CDAModelUtil.getTemplateId(umlClass) + "</tt>]");
			}
			writer.println("</shortdesc>");
			
			writer.println("<prolog id=\"prolog\">");
			writer.println("<metadata><category>" + cdaClassName + "</category></metadata>");
			writer.println("<resourceid id=\"" + CDAModelUtil.getTemplateId(umlClass) + "\"/>");
			writer.println("</prolog>");
		}
	}

	private void appendBody(PrintWriter writer, Class umlClass) {
		writer.println("<body>");
		writer.println("<ol id=\"conformance\">");
		
		boolean hasRules = false;
		for (Generalization generalization : umlClass.getGeneralizations()) {
			String rule = CDAModelUtil.computeConformanceMessage(generalization, true);
			if (rule.length() > 0) {
				hasRules = true;
				writer.println("<li>" + rule + "</li>");
			}
		}
		for (Property property : umlClass.getOwnedAttributes()) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true) + "</li>");
		}
		for (Constraint constraint : umlClass.getOwnedRules()) {
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

//	private String computeXrefCDA(Element source, Class target) {
//		String href = null;
//		if (isSamePackage(source, target)) {
//			href="../" + target.getName() + ".dita";
//		}
//		else {
//			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.doc/classes/Act.html
//			href = "http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda."
//				+ "doc/classes/" + target.getName() + ".html";
//		}
//		return href;
//	}
//
//	private boolean isSamePackage(Element first, Element second) {
//		return first.getNearestPackage().equals(second.getNearestPackage());
//	}
	
}
