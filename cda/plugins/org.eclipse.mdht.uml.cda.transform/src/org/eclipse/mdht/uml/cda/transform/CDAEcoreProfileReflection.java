/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.transform.ecore.AbstractEcoreProfileReflection;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * CDA implementation of the {@link IEcoreProfileReflection} protocol for UML-to-Ecore transformation support.
 */
public class CDAEcoreProfileReflection extends AbstractEcoreProfileReflection {

	public CDAEcoreProfileReflection() {
		super();
	}

	@SuppressWarnings("deprecation")
	public Stereotype getAppliedValidationStereotype(Element element, ValidationStereotypeKind kind) {
		String stereotypeName;

		switch (kind) {
			case ANY:
				stereotypeName = ICDAProfileConstants.VALIDATION;
				break;
			case ASSOCIATION:
				stereotypeName = ICDAProfileConstants.ASSOCIATION_VALIDATION;
				break;
			case CONFORMS_TO:
				stereotypeName = ICDAProfileConstants.CONFORMS_TO;
				break;
			case CONSTRAINT:
				stereotypeName = ICDAProfileConstants.CONSTRAINT_VALIDATION;
				break;
			case PROPERTY:
				stereotypeName = ICDAProfileConstants.PROPERTY_VALIDATION;
				break;
			case TEXT_VALUE:
				stereotypeName = ICDAProfileConstants.TEXT_VALUE;
				break;
			case NULL_FLAVOR:
				stereotypeName = ICDAProfileConstants.NULL_FLAVOR;
				break;
			case CODE_SYSTEM:
				stereotypeName = ITermProfileConstants.CODE_SYSTEM_CONSTRAINT;
				break;
			case VALUE_SET:
				stereotypeName = ITermProfileConstants.VALUE_SET_CONSTRAINT;
				break;
			case CONCEPT_DOMAIN:
				stereotypeName = ITermProfileConstants.CONCEPT_DOMAIN_CONSTRAINT;
				break;
			case VOCAB_SPECIFICATION:
				stereotypeName = ICDAProfileConstants.VOCAB_SPECIFICATION;
			default:
				stereotypeName = null;
				break;
		}

		return (stereotypeName == null)
				? null
				: CDAProfileUtil.getAppliedCDAStereotype(element, stereotypeName);
	}

	public boolean isMandatory(Element element) {
		return CDAProfileUtil.isMandatory(element);
	}

	public boolean inheritsConstraintName(Property property, Property redefinedProperty,
			ValidationStereotypeKind stereotypeKind) {

		return CDAModelUtil.getTemplateId(redefinedProperty.getClass_()) != null;
	}

	@Override
	protected String getValidationSeverityAttributeName() {
		return ICDAProfileConstants.VALIDATION_SEVERITY;
	}

	@Override
	protected String getValidationMessageAttributeName() {
		return ICDAProfileConstants.VALIDATION_MESSAGE;
	}

	@Override
	protected String getDefaultValidationMessage(Element element, Stereotype stereotype) {
		return CDAModelUtil.computeConformanceMessage(element, false);
	}

	public boolean isPrimaryEClass(Class class_) {
		return CDAModelUtil.getTemplateId(class_) != null && !(class_.getOwner() instanceof Class);
	}

	public String getModelPrefix(NamedElement element) {
		return CDAModelUtil.getModelPrefix(element);
	}

	public String getPrefixedSplitName(NamedElement element) {
		return CDAModelUtil.getPrefixedSplitName(element);
	}

	@Override
	protected String getAnnotationURI() {
		return ICDAProfileConstants.CDA_ANNOTATION_SOURCE;
	}

	public IEPackageDetails getEPackageDetails(Package package_) {
		IEPackageDetails result = null;

		Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(
			package_, ICDAProfileConstants.CODEGEN_SUPPORT);

		if (codegenSupport != null) {
			final String packageName = (String) package_.getValue(
				codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);
			final String nsURI = (String) package_.getValue(
				codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
			final String nsPrefix = (String) package_.getValue(
				codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_PREFIX);
			final String basePackage = (String) package_.getValue(
				codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);
			final String prefix = (String) package_.getValue(
				codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);

			result = new IEPackageDetails() {

				public String getPackageName() {
					return packageName;
				}

				public String getNamespaceURI() {
					return nsURI;
				}

				public String getNamespacePrefix() {
					return nsPrefix;
				}

				public String getGenBasePackage() {
					return basePackage;
				}

				public String getGenPrefix() {
					return prefix;
				}
			};
		}

		return result;
	}
}
