/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added support for TransformAssociation
 *     Sarp Kaya (NEHTA)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.dita.internal.Logger;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class DitaTransformer {

	private DitaTransformerOptions transformerOptions;

	public DitaTransformer() {
		this(new DitaTransformerOptions());
	}

	public DitaTransformer(DitaTransformerOptions options) {
		transformerOptions = options;

		if (transformerOptions.getBaseURL() != null) {
			CDAModelUtil.INFOCENTER_URL = transformerOptions.getBaseURL();
		}
	}

	public void transformElement(Element element) {
		// get list of published classifiers
		Boolean prevCard = CDAModelUtil.cardinalityAfterElement;
		CDAModelUtil.cardinalityAfterElement = transformerOptions.isCardinalityAfterElement();
		CDAModelUtil.isAppendConformanceRules = transformerOptions.isAppendConformanceRules();

		UMLSwitch<Object> pubList = new UMLSwitch<Object>() {
			@Override
			public Object caseClassifier(Classifier classifier) {
				transformerOptions.getPubClassifiers().add(classifier);
				return classifier;
			}

			@Override
			public Object caseElementImport(ElementImport elementImport) {
				if (elementImport.getImportedElement() instanceof Classifier) {
					transformerOptions.getPubClassifiers().add((Classifier) elementImport.getImportedElement());
				}
				return elementImport;
			}
		};
		TreeIterator<EObject> pubListIterator = EcoreUtil.getAllContents(Collections.singletonList(element));
		while (pubListIterator != null && pubListIterator.hasNext()) {
			EObject child = pubListIterator.next();
			pubList.doSwitch(child);
		}

		UMLSwitch<Object> transformPackage = new TransformPackage(transformerOptions);
		UMLSwitch<Object> transformClass = new TransformClass(transformerOptions);
		UMLSwitch<Object> transformClassProperties = new TransformClassContent(transformerOptions);
		UMLSwitch<Object> transformValueSet = new TransformValueSet(transformerOptions);
		UMLSwitch<Object> generateSections = new TransformCDA(transformerOptions);

		File templateDirectory = new File(
			transformerOptions.getOutputPath().removeLastSegments(1).append("templates").toOSString());

		boolean useTemplates = templateDirectory.isDirectory();
		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();
				if (child instanceof ElementImport) {
					child = ((ElementImport) child).getImportedElement();
				}

				if (child != null) {

					transformPackage.doSwitch(child);

					// omit nested classesCDA
					if (child instanceof Class) {

						if (!CDAModelUtil.isInlineClass((Class) child) ||
								CDAModelUtil.isPublishSeperately((Class) child)) {
							if (useTemplates) {
								generateSections.doSwitch(child);
							} else {
								transformClass.doSwitch(child);
							}
							transformClassProperties.doSwitch(child);
						}
					}

					transformValueSet.doSwitch(child);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}

		for (Package umlPackage : transformerOptions.getPackageContentMap().keySet()) {
			String normalizedPackageName = UML2Util.getValidJavaIdentifier(umlPackage.getName());
			writeMapFile(
				"classes", "package_" + normalizedPackageName, "Package: " + umlPackage.getName(),
				transformerOptions.getPackageContentList(umlPackage));
		}

		writeMapFile("classes", "document", "Document Templates", transformerOptions.getDocumentList());
		writeMapFile("classes", "section", "Section Templates", transformerOptions.getSectionList());
		writeMapFile(
			"classes", "clinicalstatement", "Clinical Statement Templates",
			transformerOptions.getClinicalStatementList());
		writeMapFile("classes", "classes", "Other Classes", transformerOptions.getClassList());
		writeMapFile("terminology", "valueset", "Value Sets", transformerOptions.getValueSetList());
		writeMapFile("classes", "references", "References", transformerOptions.getReferencesList());
		CDAModelUtil.cardinalityAfterElement = prevCard;
	}

	private void writeMapFile(String folder, String name, String title, List<String> fileNames) {
		Collections.sort(fileNames);

		IPath filePath = transformerOptions.getOutputPath().append(folder).addTrailingSeparator().append(
			name).addFileExtension("ditamap");
		File file = filePath.toFile();
		PrintWriter writer = null;

		try {
			file.createNewFile();
			writer = new PrintWriter(file);

			writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			writer.println("<!DOCTYPE map PUBLIC \"-//OASIS//DTD DITA Map//EN\" \"map.dtd\">");
			writer.println("<map title=\"" + title + "\">");

			for (String fileName : fileNames) {
				writer.println("<topicref href=\"" + fileName + "\" type=\"topic\" />");
			}

			writer.println("</map>");

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

}
