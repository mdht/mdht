/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.openhealthtools.mdht.uml.term.core.profile.BindingKind;
import org.openhealthtools.mdht.uml.term.core.profile.TermFactory;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain;
import org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.StatusKind;
import org.openhealthtools.mdht.uml.term.core.profile.UsageContext;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetType;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermPackageImpl extends EPackageImpl implements TermPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetContextBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueSetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermPackageImpl() {
		super(eNS_URI, TermFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermPackage init() {
		if (isInited) return (TermPackage)EPackage.Registry.INSTANCE.getEPackage(TermPackage.eNS_URI);

		// Obtain or create and register package
		TermPackageImpl theTermPackage = (TermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TermPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTermPackage.createPackageContents();

		// Initialize created meta-data
		theTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTermPackage.freeze();

		return theTermPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCD() {
		return cdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_Qualifier() {
		return (EReference)cdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_Translation() {
		return (EReference)cdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_Code() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystem() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemName() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemVersion() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_DisplayName() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCR() {
		return crEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCR_Name() {
		return (EReference)crEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCR_Value() {
		return (EReference)crEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCR_Inverted() {
		return (EAttribute)crEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainConstraint() {
		return conceptDomainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomainConstraint_Reference() {
		return (EReference)conceptDomainConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomainConstraint_Identifier() {
		return (EAttribute)conceptDomainConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomainConstraint_Name() {
		return (EAttribute)conceptDomainConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomainConstraint_Base_Property() {
		return (EReference)conceptDomainConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomain() {
		return conceptDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_Identifier() {
		return (EAttribute)conceptDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_FullName() {
		return (EAttribute)conceptDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_Status() {
		return (EAttribute)conceptDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_StatusDate() {
		return (EAttribute)conceptDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_Base_Class() {
		return (EReference)conceptDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemConstraint() {
		return codeSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Reference() {
		return (EReference)codeSystemConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Identifier() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Name() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Version() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Binding() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Code() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_DisplayName() {
		return (EAttribute)codeSystemConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Qualifier() {
		return (EReference)codeSystemConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Base_Property() {
		return (EReference)codeSystemConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersion() {
		return codeSystemVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Identifier() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Version() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_FullName() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Source() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Url() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_EffectiveDate() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_ReleaseDate() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Status() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_StatusDate() {
		return (EAttribute)codeSystemVersionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersion_Base_Enumeration() {
		return (EReference)codeSystemVersionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConstraint_Reference() {
		return (EReference)valueSetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Identifier() {
		return (EAttribute)valueSetConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Name() {
		return (EAttribute)valueSetConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Version() {
		return (EAttribute)valueSetConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Binding() {
		return (EAttribute)valueSetConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConstraint_Base_Property() {
		return (EReference)valueSetConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetVersion() {
		return valueSetVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Identifier() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Version() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_FullName() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Source() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Url() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Definition() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_EffectiveDate() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_ExpirationDate() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_ReleaseDate() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_RevisionDate() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Status() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_StatusDate() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Type() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_Binding() {
		return (EAttribute)valueSetVersionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_CodeSystem() {
		return (EReference)valueSetVersionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_Base_Enumeration() {
		return (EReference)valueSetVersionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCode() {
		return valueSetCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetCode_ConceptName() {
		return (EAttribute)valueSetCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetCode_UsageNote() {
		return (EAttribute)valueSetCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCode_CodeSystem() {
		return (EReference)valueSetCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCode_Base_EnumerationLiteral() {
		return (EReference)valueSetCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetContextBinding() {
		return valueSetContextBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetContextBinding_EffectiveDate() {
		return (EAttribute)valueSetContextBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContextBinding_ConceptDomain() {
		return (EReference)valueSetContextBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContextBinding_ValueSet() {
		return (EReference)valueSetContextBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContextBinding_UsageContext() {
		return (EReference)valueSetContextBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContextBinding_Base_Class() {
		return (EReference)valueSetContextBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageContext() {
		return usageContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageContext_Identifier() {
		return (EAttribute)usageContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageContext_Status() {
		return (EAttribute)usageContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsageContext_StatusDate() {
		return (EAttribute)usageContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsageContext_Base_Class() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingKind() {
		return bindingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueSetType() {
		return valueSetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusKind() {
		return statusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermFactory getTermFactory() {
		return (TermFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cdEClass = createEClass(CD);
		createEReference(cdEClass, CD__QUALIFIER);
		createEReference(cdEClass, CD__TRANSLATION);
		createEAttribute(cdEClass, CD__CODE);
		createEAttribute(cdEClass, CD__CODE_SYSTEM);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_NAME);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_VERSION);
		createEAttribute(cdEClass, CD__DISPLAY_NAME);

		crEClass = createEClass(CR);
		createEReference(crEClass, CR__NAME);
		createEReference(crEClass, CR__VALUE);
		createEAttribute(crEClass, CR__INVERTED);

		conceptDomainConstraintEClass = createEClass(CONCEPT_DOMAIN_CONSTRAINT);
		createEReference(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__REFERENCE);
		createEAttribute(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER);
		createEAttribute(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__NAME);
		createEReference(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY);

		conceptDomainEClass = createEClass(CONCEPT_DOMAIN);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__IDENTIFIER);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__FULL_NAME);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__STATUS);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__STATUS_DATE);
		createEReference(conceptDomainEClass, CONCEPT_DOMAIN__BASE_CLASS);

		codeSystemConstraintEClass = createEClass(CODE_SYSTEM_CONSTRAINT);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__REFERENCE);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__IDENTIFIER);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__NAME);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__VERSION);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__BINDING);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__CODE);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__QUALIFIER);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY);

		codeSystemVersionEClass = createEClass(CODE_SYSTEM_VERSION);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__IDENTIFIER);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__VERSION);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__FULL_NAME);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__SOURCE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__URL);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__EFFECTIVE_DATE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__RELEASE_DATE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__STATUS);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__STATUS_DATE);
		createEReference(codeSystemVersionEClass, CODE_SYSTEM_VERSION__BASE_ENUMERATION);

		valueSetConstraintEClass = createEClass(VALUE_SET_CONSTRAINT);
		createEReference(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__REFERENCE);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__IDENTIFIER);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__NAME);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__VERSION);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__BINDING);
		createEReference(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__BASE_PROPERTY);

		valueSetVersionEClass = createEClass(VALUE_SET_VERSION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__IDENTIFIER);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__VERSION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__FULL_NAME);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__SOURCE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__URL);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__DEFINITION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__EFFECTIVE_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__EXPIRATION_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__RELEASE_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__REVISION_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__STATUS);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__STATUS_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__TYPE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__BINDING);
		createEReference(valueSetVersionEClass, VALUE_SET_VERSION__CODE_SYSTEM);
		createEReference(valueSetVersionEClass, VALUE_SET_VERSION__BASE_ENUMERATION);

		valueSetCodeEClass = createEClass(VALUE_SET_CODE);
		createEAttribute(valueSetCodeEClass, VALUE_SET_CODE__CONCEPT_NAME);
		createEAttribute(valueSetCodeEClass, VALUE_SET_CODE__USAGE_NOTE);
		createEReference(valueSetCodeEClass, VALUE_SET_CODE__CODE_SYSTEM);
		createEReference(valueSetCodeEClass, VALUE_SET_CODE__BASE_ENUMERATION_LITERAL);

		valueSetContextBindingEClass = createEClass(VALUE_SET_CONTEXT_BINDING);
		createEAttribute(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__VALUE_SET);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__BASE_CLASS);

		usageContextEClass = createEClass(USAGE_CONTEXT);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__IDENTIFIER);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__STATUS);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__STATUS_DATE);
		createEReference(usageContextEClass, USAGE_CONTEXT__BASE_CLASS);

		// Create enums
		bindingKindEEnum = createEEnum(BINDING_KIND);
		valueSetTypeEEnum = createEEnum(VALUE_SET_TYPE);
		statusKindEEnum = createEEnum(STATUS_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cdEClass, org.openhealthtools.mdht.uml.term.core.profile.CD.class, "CD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCD_Qualifier(), this.getCR(), null, "qualifier", null, 0, -1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCD_Translation(), this.getCD(), null, "translation", null, 0, -1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_Code(), ecorePackage.getEString(), "code", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystem(), ecorePackage.getEString(), "codeSystem", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystemName(), ecorePackage.getEString(), "codeSystemName", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystemVersion(), ecorePackage.getEString(), "codeSystemVersion", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crEClass, org.openhealthtools.mdht.uml.term.core.profile.CR.class, "CR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCR_Name(), this.getCD(), null, "name", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCR_Value(), this.getCD(), null, "value", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCR_Inverted(), ecorePackage.getEBoolean(), "inverted", null, 0, 1, org.openhealthtools.mdht.uml.term.core.profile.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptDomainConstraintEClass, ConceptDomainConstraint.class, "ConceptDomainConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptDomainConstraint_Reference(), this.getConceptDomain(), null, "reference", null, 0, 1, ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptDomainConstraint_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptDomainConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConceptDomainConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptDomainEClass, ConceptDomain.class, "ConceptDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptDomain_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptDomain_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptDomain_Status(), this.getStatusKind(), "status", null, 0, 1, ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConceptDomain_StatusDate(), ecorePackage.getEString(), "statusDate", null, 0, 1, ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConceptDomain_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codeSystemConstraintEClass, CodeSystemConstraint.class, "CodeSystemConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeSystemConstraint_Reference(), this.getCodeSystemVersion(), null, "reference", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_Version(), ecorePackage.getEString(), "version", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_Binding(), this.getBindingKind(), "binding", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_Code(), ecorePackage.getEString(), "code", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemConstraint_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodeSystemConstraint_Qualifier(), this.getCR(), null, "qualifier", null, 0, -1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodeSystemConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codeSystemVersionEClass, CodeSystemVersion.class, "CodeSystemVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeSystemVersion_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_Source(), ecorePackage.getEString(), "source", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_Url(), ecorePackage.getEString(), "url", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_EffectiveDate(), ecorePackage.getEString(), "effectiveDate", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_ReleaseDate(), ecorePackage.getEString(), "releaseDate", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_Status(), this.getStatusKind(), "status", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCodeSystemVersion_StatusDate(), ecorePackage.getEString(), "statusDate", null, 0, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodeSystemVersion_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetConstraintEClass, ValueSetConstraint.class, "ValueSetConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetConstraint_Reference(), this.getValueSetVersion(), null, "reference", null, 0, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetConstraint_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetConstraint_Version(), ecorePackage.getEString(), "version", null, 0, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetConstraint_Binding(), this.getBindingKind(), "binding", null, 0, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetVersionEClass, ValueSetVersion.class, "ValueSetVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSetVersion_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Source(), ecorePackage.getEString(), "source", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Url(), ecorePackage.getEString(), "url", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_EffectiveDate(), ecorePackage.getEString(), "effectiveDate", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_ExpirationDate(), ecorePackage.getEString(), "expirationDate", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_ReleaseDate(), ecorePackage.getEString(), "releaseDate", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_RevisionDate(), ecorePackage.getEString(), "revisionDate", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Status(), this.getStatusKind(), "status", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_StatusDate(), ecorePackage.getEString(), "statusDate", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Type(), this.getValueSetType(), "type", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetVersion_Binding(), this.getBindingKind(), "binding", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetVersion_CodeSystem(), this.getCodeSystemVersion(), null, "codeSystem", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetVersion_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetCodeEClass, ValueSetCode.class, "ValueSetCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSetCode_ConceptName(), ecorePackage.getEString(), "conceptName", null, 0, 1, ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetCode_UsageNote(), ecorePackage.getEString(), "usageNote", null, 0, 1, ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetCode_CodeSystem(), this.getCodeSystemVersion(), null, "codeSystem", null, 0, 1, ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetCode_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 1, 1, ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetContextBindingEClass, ValueSetContextBinding.class, "ValueSetContextBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSetContextBinding_EffectiveDate(), ecorePackage.getEString(), "effectiveDate", null, 0, 1, ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetContextBinding_ConceptDomain(), this.getConceptDomain(), null, "conceptDomain", null, 1, 1, ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetContextBinding_ValueSet(), this.getValueSetVersion(), null, "valueSet", null, 1, 1, ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetContextBinding_UsageContext(), this.getUsageContext(), null, "usageContext", null, 1, 1, ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetContextBinding_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageContextEClass, UsageContext.class, "UsageContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsageContext_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsageContext_Status(), this.getStatusKind(), "status", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsageContext_StatusDate(), ecorePackage.getEString(), "statusDate", null, 0, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsageContext_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingKindEEnum, BindingKind.class, "BindingKind");
		addEEnumLiteral(bindingKindEEnum, BindingKind.STATIC);
		addEEnumLiteral(bindingKindEEnum, BindingKind.DYNAMIC);

		initEEnum(valueSetTypeEEnum, ValueSetType.class, "ValueSetType");
		addEEnumLiteral(valueSetTypeEEnum, ValueSetType.EXTENSIONAL);
		addEEnumLiteral(valueSetTypeEEnum, ValueSetType.INTENSIONAL);

		initEEnum(statusKindEEnum, StatusKind.class, "StatusKind");
		addEEnumLiteral(statusKindEEnum, StatusKind.ACTIVE);
		addEEnumLiteral(statusKindEEnum, StatusKind.INACTIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //TermPackageImpl
