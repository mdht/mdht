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
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class CDAModelUtil {

	public static final String CDA_PACKAGE_NAME = "cda";

	public static final String SEVERITY_ERROR = "ERROR";
	public static final String SEVERITY_WARNING = "WARNING";
	public static final String SEVERITY_INFO = "INFO";

	public static Class getCDAClass(Class templateClass) {
		Class cdaClass = null;
		
		// if the provided class is from CDA and not a template
		if (CDA_PACKAGE_NAME.equals(templateClass.getNearestPackage().getName()))
			return templateClass;
		
		for (Classifier parent : templateClass.allParents()) {
			// nearest package may be null if CDA model is not available
			if (parent.getNearestPackage() != null) {
				if (CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName()) && parent instanceof Class) {
					cdaClass = (Class) parent;
					break;
				}
			}
		}
		
		return cdaClass;
	}

	public static Property getCDAProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())
						&& CDA_PACKAGE_NAME.equals(inherited.getNearestPackage().getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 */
	public static Property getInheritedProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}

	public static boolean isSection(Type templateClass) {
		if (templateClass instanceof Class) {
			Class cdaClass = getCDAClass((Class)templateClass);
			if (cdaClass != null && "Section".equals(cdaClass.getName()))
				return true;
		}
		
		return false;
	}
	
	public static boolean isClinicalStatement(Type templateClass) {
		if (templateClass instanceof Class) {
			Class cdaClass = getCDAClass((Class)templateClass);
			String cdaName = cdaClass==null ? null : cdaClass.getName();
			if (cdaClass != null && (
					"Act".equals(cdaName) || "Encounter".equals(cdaName)
					|| "Observation".equals(cdaName) || "ObservationMedia".equals(cdaName)
					|| "Organizer".equals(cdaName) || "Procedure".equals(cdaName)
					|| "RegionOfInterest".equals(cdaName) || "SubstanceAdministration".equals(cdaName)
					|| "Supply".equals(cdaName))) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void composeAllConformanceMessages(Element element, final PrintStream stream, final boolean markup) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
				Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				public Object caseAssociation(Association association) {
					iterator.prune();
					return association;
				}

				public Object caseClass(Class umlClass) {
					Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
							umlClass, ICDAProfileConstants.CDA_TEMPLATE);
					if (hl7Template != null) {
						String message = computeConformanceMessage(umlClass, markup);
						stream.println(message);
					}
					else {
						// prune children of non-template classes
						iterator.prune();
					}
					return umlClass;
				}

				public Object caseGeneralization(Generalization generalization) {
					String message = computeConformanceMessage(generalization, markup);
					if (message.length() > 0) {
						stream.println(message);
					}
					return generalization;
				}
				
				public Object caseProperty(Property property) {
					String message = computeConformanceMessage(property, markup);
					if (message.length() > 0) {
						stream.println(message);
					}
					return property;
				}
				
				public Object caseConstraint(Constraint constraint) {
					String message = computeConformanceMessage(constraint, markup);
					if (message.length() > 0) {
						stream.println(message);
					}
					return constraint;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}
	
	public static void assignAllConformanceMessages(Element element, final boolean markup) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
				Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				public Object caseAssociation(Association association) {
					iterator.prune();
					return association;
				}

				public Object caseClass(Class umlClass) {
					Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
							umlClass, ICDAProfileConstants.CDA_TEMPLATE);
					if (hl7Template != null) {
						String message = computeConformanceMessage(umlClass, markup);
						if (message.length() > 0) {
							umlClass.setValue(hl7Template, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE, message);
						}
					}
					else {
						// prune children of non-template classes
						iterator.prune();
					}
					return umlClass;
				}

				public Object caseProperty(Property property) {
					String message = computeConformanceMessage(property, markup);
					if (message.length() > 0) {
						Association association = property.getAssociation();
						
						if (!hasValidationSupport(property)) {
							if (isXMLAttribute(property)) {
								if (property.isReadOnly()) {
									CDAProfileUtil.applyCDAStereotype(property, ICDAProfileConstants.PROPERTY_VALIDATION);
								}
							}
							else if (association == null) {
								CDAProfileUtil.applyCDAStereotype(property, ICDAProfileConstants.PROPERTY_VALIDATION);
							}
						}
						
						if (association != null && !hasValidationSupport(association)) {
							CDAProfileUtil.applyCDAStereotype(association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
						}

						if (association == null && hasValidationSupport(property)) {
							setValidationMessage(property, message);
						}
						else if (association != null && hasValidationSupport(association)) {
							setValidationMessage(association, message);
						}
					}
					
					return property;
				}
				
				public Object caseConstraint(Constraint constraint) {
					if (hasValidationSupport(constraint)) {
						String message = computeConformanceMessage(constraint, markup);
						if (message.length() > 0) {
							setValidationMessage(constraint, message);
						}
					}
					return constraint;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}
	
	public static String computeConformanceMessage(Class template, boolean markup) {
		StringBuffer message = new StringBuffer();

		String templateId = getTemplateId(template);
		if (templateId != null) {
			if (!markup) {
				message.append(getPrefixedSplitName(template)).append(" ");
			}
			
			message.append("SHALL contain the template identifier ").append(templateId);
		}
		
		return message.toString();
	}

	public static String computeConformanceMessage(Generalization generalization, boolean markup) {
		StringBuffer message = new StringBuffer();
		
		if (generalization.getGeneral() instanceof Class) {
			Class general = (Class) generalization.getGeneral();

			String templateId = getTemplateId(general);
			if (templateId != null) {
				Package thisModel = UMLUtil.getTopPackage(generalization);
				Package generalModel = UMLUtil.getTopPackage(general);
				String prefix = (thisModel != generalModel) ? getModelPrefix(general)+" " : "";
				String xref = computeXref(generalization, general);
				boolean showXref = markup && (xref != null);
				String format = showXref && xref.endsWith(".html") ? "format=\"html\" " : "";
				
				message.append("Conforms to ");
				message.append(showXref ? "<xref " + format + "href=\"" + xref + "\">" : "");
				message.append(prefix).append(UMLUtil.splitName(general));
				message.append(showXref?"</xref>":"");
				message.append(" template (templateId: ");
				message.append(markup?"<tt>":"");
				message.append(templateId);
				message.append(markup?"</tt>":"");
				message.append(")");
			}
		}
		
		return message.toString();
	}

	private static String computeAssociationConformanceMessage(Property property, boolean markup) {
		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();
		Stereotype entryStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY);
		Stereotype entryRelationshipStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY_RELATIONSHIP);

		String typeCode = null;
		String typeCodeDisplay = null;
		if (entryStereotype != null) {
			EnumerationLiteral typeCodeLiteral = (EnumerationLiteral) association.getValue(
					entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE);
			if (typeCodeLiteral != null) {
				typeCode = typeCodeLiteral.getName();
				typeCodeDisplay = typeCodeLiteral.getLabel();
			}
		}
		else if (entryRelationshipStereotype != null) {
			EnumerationLiteral typeCodeLiteral = (EnumerationLiteral) association.getValue(
					entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			if (typeCodeLiteral != null) {
				typeCode = typeCodeLiteral.getName();
				typeCodeDisplay = typeCodeLiteral.getLabel();
			}
		}

		//TODO this is incomplete determination of XML element name
		String elementName = "component";
		Class cdaSourceClass = getCDAClass(property.getClass_());
		if ("ClinicalDocument".equals(cdaSourceClass.getName())) {
			elementName = "component";
		} else if ("Section".equals(cdaSourceClass.getName())) {
			elementName = "entry";
		} else if ("Organizer".equals(cdaSourceClass.getName())) {
			elementName = "component";
		} else {
			elementName = "entryRelationship";
		}
		
		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}
		
		String keyword = getValidationKeyword(association);
		message.append(markup?"<b>":"");
		message.append(keyword);
		message.append(markup?"</b>":"");
		
		message.append(" contain ");
		message.append(getMultiplicityString(property)).append(" ");

		message.append(markup?"<tt>":"");
		message.append(elementName);
		message.append(markup?"</tt>":"");
		
		message.append(" such that it");
		message.append(markup?"<ol>":"");
		
		if (typeCode != null) {
			message.append(markup?"\n<li>":", ");
			message.append(markup?"<b>":"");
			message.append("SHALL");
			message.append(markup?"</b>":"");
			message.append(" contain [1..1] @typeCode=\"");
			message.append(typeCode).append("\" ");
			message.append(markup?"<i>":"");
			message.append(typeCodeDisplay);
			message.append(markup?"</i>":"");
			message.append(markup?"</li>":"");
		}

		Class endType = (property.getType() instanceof Class) 
				? (Class)property.getType() : null;
		
		if (endType != null) {
			message.append(markup?"\n<li>":", ");
			message.append(markup?"<b>":"");
			message.append("SHALL");
			message.append(markup?"</b>":"");
			message.append(" contain [1..1] ");

			String prefix = !isSamePackage(property, endType) ? getModelPrefix(endType)+" " : "";
			String xref = computeXref(property, endType);
			boolean showXref = markup && (xref != null);
			String format = showXref && xref.endsWith(".html") ? "format=\"html\" " : "";
			
			message.append(showXref ? "<xref " + format + "href=\"" + xref + "\">" : "");
			message.append(prefix).append(UMLUtil.splitName(endType));
			message.append(showXref?"</xref>":"");
			
			String templateId = getTemplateId(endType);
			if (templateId != null) {
				message.append(" (templateId: ");
				message.append(markup?"<tt>":"");
				message.append(templateId);
				message.append(markup?"</tt>":"");
				message.append(")");
			}
		}

		message.append(markup?"</li>":"");
		message.append(markup?"</ol>":"");
		
		return message.toString();
	}

	public static String computeConformanceMessage(Property property, boolean markup) {
		if (property.getAssociation() != null && property.isNavigable()) {
			return computeAssociationConformanceMessage(property, markup);
		}
		
		StringBuffer message = new StringBuffer();
		
		List<Property> redefinedProperties = UMLUtil.getRedefinedProperties(property);
		Property redefinedProperty = redefinedProperties.isEmpty() ? null : redefinedProperties.get(0);
		if (redefinedProperty == null) {
			System.err.println("Cannot find redefined property for: " + property.getQualifiedName());
			return "";
		}

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}
		
		String keyword = getValidationKeyword(property);
		message.append(markup?"<b>":"");
		message.append(keyword);
		message.append(markup?"</b>":"");
		
		message.append(" contain ");
		message.append(getMultiplicityString(property)).append(" ");
		
		message.append(markup?"<tt>":"");
		if (isXMLAttribute(property)) {
			message.append("@");
		}
		message.append(property.getName());
		message.append(markup?"</tt>":"");
		
		if (isXMLAttribute(property) && property.getDefault() != null) {
			message.append(" = \"").append(property.getDefault()).append("\"");
		}
		
		Stereotype nullFlavorSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.NULL_FLAVOR);

		if (nullFlavorSpecification != null) {
			EnumerationLiteral nullFlavor = (EnumerationLiteral) property.getValue(nullFlavorSpecification, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);
			
			if (nullFlavor != null) {
				message.append(markup?"<tt>":"");
				message.append("/@nullFlavor");
				message.append(markup?"</tt>":"");

				message.append(" = \"").append(nullFlavor.getName()).append("\" ");
				message.append(markup?"<i>":"");
				message.append(nullFlavor.getLabel());
				message.append(markup?"</i>":"");
			}
		}

		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		
		if (vocabSpecification != null) {
			String codeSystem = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
			String codeSystemName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
			String codeSystemVersion = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
			String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
			String displayName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);
			
			if (code != null) {
				message.append(markup?"<tt>":"");
				message.append("/@code");
				message.append(markup?"</tt>":"");

				message.append(" = \"").append(code).append("\" ");
				
				if (displayName != null) {
					message.append(markup?"<i>":"");
					message.append(displayName);
					message.append(markup?"</i>":"");
				}

				if (codeSystem !=null || codeSystemName != null) {
					message.append(" (CodeSystem:");
					if (codeSystem != null) {
						message.append(" ").append(codeSystem);
					}
					if (codeSystemName != null) {
						message.append(" ").append(codeSystemName);
					}
					message.append(" STATIC");
					if (codeSystemVersion != null) {
						message.append(" ").append(codeSystemVersion);
					}
					message.append(")");
				}
			}
			//TODO for now, assume it's a value set if no code
			else if (codeSystem !=null || codeSystemName != null) {
				message.append(", which ");
				message.append(markup?"<b>":"");
				message.append(keyword);
				message.append(markup?"</b>":"");
				message.append(" be selected from ValueSet");

				if (codeSystem != null) {
					message.append(" ").append(codeSystem);
				}
				if (codeSystemName != null) {
					message.append(" ").append(codeSystemName);
				}
				
				if (codeSystemVersion != null) {
					message.append(" STATIC");
					message.append(" ").append(codeSystemVersion);
				}
				else {
					message.append(" DYNAMIC");
				}
			}
		}

		if (!isXMLAttribute(property) && (property.getType() != redefinedProperty.getType())) {
			message.append(", where its data type is ").append(property.getType().getName());
		}
		
		return message.toString();
	}

	public static String computeConformanceMessage(Constraint constraint, boolean markup) {
		StringBuffer message = new StringBuffer();

		String body = null;
		boolean isOCL = false;
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			for (int i=0; i<((OpaqueExpression) spec).getLanguages().size(); i++) {
				String lang = ((OpaqueExpression) spec).getLanguages().get(i);
				isOCL = "OCL".equals(lang);
				body = ((OpaqueExpression) spec).getBodies().get(i);

				// use Analysis if assigned, else first language available
				if ("Analysis".equals(lang)) {
					break;
				}
			}
		}
		
		if (body != null) {
			if (!markup) {
				message.append(getPrefixedSplitName(constraint.getContext())).append(" ");
			}
			
			String keyword = getValidationKeyword(constraint);
			message.append(markup?"<b>":"");
			message.append(keyword);
			message.append(markup?"</b>":"");
			
			message.append(" satisfy: ");
			message.append(isOCL&&markup?"<codeblock>":"");
			message.append(body);
			message.append(isOCL&&markup?"</codeblock>":"");
		}
		
		return message.toString();
	}
	
	protected static String computeXref(Element source, Class target) {
		String href = null;
		if (isSamePackage(source, target)) {
			href="../" + target.getName() + ".dita";
		}
		else {
			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.ccd.doc/templates/ProblemAct.html
			String prefix = getModelNamespacePrefix(target);
			href = "http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda."
				+ prefix + ".doc/templates/" + target.getName() + ".html";
		}
		return href;
	}
	
	protected static boolean isSamePackage(Element first, Element second) {
		return first.getNearestPackage().equals(second.getNearestPackage());
	}
	
	public static String getMultiplicityString(Property property) {
		String lower = Integer.toString(property.getLower());
		String upper = property.getUpper()==-1 ? "*" : Integer.toString(property.getUpper());
		
		StringBuffer message = new StringBuffer();
		message.append("[").append(lower).append("..").append(upper).append("]");
		
		return message.toString();
	}
	
	public static boolean isXMLAttribute(Property property) {
		Property cdaProperty = getCDAProperty(property);
		if (cdaProperty != null) {
			Stereotype eAttribute = cdaProperty.getAppliedStereotype("Ecore::EAttribute");
			if (eAttribute != null)
				return true;
		}
		
		return false;
	}
	
	public static String getTemplateId(Class template) {
		String templateId = null;
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
				template, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			templateId = (String) template.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		}
		
		return templateId;
	}
	
	public static String getModelPrefix(NamedElement element) {
		String prefix = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			prefix = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);
		}
		else if ("cda".equals(model.getName())) {
			prefix = "CDA";
		}
		
		return prefix;
	}

	public static String getModelNamespacePrefix(NamedElement element) {
		String prefix = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			prefix = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_PREFIX);
		}
		
		return prefix;
	}

	public static String getPrefixedSplitName(NamedElement element) {
		StringBuffer buffer = new StringBuffer();
		String modelPrefix = getModelPrefix(element);
		if (modelPrefix != null) {
			buffer.append(modelPrefix).append(" ");
		}
		buffer.append(UMLUtil.splitName(element));
		
		return buffer.toString();
	}
	
	public static boolean hasValidationSupport(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		return validationSupport != null;
	}

	public static String getValidationSeverity(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			EnumerationLiteral literal = (EnumerationLiteral) element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			return (literal != null) ? literal.getName() : SEVERITY_ERROR;
		}
		
		return null;
	}
	
	public static String getValidationKeyword(Element element) {
		String severity = getValidationSeverity(element);
		if (SEVERITY_INFO.equals(severity))
			return "MAY";
		if (SEVERITY_WARNING.equals(severity))
			return "SHOULD";
		else
			return "SHALL";
	}

	public static void setValidationMessage(Element constrainedElement, String message) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(constrainedElement, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			constrainedElement.setValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE, message);
		}
	}

}
