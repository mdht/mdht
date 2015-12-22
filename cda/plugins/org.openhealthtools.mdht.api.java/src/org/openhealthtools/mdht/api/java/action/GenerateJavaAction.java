/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api.java.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.api.GenerateAPIForProgrammingLanguageAction;
import org.openhealthtools.mdht.api.java.Activator;
import org.openhealthtools.mdht.api.java.CDAOCL2JavaHandler;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;
import org.openhealthtools.mdht.transformation.ocl2java.OCL2JavaTransformationForUML;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;

public class GenerateJavaAction extends GenerateAPIForProgrammingLanguageAction {

	@Override
	protected void addStandardImports(StringBuilder code, String qualifiedClassName, String extendsClass) {
		int index = qualifiedClassName.lastIndexOf(".");
		if (index != -1)
			code.append("package " + qualifiedClassName.substring(0, index).toLowerCase() + ";\n\n");
		code.append("import java.math.BigDecimal;\n");
		code.append("import java.math.BigInteger;\n");
		code.append("import java.util.ArrayList;\n");
		code.append("import java.util.HashMap;\n");
		code.append("import java.util.List;\n");
		code.append("import java.util.Map;\n");
		code.append("import java.util.Optional;\n");
		code.append("import java.util.stream.Collectors;\n");
		code.append("import java.util.stream.Stream;\n");
		code.append("\n");
		code.append("import org.eclipse.emf.ecore.EObject;\n");
		code.append("import org.eclipse.emf.ecore.EStructuralFeature;\n");
		code.append("import org.eclipse.emf.common.util.BasicDiagnostic;\n");
		code.append("import org.eclipse.emf.common.util.Diagnostic;\n");
		code.append("import org.eclipse.emf.common.util.DiagnosticChain;\n");
		code.append("import org.eclipse.emf.ecore.util.FeatureMapUtil;\n");
		code.append("import org.openhealthtools.mdht.uml.cda.*;\n");
		code.append("import org.openhealthtools.mdht.uml.cda.util.CDAUtil;\n");
		code.append("import org.openhealthtools.mdht.uml.hl7.datatypes.*;\n");
		code.append("import org.openhealthtools.mdht.uml.hl7.vocab.*;\n");
		code.append("\n");
		code.append("public class " + qualifiedClassName.substring(index + 1) + (extendsClass != null ? " extends " + extendsClass : "") + " {\n");
		code.append("\n");
	}

	@Override
	protected String getTargetLanguage() {
		return "Java 8";
	}

	@Override
	protected File genfolder(File modelFolder) {
		String folder = System.getProperty("JAVA_TARGET_FOLDER");
		if (folder != null)
			return new File(folder);
		return new File(modelFolder.getParentFile(), "src-java");
	}

	@Override
	protected String getRootFileExtension() {
		return ".java";
	}

	protected String getPlugin() {
		return Activator.PLUGIN_ID;
	}

	protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> createTrafo(final ResourceSet resourceSet) {
		return new OCL2JavaTransformationForUML(resourceSet, new CDAOCL2JavaHandler<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject>());
	}

	protected String adjustProgrammingType(String type) {
		type = type.replaceAll("^EBooleanObject", "Boolean");
		type = type.replaceAll("^EBigDecimal", "BigDecimal");
		type = type.replaceAll("^EBigInteger", "BigInteger");
		type = type.replaceAll("^EByteArray", "byte[]");
		type = type.replaceAll("^csType", "String");
		type = type.replaceAll("^ctType", "String");
		type = type.replaceAll("^stType", "String");
		type = type.replaceAll("^tsType", "String");
		type = type.replaceAll("^uid", "String");
		type = type.replaceAll("^Real", "Double");
		return type;
	}

	protected String printConstructor(Property property) {
		if ("EFeatureMapEntry".equals(property.getType().getName())) {
			return "any".equals(property.getName()) ? "FeatureMapUtil.createTextEntry(\"\")" : "\"\"";
		}
		return printConstructor(property.getType());
	}

	protected String getProgrammingType(Property property) {
		if ("EFeatureMapEntry".equals(property.getType().getName())) {
			return "any".equals(property.getName()) ? "org.eclipse.emf.ecore.util.FeatureMap.Entry" : "String";
		}
		String type = getProgrammingType(property.getType());
		return type;
	}

	protected String getProgrammingType(Type t) {
		if (t instanceof Class)
			t = CDACommonUtils.getCDAType((Class) t);
		if ("nehta".equals(t.getNearestPackage().getName()))
			return "ns.electronichealth.net.au.extensions." + t.getName();
		String type = t != null ? trafo.getName(t) : "Object";
		type = adjustProgrammingType(type);
		return type;
	}

	@Override
	protected void writeEntity(String content, String fileName) throws IOException {
		content = content.replace("bool ", "boolean ");
		content = content.replace(" string ", " String ");
		content = content.replace(" object ", " Object ");
		content = content.replace("FindAll(", "filter(");
		content = content.replace("ConvertAll(", "map(");
		content = content.replace("ForEach(", "forEach(");
		content = content.replace("ValidationBuilder ", "DiagnosticChain ");
		content = content.replace(" => ", " -> ");
		content = content.replace("DataElementLevel?", "DataElementLevel");
		content = content.replace("\n\t\t", "\n\t");
		content = content.replace("override ", "@Override\n\t");
		int index = fileName.lastIndexOf(".");
		File file = new File(genfolder + "/" + fileName.substring(0, index).replace(".", "/").toLowerCase(), fileName.substring(index + 1) + getRootFileExtension());
		creator.writeFile(content, file);
	}

	protected boolean hasPropertiesSupport() {
		return false;
	}

	protected String printConstructor(Type clazz) {
		if (clazz instanceof Class)
			clazz = CDACommonUtils.getCDAType((Class) clazz);
		String type = getProgrammingType(clazz);
		if ("String".equals(type))
			return "\"\"";
		if ("BigInteger".equals(type))
			return "BigInteger.ZERO";
		if ("BigDecimal".equals(type))
			return "BigDecimal.ZERO";
		if ("Boolean".equals(type))
			return "Boolean.FALSE";
		if ("Double".equals(type))
			return "(double) 0";
		if ("ANY".equals(type))
			type = "TEL";
		if ("QTY".equals(type))
			type = "PQ";
		if (clazz instanceof Enumeration)
			return type + ".get(0)";
		if ("datatypes".equals(clazz.getNearestPackage().getName()))
			return "DatatypesFactory.eINSTANCE.create" + type + "()";
		if ("cda".equals(clazz.getNearestPackage().getName()))
			return "CDAFactory.eINSTANCE.create" + type + "()";
		if ("nehta".equals(clazz.getNearestPackage().getName()))
			return "ns.electronichealth.net.au.extensions.NEHTAFactory.eINSTANCE.create" + clazz.getName() + "()";
		return "new " + type + (type.contains("[]") ? "{}" : "()");
	}

	protected String printAddValidationError(String analysis) {
		return "vb.add(new BasicDiagnostic(Diagnostic.ERROR, null, 0, \"" + StringEscapeUtils.escapeJava(analysis) + "\", new Object [] { self }));";
	}

	protected void closeNamespace(StringBuilder code) {
		// do nothing
	}

	protected String setOrAdd(Property baseProperty, String value, String self) {
		if ("EFeatureMapEntry".equals(baseProperty.getType().getName()) && !"any".equals(baseProperty.getName()))
			return self + ".addText(" + value + ");\n";
		else if (baseProperty.isMultivalued())
			return self + "." + trafo.getQualifiedName(baseProperty) + ".add(" + value + ");\n";
		else
			return self + "." + trafo.getQualifiedName(baseProperty).replaceAll("^get|^is", "set").replace("()", "(" + value + ")") + ";\n";
	}

	protected void defineProperty(StringBuilder pattern, Property property, String type, String returnBody, String setOrAdd) {
		if (returnBody != null) {
			pattern.append("\t\tpublic " + type + " " + facadeProperty(property) + "() {\n");
			pattern.append("\t\t\treturn " + returnBody + ";\n");
			pattern.append("\t\t}\n\n");
		}
		if (setOrAdd != null) {
			pattern.append("\t\tpublic void " + facadeProperty(property) + "(" + type + " value)" + " {\n");
			if ("mixed".equals(property.getName())) {
				setOrAdd = "self.addText(value);\n";
			}
			pattern.append("\t\t\t" + setOrAdd);
			pattern.append("\t\t}\n\n");
			if ("BigInteger".equals(type)) {
				pattern.append("\t\tpublic void " + facadeProperty(property) + "(int value)" + " {\n");
				pattern.append("\t\t\t" + setOrAdd);
				pattern.append("\t\t}\n\n");
			}
			if ("any".equals(property.getName())) {
				pattern.append("\t\tpublic void " + facadeProperty(property) + "(String value)" + " {\n");
				pattern.append("\t\t\t" + setOrAdd.replace(".add(value)", ".addAll(getValueForFeaturemap(value))"));
				pattern.append("\t\t}\n\n");
			}
		}
	}

	protected String printIsOptionalPresent(String var) {
		return var + ".isPresent()";
	}

	protected String printRetrieveOptional(String var) {
		return var + ".get()";
	}

	protected String printOptional(String facade) {
		return "Optional<" + facade + ">";
	}

	protected String printStreamClass() {
		return "Stream";
	}

	@Override
	protected String printLastOrDefault() {
		// see http://stackoverflow.com/questions/27547519/most-efficient-way-to-get-the-last-element-of-a-stream
		return ".reduce((a, b) -> b)";
	}

	@Override
	protected String getFeaturePointer(Property baseProperty) {
		String pName;

		Element package_ = baseProperty.getNearestPackage();
		Stereotype codegenSupport = package_.getAppliedStereotype("Ecore::EPackage");

		if (codegenSupport != null) {
			final String packageName = (String) package_.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);
			final String basePackage = (String) package_.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
			final String prefix = (String) package_.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);
			pName = basePackage + "." + packageName + "." + prefix;
		} else {
			pName = WordUtils.capitalize(baseProperty.getNearestPackage().getName());
		}

		return pName + "Package.eINSTANCE.get" + baseProperty.getClass_().getName() + "_" + WordUtils.capitalize(baseProperty.getName() + "()");
	}

}
