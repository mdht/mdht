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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.ITermProfileConstants;

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

	public static boolean isCDAType(Type templateClass, String typeName) {
		if (templateClass instanceof Class && typeName != null) {
			Class cdaClass = getCDAClass((Class)templateClass);
			if (cdaClass != null && typeName.equals(cdaClass.getName()))
				return true;
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
							umlClass.setValue(hl7Template, ICDAProfileConstants.VALIDATION_MESSAGE, message);
						}
					}
					else if (CDAModelUtil.getCDAClass(umlClass) == null) {
						// prune children of non-CDA classes, but include non-template subclasses
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

			String templateId = getTemplateId(general);
			if (templateId != null) {
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
		if (getTemplateId(property.getClass_()) != null) {
			return computeTemplateAssociationConformanceMessage(property, markup);
		}

		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();

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
		message.append(property.getName());
		message.append(markup?"</tt>":"");

		Class endType = (property.getType() instanceof Class) 
				? (Class)property.getType() : null;

		if (endType != null) {
			message.append(", where its type is ");
			
			String prefix = !isSamePackage(property, endType) ? getModelPrefix(endType)+" " : "";
			String xref = computeXref(property, endType);
			boolean showXref = markup && (xref != null);
			String format = showXref && xref.endsWith(".html") ? "format=\"html\" " : "";
			
			message.append(showXref ? "<xref " + format + "href=\"" + xref + "\">" : "");
			message.append(prefix).append(UMLUtil.splitName(endType));
			message.append(showXref?"</xref>":"");
		}
		
		return message.toString();
	}

	private static String computeTemplateAssociationConformanceMessage(Property property, boolean markup) {
		StringBuffer message = new StringBuffer();
		Association association = property.getAssociation();
		Stereotype entryStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY);
		Stereotype entryRelationshipStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY_RELATIONSHIP);

		String typeCode = null;
		String typeCodeDisplay = null;
		if (entryStereotype != null) {
			typeCode = getLiteralValue(association, entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE);
			Enumeration profileEnum = (Enumeration) entryStereotype.getProfile().getOwnedType(ICDAProfileConstants.ENTRY_KIND);
			typeCodeDisplay = getLiteralValueLabel(association, entryStereotype, ICDAProfileConstants.ENTRY_TYPE_CODE, profileEnum);
		}
		else if (entryRelationshipStereotype != null) {
			typeCode = getLiteralValue(association, entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			Enumeration profileEnum = (Enumeration) entryRelationshipStereotype.getProfile().getOwnedType(ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
			typeCodeDisplay = getLiteralValueLabel(association, entryRelationshipStereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE, profileEnum);
		}

		//TODO this is incomplete determination of XML element name
		String elementName = "component";
		Class cdaSourceClass = getCDAClass(property.getClass_());
		if (cdaSourceClass == null) {
			elementName = property.getName();
		} else if ("ClinicalDocument".equals(cdaSourceClass.getName())) {
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
		Stereotype textValue = CDAProfileUtil.getAppliedCDAStereotype(property, 
				ICDAProfileConstants.TEXT_VALUE);

		if (nullFlavorSpecification != null) {
			String nullFlavor = getLiteralValue(property, nullFlavorSpecification, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);
			Enumeration profileEnum = (Enumeration) nullFlavorSpecification.getProfile().getOwnedType(ICDAProfileConstants.NULL_FLAVOR_KIND);
			String nullFlavorLabel = getLiteralValueLabel(property, nullFlavorSpecification, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR, profileEnum);
			
			if (nullFlavor != null) {
				message.append(markup?"<tt>":"");
				message.append("/@nullFlavor");
				message.append(markup?"</tt>":"");

				message.append(" = \"").append(nullFlavor).append("\" ");
				message.append(markup?"<i>":"");
				message.append(nullFlavorLabel);
				message.append(markup?"</i>":"");
			}
		}
		if (textValue != null) {
			String value = (String) property.getValue(textValue, ICDAProfileConstants.TEXT_VALUE_VALUE);

			if (value != null && value.length() > 0) {
				message.append(" = \"").append(value).append("\"");
			}
		}

//		Stereotype conceptDomainConstraint = CDAProfileUtil.getAppliedCDAStereotype(
//				property, ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		Stereotype codeSystemConstraint = CDAProfileUtil.getAppliedCDAStereotype(
				property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSetConstraint = CDAProfileUtil.getAppliedCDAStereotype(
				property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);

		if (codeSystemConstraint != null) {
			String vocab = computeCodeSystemMessage(property, markup);
			message.append(vocab);
		}
		else if (valueSetConstraint != null) {
			String vocab = computeValueSetMessage(property, markup);
			message.append(vocab);
		}
		else if (vocabSpecification != null) {
			String vocab = computeVocabSpecificationMessage(property, markup);
			message.append(vocab);
		}

		List<Property> redefinedProperties = UMLUtil.getRedefinedProperties(property);
		Property redefinedProperty = redefinedProperties.isEmpty() ? null : redefinedProperties.get(0);
		
		if (redefinedProperty == null || (!isXMLAttribute(property)
				&& (property.getType() != redefinedProperty.getType()))) {
			message.append(", where its data type is ").append(property.getType().getName());
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
				name = codeSystemVersion.getBase_Enumeration().getName();
				version = codeSystemVersion.getVersion();
			}
			else {
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
			message.append(markup?"<tt>":"");
			message.append("/@code");
			message.append(markup?"</tt>":"");

			message.append(" = \"").append(code).append("\" ");
		}
			
		if (displayName != null) {
			message.append(markup?"<i>":"");
			message.append(displayName);
			message.append(markup?"</i>":"");
		}

		if (id !=null || name != null) {
			message.append(" (CodeSystem:");
			if (id != null) {
				message.append(" ").append(id);
			}
			if (name != null) {
				message.append(" ").append(name);
			}
			message.append(" ").append(binding.getName().toUpperCase());
			if (version != null) {
				message.append(" ").append(version);
			}
			message.append(")");
		}
		
		return message.toString();
	}

	private static String computeValueSetMessage(Property property, boolean markup) {
		Stereotype valueSetConstraintStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				property, ITermProfileConstants.VALUE_SET_CONSTRAINT);
		ValueSetConstraint valueSetConstraint = (ValueSetConstraint) property.getStereotypeApplication(valueSetConstraintStereotype);

		String keyword = getValidationKeyword(property);
		String id = null;
		String name = null;
		String version = null;
		BindingKind binding = null;
		if (valueSetConstraint != null) {
			if (valueSetConstraint.getReference() != null) {
				ValueSetVersion valueSetVersion = valueSetConstraint.getReference();
				id = valueSetVersion.getIdentifier();
				name = valueSetVersion.getBase_Enumeration().getName();
				version = valueSetVersion.getVersion();
				binding = valueSetVersion.getBinding();
			}
			else {
				id = valueSetConstraint.getIdentifier();
				name = valueSetConstraint.getName();
				version = valueSetConstraint.getVersion();
				binding = valueSetConstraint.getBinding();
			}
		}

		StringBuffer message = new StringBuffer();
		message.append(", which ");
		message.append(markup?"<b>":"");
		message.append(keyword);
		message.append(markup?"</b>":"");
		message.append(" be selected from ValueSet");

		if (id != null) {
			message.append(" ").append(id);
		}
		if (name != null) {
			message.append(" ").append(name);
		}

		message.append(" ").append(binding.getName().toUpperCase());
		if (version != null) {
			message.append(" ").append(version);
		}
		
		return message.toString();
	}
	
	private static String computeVocabSpecificationMessage(Property property, boolean markup) {
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		
		StringBuffer message = new StringBuffer();
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
			String keyword = getValidationKeyword(property);
			
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
			//TODO get this from preference setting or parameter
			String infocenterURL = "http://www.cdatools.org/infocenter";
			
			String pathFolder = "classes";
			String basePackage = "";
			String prefix = "";
			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.doc/classes/Act.html
			// http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.cda.ccd.doc/classes/ProblemAct.html
			
			if (! CDA_PACKAGE_NAME.equals(target.getNearestPackage().getName())) {
				basePackage = getModelBasePackage(target);
				prefix = getModelNamespacePrefix(target);
			}
			if (basePackage == null || basePackage.trim().length() == 0) {
				basePackage = "org.openhealthtools.mdht.cda";
			}
			if (prefix != null && prefix.trim().length() > 0) {
				prefix += ".";
			}
			
			href = infocenterURL + "/topic/" + basePackage + "."
				+ prefix + "doc/" + pathFolder + "/" + target.getName() + ".html";
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

	public static String getModelBasePackage(NamedElement element) {
		String basePackage = null;
		Package model = UMLUtil.getTopPackage(element);
		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(model, ICDAProfileConstants.CODEGEN_SUPPORT);
		if (codegenSupport != null) {
			basePackage = (String) model.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
		}
		
		return basePackage;
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
			Object value = element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = null;
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral)value).getName();
			}
			else if (value instanceof Enumerator) {
				severity = ((Enumerator)value).getName();
			}
			
			return (severity != null) ? severity : SEVERITY_ERROR;
		}
		
		return null;
	}

	public static String getValidationKeyword(Element element) {
		String severity = getValidationSeverity(element);
		if (severity != null) {
			if (SEVERITY_INFO.equals(severity))
				return "MAY";
			if (SEVERITY_WARNING.equals(severity))
				return "SHOULD";
			else
				return "SHALL";
		}
		
		if (element instanceof Association) {
			for (Property end : ((Association)element).getMemberEnds()) {
				if (end.isNavigable()) {
					element = end;
					break;
				}
			}
		}
		
		if (element instanceof MultiplicityElement) {
			if (((MultiplicityElement)element).getLower() == 0)
				return "MAY";
			else
				return "SHALL";
		}
		else {
			return "SHALL";
		}
	}

	public static void setValidationMessage(Element constrainedElement, String message) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(constrainedElement, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			constrainedElement.setValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE, message);
		}
	}
	
	protected static String getLiteralValue(Element element, Stereotype stereotype, String propertyName) {
		Object value = element.getValue(stereotype, propertyName);
		String name = null;
		if (value instanceof EnumerationLiteral) {
			name = ((EnumerationLiteral)value).getName();
		}
		else if (value instanceof Enumerator) {
			name = ((Enumerator)value).getName();
		}
		
		return name;
	}

	protected static String getLiteralValueLabel(Element element, Stereotype stereotype, String propertyName, Enumeration umlEnumeration) {
		Object value = element.getValue(stereotype, propertyName);
		String name = null;
		if (value instanceof EnumerationLiteral) {
			name = ((EnumerationLiteral)value).getLabel();
		}
		else if (value instanceof Enumerator) {
			name = ((Enumerator)value).getName();
			
			if (umlEnumeration != null) {
				name = umlEnumeration.getOwnedLiteral(name).getLabel();
			}
		}
		
		return name;
	}

}
