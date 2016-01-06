/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api.dotnet.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.api.GenerateAPIForProgrammingLanguageAction;
import org.openhealthtools.mdht.api.dotnet.Activator;
import org.openhealthtools.mdht.api.dotnet.CDAOCL2CSharpHandler;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;
import org.openhealthtools.mdht.transformation.ocl2csharp.OCL2CSharpTransformationForUML;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;

public class GenerateDotNetAction extends GenerateAPIForProgrammingLanguageAction {

	@Override
	protected String getTargetLanguage() {
		return "C#";
	}

	@Override
	protected File genfolder(File modelFolder, String suffix) {
		String folder = System.getProperty("DOTNET_TARGET_FOLDER");
		if (folder != null)
			return new File(folder);
		return new File(modelFolder.getParentFile(), "src-dotnet");
	}

	@Override
	protected String getRootFileExtension() {
		return ".cs";
	}

	protected String getPlugin() {
		return Activator.PLUGIN_ID;
	}

	protected void writeEntity(String content, String fileName) throws IOException {
		content = content.replace("NullFlavor.", "Nehta.HL7.CDA.NullFlavor.");
		creator.writeFile(content, new File(genfolder, fileName + getRootFileExtension()));
	}

	protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> createTrafo(final ResourceSet resourceSet) {
		return new OCL2CSharpTransformationForUML(resourceSet, new CDAOCL2CSharpHandler<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject>());
	}

	protected String printIsOptionalPresent(String var) {
		return var + ".Count != 0";
	}

	protected String printRetrieveOptional(String var) {
		return var + ".Last()";
	}

	protected String printOptional(String facade) {
		return "List<" + facade + ">";
	}

	protected String printLastOrDefault() {
		return "";
	}

	protected String printStreamClass() {
		return "List";
	}

	protected String setOrAdd(Property baseProperty, String value, String self) {
		return self + "." + trafo.getQualifiedName(baseProperty) + " = SetOrAdd(" + self + "." + trafo.getQualifiedName(baseProperty) + ", " + value + ");\n";
	}

	protected void closeNamespace(StringBuilder code) {
		code.append("}\n");
	}

	protected String printAddValidationError(String analysis) {
		return "vb.AddValidationMessage(vb.PathName, null, \"" + StringEscapeUtils.escapeJava(analysis) + "\");";
	}

	protected String printConstructor(Type clazz) {
		return "new " + getProgrammingType(clazz) + "()";
	}

	protected String printConstructor(Property property) {
		String type = getProgrammingType(property);
		if ("string".equals(type))
			return "String.Empty";
		return "new " + ("QTY".equals(type) ? "PQ" : ("ANY".equals(type) ? "TEL" : type)) + (type.contains("[]") ? "{}" : "()");
	}

	protected void addStandardImports(StringBuilder code, String qualifiedClassName, String extendsClass) {
		code.append("using System;\n");
		code.append("using System.Collections.Generic;\n");
		code.append("using System.Linq;\n");
		code.append("using System.Text;\n");
		code.append("using Nehta.HL7.CDA;\n");
		code.append("using Nehta.VendorLibrary.Common;\n");
		code.append("\n");

		int index = qualifiedClassName.lastIndexOf(".");
		if (index != -1)
			code.append("namespace " + qualifiedClassName.substring(0, index).toLowerCase() + "\n");
		code.append("{\n");

		code.append("    public class " + qualifiedClassName.substring(index + 1) + (extendsClass != null ? " : " + extendsClass : "") + "\n");
		code.append("    {\n");
		code.append("\n");
	}

	protected String getMultivaluedGetter(Property property) {
		String result = super.getMultivaluedGetter(property);
		if ("operator".equals(result) || "event".equals(result))
			result = "@" + result;
		return result;
	}

	protected String getFeaturePointer(Property baseProperty) {
		return "\"" + withoutAt(trafo.getQualifiedName(baseProperty)) + "\"";
	}

	protected void defineProperty(StringBuilder pattern, Property property, String type, String returnBody, String setOrAdd) {
		if ("mixed".equals(property.getName())) {
			returnBody = "self." + trafo.getQualifiedName(property) + " == null ? String.Empty : string.Join(String.Empty, self." + trafo.getQualifiedName(property) + ")";
			setOrAdd = "self." + trafo.getQualifiedName(property) + " = new string[] { value };\n";
		}

		if (hasPropertiesSupport()) {
			pattern.append("\t\tpublic " + type + " " + facadeProperty(property) + "\n");
			pattern.append("\t\t{\n");
			if (returnBody != null) {
				pattern.append("\t\t\tget\n");
				pattern.append("\t\t\t{\n");
				pattern.append("\t\t\t\treturn " + returnBody + ";\n");
				pattern.append("\t\t\t}\n");
			}
			if (setOrAdd != null) {
				pattern.append("\t\t\tset\n");
				pattern.append("\t\t\t{\n");
				pattern.append("\t\t\t\t" + setOrAdd);
				pattern.append("\t\t\t}\n");
			}
			pattern.append("\t\t}\n\n");
			return;
		}

		if (returnBody != null) {
			pattern.append("\t\tpublic " + type + " " + facadeProperty(property) + "()");
			pattern.append("\t\t{\n");
			pattern.append("\t\t\treturn " + returnBody + ";\n");
			pattern.append("\t\t}\n\n");
		}
		if (setOrAdd != null) {
			pattern.append("\t\tpublic void " + facadeProperty(property) + "(" + type + " value)");
			pattern.append("\t\t{\n");
			pattern.append("\t\t\t" + setOrAdd);
			pattern.append("\t\t}\n\n");
		}
	}

	protected boolean hasPropertiesSupport() {
		return false;
	}

	private String withoutAt(String name) {
		if (name.startsWith("@"))
			return name.substring(1);
		return name;
	}

	protected String getProgrammingType(Type t) {
		if (t instanceof Class)
			t = CDACommonUtils.getCDAType((Class) t);
		String type = t != null ? trafo.getName(t) : "Object";
		type = adjustProgrammingType(type);
		return type;
	}

	protected String adjustProgrammingType(String type) {
		type = type.replaceAll("^EBooleanObject", "bool");
		type = type.replaceAll("^EBigInteger", "string");
		type = type.replaceAll("^csType", "string");
		type = type.replaceAll("^stType", "string");
		type = type.replaceAll("^tsType", "string");
		type = type.replaceAll("^ActMoodPredicate", "ActMood");
		type = type.replaceAll("^x_ActMoodDefEvn", "ActMood");
		type = type.replaceAll("^uid", "string");
		type = type.replaceAll("^TypeId", "typeId");
		type = type.replaceAll("^POCD_MT000040SDTCPatient", "POCD_MT000040Patient");
		type = type.replaceAll("^POCD_MT000040ClinicalStatement", "POCD_MT000040Act");
		type = type.replaceAll("^POCD_MT000040RegionOfInterestValue", "POCD_MT000040RegionOfInterestvalue");
		type = type.replaceAll("^POCD_MT000040InfrastructureRootTypeId", "POCD_MT000040InfrastructureRoottypeId");
		type = type.replaceAll("^POCD_MT000040StrucDocText", "StrucDocText");
		type = type.replaceAll("^String", "string");
		type = type.replaceAll("^Real", "double");
		type = type.replaceAll("^EByteArray", "byte[]");
		type = type.replaceAll("^EBigDecimal", "string");
		type = type.replaceAll("^EIVL_event", "EIVLevent");
		type = type.replaceAll("^EFeatureMapEntry", "string");
		return type;
	}

	protected String getProgrammingType(Property property) {
		String type = getProgrammingType(property.getType());
		if ("ADXP".equals(type) && CDACommonUtils.getCDAProperty(property) != null)
			type = "adxp" + CDACommonUtils.getCDAProperty(property).getName();
		if ("ENXP".equals(type) && CDACommonUtils.getCDAProperty(property) != null)
			type = "en" + CDACommonUtils.getCDAProperty(property).getName();
		if ("double".equals(type) && "probability".equals(property.getName()) && "UVP_PQ".equals(property.getClass_().getName()))
			type = "float";
		if ("ED".equals(type) && "thumbnail".equals(property.getName()))
			type = "thumbnail";
		return type;
	}

}
