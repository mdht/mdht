/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKMSoftware) - initial implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hl7.ui.vocabulary;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.Constraint;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * Mif2VocabularyContentProvider Mif2VocabularyContentProvider supports the
 * browsing of the MIF2 Vocabulary Model as a tree. The current implementation
 * of the vocabulary model in Mif2 is flat in nature versus hierarchical. This
 * requires us to go back to the model itself and query to create the child
 * relationships documented in the MIF2 but not explicit in the XSD.
 * 
 * See HL7 MIF2 Vocabulary Definition for more information (Insert Link Here)
 * 
 * TODO Version Support - The vocabulary supports multiple versions of all
 * the values sets, code systems, etc. The current assumption is the first
 * version encountered is the active one. Versions are implemented using dates
 * so we need to add logic/configuration to set vocabulary date.
 * 
 * 
 * @author Sean Muir
 * 
 */
public class Mif2VocabularyContentProvider extends Mif2Switch<Object> implements ITreeContentProvider {
	
	

	/**
	 * Cached model so we can re-query model as necessary to create child
	 * relationships. TODO For performance reasons, might have to make this
	 * static.
	 */
//	private VocabularyModel vocabularyModel;

	/**
	 * Cached map of ValueSets and CodeSystems used to prevent looping.
	 */
	private Map<String, ValueSet> valueSetMap = new HashMap<String, ValueSet>();

	private Map<String, ValueSet> valueSetMapByName = new HashMap<String, ValueSet>();

	private Map<String, CodeSystemBase> codeSystemMap = new HashMap<String, CodeSystemBase>();

	private Map<String, ConceptDomain> conceptDomainMap = new HashMap<String, ConceptDomain>();

	private Map<String, ContextBinding> contextBindingMap = new HashMap<String, ContextBinding>();
	
	private Map<String, ContextBinding> valueSetTocontextBindingMap = new HashMap<String, ContextBinding>();

	/**
	 * Used to return empty list; null might be sufficient
	 */
	final static List<Object> NONE = new ArrayList<Object>();

	/**
	 * Bucket to return results of doSwitch
	 */
	private Object[] children = null;
	
//	private static PackageBase mifModel = null;
	
	private static Map<URI,PackageBase> mifVocabularyModels = new HashMap<URI,PackageBase>();
	
	public PackageBase getMIFModel() 
	{ 
		return loadPackageBase(ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(HL7_MIF2_VOCABULARY_PATH)); 
	}
	
	private VocabularyModel getVocabularyModel()
	{
		return (VocabularyModel)getMIFModel();
	}
	
	
	private void loadDependentVocabularyModel(ArtifactDependency artifactDependency )
	{
		
		IPath ipath = ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(HL7_MIF2_VOCABULARY_PATH);

		ipath = ipath.removeLastSegments(1);

		ipath = ipath.append(String.format("%s=%s=%s=%s.coremif", artifactDependency.getRoot().getName(), artifactDependency.getRealmNamespace(), artifactDependency.getArtifact()
				.getName(), artifactDependency.getVersion()));

		PackageBase packageBase = loadPackageBase(ipath);

		VocabularyModel dependentModel = (VocabularyModel) packageBase;

		this.populateSets(dependentModel);
		
	}
	
	// Move to util if not there already
	protected PackageBase loadMIFFile(final ResourceSet resourceSet,final URI modelURI) {
		Resource resource = null;
		PackageBase mifModel = null;

		// don't abandon processing if parse error in MIF file
		try {
			resource = resourceSet.getResource(modelURI, true);
		} catch (Exception emfException) {
			resource = resourceSet.getResource(modelURI, false);
		}
		if (resource != null) {
			TreeIterator<Object> iterator = EcoreUtil.getAllContents(resource, false);
			while (iterator.hasNext()) {
				Object next = iterator.next();
				if (next instanceof PackageBase) {
					mifModel = (PackageBase) next;
					break;
				}
			}
		}

		return mifModel;
	}
	
	final public static String HL7_MIF2_VOCABULARY_PATH = "HL7_MIF2_VOCABULARY";
	
	private PackageBase loadPackageBase(IPath iPath)
	{
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		File file = iPath.toFile();
		URI uri;

		PackageBase packageBase = null;
		
		try {
			uri = URI.createURI(file.toURI().toURL().toString());			
			if (mifVocabularyModels.containsKey(uri)) {
				packageBase = mifVocabularyModels.get(uri);
			} else {
				packageBase = loadMIFFile(resourceSet, uri);
				mifVocabularyModels.put(uri, packageBase );
			}
			
		} catch (MalformedURLException e) {
			// Consume exception - mifModel status checked later+
		}
		
		return packageBase;
		
	}
	public void loadMIF2Vocabulary()
	{
		
		/* Cache instance of vocabulary model to ensure quicker response time
		* might be a resource hog and need to be managed differently - in memory indexes and not the whole model
		* Have not refactored complete implementation to take advantage, yet */
		 if (mifVocabularyModels.isEmpty() && ResourcesPlugin.getWorkspace().getPathVariableManager().isDefined(HL7_MIF2_VOCABULARY_PATH)) {
				loadPackageBase(ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(HL7_MIF2_VOCABULARY_PATH)); //loadMIFFile(resourceSet, uri);
		}

		
		
	}
	
	/**
	 * Default to concepts
	 */
	private Constraint constraint = Constraint.CONCEPTS;
	
	/**
	 * Current property from UML model
	 */
	private Property property;
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	public Object[] getChildren(Object element) {
		// Call the doSwitch to create children content based on node

		if (element instanceof String) {
			children = NONE.toArray();
		} else if (element instanceof EObject) {
			doSwitch((EObject) element);
		} else {
			children = NONE.toArray();
		}

		
		return children;
	}

	public class ConceptDomainComparator implements Comparator<ConceptDomain> {

		public int compare(ConceptDomain conceptDomain1, ConceptDomain conceptDomain2) {
			return conceptDomain1.getName().compareTo(conceptDomain2.getName());
		}
	}
	
	public class CodeSystemComparator implements Comparator<CodeSystemBase> {

		public int compare(CodeSystemBase codeSystem1, CodeSystemBase codeSystem2) {
			return codeSystem1.getName().compareTo(codeSystem2.getName());
		}
	}
	
	
	
	public class ContextBindingComparator implements Comparator<ContextBinding> {

		public int compare(ContextBinding contextBinding1, ContextBinding contextBinding2) {
			int result = 0;
			
			if (contextBinding1.getConceptDomain() != null){
				result = contextBinding1.getConceptDomain().compareTo(contextBinding2.getConceptDomain());
			}
			return result;
		}
	}

	public class ConceptComparator implements Comparator<Concept> {

		public int compare(Concept concept1, Concept concept2) {
			int result = 0;
			// If we have codes and the first code is not empty, compare them else return 0 - or equal
			if ((!concept1.getCode().isEmpty()) && (!concept2.getCode().isEmpty()) && concept1.getCode().get(0).getCode() != null) {
				result = concept1.getCode().get(0).getCode().compareTo(concept2.getCode().get(0).getCode());
			}
			return result;
		}
	}
	
	public class ConceptSupplementComparator implements Comparator<ConceptSupplement> {

		public int compare(ConceptSupplement concept1, ConceptSupplement concept2) {
			int result = 0;

			if (concept1.getCode() != null) {
				result = concept1.getCode().compareTo(concept2.getCode());
			}
			return result;
		}
	}

	
	public class ValueSetComparator implements Comparator<ValueSet> {

		public int compare(ValueSet o1, ValueSet o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}	

	public Object caseCodeSystemSupplement(CodeSystemSupplement codeSystemSupplement) {

		ArrayList<ConceptSupplement> concepts = new ArrayList<ConceptSupplement>();

		if (!codeSystemSupplement.getCodeSystemVersionSupplement().isEmpty()) {
			CodeSystemVersionSupplement csv = codeSystemSupplement.getCodeSystemVersionSupplement().get(0);

			for (ConceptSupplement concept : csv.getConceptSupplement()) {
					concepts.add(concept);
			}
//			Collections.sort(concepts, new ConceptComparator());
		}

		Collections.sort(concepts, new ConceptSupplementComparator());
		
		children = concepts.toArray();

		return codeSystemSupplement;
	}

	
	public Object caseCodeSystem(CodeSystem codeSystem) {

		ArrayList<Concept> concepts = new ArrayList<Concept>();

		if (!codeSystem.getReleasedVersion().isEmpty()) {
			CodeSystemVersion csv = codeSystem.getReleasedVersion().get(0);

			for (Concept concept : csv.getConcept()) {
				if (concept.isIsSelectable()) {
					concepts.add(concept);
				}
			}
			Collections.sort(concepts, new ConceptComparator());
		}

		children = concepts.toArray();

		return codeSystem;
	}


	public Object caseConceptDomain(ConceptDomain targetConceptDomain) {

		ArrayList<ConceptDomain> conceptDomains = new ArrayList<ConceptDomain>();

		for (ConceptDomain conceptDomain : conceptDomainMap.values()) {

			for (ConceptDomainRef conceptDomainRef : conceptDomain.getSpecializesDomain()) {
				if (targetConceptDomain.getName().equals(conceptDomainRef.getName())) 
				{
					conceptDomains.add(conceptDomain);
				}

			}

		}

		if (!conceptDomains.isEmpty()) {
			Collections.sort(conceptDomains, new ConceptDomainComparator());

			children = conceptDomains.toArray();
		} else {

			children = NONE.toArray();
		}

		return targetConceptDomain;
	}
	
	boolean intialized = false;
	
	private void populateSets(VocabularyModel vmodel)
	{
		ArrayList<ValueSet> valueSets = new ArrayList<ValueSet>();

		valueSets.addAll(vmodel.getValueSet());

		Collections.sort(valueSets, new ValueSetComparator());

		// Initialize maps valueSet and codeSystem maps
		for (ValueSet valueSet : valueSets) {
			if (valueSet.getId() != null) {
				valueSetMap.put(valueSet.getId(), valueSet);
			}
		}

		for (ValueSet valueSet : valueSets) {
			if (valueSet.getName() != null) {		
				valueSetMapByName.put(valueSet.getName().toUpperCase(), valueSet);
			}
		}
		
//		CodeSystemSupplement codeSystemSupplement = vmodel.getCodeSystemSupplement().get(0);
		
		

		for (CodeSystem codeSystem : vmodel.getCodeSystem()) {
			if (codeSystem.getCodeSystemId() != null) {
//				&& codeSystem.getReleasedVersion().get(0).isHl7MaintainedIndicator()
				if (!codeSystem.getReleasedVersion().isEmpty() ) {
					codeSystemMap.put(codeSystem.getCodeSystemId(), codeSystem);
				}

			}
		}
		
		
		for (CodeSystemSupplement codeSystemSupplement  : vmodel.getCodeSystemSupplement()) {
			if (codeSystemSupplement.getCodeSystemId() != null) {
				
				if (!codeSystemSupplement.getCodeSystemVersionSupplement().isEmpty()) {
					codeSystemMap.put(codeSystemSupplement.getCodeSystemId(), codeSystemSupplement);
				}

			}
		}

		for (ConceptDomain conceptDomain : vmodel.getConceptDomain()) {
			if (conceptDomain.getName() != null) {
				conceptDomainMap.put(conceptDomain.getName(), conceptDomain);
			}
		}

		for (ContextBinding contextBinding : vmodel.getContextBinding()) {
			if (contextBinding.getConceptDomain() != null) {
				contextBindingMap.put(contextBinding.getConceptDomain(), contextBinding);
			}
		}

	}
	
	private void initializeSets()
	{

		if (!intialized) {

			if (!getVocabularyModel().getDependsOnVocabModel().isEmpty())
			{
				loadDependentVocabularyModel(getVocabularyModel().getDependsOnVocabModel().get(0));				
			}

			intialized = true;
			
			populateSets(getVocabularyModel());
			
		}
	}

//	boolean concepts = false;
	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.openhealthtools.mif2.util.Mif2Switch#caseVocabularyModel(org.
	 * openhealthtools.mif2.VocabularyModel)
	 */
	
	public Object caseVocabularyModel(VocabularyModel vocabularyModel) {

		// Cache the model
//		this.vocabularyModel = vocabularyModel;
//
		initializeSets();
		
		
//		Collections.sort(vocabularyModel.getValueSet().toArray());

		
		if (constraint.equals(Constraint.CODESYSTEMS)) {
			// select the binding realms as the children for the model
			filterCodeSystems(property);
		} else {
			if (constraint.equals(Constraint.VALUESSETS)) {
				filterValueSets(property);
			} else {
				filterConcepts(property);
			}
		}
		
		
		
		return vocabularyModel;
	}
	
	/**
	 * filterValueSets returns the complete set of currently defined value sets
	 * within the mif vocabulary if no concept domain has been selected or
	 * returns a filtered set of context bindings based on concept domain
	 * 
	 * @param conceptDomain
	 */
	private void filterValueSets(Property property)
	{
		ArrayList<ValueSet> valueSets = new ArrayList<ValueSet>();

		String conceptDomainFilter = null;
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		if (stereotype != null) {
			conceptDomainFilter = (String) property.getValue(stereotype, IHDFProfileConstants.CONCEPT_DOMAIN_NAME);
		}
		
		String realm= null;
		stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property.getNearestPackage(), IHDFProfileConstants.HDF_PACKAGE);
		if (stereotype != null) {
			realm= (String) property.getNearestPackage().getValue(stereotype, IHDFProfileConstants.PACKAGE_REALM_NAMESPACE);
		}
		

		if (conceptDomainFilter != null && conceptDomainFilter.length() > 0) {

			for (ContextBinding contextBinding : contextBindingMap.values()) {
				
				if ((conceptDomainFilter != null && conceptDomainFilter.equals(contextBinding.getConceptDomain()))) {
					
					if (realm != null && realm.equals(contextBinding.getBindingRealmName() ))
					{					
						ValueSet valueSet = valueSetMap.get(contextBinding.getValueSet());
						if (valueSet != null) {
							valueSets.add(valueSet);
							valueSetTocontextBindingMap.put(valueSet.getId(), contextBinding);
						}
					} 					
				}

			}
		
		} else {
			for (ContextBinding contextBinding : contextBindingMap.values()) {
				if (realm != null && (realm.equals(contextBinding.getBindingRealmName()) || realm.equalsIgnoreCase("UV"))) {
					ValueSet valueSet = valueSetMap.get(contextBinding.getValueSet());
					if (valueSet != null) {
						valueSets.add(valueSet);
						valueSetTocontextBindingMap.put(valueSet.getId(), contextBinding);
					}
				}
			}

		}

		
		Collections.sort(valueSets,new ValueSetComparator());
		
		children = valueSets.toArray();
		
		if (children.length == 0)
		{
			children = new String[] {"No Selectable Value Sets for " + conceptDomainFilter};
		}
		
	}
	
	private void filterConcepts(Property property)
	{
		
		String conceptDomainFilter = null;
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		if (stereotype != null) {
			conceptDomainFilter = (String) property.getValue(stereotype, IHDFProfileConstants.CONCEPT_DOMAIN_NAME);
		}
		
		ArrayList<ConceptDomain> conceptDomains = new ArrayList<ConceptDomain>();
		
		if (false && conceptDomainFilter != null && conceptDomainFilter.length() > 0 && conceptDomainMap.containsKey(conceptDomainFilter)) {
			conceptDomains.add(conceptDomainMap.get(conceptDomainFilter));
		} else {
			
			//vocabularyModel.getConceptDomain()
			for (ConceptDomain conceptDomain : conceptDomainMap.values() ) {

				if (conceptDomain.getSpecializedByDomain().size() == 0 && conceptDomain.getSpecializesDomain().size() == 0) {
					conceptDomains.add(conceptDomain);
				}

			}
		}
		
		Collections.sort(conceptDomains, new ConceptDomainComparator());
		
		children = conceptDomains.toArray();
	}
	
	
	
	private void filterCodeSystems(Property property)
	{
		ArrayList<CodeSystemBase> codeSystems = new ArrayList<CodeSystemBase>();

		codeSystems.addAll(codeSystemMap.values());

		Collections.sort(codeSystems, new CodeSystemComparator());

		children = codeSystems.toArray();
	}

	
	
	public Object caseValueSet(ValueSet valueSet) {
		
		
		children = NONE.toArray();

		ArrayList<ValueSet> valueSets = new ArrayList<ValueSet>();

		ContextBinding contextBinding = null;

		if (valueSetTocontextBindingMap.containsKey(valueSet.getId())) {
			contextBinding = valueSetTocontextBindingMap.get(valueSet.getId());
		}

		if (valueSet.getVersion().size() > 0) {
			ValueSetVersion valueSetVersion = valueSet.getVersion().get(0);
			if (valueSetVersion.getContent() != null) {							
				if (valueSetVersion.getContent().getCombinedContent() != null) {
					for (ContentDefinition cd : valueSetVersion.getContent().getCombinedContent().getUnionWithContent()) {
						if (cd.getValueSetRef() != null) {
							if (valueSetMap.containsKey(cd.getValueSetRef().getId())) {
								valueSets.add(valueSetMap.get(cd.getValueSetRef().getId()));
								if (contextBinding != null) {
									valueSetTocontextBindingMap.put(cd.getValueSetRef().getId(), contextBinding);
								}

							}
						}
					}
				}
				
				

			}

		}
	
		
		children = valueSets.toArray();
		
		
		return valueSet;
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.openhealthtools.mif2.util.Mif2Switch#caseContextBinding(org.
	 * openhealthtools.mif2.ContextBinding)
	 */
	
	public Object caseContextBinding(ContextBinding currentBinding) {
		
		// Reset Children - not sure if this the best way
		children = NONE.toArray();
		
		ArrayList<ContextBinding> contextBindings = new ArrayList<ContextBinding>();
		
		HashMap<String,ConceptDomainRef> conceptDomainRefs = new HashMap<String,ConceptDomainRef>(); 
		
		// Walk the concept hierarchy to determine the list of child concepts to filter with 
		for (ConceptDomain conceptDomain : conceptDomainMap.values()) {
			for (ConceptDomainRef conceptDomainRef : conceptDomain.getSpecializesDomain()) {
				if (currentBinding.getConceptDomain().equalsIgnoreCase(conceptDomainRef.getName())) {				
					conceptDomainRefs.put(conceptDomain.getName(), conceptDomainRef);
				} 
			}

		}
		
		String realm= null;
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property.getNearestPackage(), IHDFProfileConstants.HDF_PACKAGE);
		if (stereotype != null) {
			realm= (String) property.getNearestPackage().getValue(stereotype, IHDFProfileConstants.PACKAGE_REALM_NAMESPACE);
		}

		// Using the child concepts - walk the collection of context bindings 
		for (String concept : conceptDomainRefs.keySet()) {

			for (ContextBinding contextBinding : contextBindingMap.values()) {
				if ((concept != null && concept.equals(contextBinding.getConceptDomain()))) {
					if (realm != null && realm.equals(contextBinding.getBindingRealmName())) {
						contextBindings.add(contextBinding);
					} 
				}

			}
		}		
		
		children = contextBindings.toArray();
				
		return currentBinding;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openhealthtools.mif2.util.Mif2Switch#defaultCase(org.eclipse.emf.
	 * ecore.EObject)
	 */
	
	public Object defaultCase(EObject object) {
		ArrayList<Object> none = new ArrayList<Object>();
		children = none.toArray();
		return object;
	}

	/**
	 * 
	 */
	public Mif2VocabularyContentProvider(org.eclipse.uml2.uml.Property property,Constraint constraint) {
		super();
		this.constraint = constraint;
		this.property = property;		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * .lang.Object)
	 */
	public Object[] getElements(Object element) {
		return getChildren(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object
	 * )
	 */
	public Object getParent(Object element) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * Object)
	 */
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// do nothing
	}


	
	public ContextBinding getActiveBinding(ValueSet valueSet)
	{
		ContextBinding contextBinding = null;
		if (valueSetTocontextBindingMap.containsKey(valueSet.getId()))
		{
			contextBinding = valueSetTocontextBindingMap.get(valueSet.getId());
		}
		return contextBinding;
	}


	/**
	 * getCodeSystemSelection returns the selection path in order to highlight and pre-select code system and code based on current value.
	 * CodeSystems are currently non-hierarchical so the selection path is codeSystemMap and the code
	 * @return Object[]
	 */
	public Object[] getCodeSystemSelection() {
		
		Object[] codeSystemSelection = null;

		
	loadMIF2Vocabulary();
		initializeSets();
		

		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
		
		ConceptBase selectedConcept = null;

		if (stereotype != null) {
			
			String codeSystemOid = (String) property.getValue(stereotype, IHDFProfileConstants.CODE_SYSTEM_OID);

			String code = (String) property.getValue(stereotype, IHDFProfileConstants.CODE);

			if (codeSystemMap.containsKey(codeSystemOid)) {
				
				if (codeSystemMap.get(codeSystemOid) instanceof CodeSystem) {
					
					CodeSystem selectedCodeSystem = (CodeSystem) codeSystemMap.get(codeSystemOid);

					if (!selectedCodeSystem.getReleasedVersion().isEmpty()) {

						// TODO Add version logic to vocabulary
						CodeSystemVersion csv = selectedCodeSystem.getReleasedVersion().get(0);

						for (Concept concept : csv.getConcept()) {

							if (concept.isIsSelectable() && !concept.getCode().isEmpty() && concept.getCode().get(0).getCode().equals(code)) {

								selectedConcept = concept;
								break;
							}

						}
					}

				}
				
				if (codeSystemMap.get(codeSystemOid) instanceof CodeSystemSupplement) {
					
					CodeSystemSupplement selectedCodeSystem = (CodeSystemSupplement) codeSystemMap.get(codeSystemOid);

					if (!selectedCodeSystem.getCodeSystemVersionSupplement().isEmpty()) {

						// TODO Add version logic to vocabulary
						CodeSystemVersionSupplement csv = selectedCodeSystem.getCodeSystemVersionSupplement().get(0);

						for (ConceptSupplement concept : csv.getConceptSupplement()) {
							
							if (concept.getCode() != null && concept.getCode().equals(code)) {
								selectedConcept = concept;
								break;
							}

						}
					}

				}
				

				// If we found a match to the code - return code system and concept else return the codesystem
				if (selectedConcept != null) {
					codeSystemSelection = new Object[] { codeSystemMap.get(codeSystemOid), selectedConcept };
				} else {
					codeSystemSelection = new Object[] { codeSystemMap.get(codeSystemOid) };

				}
			}

		}
		
		return codeSystemSelection ;
		
	}

	/**
	 * getConceptDomainSelection returns the selection path in order to
	 * highlight and pre-select concept domain based on current value
	 * 
	 * Concept Domains are hierarchical and require the walking of the hierarchy
	 * from specific to generalized. The approach assumes a single inheritance
	 * tree while not currently a rule in the vocabulary the current content
	 * implies this to be true.
	 * 
	 * @return Object[]
	 */
	public Object[] getConceptDomainSelection()
	{
		
		loadMIF2Vocabulary();
		initializeSets();
		
		Object[] conceptSelectionPath = null;
		String conceptDomainFilter = null;
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		if (stereotype != null) {
			conceptDomainFilter = (String) property.getValue(stereotype, IHDFProfileConstants.CONCEPT_DOMAIN_NAME);
		}
		

		// If we have a concept domain filter and the filter is valid
		if (conceptDomainFilter != null  && conceptDomainMap.containsKey(conceptDomainFilter) )			
		{
			ArrayList<ConceptDomain> conceptDomains = new ArrayList<ConceptDomain>();
		
			// Retrieve the current concept based on the domain filter and push results
			ConceptDomain currentConceptDomain = conceptDomainMap.get(conceptDomainFilter);
		
			conceptDomains.add(currentConceptDomain);
			
			
			// If current concept specializes a domain - the assumption here is there can be one and only one domain specialization
			while (currentConceptDomain.getSpecializesDomain().size() > 0 )
			{
				// If the domain specialization is valid, push the concept domain and set the specialized concept domain to the current
				// In effect stepping up on rung in the hierarchy
				if (conceptDomainMap.containsKey(currentConceptDomain.getSpecializesDomain().get(0).getName())) {
					currentConceptDomain = conceptDomainMap.get(currentConceptDomain.getSpecializesDomain().get(0).getName());
					conceptDomains.add(currentConceptDomain);
				} else
				{
					// If we do not have a valid concept, stop looking
					break;
				}
			}		
			
			
			// Reverse the order for the tree selection logic
			Collections.reverse(conceptDomains);
			conceptSelectionPath = conceptDomains.toArray();
		}
	
		
		
		return conceptSelectionPath;
	}
	
	/**
	 * getValueSetSelection returns the selection path in order to highligh and
	 * pre-select value set on current value
	 * 
	 * ValueSets are hierarchical and require the walking of the hierarchy from
	 * specific to generalized. The approach assumes a single inheritance tree
	 * while not currently a rule in the HL7 MIF2 vocabulary the current content
	 * implies this to be true.
	 * 
	 * @return Object[]
	 */
	public Object[] getValueSetSelection() {
		
		Object[] valueSetSelection = null;

		loadMIF2Vocabulary();
		
		initializeSets();
		
		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);

		if (stereotype != null) {
			
			String valueSetOid = (String) property.getValue(stereotype, IHDFProfileConstants.VALUE_SET_OID);

			ArrayList<ValueSet > valueSets  = new ArrayList<ValueSet >();
			
			if (valueSetMap.containsKey(valueSetOid)) {
				ValueSet valueSet = valueSetMap.get(valueSetOid);
				
				valueSets.add(valueSet);

				while (  (valueSet=findValueSetParent(valueSet)) != null  )
				{
					valueSets.add(valueSet);	
				}
		
				Collections.reverse(valueSets);
				valueSetSelection =  valueSets.toArray();
				
			}

		 }
		
		return valueSetSelection ;
	}
	
	/**
	 * findValueSetParent search the collection of value sets in the value set
	 * map for a matching id and returns the matching value set if found.
	 * 
	 * ValueSets are build bottom up. In other words you create a generalized
	 * value set by adding two or more specific value sets. In order to find the
	 * correct parent of a value set, we search the copmlete set of value sets
	 * looking for a reference to the current child value set in the value set
	 * references. Once again - this assumes a single inheritance tree which is
	 * not enforced by the vocabulary but is implied in the current data.
	 * 
	 * @param child
	 * @return ValueSet
	 */
	private ValueSet findValueSetParent(ValueSet child) {
		String childID = child.getId();

		ValueSet parent = null;

		if (childID != null) {

			// Search the collection of value sets to locate a reference to the child value set.
			for (ValueSet vs : valueSetMap.values()) {
				if (vs.getVersion().size() > 0) {
					ValueSetVersion vsv = vs.getVersion().get(0);

					// Valueset Hierarchy is in stored in the combined content/unionwithcontent/valuesetreferences
					if ((vsv.getContent() != null) && 
						(vsv.getContent().getCombinedContent() != null) && 
						(vsv.getContent().getCombinedContent().getUnionWithContent() != null)) {
						
						for (ContentDefinition cd : vsv.getContent().getCombinedContent().getUnionWithContent()) {
							if (cd.getValueSetRef() != null) {
								if (childID.equals(cd.getValueSetRef().getId())) {
									parent = vs;
									// If we found a parent value
									break;
								}

							}
							
						}
						
						
						
					}
				}
				if (parent != null) {
					break;
				}
			}
		}

		return parent;

	}
	
	
	

}

	
	
	
	
