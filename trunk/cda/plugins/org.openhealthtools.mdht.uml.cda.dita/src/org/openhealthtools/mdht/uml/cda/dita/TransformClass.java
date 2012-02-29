/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClass extends TransformAbstract {

	public TransformClass(DitaTransformerOptions options) {
		super(options);
	}

	private void appendBody(PrintWriter writer, Class umlClass) {
		String normalizedClassName = normalizeCodeName(umlClass.getName());

		writer.println("<body>");
		writer.println("<!-- TODO: insert non-model class description markup here -->");
		writer.println("<section conref=\"generated/_" + normalizedClassName + ".dita#classId/description\">");
		writer.println("</section>");
		writer.println("<!-- TODO: insert UML class diagram here -->");

		writer.println();
		writer.println("<ol audience=\"standards\" conref=\"generated/_" + normalizedClassName +
				".dita#classId/conformance\">");
		writer.println("<li></li>");
		writer.println("</ol>");
		writer.println("<ol audience=\"developer\" conref=\"generated/_" + normalizedClassName +
				".dita#classId/aggregate\">");
		writer.println("<li></li>");
		writer.println("</ol>");

		// only generate these sections for CDA templates
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (cdaClass != null) {
			writer.println("<p> </p>");

			writer.println("<section conref=\"generated/_" + normalizedClassName + ".dita#classId/tableconformance\">");
			writer.println("</section>");

			writer.println("<p> </p>");

			writer.println("<p> </p>"); // need a blank line before example code block
			// writer.println("<fig>");
			// writer.println("<title>" + UMLUtil.splitName(umlClass) + " example</title>");
			writer.println("<p><b>" + UMLUtil.splitName(umlClass) + " example</b></p>");
			writer.println("<!-- TODO: insert custom instance example here -->");
			writer.println("<!-- generated instance example follows -->");
			writer.println("<codeblock conref=\"generated/_" + normalizedClassName + ".dita#classId/example\">");
			writer.println("</codeblock>");
			// writer.println("</fig>");
		}

		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendHeader(PrintWriter writer, Class umlClass) {
		String normalizedClassName = normalizeCodeName(umlClass.getName());

		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlClass));
		writer.println("</title>");
		writer.println("<shortdesc conref=\"generated/_" + normalizedClassName +
				".dita#classId/shortdesc\"></shortdesc>");
		writer.println("<prolog conref=\"generated/_" + normalizedClassName + ".dita#classId/prolog\"></prolog>");
	}

	@Override
	public Object caseClass(Class umlClass) {
		String normalizedClassName = normalizeCodeName(umlClass.getName());

		String pathFolder = "classes";
		String fileName = normalizedClassName + ".dita";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder).addTrailingSeparator().append(
			normalizedClassName).addFileExtension("dita");
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

		List<String> packageContent = transformerOptions.getPackageContentList(umlClass.getNearestPackage());
		packageContent.add(fileName);

		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (cdaClass != null) {
			if (CDAModelUtil.isClinicalDocument(cdaClass)) {
				transformerOptions.getDocumentList().add(fileName);
			} else if (CDAModelUtil.isSection(cdaClass)) {
				transformerOptions.getSectionList().add(fileName);
			} else if (CDAModelUtil.isClinicalStatement(cdaClass)) {
				transformerOptions.getClinicalStatementList().add(fileName);
			} else {
				transformerOptions.getClassList().add(fileName);
			}
		} else {
			// temporary workaround for QDM category section in pub, use section list
			List<String> parentNames = UMLUtil.getAllParentNames(umlClass);
			parentNames.remove(0);
			if (parentNames.contains("QDM Element")) {
				transformerOptions.getSectionList().add(fileName);
			} else {
				transformerOptions.getClassList().add(fileName);
			}
		}

		return umlClass;
	}

}
