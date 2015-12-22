/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;
import org.openhealthtools.mdht.uml.cda.core.util.CDASampler;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;

abstract public class GenerateAPIForProgrammingLanguageAction extends GenerateAPIAction {

	protected String getEntityMimeType() {
		return "text/plain";
	}

	abstract protected void writeEntity(String content, String fileName) throws IOException;

	@Override
	protected String toValidFileName(String filename) {
		filename = filename.replace(".", "_").replace(" ", ""); // cosmetics
		filename = filename.replaceAll("[:\\\\/*\"?|<>']", ""); // remove invalid characters
		filename = filename.replace("-", "_").replace("(", "").replace(")", "");
		return filename;
	}

	private String getFacadeNamespace(Type context) {
		if (context == null)
			return "facade";
		return "facade." + context.getNamespace().getQualifiedName().toLowerCase().replace("::", ".");
	}

	/**
	 * Generates the .net code
	 * 
	 * @param pack
	 * @param monitor
	 * @throws Exception
	 */
	protected void genAPICode(final Package pack, IProgressMonitor monitor) throws Exception {
		monitor = new SubProgressMonitor(monitor, 80);
		monitor.beginTask("", classes.size());

		StringBuilder sampleCode = new StringBuilder();

		String sampleFileName = getFacadeNamespace(umlClinicalDocument) + ".SampleGenerator";
		addStandardImports(sampleCode, sampleFileName, null);

		String errorMessageTemplate = getStereotype(pack, "errorMessageTemplate");
		String summaryRowTemplate = getStereotype(pack, "summaryRowTemplate");

		StringBuilder summary = new StringBuilder("<table border=\"1\">\n" + summaryRowTemplate.replace("{", "").replace("}", ""));
		List<String> summaryRows = new ArrayList<String>();

		for (Class clazz : classes) {

			monitor.worked(1);
			if (clazz.getName() == null || "".equals(clazz.getName().trim()))
				continue;
			monitor.subTask(CDACommonUtils.getUmlContext(clazz));
			if (monitor.isCanceled())
				throw new RuntimeException("Canceled by user");

			String fileName = getFacadeNamespace(clazz) + "." + clazz.getName() + "Facade";
			List<String> validationMethods = new ArrayList<String>();
			StringBuilder validationCode = new StringBuilder();

			for (final Constraint constraint : CDACommonUtils.getAllRules(clazz)) {
				try {

					NamedElement element = getConstrainedElement(constraint);
					if (element == null)
						continue;

					String analysis = CDACommonUtils.withoutTags(resolve(errorMessageTemplate, clazz, element, constraint).replace("\n", "\n\t\t"));
					String test = resolve("{xpath-test}", clazz, element, constraint);
					String method = toValidFileName("Validate" + getConstraintName(constraint));
					validationMethods.add(method);
					validationCode.append("\t\t/**\n");
					validationCode.append("\t\t * " + "OCL: " + resolve("{ocl-constraint}", clazz, element, constraint).replace("\n", " ") + "\n");
					validationCode.append("\t\t * " + "Context: " + CDACommonUtils.getUmlContext(clazz) + "\n");
					validationCode.append("\t\t * " + "Context Class: " + clazz.getQualifiedName() + "\n");
					validationCode.append("\t\t * " + "Constraint Name: " + constraint.getQualifiedName() + "\n");
					validationCode.append("\t\t */\n");
					validationCode.append("\t\tpublic bool " + method + "(ValidationBuilder vb, DataElementLevel? del)\n");
					validationCode.append("\t\t{\n");
					validationCode.append("\t\t\tif (del != null && del != DataElementLevel." + getLiteralForDEL(getDataElementLevel(clazz, element)) + ")\n");
					validationCode.append("\t\t\t{\n");
					validationCode.append("\t\t\t\treturn true;\n");
					validationCode.append("\t\t\t}\n");
					validationCode.append("\t\t\tbool result = " + test + ";\n");
					validationCode.append("\t\t\tif (!result && vb != null)\n");
					validationCode.append("\t\t\t{\n");
					validationCode.append("\t\t\t\t" + printAddValidationError(analysis) + "\n");
					validationCode.append("\t\t\t}\n");
					validationCode.append("\t\t\treturn result;\n");
					validationCode.append("\t\t}\n\n");
					summaryRows.add(resolve(summaryRowTemplate, clazz, element, constraint));

				} catch (Exception e) {
					CDACommonUtils.addStatus(statuses, IStatus.ERROR, getPlugin(), 17, "Could not transform OCL constraint \"" + constraint.getName() + "\"", e, constraint);
				}

			}
			{
				StringBuilder code = new StringBuilder();
				String className = clazz.getName() + "Facade";
				addStandardImports(code, fileName, "facade.FacadeBase");

				Classifier baseType = CDACommonUtils.getCDAType(clazz);
				if (baseType == null)
					CDACommonUtils.getCDAType(clazz);
				String selfType = getProgrammingType(clazz);
				code.append("\t\tpublic " + selfType + " self;\n\n");

				String templateId = CDACommonUtils.getTemplateId(clazz);
				Property templateIdProperty = creator.getTemplateIdProperty(clazz);
				if (templateId != null && templateIdProperty != null) {
					code.append("\t\tpublic static string TEMPLATEID = \"" + templateId + "\";\n\n");
				}

				Object codePredicate = CDACommonUtils.getPredicateForCodeOrClasscodeCheck(null, clazz);
				if (codePredicate instanceof CodeSystemConstraint) {
					CodeSystemConstraint codeSystemConstraint = (CodeSystemConstraint) codePredicate;
					if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
						code.append("\t\tpublic static string CODE = \"" + codeSystemConstraint.getCode() + "\";\n\n");
					}
					if (codeSystemConstraint != null && getCodeSystem(codeSystemConstraint) != null) {
						code.append("\t\tpublic static string CODESYSTEM = \"" + getCodeSystem(codeSystemConstraint) + "\";\n\n");
					}
				}

				List<Property> atts = new ArrayList<Property>();
				for (Property prop : editableAttributes(clazz)) {
					boolean remove = false;
					if ("URG_PQ".equals(clazz.getName()) || "IVL_INT".equals(clazz.getName()) || "IVL_PQ".equals(clazz.getName()) || "IVL_TS".equals(clazz.getName()))
						remove = "center".equals(prop.getName()) || "high".equals(prop.getName()) || "low".equals(prop.getName()) || "width".equals(prop.getName());
					else if ("ON".equals(clazz.getName()))
						remove = "family".equals(prop.getName()) || "given".equals(prop.getName()) || "nullFlavor".equals(prop.getName());
					else if ("RegionOfInterest".equals(clazz.getName()))
						remove = "regionOfInterestId".equals(prop.getName());
					else if ("ObservationMedia".equals(clazz.getName()))
						remove = "observationMediaId".equals(prop.getName());
					else
						remove = prop.getName().startsWith("sDTC") || "sectionId".equals(prop.getName());
					if (!remove)
						atts.add(prop);
				}
				atts.retainAll(CDACommonUtils.allAttributes(clazz));

				for (Property property : atts) {
					Property baseProperty = CDACommonUtils.getCDAProperty(property);
					TextValue textValue = CDACommonUtils.getTextValue(property);
					if (baseProperty != null && "title".equals(baseProperty.getName()) && textValue != null && textValue.getValue() != null) {
						String text = textValue.getValue().trim();
						code.append("\t\tpublic static string TITLE = \"" + StringEscapeUtils.escapeJava(text) + "\";\n\n");
					}
				}

				if (!clazz.isAbstract()) {
					code.append("\t\tpublic " + className + "()\n");
					code.append("\t\t{\n");
					code.append("\t\t\tthis.self = " + printConstructor(clazz) + ";\n");
					code.append("\t\t}\n\n");
				}
				code.append("\t\tpublic " + className + "(" + selfType + " self)\n");
				code.append("\t\t{\n");
				code.append("\t\t\tthis.self = self;\n");
				code.append("\t\t}\n\n");
				code.append("\t\tpublic static bool isKindOf(" + selfType + " self)\n");
				code.append("\t\t{\n");
				String typeCheck = trafo.getTypeCheck(clazz);
				code.append("\t\t\treturn " + (typeCheck != null ? typeCheck : "true") + ";\n");
				code.append("\t\t}\n\n");
				code.append("\t\toverride public object getModelElement()\n");
				code.append("\t\t{\n");
				code.append("\t\t\treturn self;\n");
				code.append("\t\t}\n\n");

				code.append("\t\tpublic void Init()\n");
				code.append("\t\t{\n");
				if (templateId != null && templateIdProperty != null) {
					setOrAdd(code, CDACommonUtils.findAttribute((Class) templateIdProperty.getType(), "root"), "\"" + templateId + "\"", getGetOrCreateGetter(templateIdProperty) + "().self");
				}
				initProperties(clazz, code, "self.", atts);
				code.append("\t\t}\n\n");

				code.append("\t\t/**\n");
				code.append("\t\t *" + "UML path: " + CDACommonUtils.getUmlContext(clazz) + "\n");
				code.append("\t\t *" + "UML root path: " + CDACommonUtils.getUmlContext(clazz, false) + "\n");
				code.append("\t\t*/\n");
				code.append("\t\tpublic void Validate(ValidationBuilder vb, DataElementLevel? del)\n");
				code.append("\t\t{\n");
				for (String method : validationMethods) {
					code.append("\t\t\t\t" + method + "(vb, del);\n");
				}
				code.append("\n");

				for (Property property : atts) {
					if (hasFacade(property.getType())) {
						code.append("\t\t\t\t" + getMultivaluedGetter(property) + "().ForEach(x => x.Validate(vb, del));\n");
					}
				}
				code.append("\t\t}\n");

				code.append(validationCode);

				for (Property property : atts) {
					Property baseProperty = CDACommonUtils.getCDAProperty(property);
					if (hasFacade(property.getType())) {
						String type = getProgrammingType(property);
						String facade = getFacadeClass(property.getType());
						code.append("\t\tpublic " + printStreamClass() + "<" + facade + "> " + getMultivaluedGetter(property) + "()\n");
						code.append("\t\t{\n");
						if ("datatypes".equals(property.getType().getNearestPackage().getName()))
							code.append("\t\t\treturn Set(self." + trafo.getQualifiedName(baseProperty) + ").FindAll( x => " + trafo.instanceOf("x", type) + ").ConvertAll( x => " + trafo.typeCast("x", type) + ").ConvertAll( x => new " + facade + "(x))" + ";\n");
						else
							code.append("\t\t\treturn Set(self." + trafo.getQualifiedName(baseProperty) + ").FindAll( x => " + facade + ".isKindOf(x)).ConvertAll( x => new " + facade + "(x))" + ";\n");
						code.append("\t\t}\n\n");

						printGetOrCreate(code, property, facade);

						code.append("\t\tpublic " + facade + " " + getCreateAnotherGetter(property) + "()\n");
						code.append("\t\t{\n");
						code.append("\t\t\t" + type + " element = " + printConstructor(property) + ";\n");
						code.append("\t\t\t" + facade + " elementFacade = new " + facade + "(element);\n");
						code.append("\t\t\telementFacade.Init();\n");
						setOrAdd(code, baseProperty, "element", "self");
						code.append("\t\t\treturn elementFacade;\n");
						code.append("\t\t}\n\n");

						defineProperty(code, property, facade, getGetOrCreateGetter(property) + "()", null);
					} else {
						createCdaBaseGetters(code, property, baseProperty);
					}
				}

				code.append("}\n");
				closeNamespace(code);
				writeEntity(code.toString(), fileName);

			}

		}
		InputStream inputStream = new URL(getFacadeBaseURL()).openConnection().getInputStream();
		writeEntity(CDACommonUtils.toString(inputStream), "facade.FacadeBase");

		monitor.subTask("Write " + summaryFile.getName());
		Collections.sort(summaryRows);
		summary.append(StringUtils.join(summaryRows, ""));
		summary.append("</table>\n");
		CDACommonUtils.stringToFile(summary.toString(), summaryFile);

		if (umlClinicalDocument == null) {
			monitor.done();
			return;
		}
		sampleCode.append("        public static " + getFacadeClass(umlClinicalDocument) + " GetSample()\n");
		sampleCode.append("        {\n\n");
		sampleCode.append("            " + getFacadeClass(umlClinicalDocument) + " doc = new " + getFacadeClass(umlClinicalDocument) + "();\n\n");
		sampleCode.append("            doc.Init();\n\n");

		generateSamples(umlClinicalDocument, sampleCode, new CDASampler(), "doc", new HashSet<Type>());

		sampleCode.append("\n            return doc;\n");
		sampleCode.append("\n      }\n\n\n");
		sampleCode.append("    }\n");
		closeNamespace(sampleCode);
		writeEntity(sampleCode.toString(), sampleFileName);
		monitor.done();
	}

	protected String getFacadeBaseURL() {
		return "platform:/plugin/" + getPlugin() + "/resources/FacadeBase" + getRootFileExtension();
	}

	private void printGetOrCreate(StringBuilder pattern, Property property, String facade) {
		pattern.append("\t\tpublic " + facade + " " + getGetOrCreateGetter(property) + "()\n");
		pattern.append("\t\t{\n");
		pattern.append("\t\t\t" + printOptional(facade) + " lastOrDefault = " + getMultivaluedGetter(property) + "()" + printLastOrDefault() + ";\n");
		pattern.append("\t\t\tif (" + printIsOptionalPresent("lastOrDefault") + ")\n");
		pattern.append("\t\t\t{\n");
		pattern.append("\t\t\t\tMarkSpecified(self, " + getFeaturePointer(CDACommonUtils.getCDAProperty(property)) + ");\n");
		pattern.append("\t\t\t\treturn " + printRetrieveOptional("lastOrDefault") + ";\n");
		pattern.append("\t\t\t}\n");
		pattern.append("\t\t\treturn " + getCreateAnotherGetter(property) + "();\n");
		pattern.append("\t\t}\n\n");
	}

	protected void setOrAdd(StringBuilder pattern, Property baseProperty, String value, String self) {
		pattern.append("\t\t\t" + setOrAdd(baseProperty, value, self));
	}

	protected String getMultivaluedGetter(Property property) {
		return WordUtils.uncapitalize(getFacadePropertyName(property));
	}

	protected String getFacadePropertyName(Property property) {
		if ("mixed".equals(property.getName()))
			return "Text";
		return WordUtils.capitalize(property.getName());
	}

	private String getGetOrCreateGetter(Property property) {
		return "GetOrCreate" + getFacadePropertyName(property);
	}

	private String getCreateAnotherGetter(Property property) {
		return "CreateAnother" + getFacadePropertyName(property);
	}

	protected String facadeProperty(Property property) {
		return getFacadePropertyName(property);
	}

	protected boolean hasFacade(Type type) {
		return type instanceof Class && (irResources.contains(type.eResource()) || "datatypes".equals(type.getNearestPackage().getName()) || "cda".equals(type.getNearestPackage().getName()) || "nehta".equals(type.getNearestPackage().getName()));
	}

	private String getFacadeClass(Type type) {
		return getFacadeNamespace(type) + "." + type.getName() + "Facade";
	}

	protected void generateSamples(Class parentClass, StringBuilder sampleCode, CDASampler sampler, String context, Set<Type> handled) {
		if (handled.contains(parentClass) && !sampler.hasData())
			return;
		handled.add(parentClass);
		sampler.mergeSampleXML(parentClass, null);
		for (Property property : CDACommonUtils.allAttributes(parentClass)) {
			int index = 1;
			boolean structuralRequired = property.getType().eResource() == resource;
			sampler.descentProperty(property);
			while (sampler.hasData() || structuralRequired) {
				try {
					String propContext = context + "." + retrieveProperty(property);
					if (index > 1) {
						sampleCode.append("            " + context + "." + getCreateAnotherGetter(property) + "();\n");
					}
					if (sampler.getSample() != null) {
						sampleCode.append("            " + assignProperty(propContext, trafo.getValue(property, sampler.getSample())) + ";\n");
					}
					if (property.getType() instanceof Class && property.getType() != parentClass) {
						Class class1 = (Class) property.getType();
						generateSamples(class1, sampleCode, sampler, propContext, new HashSet<Type>(handled));
					}
				} finally {
					sampler.ascentProperty();
				}
				index++;
				structuralRequired = false;
				sampler.descentProperty(property);
			}
			sampler.ascentProperty();
		}

	}

	private String retrieveProperty(Property property) {
		if (hasPropertiesSupport()) {
			return facadeProperty(property);
		}
		return facadeProperty(property) + "()";
	}

	protected String assignProperty(String propContext, String value) {
		if (hasPropertiesSupport()) {
			return propContext + " = " + value;
		}
		return propContext.substring(0, propContext.length() - "()".length()) + "(" + value + ")";
	}

	protected String getLiteralForDEL(String result) {
		if (DEL_CDA_HEADER == result)
			return "DEL_CDA_HEADER";
		if (DEL_CDA_BODY_LEVEL_2 == result)
			return "DEL_CDA_BODY_LEVEL_2";
		if (DEL_CDA_BODY_LEVEL_3 == result)
			return "DEL_CDA_BODY_LEVEL_3";
		return "NA";
	}

	private void createCdaBaseGetters(StringBuilder pattern, Property property, Property baseProperty) {
		String type = getProgrammingType(property);

		pattern.append("\t\tpublic " + printStreamClass() + "<" + type + "> " + getMultivaluedGetter(property) + "()\n");
		pattern.append("\t\t{\n");
		if (property.getType() != baseProperty.getType())
			pattern.append("\t\t\treturn Set(self." + trafo.getQualifiedName(baseProperty) + ").FindAll( x => " + trafo.instanceOf("x", type) + ").ConvertAll( x => (" + type + ") x)" + ";\n");
		else
			pattern.append("\t\t\treturn Set(self." + trafo.getQualifiedName(baseProperty) + ")" + ";\n");
		pattern.append("\t\t}\n\n");

		printGetOrCreate(pattern, property, type);

		pattern.append("\t\tpublic " + type + " " + getCreateAnotherGetter(property) + "()\n");
		pattern.append("\t\t{\n");
		pattern.append("\t\t\tMarkSpecified(self, " + getFeaturePointer(baseProperty) + ");\n");
		pattern.append("\t\t\t" + type + " element = " + printConstructor(property) + ";\n");
		setOrAdd(pattern, baseProperty, "element", "self");
		pattern.append("\t\t\treturn element;\n");
		pattern.append("\t\t}\n\n");

		defineProperty(pattern, property, type, getGetOrCreateGetter(property) + "()", setOrAdd(baseProperty, "value", "self"));

	}

	protected boolean hasPropertiesSupport() {
		return false;
	}

	private void initProperties(Class parentClass, StringBuilder pattern, String self, List<Property> atts) {
		for (Property property : atts) {
			if (property.getLower() > 0 || CDACommonUtils.getPropertyForTypeCheck(parentClass) == property || CDACommonUtils.getPropertyForCodeOrClasscodeCheck(parentClass) == property) {
				Property baseProperty = CDACommonUtils.getCDAProperty(property);
				if (!"string".equals(getProgrammingType(property))) {
					pattern.append("\t\t\t" + getGetOrCreateGetter(property) + "();\n");
				}
				CodeSystemConstraint codeSystemConstraint = CDACommonUtils.getCodeSystemConstraint(property);
				if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
					setOrAdd(pattern, CDACommonUtils.findAttribute((Class) baseProperty.getType(), "code"), "\"" + codeSystemConstraint.getCode() + "\"", getGetOrCreateGetter(property) + "().self");
					// pattern.append("\t\t\t" + self + baseProperty.getName() + ".code = SetOrAdd(" + self + baseProperty.getName() + ".code, \"" + codeSystemConstraint.getCode() + "\");\n");
				}
				if (codeSystemConstraint != null && getCodeSystem(codeSystemConstraint) != null) {
					setOrAdd(pattern, CDACommonUtils.findAttribute((Class) baseProperty.getType(), "codeSystem"), "\"" + getCodeSystem(codeSystemConstraint) + "\"", getGetOrCreateGetter(property) + "().self");
				}
				TextValue textValue = CDACommonUtils.getTextValue(property);
				if (textValue != null && textValue.getValue() != null) {
					String text = textValue.getValue().trim();
					setOrAdd(pattern, CDACommonUtils.findAttribute((Class) baseProperty.getType(), "mixed"), "\"" + text + "\"", getGetOrCreateGetter(property) + "().self");
					// pattern.append("\t\t\t" + self + baseProperty.getName() + ".Text = SetOrAdd(" + self + baseProperty.getName() + ".Text, \"" + text + "\");\n");
				}
				String dv = CDACommonUtils.getDefault(property);
				if (dv != null && !"".equals(dv)) {
					setOrAdd(pattern, baseProperty, adjustProgrammingType(trafo.getValue(property, CDACommonUtils.getDefault(property))), "self");
					// pattern.append("\t\t\t" + self + baseProperty.getName() + " = SetOrAdd(" + self + baseProperty.getName() + ", " + adjustDotNetType(trafo.getFixedValue(property)) + ");\n");

					if (property.getLower() == 0 && property.getType() instanceof Enumeration) {
						pattern.append("\t\t\t" + self + baseProperty.getName() + "Specified = true;\n");
					}
				}
			}
		}
	}

	public static Collection<Property> editableAttributes(Class cls) {
		List<Property> result = new ArrayList<Property>();
		for (Property property : CDACommonUtils.allAttributes(cls)) {
			if (CDACommonUtils.getCDAProperty(property) == null) {
				continue;
			}
			result.add(property);
		}
		return result;
	}

	abstract protected String printIsOptionalPresent(String var);

	abstract protected String printRetrieveOptional(String var);

	abstract protected String printOptional(String facade);

	abstract protected String printLastOrDefault();

	abstract protected String printStreamClass();

	abstract protected String printAddValidationError(String analysis);

	abstract protected String printConstructor(Type clazz);

	abstract protected String printConstructor(Property property);

	abstract protected String setOrAdd(Property baseProperty, String value, String self);

	abstract protected void addStandardImports(StringBuilder content, String qualifiedClassName, String extendsClass);

	abstract protected void closeNamespace(StringBuilder code);

	abstract protected String getFeaturePointer(Property baseProperty);

	abstract protected void defineProperty(StringBuilder pattern, Property property, String type, String returnBody, String setOrAdd);

	abstract protected String getProgrammingType(Type t);

	abstract protected String adjustProgrammingType(String type);

	abstract protected String getProgrammingType(Property property);

	/**
	 * TODO delete as duplicated in CDACommonUtils
	 * 
	 * @param codeSystemConstraint
	 * @return
	 */
	public static String getCodeSystem(CodeSystemConstraint codeSystemConstraint) {
		if (codeSystemConstraint.getReference() != null)
			return codeSystemConstraint.getReference().getIdentifier();
		return codeSystemConstraint.getIdentifier();
	}

}
