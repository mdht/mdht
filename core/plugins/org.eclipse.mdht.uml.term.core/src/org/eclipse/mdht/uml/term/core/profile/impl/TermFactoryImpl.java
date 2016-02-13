/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.CD;
import org.eclipse.mdht.uml.term.core.profile.CR;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomain;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.eclipse.mdht.uml.term.core.profile.StatusKind;
import org.eclipse.mdht.uml.term.core.profile.TermFactory;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.UsageContext;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.eclipse.mdht.uml.term.core.profile.ValueSetType;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TermFactoryImpl extends EFactoryImpl implements TermFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermPackage getPackage() {
		return TermPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static TermFactory init() {
		try {
			TermFactory theTermFactory = (TermFactory) EPackage.Registry.INSTANCE.getEFactory(TermPackage.eNS_URI);
			if (theTermFactory != null) {
				return theTermFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TermFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertBindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TermPackage.BINDING_KIND:
				return convertBindingKindToString(eDataType, instanceValue);
			case TermPackage.VALUE_SET_TYPE:
				return convertValueSetTypeToString(eDataType, instanceValue);
			case TermPackage.STATUS_KIND:
				return convertStatusKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertValueSetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TermPackage.CD:
				return createCD();
			case TermPackage.CR:
				return createCR();
			case TermPackage.CONCEPT_DOMAIN_CONSTRAINT:
				return createConceptDomainConstraint();
			case TermPackage.CONCEPT_DOMAIN:
				return createConceptDomain();
			case TermPackage.CODE_SYSTEM_CONSTRAINT:
				return createCodeSystemConstraint();
			case TermPackage.CODE_SYSTEM_VERSION:
				return createCodeSystemVersion();
			case TermPackage.VALUE_SET_CONSTRAINT:
				return createValueSetConstraint();
			case TermPackage.VALUE_SET_VERSION:
				return createValueSetVersion();
			case TermPackage.VALUE_SET_CODE:
				return createValueSetCode();
			case TermPackage.VALUE_SET_CONTEXT_BINDING:
				return createValueSetContextBinding();
			case TermPackage.USAGE_CONTEXT:
				return createUsageContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BindingKind createBindingKindFromString(EDataType eDataType, String initialValue) {
		BindingKind result = BindingKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CD createCD() {
		CDImpl cd = new CDImpl();
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CodeSystemConstraint createCodeSystemConstraint() {
		CodeSystemConstraintImpl codeSystemConstraint = new CodeSystemConstraintImpl();
		return codeSystemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CodeSystemVersion createCodeSystemVersion() {
		CodeSystemVersionImpl codeSystemVersion = new CodeSystemVersionImpl();
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ConceptDomain createConceptDomain() {
		ConceptDomainImpl conceptDomain = new ConceptDomainImpl();
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ConceptDomainConstraint createConceptDomainConstraint() {
		ConceptDomainConstraintImpl conceptDomainConstraint = new ConceptDomainConstraintImpl();
		return conceptDomainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CR createCR() {
		CRImpl cr = new CRImpl();
		return cr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TermPackage.BINDING_KIND:
				return createBindingKindFromString(eDataType, initialValue);
			case TermPackage.VALUE_SET_TYPE:
				return createValueSetTypeFromString(eDataType, initialValue);
			case TermPackage.STATUS_KIND:
				return createStatusKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public StatusKind createStatusKindFromString(EDataType eDataType, String initialValue) {
		StatusKind result = StatusKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetCode createValueSetCode() {
		ValueSetCodeImpl valueSetCode = new ValueSetCodeImpl();
		return valueSetCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetConstraint createValueSetConstraint() {
		ValueSetConstraintImpl valueSetConstraint = new ValueSetConstraintImpl();
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetContextBinding createValueSetContextBinding() {
		ValueSetContextBindingImpl valueSetContextBinding = new ValueSetContextBindingImpl();
		return valueSetContextBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetType createValueSetTypeFromString(EDataType eDataType, String initialValue) {
		ValueSetType result = ValueSetType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetVersion createValueSetVersion() {
		ValueSetVersionImpl valueSetVersion = new ValueSetVersionImpl();
		return valueSetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TermPackage getTermPackage() {
		return (TermPackage) getEPackage();
	}

} // TermFactoryImpl
