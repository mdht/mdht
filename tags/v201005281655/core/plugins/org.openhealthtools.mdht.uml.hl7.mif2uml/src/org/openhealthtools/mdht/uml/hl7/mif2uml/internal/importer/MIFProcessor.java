/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer;




import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Annotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Appendix;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.Attribute;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeParameter;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeQualifierKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.DefaultDeterminerKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DerivationRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase;
import org.openhealthtools.mdht.emf.hl7.mif2.FlatClass;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint;
import org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelElement;
import org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.OperationParameter;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.OwnerScopeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Relationship;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind;
import org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.UnlimitedMultiplicity;
import org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.RIMUtil;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFImporterOptions;
import org.openhealthtools.mdht.uml.hl7.mif2uml.util.MIFUtil;

/**
 * @author eclipse
 *
 */
public class MIFProcessor extends Mif2Switch {

	public static final String RSM_DEFAULT_PROFILE_URI = "pathmap://UML2_MSL_PROFILES/Default.epx";
	public static final String RSM_DOCUMENTATION_STEREOTYPE_QNAME = "Default::Documentation";
	
	/** Errors and warnings created by this transformation. */
	private DiagnosticsHelper diagnostics = new DiagnosticsHelper();
	
	/** Comma-delimited error log, suitable for import to spreadsheets. */
	private StringBuffer vocabularyErrors = new StringBuffer();
	
	private List<String> unresolvedClassNames = new ArrayList<String>();
	
	private Model umlModel;
	private Stack umlPackageStack = new Stack();
	private Stack umlClassStack = new Stack();

	private Map<Association, AssociationEnd> associationClassTargets = new HashMap<Association, AssociationEnd>();

	private Profile hdfProfile;
	private Profile rimProfile;
	private Enumeration staticModelUseKind = null;
	
	private Map<MIFIdentifier,Element> mifToUMLMap = new HashMap<MIFIdentifier,Element>();

	private CommonModelElements cmeUtil;

	private MIFImporterOptions transformerOptions;

	public MIFProcessor() {
		transformerOptions = new MIFImporterOptions();
	}
	
	public void setCreateAssociationClasses(boolean create) {
		transformerOptions.setCreateAssociationClasses(create);
	}

	public void setUsePackageTitle(boolean usePackageTitle) {
		transformerOptions.setUsePackageTitle(usePackageTitle);
	}
	
	public void setUseXHTML(boolean useXHTML) {
		transformerOptions.setUseXHTML(useXHTML);
	}

	public void setCreateStructuralAttributes(boolean create) {
		transformerOptions.setCreateStructuralAttributes(create);
	}

	public void setSuppressDatatypeCollections(boolean suppress) {
		transformerOptions.setSuppressDatatypeCollections(suppress);
	}

	public void setCreateFilePerPackage(boolean create) {
		transformerOptions.setCreateFilePerPackage(create);
	}

	public Diagnostic getDiagnostics() {
		return diagnostics.getDiagnostics();
	}

	public DiagnosticChain getDiagnosticChain() {
		return diagnostics.getDiagnosticChain();
	}
	
	public void setDiagnostics(DiagnosticChain diagnosticChain) {
		diagnostics.setDiagnostics(diagnosticChain);
	}
	
	public String getVocabularyErrors() {
		return vocabularyErrors.toString();
	}
	
	protected void addVocabularyError(NamedElement modelElement, String domainName, String mnemonic, String errorMessage) {
		vocabularyErrors.append(errorMessage);
		vocabularyErrors.append(", ");
		
		vocabularyErrors.append(UMLUtil.getPackageQualifiedName(modelElement));
		vocabularyErrors.append(", ");
		vocabularyErrors.append(domainName);
		if (mnemonic != null) {
			vocabularyErrors.append(", ");
			vocabularyErrors.append(mnemonic);
		}
		vocabularyErrors.append(System.getProperty("line.separator"));
	}
	
	/**
	 * @return the UML Model
	 */
	public Model getUMLModel() {
		if (umlModel == null) {
			Model model = UMLFactory.eINSTANCE.createModel();
			model.setName("MIF_Import");
			setUMLModel(model);
		}
		return umlModel;
	}

	/**
	 * @param umlModel the UML Model where MIF will be imported
	 */
	public void setUMLModel(Model umlModel) {
		this.umlModel = umlModel;
		
		//only succeeds when running inside of RSM/RSA
		applyRSMDefaultProfile(umlModel);
		
		rimProfile = HL7ResourceUtil.applyRIMProfile(umlModel);
		hdfProfile = HL7ResourceUtil.applyHDFProfile(umlModel);

//		UMLUtil.importLibrary(umlModel, 
//				DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI);
//		UMLUtil.importLibrary(umlModel, 
//				RIMConstants.HL7_RIM_LIBRARY_URI);
		
		if (rimProfile != null) {
			staticModelUseKind = (Enumeration)
				hdfProfile.getOwnedType(IHDFProfileConstants.STATIC_MODEL_USE_KIND);
		}

		mifToUMLMap.clear();
		loadExistingMappings();
	}
	
	public void loadExistingMappings() {
		Assert.isNotNull(umlModel);
		
		TreeIterator allElements = umlModel.eResource().getResourceSet().getAllContents();
		while (allElements.hasNext()) {
			Object obj = allElements.next();
			if (obj instanceof Profile) {
				allElements.prune();
			}
			else if (obj instanceof Package) {
				if (obj instanceof Model) {
					Profile hdfProfile = ((Model)obj).getAppliedProfile(IHDFProfileConstants.HDF_PROFILE_NAME);
					if (hdfProfile == null) {
						allElements.prune();
						continue;
					}
				}
				
				Package element = (Package) obj;
				MIFIdentifier mifId = new MIFIdentifier(element);
				mifToUMLMap.put(mifId, element);

			}
			else if (obj instanceof Classifier) {
				Classifier element = (Classifier) obj;
				MIFIdentifier xsdId = new MIFIdentifier(element);
				mifToUMLMap.put(xsdId, element);

				allElements.prune();
			}
			else if (!(obj instanceof Resource || obj instanceof Package)) {
				allElements.prune();
			}
			
		}
	}

	protected Element getMappingEntry(ModelElement mifElement) {
		MIFIdentifier mifId = new MIFIdentifier(mifElement);
		return mifToUMLMap.get(mifId);
	}

	protected Element getMappingEntry(DatatypeRef mifElement) {
		MIFIdentifier mifId = new MIFIdentifier(mifElement);
		return mifToUMLMap.get(mifId);
	}
	
	protected void addMappingEntry(ModelElement mifElement, Element umlElement) {
		MIFIdentifier mifId = new MIFIdentifier(mifElement);
		mifToUMLMap.put(mifId, umlElement);
	}

	protected void addMappingEntry(DatatypeRef datatypeRef, Element umlElement) {
		MIFIdentifier mifId = new MIFIdentifier(datatypeRef);
		mifToUMLMap.put(mifId, umlElement);
	}

	private Profile applyRSMDefaultProfile(Model model) {
		Resource defaultProfileResource = null;
		Profile defaultProfile = null;
		
		try {
			ResourceSet resourceSet = model.eResource().getResourceSet();
			defaultProfileResource = resourceSet.getResource(URI
					.createURI(RSM_DEFAULT_PROFILE_URI), true);
			
			if (defaultProfileResource != null) {
				defaultProfile = (Profile) EcoreUtil.getObjectByType(
						defaultProfileResource.getContents(), 
						UMLPackage.eINSTANCE.getProfile());

				if (defaultProfile != null && !model.isProfileApplied(defaultProfile)) {
					model.applyProfile(defaultProfile);
				}
			}

		} catch (WrappedException we) {
			//Logger.logException(we);
		}
		
		return defaultProfile;
	}

	public void transformElement(ModelElement mifElement) {
		// this will also resolve and import referenced component models
		doSwitch(mifElement);
	}

	/**
	 * Process all eContents().
	 */
	public Object defaultCase(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		for (Iterator eContents = eObject.eContents().iterator(); eContents.hasNext();) {
			doSwitch((EObject) eContents.next());
		}

		return super.defaultCase(eObject);
	}

	public Object caseStaticModel(StaticModel mifModel) {
		Package mappedPackage = (Package) getMappingEntry(mifModel);
		if (mappedPackage != null)
			return mappedPackage;
		
		if (StaticModelRepresentationKind.FLAT != mifModel.getRepresentationKind()) {
			diagnostics.error("MIF model is not 'flat', cannot be imported: " + 
					MIFUtil.getModelName(mifModel), null);
			return null;
		}

		String modelName = null;
		if (transformerOptions.isUsePackageTitle() && mifModel.getTitle() != null) {
			modelName = mifModel.getTitle();
		}
		if (modelName == null) {
			modelName = MIFUtil.getModelName(mifModel);
		}
		
		Package umlPackage = null;
		if (transformerOptions.isCreateFilePerPackage()) {
			umlPackage = UMLFactory.eINSTANCE.createPackage();
			umlPackage.setName(modelName);
			
			URI uri = getUMLModel().eResource().getURI();
			String fileExtension = uri.fileExtension();
			uri = uri.trimSegments(1).appendSegment(modelName).appendFileExtension(fileExtension);
			Resource resource = getUMLModel().eResource().getResourceSet().createResource(uri);
			resource.getContents().add(umlPackage);
			
			getUMLModel().createElementImport(umlPackage);
		}
		else {
			 umlPackage = getUMLModel().createNestedPackage(modelName);
		}
		
		UMLUtil.setEObjectID(umlPackage);
		umlPackageStack.push(umlPackage);

		setModelMetadata(mifModel, umlPackage);
		if (!transformerOptions.isUsePackageTitle() && mifModel.getTitle() != null) {
			UMLUtil.addAliasName(umlPackage, mifModel.getTitle());
		}

		if (getMappingEntry(mifModel) == null) {
			addMappingEntry(mifModel, umlPackage);
		}

		for (ClassElement classElement : mifModel.getContainedClass()) {
			if (classElement.getClass_() != null)
				doSwitch(classElement.getClass_());
			if (classElement.getCommonModelElementRef() != null)
				doSwitch(classElement.getCommonModelElementRef());
		}
		for (org.openhealthtools.mdht.emf.hl7.mif2.Association mifAssoc : mifModel.getAssociation()) {
			doSwitch(mifAssoc);
		}
		for (EntryPoint entryPoint : mifModel.getEntryPoint()) {
			doSwitch(entryPoint);
		}

		// process pending relationships
//		resolvingPendingReferences = true;
//		for (Iterator iter = pendingReferences.keySet().iterator(); iter.hasNext();) {
//			EObject element = (EObject) iter.next();
//			doSwitch(element);
//		}
//		pendingReferences.clear();
//		resolvingPendingReferences = false;
		
		for (SubjectAreaPackage nestedPkg : mifModel.getSubjectAreaPackage()) {
			defaultCase(nestedPkg);
		}

		importComments(mifModel.getAnnotations(), umlPackage);

		umlPackageStack.pop();
		return umlPackage;
	}

	public Object caseSubjectAreaPackage(SubjectAreaPackage subjectPkg) {
		Package mappedPackage = (Package) getMappingEntry(subjectPkg);
		if (mappedPackage != null)
			return mappedPackage;

		if (umlPackageStack.isEmpty()) {
			diagnostics.error("Missing UML owner for MIF SubjectAreaPackage: " + subjectPkg.getName(), null);
			return null;
		}
		Package ownerPackage = (Package) umlPackageStack.peek();
		Package umlPackage = ownerPackage.createNestedPackage(subjectPkg.getName());
		UMLUtil.setEObjectID(umlPackage);
		umlPackageStack.push(umlPackage);

		for (LocalClassRef classRef : subjectPkg.getContainedClass()) {
			//TODO this does not work for subject packages nested more than one level
			Type umlType = ownerPackage.getOwnedType(classRef.getName());
			if (umlType != null) {
				umlPackage.createElementImport(umlType);
			}
			else {
				diagnostics.error("Missing SubjectAreaPackage class reference: " + classRef.getName(), null);
			}
		}
		for (SubjectAreaPackage nestedPkg : subjectPkg.getSubjectAreaPackage()) {
			defaultCase(nestedPkg);
		}

		importComments(subjectPkg.getAnnotations(), umlPackage);
		
		umlPackageStack.pop();
		return umlPackage;
	}

	public Object caseDatatypeModelLibrary(DatatypeModelLibrary library) {
		Package mappedPackage = (Package) getMappingEntry(library);
		if (mappedPackage != null)
			return mappedPackage;
		String modelName = library.getPackageLocation().getCombinedId();

		Package umlPackage = null;
		if (transformerOptions.isCreateFilePerPackage()) {
			umlPackage = UMLFactory.eINSTANCE.createPackage();
			umlPackage.setName(modelName);
			
			URI uri = getUMLModel().eResource().getURI();
			String fileExtension = uri.fileExtension();
			uri = uri.trimSegments(1).appendSegment(modelName).appendFileExtension(fileExtension);
			Resource resource = getUMLModel().eResource().getResourceSet().createResource(uri);
			resource.getContents().add(umlPackage);
			
			getUMLModel().createElementImport(umlPackage);
		}
		else {
			umlPackage = getUMLModel().createNestedPackage(modelName);
		}
		
		UMLUtil.setEObjectID(umlPackage);
		umlPackageStack.push(umlPackage);

		setPackageMetadata(library, umlPackage);
		if (library.getTitle() != null) {
			UMLUtil.addAliasName(umlPackage, library.getTitle());
		}
		for (Datatype datatype : library.getDatatype()) {
			doSwitch(datatype);
		}
		
		umlPackageStack.pop();
		return umlPackage;
	}

	public Object caseVocabularyModel(VocabularyModel mifModel) {
		Package mappedPackage = (Package) getMappingEntry(mifModel);
		if (mappedPackage != null)
			return mappedPackage;
		String modelName = mifModel.getPackageLocation().getCombinedId();
		Package umlPackage = getUMLModel().createNestedPackage(modelName);
		UMLUtil.setEObjectID(umlPackage);
		umlPackageStack.push(umlPackage);

		setPackageMetadata(mifModel, umlPackage);
		if (mifModel.getTitle() != null) {
			UMLUtil.addAliasName(umlPackage, mifModel.getTitle());
		}
		for (ConceptDomain conceptDomain : mifModel.getConceptDomain()) {
			
		}
		for (CodeSystem codeSystem : mifModel.getCodeSystem()) {
			
		}
		for (ValueSet valueSet : mifModel.getValueSet()) {
			
		}
		
		umlPackageStack.pop();
		return umlPackage;
	}

	public Object caseDatatype(Datatype datatype) {
		if (umlPackageStack.isEmpty()) {
			diagnostics.error("Missing package for MIF datatype: " + datatype.getName(), null);
			return null;
		}
		Package umlPackage = (Package) umlPackageStack.peek();
		
		Classifier mappedDataType = (Classifier) getMappingEntry(datatype);
		if (mappedDataType != null)
			return mappedDataType;
		
		Classifier umlClassifier = UMLFactory.eINSTANCE.createInterface();
		
		// special case for MIF datatypes, e.g. IVL_PQ, change to IVL<PQ>
		String name = MIFUtil.getDatatypeName(datatype);
		
		umlClassifier.setName(name);
		umlClassifier.setIsAbstract(datatype.isIsAbstract());
		umlPackage.getOwnedTypes().add(umlClassifier);
		UMLUtil.setEObjectID(umlClassifier);

		if (!datatype.getBusinessName().isEmpty()) {
			Stereotype hl7Stereotype = 
				HL7ResourceUtil.applyHDFStereotype(umlClassifier, IHDFProfileConstants.HDF_CLASS);
			setBusinessNames(umlClassifier, hl7Stereotype, datatype.getBusinessName());
		}
		
		if (getMappingEntry(datatype) == null) {
			addMappingEntry(datatype, umlClassifier);
		}
		
		if (datatype.getTitle() != null) {
			UMLUtil.addAliasName(umlClassifier, datatype.getTitle());
		}

		switch (datatype.getVisibility().getValue()) {
		case org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind.PRIVATE_VALUE:
			umlClassifier.setVisibility(VisibilityKind.PRIVATE_LITERAL);
			break;
		case org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind.PROTECTED_VALUE:
			umlClassifier.setVisibility(VisibilityKind.PROTECTED_LITERAL);
			break;
		default:
			umlClassifier.setVisibility(VisibilityKind.PUBLIC_LITERAL);
		}

		if (!datatype.getParameter().isEmpty()) {
			TemplateSignature signature = umlClassifier.createOwnedTemplateSignature();
			
			for (DatatypeParameter mifParam : datatype.getParameter()) {
				ClassifierTemplateParameter parameter = (ClassifierTemplateParameter) signature.createOwnedParameter(
						UMLPackage.eINSTANCE.getClassifierTemplateParameter());
				
				Interface element = (Interface) parameter.createOwnedParameteredElement(UMLPackage.eINSTANCE.getInterface());
				element.setName(mifParam.getName());
				
				Classifier constraining = resolveDatatypeReference(mifParam.getType());
				if (constraining != null)
				{
					UMLUtil.setConstrainingClassifier(parameter, constraining);
				}
				
				Classifier defaultType = resolveDatatypeReference(mifParam.getDefaultValue());
				if (defaultType != null)
					parameter.setDefault(defaultType);
			}
		}
		
		if (datatype.getBinding() != null) {
			DatatypeBinding mifBinding = datatype.getBinding();
			Classifier target = resolveDatatypeReference(mifBinding.getTargetDatatype());
			if (target != null && target.isTemplate()) {
				target.getOwnedTemplateSignature();
				TemplateSignature signature = target.getOwnedTemplateSignature();
				TemplateBinding binding = umlClassifier.createTemplateBinding(signature);
				
				int paramIndex = 0;
				for (DatatypeRef mifArg : mifBinding.getArgumentDatatype()) {
					Classifier umlArg = resolveDatatypeReference(mifArg);
					if (umlArg != null) {
						TemplateParameterSubstitution substitution = binding.createParameterSubstitution();
						substitution.setFormal(signature.getOwnedParameters().get(paramIndex++));
						
						UMLUtil.setParameterableElement(substitution,umlArg);

					}
					else {
						diagnostics.error("Cannot find datatype binding argument '" 
								+ mifArg.getName() + "' for", umlClassifier);
					}
				}
			}
			else {
				diagnostics.error("Cannot find datatype binding target '" 
						+ mifBinding.getTargetDatatype().getName() + "' for", umlClassifier);
			}
		}

		for (DatatypeDerivation derivation : datatype.getDerivedFrom()) {
			Classifier umlGeneral = resolveDatatypeReference(derivation.getTargetDatatype());
			if (umlGeneral != null) {
				Generalization generalization = umlClassifier.createGeneralization(umlGeneral);
				UMLUtil.setEObjectID(generalization);
				if (DerivationRelationshipKind.RESTRICTION == derivation.getRelationship()) {
					HL7ResourceUtil.applyHDFStereotype(generalization, IHDFProfileConstants.RESTRICTION);
				}
			}
			else {
				diagnostics.error("Cannot find datatype derivation '" 
						+ derivation.getTargetDatatype().getName() + "' for", umlClassifier);
			}
		}
		
		umlClassStack.push(umlClassifier);
		defaultCase(datatype);
		umlClassStack.pop();

		importComments(datatype.getAnnotations(), umlClassifier);
		return umlClassifier;
	}

	public Object caseDatatypeOperation(DatatypeOperation mifProperty) {
		Classifier umlClassifier = (Classifier) umlClassStack.peek();
		String mifName = mifProperty.getName();
		Feature umlFeature = null;
		
		if (umlClassifier instanceof DataType || umlClassifier instanceof Class
				 || umlClassifier instanceof Interface) {
			DatatypeRef datatypeRef = mifProperty.getType();
			Classifier umlType = resolveDatatypeReference(datatypeRef);
			
			Operation operation = null;
			if (umlClassifier instanceof DataType)
				operation = ((DataType)umlClassifier).createOwnedOperation(mifName, null, null, umlType);
			else if (umlClassifier instanceof Class)
				operation = ((Class)umlClassifier).createOwnedOperation(mifName, null, null, umlType);
			else if (umlClassifier instanceof Interface)
				operation = ((Interface)umlClassifier).createOwnedOperation(mifName, null, null, umlType);
			
			umlFeature = operation;
			UMLUtil.setEObjectID(operation);

			Parameter returnParm = operation.getReturnResult();
			// returnParm will be null if the operation return type is null (not found)
			if (returnParm != null) {
				setMultiplicity(mifProperty, returnParm);
//				setPropertyData(mifProperty, returnParm);

				String mifValue = null;
				if (mifProperty.getFixedValue() != null) {
					mifValue = mifProperty.getFixedValue();
					//TODO can we mark a UML operation return parameter as fixed value?
				}
				else if (mifProperty.getDefaultValue() != null) {
					mifValue = mifProperty.getDefaultValue();
				}

				if (mifValue != null) {
					OpaqueExpression expression = (OpaqueExpression) returnParm
							.createDefaultValue(null, umlType, 
									UMLPackage.Literals.OPAQUE_EXPRESSION);
					expression.getBodies().add(mifValue);
				}
			}
			
			for (OperationParameter mifParameter : mifProperty.getParameter()) {
				Classifier paramType = resolveDatatypeReference(mifParameter.getType());
				operation.createOwnedParameter(mifParameter.getName(), paramType);
				//ignore MIF sortKey
			}

			if (OwnerScopeKind.CLASSIFIER == mifProperty.getOwnerScope()) {
				umlFeature.setIsStatic(true);
			}
			
			switch (mifProperty.getVisibility().getValue()) {
			case org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind.PRIVATE_VALUE:
				umlFeature.setVisibility(VisibilityKind.PRIVATE_LITERAL);
				break;
			case org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind.PROTECTED_VALUE:
				umlFeature.setVisibility(VisibilityKind.PROTECTED_LITERAL);
				break;
			default:
				umlFeature.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			}

			//TODO no stereotype for operation w/ business name property
//			setBusinessNames(umlFeature, stereotype, mifProperty.getBusinessName());
			for (BusinessName businessName : mifProperty.getBusinessName()) {
				UMLUtil.addAliasName(umlFeature, businessName.getName());
				break;
			}
			
			importComments(mifProperty.getAnnotations(), umlFeature);
			
			if (datatypeRef != null && umlType == null) {
				diagnostics.error("Cannot map datatype property type '" + datatypeRef.getName() + "' in property", umlFeature);
			}
		}
		
		return umlFeature;
	}

	public Object caseEntryPointBase(EntryPointBase mifEntryPoint) {
		Interface umlEntryPoint = (Interface) getMappingEntry(mifEntryPoint);
		if (umlEntryPoint != null) {
			return umlEntryPoint;
		}
		
		// for serialized format, this processes all model contents
		// do this first so that we have the class for realization dependency
		defaultCase(mifEntryPoint);

		Package umlPackage = (Package) umlPackageStack.peek();
		umlEntryPoint = umlPackage.createOwnedInterface(mifEntryPoint.getName());
		UMLUtil.setEObjectID(umlEntryPoint);
//		umlEntryPoint.setIsAbstract(mifEntryPoint.isIsAbstract());
		importComments(mifEntryPoint.getAnnotations(), umlEntryPoint);
		
		Stereotype hdfStereotype = HL7ResourceUtil.applyHDFStereotype(umlEntryPoint, 
					IHDFProfileConstants.ENTRY_POINT);
		if (mifEntryPoint.getUseKind() != null) {
			String value = mifEntryPoint.getUseKind().getLiteral();
			EnumerationLiteral literal = (EnumerationLiteral) staticModelUseKind.getOwnedLiteral(value);
			if (literal != null) {
				umlEntryPoint.setValue(hdfStereotype, IHDFProfileConstants.USE_KIND, literal);
			}
			else {
				diagnostics.error("Invalid EntryPoint useKind '" + value + "' in", umlEntryPoint);
			}
		}

		// the entry point class realization
		ClassBase mifClass = null;
		org.openhealthtools.mdht.emf.hl7.mif2.Package mifPackage = MIFUtil.getPackage(mifEntryPoint);
		if (mifEntryPoint instanceof SerializedEntryPoint) {
			mifClass = ((SerializedEntryPoint)mifEntryPoint).getEntryClass().getClass_();
		}
		else if (mifEntryPoint instanceof EntryPoint && mifPackage instanceof StaticModel) {
			mifClass = MIFUtil.getClassByName((StaticModel)mifPackage, ((EntryPoint)mifEntryPoint).getClassName());
		}
		
		if (mifClass != null) {
			if (mifEntryPoint.getName() == null) {
				umlEntryPoint.setName(mifClass.getName() + "EntryPoint");
			}

			Class umlClass = (Class) getMappingEntry(mifClass);
			if (umlClass != null && umlClass.getInterfaceRealization(null, umlEntryPoint) == null) {
				umlClass.createInterfaceRealization(null, umlEntryPoint);
			}
		}
		
		addMappingEntry(mifEntryPoint, umlEntryPoint);

		return umlEntryPoint;
	}

	/**
	 * Processes both Class and SerializedClass subtypes.
	 */
	public Object caseClassBase(ClassBase mifClass) {
		if (umlPackageStack.isEmpty()) {
			diagnostics.error("Missing package for MIF class: " + mifClass.getName(), null);
			return null;
		}
		Package umlPackage = (Package) umlPackageStack.peek();
		
		Class mappedClass = (Class) getMappingEntry(mifClass);
		if (mappedClass != null)
			return mappedClass;

		StaticModelBase mifModel = MIFUtil.getStaticModel(mifClass);
		Classifier umlClassifier = null;
		if (isAssociationClass(mifClass)) {
			if (hasOwnedAttributes(mifClass)) {
				umlClassifier = UMLFactory.eINSTANCE.createAssociationClass();
			}
			else {
				umlClassifier = UMLFactory.eINSTANCE.createAssociation();
			}
		}
		else {
			umlClassifier = UMLFactory.eINSTANCE.createClass();
		}
		umlClassifier.setName(mifClass.getName());
		umlClassifier.setIsAbstract(mifClass.isIsAbstract());
		umlPackage.getOwnedTypes().add(umlClassifier);
		UMLUtil.setEObjectID(umlClassifier);

		if (!mifClass.getBusinessName().isEmpty()) {
			Stereotype hl7Stereotype = 
				HL7ResourceUtil.applyHDFStereotype(umlClassifier, IHDFProfileConstants.HDF_CLASS);
			setBusinessNames(umlClassifier, hl7Stereotype, mifClass.getBusinessName());
		}

		if (mifClass.isSetIsComplete()) {
			Stereotype hl7Stereotype = 
				HL7ResourceUtil.applyHDFStereotype(umlClassifier, IHDFProfileConstants.HDF_CLASS);
			umlClassifier.setValue(hl7Stereotype, IHDFProfileConstants.IS_COMPLETE, mifClass.isIsComplete());
		}
		
		if (getMappingEntry(mifClass) == null) {
			addMappingEntry(mifClass, umlClassifier);
		}
		
		if (mifClass instanceof FlatClass) {
			/*
			 * It would be better to process in caseClassGeneralization(), but at that point
			 * we don't know if it occurred in a childClass or parentClass element.
			 */
			// childClass is always used in the RIM model
			for (ClassGeneralization mifGeneralization : ((FlatClass)mifClass).getChildClass()) {
				ClassBase mifChild = MIFUtil.getClassByName(mifModel, mifGeneralization.getName());
				if (mifChild == null) {
					// look for a CMET reference
					PackageRef cmetPackage = mifModel.getImportedCommonModelElementPackage();
					
					mifChild = getCommonModelClass(mifModel, mifGeneralization.getName());
				}
				if (mifChild != null) {
					Classifier child = (Classifier) doSwitch(mifChild);
					if (child != null) {
						Generalization generalization = child.createGeneralization(umlClassifier);
						UMLUtil.setEObjectID(generalization);
						
						/* All generalizations in static models are choice groups,
						 * unless it's the RIM model.  There is no other way to distinguish
						 * when a child class is a choice member in MIF!
						 */
						Package rimPackage = umlClassifier.getNearestPackage();
						Stereotype hdfPackage = HL7ResourceUtil.getAppliedHDFStereotype(rimPackage, 
								IHDFProfileConstants.HDF_PACKAGE);
						if (hdfPackage != null && 
								!"RIM".equals(rimPackage.getValue(hdfPackage, IHDFProfileConstants.PACKAGE_ARTIFACT))) {
							HL7ResourceUtil.applyHDFStereotype(umlClassifier, IHDFProfileConstants.CHOICE_GROUP);
						}
					}
				}
				else {
					diagnostics.error("Cannot resolve MIF child class '" + mifGeneralization.getName()
							+ "' for " + UMLUtil.getPackageQualifiedName(umlClassifier), null);
				}
			}

			// assume that BOTH child and parent are never defined for same relationship
			// have never seen parentClass used in a MIF model
			for (ClassGeneralization mifGeneralization : ((FlatClass)mifClass).getParentClass()) {
				ClassBase mifGeneral = MIFUtil.getClassByName(mifModel, mifGeneralization.getName());
				if (mifGeneral == null) {
					// look for a CMET reference
					mifGeneral = getCommonModelClass(mifModel, mifGeneralization.getName());
				}
				if (mifGeneral != null) {
					Classifier general = (Classifier) doSwitch(mifGeneral);
					if (general != null) {
						Generalization generalization = umlClassifier.createGeneralization(general);
						UMLUtil.setEObjectID(generalization);
						
						// All generalizations in static models are choice groups
						HL7ResourceUtil.applyHDFStereotype(general, IHDFProfileConstants.CHOICE_GROUP);
					}
				}
				else {
					diagnostics.error("Cannot resolve MIF parent class '" + mifGeneralization.getName()
							+ "' for " + UMLUtil.getPackageQualifiedName(umlClassifier), null);
				}
			}
		}

		for (Iterator iter = mifClass.getDerivedFrom().iterator(); iter.hasNext();) {
			ClassDerivation derivation = (ClassDerivation) iter.next();
			Stereotype stereotype = HL7ResourceUtil.applyRIMStereotype(
					umlClassifier, derivation.getClassName());
			if (stereotype != null) {
				break;
			}
		}
		
		/* *****
		 * Uncomment this if we want to include <<subsets>> generalization to RIM.
		 * 
		for (Iterator iter = mifClass.getDerivedFrom().iterator(); iter.hasNext();) {
			ClassDerivation derivation = (ClassDerivation) iter.next();
			if (isRIMDerivation(derivation, mifModel)) {
				Class rimClass = RIMUtil.getClassByName(umlPackage, derivation.getClassName());
				if (rimClass != null) {
					if (umlClassifier instanceof Association) {
						// use this for saving supplier reference in stereotype property
						Stereotype hl7Stereotype = 
							HL7ResourceUtil.applyHDFStereotype(umlClassifier, IHDFProfileConstants.HDF_CLASS);
						List rimDerivations = Collections.singletonList(rimClass);
						umlClassifier.setValue(hl7Stereotype, 
								IHDFProfileConstants.DERIVATION_SUPPLIER, rimDerivations);
					}
					else {
						if (umlClassifier.maySpecializeType(rimClass)) {
							Generalization subsets = umlClassifier.createGeneralization(rimClass);
							UMLUtil.setEObjectID(subsets);
							HL7ResourceUtil.applyHDFStereotype(subsets, IHDFProfileConstants.SUBSETS_GENERALIZATION);
						}
						else {
							diagnostics.error("Incompatible RIM generalization", umlClassifier);
						}
					}
				}
			}
			break;
		}
		******/

		umlClassStack.push(umlClassifier);
		defaultCase(mifClass);
		umlClassStack.pop();

		importComments(mifClass.getAnnotations(), umlClassifier);
		return umlClassifier;
	}
	
	public Object caseAttribute(Attribute mifAttribute) {
		Classifier umlClassifier = (Classifier) umlClassStack.peek();
		String mifName = mifAttribute.getName();

		Stereotype rimStereotype = RIMProfileUtil.getRIMStereotype(umlClassifier);
		if (isStereotypeProperty(mifAttribute) && rimStereotype != null) {
			//set RIM stereotype properties on owner class
			VocabularySpecification vocabulary = mifAttribute.getVocabulary();
			if (vocabulary != null) {
				if (vocabulary.getCode() != null) {
					try {
						umlClassifier.setValue(rimStereotype, mifName, vocabulary.getCode().getCode());
						umlClassifier.setValue(rimStereotype, mifName + "System", vocabulary.getCode().getCodeSystemName());
					} catch (IllegalArgumentException ex) {
						diagnostics.error("Illegal structural attribute '" + mifName + "' code: '" 
								+ vocabulary.getCode().getCode() + "' in classifier", umlClassifier);
					}
				}
				if (vocabulary.getConceptDomain() != null) {
					try {
						String propertyName = mifName.substring(0, mifName.indexOf("Code")) + "ConceptDomain";
						umlClassifier.setValue(rimStereotype, propertyName, vocabulary.getConceptDomain().getName());
					} catch (IllegalArgumentException ex) {
						diagnostics.error("Illegal structural attribute '" + mifName + "' concept domain: '" 
								+ vocabulary.getConceptDomain().getName() + "' in classifier", umlClassifier);
					}
				}
			}
		}

		Property umlProperty = null;
		
		// If MIF class was mapped to UML Association, then there are no non-structural attributes.
		// Don't create UML attributes for structural attributes that have a profile property.
		// rimStereotype == null when importing RIM model, so import all structural attributes in RIM.
		if (umlClassifier instanceof Class && 
				(rimStereotype == null || !isStereotypeProperty(mifAttribute))) {
			DatatypeRef datatypeRef = mifAttribute.getType();
			Classifier umlType = resolveDatatypeReference(datatypeRef);
			
			// Leave this out pending further investigation. Should enum be type of 'code' attribute in CD restriction?
//			if (mifAttribute.getEnumerationValue().size() > 1) {
//				//TODO If only one enum value, shouldn't this be simply a 'fixed' value?
//				//TODO this local enumeration should be a specialization of the Type???
//				String localEnumName = UMLUtil.getUniqueNestedClassifierName((Class)umlClassifier, "LocalEnum");
//				Enumeration localEnum = (Enumeration) ((Class)umlClassifier).createNestedClassifier(
//						localEnumName, UMLPackage.Literals.ENUMERATION);
//				for (String enumValue : mifAttribute.getEnumerationValue()) {
//					 localEnum.createOwnedLiteral(enumValue);
//				}
//				umlType = localEnum;
//			}
			
			umlProperty = ((Class)umlClassifier).createOwnedAttribute(mifName, umlType);
			UMLUtil.setEObjectID(umlProperty);
			setPropertyData(mifAttribute, umlProperty);
			setPropertyRedefinition(mifAttribute, umlProperty);
			importComments(mifAttribute.getAnnotations(), umlProperty);
			
			if (datatypeRef != null && umlType == null) {
				diagnostics.error("Cannot map property type '" + datatypeRef.getName() + "' in property", umlProperty);
			}
		}
		
		return umlProperty;
	}

	/**
	 * Process a MIF association.  Most of the complexity in this method is to handle
	 * the option for collapsing two MIF associations into one UML AssociationClass.
	 */
	public Object caseAssociation(org.openhealthtools.mdht.emf.hl7.mif2.Association mifAssociation) {
		
		if ((mifAssociation.getTraversableConnection().size()
				+ mifAssociation.getNonTraversableConnection().size()) != 2) {
			diagnostics.error("MIF association does not have 2 ends", mifAssociation);
			return null;
		}

		// always a StaticModel for flat serialization
		StaticModel mifModel = (StaticModel) MIFUtil.getPackage(mifAssociation);
		Package umlPackage = (Package) doSwitch(mifModel);
		List<Relationship> mifRelationships = new ArrayList<Relationship>();
		List<Property> umlProperties = new ArrayList<Property>();
		Association umlAssociation = null;

		/*
		 * Must process non-traversable first, so I know whether to discard this association
		 * and save only the traversable end targetRoleName and targetType.
		 */
		for (NonTraversableAssociationEnd end : mifAssociation.getNonTraversableConnection()) {
			String className = end.getParticipantClassName();
			Classifier endType = resolveMIFClassReference(mifModel, className);
			// does end refer to a MIF type that is mapped to UML Association?
			if (endType instanceof Association) {
				umlAssociation = (Association) endType;
			}
			else {
				Property property = UMLFactory.eINSTANCE.createProperty();
				property.setType(endType);
	
				mifRelationships.add(end);
				umlProperties.add(property);
			}
		}
		
		for (AssociationEnd end : mifAssociation.getTraversableConnection()) {
			// Did the non-traversable end refer to an Association?  If so, save the metadata and omit property.
			if (umlAssociation != null) {
				associationClassTargets.put(umlAssociation, end);
			}
			else {
				String className = end.getParticipantClassName();
				Classifier endType = resolveMIFClassReference(mifModel, className);
				
				// does traversable end refer to a MIF type that is mapped to UML Association?
				if (endType instanceof Association) {
					umlAssociation = (Association) endType;
				}
	
				Property property = UMLFactory.eINSTANCE.createProperty();
				property.setName(end.getName());
				property.setType(endType);
				//cannot set this until after property is added to an association
//				property.setIsNavigable(true);

				mifRelationships.add(end);
				umlProperties.add(property);
			}
		}
		
		if (umlAssociation == null) {
			umlAssociation = UMLFactory.eINSTANCE.createAssociation();
			umlPackage.getOwnedTypes().add(umlAssociation);
			
//			UMLUtil.setEObjectID(umlAssociation);
			addMappingEntry(mifAssociation, umlAssociation);
		}

		importComments(mifAssociation.getAnnotations(), umlAssociation);
		
		for (Property property : umlProperties) {
			umlAssociation.getOwnedEnds().add(property);
			property.setAssociation(umlAssociation);
		}
		
		// use an index variable to enable matching umlProperties and mifRelationships
		for (int i=0; i<umlProperties.size(); i++) {
			Property property = umlProperties.get(i);
			Relationship mifRelationship = mifRelationships.get(i);

			// AssociationEnd is the traversable end in MIF
			if (mifRelationship instanceof AssociationEnd) {
				property.setIsNavigable(true);

				// reassign end ownership if navigable
				if (property.getOtherEnd() != null) {
					Class owner = (Class) property.getOtherEnd().getType();
					if (owner != null) {
						owner.getOwnedAttributes().add(property);
					}
					umlAssociation.getOwnedEnds().remove(property);
					UMLUtil.setEObjectID(property);
				}
								
				if (property.getNearestPackage() != null) {
				// can't apply stereotypes until after Property is added to a Resource
				setPropertyData((AssociationEnd)mifRelationship, property);
				setPropertyRedefinition((AssociationEnd)mifRelationship, property);
				}
			}
//			else if (mifRelationship instanceof NonTraversableAssociationEnd) {
//				setPropertyRedefinition((NonTraversableAssociationEnd)mifRelationship, property);
//			}
		}

		// Must use getMemberEnds() and not getOwnedEnds(), because this may be processed
		// for each of the two MIF associations collapsed into one UML association class.
		if (umlAssociation.getMemberEnds().size() == 2) {
			List<Property> members = new ArrayList<Property>(umlAssociation.getMemberEnds());
			for (Property property : members) {
				// reassign to saved metadata from ignored MIF association end
				if (property.getType() instanceof Association
						&& associationClassTargets.get(umlAssociation) != null) {
					AssociationEnd end = associationClassTargets.get(umlAssociation);
					String className = end.getParticipantClassName();
					Classifier endType = resolveMIFClassReference(mifModel, className);
					
					property.setType(endType);
					setPropertyRedefinition(end, property);
					
					Stereotype rimStereotype = RIMProfileUtil.getRIMStereotype(umlAssociation);
					try {
						// this should never throw exception in a well-formed model
						umlAssociation.setValue(rimStereotype, IRIMProfileConstants.TARGET_ROLE_NAME, end.getName());
					}
					catch (IllegalArgumentException ex) {
						diagnostics.error("Cannot assign 'targetRoleName' to", umlAssociation);
					}
				}
			}
		}

		/*
		 * Must process at end, after umlAssociation is assigned.
		 */
		Classifier srcClass = null;
		for (NonTraversableAssociationEnd end : mifAssociation.getNonTraversableConnection()) {
			String className = end.getParticipantClassName();
			srcClass = resolveMIFClassReference(mifModel, className);
			break;
		}
		
		for (AssociationEnd end : mifAssociation.getTraversableConnection()) {
			// Is this an association to a choice group?
			if (!end.getChoiceItem().isEmpty()) {
				String endClassName = end.getParticipantClassName();
				Classifier endType = resolveMIFClassReference(mifModel, endClassName);
				
				if (endType instanceof Class) {
					HL7ResourceUtil.applyHDFStereotype(endType, IHDFProfileConstants.CHOICE_GROUP);

					// If choice group in different MIF package, then need to get its model
					// for resolving choice items in that MIF model.
					ClassBase endMIFClass = resolveMIFClassBase(mifModel, endClassName);
					StaticModel endMifModel = (StaticModel) MIFUtil.getPackage(endMIFClass);
					addChoiceItems(endMifModel, umlAssociation, end.getChoiceItem(), 0);
				}
			}

			for (AssociationEndDerivation derivation : end.getDerivedFrom()) {
				if (RIMProfileUtil.isRIMType(srcClass, IRIMProfileConstants.ROLE)) {
					if ("scoper".equals(derivation.getAssociationEndName())) {
						HL7ResourceUtil.applyRIMStereotype(umlAssociation, IRIMProfileConstants.SCOPE);
					}
//					else if ("player".equals(derivation.getAssociationEndName())) {
//						HL7ResourceUtil.applyRIMStereotype(umlAssociation, IRIMProfileConstants.PLAYER);
//					}
					
					break;
				}
				else if (RIMProfileUtil.isRIMType(srcClass, IRIMProfileConstants.ENTITY)) {
					if ("scopedRole".equals(derivation.getAssociationEndName())) {
						HL7ResourceUtil.applyRIMStereotype(umlAssociation, IRIMProfileConstants.SCOPE);
					}
//					else if ("playedRole".equals(derivation.getAssociationEndName())) {
//						HL7ResourceUtil.applyRIMStereotype(umlAssociation, IRIMProfileConstants.PLAYER);
//					}
					
					break;
				}
			}
		}
		
		return umlAssociation;
	}
	
	private int addChoiceItems(StaticModel mifModel, Association umlAssociation, 
			List<AssociationEndSpecialization> choiceItems, int index) {
		Stereotype choiceContent = 
			HL7ResourceUtil.applyHDFStereotype(umlAssociation, IHDFProfileConstants.CHOICE_CONTENT);
		
		for (AssociationEndSpecialization choiceItem : choiceItems) {
			Classifier choiceClass = resolveMIFClassReference(mifModel, choiceItem.getClassName());

			if (choiceClass != null) {
				String member = IHDFProfileConstants.CHOICE_MEMBERS + "[" + index++ + "]";
				String choiceTarget = member + NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_TARGET;
				String traversalName = member + NamedElement.SEPARATOR + IHDFProfileConstants.TRAVERSAL_NAME;
				umlAssociation.setValue(choiceContent, choiceTarget, choiceClass);
				umlAssociation.setValue(choiceContent, traversalName, choiceItem.getTraversalName());

				// may be nested choice items if a choice group member is also a choice group
				// ?!?! nested choices refer to specialization class by name, in order that they appear
				if (choiceItem.getChoiceItem().size() > 0) {
					HL7ResourceUtil.applyHDFStereotype(choiceClass, IHDFProfileConstants.CHOICE_GROUP);
					index = addChoiceItems(choiceClass, umlAssociation, choiceItem.getChoiceItem(), index);
				}
			}
		}
		return index;
	}

	private int addChoiceItems(Classifier parentClass, Association umlAssociation, 
			List<AssociationEndSpecialization> choiceItems, int index) {
		Stereotype choiceContent = 
			HL7ResourceUtil.applyHDFStereotype(umlAssociation, IHDFProfileConstants.CHOICE_CONTENT);
		
		List specializations = parentClass.getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
		List<Class> specificTypes = new ArrayList<Class>();
		for (Iterator iter = specializations.iterator(); iter.hasNext();) {
			Generalization generalization = (Generalization) iter.next();
			Class choiceMember = (Class) generalization.getSpecific();
			specificTypes.add(choiceMember);
		}
		
		for (int i = 0; i < choiceItems.size(); i++) {

			AssociationEndSpecialization choiceItem = choiceItems.get(i);

			Class choiceClass = null;

			if (i < specificTypes.size()) {

				choiceClass = specificTypes.get(i);
		
				if (!choiceClass.getName().equals(choiceItem.getClassName())) {
					choiceClass = null;
				}
			}
			if (choiceClass == null) {

				diagnostics.error("Cannot resolve choice item reference '" + choiceItem.getTraversalName() + " of type " + choiceItem.getClassName() + "' in package '" + umlAssociation.getNearestPackage().getName() + "' from choice group",
						parentClass);
			}
			String member = IHDFProfileConstants.CHOICE_MEMBERS + "[" + index++ + "]";
			String choiceTarget = member + NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_TARGET;
			String traversalName = member + NamedElement.SEPARATOR + IHDFProfileConstants.TRAVERSAL_NAME;
			umlAssociation.setValue(choiceContent, choiceTarget, choiceClass);
			umlAssociation.setValue(choiceContent, traversalName, choiceItem.getTraversalName());

			// may be nested choice items if a choice group member is also a choice group
			// ?!?! nested choices refer to specialization class by name, in order that they appear
			if (choiceItem.getChoiceItem().size() > 0 && choiceClass != null) {
				HL7ResourceUtil.applyHDFStereotype(choiceClass, IHDFProfileConstants.CHOICE_GROUP);
				index = addChoiceItems(choiceClass, umlAssociation, choiceItem.getChoiceItem(), index);
			}
		}
		return index;
	}

	private boolean isMIFAssociationClass(Association umlAssociation) {
		return RIMProfileUtil.isRIMType(umlAssociation, IRIMProfileConstants.PARTICIPATION)
				|| RIMProfileUtil.isRIMType(umlAssociation, IRIMProfileConstants.ACT_RELATIONSHIP)
				|| RIMProfileUtil.isRIMType(umlAssociation, IRIMProfileConstants.ROLE_LINK);
	}
	
	private boolean isAssociationClass(ClassBase mifClass) {
		return transformerOptions.isCreateAssociationClasses()
			&& (isAssociationClass(mifClass, IRIMProfileConstants.PARTICIPATION)
				|| isAssociationClass(mifClass, IRIMProfileConstants.ACT_RELATIONSHIP)
				|| isAssociationClass(mifClass, IRIMProfileConstants.ROLE_LINK));
	}
	
	private boolean isAssociationClass(ClassBase mifClass, String rimClassName) {
		// special case for importing RIM coremif
//		if (rimClassName.equals(mifClass.getName())) {
//			return true;
//		}
		
		// test derivationSupplier
		for (Iterator iter = mifClass.getDerivedFrom().iterator(); iter.hasNext();) {
			ClassDerivation derivation = (ClassDerivation) iter.next();
			if (rimClassName.equals(derivation.getClassName())) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean hasOwnedAttributes(ClassBase mifClass) {
		// has non-structural attributes
		for (Iterator iter = mifClass.getAttribute().iterator(); iter.hasNext();) {
			Attribute mifAttribute = (Attribute) iter.next();
			if (!isStereotypeProperty(mifAttribute)) {
				return true;
			}
		}
		
		//TODO has associations from this AssociationClass
		
		return false;
	}
	
	private boolean isStereotypeProperty(Attribute mifAttribute) {
		return !transformerOptions.isCreateStructuralAttributes()
				&& RIMUtil.isStructuralAttribute(mifAttribute.getName());
	}

	protected void setModelMetadata(StaticModel mifModel, Package umlPackage) {
		Stereotype hdfPackage = 
			HL7ResourceUtil.applyHDFStereotype(umlPackage, IHDFProfileConstants.HDF_PACKAGE);
		
		if (mifModel.isSetConformanceLevel()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_CONFORMANCE_LEVEL, 
					mifModel.getConformanceLevel().getLiteral());
		}
		if (mifModel.isSetPackageKind()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_KIND, 
					mifModel.getPackageKind().getLiteral());
		}
		if (mifModel.getTitle() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_TITLE, 
					mifModel.getTitle());
		}
		
		setPackageMetadata(mifModel, umlPackage);
	}

	protected void setPackageMetadata(org.openhealthtools.mdht.emf.hl7.mif2.Package mifPackage, Package umlPackage) {
		Stereotype hdfPackage = 
			HL7ResourceUtil.applyHDFStereotype(umlPackage, IHDFProfileConstants.HDF_PACKAGE);
		PackageRef pkgLocation = mifPackage.getPackageLocation();

		setBusinessNames(umlPackage, hdfPackage, mifPackage.getBusinessName());
		
		if (pkgLocation.getRealmNamespace() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_REALM_NAMESPACE, 
					pkgLocation.getRealmNamespace());
		}
		if (pkgLocation.isSetRoot()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_ROOT, 
					pkgLocation.getRoot().getLiteral());
		}
		if (pkgLocation.isSetArtifact()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_ARTIFACT, 
					pkgLocation.getArtifact().getLiteral());
		}
		if (pkgLocation.isSetSubArtifact()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_SUB_ARTIFACT, 
					pkgLocation.getSubArtifact().getLiteral());
		}
		if (pkgLocation.isSetDomain()) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_DOMAIN, 
					pkgLocation.getDomain().getLiteral());
		}
		if (pkgLocation.getSection() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_SECTION, 
					pkgLocation.getSection());
		}
		if (pkgLocation.getSubSection() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_SUB_SECTION, 
					pkgLocation.getSubSection());
		}
		if (pkgLocation.getId() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_ID, 
					new Long(pkgLocation.getId().longValue()));
		}
		if (pkgLocation.getCombinedId() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_COMBINED_ID, 
					pkgLocation.getCombinedId());
		}
		if (pkgLocation.getVersion() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_VERSION, 
					pkgLocation.getVersion());
		}
		if (pkgLocation.getReleaseDate() != null) {
			umlPackage.setValue(hdfPackage, IHDFProfileConstants.PACKAGE_RELEASE_DATE, 
					pkgLocation.getReleaseDate().toString());
		}
		
	}
	
	protected void setMultiplicity(DatatypeOperation operation, MultiplicityElement element) {
		BigInteger lower = operation.getMinimumMultiplicity();
		Object upper = operation.getMaximumMultiplicity();
		if (lower != null) {
			element.setLower(lower.intValue());
		}
		
		if (upper instanceof BigInteger) {
			element.setUpper(((BigInteger)upper).intValue());
		}
		else if (upper instanceof UnlimitedMultiplicity) {
			element.setUpper(LiteralUnlimitedNatural.UNLIMITED);
		}

		DatatypeRef datatypeRef = operation.getType();
		if (datatypeRef != null) {
			if ("SET".equals(datatypeRef.getName())) {
				element.setIsUnique(true);
				element.setIsOrdered(false);
			}
			else if ("BAG".equals(datatypeRef.getName())) {
				element.setIsUnique(false);
				element.setIsOrdered(false);
			}
			else if ("LIST".equals(datatypeRef.getName())) {
				element.setIsUnique(false);
				element.setIsOrdered(true);
			}
		}
	}
	
	protected void setPropertyData(DatatypeOperation operation, Property umlProperty) {
		setMultiplicity(operation, umlProperty);
		
		Stereotype hl7Stereotype = 
			HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.HDF_ATTRIBUTE);

		setBusinessNames(umlProperty, hl7Stereotype, operation.getBusinessName());
			
		if (operation.getMinimumLength() != null) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.MINIMUM_LENGTH, 
					((BigInteger)operation.getMinimumLength()).intValue());
		}

		if (operation.getMaximumLength() != null) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.MAXIMUM_LENGTH, 
					((BigInteger)operation.getMaximumLength()).intValue());
		}

		if (operation.isIsMandatory()) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.IS_MANDATORY, Boolean.TRUE);
		}

		if (operation.getSortKey() != null && operation.getSortKey().length() > 0) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.SORT_KEY, 
					operation.getSortKey());
		}

		if (operation.getConformance() != null) {
			ConformanceKind conformance = operation.getConformance();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.CONFORMANCE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(conformance.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.CONFORMANCE, 
							literal);
				}
			}
		}
		
		if (operation.getDefaultFrom() != null) {
			DefaultDeterminerKind defaultFrom = operation.getDefaultFrom();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.DEFAULT_DETERMINER_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(defaultFrom.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.DEFAULT_FROM, 
							literal);
				}
			}
		}

		String mifValue = null;
		if (operation.getVocabularySpecification() != null) {
			// set vocabulary domain constraint
			VocabularySpecification vocabulary = operation.getVocabularySpecification();
			mifValue = setVocabularySpecification(vocabulary, umlProperty);
		}

		// if an explicit fixed or default value available, override the vocabulary as UML default
		if (operation.getFixedValue() != null) {
			mifValue = operation.getFixedValue();
			umlProperty.setIsReadOnly(true);
		}
		else if (operation.getDefaultValue() != null) {
			mifValue = operation.getDefaultValue();
		}
		
		if (mifValue != null) {
			OpaqueExpression expression = (OpaqueExpression) umlProperty
					.createDefaultValue(null, umlProperty.getType(), 
							UMLPackage.Literals.OPAQUE_EXPRESSION);
			expression.getBodies().add(mifValue);
		}
	}
	
	protected void setPropertyData(Attribute mifAttribute, Property umlProperty) {
//		StaticModelBase mifModel = MIFUtil.getPackage(mifAttribute);
		Stereotype hl7Stereotype = 
			HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.HDF_ATTRIBUTE);
		
		BigInteger lower = mifAttribute.getMinimumMultiplicity();
		Object upper = mifAttribute.getMaximumMultiplicity();
		if (lower != null) {
			umlProperty.setLower(lower.intValue());
		}
		
		if (upper instanceof BigInteger) {
			umlProperty.setUpper(((BigInteger)upper).intValue());
		}
		else if (upper instanceof UnlimitedMultiplicity) {
			umlProperty.setUpper(LiteralUnlimitedNatural.UNLIMITED);
		}

//		for (Iterator iter = mifAttribute.getDerivationSupplier().iterator(); iter.hasNext();) {
//			AttributeDerivation derivation = (AttributeDerivation) iter.next();
//			if (isRIMDerivation(derivation, mifModel)) {
//				Property rimProperty = findRIMProperty(derivation.getClassName(), derivation.getAttributeName());
//				if (rimProperty.getOwner() != null) {
//					// use when supplier is stored in stereotype property
////					List rimDerivations = Collections.singletonList(rimProperty);
////					umlProperty.setValue(hl7Stereotype, 
////							IHDFProfileConstants.DERIVATION_SUPPLIER, rimDerivations);
//
//					umlProperty.getRedefinedProperties().add(rimProperty);
//					if (!rimProperty.isConsistentWith(umlProperty)) {
//						diagnostics.warning("Invalid property redefinition from '" + umlProperty 
//								+ "' to", rimProperty.getQualifiedName());
//					}
//				}
//			}
//			break;
//		}

		setBusinessNames(umlProperty, hl7Stereotype, mifAttribute.getBusinessName());
			
		if (mifAttribute.isIsImmutable()) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.IS_IMMUTABLE, Boolean.TRUE);
			
			// all structural attributes are optional in HL7 schemas even if not modeled that way
//			umlProperty.setLower(0);
		}

		if (mifAttribute.getMinimumLength() != null) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.MINIMUM_LENGTH, 
					((BigInteger)mifAttribute.getMinimumLength()).intValue());
		}

		if (mifAttribute.getMaximumLength() != null) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.MAXIMUM_LENGTH, 
					((BigInteger)mifAttribute.getMaximumLength()).intValue());
		}

		if (mifAttribute.isIsMandatory()) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.IS_MANDATORY, Boolean.TRUE);
		}

		if (mifAttribute.getSortKey() != null && mifAttribute.getSortKey().length() > 0) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.SORT_KEY, 
					mifAttribute.getSortKey());
		}

		if (mifAttribute.isSetConformance() && mifAttribute.getConformance() != null) {
			ConformanceKind conformance = mifAttribute.getConformance();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.CONFORMANCE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(conformance.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.CONFORMANCE, 
							literal);
				}
			}
		}
		
		if (mifAttribute.isSetDefaultFrom() && mifAttribute.getDefaultFrom() != null) {
			DefaultDeterminerKind defaultFrom = mifAttribute.getDefaultFrom();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.DEFAULT_DETERMINER_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(defaultFrom.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.DEFAULT_FROM, 
							literal);
				}
			}
		}

//TODO remove from profile???
//		if (mifAttribute.isReferenceHistory()) {
//			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.REFERENCE_HISTORY, Boolean.TRUE);
//		}

		if (mifAttribute.isSetUpdateModeDefault()
				&& mifAttribute.getUpdateModeDefault() != null) {
			UpdateModeKind updateMode = mifAttribute.getUpdateModeDefault();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.UPDATE_MODE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(updateMode.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.UPDATE_MODE_DEFAULT, 
							literal);
				}
			}
		}

		if (mifAttribute.getUpdateModesAllowed() != null
				&& !mifAttribute.getUpdateModesAllowed().isEmpty()) {
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.UPDATE_MODE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				List updateModes = new ArrayList();
				for (Iterator iter = mifAttribute.getUpdateModesAllowed().iterator(); iter.hasNext();) {
					UpdateModeKind updateMode = (UpdateModeKind) iter.next();
					EnumerationLiteral literal = hl7Enum.getOwnedLiteral(updateMode.getName());
					if (literal != null) {
						updateModes.add(literal);
					}
				}
				if (!updateModes.isEmpty()) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.UPDATE_MODES_ALLOWED, 
							updateModes);
				}
			}
		}

		String mifValue = null;
		if (mifAttribute.getVocabulary() != null) {
			// set vocabulary domain constraint
			VocabularySpecification vocabulary = mifAttribute.getVocabulary();
			
			// to set vocabulary constraint as UML default value, uncomment this line
//			mifValue = setVocabularySpecification(vocabulary, umlProperty);
			setVocabularySpecification(vocabulary, umlProperty);
		}

		// if an explicit fixed or default value available, override the vocabulary as UML default
		if (mifAttribute.getFixedValue() != null) {
			mifValue = mifAttribute.getFixedValue();
			umlProperty.setIsReadOnly(true);
		}
		else if (mifAttribute.getDefaultValue() != null) {
			mifValue = mifAttribute.getDefaultValue();
		}
		
		if (mifValue != null) {
			OpaqueExpression expression = (OpaqueExpression) umlProperty
					.createDefaultValue(null, umlProperty.getType(), 
							UMLPackage.Literals.OPAQUE_EXPRESSION);
			expression.getBodies().add(mifValue);
		}
		
		DatatypeRef datatypeRef = mifAttribute.getType();
		if (datatypeRef != null) {
			if ("SET".equals(datatypeRef.getName())) {
				umlProperty.setIsUnique(true);
				umlProperty.setIsOrdered(false);
			}
			else if ("BAG".equals(datatypeRef.getName())) {
				umlProperty.setIsUnique(false);
				umlProperty.setIsOrdered(false);
			}
			else if ("LIST".equals(datatypeRef.getName())) {
				umlProperty.setIsUnique(false);
				umlProperty.setIsOrdered(true);
			}
		}
	}

	protected String setVocabularySpecification(VocabularySpecification vocabulary, Property umlProperty) {
		String stringValue = null;
		
		if (vocabulary.getConceptDomain() != null) {
			stringValue = vocabulary.getConceptDomain().getName();
			
			Stereotype constraint = 
				HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
			if (constraint != null) {
				umlProperty.setValue(constraint, IHDFProfileConstants.CONCEPT_DOMAIN_NAME, 
						vocabulary.getConceptDomain().getName());
			}
		}

		if (vocabulary.getCode() != null) {
			stringValue = vocabulary.getCode().getCode();
			
			Stereotype constraint = 
				HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
			if (constraint != null) {
				umlProperty.setValue(constraint, IHDFProfileConstants.CODE_SYSTEM_OID, 
						vocabulary.getCode().getCodeSystem());
				umlProperty.setValue(constraint, IHDFProfileConstants.CODE_SYSTEM_NAME, 
						vocabulary.getCode().getCodeSystemName());
				if (vocabulary.getCode().getCodeSystemVersion() != null) {
					umlProperty.setValue(constraint, IHDFProfileConstants.CODE_SYSTEM_VERSION, 
							vocabulary.getCode().getCodeSystemVersion().toString());
				}
				umlProperty.setValue(constraint, IHDFProfileConstants.CODE, 
						vocabulary.getCode().getCode());
				umlProperty.setValue(constraint, IHDFProfileConstants.CODE_PRINT_NAME, 
						vocabulary.getCode().getCodePrintName());
			}
		}

		if (vocabulary.getValueSet() != null) {
			stringValue = vocabulary.getValueSet().getName();
			
			Stereotype constraint = 
				HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
			if (constraint != null) {
				umlProperty.setValue(constraint, IHDFProfileConstants.VALUE_SET_OID, 
						vocabulary.getValueSet().getId());
				umlProperty.setValue(constraint, IHDFProfileConstants.VALUE_SET_NAME, 
						vocabulary.getValueSet().getName());
				umlProperty.setValue(constraint, IHDFProfileConstants.VALUE_SET_MINIMUM_OID, 
						vocabulary.getValueSet().getMinimumValueSet());
				umlProperty.setValue(constraint, IHDFProfileConstants.VALUE_SET_IGNORED_OID, 
						vocabulary.getValueSet().getIgnoredValueSet());
				umlProperty.setValue(constraint, IHDFProfileConstants.VALUE_SET_ROOT_CODE, 
						vocabulary.getValueSet().getRootCode());

				if (vocabulary.getValueSet().getVersionDate() != null) {
					umlProperty.setValue(constraint,
							IHDFProfileConstants.VALUE_SET_VERSION_DATE,
							vocabulary.getValueSet().getVersionDate().toString());
				}
				if (vocabulary.getValueSet().isSetCodingStrength()
						&& vocabulary.getValueSet().getCodingStrength() != null) {
					Enumeration hl7Enum = (Enumeration) constraint.getProfile().getOwnedMember(
							IHDFProfileConstants.CODING_STRENGTH_KIND, false, UMLPackage.Literals.ENUMERATION);
					if (hl7Enum != null) {
						EnumerationLiteral literal = hl7Enum.getOwnedLiteral(vocabulary.getValueSet().getCodingStrength().getName());
						if (literal != null) {
							umlProperty.setValue(constraint, 
									IHDFProfileConstants.VALUE_SET_CODING_STRENGTH, 
									literal);
						}
					}
				}
				if (vocabulary.getValueSet().isSetRevisionFrequency()
						&& vocabulary.getValueSet().getRevisionFrequency() != null) {
					Enumeration hl7Enum = (Enumeration) constraint.getProfile().getOwnedMember(
							IHDFProfileConstants.REVISION_FREQUENCY_KIND, false, UMLPackage.Literals.ENUMERATION);
					if (hl7Enum != null) {
						EnumerationLiteral literal = hl7Enum.getOwnedLiteral(vocabulary.getValueSet().getRevisionFrequency().getName());
						if (literal != null) {
							umlProperty.setValue(constraint, 
									IHDFProfileConstants.VALUE_SET_REVISION_FREQUENCY, 
									literal);
						}
					}
				}
			}
		}
		
		return stringValue;
	}
	
	protected void setPropertyData(AssociationEndBase assocEnd, Property umlProperty) {
		Stereotype hl7Stereotype = 
			HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.HDF_ASSOCIATION_END);
		
		BigInteger lower = assocEnd.getMinimumMultiplicity();
		Object upper = assocEnd.getMaximumMultiplicity();
		if (lower != null) {
			umlProperty.setLower(lower.intValue());
		}
		
		if (upper instanceof BigInteger) {
			umlProperty.setUpper(((BigInteger)upper).intValue());
		}
		else if (upper instanceof UnlimitedMultiplicity) {
			umlProperty.setUpper(LiteralUnlimitedNatural.UNLIMITED);
		}

		setBusinessNames(umlProperty, hl7Stereotype, assocEnd.getBusinessName());
			
		if (assocEnd.isIsMandatory()) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.IS_MANDATORY, Boolean.TRUE);
		}

		if (assocEnd.getSortKey() != null && assocEnd.getSortKey().length() > 0) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.SORT_KEY, 
					assocEnd.getSortKey());
		}

		if (assocEnd.isSetConformance() && assocEnd.getConformance() != null) {
			ConformanceKind conformance = assocEnd.getConformance();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.CONFORMANCE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(conformance.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.CONFORMANCE, 
							literal);
				}
			}
		}

		if (assocEnd.isReferenceHistory()) {
			umlProperty.setValue(hl7Stereotype, IHDFProfileConstants.REFERENCE_HISTORY, Boolean.TRUE);
		}

		if (assocEnd.isSetUpdateModeDefault()
				&& assocEnd.getUpdateModeDefault() != null) {
			UpdateModeKind updateMode = assocEnd.getUpdateModeDefault();
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.UPDATE_MODE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				EnumerationLiteral literal = hl7Enum.getOwnedLiteral(updateMode.getName());
				if (literal != null) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.UPDATE_MODE_DEFAULT, 
							literal);
				}
			}
		}

		if (assocEnd.getUpdateModesAllowed() != null
				&& !assocEnd.getUpdateModesAllowed().isEmpty()) {
			Enumeration hl7Enum = (Enumeration) hl7Stereotype.getProfile().getOwnedMember(
					IHDFProfileConstants.UPDATE_MODE_KIND, false, UMLPackage.Literals.ENUMERATION);
			if (hl7Enum != null) {
				List updateModes = new ArrayList();
				for (Iterator iter = assocEnd.getUpdateModesAllowed().iterator(); iter.hasNext();) {
					UpdateModeKind updateMode = (UpdateModeKind) iter.next();
					EnumerationLiteral literal = hl7Enum.getOwnedLiteral(updateMode.getName());
					if (literal != null) {
						updateModes.add(literal);
					}
				}
				if (!updateModes.isEmpty()) {
					umlProperty.setValue(hl7Stereotype, 
							IHDFProfileConstants.UPDATE_MODES_ALLOWED, 
							updateModes);
				}
			}
		}

	}
	
	protected void setPropertyRedefinition(Attribute mifAttribute, Property umlProperty) {
		/*
		 * UML redefinition is not necessary for attributes because then name is not changed in redefinition,
		 * and we can simply use name to find redefined superclass attribute.
		 */
	}

	protected void setPropertyRedefinition(AssociationEndBase assocEnd, Property umlProperty) {
		StaticModelBase mifModel = MIFUtil.getStaticModel(assocEnd);
		setPropertyRedefinition(mifModel, assocEnd.getDerivedFrom(), umlProperty);
	}

	protected void setPropertyRedefinition(NonTraversableAssociationEnd assocEnd, Property umlProperty) {
		StaticModelBase mifModel = MIFUtil.getStaticModel(assocEnd);
		setPropertyRedefinition(mifModel, assocEnd.getDerivedFrom(), umlProperty);
	}

	private void setPropertyRedefinition(StaticModelBase mifModel, List<AssociationEndDerivation> derivations, Property umlProperty) {
		for (AssociationEndDerivation derivation : derivations) {
			if (isRIMDerivation(derivation, mifModel)) {
				String rimClassName = derivation.getClassName();
				String rimPropertyName = derivation.getAssociationEndName();

				Property rimProperty = RIMUtil.getRIMProperty(umlProperty.getNearestPackage(), 
						rimClassName, rimPropertyName);
				if (rimProperty != null) {
					if (isMIFAssociationClass(umlProperty.getAssociation())
							|| umlProperty.getOwner() instanceof Association
							|| !rimProperty.isConsistentWith(umlProperty)) {
						// supplier derivation must be stored in stereotype property
						Stereotype hl7Stereotype = 
							HL7ResourceUtil.applyHDFStereotype(umlProperty, IHDFProfileConstants.HDF_ASSOCIATION_END);
						List rimDerivations = Collections.singletonList(rimProperty);
						umlProperty.setValue(hl7Stereotype, 
								IHDFProfileConstants.DERIVATION_SUPPLIER, rimDerivations);
					}
					else {
						umlProperty.getRedefinedProperties().add(rimProperty);
						if (!rimProperty.isConsistentWith(umlProperty)) {
							diagnostics.warning("Invalid property redefinition from '" 
									+ umlProperty.getQualifiedName() + " : " 
										+ ((umlProperty.getType()==null)?"null":umlProperty.getType().getName())
									+ "' to '" 
									+ rimProperty.getQualifiedName() + " : " 
										+ ((rimProperty.getType()==null)?"null":rimProperty.getType().getName())
									+ "'", null);
						}
					}
				}
			}

			// add "source" or "target" keyword for diagram display
			if ((IRIMProfileConstants.ACT_RELATIONSHIP.equals(derivation.getClassName())
						|| IRIMProfileConstants.ROLE_LINK.equals(derivation.getClassName()))) {
				umlProperty.addKeyword(derivation.getAssociationEndName());
			}
			
			break;
		}
	}
	
	protected boolean isRIMDerivation(ClassDerivation derivation, StaticModelBase mifModel) {
		if (mifModel == null)
			return false;
		
		String derivationId = derivation.getStaticModelDerivationId();
		for (Iterator iter = mifModel.getDerivedFrom().iterator(); iter.hasNext();) {
			StaticModelDerivation modelDerivation = (StaticModelDerivation) iter.next();
			if (modelDerivation.getStaticModelDerivationId().equals(derivationId)
					&& "RIM".equals(modelDerivation.getTargetStaticModel().getArtifact().getName())) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	/**
	 * pushIFCAnnotation is preliminary solution for cmet support for importing
	 * and exporting models.
	 * 
	 * Currently there are two annotations because of import/export issues The
	 * model has a complete mapping of all cmets within the model. This is
	 * problematic because as the underlying uml model is updated the cmet
	 * mapping will not stay in synch. The correct place annotation is on the
	 * class itself which is done by tagifc.
	 * 
	 * TODO Finalize CMET support
	 * 
	 * @param cmetName
	 * @param mifClass
	 */
	private void pushIFCAnnotation(String cmetName,ClassBase mifClass )
	{
		// local hidden constant until cmet support finalized
		final String IFC_ANNOTATION_SOURCE = "org.openhealthtools.mdht.uml.hl7.mif2uml.ifc";	
		EAnnotation ifcAnnotation =  umlModel.getEAnnotation(IFC_ANNOTATION_SOURCE);
		
		if (ifcAnnotation == null)
		{
			ifcAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			ifcAnnotation.setSource(IFC_ANNOTATION_SOURCE);
			umlModel.getEAnnotations().add(ifcAnnotation);
			
		}
		
		
		Classifier classifier = (Classifier) getMappingEntry(mifClass);
		
		if (classifier != null)
		{
			if (!ifcAnnotation.getDetails().contains(classifier.getQualifiedName())){
			ifcAnnotation.getDetails().put(classifier.getQualifiedName(), cmetName);
			}
		}	
		

		
	}
	
	
	/**
	 * tagIFC adds the cmet value from mif to the class so during export the
	 * resulting mif model file will contain the encoded cmet name versus the
	 * class name from the uml model.
	 * 
	 * @param classifier
	 * @param cmetName
	 */
	private void tagIFC(Classifier classifier, String cmetName)
	{
		// local hidden constant until cmet support finalized
		final String IFC_ANNOTATION_SOURCE = "org.openhealthtools.mdht.uml.hl7.mif2uml.ifc";	
		
		if (classifier != null) {
			EAnnotation ifcAnnotation = classifier.getEAnnotation(IFC_ANNOTATION_SOURCE);

			if (ifcAnnotation == null) {
				ifcAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				ifcAnnotation.setSource(IFC_ANNOTATION_SOURCE);
				classifier.getEAnnotations().add(ifcAnnotation);
			}

			ifcAnnotation.getDetails().put(cmetName, null);
		} else
		{
			diagnostics.warning("Unable to properly add CMET annotation "+cmetName +"  claissifier is null", null);			
		}
		
		
	}
	
	private ClassBase getCommonModelClass(StaticModelBase mifModel, String name) {
		ClassBase mifClass = null;
		try {
			if (cmeUtil == null) {
				cmeUtil = new CommonModelElements(mifModel, diagnostics);
			}
			CommonModelElementDefinition cme = cmeUtil.resolveCommonModelElement(name);
			if (cme != null) {
				StaticModel cmeModel = cmeUtil.resolveCommonModel(cme);
				
				if (cmeModel != null) {
					// import the referenced model into a UML package
					doSwitch(cmeModel);
					
					mifClass = cmeUtil.resolveCommonModelClass(cme, cmeModel);
									
					pushIFCAnnotation(name,mifClass);
					
				}
			}
		}
		catch (Exception e) {
			diagnostics.error("Error resolving CMET: " + e.getLocalizedMessage() + e.getClass().getCanonicalName(),  null);
			
			e.printStackTrace();
			
		}
		
		return mifClass;
	}

	protected ClassBase resolveMIFClassBase(StaticModel mifModel, String className) {
		ClassBase mifParticipant = null;
		if (mifModel != null) {
			mifParticipant = MIFUtil.getClassByName(mifModel, className);
			if (mifParticipant == null) {
				// look for a CMET reference
				mifParticipant = getCommonModelClass(mifModel, className);
			}
		}
		
		return mifParticipant;
	}

	protected Classifier resolveMIFClassReference(StaticModel mifModel, String className) {
		Classifier classifier = null;
		
		boolean isCMET = false;
		if (mifModel != null) {
			ClassBase mifParticipant = MIFUtil.getClassByName(mifModel, className);
			if (mifParticipant == null) {
				// look for a CMET reference
				mifParticipant = getCommonModelClass(mifModel, className);
				isCMET = true;
			}
			if (mifParticipant != null) {
				classifier = (Classifier) getMappingEntry(mifParticipant);
				
				if (isCMET)
				{
					// tag the resulting class as a cmet ref
					tagIFC( classifier, className);
				}
			}
		}

//		if (classifier == null && !unresolvedClassNames.contains(className)) {
		if (classifier == null) {
			unresolvedClassNames.add(className);
			diagnostics.error("Cannot resolve MIF association end type '" + className 
					+ "' in model '" + MIFUtil.getModelName(mifModel) + "'",  null);
		}
		
		return classifier;
	}

	protected Classifier resolveDatatypeReference(DatatypeRef datatypeRef) {
		if (datatypeRef == null)
			return null;

		Classifier umlClassifier = (Classifier) getMappingEntry(datatypeRef);
		if (umlClassifier != null)
			return umlClassifier;
		
		if (transformerOptions.isSuppressDatatypeCollections()
				&& ("BAG".equals(datatypeRef.getName())
					|| "SET".equals(datatypeRef.getName())
					|| "LIST".equals(datatypeRef.getName()))
				&& (datatypeRef.getArgumentDatatype().size() == 1)) {
			return resolveDatatypeReference(datatypeRef.getArgumentDatatype().get(0));
		}

		// Is this reference to a template parameter?
		if (DatatypeQualifierKind.PARAMETER == datatypeRef.getQualifier()
				|| DatatypeQualifierKind.PARAMETER_DIFF == datatypeRef.getQualifier()) {
			// This must reference a parameter on the containing Datatype definition, or parents
			Datatype mifDatatype = MIFUtil.getContainingDatatype(datatypeRef);
			Classifier umlDatatype = (Classifier) caseDatatype(mifDatatype);
			Classifier parameteredElement = getParameteredElement(umlDatatype, datatypeRef.getName());
			if (parameteredElement != null) {
				return parameteredElement;
			}
			else {
				diagnostics.error("Cannot find template parameter reference '" 
						+ datatypeRef.getName() + "' in", umlDatatype);
				return null;
			}
		}

		String name = MIFUtil.getDatatypeName(datatypeRef);
		
		// Is this datatypeRef used within a DatatypeModelLibrary?
		DatatypeModelLibrary library = MIFUtil.getDatatypeLibrary(datatypeRef);
		if (library != null) {
			Datatype mifDatatype = MIFUtil.getDatatypeByName(library, name);
			if (mifDatatype != null) {
				umlClassifier = (Classifier) caseDatatype(mifDatatype);
			}

			if (umlClassifier == null && !datatypeRef.getArgumentDatatype().isEmpty()) {
				// try the underscore name pattern
				String underscoreName = MIFUtil.getUnderscoreDatatypeName(datatypeRef);
				mifDatatype = MIFUtil.getDatatypeByName(library, underscoreName);
				if (mifDatatype != null) {
					umlClassifier = (Classifier) caseDatatype(mifDatatype);
				}
			}
		}

		// Is this a template binding?
		if (umlClassifier == null && !datatypeRef.getArgumentDatatype().isEmpty()) {
			return createTemplateBinding(datatypeRef);
		}

		// else, look in the imported HL7 datatypes libraries
		if (umlClassifier == null) {
			umlClassifier = DatatypeUtil.getDatatypeByName(umlModel, name);
		}

		return umlClassifier;
	}

	/**
	 * Find a parameter element by name within the given template.
	 * 
	 * @param template
	 * @param name
	 * @return
	 */
	protected Classifier getParameteredElement(Classifier template, String name) {
		if (template != null && template.isTemplate()) {
			List<Classifier> allParents = new ArrayList<Classifier>(template.allParents());
			allParents.add(0, template);
			for (Classifier classifier : allParents) {
				TemplateSignature signature = classifier.getOwnedTemplateSignature();
				if (signature != null) {
					for (TemplateParameter param : signature.getParameters()) {
						// find matching parameter, allows for multiple parameters
						if (param.getParameteredElement() instanceof Classifier
								&& name.equals(((Classifier)param.getParameteredElement()).getName())) {
							return (Classifier) param.getParameteredElement();
						}
					}
				}
			}
		}
		
		return null;
	}

	protected Classifier createTemplateBinding(DatatypeRef datatypeRef) {
		if (datatypeRef == null)
			return null;

		Package umlPackage = (Package) umlPackageStack.peek();
		String boundName = MIFUtil.getDatatypeName(datatypeRef);
		Classifier umlClassifier = null;

		// find containing classifier for creating nested binding
		EObject mifContainer = MIFUtil.getContainingClassifier(datatypeRef);
		if (mifContainer != null) {
			Object umlContainer = doSwitch(mifContainer);
			if (umlContainer instanceof Interface) {
				// check if existing nested classifier for this template binding
//				umlClassifier = ((Interface)umlContainer).getNestedClassifier(boundName);
				umlClassifier = (Classifier) umlPackage.getOwnedType(boundName);
				
				if (umlClassifier != null)
					return umlClassifier;
				else {
//					umlClassifier = ((Interface)umlContainer).createNestedClassifier(
//							boundName, UMLPackage.eINSTANCE.getInterface());
					umlClassifier = umlPackage.createOwnedInterface(boundName);
				}
			}
			else if (umlContainer instanceof Class) {
//				umlClassifier = ((Class)umlContainer).getNestedClassifier(boundName);
				umlClassifier = (Classifier) umlPackage.getOwnedType(boundName);
				
				if (umlClassifier != null)
					return umlClassifier;
				else {
//					umlClassifier = ((Class)umlContainer).createNestedClassifier(
//							boundName, UMLPackage.eINSTANCE.getClass_());
					umlClassifier = umlPackage.createOwnedClass(boundName, false);
				}
			}
		}
		
//		// Is this binding to a template parameter?
//		DatatypeRef firstArg = datatypeRef.getArgumentDatatype().get(0);
//		if (DatatypeQualifierKind.PARAMETER == firstArg.getQualifier()
//				|| DatatypeQualifierKind.PARAMETER_DIFF == firstArg.getQualifier()) {
//			Datatype containingDT = MIFUtil.getContainingDatatype(datatypeRef);
//			Classifier umlDatatype = (Classifier) caseDatatype(containingDT);
//			if (umlDatatype != null && umlDatatype instanceof Interface) {
//				umlClassifier = ((Interface)umlDatatype).createNestedClassifier(
//						boundName, UMLPackage.eINSTANCE.getInterface());
//			}
//		}
		if (umlClassifier == null) {
			umlClassifier = umlPackage.createOwnedInterface(boundName);
		}
		
		// Don't add a global mapping entry for bindings, look only in nearest package
//		addMappingEntry(datatypeRef, umlClassifier);
		
		UMLUtil.setEObjectID(umlClassifier);
//		System.out.println("Creating binding: " + umlClassifier.getQualifiedName());

		Classifier target = null;
		// Is this datatypeRef used within a DatatypeModelLibrary?
		DatatypeModelLibrary library = MIFUtil.getDatatypeLibrary(datatypeRef);
		if (library != null) {
			Datatype mifDatatype = MIFUtil.getDatatypeByName(library, datatypeRef.getName());
			if (mifDatatype != null) {
				target = (Classifier) caseDatatype(mifDatatype);
			}
		}
		// else, look in the imported HL7 datatypes libraries
		if (target == null) {
			target = DatatypeUtil.getDatatypeByName(umlModel, datatypeRef.getName());
		}

		if (target != null && target.isTemplate()) {
			List<Classifier> allParents = new ArrayList<Classifier>(target.allParents());
			allParents.add(0, target);
			for (Classifier classifier : allParents) {
				TemplateSignature signature = classifier.getOwnedTemplateSignature();
				if (signature != null && !signature.getOwnedParameters().isEmpty()) {
					TemplateBinding binding = umlClassifier.createTemplateBinding(signature);
					UMLUtil.setEObjectID(binding);
					
					int paramIndex = 0;
					for (DatatypeRef mifArg : datatypeRef.getArgumentDatatype()) {
						TemplateParameterSubstitution substitution = binding.createParameterSubstitution();
						substitution.setFormal(signature.getOwnedParameters().get(paramIndex++));
						
						Classifier umlArg = resolveDatatypeReference(mifArg);
						if (umlArg != null) {
							UMLUtil.setParameterableElement(substitution,umlArg);
//							substitution.getActuals().add(umlArg);
						}
						else {
							diagnostics.error("Cannot find datatype binding argument '" 
									+ mifArg.getName() + "' for", umlClassifier);
						}
					}
					
					break;
				}
			}
		}
		else {
			if (target == null)
				diagnostics.error("Cannot find datatype reference binding target '" 
					+ datatypeRef.getName() + "' for", umlClassifier);
			else
				diagnostics.error("Datatype binding target is not a template '" 
						+ datatypeRef.getName() + "' for", umlClassifier);
		}
		
		return umlClassifier;
	}

	protected void setBusinessNames(Element umlElement, Stereotype hdfStereotype, List<BusinessName> businessNames) {
		for (int index=0; index<businessNames.size(); index++) {
			String member = IHDFProfileConstants.BUSINESS_NAMES + "[" + index + "]";
			String nameProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_NAME;
			String langProperty = member + NamedElement.SEPARATOR + IHDFProfileConstants.BUSINESS_NAME_LANG;

			BusinessName businessName = businessNames.get(index);
			umlElement.setValue(hdfStereotype, nameProperty, businessName.getName());
			umlElement.setValue(hdfStereotype, langProperty, businessName.getLang());
			
			if (index == 0) {
				// assign the first business name to UML alias name, to appear on class diagrams
				UMLUtil.addAliasName(umlElement, businessName.getName());
			}
		}
	}
	
	protected void importComments(Annotations annotations, Element element) {

		if (annotations != null) {
			// If we have documentation, process it
			if (annotations.getDocumentation() != null) {
				// Create Definition Comment
				if (annotations.getDocumentation().getDefinition() != null) {
					importComment(annotations.getDocumentation()
							.getDefinition(), element,
							IHDFProfileConstants.DEFINITION);
				}

				// Create Description Comment
				if (annotations.getDocumentation().getDescription() != null) {
					importComment(annotations.getDocumentation()
							.getDescription(), element,
							IHDFProfileConstants.DESCRIPTION);
				}

				// Create Design Comment
				if (annotations.getDocumentation().getDesignComments() != null) {
					for (DesignComment designComment : annotations
							.getDocumentation().getDesignComments()) {
						importComment(designComment, element,
								IHDFProfileConstants.DESIGN_COMMENTS);

					}

				}

				// Create Other Annotation Comment
				if (annotations.getDocumentation().getOtherAnnotation() != null) {
					for (OtherAnnotation annotation : annotations
							.getDocumentation().getOtherAnnotation()) {

						for (FreeFormMarkupWithLanguage freeFormMarkupWithLanguage : annotation
								.getData()) {

							StringBuffer commentBuffer = new StringBuffer();

							for (FeatureMap.Entry entry : freeFormMarkupWithLanguage
									.getMixed()) {
								if (entry.getValue() instanceof String) {
									commentBuffer.append(entry.getValue());
								}
							}
							createComment(element,
									IHDFProfileConstants.OTHER_ANNOTATION,
									commentBuffer.toString());
						}

					}

				}

				// Create Appendix Comment
				/*
				 * TODO - This logic assumes that there are no embedded tags.
				 * Need to confirm this. SWM
				 */
				if (annotations.getDocumentation().getAppendix() != null) {
					for (Appendix appendix : annotations.getDocumentation()
							.getAppendix()) {
						for (ComplexMarkupWithLanguage complexMarkupWithLanguage : appendix
								.getCombinedText()) {

							StringBuffer commentBuffer = new StringBuffer();

							for (FeatureMap.Entry entry : complexMarkupWithLanguage
									.getMixed()) {
								if (entry.getValue() instanceof String) {
									commentBuffer.append(entry.getValue());
								}
							}
							createComment(element,
									IHDFProfileConstants.APPENDIX,
									commentBuffer.toString());
						}

					}
				}

				// Create Rationale Comment
				if (annotations.getDocumentation().getRationale() != null) {
					importComment(
							annotations.getDocumentation().getRationale(),
							element, IHDFProfileConstants.RATIONALE);
				}

				// Create Requirements Comment
				if (annotations.getDocumentation().getRequirements() != null) {
					importComment(annotations.getDocumentation()
							.getRequirements(), element,
							IHDFProfileConstants.REQUIREMENTS);

				}

				// Create Ussage Constraint Comment
				if (annotations.getDocumentation().getUsageConstraint() != null) {

				}

				// Create Usage Notes Comment
				if (annotations.getDocumentation().getUsageNotes() != null) {
					for (ContextAnnotation annotation : annotations
							.getDocumentation().getUsageNotes()) {
						importComment(annotation, element,
								IHDFProfileConstants.USAGE_NOTES);
					}
				}

				// Create Walkthrough Comment
				if (annotations.getDocumentation().getWalkthrough() != null) {
					importComment(annotations.getDocumentation()
							.getWalkthrough(), element,
							IHDFProfileConstants.WALKTHROUGH);
				}

			}

			// TODO - Do we need to create a formal constraint profile
			// constraint?
			if (annotations.getAppInfo() != null) {

				if (annotations.getAppInfo().getFormalConstraint() != null) {
					for (FormalConstraint mifConstraint : annotations
							.getAppInfo().getFormalConstraint()) {
						importConstraint(mifConstraint, element, null);
					}
				}
			}
		}
	}

	protected void importComment(CascadableAnnotation annotation,
			Element element, String stereotypeName) {

		String commentText = renderCommentFromMIF2(annotation);

		createComment(element, stereotypeName, commentText);

	}

	String temp = new String();;

	protected void createComment(Element element, String stereotypeName,
			String commentText) {
	
		if (commentText.length() > 0) {
			Comment comment = element.createOwnedComment();
			comment.setBody(commentText);

			if (stereotypeName != null) {
				Stereotype stereotype = comment
						.getApplicableStereotype(IHDFProfileConstants.HDF_PROFILE_NAME
								+ "::" + stereotypeName);
				if (stereotype != null) {
					comment.applyStereotype(stereotype);

				}
			}

			try {
				// if running within RSM, add its stereotype
				if (element.getOwnedComments().size() == 1) {

					Stereotype rsaDocStereotype = comment
							.getApplicableStereotype(RSM_DOCUMENTATION_STEREOTYPE_QNAME);
					if (rsaDocStereotype != null
							&& !comment.isStereotypeApplied(rsaDocStereotype)) {

						comment.applyStereotype(rsaDocStereotype);
					}
				}
			} catch (IllegalArgumentException e) {
				// usually due to a UML element not contained by the model
				diagnostics.error(
						"error applying Documentation stereotype to: "
								+ comment.getOwner() + " comment: "
								+ commentText, null);
			}
		}

	}

	protected void importConstraint(FormalConstraint mifConstraint,
			Element element, String stereotypeName) {
		String body = renderCommentFromMIF2(mifConstraint);
		if (body.length() > 0) {
			Constraint constraint = UMLFactory.eINSTANCE.createConstraint();
			UMLUtil.getNearestNamespace(element).getOwnedRules()
					.add(constraint);
			constraint.setName(mifConstraint.getName());
			constraint.getConstrainedElements().add(element);

			OpaqueExpression expression = (OpaqueExpression) constraint
					.createSpecification(null, null,
							UMLPackage.Literals.OPAQUE_EXPRESSION);
			expression.getBodies().add(body);

			if (stereotypeName != null) {
				Stereotype stereotype = constraint
						.getApplicableStereotype(IHDFProfileConstants.HDF_PROFILE_NAME
								+ "::" + stereotypeName);
				if (stereotype != null) {
					constraint.applyStereotype(stereotype);
				}
			}
		}
	}
	
	protected String renderCommentFromMIF2(CascadableAnnotation annotation) {

		CommentSwitch commentSwitch = new CommentSwitch(transformerOptions);

		for (TreeIterator iterator = EcoreUtil.getAllContents(Collections

		.singletonList(annotation)); iterator.hasNext();) {

			EObject child = (EObject) iterator.next();

			// This is the result of duplicate comments in the end result.
			// annotation.getCombinedText() did not seem to iterate correctly to
			// produce the comment
			// TODO - revisit switch to make sure there is not something more
			// general missing with logic
			if (child instanceof ComplexMarkupWithLanguage) {
				commentSwitch.doSwitch(child);
			}
			if (child instanceof FormalConstraint) {
				commentSwitch.doSwitch(child);
			}
		}
		return commentSwitch.getComment();
	}
	
	

}
