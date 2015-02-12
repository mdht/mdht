/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.openhealthtools.mdht.uml.validation.internal.impl;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.validation.IValidationContext;

import org.eclipse.uml2.uml.UMLPackage;

import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
import org.openhealthtools.mdht.uml.validation.Diagnostic;
import org.openhealthtools.mdht.uml.validation.EvaluationModeKind;
import org.openhealthtools.mdht.uml.validation.SeverityKind;
import org.openhealthtools.mdht.uml.validation.ValidationFactory;
import org.openhealthtools.mdht.uml.validation.ValidationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValidationPackageImpl extends EPackageImpl implements ValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass diagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass constraintProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum evaluationModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum severityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType statusEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType validationContextEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.validation.ValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationPackageImpl() {
		super(eNS_URI, ValidationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ValidationPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationPackage init() {
		if (isInited) {
			return (ValidationPackage) EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		}

		// Obtain or create and register package
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValidationPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ValidationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theValidationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationPackage.eNS_URI, theValidationPackage);
		return theValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDiagnostic() {
		return diagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDiagnostic_Base_Constraint() {
		return (EReference) diagnosticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnostic_EvaluationMode() {
		return (EAttribute) diagnosticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnostic_Severity() {
		return (EAttribute) diagnosticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnostic_Code() {
		return (EAttribute) diagnosticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnostic_Message() {
		return (EAttribute) diagnosticEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConstraintProvider() {
		return constraintProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getConstraintProvider_Base_Namespace() {
		return (EReference) constraintProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintProvider_DiagnosticSource() {
		return (EAttribute) constraintProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintProvider_CategoryID() {
		return (EAttribute) constraintProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintProvider_CategoryName() {
		return (EAttribute) constraintProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintProvider_ParentCategoryID() {
		return (EAttribute) constraintProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintProvider_BundleName() {
		return (EAttribute) constraintProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getEvaluationModeKind() {
		return evaluationModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getSeverityKind() {
		return severityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getStatus() {
		return statusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getValidationContext() {
		return validationContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationFactory getValidationFactory() {
		return (ValidationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		diagnosticEClass = createEClass(DIAGNOSTIC);
		createEReference(diagnosticEClass, DIAGNOSTIC__BASE_CONSTRAINT);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__EVALUATION_MODE);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__SEVERITY);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__CODE);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__MESSAGE);

		constraintProviderEClass = createEClass(CONSTRAINT_PROVIDER);
		createEReference(constraintProviderEClass, CONSTRAINT_PROVIDER__BASE_NAMESPACE);
		createEAttribute(constraintProviderEClass, CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE);
		createEAttribute(constraintProviderEClass, CONSTRAINT_PROVIDER__CATEGORY_ID);
		createEAttribute(constraintProviderEClass, CONSTRAINT_PROVIDER__CATEGORY_NAME);
		createEAttribute(constraintProviderEClass, CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID);
		createEAttribute(constraintProviderEClass, CONSTRAINT_PROVIDER__BUNDLE_NAME);

		// Create enums
		evaluationModeKindEEnum = createEEnum(EVALUATION_MODE_KIND);
		severityKindEEnum = createEEnum(SEVERITY_KIND);

		// Create data types
		statusEDataType = createEDataType(STATUS);
		validationContextEDataType = createEDataType(VALIDATION_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(
			diagnosticEClass, Diagnostic.class, "Diagnostic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
			getDiagnostic_Base_Constraint(),
			theUMLPackage.getConstraint(),
			null,
			"base_Constraint", null, 1, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getDiagnostic_EvaluationMode(),
			this.getEvaluationModeKind(),
			"evaluationMode", "batch", 1, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
			getDiagnostic_Severity(),
			this.getSeverityKind(),
			"severity", "error", 1, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
			getDiagnostic_Code(),
			ecorePackage.getEInt(),
			"code", "-1", 0, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
			getDiagnostic_Message(),
			ecorePackage.getEString(),
			"message", null, 1, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(diagnosticEClass, this.getStatus(), "fail", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getValidationContext(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagnosticEClass, this.getStatus(), "fail", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getValidationContext(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "related", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(diagnosticEClass, theEcorePackage.getEClass(), "getTargets", 1, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagnosticEClass, ecorePackage.getEBoolean(), "targets", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "object", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(
			diagnosticEClass, this.getConstraintProvider(), "getConstraintProvider", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(
			constraintProviderEClass, ConstraintProvider.class,
			"ConstraintProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
			getConstraintProvider_Base_Namespace(),
			theUMLPackage.getNamespace(),
			null,
			"base_Namespace", null, 1, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getConstraintProvider_DiagnosticSource(),
			ecorePackage.getEString(),
			"diagnosticSource", null, 0, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getConstraintProvider_CategoryID(),
			ecorePackage.getEString(),
			"categoryID", null, 0, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getConstraintProvider_CategoryName(),
			ecorePackage.getEString(),
			"categoryName", null, 0, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getConstraintProvider_ParentCategoryID(),
			ecorePackage.getEString(),
			"parentCategoryID", null, 0, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
			getConstraintProvider_BundleName(),
			ecorePackage.getEString(),
			"bundleName", null, 0, 1, ConstraintProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(constraintProviderEClass, this.getDiagnostic(), "getDiagnostics", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(evaluationModeKindEEnum, EvaluationModeKind.class, "EvaluationModeKind"); //$NON-NLS-1$
		addEEnumLiteral(evaluationModeKindEEnum, EvaluationModeKind.BATCH);
		addEEnumLiteral(evaluationModeKindEEnum, EvaluationModeKind.LIVE);

		initEEnum(severityKindEEnum, SeverityKind.class, "SeverityKind"); //$NON-NLS-1$
		addEEnumLiteral(severityKindEEnum, SeverityKind.INFORMATIONAL);
		addEEnumLiteral(severityKindEEnum, SeverityKind.WARNING);
		addEEnumLiteral(severityKindEEnum, SeverityKind.ERROR);

		// Initialize data types
		initEDataType(statusEDataType, IStatus.class, "Status", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(
			validationContextEDataType, IValidationContext.class,
			"ValidationContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} // ValidationPackageImpl
