/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;
import org.openhealthtools.mdht.uml.cda.pilot.util.TBPNValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TBPNPackageImpl extends EPackageImpl implements TBPNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuberculosisFollowUpProgressNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbResultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbResultObservationEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TBPNPackageImpl() {
		super(eNS_URI, TBPNFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TBPNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TBPNPackage init() {
		if (isInited) return (TBPNPackage)EPackage.Registry.INSTANCE.getEPackage(TBPNPackage.eNS_URI);

		// Obtain or create and register package
		TBPNPackageImpl theTBPNPackage = (TBPNPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TBPNPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TBPNPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CCDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTBPNPackage.createPackageContents();

		// Initialize created meta-data
		theTBPNPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTBPNPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TBPNValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTBPNPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TBPNPackage.eNS_URI, theTBPNPackage);
		return theTBPNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuberculosisFollowUpProgressNote() {
		return tuberculosisFollowUpProgressNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBResultOrganizer() {
		return tbResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBResultsSection() {
		return tbResultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBResultObservation() {
		return tbResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBPNFactory getTBPNFactory() {
		return (TBPNFactory)getEFactoryInstance();
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
		tuberculosisFollowUpProgressNoteEClass = createEClass(TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE);

		tbResultsSectionEClass = createEClass(TB_RESULTS_SECTION);

		tbResultOrganizerEClass = createEClass(TB_RESULT_ORGANIZER);

		tbResultObservationEClass = createEClass(TB_RESULT_OBSERVATION);
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
		CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		CCDPackage theCCDPackage = (CCDPackage)EPackage.Registry.INSTANCE.getEPackage(CCDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tuberculosisFollowUpProgressNoteEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		tbResultsSectionEClass.getESuperTypes().add(theCCDPackage.getResultsSection());
		tbResultOrganizerEClass.getESuperTypes().add(theCCDPackage.getResultOrganizer());
		tbResultObservationEClass.getESuperTypes().add(theCCDPackage.getResultObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(tuberculosisFollowUpProgressNoteEClass, TuberculosisFollowUpProgressNote.class, "TuberculosisFollowUpProgressNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(tuberculosisFollowUpProgressNoteEClass, ecorePackage.getEBoolean(), "validateTuberculosisFollowUpProgressNotePatientNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tuberculosisFollowUpProgressNoteEClass, ecorePackage.getEBoolean(), "validateTuberculosisFollowUpProgressNoteTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tuberculosisFollowUpProgressNoteEClass, ecorePackage.getEBoolean(), "validateTuberculosisFollowUpProgressNoteTBResultsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tuberculosisFollowUpProgressNoteEClass, this.getTBResultsSection(), "getTbResultsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tbResultsSectionEClass, TBResultsSection.class, "TBResultsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tbResultsSectionEClass, ecorePackage.getEBoolean(), "validateTBResultsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tbResultsSectionEClass, ecorePackage.getEBoolean(), "validateTBResultsSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tbResultsSectionEClass, ecorePackage.getEBoolean(), "validateTBResultsSectionTBResultOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tbResultsSectionEClass, ecorePackage.getEBoolean(), "validateTBResultsSectionTBResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tbResultsSectionEClass, this.getTBResultOrganizer(), "getTbResultOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(tbResultsSectionEClass, this.getTBResultObservation(), "getTbResultObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tbResultOrganizerEClass, TBResultOrganizer.class, "TBResultOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tbResultOrganizerEClass, ecorePackage.getEBoolean(), "validateTBResultOrganizerTBResultObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tbResultOrganizerEClass, this.getTBResultObservation(), "getTbResultObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tbResultObservationEClass, TBResultObservation.class, "TBResultObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tbResultObservationEClass, ecorePackage.getEBoolean(), "validateTBResultObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
		addAnnotation
		  (tuberculosisFollowUpProgressNoteEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3",
			 "constraints.validation.error", "TuberculosisFollowUpProgressNoteTemplateId TuberculosisFollowUpProgressNotePatientNames TuberculosisFollowUpProgressNoteTBResultsSection"
		   });																	
		addAnnotation
		  (tbResultsSectionEClass, 
		   source, 
		   new String[] {
			 "title.mixed", "Relevant diagnostic tests and/or laboratory data",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "code.displayName", "Relevant diagnostic tests and/or laboratory data",
			 "templateId.root", "2.16.840.1.113883.10.20.15.2.6",
			 "constraints.validation.error", "TBResultsSectionTemplateId ResultsSectionCode TBResultsSectionText TBResultsSectionTitle",
			 "code.codeSystemName", "LOINC",
			 "code.code", "30954-2",
			 "constraints.validation.info", "TBResultsSectionTBResultOrganizer TBResultsSectionTBResultObservation"
		   });																								
		addAnnotation
		  (tbResultOrganizerEClass, 
		   source, 
		   new String[] {
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.21",
			 "constraints.validation.error", "TBResultOrganizerTemplateId ResultOrganizerCode TBResultOrganizerTBResultObservation",
			 "code.codeSystemName", "LOINC"
		   });									
		addAnnotation
		  (tbResultObservationEClass, 
		   source, 
		   new String[] {
			 "statusCode.code", "completed",
			 "code.codeSystem", "2.16.840.1.113883.6.1",
			 "templateId.root", "2.16.840.1.113883.10.20.15.3.13",
			 "constraints.validation.error", "TBResultObservationTemplateId TBResultObservationClassCode ResultObservationCode ResultObservationStatusCode",
			 "code.codeSystemName", "LOINC",
			 "classCode", "OBS"
		   });					
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";																			
		addAnnotation
		  (tbResultsSectionEClass, 
		   source, 
		   new String[] {
		   });																								
		addAnnotation
		  (tbResultOrganizerEClass, 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (tbResultObservationEClass, 
		   source, 
		   new String[] {
		   });				
	}

} //TBPNPackageImpl
