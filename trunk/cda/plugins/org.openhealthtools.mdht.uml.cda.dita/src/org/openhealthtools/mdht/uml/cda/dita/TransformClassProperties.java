package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClassProperties extends TransformAbstract {
	
	private InstanceGenerator instanceGenerator;

	public TransformClassProperties(DitaTransformerOptions options) {
		super(options);
		
		if (Platform.getBundle("org.openhealthtools.mdht.uml.cda") != null) {
			instanceGenerator = new InstanceGenerator();
			for (EPackage ePackage : options.getEPackages()) {
				instanceGenerator.addEPackage(ePackage);
			}
		}
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
		
		appendConformanceRules(writer, umlClass);
		appendExample(writer, umlClass);
		
		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendConformanceRules(PrintWriter writer, Class umlClass) {
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
	}

	private void appendExample(PrintWriter writer, Class umlClass) {
		writer.print("<codeblock id=\"example\"><![CDATA[");

		if (instanceGenerator != null) {
			EObject eObject = instanceGenerator.createInstance(umlClass, 1);
			if (eObject != null) {
				instanceGenerator.save(eObject, writer);
			}
		}
		else {
			writer.print("TODO: XML document snippet");
		}
		
		writer.println("]]></codeblock>");
	}

}
