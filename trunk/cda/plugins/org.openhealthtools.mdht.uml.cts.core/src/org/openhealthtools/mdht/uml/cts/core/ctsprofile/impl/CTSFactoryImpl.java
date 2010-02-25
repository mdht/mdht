/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cts.core.ctsprofile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CTSFactoryImpl extends EFactoryImpl implements CTSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CTSFactory init() {
		try {
			CTSFactory theCTSFactory = (CTSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/schemas/cts/1"); 
			if (theCTSFactory != null) {
				return theCTSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CTSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CTSPackage.CD: return createCD();
			case CTSPackage.CR: return createCR();
			case CTSPackage.CONCEPT_DOMAIN_CONSTRAINT: return createConceptDomainConstraint();
			case CTSPackage.CONCEPT_DOMAIN: return createConceptDomain();
			case CTSPackage.CODE_SYSTEM_CONSTRAINT: return createCodeSystemConstraint();
			case CTSPackage.CODE_SYSTEM_VERSION: return createCodeSystemVersion();
			case CTSPackage.VALUE_SET_CONSTRAINT: return createValueSetConstraint();
			case CTSPackage.VALUE_SET_VERSION: return createValueSetVersion();
			case CTSPackage.VALUE_SET_CODE: return createValueSetCode();
			case CTSPackage.VALUE_SET_CONTEXT_BINDING: return createValueSetContextBinding();
			case CTSPackage.USAGE_CONTEXT: return createUsageContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CTSPackage.BINDING_KIND:
				return createBindingKindFromString(eDataType, initialValue);
			case CTSPackage.VALUE_SET_TYPE:
				return createValueSetTypeFromString(eDataType, initialValue);
			case CTSPackage.STATUS_KIND:
				return createStatusKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CTSPackage.BINDING_KIND:
				return convertBindingKindToString(eDataType, instanceValue);
			case CTSPackage.VALUE_SET_TYPE:
				return convertValueSetTypeToString(eDataType, instanceValue);
			case CTSPackage.STATUS_KIND:
				return convertStatusKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD createCD() {
		CDImpl cd = new CDImpl();
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CR createCR() {
		CRImpl cr = new CRImpl();
		return cr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainConstraint createConceptDomainConstraint() {
		ConceptDomainConstraintImpl conceptDomainConstraint = new ConceptDomainConstraintImpl();
		return conceptDomainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomain createConceptDomain() {
		ConceptDomainImpl conceptDomain = new ConceptDomainImpl();
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConstraint createCodeSystemConstraint() {
		CodeSystemConstraintImpl codeSystemConstraint = new CodeSystemConstraintImpl();
		return codeSystemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersion createCodeSystemVersion() {
		CodeSystemVersionImpl codeSystemVersion = new CodeSystemVersionImpl();
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConstraint createValueSetConstraint() {
		ValueSetConstraintImpl valueSetConstraint = new ValueSetConstraintImpl();
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetVersion createValueSetVersion() {
		ValueSetVersionImpl valueSetVersion = new ValueSetVersionImpl();
		return valueSetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCode createValueSetCode() {
		ValueSetCodeImpl valueSetCode = new ValueSetCodeImpl();
		return valueSetCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContextBinding createValueSetContextBinding() {
		ValueSetContextBindingImpl valueSetContextBinding = new ValueSetContextBindingImpl();
		return valueSetContextBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind createBindingKindFromString(EDataType eDataType, String initialValue) {
		BindingKind result = BindingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetType createValueSetTypeFromString(EDataType eDataType, String initialValue) {
		ValueSetType result = ValueSetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueSetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusKind createStatusKindFromString(EDataType eDataType, String initialValue) {
		StatusKind result = StatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTSPackage getCTSPackage() {
		return (CTSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CTSPackage getPackage() {
		return CTSPackage.eINSTANCE;
	}

} //CTSFactoryImpl
