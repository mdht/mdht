/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added isEntry
 *     Christian W. Damus - discriminate multiple property constraints (artf3185)
 *                        - support nested datatype subclasses (artf3350)
 *     Dan Brown (Audacious Inquiry) - modified XML binding messages based on mandatory property
 *     								 as part of artf3549, artf3577, errata 156 and errata 72
 *     								 - changed output from 'data type CD' to '@xsi:type="CD"' as per errata 177
 *     								 - added message support for errata 384 as per artf3818 No Information Section Fix
 *     								 - support templateId extension attribute value in generalization and association messages
 *     Sarp Kaya (NEHTA)
 *     Vadim Peretokin (NEHTA) - added handling of SHOULD + 0..0 multiplicity to produce publication text "SHALL NOT"
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
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
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Inline;
import org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.PropertyList;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class CDAModelUtil {

	public static final String CDA_PACKAGE_NAME = "cda";

	public static final String DATATYPES_NS_URI = "http://www.openhealthtools.org/mdht/uml/hl7/datatypes";

	/** This base URL may be set from preferences or Ant task options. */
	public static String INFOCENTER_URL = "http://www.cdatools.org/infocenter";

	public static final String SEVERITY_ERROR = "ERROR";

	public static final String SEVERITY_WARNING = "WARNING";

	public static final String SEVERITY_INFO = "INFO";

	private static final String EPACKAGE = "Ecore::EPackage";

	private static final String EREFERENCE = "Ecore::EReference";

	public static final String XMLNAMESPACE = "xmlNamespace";

	private static final String NSPREFIX = "nsPrefix";

	private static final String NSURI = "nsURI";

	// This message may change in the future to specify certain nullFlavor Types (such as the implementation, NI)
	private static final String NULLFLAVOR_SECTION_MESSAGE = "If section/@nullFlavor is not present, ";

	public static boolean cardinalityAfterElement = false;

	public static boolean disablePdfGeneration = false;

	public static boolean isAppendConformanceRules = false;

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

		// if the provided property is from a CDA class/datatype and not a template
		if (isCDAModel(templateProperty) || isDatatypeModel(templateProperty)) {
			return templateProperty;
		}

		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				Property cdaProperty = transformToCDAProperty(templateProperty);
				if (cdaProperty == null)
					continue;
				if (inherited.getName() != null && inherited.getName().equals(getCDAName(cdaProperty)) &&
						(isCDAModel(inherited) || isDatatypeModel(inherited))) {
					return inherited;
				}
			}
		}

		return null;
	}

	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 * 
	 * @deprecated Use the {@link UMLUtil#getInheritedProperty(Property)} API, instead.
	 */
	@Deprecated
	public static Property getInheritedProperty(Property templateProperty) {
		// for CDA, we restrict to Classes, not other classifiers
		if (templateProperty.getClass_() == null) {
			return null;
		}

		return UMLUtil.getInheritedProperty(templateProperty);
	}

	public static boolean isDatatypeModel(Element element) {
		if (element != null && element.getNearestPackage() != null) {
			Stereotype ePackage = element.getNearestPackage().getAppliedStereotype("Ecore::EPackage");
			if (ePackage != null) {
				return DATATYPES_NS_URI.equals(element.getNearestPackage().getValue(ePackage, "nsURI"));
			}
		}
		return false;
	}

	/**
	 * isCDAModel - use get top package to support nested uml packages within CDA model
	 * primarily used for extensions
	 * 
	 */
	public static boolean isCDAModel(Element element) {
		if (element != null) {
			Package neareastPackage = element.getNearestPackage();
			if (neareastPackage != null) {
				Package topPackage = org.openhealthtools.mdht.uml.common.util.UMLUtil.getTopPackage(neareastPackage);
				return CDA_PACKAGE_NAME.equals((topPackage != null)
						? topPackage.getName()
						: "");
			}

		}

		return false;
	}

	public static Class getCDADatatype(Classifier datatype) {
		Class result = null;

		// if the provided class is from CDA datatypes
		if (isDatatypeModel(datatype) && (datatype instanceof Class)) {
			result = (Class) datatype;
		} else {
			for (Classifier parent : datatype.allParents()) {
				// nearest package may be null if CDA datatypes model is not available
				if (parent.getNearestPackage() != null) {
					if (isDatatypeModel(parent) && (parent instanceof Class)) {
						result = (Class) parent;
						break;
					}
				}
			}
		}

		return result;
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

				@Override
				public Object caseAssociation(Association association) {
					iterator.prune();
					return association;
				}

				@Override
				public Object caseClass(Class umlClass) {
					String message = computeConformanceMessage(umlClass, markup);
					stream.println(message);

					return umlClass;
				}

				@Override
				public Object caseGeneralization(Generalization generalization) {
					String message = computeConformanceMessage(generalization, markup);
					if (message.length() > 0) {
						stream.println(message);
					}
					return generalization;
				}

				@Override
				public Object caseProperty(Property property) {
					String message = computeConformanceMessage(property, markup);
					if (message.length() > 0) {
						stream.println(message);
					}
					return property;
				}

				@Override
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

	public static String getValidationMessage(Element element) {
		return getValidationMessage(element, ICDAProfileConstants.VALIDATION);
	}

	/**
	 * Obtains the user-specified validation message recorded in the given stereotype, or else
	 * {@linkplain #computeConformanceMessage(Element, boolean) computes} a suitable conformance message if none.
	 * 
	 * @param element
	 *            an element on which a validation constraint stereotype is defined
	 * @param validationStereotypeName
	 *            the stereotype name (may be the abstract {@linkplain ICDAProfileConstants#VALIDATION Validation} stereotype)
	 * 
	 * @return the most appropriate validation/conformance message
	 * 
	 * @see #computeConformanceMessage(Element, boolean)
	 */
	public static String getValidationMessage(Element element, String validationStereotypeName) {
		String message = null;

		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, validationStereotypeName);
		if (validationSupport != null) {
			message = (String) element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
		}
		if (message == null || message.length() == 0) {
			message = computeConformanceMessage(element, false);
		}

		return message;
	}

	public static String computeConformanceMessage(Element element, final boolean markup) {

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

			@Override
			public Object caseAssociation(Association association) {
				String message = null;
				Property property = getNavigableEnd(association);
				if (property != null) {
					message = computeConformanceMessage(property, false);
				}
				return message;
			}

			@Override
			public Object caseClass(Class umlClass) {
				return computeConformanceMessage(umlClass, markup);
			}

			@Override
			public Object caseGeneralization(Generalization generalization) {
				return computeConformanceMessage(generalization, markup);
			}

			@Override
			public Object caseProperty(Property property) {
				return computeConformanceMessage(property, markup);
			}

			@Override
			public Object caseConstraint(Constraint constraint) {
				return computeConformanceMessage(constraint, markup);
			}
		};

		return (String) umlSwitch.doSwitch(element);
	}

	public static String computeConformanceMessage(Class template, final boolean markup) {

		String templateId = getTemplateId(template);
		String templateVersion = getTemplateVersion(template);
		String ruleIds = getConformanceRuleIds(template);
		if (templateId == null) {
			templateId = "";
		}

		String templateMultiplicity = CDATemplateComputeBuilder.getMultiplicityRange(getMultiplicityRange(template));
		final String templateIdAsBusinessName = "=\"" + templateId + "\"";
		final String templateVersionAsBusinessName = "=\"" + templateVersion + "\"";
		final String multiplicityRange = templateMultiplicity.isEmpty()
				? ""
				: " [" + templateMultiplicity + "]";
		CDATemplateComputeBuilder cdaTemplater = new CDATemplateComputeBuilder() {
			@Override
			public String addTemplateIdMultiplicity() {
				return multiplicityElementToggle(markup, "templateId", multiplicityRange, "");
			}

			@Override
			public String addRootMultiplicity() {
				return multiplicityElementToggle(markup, "@root", " [1..1]", templateIdAsBusinessName);
			}

			@Override
			public String addTemplateVersion() {
				return multiplicityElementToggle(markup, "@extension", " [1..1]", templateVersionAsBusinessName);
			}
		};
		return cdaTemplater.setRequireMarkup(markup).setRuleIds(ruleIds).setTemplateVersion(templateVersion).setMultiplicity(
			multiplicityRange).compute().toString();
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
		String xref = computeXref(xrefSource, general);
		boolean showXref = markup && (xref != null);
		String format = showXref && xref.endsWith(".html")
				? "format=\"html\" "
				: "";

		Class cdaGeneral = getCDAClass(general);

		if (cdaGeneral != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append("SHALL");
			message.append(markup
					? "</b>"
					: "");
			message.append(" conform to ");
		} else {
			message.append("Extends ");
		}

		message.append(showXref
				? "<xref " + format + "href=\"" + xref + "\">"
				: "");
		message.append(prefix).append(UMLUtil.splitName(general));
		message.append(showXref
				? "</xref>"
				: "");

		String templateId = getTemplateId(general);
		String templateVersion = getTemplateVersion(general);

		if (templateId != null) {
			message.append(" template (templateId: ");
			message.append(markup
					? "<tt>"
					: "");
			message.append(templateId);

			// if there is an extension, add a colon followed by its value
			if (!StringUtils.isEmpty(templateVersion)) {
				message.append(":" + templateVersion);
			}

			message.append(markup
					? "</tt>"
					: "");
			message.append(")");
		}

		return message.toString();
	}

	private static String getBusinessName(NamedElement property) {
		String businessName = NamedElementUtil.getBusinessName(property);
		if (!property.getName().equals(businessName)) {
			return (" (" + businessName + ")");
		}
		return "";
	}

	private static StringBuffer multiplicityElementToggle(Property property, boolean markup, String elementName) {
		StringBuffer message = new StringBuffer();
		message.append(multiplicityElementToggle(
			markup, elementName, getMultiplicityRange(property), getBusinessName(property)));
		return message;
	}

	private static String multiplicityElementToggle(boolean markup, String elementName, String multiplicityRange,
			String businessName) {
		StringBuffer message = new StringBuffer();
		if (!cardinalityAfterElement) {
			message.append(multiplicityRange);
		}

		message.append(" ");
		message.append(markup
				? "<tt><b>"
				: "");
		message.append(elementName);
		message.append(markup
				? "</b>"
				: "");
		message.append(businessName);
		message.append(markup
				? "</tt>"
				: "");

		if (cardinalityAfterElement) {
			message.append(multiplicityRange);
		}
		return message.toString();
	}

	public static String computeAssociationConformanceMessage(Property property, boolean markup, Package xrefSource,
			boolean appendNestedConformanceRules) {

		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;

		if (!isInlineClass(endType) && getTemplateId(property.getClass_()) != null) {
			return computeTemplateAssociationConformanceMessage(
				property, markup, xrefSource, appendNestedConformanceRules);
		}

		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		String keyword = getValidationKeywordWithPropertyRange(association, property);
		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" contain ");
			if (property.getUpper() == 0 && isClosed(property)) {
				message.append("any ");
			}
		} else {

			if (property.getUpper() < 0 || property.getUpper() > 1) {
				message.append("contains ");
			} else {
				message.append("contain ");
			}
			if (property.getUpper() == 0 && isClosed(property)) {
				message.append("any ");
			}

		}

		String elementName = resolveCdaPropertyName(property);

		String propertyPrefix = getNameSpacePrefix(UMLUtil.getInheritedProperty(property) != null
				? UMLUtil.getInheritedProperty(property)
				: property);
		if (propertyPrefix != null && !elementName.contains(":")) {
			elementName = propertyPrefix + ":" + elementName;
		}

		message.append(getMultiplicityText(property));
		message.append(multiplicityElementToggle(property, markup, elementName));

		// appendSubsetsNotation(property, message, markup, xrefSource);

		if (appendNestedConformanceRules && endType != null) {

			if (markup && isInlineClass(endType) && !isPublishSeperately(endType)) {
				StringBuilder sb = new StringBuilder();

				message.append(openOrClosed(property));

				// message.append(", where its type is ");

				appendConformanceRuleIds(association, message, markup);

				appendPropertyComments(sb, property, markup);

				// // (property.getUpper() == 1,? "This "
				// : "Such ") +
				// (property.getUpper() == 1
				// ? elementName
				// : NameUtilities.pluralize(elementName)) +
				// " "
				appendConformanceRules(sb, endType, "", markup);
				message.append(" " + sb + " ");

			} else {

				message.append(", where its type is ");

				String prefix = !UMLUtil.isSameModel(xrefSource, endType)
						? getModelPrefix(endType) + " "
						: "";
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

				appendConformanceRuleIds(association, message, markup);
			}
		} else {
			appendConformanceRuleIds(association, message, markup);
		}

		return message.toString();
	}

	private static String computeTemplateAssociationConformanceMessage(Property property, boolean markup,
			Package xrefSource, boolean appendNestedConformanceRules) {
		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();

		String elementName = resolveCdaPropertyName(property);

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		// errata 384 message support: if the class owner is a section, and it has an association
		// to either a clinical statement or an Entry (Act, Observation, etc.), append the message
		for (Property p : association.getMemberEnds()) {
			if ((p.getName() != null && !p.getName().isEmpty()) && (p.getOwner() != null && p.getType() != null) &&
					(isSection((Class) p.getOwner()) && isClinicalStatement(p.getType()) || isEntry(p.getType()))) {
				message.append(NULLFLAVOR_SECTION_MESSAGE);
			}
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
			if (property.getUpper() < 0 || property.getUpper() > 1) {
				message.append("contains ");
			} else {
				message.append("contain ");
			}
		}

		message.append(multiplicityElementToggle(property, markup, elementName));

		message.append(openOrClosed(property));

		appendConformanceRuleIds(association, message, markup);

		if (appendNestedConformanceRules && property.getType() instanceof Class) {
			Class inlinedClass = (Class) property.getType();

			if (markup && isInlineClass(inlinedClass)) {
				StringBuilder sb = new StringBuilder();

				appendPropertyComments(sb, property, markup);

				appendConformanceRules(sb, inlinedClass, (property.getUpper() == 1
						? "This "
						: "Such ") + (property.getUpper() == 1
						? elementName
						: NameUtilities.pluralize(elementName)) + " ", markup);
				message.append(" " + sb);

			}
		}

		if (!markup) {
			String assocConstraints = computeAssociationConstraints(property, markup);
			if (assocConstraints.length() > 0) {
				message.append(assocConstraints);
			}
		}

		return message.toString();
	}

	public static String computeAssociationConstraints(Property property, boolean markup) {
		StringBuffer message = new StringBuffer();

		Association association = property.getAssociation();
		Package xrefSource = UMLUtil.getTopPackage(property);

		EntryRelationship entryRelationship = CDAProfileUtil.getEntryRelationship(association);
		EntryRelationshipKind typeCode = entryRelationship != null
				? entryRelationship.getTypeCode()
				: null;

		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;

		if (typeCode != null) {
			message.append(markup
					? "\n<li>"
					: " ");
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
			message.append(typeCode.getLiteral());
			message.append(markup
					? "</i>"
					: "");
			message.append(markup
					? "</li>"
					: ", and");
		}

		// TODO: what I should really do is test for an *implied* ActRelationship or Participation association
		if (endType != null && getCDAClass(endType) != null && !(isInlineClass(endType)) &&
				!isInlineClass(property.getClass_())) {
			message.append(markup
					? "\n<li>"
					: " ");
			message.append("Contains exactly one [1..1] ");

			String prefix = !UMLUtil.isSameModel(xrefSource, endType)
					? getModelPrefix(endType) + " "
					: "";
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
			String templateVersion = getTemplateVersion(endType);

			if (templateId != null) {
				message.append(" (templateId: ");
				message.append(markup
						? "<tt>"
						: "");
				message.append(templateId);

				// if there is an extension, add a colon followed by its value
				if (!StringUtils.isEmpty(templateVersion)) {
					message.append(":" + templateVersion);
				}

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

	private static String getNameSpacePrefix(Property property) {

		Property cdaBaseProperty = CDAModelUtil.getCDAProperty(property);
		String nameSpacePrefix = null;
		if (cdaBaseProperty != null) {
			Stereotype eReferenceStereoetype = cdaBaseProperty.getAppliedStereotype(CDAModelUtil.EREFERENCE);
			if (eReferenceStereoetype != null) {
				String nameSpace = (String) cdaBaseProperty.getValue(eReferenceStereoetype, CDAModelUtil.XMLNAMESPACE);
				if (!StringUtils.isEmpty(nameSpace)) {
					Package topPackage = org.openhealthtools.mdht.uml.common.util.UMLUtil.getTopPackage(cdaBaseProperty.getNearestPackage());
					Stereotype ePackageStereoetype = topPackage.getApplicableStereotype(CDAModelUtil.EPACKAGE);
					if (ePackageStereoetype != null) {
						if (nameSpace.equals(topPackage.getValue(ePackageStereoetype, CDAModelUtil.NSURI))) {
							nameSpacePrefix = (String) topPackage.getValue(ePackageStereoetype, CDAModelUtil.NSPREFIX);
						} else {
							for (Package nestedPackage : topPackage.getNestedPackages()) {
								if (nameSpace.equals(nestedPackage.getValue(ePackageStereoetype, CDAModelUtil.NSURI))) {
									nameSpacePrefix = (String) nestedPackage.getValue(
										ePackageStereoetype, CDAModelUtil.NSPREFIX);
								}
							}
						}
					}
				}
			}
		}
		return nameSpacePrefix;
	}

	public static String computeConformanceMessage(Property property, boolean markup, Package xrefSource) {
		return computeConformanceMessage(property, markup, xrefSource, true);
	}

	private static String openOrClosed(Property property) {
		if (isClosed(property)) {
			return " ";
		} else {
			return " such that it ";
		}
	}

	private static boolean isClosed(Property property) {
		Validation validation = org.eclipse.uml2.uml.util.UMLUtil.getStereotypeApplication(
			(property.getAssociation() != null
					? property.getAssociation()
					: property), Validation.class);
		if (validation != null && validation.getKind().equals(ValidationKind.CLOSED)) {
			return true;
		} else {
			return false;
		}
	}

	public static String computeConformanceMessage(Property property, boolean markup, Package xrefSource,
			boolean appendNestedConformanceRules) {

		if (property.getType() == null) {
			System.out.println("Property has null type: " + property.getQualifiedName());
		}
		if (property.getAssociation() != null && property.isNavigable()) {
			return computeAssociationConformanceMessage(property, markup, xrefSource, appendNestedConformanceRules);
		}

		StringBuffer message = new StringBuffer();

		if (!markup) {
			message.append(getPrefixedSplitName(property.getClass_())).append(" ");
		}

		String keyword = getValidationKeywordWithPropertyRange(property);
		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");
			message.append(" contain ");
			if (property.getUpper() == 0 && isClosed(property)) {
				message.append("any ");
			}
		} else {
			if (property.getUpper() < 0 || property.getUpper() > 1) {
				message.append("contains ");
			} else {
				message.append("contain ");
			}
			if (property.getUpper() == 0 && isClosed(property)) {
				message.append("any ");
			}
		}

		message.append(getMultiplicityText(property));
		if (!cardinalityAfterElement) {
			message.append(getMultiplicityRange(property));
		}
		message.append(" ");

		message.append(markup
				? "<tt><b>"
				: "");
		// classCode/moodCode
		if (isXMLAttribute(property)) {
			message.append("@");
		}

		String propertyPrefix = getNameSpacePrefix(property);

		String cdaPropertyName = resolveCdaPropertyName(property);

		message.append(propertyPrefix != null
				? propertyPrefix + ":" + cdaPropertyName
				: cdaPropertyName);

		message.append(markup
				? "</b>"
				: "");

		message.append(getBusinessName(property));

		if (property.getDefault() != null) {
			message.append("=\"").append(property.getDefault()).append("\" ");
		}
		message.append(markup
				? "</tt>"
				: "");

		if (cardinalityAfterElement) {
			message.append(getMultiplicityRange(property));
		}

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
				SeverityKind level = (SeverityKind) property.getValue(
					textValue, ICDAProfileConstants.VALIDATION_SEVERITY);
				message.append(" and ").append(markup
						? "<b>"
						: "").append(level != null
						? getValidationKeyword(level.getLiteral())
						: keyword).append(markup
						? "</b>"
						: "").append(" equal \"").append(value).append("\"");
			}
		}

		Property cdaProperty = transformToCDAProperty(property);
		if (property.getType() instanceof Classifier && cdaProperty != null &&
				cdaProperty.getType() instanceof Classifier) {
			Classifier propertyType = (Classifier) property.getType();
			Classifier cdaPropertyType = (Classifier) cdaProperty.getType();
			Class propertyCdaType = CDAModelUtil.getCDAClass(propertyType);
			if (propertyCdaType == null) {
				propertyCdaType = CDAModelUtil.getCDADatatype(propertyType);
			}
			// if the datatype is not different from the immediate parent, then the xsi:type shouldn't be printed
			if (propertyCdaType != null && cdaPropertyType != null && propertyCdaType != cdaPropertyType &&
					propertyCdaType.getName() != null && !propertyCdaType.getName().isEmpty()) {
				message.append(" with " + "@xsi:type=\"");
				message.append(propertyCdaType.getName());
				message.append("\"");
			}
		}

		// for vocab properties, put rule ID at end, use terminology constraint if specified
		if (isHL7VocabAttribute(property)) {
			String ruleIds = getTerminologyConformanceRuleIds(property);
			// if there are terminology rule IDs, then include property rule IDs here
			if (ruleIds.length() > 0) {
				appendConformanceRuleIds(property, message, markup);
			}
		} else {
			// PropertyConstraint stereotype ruleIds, if specified
			appendConformanceRuleIds(property, message, markup);
		}

		Stereotype codeSystemConstraint = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSetConstraint = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.VALUE_SET_CONSTRAINT);

		if (codeSystemConstraint != null) {
			String vocab = computeCodeSystemMessage(property, markup);
			message.append(vocab);
		} else if (valueSetConstraint != null) {
			String vocab = computeValueSetMessage(property, markup, xrefSource);
			message.append(vocab);
		} else if (isHL7VocabAttribute(property) && property.getDefault() != null) {
			String vocab = computeHL7VocabAttributeMessage(property, markup);
			message.append(vocab);
		}

		// for vocab properties, put rule ID at end, use terminology constraint if specified
		if (isHL7VocabAttribute(property)) {
			String ruleIds = getTerminologyConformanceRuleIds(property);
			if (ruleIds.length() > 0) {
				appendTerminologyConformanceRuleIds(property, message, markup);
			} else {
				appendConformanceRuleIds(property, message, markup);
			}
		} else {
			// rule IDs for the terminology constraint
			appendTerminologyConformanceRuleIds(property, message, markup);
		}

		if (property.getType() != null && appendNestedConformanceRules && property.getType() instanceof Class) {
			if (isInlineClass((Class) property.getType())) {

				if (isPublishSeperately((Class) property.getType())) {

					String xref = (property.getType() instanceof Classifier && UMLUtil.isSameProject(
						property, property.getType()))
							? computeXref(xrefSource, (Classifier) property.getType())
							: null;
					boolean showXref = markup && (xref != null);

					if (showXref) {
						String format = showXref && xref.endsWith(".html")
								? "format=\"html\" "
								: "";
						message.append(showXref
								? "<xref " + format + "href=\"" + xref + "\">"
								: "");
						message.append(UMLUtil.splitName(property.getType()));
						message.append(showXref
								? "</xref>"
								: "");
					}

				} else {
					StringBuilder sb = new StringBuilder();
					boolean hadSideEffect = appendPropertyComments(sb, property, markup);
					if (isAppendConformanceRules) {
						int len = sb.length();

						appendConformanceRules(sb, (Class) property.getType(), "", markup);

						hadSideEffect |= sb.length() > len;
					}
					if (hadSideEffect) {

						if (cdaProperty.upperBound() != 1 && property.getType() instanceof Class &&
								CDAModelUtil.isInlineClass((Class) property.getType())) {
							message.append(openOrClosed(property) + " " + sb);
						} else {
							message.append(" " + sb);
						}

					}
				}

			}

		}

		return message.toString();
	}

	/**
	 * Fully resolve the CDA Name of a property.
	 * 
	 * Note that this may not necessarily be the UML name of the property
	 * as in redefined and subsets properties, so go looking for the correct name
	 * 
	 * @param property
	 *            the name to be resolved
	 * @return string property name as it would appear in CDA
	 */
	private static String resolveCdaPropertyName(Property property) {
		Property cdaProperty = transformToCDAProperty(property);

		String propertyCdaName = null;
		if (cdaProperty != null) {
			propertyCdaName = getCDAName(cdaProperty);
		} else {
			propertyCdaName = getCDAElementName(property);
		}
		return propertyCdaName;
	}

	/**
	 * transformToCDAProperty uses the Extension-point trick
	 * to access attributes on downstream projects without creating
	 * a dependency.
	 * 
	 * In this case it uses CDABaseModelReflection
	 * 
	 * @see also TransformSupplier and org.openhealthtools.mdht.uml.cda.core.TransformProvider
	 * 
	 *      Used when resolving CDAName as opposed to UML name
	 * 
	 * @param property
	 *            a CDA Property
	 * @return a transformed view of that property or null
	 */
	private static Property transformToCDAProperty(Property property) {
		// Get the extension point
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint("org.openhealthtools.mdht.uml.cda.core.TransformProvider");
		IExtension[] extensions = ep.getExtensions();
		TransformProvider newContributor = null;
		Property cdaProperty = null;

		// then apply the transform
		try {
			newContributor = (TransformProvider) extensions[0].getConfigurationElements()[0].createExecutableExtension("transform-class");
			cdaProperty = newContributor.GetTransform(property);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cdaProperty;
	}

	/**
	 * getCDAName
	 * 
	 * recursively, depth first, check the object graph for a CDA Name using the root of the "redefined"
	 * property if it exists.
	 * 
	 * Also handle special cases like sectionId which has a cdaName of ID
	 * 
	 * @param cdaProperty
	 *            an MDHT property
	 * @return string
	 *         the calculated CDA name
	 */
	private static String getCDAName(Property cdaProperty) {
		EList<Property> redefines = cdaProperty.getRedefinedProperties();

		// if there is a stereotype name, use it
		String name = getStereotypeName(cdaProperty);
		if (name != null && !name.isEmpty()) {
			return name;
		}

		// if there are redefines, check for more but only along the first branch (0)
		if (redefines != null && redefines.size() > 0) {
			return getCDAName(redefines.get(0));
		}

		// eventually return the property Name of the root redefined element;

		return cdaProperty.getName();
	}

	/**
	 * Get the CDA name from a stereotype if it exists
	 * 
	 * @param cdaProperty
	 *            a Property
	 * @return the xmlName or null if no stereotype exists
	 */
	private static String getStereotypeName(Property cdaProperty) {
		Stereotype eAttribute = cdaProperty.getAppliedStereotype("Ecore::EAttribute");
		String name = null;
		if (eAttribute != null) {
			name = (String) cdaProperty.getValue(eAttribute, "xmlName");
		}
		return name;
	}

	private static void appendSubsetsNotation(Property property, StringBuffer message, boolean markup,
			Package xrefSource) {
		StringBuffer notation = new StringBuffer();
		for (Property subsets : property.getSubsettedProperties()) {
			if (subsets.getClass_() == null) {
				// eliminate NPE when publishing stereotype references to UML metamodel
				continue;
			}
			if (notation.length() == 0) {
				notation.append(" {subsets ");
			} else {
				notation.append(", ");
			}

			String xref = computeXref(xrefSource, subsets.getClass_());
			boolean showXref = markup && (xref != null);
			String format = showXref && xref.endsWith(".html")
					? "format=\"html\" "
					: "";
			notation.append(showXref
					? " <xref " + format + "href=\"" + xref + "\">"
					: " ");
			notation.append(UMLUtil.splitName(subsets.getClass_()));
			notation.append(showXref
					? "</xref>"
					: "");

			notation.append("::" + subsets.getName());
		}
		if (notation.length() > 0) {
			notation.append("}");
		}

		message.append(notation);
	}

	private static final String[] OL = { "<ol>", "</ol>" };

	private static final String[] LI = { "<li>", "</li>" };

	private static final String[] NOOL = { "", " " };

	private static final String[] NOLI = { "", " " };

	static private void appendConformanceRules(StringBuilder appendB, Class umlClass, String prefix, boolean markup) {

		String[] ol = markup
				? OL
				: NOOL;
		String[] li = markup
				? LI
				: NOLI;

		StringBuilder sb = new StringBuilder();

		boolean hasRules = false;

		if (!CDAModelUtil.isInlineClass(umlClass)) {
			for (Generalization generalization : umlClass.getGeneralizations()) {
				Classifier general = generalization.getGeneral();
				if (!RIMModelUtil.isRIMModel(general) && !CDAModelUtil.isCDAModel(general)) {
					String message = CDAModelUtil.computeConformanceMessage(generalization, markup);
					if (message.length() > 0) {
						hasRules = true;
						sb.append(li[0] + prefix + message + li[1]);
					}
				}
			}
		}

		// categorize constraints by constrainedElement name
		List<Constraint> unprocessedConstraints = new ArrayList<Constraint>();
		// propertyName -> constraints
		Map<String, List<Constraint>> constraintMap = new HashMap<String, List<Constraint>>();
		// constraint -> sub-constraints
		Map<Constraint, List<Constraint>> subConstraintMap = new HashMap<Constraint, List<Constraint>>();

		for (Constraint constraint : umlClass.getOwnedRules()) {
			unprocessedConstraints.add(constraint);

			// Do not associate logical constraints with a property because they are a class and not a property constraint
			if (CDAProfileUtil.getLogicalConstraint(constraint) == null) {
				for (Element element : constraint.getConstrainedElements()) {
					if (element instanceof Property) {
						String name = ((Property) element).getName();
						List<Constraint> rules = constraintMap.get(name);
						if (rules == null) {
							rules = new ArrayList<Constraint>();
							constraintMap.put(name, rules);
						}
						rules.add(constraint);
					} else if (element instanceof Constraint) {
						Constraint subConstraint = (Constraint) element;
						List<Constraint> rules = subConstraintMap.get(subConstraint);
						if (rules == null) {
							rules = new ArrayList<Constraint>();
							subConstraintMap.put(subConstraint, rules);
						}
						rules.add(constraint);
					}
				}
			}
		}

		PropertyList propertyList = new PropertyList(umlClass, CDAModelUtil.isInlineClass(umlClass));

		// XML attributes
		for (Property property : propertyList.getAttributes()) {
			hasRules = hasRules |
					appendPropertyList(
						umlClass, property, markup, ol, sb, prefix, li, constraintMap, unprocessedConstraints,
						subConstraintMap);
		}
		// XML elements
		for (Property property : propertyList.getAssociationEnds()) {
			hasRules = hasRules |
					appendPropertyList(
						umlClass, property, markup, ol, sb, prefix, li, constraintMap, unprocessedConstraints,
						subConstraintMap);
		}

		for (Constraint constraint : unprocessedConstraints) {
			hasRules = true;
			sb.append(li[0] + prefix + CDAModelUtil.computeConformanceMessage(constraint, markup) + li[1]);
		}

		if (hasRules) {
			appendB.append(ol[0]);
			appendB.append(sb);
			appendB.append(ol[1]);
		}
	}

	private static boolean appendPropertyList(Element umlClass, Property property, boolean markup, String[] ol,
			StringBuilder sb, String prefix, String[] li, Map<String, List<Constraint>> constraintMap,
			List<Constraint> unprocessedConstraints, Map<Constraint, List<Constraint>> subConstraintMap) {
		boolean result = false;
		if (!CDAModelUtil.isCDAModel(umlClass) && !CDAModelUtil.isCDAModel(property) &&
				!CDAModelUtil.isDatatypeModel(property)) {
			result = true;
			String ccm = CDAModelUtil.computeConformanceMessage(property, markup);
			boolean order = ccm.trim().endsWith(ol[1]);
			boolean currentlyItem = false;
			if (order) {
				int olIndex = ccm.lastIndexOf(ol[1]);
				ccm = ccm.substring(0, olIndex);
				currentlyItem = ccm.trim().endsWith(li[1]);
			}
			sb.append(li[0] + prefix + ccm);
			StringBuilder propertyComments = new StringBuilder();
			currentlyItem &= appendPropertyComments(propertyComments, property, markup);
			if (currentlyItem) {
				sb.append(li[0]).append(propertyComments).append(li[1]);
			} else {
				sb.append(propertyComments);
			}

			appendPropertyRules(sb, property, constraintMap, subConstraintMap, unprocessedConstraints, markup, !order);

			if (order) {
				sb.append(ol[1]);
			}

			sb.append(li[1]);
		}
		return result;
	}

	private static boolean appendPropertyComments(StringBuilder sb, Property property, boolean markup) {

		// INLINE

		Association association = property.getAssociation();

		int startingStrLength = sb.length();

		if (association != null && association.getOwnedComments().size() > 0) {
			if (markup) {
				sb.append("<p><lines><i>");
			}
			for (Comment comment : association.getOwnedComments()) {
				sb.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
			}
			if (markup) {
				sb.append("</i></lines></p>");
			}
		}

		if (property.getOwnedComments().size() > 0) {
			if (markup) {
				sb.append("<p><lines><i>");
			}
			for (Comment comment : property.getOwnedComments()) {
				sb.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
			}
			if (markup) {
				sb.append("</i></lines></p>");
			}
		}

		return sb.length() > startingStrLength;
	}

	private static void appendPropertyRules(StringBuilder sb, Property property,
			Map<String, List<Constraint>> constraintMap, Map<Constraint, List<Constraint>> subConstraintMap,
			List<Constraint> unprocessedConstraints, boolean markup, boolean newOrder) {

		String[] ol = markup && newOrder
				? OL
				: NOOL;
		String[] li = markup
				? LI
				: NOLI;

		// association typeCode and property type
		String assocConstraints = "";
		if (property.getAssociation() != null) {
			assocConstraints = CDAModelUtil.computeAssociationConstraints(property, markup);
		}

		StringBuffer ruleConstraints = new StringBuffer();
		List<Constraint> rules = constraintMap.get(property.getName());
		if (rules != null && !rules.isEmpty()) {
			for (Constraint constraint : rules) {
				unprocessedConstraints.remove(constraint);
				ruleConstraints.append(li[0] + CDAModelUtil.computeConformanceMessage(constraint, markup));
				appendSubConstraintRules(ruleConstraints, constraint, subConstraintMap, unprocessedConstraints, markup);
				ruleConstraints.append(li[1]);
			}
		}

		if (assocConstraints.length() > 0 || ruleConstraints.length() > 0) {
			sb.append(ol[0]);
			sb.append(assocConstraints);
			sb.append(ruleConstraints);
			sb.append(ol[1]);
		}
	}

	private static void appendSubConstraintRules(StringBuffer ruleConstraints, Constraint constraint,
			Map<Constraint, List<Constraint>> subConstraintMap, List<Constraint> unprocessedConstraints, boolean markup) {

		String[] ol;
		String[] li;

		if (markup) {
			ol = OL;
			li = LI;
		} else {
			ol = NOOL;
			li = NOLI;
		}

		List<Constraint> subConstraints = subConstraintMap.get(constraint);
		if (subConstraints != null && subConstraints.size() > 0) {
			ruleConstraints.append(ol[0]);
			for (Constraint subConstraint : subConstraints) {
				unprocessedConstraints.remove(subConstraint);
				ruleConstraints.append(li[0] + CDAModelUtil.computeConformanceMessage(subConstraint, markup));
				appendSubConstraintRules(
					ruleConstraints, subConstraint, subConstraintMap, unprocessedConstraints, markup);
				ruleConstraints.append(li[1]);
			}
			ruleConstraints.append(ol[1]);
		}
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
		Stereotype codeSystemConstraintStereotype = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);

		String keyword = getValidationKeyword(property, codeSystemConstraintStereotype);
		String id = null;
		String name = null;
		String code = null;
		String displayName = null;

		if (codeSystemConstraint != null) {
			if (codeSystemConstraint.getReference() != null) {
				CodeSystemVersion codeSystemVersion = codeSystemConstraint.getReference();
				id = codeSystemVersion.getIdentifier();
				name = codeSystemVersion.getEnumerationName();
				codeSystemVersion.getVersion();
			} else {
				id = codeSystemConstraint.getIdentifier();
				name = codeSystemConstraint.getName();
				codeSystemConstraint.getVersion();
			}

			codeSystemConstraint.getBinding();
			code = codeSystemConstraint.getCode();
			displayName = codeSystemConstraint.getDisplayName();
		}

		StringBuffer message = new StringBuffer();
		if (code != null) {
			message.append(markup
					? "<tt><b>"
					: "");
			// single value binding
			message.append("/@code");
			message.append(markup
					? "</b>"
					: "");

			message.append("=\"").append(code).append("\" ");
			message.append(markup
					? "</tt>"
					: "");

			if (displayName != null) {
				message.append(markup
						? "<i>"
						: "");
				message.append(displayName);
				message.append(markup
						? "</i>"
						: "");
			}

		} else {
			// capture and return proper xml binding message based on mandatory or not
			message.append(mandatoryOrNotMessage(property));

			if (keyword != null) {
				message.append(markup
						? "<b>"
						: "");
				message.append(keyword);
				message.append(markup
						? "</b>"
						: "");

				message.append(" be");
			} else {
				message.append("is");
			}
			message.append(" selected from");
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
			message.append(")");
		}

		return message.toString();
	}

	private static String computeValueSetMessage(Property property, boolean markup, Package xrefSource) {
		Stereotype valueSetConstraintStereotype = TermProfileUtil.getAppliedStereotype(
			property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);

		String keyword = getValidationKeyword(property, valueSetConstraintStereotype);
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

		// capture and return proper xml binding message based on mandatory or not
		message.append(mandatoryOrNotMessage(property));

		if (keyword != null) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");

			message.append(" be");
		} else {
			message.append("is");
		}
		message.append(" selected from ValueSet");

		message.append(markup
				? "<tt>"
				: "");
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
		if (id != null) {
			message.append(" ").append(id);
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

	public static String computeConformanceMessage(Constraint constraint, boolean markup) {

		LogicalConstraint logicConstraint = CDAProfileUtil.getLogicalConstraint(constraint);
		if (logicConstraint != null) {
			return computeLogicalConformanceMessage(constraint, logicConstraint, markup);
		} else {
			return computeCustomConformanceMessage(constraint, markup);
		}

	}

	private static String computeCustomConformanceMessage(Constraint constraint, boolean markup) {
		StringBuffer message = new StringBuffer();
		String strucTextBody = null;
		String analysisBody = null;
		Map<String, String> langBodyMap = new HashMap<String, String>();

		CDAProfileUtil.getLogicalConstraint(constraint);

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
			Boolean ditaEnabled = false;
			try {
				Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
				ditaEnabled = (Boolean) constraint.getValue(stereotype, ICDAProfileConstants.CONSTRAINT_DITA_ENABLED);
			} catch (IllegalArgumentException e) { /* Swallow this */
			}
			if (markup && !ditaEnabled) {
				// escape non-dita markup in analysis text
				displayBody = escapeMarkupCharacters(analysisBody);
				// change severity words to bold text
				displayBody = replaceSeverityWithBold(displayBody);
			} else {
				displayBody = analysisBody;
			}
		}

		if (displayBody == null) {
			List<Stereotype> stereotypes = constraint.getAppliedStereotypes();
			if (stereotypes.isEmpty()) {
				// This should never happen but in case it does we deal with it appropriately
				// by bypassing custom constraint message additions
				return "";
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

	private static String computeLogicalConformanceMessage(Constraint constraint, LogicalConstraint logicConstraint,
			boolean markup) {
		StringBuffer message = new StringBuffer();

		logicConstraint.getMessage();

		String keyword = getValidationKeyword(constraint);
		if (keyword == null) {
			keyword = "SHALL";
		}

		// Wording for IFTHEN - IF xxx then SHALL yyy
		if (!logicConstraint.getOperation().equals(LogicalOperator.IFTHEN)) {
			message.append(markup
					? "<b>"
					: "");
			message.append(keyword);
			message.append(markup
					? "</b>"
					: "");

		}

		switch (logicConstraint.getOperation()) {
			case XOR:
				message.append(" contain one and only one of the following ");
				break;
			case AND:
				message.append(" contain all of the following ");
				break;
			case OR:
				message.append(" contain one or more of the following ");
			case IFTHEN:
				message.append("if ");
				break;
			case NOTBOTH:
				message.append(" contain zero or one of the following but not both ");
				break;
			default:
				message.append(" satisfy the following ");
				break;
		}

		if (logicConstraint.getOperation().equals(LogicalOperator.IFTHEN) &&
				constraint.getConstrainedElements().size() == 2) {

			String propertyKeyword = getValidationKeyword(constraint.getConstrainedElements().get(0));

			if (propertyKeyword != null) {
				message.append(computeConformanceMessage(constraint.getConstrainedElements().get(0), markup).replace(
					propertyKeyword, ""));
			} else {
				message.append(computeConformanceMessage(constraint.getConstrainedElements().get(0), markup));
			}

			message.append(" then it ").append(markup
					? "<lines>"
					: "").append(markup
					? "<b>"
					: "").append(keyword).append(markup
					? "</b> "
					: " ");

			message.append(computeConformanceMessage(constraint.getConstrainedElements().get(1), markup));
			message.append(markup
					? "</lines>"
					: "");

		} else {
			if (markup) {
				message.append("<ol>");
			}
			for (Element element : constraint.getConstrainedElements()) {
				message.append(LI[0]);
				message.append(computeConformanceMessage(element, markup));
				message.append(LI[1]);
			}
			if (markup) {
				message.append("</ol>");
			}
		}

		appendConformanceRuleIds(constraint, message, markup);

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

	/**
	 * FindResourcesByNameVisitor searches the resource for resources of a particular name
	 * You would think there was a method for this already but i could not find it
	 * 
	 * @author seanmuir
	 * 
	 */
	public static class FindResourcesByNameVisitor implements IResourceVisitor {

		private String resourceName;

		private ArrayList<IResource> resources = new ArrayList<IResource>();

		/**
		 * @return the resources
		 */
		public ArrayList<IResource> getResources() {
			return resources;
		}

		/**
		 * @param resourceName
		 */
		public FindResourcesByNameVisitor(String resourceName) {
			super();
			this.resourceName = resourceName;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources.IResource)
		 */
		public boolean visit(IResource arg0) throws CoreException {

			if (resourceName != null && resourceName.equals(arg0.getName())) {
				resources.add(arg0);
			}
			return true;
		}

	}

	public static IProject getElementModelProject(Element element) {
		try {
			Package elementPackage = UMLUtil.getTopPackage(element);
			if (elementPackage != null && elementPackage.eResource() != null) {
				FindResourcesByNameVisitor visitor = new FindResourcesByNameVisitor(
					elementPackage.eResource().getURI().lastSegment());

				IWorkspace iw = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();

				iw.getRoot().accept(visitor);

				if (!visitor.getResources().isEmpty()) {
					return visitor.getResources().get(0).getProject();
				}
			}
		} catch (CoreException e) {
			// If there is an issue with the workspace - return null
		}
		return null;
	}

	public static IProject getModelDocProject(IProject modelProject) {

		if (modelProject != null && modelProject.exists()) {
			return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject(
				modelProject.getName().replace(".model", ".doc"));
		}
		return null;

	}

	/**
	 * computeXref returns the XREF for DITA publication
	 * 
	 * TODO Refactor and move out of model util
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	public static String computeXref(Element source, Classifier target) {
		if (target == null) {
			return null;
		}
		if (target instanceof Enumeration) {
			return computeTerminologyXref(source, (Enumeration) target);
		}

		if (UMLUtil.isSameProject(source, target)) {
			return "../" + normalizeCodeName(target.getName()) + ".dita";
		}

		// If the model project is available (should be) and the dita content is part of the doc project
		if (!isCDAModel(target)) {
			IProject sourceProject = getElementModelProject(source);

			sourceProject = getModelDocProject(sourceProject);

			IProject targetProject = getElementModelProject(target);

			targetProject = getModelDocProject(targetProject);

			if (targetProject != null && sourceProject != null) {

				IPath projectPath = new Path("/dita/classes/" + targetProject.getName());

				IFolder referenceDitaFolder = sourceProject.getFolder(projectPath);
				if (referenceDitaFolder.exists()) {
					return "../" + targetProject.getName() + "/classes/" + normalizeCodeName(target.getName()) +
							".dita";
				}
			}

			String pathFolder = "classes";
			String basePackage = "";
			String prefix = "";

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

			return INFOCENTER_URL + "/topic/" + basePackage + "." + prefix + "doc/" + pathFolder + "/" +
					normalizeCodeName(target.getName()) + ".html";
		}

		return null;
	}

	protected static String computeTerminologyXref(Element source, Enumeration target) {
		String href = null;
		if (UMLUtil.isSameProject(source, target)) {
			href = "../../terminology/" + normalizeCodeName(target.getName()) + ".dita";
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

	/**
	 * getExtensionNamespace returns the name space from a extension package in the CDA model
	 * 
	 * @param type
	 * @return
	 */
	private static String getExtensionNamespace(Type type) {
		String nameSpace = null;

		if (type != null && type.getNearestPackage() != null &&
				!CDA_PACKAGE_NAME.equals(type.getNearestPackage().getName())) {
			Stereotype ecoreStereotype = type.getNearestPackage().getAppliedStereotype(EPACKAGE);
			if (ecoreStereotype != null) {
				Object object = type.getNearestPackage().getValue(ecoreStereotype, NSPREFIX);
				if (object instanceof String) {
					nameSpace = (String) object;
				}
			}
		}
		return nameSpace;
	}

	public static String getNameSpacePrefix(Class cdaSourceClass) {
		if (cdaSourceClass != null && cdaSourceClass.getPackage() != null &&
				!CDA_PACKAGE_NAME.equals(cdaSourceClass.getPackage().getName())) {
			Stereotype ecoreStereotype = cdaSourceClass.getPackage().getAppliedStereotype(EPACKAGE);
			if (ecoreStereotype != null) {
				Object object = cdaSourceClass.getPackage().getValue(ecoreStereotype, NSPREFIX);
				if (object instanceof String) {
					return (String) object;
				}
			}
		}
		return null;
	}

	/**
	 * getCDAElementName - Returns the CDA Element name as a string
	 * 
	 * @TODO Refactor to use org.openhealthtools.mdht.uml.transform.ecore.TransformAbstract.getInitialProperty(Property)
	 * 
	 *       Currently walk the redefines to see if we can match the CDA property using the name and type
	 *       If none found - for backwards compatibility we look for a property in the base class with a matching type which is potential error prone
	 *       If none still - leverage the getassociation
	 * 
	 * @param property
	 * @return
	 */
	public static String getCDAElementName(Property property) {
		String elementName = null;

		if (property.getType() instanceof Class) {
			Class cdaSourceClass = getCDAClass(property.getClass_());
			if (cdaSourceClass != null) {

				// First check for definitions
				for (Property redefinedProperty : property.getRedefinedProperties()) {
					// This will never succeed for associations, does not include ActRelationship

					if (redefinedProperty.getType() != null) {

						Property cdaProperty = cdaSourceClass.getOwnedAttribute(
							redefinedProperty.getName(), getCDAClass((Classifier) redefinedProperty.getType()));
						if (cdaProperty != null && cdaProperty.getName() != null) {
							String modelPrefix = getExtensionNamespace(cdaProperty.getType());
							elementName = !StringUtils.isEmpty(modelPrefix)
									? modelPrefix + ":" + cdaProperty.getName()
									: cdaProperty.getName();
							break;
						}
					}

				}

				// Next check using property type and name
				if (elementName == null) {
					Property cdaProperty = cdaSourceClass.getOwnedAttribute(
						property.getName(), getCDAClass((Classifier) property.getType()));
					if (cdaProperty != null && cdaProperty.getName() != null) {
						String modelPrefix = getExtensionNamespace(cdaProperty.getType());
						elementName = !StringUtils.isEmpty(modelPrefix)
								? modelPrefix + ":" + cdaProperty.getName()
								: cdaProperty.getName();
					}

				}

				// Ultimately use original logic for backwards compatibility
				if (elementName == null) {
					Property cdaProperty = cdaSourceClass.getOwnedAttribute(
						null, getCDAClass((Classifier) property.getType()));
					if (cdaProperty != null && cdaProperty.getName() != null) {
						String modelPrefix = getExtensionNamespace(cdaProperty.getType());
						elementName = !StringUtils.isEmpty(modelPrefix)
								? modelPrefix + ":" + cdaProperty.getName()
								: cdaProperty.getName();
					}

				}

			}
		}

		// look for CDA association class element name, e.g. "component"
		if (elementName == null) {
			elementName = getCDAAssociationElementName(property);
		}

		if (elementName == null) {
			elementName = property.getName();
		}

		return elementName;
	}

	public static String getCDAAssociationElementName(Property property) {
		Class cdaSourceClass = getCDAClass(property.getClass_());
		Class endType = (property.getType() instanceof Class)
				? (Class) property.getType()
				: null;
		Class cdaTargetClass = endType != null
				? getCDAClass(endType)
				: null;

		// This is incomplete determination of XML element name, but same logic as used in model transform
		String elementName = null;
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
		} else if (CDAModelUtil.isClinicalStatement(cdaSourceClass) && cdaTargetClass != null &&
				"ParticipantRole".equals(cdaTargetClass.getName())) {
			elementName = "participant";
		} else if (CDAModelUtil.isClinicalStatement(cdaSourceClass) && cdaTargetClass != null &&
				"AssignedEntity".equals(cdaTargetClass.getName())) {
			elementName = "performer";
		}

		return elementName;
	}

	private static String getMultiplicityRange(Property property) {

		StringBuffer message = new StringBuffer();
		String lower = Integer.toString(property.getLower());
		String upper = property.getUpper() == -1
				? "*"
				: Integer.toString(property.getUpper());
		message.append(" [").append(lower).append("..").append(upper).append("]");
		return message.toString();
	}

	/*
	 * 
	 * · 0..1 zero or one
	 * 
	 * · 1..1 exactly one
	 * 
	 * · 1..* at least one
	 * 
	 * · 0..* zero or more
	 * 
	 * · 1..n at least one and not more than n
	 */

	private static String getMultiplicityText(Property property) {

		StringBuffer message = new StringBuffer();

		if (property.getLower() == property.getUpper()) {
			// Upper and lower equal and not zero
			if (property.getLower() != 0) {
				message.append("exactly ").append(convertNumberToWords(property.getUpper()));
			}
		} else if (property.getLower() == 0) {
			// Lower is zero
			if (property.getUpper() == 0) {

			} else if (property.getUpper() == 1) {
				message.append("zero or one");
			} else if (property.getUpper() == -1) {
				message.append("zero or more");
			} else {
				message.append("not more than " + convertNumberToWords(property.getUpper()));
			}
		} else if (property.getLower() == 1) {
			// Lower is one
			if (property.getUpper() == -1) {
				message.append("at least one");
			} else {
				message.append("at least " + convertNumberToWords(property.getLower()) + " and not more than " +
						convertNumberToWords(property.getUpper()));
			}
		} else {
			// Lower is greater then 1
			message.append("at least " + convertNumberToWords(property.getLower()));
			if (property.getUpper() != -1) {
				message.append(" and not more than " + convertNumberToWords(property.getUpper()));
			}
		}
		return message.toString();
	}

	// This snippet may be used freely, as long as the authorship note remains in the source code.

	private static final String[] lowNames = {
			"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	private static final String[] tensNames = {
			"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	private static final String[] bigNames = { "thousand", "million", "billion" };

	/**
	 * Converts an integer number into words (american english).
	 * 
	 * @author Christian d'Heureuse, Inventec Informatik AG, Switzerland, www.source-code.biz
	 **/
	private static String convertNumberToWords(int n) {
		if (n < 0) {
			return "minus " + convertNumberToWords(-n);
		}
		if (n <= 999) {
			return convert999(n);
		}
		String s = null;
		int t = 0;
		while (n > 0) {
			if (n % 1000 != 0) {
				String s2 = convert999(n % 1000);
				if (t > 0) {
					s2 = s2 + " " + bigNames[t - 1];
				}
				if (s == null) {
					s = s2;
				} else {
					s = s2 + ", " + s;
				}
			}
			n /= 1000;
			t++;
		}
		return s;
	}

	// Range 0 to 999.
	private static String convert999(int n) {
		String s1 = lowNames[n / 100] + " hundred";
		String s2 = convert99(n % 100);
		if (n <= 99) {
			return s2;
		} else if (n % 100 == 0) {
			return s1;
		} else {
			return s1 + " " + s2;
		}
	}

	// Range 0 to 99.
	private static String convert99(int n) {
		if (n < 20) {
			return lowNames[n];
		}
		String s = tensNames[n / 10 - 2];
		if (n % 10 == 0) {
			return s;
		}
		return s + "-" + lowNames[n % 10];
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

	private static String getMultiplicityRange(Class template) {
		String templateId = null;
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null && template.hasValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY)) {
			templateId = (String) template.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY);
		} else {
			for (Classifier parent : template.getGenerals()) {
				templateId = getMultiplicityRange((Class) parent);
				if (templateId != null) {
					break;
				}
			}
		}

		return templateId;
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

	public static String getTemplateVersion(Class template) {
		String templateVersion = null;
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null) {
			templateVersion = (String) template.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_VERSION);
		} else {
			for (Classifier parent : template.getGenerals()) {
				templateVersion = getTemplateId((Class) parent);
				if (templateVersion != null) {
					break;
				}
			}
		}

		return templateVersion;
	}

	public static String getModelPrefix(Element element) {
		String prefix = null;
		Package thePackage = UMLUtil.getTopPackage(element);
		if (thePackage != null) {
			Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(
				thePackage, ICDAProfileConstants.CODEGEN_SUPPORT);
			if (codegenSupport != null) {
				prefix = (String) thePackage.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);
			} else if (CDA_PACKAGE_NAME.equals(thePackage.getName())) {
				prefix = "CDA";
			} else if (RIMModelUtil.RIM_PACKAGE_NAME.equals(thePackage.getName())) {
				prefix = "RIM";
			}
		}
		return prefix != null
				? prefix
				: "";
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
		if (modelPrefix != null && modelPrefix.length() > 0) {
			buffer.append(modelPrefix).append(" ");
		}
		buffer.append(UMLUtil.splitName(element));

		return buffer.toString();
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

	protected static void appendTerminologyConformanceRuleIds(Property property, StringBuffer message, boolean markup) {
		String ruleIds = getTerminologyConformanceRuleIds(property);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	protected static void appendConformanceRuleIds(Property property, StringBuffer message, boolean markup) {
		String ruleIds = getConformanceRuleIds(property);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	protected static void appendConformanceRuleIds(Association association, StringBuffer message, boolean markup) {
		String ruleIds = getConformanceRuleIds(association);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	protected static void appendConformanceRuleIds(Element element, StringBuffer message, boolean markup) {
		String ruleIds = getConformanceRuleIds(element);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	protected static void appendConformanceRuleIds(Element element, Stereotype stereotype, StringBuffer message,
			boolean markup) {
		String ruleIds = getConformanceRuleIds(element, stereotype);
		if (ruleIds.length() > 0) {
			message.append(" (");
			message.append(ruleIds);
			message.append(")");
		}
	}

	/**
	 * Returns a comma separated list of conformance rule IDs, or an empty string if no IDs.
	 */
	public static String getConformanceRuleIds(Property property) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.PROPERTY_VALIDATION);
		return getConformanceRuleIds(property, validationSupport);
	}

	/**
	 * Returns a comma separated list of conformance rule IDs, or an empty string if no IDs.
	 */
	public static String getTerminologyConformanceRuleIds(Property property) {
		Stereotype terminologyConstraint = getTerminologyConstraint(property);
		return getConformanceRuleIds(property, terminologyConstraint);
	}

	/**
	 * Returns a comma separated list of conformance rule IDs, or an empty string if no IDs.
	 */
	public static String getConformanceRuleIds(Association association) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(
			association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
		return getConformanceRuleIds(association, validationSupport);
	}

	/**
	 * Returns a comma separated list of conformance rule IDs, or an empty string if no IDs.
	 */
	public static String getConformanceRuleIds(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		return getConformanceRuleIds(element, validationSupport);
	}

	public static String getConformanceRuleIds(Element element, Stereotype validationSupport) {
		StringBuffer ruleIdDisplay = new StringBuffer();
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

	public static Stereotype getTerminologyConstraint(Element element) {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			element, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		if (stereotype == null) {
			stereotype = CDAProfileUtil.getAppliedCDAStereotype(element, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		}
		if (stereotype == null) {
			stereotype = CDAProfileUtil.getAppliedCDAStereotype(element, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		}

		return stereotype;
	}

	public static boolean hasValidationSupport(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		return validationSupport != null;
	}

	/**
	 * @deprecated Use {@link #getValidationSeverity(Property, String)} to get the severity for a specific validation stereotype.
	 *             If necessary, this can be the abstract {@link ICDAProfileConstants#VALIDATION Validation} stereotype to get any available
	 *             validation severity.
	 */
	@Deprecated
	public static String getValidationSeverity(Property property) {
		return getValidationSeverity(property, ICDAProfileConstants.PROPERTY_VALIDATION);
	}

	public static String getValidationSeverity(Property property, String validationStereotypeName) {
		Stereotype validationStereotype = CDAProfileUtil.getAppliedCDAStereotype(property, validationStereotypeName);
		return getValidationSeverity(property, validationStereotype);
	}

	public static String getValidationSeverity(Element element) {
		// use first available validation stereotype
		return getValidationSeverity(element, ICDAProfileConstants.VALIDATION);
	}

	public static String getValidationSeverity(Element element, String validationStereotypeName) {
		Stereotype validationStereotype = CDAProfileUtil.getAppliedCDAStereotype(element, validationStereotypeName);
		return getValidationSeverity(element, validationStereotype);
	}

	public static String getValidationSeverity(Element element, Stereotype validationStereotype) {
		String severity = null;

		if ((validationStereotype != null) && CDAProfileUtil.isValidationStereotype(validationStereotype)) {
			Object value = element.getValue(validationStereotype, ICDAProfileConstants.VALIDATION_SEVERITY);
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				severity = ((Enumerator) value).getName();
			}
		}

		return severity;
	}

	/**
	 * Get the value of the Negation Indicator, for the given element or return false
	 * 
	 * @param element
	 *            the element to check
	 * @param validationStereotype
	 *            the applied stereotype
	 * 
	 * @return true if the Negation indicator exists and is set to true, false for all other circumstances
	 */
	public static Boolean getValidationNegation(Element element, Stereotype validationStereotype) {
		Boolean negation = false;

		if ((validationStereotype != null) && CDAProfileUtil.isValidationStereotype(validationStereotype)) {

			Object value = element.getValue(validationStereotype, ICDAProfileConstants.VALIDATION_NEGATION_INDICATOR);
			if (value instanceof Boolean) {
				negation = (Boolean) value;
			}

		}

		return negation;
	}

	public static String getValidationKeywordWithPropertyRange(Property property) {
		String keyword = getValidationKeyword(property);
		return addShallNot(keyword, property);
	}

	public static String getValidationKeyword(Property property) {
		String severity = getValidationSeverity(property, ICDAProfileConstants.PROPERTY_VALIDATION);
		Stereotype validationStereotype = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.PROPERTY_VALIDATION);

		// check if the severity has been negated, as in SHOULD NOT
		boolean isNegated = getValidationNegation(property, validationStereotype);

		if (severity == null) {
			// get other validation stereotype, usually for terminology
			severity = getValidationSeverity((Element) property);
		}

		String keyword = getValidationKeyword(severity);
		if (isNegated) {
			keyword += " NOT";
		}

		return keyword;
	}

	public static String getValidationKeywordWithPropertyRange(Element element, Property property) {
		// use first available validation stereotype
		String keyword = getValidationKeyword(element);
		keyword = addShallNot(keyword, property);
		return keyword;
	}

	private static String addShallNot(String keyword, Property property) {
		if (property.getLower() == 0 && property.getUpper() == 0 && ("SHALL".equals(keyword))) {
			keyword += " NOT";
		}
		return keyword;
	}

	public static String getValidationKeyword(Element element) {
		// use first available validation stereotype
		String severity = getValidationSeverity(element);

		return getValidationKeyword(severity);
	}

	public static String getValidationKeyword(Element element, Stereotype validationStereotype) {
		String severity = getValidationSeverity(element, validationStereotype);
		return getValidationKeyword(severity);
	}

	private static String getValidationKeyword(String severity) {
		String keyword = null;
		if (SEVERITY_INFO.equals(severity)) {
			keyword = "MAY";
		} else if (SEVERITY_WARNING.equals(severity)) {
			keyword = "SHOULD";
		} else if (SEVERITY_ERROR.equals(severity)) {
			keyword = "SHALL";
		}

		return keyword;
	}

	public static void setValidationMessage(Element constrainedElement, String message) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(
			constrainedElement, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			constrainedElement.setValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE, message);
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

	public static String normalizeCodeName(String name) {
		String result = "";
		String[] parts = name.split(" ");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		result = UML2Util.getValidJavaIdentifier(result);
		return result;
	}

	private static String mandatoryOrNotMessage(Property curProperty) {
		// capture if allows nullFlavor or not
		boolean mandatory = CDAProfileUtil.isMandatory(curProperty);
		// mandatory implies nullFlavor is NOT allowed ", where the @code "
		// non-mandatory implies nullFlavor is allowed ", which "
		// return the proper message based on mandatory or not
		return mandatory
				? ", where the @code "
				: ", which ";
	}

	public static boolean isInlineClass(Class _class) {
		Inline inline = CDAProfileUtil.getInline(_class);

		if (inline != null) {
			return true;
		}

		if (_class.getOwner() instanceof Class) {
			return true;
		}

		for (Comment comment : _class.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE")) {
				return true;
			}
		}

		return false;

	}

	public static String getInlineFilter(Class inlineClass) {

		Inline inline = CDAProfileUtil.getInline(inlineClass);

		if (inline != null) {
			return inline.getFilter() != null
					? inline.getFilter()
					: "";

		}

		String filter = "";
		for (Comment comment : inlineClass.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE&")) {
				String[] temp = comment.getBody().split("&");
				if (temp.length == 2) {
					filter = String.format("->select(%s)", temp[1]);
				}
				break;
			}
		}

		if ("".equals(filter)) {
			// search hierarchy
			for (Classifier next : inlineClass.getGenerals()) {
				if (next instanceof Class) {
					filter = getInlineFilter((Class) next);
					if (!"".equals(filter)) {
						break;
					}
				}
			}
		}

		return filter;
	}

	public static boolean isPublishSeperately(Class _class) {

		boolean publish = false;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(_class, ICDAProfileConstants.INLINE);

		if (stereotype != null) {
			Boolean result = (Boolean) _class.getValue(stereotype, "publishSeperately");
			publish = result.booleanValue();
		}

		return publish;

	}

}
