/*******************************************************************************
 * Copyright (c) 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.dita;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.dita.internal.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Generalization;

public class TransformCDA extends TransformAbstract {

	private String readDITATemplateAsString(String fileName) throws java.io.IOException {

		// Need to add path to ant task
		IPath templatePath = transformerOptions.getOutputPath().removeLastSegments(1).append(fileName);

		byte[] buffer = new byte[(int) new File(templatePath.toOSString()).length()];
		BufferedInputStream f = null;
		try {
			f = new BufferedInputStream(new FileInputStream(templatePath.toOSString()));
			f.read(buffer);
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException ignored) {
				}
			}
		}
		return new String(buffer);
	}

	public TransformCDA(DitaTransformerOptions options) {
		super(options);

	}

	private final String FORMALCLASSNAME = "FORMALCLASSNAME";

	private final String CLASSNAME = "CLASSNAME";

	private final String NARRATIVECLASSNAME = "NARRATIVECLASSNAME";

	private String[] createTemplateParameters(Class umlClass) {
		String[] templateParameters = new String[6];

		templateParameters[0] = NARRATIVECLASSNAME;
		templateParameters[2] = FORMALCLASSNAME;
		templateParameters[4] = CLASSNAME;

		templateParameters[1] = umlClass.getName();
		templateParameters[3] = TransformAbstract.getPublicationName(umlClass);
		templateParameters[5] = umlClass.getName();

		return templateParameters;
	}

	@Override
	public Object caseClass(Class umlClass) {

		String fileName = umlClass.getName() + ".dita";

		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (cdaClass != null) {
			if (CDAModelUtil.isClinicalDocument(cdaClass)) {
				generateClinicalDocument(umlClass);
				transformerOptions.getDocumentList().add(fileName);
			} else if (CDAModelUtil.isSection(cdaClass)) {
				generateSection(umlClass);
				transformerOptions.getSectionList().add(fileName);
			} else if (CDAModelUtil.isClinicalStatement(cdaClass)) {

				if (!(umlClass.getOwner() instanceof Class)) {
					generateClinicalStatement(umlClass);
					transformerOptions.getClinicalStatementList().add(fileName);
				}

			} else {
				if (!(umlClass.getOwner() instanceof Class)) {
					transformerOptions.getClassList().add(fileName);
				}
			}
		} else {
			transformerOptions.getClassList().add(fileName);
		}

		return umlClass;
	}

	private void generateClinicalDocument(Class umlClass) {

		generateDitaFromTemplate(
			umlClass, createTemplateParameters(umlClass), umlClass.getName(), "dita", "classes",
			"templates/document.xml");

	}

	private void generateClinicalStatement(Class umlClass) {

		generateDitaFromTemplate(
			umlClass, createTemplateParameters(umlClass), umlClass.getName(), "dita", "classes", "templates/class.xml");

	}

	private void generateSection(Class umlClass) {

		String coupledClassName = "";

		boolean couple = false;

		for (Generalization generalization : umlClass.getGeneralizations()) {

			for (Comment comment : generalization.getOwnedComments()) {

				coupledClassName = generalization.getGeneral().getName();

				if ("couple".equals(comment.getBody())) {
					couple = true;
				}

				if ("skip".equals(comment.getBody())) {
					return;
				}

			}

		}
		String[] templateParameters = createTemplateParameters(umlClass);

		if (couple) {
			templateParameters[1] = coupledClassName;
		}

		if (couple) {
			generateDitaFromTemplate(
				umlClass, templateParameters, umlClass.getName(), "dita", "classes", "templates/coupledsection.xml");

		} else {
			generateDitaFromTemplate(
				umlClass, templateParameters, umlClass.getName(), "dita", "classes", "templates/section.xml");
		}

		generateDitaFromTemplate(
			umlClass, templateParameters, umlClass.getName() + "Sample", "dita", "classes",
			"templates/sectionsample.xml");

		generateDitaFromTemplate(
			umlClass, templateParameters, umlClass.getName() + "Table", "dita", "classes",
			"templates/sectiontable.xml");

		generateDitaFromTemplate(
			umlClass, templateParameters, umlClass.getName(), "ditamap", "content", "templates/sectioncontent.xml");

	}

	private void generateDitaFromTemplate(Class umlClass, String[] templateParameters, String fileName,
			String fileExtension, String outputlocation, String templateName) {

		IPath filePath = transformerOptions.getOutputPath().append(outputlocation).addTrailingSeparator().append(
			fileName).addFileExtension(fileExtension);
		File file = filePath.toFile();
		PrintWriter writer = null;

		// if (!file.exists()) {
		try {
			file.createNewFile();

			writer = new PrintWriter(file);

			try {

				String template = readDITATemplateAsString(templateName);

				for (int index = 0; index < templateParameters.length; index += 2) {
					template = template.replaceAll(templateParameters[index], templateParameters[index + 1]);

				}

				writer.println(template);

			} catch (IOException e) {
				e.printStackTrace();
			}

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

	}
}
