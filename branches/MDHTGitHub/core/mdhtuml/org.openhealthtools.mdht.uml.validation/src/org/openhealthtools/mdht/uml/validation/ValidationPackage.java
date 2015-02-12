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
package org.openhealthtools.mdht.uml.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "validation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/schema/profile/validation/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "validation"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValidationPackage eINSTANCE = org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl <em>Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getDiagnostic()
	 * @generated
	 */
	int DIAGNOSTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__BASE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__EVALUATION_MODE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__CODE = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__MESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.validation.internal.impl.ConstraintProviderImpl <em>Constraint Provider</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ConstraintProviderImpl
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getConstraintProvider()
	 * @generated
	 */
	int CONSTRAINT_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__BASE_NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Diagnostic Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__CATEGORY_ID = 2;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__CATEGORY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Parent Category ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID = 4;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER__BUNDLE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Constraint Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_PROVIDER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.validation.EvaluationModeKind <em>Evaluation Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.validation.EvaluationModeKind
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getEvaluationModeKind()
	 * @generated
	 */
	int EVALUATION_MODE_KIND = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.validation.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.validation.SeverityKind
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 3;

	/**
	 * The meta object id for the '<em>Status</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.IStatus
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.validation.IValidationContext
	 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getValidationContext()
	 * @generated
	 */
	int VALIDATION_CONTEXT = 5;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.validation.Diagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Diagnostic</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic
	 * @generated
	 */
	EClass getDiagnostic();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getBase_Constraint
	 * <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic#getBase_Constraint()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EReference getDiagnostic_Base_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getEvaluationMode
	 * <em>Evaluation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Evaluation Mode</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic#getEvaluationMode()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_EvaluationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic#getSeverity()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic#getCode()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.Diagnostic#getMessage()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_Message();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider <em>Constraint Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constraint Provider</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider
	 * @generated
	 */
	EClass getConstraintProvider();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getBase_Namespace
	 * <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getBase_Namespace()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EReference getConstraintProvider_Base_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getDiagnosticSource
	 * <em>Diagnostic Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Diagnostic Source</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getDiagnosticSource()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EAttribute getConstraintProvider_DiagnosticSource();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getCategoryID
	 * <em>Category ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Category ID</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getCategoryID()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EAttribute getConstraintProvider_CategoryID();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getCategoryName
	 * <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getCategoryName()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EAttribute getConstraintProvider_CategoryName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getParentCategoryID
	 * <em>Parent Category ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Parent Category ID</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getParentCategoryID()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EAttribute getConstraintProvider_ParentCategoryID();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getBundleName
	 * <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bundle Name</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.ConstraintProvider#getBundleName()
	 * @see #getConstraintProvider()
	 * @generated
	 */
	EAttribute getConstraintProvider_BundleName();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.validation.EvaluationModeKind <em>Evaluation Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Evaluation Mode Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.EvaluationModeKind
	 * @generated
	 */
	EEnum getEvaluationModeKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.validation.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.validation.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Status</em>'.
	 * @see org.eclipse.core.runtime.IStatus
	 * @model instanceClass="org.eclipse.core.runtime.IStatus"
	 * @generated
	 */
	EDataType getStatus();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.validation.IValidationContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.eclipse.emf.validation.IValidationContext
	 * @model instanceClass="org.eclipse.emf.validation.IValidationContext"
	 * @generated
	 */
	EDataType getValidationContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl <em>Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getDiagnostic()
		 * @generated
		 */
		EClass DIAGNOSTIC = eINSTANCE.getDiagnostic();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGNOSTIC__BASE_CONSTRAINT = eINSTANCE.getDiagnostic_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Evaluation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC__EVALUATION_MODE = eINSTANCE.getDiagnostic_EvaluationMode();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC__SEVERITY = eINSTANCE.getDiagnostic_Severity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC__CODE = eINSTANCE.getDiagnostic_Code();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC__MESSAGE = eINSTANCE.getDiagnostic_Message();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.validation.internal.impl.ConstraintProviderImpl
		 * <em>Constraint Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ConstraintProviderImpl
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getConstraintProvider()
		 * @generated
		 */
		EClass CONSTRAINT_PROVIDER = eINSTANCE.getConstraintProvider();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONSTRAINT_PROVIDER__BASE_NAMESPACE = eINSTANCE.getConstraintProvider_Base_Namespace();

		/**
		 * The meta object literal for the '<em><b>Diagnostic Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE = eINSTANCE.getConstraintProvider_DiagnosticSource();

		/**
		 * The meta object literal for the '<em><b>Category ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_PROVIDER__CATEGORY_ID = eINSTANCE.getConstraintProvider_CategoryID();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_PROVIDER__CATEGORY_NAME = eINSTANCE.getConstraintProvider_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Parent Category ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID = eINSTANCE.getConstraintProvider_ParentCategoryID();

		/**
		 * The meta object literal for the '<em><b>Bundle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_PROVIDER__BUNDLE_NAME = eINSTANCE.getConstraintProvider_BundleName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.validation.EvaluationModeKind <em>Evaluation Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.validation.EvaluationModeKind
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getEvaluationModeKind()
		 * @generated
		 */
		EEnum EVALUATION_MODE_KIND = eINSTANCE.getEvaluationModeKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.validation.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.validation.SeverityKind
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

		/**
		 * The meta object literal for the '<em>Status</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.IStatus
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getStatus()
		 * @generated
		 */
		EDataType STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.validation.IValidationContext
		 * @see org.openhealthtools.mdht.uml.validation.internal.impl.ValidationPackageImpl#getValidationContext()
		 * @generated
		 */
		EDataType VALIDATION_CONTEXT = eINSTANCE.getValidationContext();

	}

} // ValidationPackage
