/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added isEntry
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
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
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;

public class CDAModelUtil {

	public static final String CDA_PACKAGE_NAME = "cda";

	public static final String DATATYPES_NS_URI = "http://www.openhealthtools.org/mdht/uml/hl7/datatypes";

	/** This base URL may be set from preferences or Ant task options. */
	public static String INFOCENTER_URL = "http://www.cdatools.org/infocenter";

	public static final String SEVERITY_ERROR = "ERROR";

	public static final String SEVERITY_WARNING = "WARNING";

	public static final String SEVERITY_INFO = "INFO";

	public static Class getCDAClass(Classifier templateClass) {
		Class cdaClass = null;

		// if the provided class is from CDA and not a template
		if (isCDAModel(templateClass) && templateClass instanceof Class) {
			return (Class) templateClass;
		}

		for (Classifier parent : templateClass.allParents()) {
			// nearest package may be null if CDA model is not available
			if (parent.getNearestPackage() != null) {
				if (isCDAModel(parent) && parent instanceof Class) {
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

		// if the provided property is from a CDA class and not a template
		if (isCDAModel(templateProperty)) {
			return templateProperty;
		}

		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName()) && isCDAModel(inherited)) {
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

	public static boolean isDatatypeModel(Element element) {
		Stereotype ePackage = element.getNearestPackage().getAppliedStereotype("Ecore::EPackage");
		if (ePackage != null) {
			return DATATYPES_NS_URI.equals(element.getNearestPackage().getValue(ePackage, "nsURI"));
		}

		return false;
	}

	public static boolean isCDAModel(Element element) {
		return CDA_PACKAGE_NAME.equals((element.getNearestPackage() != null)
				? element.getNearestPackage().getName()
				: "");
	}

	public static boolean isCDAType(Type templateClass, String typeName) {
		if (templateClass instanceof Class && typeName != null) {
			Class cdaClass = getCDAClass((Class) templateClass);
			if (cdaClass != null && typeName.equals(cdaClass.getName())) {
				return true;
			}
		}

		return false;
	}

	public static boolean isClinicalDocument(Type templateClass) {
		return isCDAType(templateClass, "ClinicalDocument");
	}

	public static boolean isSection(Type templateClass) {
		return isCDAType(templateClass, "Section");
	}

	public static boolean isOrganizer(Type templateClass) {
		return isCDAType(templateClass, "Organizer");
	}

	public static boolean isEntry(Type templateClass) {
		return isCDAType(templateClass, "Entry");
	}

	public static boolean isClinicalStatement(Type templateClass) {
		if (templateClass instanceof Class) {
			Class cdaClass = getCDAClass((Class) templateClass);
			String cdaName = cdaClass == null
					? null
					: cdaClass.getName();
			if (cdaClass != null &&
					("Act".equals(cdaName) || "Encounter".equals(cdaName) || "Observation".equals(cdaName) ||
							"ObservationMedia".equals(cdaName) || "Organizer".equals(cdaName) ||
							"Procedure".equals(cdaName) || "RegionOfInterest".equals(cdaName) ||
							"SubstanceAdministration".equals(cdaName) || "Supply".equals(cdaName))) {
				return true;
			}
		}

		return false;
	}

	public static void composeAllConformanceMessages(Element element, final PrintStream stream, final boolean markup) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				public Object caseAssociation(Association association) {
					iterator.prune();
					return association;
				}

				public Object caseClass(Class umlClass) {
					String message = computeConformanceMessage(umlClass, markup);
					stream.println(message);

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

	public static String computeConformanceMessage(Element element, final boolean markup) {

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			public Object caseAssociation(Association association) {
				String message = null;
				Property property = getNavigableEnd(association);
				if (property != null) {
					message = computeConformanceMessage(property, false);
				}
				return message;
			}

			public Object caseClass(Class umlClass) {
				return computeConformanceMessage(umlClass, markup);
			}

			public Object caseGeneralization(Generalization generalization) {
				return computeConformanceMessage(generalization, markup);
			}

			public Object caseProperty(Property property) {
				return computeConformanceMessage(property, markup);
			}

			public Object caseConstraint(Constraint constraint) {
				return computeConformanceMessage(constraint, markup);
			}
		};

		return (String) umlSwitch.doSwitch(element);
	}

	public static String computeConformanceMessage(Class template, boolean markup) {
		StringBuffer message = new StringBuffer();

		String templateId = getTemplateId(template);
		if (templateId != null) {
			String ruleId = getConformanceRuleIds(template);
			if (ruleId.length() > 0) {
				message.append(markup
						? "<b>"
						: "");
				message.append(ruleId + ": ");
				message.append(markup
						? "</b>"
						: "");
			}

			if (!markup) {
				message.append(getPrefixedSplitName(template)).append(" ");
			}

			message.append("SHALL contain the template identifier ").append(templateId);
		}

		return message.toString();
	}

	public static String computeConformanceMessage(Generalization generalization, boolean markup) {
		return computeConformanceMessage(generalization, markup, UMLUtil.getTopPackage(generalization));
	}

	public static String computeConformanceMessage(Generalization generalization, boolean markup, Package xrefSource) {
		Class general = (Class) generalization.getGeneral();
		StringBuffer message = new StringBuffer(computeGeneralizationConformanceMessage(general, markup, xrefSource));

		appendConformanceRuleIds(generalization, message, markup);

		return message.toString();
	}

	public static String computeGeneralizationConformanceMessage(Class general, boolean markup, Package xrefSource) {
		StringBuffer message = new StringBuffer();

		String prefix = !UMLUtil.isSameModel(xrefSource, general)
				? getModelPrefix(general) + " "
				: "";
		// String prefix = getModelPrefix(general)+" ";
		String xref = computeXref(xrefSource, general);
		boolean showXref = markup && (xref != null);
		String format = showXref && xref.endsWith(".html")
				? "format=\"html\" "
				: "";

		message.append(markup
				? "<b>"
				: "");
		message.append("SHALL");
		message.append(markup
				? "</b>"
				: "");
		message.append(" conform to ");
		message.append(showXref
				? "<xref " + format + "href=\"" + xref + "\">"
				: "");
		message.append(prefix).append(UMLUtil.splitName(general));
		message.append(showXref
				? "</xref>"
				: "");

		String templateId = getTemplateId(general);
		if (templateId != null) {
			message.append(" template (templateId: ");
			message.append(markup
					? "<tt>"
					: "");
			message.append(templateId);
			message.append(markup
					? "</tt>"
					: "");
			message.append(")");
		}

		return message.toString();
	}

	private static String computeAssociationConformanceMessage(Property property, boolean markup, Package xrefSource) {
		if (getTemplateId(property.getClass_()) != null) {
			return computeTemplateAssociationConformanceMessage(property, markup, xrefSource);
		}

		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		String keyword = getValidationKeyword(association);
		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" contain ");
		} else {
			message.append("Contains ");
		}

		message.append(getMultiplicityString(property)).append(" ");

		String elementName = getCDAElementName(property);
		message.append(markup
				? "<tt><b>"
				: "");
		message.append(elementName);
		message.append(markup
				? "</b></tt>"
				: "");

		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;

		if (endType != null) {
			message.append(", where its type is ");

			String prefix = !UMLUtil.isSameModel(xrefSource, endType)
					? getModelPrefix(endType) + " "
					: "";
			// String prefix = getModelPrefix(endType)+" ";
			String xref = computeXref(xrefSource, endType);
			boolean showXref = markup && (xref != null);
			String format = showXref && xref.endsWith(".html")
					? "format=\"html\" "
					: "";

			message.append(showXref
					? "<xref " + format + "href=\"" + xref + "\">"
					: "");
			message.append(prefix).append(UMLUtil.splitName(endType));
			message.append(showXref
					? "</xref>"
					: "");
		}

		appendConformanceRuleIds(association, message, markup);

		return message.toString();
	}

	private static String computeTemplateAssociationConformanceMessage(Property property, boolean markup,
			Package xrefSource) {
		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();

		String elementName = getCDAElementName(property);

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		String keyword = getValidationKeyword(association);
		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" contain ");
		} else {
			message.append("Contains ");
		}

		message.append(getMultiplicityString(property)).append(" ");

		message.append(markup
				? "<tt><b>"
				: "");
		message.append(elementName);
		message.append(markup
				? "</b></tt>"
				: "");

		appendConformanceRuleIds(association, message, markup);
		message.append(", such that");

		if (!markup) {
			String assocConstraints = computeAssociationConstraints(property, markup);
			if (assocConstraints.length() > 0) {
				// message.append(", such that ");
				// message.append(property.upperBound()==1 ? "it" : "each");
				message.append(assocConstraints);
			}
		}

		return message.toString();
	}

	public static String computeAssociationConstraints(Property property, boolean markup) {
		StringBuffer message = new StringBuffer();

		Association association = property.getAssociation();
		Package xrefSource = UMLUtil.getTopPackage(property);

		Stereotype entryStereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
		Stereotype entryRelationshipStereotype = CDAProfileUtil.getAppliedCDAStereotype(
			association, ICDAProfileConstants.ENTRY_RELATIONSHIP);

		String typeCode = null;
		String typeCodeDisplay = null;
		if (entryStereotype != null) {
			typeCode = getLiteralValue(association, entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE);
			Enumeration profileEnum = (Enumeration) entryStereotype.getProfile().getOwnedType(
				ICDAProfileConstants.ENTRY_KIND);
			typeCodeDisplay = getLiteralValueLabel(
				association, entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE, profileEnum);
		} else if (entryRelationshipStereotype != null) {
			typeCode = getLiteralValue(
				association, entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			Enumeration profileEnum = (Enumeration) entryRelationshipStereotype.getProfile().getOwnedType(
				ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
			typeCodeDisplay = getLiteralValueLabel(
				association, entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE,
				profileEnum);
		}

		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;

		if (typeCode != null) {
			message.append(markup
					? "\n<li>"
					: " ");
			// message.append(markup?"<b>":"").append("SHALL").append(markup?"</b>":"");
			// message.append(" contain ");
			message.append("Contains ");
			message.append(markup
					? "<tt><b>"
					: "").append("@typeCode=\"").append(markup
					? "</b>"
					: "");
			message.append(typeCode).append("\" ");
			message.append(markup
					? "</tt>"
					: "");

			message.append(markup
					? "<i>"
					: "");
			message.append(typeCodeDisplay);
			message.append(markup
					? "</i>"
					: "");
			message.append(markup
					? "</li>"
					: ", and");
		}

		// TODO: what I should really do is test for an *implied* ActRelationship or Participation association
		if (endType != null && !CDAModelUtil.isCDAModel(endType)) {
			message.append(markup
					? "\n<li>"
					: " ");
			// message.append(markup?"<b>":"").append("SHALL").append(markup?"</b>":"");
			// message.append(" contain exactly one [1..1] ");
			message.append("Contains exactly one [1..1] ");

			String prefix = !UMLUtil.isSameModel(xrefSource, endType)
					? getModelPrefix(endType) + " "
					: "";
			// String prefix = getModelPrefix(endType)+" ";
			String xref = computeXref(xrefSource, endType);
			boolean showXref = markup && (xref != null);
			String format = showXref && xref.endsWith(".html")
					? "format=\"html\" "
					: "";

			message.append(showXref
					? "<xref " + format + "href=\"" + xref + "\">"
					: "");
			message.append(prefix).append(UMLUtil.splitName(endType));
			message.append(showXref
					? "</xref>"
					: "");

			String templateId = getTemplateId(endType);
			if (templateId != null) {
				message.append(" (templateId: ");
				message.append(markup
						? "<tt>"
						: "");
				message.append(templateId);
				message.append(markup
						? "</tt>"
						: "");
				message.append(")");
			}

			message.append(markup
					? "</li>"
					: "");
		}

		return message.toString();
	}

	public static String computeConformanceMessage(Property property, boolean markup) {
		return computeConformanceMessage(property, markup, UMLUtil.getTopPackage(property));
	}

	public static String computeConformanceMessage(Property property, boolean markup, Package xrefSource) {
		if (property.getType() == null) {
			System.out.println("Property has null type: " + property.getQualifiedName());
		}
		if (property.getAssociation() != null && property.isNavigable()) {
			return computeAssociationConformanceMessage(property, markup, xrefSource);
		}

		StringBuffer message = new StringBuffer();

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		String keyword = getValidationKeyword(property);
		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" contain ");
		} else {
			message.append("Contains ");
		}

		message.append(getMultiplicityString(property)).append(" ");

		message.append(markup
				? "<tt><b>"
				: "");
		if (isXMLAttribute(property)) {
			message.append("@");
		}
		message.append(property.getName());
		message.append(markup
				? "</b>"
				: "");

		if (isXMLAttribute(property) && property.getDefault() != null) {
			message.append("=\"").append(property.getDefault()).append("\" ");
		}
		message.append(markup
				? "</tt>"
				: "");

		Stereotype nullFlavorSpecification = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.NULL_FLAVOR);
		Stereotype textValue = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.TEXT_VALUE);

		if (nullFlavorSpecification != null) {
			String nullFlavor = getLiteralValue(
				property, nullFlavorSpecification, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);
			Enumeration profileEnum = (Enumeration) nullFlavorSpecification.getProfile().getOwnedType(
				ICDAProfileConstants.NULL_FLAVOR_KIND);
			String nullFlavorLabel = getLiteralValueLabel(
				property, nullFlavorSpecification, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR, profileEnum);

			if (nullFlavor != null) {
				message.append(markup
						? "<tt>"
						: "");
				message.append("/@nullFlavor");
				message.append(markup
						? "</tt>"
						: "");

				message.append(" = \"").append(nullFlavor).append("\" ");
				message.append(markup
						? "<i>"
						: "");
				message.append(nullFlavorLabel);
				message.append(markup
						? "</i>"
						: "");
			}
		}
		if (textValue != null) {
			String value = (String) property.getValue(textValue, ICDAProfileConstants.TEXT_VALUE_VALUE);

			if (value != null && value.length() > 0) {
				message.append(" = \"").append(value).append("\"");
			}
		}

		// Stereotype conceptDomainConstraint = CDAProfileUtil.getAppliedCDAStereotype(
		// property, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		Stereotype codeSystemConstraint = CDAProfileUtil.getAppliedCDAStereotype(
			property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSetConstraint = CDAProfileUtil.getAppliedCDAStereotype(
			property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.VOCAB_SPECIFICATION);

		if (codeSystemConstraint != null) {
			String vocab = computeCodeSystemMessage(property, markup);
			message.append(vocab);
		} else if (valueSetConstraint != null) {
			String vocab = computeValueSetMessage(property, markup, xrefSource);
			message.append(vocab);
		} else if (vocabSpecification != null) {
			String vocab = computeVocabSpecificationMessage(property, markup);
			message.append(vocab);
		} else if (isHL7VocabAttribute(property) && property.getDefault() != null) {
			String vocab = computeHL7VocabAttributeMessage(property, markup);
			message.append(vocab);
		}

		List<Property> redefinedProperties = UMLUtil.getRedefinedProperties(property);
		Property redefinedProperty = redefinedProperties.isEmpty()
				? null
				: redefinedProperties.get(0);

		if (property.getType() != null &&
				(redefinedProperty == null || (!isXMLAttribute(property) && (property.getType() != redefinedProperty.getType())))) {
			message.append(", where its data type is ").append(property.getType().getName());
		}

		appendConformanceRuleIds(property, message, markup);

		return message.toString();
	}

	private static boolean isHL7VocabAttribute(Property property) {
		String name = property.getName();
		return "classCode".equals(name) || "moodCode".equals(name) || "typeCode".equals(name);
	}

	private static String computeHL7VocabAttributeMessage(Property property, boolean markup) {
		StringBuffer message = new StringBuffer();
		Class rimClass = RIMModelUtil.getRIMClass(property.getClass_());
		String code = property.getDefault();
		String displayName = null;
		String codeSystemId = null;
		String codeSystemName = null;

		if (rimClass != null) {
			if ("Act".equals(rimClass.getName())) {
				if ("classCode".equals(property.getName())) {
					codeSystemName = "HL7ActClass";
					codeSystemId = "2.16.840.1.113883.5.6";

					if ("ACT".equals(code)) {
						displayName = "Act";
					} else if ("OBS".equals(code)) {
						displayName = "Observation";
					}
				} else if ("moodCode".equals(property.getName())) {
					codeSystemName = "HL7ActMood";
					codeSystemId = "2.16.840.1.113883.5.1001";

					if ("EVN".equals(code)) {
						displayName = "Event";
					}
				}
			}
		}

		if (displayName != null) {
			message.append(markup
					? "<i>"
					: "");
			message.append(displayName);
			message.append(markup
					? "</i>"
					: "");
		}

		if (codeSystemId != null || codeSystemName != null) {
			message.append(" (CodeSystem:");
			message.append(markup
					? "<tt>"
					: "");
			if (codeSystemId != null) {
				message.append(" ").append(codeSystemId);
			}
			if (codeSystemName != null) {
				message.append(" ").append(codeSystemName);
			}
			message.append(markup
					? "</tt>"
					: "");
			message.append(")");
		}

		return message.toString();
	}

	private static String computeCodeSystemMessage(Property property, boolean markup) {
		Stereotype codeSystemConstraintStereotype = CDAProfileUtil.getAppliedCDAStereotype(
			property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		CodeSystemConstraint codeSystemConstraint = (CodeSystemConstraint) property.getStereotypeApplication(codeSystemConstraintStereotype);

		String id = null;
		String name = null;
		String version = null;
		BindingKind binding = null;
		String code = null;
		String displayName = null;
		if (codeSystemConstraint != null) {
			if (codeSystemConstraint.getReference() != null) {
				CodeSystemVersion codeSystemVersion = codeSystemConstraint.getReference();
				id = codeSystemVersion.getIdentifier();
				name = codeSystemVersion.getEnumerationName();
				version = codeSystemVersion.getVersion();
			} else {
				id = codeSystemConstraint.getIdentifier();
				name = codeSystemConstraint.getName();
				version = codeSystemConstraint.getVersion();
			}

			binding = codeSystemConstraint.getBinding();
			code = codeSystemConstraint.getCode();
			displayName = codeSystemConstraint.getDisplayName();
		}

		StringBuffer message = new StringBuffer();
		if (code != null) {
			message.append(markup
					? "<tt><b>"
					: "");
			message.append("/@code");
			message.append(markup
					? "</b>"
					: "");

			message.append("=\"").append(code).append("\" ");
			message.append(markup
					? "</tt>"
					: "");
		}

		if (displayName != null) {
			message.append(markup
					? "<i>"
					: "");
			message.append(displayName);
			message.append(markup
					? "</i>"
					: "");
		}

		if (id != null || name != null) {
			message.append(" (CodeSystem:");
			message.append(markup
					? "<tt>"
					: "");
			if (id != null) {
				message.append(" ").append(id);
			}
			if (name != null) {
				message.append(" ").append(name);
			}
			message.append(markup
					? "</tt>"
					: "");

			// message.append(" ").append(binding.getName().toUpperCase());
			// if (version != null) {
			// message.append(" ").append(version);
			// }
			message.append(")");
		}

		return message.toString();
	}

	private static String computeValueSetMessage(Property property, boolean markup, Package xrefSource) {
		Stereotype valueSetConstraintStereotype = CDAProfileUtil.getAppliedCDAStereotype(
			property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		ValueSetConstraint valueSetConstraint = (ValueSetConstraint) property.getStereotypeApplication(valueSetConstraintStereotype);

		String keyword = getValidationKeyword(property);
		String id = null;
		String name = null;
		String version = null;
		BindingKind binding = null;

		String xref = null;
		String xrefFormat = "";
		boolean showXref = false;

		if (valueSetConstraint != null) {
			if (valueSetConstraint.getReference() != null) {
				ValueSetVersion valueSetVersion = valueSetConstraint.getReference();
				id = valueSetVersion.getIdentifier();
				name = valueSetVersion.getEnumerationName();
				version = valueSetVersion.getVersion();
				binding = valueSetVersion.getBinding();

				if (valueSetVersion.getBase_Enumeration() != null) {
					xref = computeTerminologyXref(property.getClass_(), valueSetVersion.getBase_Enumeration());
				}
				showXref = markup && (xref != null);
				xrefFormat = showXref && xref.endsWith(".html")
						? "format=\"html\" "
						: "";
			} else {
				id = valueSetConstraint.getIdentifier();
				name = valueSetConstraint.getName();
				version = valueSetConstraint.getVersion();
				binding = valueSetConstraint.getBinding();
			}
		}

		StringBuffer message = new StringBuffer();
		message.append(", which ");
		message.append(markup
				? "<b>"
				: "");
		message.append(keyword);
		message.append(markup
				? "</b>"
				: "");
		message.append(" be selected from ValueSet");

		message.append(markup
				? "<tt>"
				: "");
		if (id != null) {
			message.append(" ").append(id);
		}
		if (name != null) {
			message.append(" ");
			message.append(showXref
					? "<xref " + xrefFormat + "href=\"" + xref + "\">"
					: "");
			message.append(name);
			message.append(showXref
					? "</xref>"
					: "");
		}
		message.append(markup
				? "</tt>"
				: "");

		message.append(markup
				? "<b>"
				: "");
		message.append(" ").append(binding.getName().toUpperCase());
		message.append(markup
				? "</b>"
				: "");

		if (BindingKind.STATIC == binding && version != null) {
			message.append(" ").append(version);
		}

		return message.toString();
	}

	private static String computeVocabSpecificationMessage(Property property, boolean markup) {
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.VOCAB_SPECIFICATION);

		StringBuffer message = new StringBuffer();
		String codeSystem = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
		String codeSystemName = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
		String codeSystemVersion = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
		String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
		String displayName = (String) property.getValue(
			vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);

		if (code != null) {
			message.append(markup
					? "<tt>"
					: "");
			message.append("/@code");
			message.append(markup
					? "</tt>"
					: "");

			message.append(" = \"").append(code).append("\" ");

			if (displayName != null) {
				message.append(markup
						? "<i>"
						: "");
				message.append(displayName);
				message.append(markup
						? "</i>"
						: "");
			}

			if (codeSystem != null || codeSystemName != null) {
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
		// TODO for now, assume it's a value set if no code
		else if (codeSystem != null || codeSystemName != null) {
			String keyword = getValidationKeyword(property);

			message.append(", which ");
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
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
			} else {
				message.append(" DYNAMIC");
			}
		}

		return message.toString();
	}

	public static String computeConformanceMessage(Constraint constraint, boolean markup) {
		StringBuffer message = new StringBuffer();
		String strucTextBody = null;
		String analysisBody = null;
		Map<String, String> langBodyMap = new HashMap<String, String>();

		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			for (int i = 0; i < ((OpaqueExpression) spec).getLanguages().size(); i++) {
				String lang = ((OpaqueExpression) spec).getLanguages().get(i);
				String body = ((OpaqueExpression) spec).getBodies().get(i);

				if ("StrucText".equals(lang)) {
					strucTextBody = body;
				} else if ("Analysis".equals(lang)) {
					analysisBody = body;
				} else {
					langBodyMap.put(lang, body);
				}
			}
		}

		String displayBody = null;
		if (strucTextBody != null && strucTextBody.trim().length() > 0) {
			// TODO if markup, parse strucTextBody and insert DITA markup
			displayBody = strucTextBody;
		} else if (analysisBody != null && analysisBody.trim().length() > 0) {
			if (markup) {
				// escape non-dita markup in analysis text
				displayBody = escapeMarkupCharacters(analysisBody);
				// change severity words to bold text
				displayBody = replaceSeverityWithBold(displayBody);
			} else {
				displayBody = analysisBody;
			}
		}

		if (!markup) {
			message.append(getPrefixedSplitName(constraint.getContext())).append(" ");
		}

		if (displayBody == null || !containsSeverityWord(displayBody)) {
			String keyword = getValidationKeyword(constraint);
			if (keyword == null) {
				keyword = "SHALL";
			}

			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" satisfy: ");
		}

		if (displayBody == null) {
			message.append(constraint.getName());
		} else {
			message.append(displayBody);
		}
		appendConformanceRuleIds(constraint, message, markup);

		// include comment text only in markup output
		if (markup && constraint.getOwnedComments().size() > 0) {
			message.append("<ul>");
			for (Comment comment : constraint.getOwnedComments()) {
				message.append("<li>");
				message.append(fixNonXMLCharacters(comment.getBody()));
				message.append("</li>");
			}
			message.append("</ul>");
		}

		// Include other constraint languages, e.g. OCL or XPath
		if (markup && langBodyMap.size() > 0) {
			message.append("<ul>");
			for (String lang : langBodyMap.keySet()) {
				message.append("<li>");
				message.append("<codeblock>[" + lang + "]: ");
				message.append(escapeMarkupCharacters(langBodyMap.get(lang)));
				message.append("</codeblock>");
				message.append("</li>");
			}
			message.append("</ul>");
		}

		if (!markup) {
			// remove line feeds
			int index;
			while ((index = message.indexOf("\r")) >= 0) {
				message.deleteCharAt(index);
			}
			while ((index = message.indexOf("\n")) >= 0) {
				message.deleteCharAt(index);
				if (message.charAt(index) != ' ') {
					message.insert(index, " ");
				}
			}
		}

		return message.toString();
	}

	private static boolean containsSeverityWord(String text) {
		return text.indexOf("SHALL") >= 0 || text.indexOf("SHOULD") >= 0 || text.indexOf("MAY") >= 0;
	}

	private static String replaceSeverityWithBold(String input) {
		String output;
		output = input.replaceAll("SHALL", "<b>SHALL</b>");
		output = output.replaceAll("SHOULD", "<b>SHOULD</b>");
		output = output.replaceAll("MAY", "<b>MAY</b>");

		output = output.replaceAll("\\<b>SHALL\\</b> NOT", "<b>SHALL NOT</b>");
		output = output.replaceAll("\\<b>SHOULD\\</b> NOT", "<b>SHOULD NOT</b>");

		return output;
	}

	protected static String computeXref(Element source, Class target) {
		String href = null;
		if (UMLUtil.isSameModel(source, target)) {
			href = "../" + target.getName() + ".dita";
		} else if (isCDAModel(target)) {
			// no xref to CDA available at this time
		} else {
			String pathFolder = "classes";
			String basePackage = "";
			String prefix = "";
			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.doc/classes/Act.html
			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.ccd.doc/classes/ProblemAct.html

			String packageName = target.getNearestPackage().getName();
			if (RIMModelUtil.RIM_PACKAGE_NAME.equals(packageName)) {
				basePackage = "org.openhealthtools.mdht.uml.hl7.rim";
			} else if (CDA_PACKAGE_NAME.equals(packageName)) {
				basePackage = "org.openhealthtools.mdht.uml.cda";
			} else {
				basePackage = getModelBasePackage(target);
				prefix = getModelNamespacePrefix(target);
			}

			if (basePackage == null || basePackage.trim().length() == 0) {
				basePackage = "org.openhealthtools.mdht.uml.cda";
			}
			if (prefix != null && prefix.trim().length() > 0) {
				prefix += ".";
			}

			href = INFOCENTER_URL + "/topic/" + basePackage + "." + prefix + "doc/" + pathFolder + "/" +
					target.getName() + ".html";

			// pathFolder = "dita/classes";
			// href = "../../../../" + basePackage + "."
			// + prefix + "doc/" + pathFolder + "/" + target.getName() + ".dita";
		}
		return href;
	}

	protected static String computeTerminologyXref(Class source, Enumeration target) {
		String href = null;
		if (UMLUtil.isSameProject(source, target)) {
			href = "../../terminology/" + validFileName(target.getName()) + ".dita";
		}
		return href;
	}

	public static Property getNavigableEnd(Association association) {
		Property navigableEnd = null;
		for (Property end : association.getMemberEnds()) {
			if (end.isNavigable()) {
				if (navigableEnd != null) {
					return null; // multiple navigable ends
				}
				navigableEnd = end;
			}
		}

		return navigableEnd;
	}

	public static String getCDAElementName(Property property) {
		Class cdaSourceClass = getCDAClass(property.getClass_());
		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;
		Class cdaTargetClass = endType != null
				? getCDAClass(endType)
				: null;

		// TODO this is incomplete determination of XML element name
		String elementName = property.getName();
		if (cdaSourceClass == null) {
			elementName = property.getName();
		} else if ("ClinicalDocument".equals(cdaSourceClass.getName()) &&
				(CDAModelUtil.isSection(cdaTargetClass) || CDAModelUtil.isClinicalStatement(cdaTargetClass))) {
			elementName = "component";
		} else if (CDAModelUtil.isSection(cdaSourceClass) && (CDAModelUtil.isSection(cdaTargetClass))) {
			elementName = "component";
		} else if (CDAModelUtil.isSection(cdaSourceClass) &&
				(CDAModelUtil.isClinicalStatement(cdaTargetClass) || CDAModelUtil.isEntry(cdaTargetClass))) {
			elementName = "entry";
		} else if (CDAModelUtil.isOrganizer(cdaSourceClass) && CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
			elementName = "component";
		} else if (CDAModelUtil.isClinicalStatement(cdaSourceClass) && CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
			elementName = "entryRelationship";
		} else if (CDAModelUtil.isClinicalStatement(cdaSourceClass) &&
				"ParticipantRole".equals(cdaTargetClass.getName())) {
			elementName = "participant";
		} else if (CDAModelUtil.isClinicalStatement(cdaSourceClass) &&
				"AssignedEntity".equals(cdaTargetClass.getName())) {
			elementName = "performer";
		}

		return elementName;
	}

	public static String getMultiplicityString(Property property) {

		StringBuffer message = new StringBuffer();
		if (property.getLower() == 1 && property.getUpper() == 1) {
			message.append("exactly one");
		} else if (property.getLower() == 0 && property.getUpper() == 1) {
			message.append("zero or one");
		} else if (property.getLower() == 0 && property.getUpper() == -1) {
			message.append("zero or more");
		} else if (property.getLower() == 1 && property.getUpper() == -1) {
			message.append("at least one");
		}

		String lower = Integer.toString(property.getLower());
		String upper = property.getUpper() == -1
				? "*"
				: Integer.toString(property.getUpper());
		message.append(" [").append(lower).append("..").append(upper).append("]");

		return message.toString();
	}

	public static boolean isXMLAttribute(Property property) {
		Property cdaProperty = getCDAProperty(property);
		if (cdaProperty != null) {
			Stereotype eAttribute = cdaProperty.getAppliedStereotype("Ecore::EAttribute");
			if (eAttribute != null) {
				return true;
			}
		}

		return false;
	}

	public static String getTemplateId(Class template) {
		String templateId = null;
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			templateId = (String) template.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
		} else {
			for (Classifier parent : template.getGenerals()) {
				templateId = getTemplateId((Class) parent);
				if (templateId != null) {
					break;
				}
			}
		}

		return templateId;
	}

	public static String getModelPrefix(Element element) {
		String prefix = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			prefix = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);
		} else if (CDA_PACKAGE_NAME.equals(model.getName())) {
			prefix = "CDA";
		} else if (RIMModelUtil.RIM_PACKAGE_NAME.equals(model.getName())) {
			prefix = "RIM";
		}

		return prefix;
	}

	public static String getModelNamespacePrefix(Element element) {
		String prefix = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			prefix = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_PREFIX);
		}

		return prefix;
	}

	public static String getModelBasePackage(Element element) {
		String basePackage = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			basePackage = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
		}

		return basePackage;
	}

	public static String getEcorePackageURI(Element element) {
		String nsURI = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			nsURI = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
		}
		if (nsURI == null) {
			// for base models without codegenSupport
			if (model.getName().equals("cda")) {
				nsURI = "urn:hl7-org:v3";
			} else if (model.getName().equals("datatypes")) {
				nsURI = "http://www.openhealthtools.org/mdht/uml/hl7/datatypes";
			} else if (model.getName().equals("vocab")) {
				nsURI = "http://www.openhealthtools.org/mdht/uml/hl7/vocab";
			}
		}

		return nsURI;
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
		String severity = null;

		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			Object value = element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				severity = ((Enumerator) value).getName();
			}

			// return (severity != null) ? severity : SEVERITY_ERROR;
		}

		return severity;
	}

	public static String getValidationMessage(Element element) {
		String message = null;

		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			message = (String) element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
		}
		if (message == null || message.length() == 0) {
			message = computeConformanceMessage(element, false);
		}

		return message;
	}

	/**
	 * Returns a list conformance rule IDs.
	 */
	public static List<String> getConformanceRuleIdList(Element element) {
		List<String> ruleIds = new ArrayList<String>();
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			Validation validation = (Validation) element.getStereotypeApplication(validationSupport);
			for (String ruleId : validation.getRuleId()) {
				ruleIds.add(ruleId);
			}
		}

		return ruleIds;
	}

	protected static void appendConformanceRuleIds(Element element, StringBuffer message, boolean markup) {
		String ruleIds = getConformanceRuleIds(element);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	/**
	 * Returns a comma separated list of conformance rule IDs, or an empty string if no IDs.
	 */
	public static String getConformanceRuleIds(Element element) {
		StringBuffer ruleIdDisplay = new StringBuffer();
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			Validation validation = (Validation) element.getStereotypeApplication(validationSupport);
			for (String ruleId : validation.getRuleId()) {
				if (ruleIdDisplay.length() > 0) {
					ruleIdDisplay.append(", ");
				}
				ruleIdDisplay.append(ruleId);
			}
		}

		return ruleIdDisplay.toString();
	}

	public static String getValidationKeyword(Element element) {
		String severity = getValidationSeverity(element);

		if (severity != null) {
			if (SEVERITY_INFO.equals(severity)) {
				return "MAY";
			} else if (SEVERITY_WARNING.equals(severity)) {
				return "SHOULD";
			} else if (SEVERITY_ERROR.equals(severity)) {
				return "SHALL";
			}
		}

		return null;

		// if (element instanceof Association) {
		// for (Property end : ((Association)element).getMemberEnds()) {
		// if (end.isNavigable()) {
		// element = end;
		// break;
		// }
		// }
		// }
		//
		// if (element instanceof MultiplicityElement) {
		// if (((MultiplicityElement)element).getLower() == 0)
		// return "MAY";
		// else
		// return "SHALL";
		// }
		// else {
		// return "SHALL";
		// }
	}

	public static void setValidationMessage(Element constrainedElement, String message) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(
			constrainedElement, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			constrainedElement.setValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE, message);
		}
	}

	public static void setValidationRuleId(Element constrainedElement, String ruleId) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(
			constrainedElement, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			List<String> ruleIds = new ArrayList<String>();
			ruleIds.add(ruleId);
			constrainedElement.setValue(validationSupport, ICDAProfileConstants.VALIDATION_RULE_ID, ruleIds);
		}
	}

	protected static String getLiteralValue(Element element, Stereotype stereotype, String propertyName) {
		Object value = element.getValue(stereotype, propertyName);
		String name = null;
		if (value instanceof EnumerationLiteral) {
			name = ((EnumerationLiteral) value).getName();
		} else if (value instanceof Enumerator) {
			name = ((Enumerator) value).getName();
		}

		return name;
	}

	protected static String getLiteralValueLabel(Element element, Stereotype stereotype, String propertyName,
			Enumeration umlEnumeration) {
		Object value = element.getValue(stereotype, propertyName);
		String name = null;
		if (value instanceof EnumerationLiteral) {
			name = ((EnumerationLiteral) value).getLabel();
		} else if (value instanceof Enumerator) {
			name = ((Enumerator) value).getName();

			if (umlEnumeration != null) {
				name = umlEnumeration.getOwnedLiteral(name).getLabel();
			}
		}

		return name;
	}

	public static String fixNonXMLCharacters(String text) {
		if (text == null) {
			return null;
		}

		StringBuffer newText = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			// test for unicode characters from copy/paste of MS Word text
			if (text.charAt(i) == '\u201D') {
				newText.append("\"");
			} else if (text.charAt(i) == '\u201C') {
				newText.append("\"");
			} else if (text.charAt(i) == '\u2019') {
				newText.append("'");
			} else if (text.charAt(i) == '\u2018') {
				newText.append("'");
			} else {
				newText.append(text.charAt(i));
			}
		}

		return newText.toString();
	}

	public static String escapeMarkupCharacters(String text) {
		if (text == null) {
			return null;
		}
		text = fixNonXMLCharacters(text);

		StringBuffer newText = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '<') {
				newText.append("&lt;");
			} else if (text.charAt(i) == '>') {
				newText.append("&gt;");
			} else {
				newText.append(text.charAt(i));
			}
		}

		return newText.toString();
	}

	public static String validFileName(String fileName) {
		StringBuffer validName = new StringBuffer();
		for (int i = 0; i < fileName.length(); i++) {
			if (fileName.charAt(i) == '/') {
				validName.append(" ");
			} else if (fileName.charAt(i) == '\\') {
				validName.append(" ");
			} else if (fileName.charAt(i) == '?') {
				validName.append("");
			} else {
				validName.append(fileName.charAt(i));
			}
		}

		return validName.toString();
	}

}
