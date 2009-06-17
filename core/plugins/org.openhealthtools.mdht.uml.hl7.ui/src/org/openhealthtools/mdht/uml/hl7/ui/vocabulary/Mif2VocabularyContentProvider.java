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
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.core.resources.ResourcesPlugin;
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
import org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeStatusKind;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.Constraint;

/**
 * Mif2VocabularyContentProvider Mif2VocabularyContentProvider supports the
 * browsing of the MIF2 Vocabulary Model as a tree. The current implementation
 * of the vocabulary model in Mif2 is flat in nature versus hierarchical. This
 * requires us to go back to the model itself and query to create the child
 * relationships documented in the MIF2 but not explicit in the XSD.
 * 
 * See HL7 MIF2 Vocabulary Definition for more information (Insert Link Here)
 * 
 * @author Sean Muir
 * 
 */
public class Mif2VocabularyContentProvider extends org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch<Object> implements ITreeContentProvider {
	
	

	/**
	 * Cached model so we can re-query model as necessary to create child
	 * relationships. TODO For performance reasons, might have to make this
	 * static.
	 */
	private VocabularyModel vocabularyModel;

	/**
	 * Used to select correct version of the vocabulary; TODO Add preference to
	 * set what version date should be used for vocabulary
	 */
	private long vocabularyVersionDateTime = GregorianCalendar.getInstance().getTimeInMillis();

	/**
	 * displayAll - Some values are set to unselectable in the model - not sure
	 * of all the needs so we have a flag to filter on need to add to
	 * preferences
	 * 
	 * 
	 */
	private boolean displayAll = false;

	/**
	 * sort results or not - default to true add preference
	 * Future Logic
	 */
	@SuppressWarnings("unused")
	private boolean sort = true;

	/**
	 * Do we want to flatten the vocabulary model or hierarchical
	 */
	private boolean flatten = false;

	/**
	 * Cached map of ValueSets and CodeSystems used to prevent looping.
	 */
	private HashMap<String, ValueSet> valueSetMap = new HashMap<String, ValueSet>();

	private HashMap<String, ValueSet> valueSetMapByName = new HashMap<String, ValueSet>();

	private HashMap<String, CodeSystem> codeSystemMap = new HashMap<String, CodeSystem>();

	private HashMap<String, ConceptDomain> conceptDomainMap = new HashMap<String, ConceptDomain>();

	private HashMap<String, ContextBinding> contextBindingMap = new HashMap<String, ContextBinding>();

	/**
	 * Used to return empty list; null might be sufficient
	 */
	final static ArrayList<Object> none = new ArrayList<Object>();

	/**
	 * Bucket to return results of doSwitch
	 */
	Object[] children = null;
	
	static org.openhealthtools.mdht.emf.hl7.mif2.PackageBase mifModel = null;
	
	public org.openhealthtools.mdht.emf.hl7.mif2.PackageBase getMIFModel() { return mifModel; }
	
	
	// Move to util if not there already
	protected PackageBase loadMIFFile(ResourceSet resourceSet, URI modelURI) {
		Resource resource = null;
		PackageBase mifModel = null;

		// don't abandon processing if parse error in MIF file
		try {
			resource = resourceSet.getResource(modelURI, true);

			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : resource.getErrors()) {
				System.out.println(diagnostic);
			}

		} catch (Exception emfException) {
			resource = resourceSet.getResource(modelURI, false);

			System.out.println(emfException.toString());
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
	
	
	public void loadMIF2Vocabulary()
	{
		
		// Cache instance of vocabulary model to ensure quicker response time
		// might be a resource hog and need to be managed differently - in memory indexes and not the whole model
		// Have not refactored complete implementation to take advantage, yet
		if (mifModel == null)
		{
		 if (ResourcesPlugin.getWorkspace().getPathVariableManager().isDefined(HL7_MIF2_VOCABULARY_PATH))
		 {
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new ResourceSetImpl();
			
				resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
				
				
			File file = ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(HL7_MIF2_VOCABULARY_PATH).toFile();
			URI uri;
			
			 

					try {
						uri = URI.createURI(file.toURI().toURL().toString());
						mifModel = loadMIFFile(resourceSet, uri);
					} catch (MalformedURLException e) {
						// Consume exception - mifModel status checked later+
					}
					
				
		 }
		}

		
		
	}
	
	// Default to concepts
	Constraint constraint = Constraint.CONCEPTS;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	public Object[] getChildren(Object element) {
		// Call the doSwitch to create children content based on node

		if (element != null) {
			doSwitch((EObject) element);
		} else {
			children = none.toArray();
		}
//		}
		
		return children;
	}

	public class ConceptDomainComparator implements Comparator<ConceptDomain> {

		public int compare(ConceptDomain o1, ConceptDomain o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	public class ConceptComparator implements Comparator<Concept> {

		public int compare(Concept o1, Concept o2) {

			String o1code = "";
			String o2code = "";

			if (o1.getCode().size() > 0) {
				o1code = o1.getCode().get(0).getCode();
			}

			if (o2.getCode().size() > 0) {
				o2code = o2.getCode().get(0).getCode();
			}

			return o1code.compareTo(o2code);
		}
	}

	@Override
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

		if (conceptDomains.size() > 0) {
			Collections.sort(conceptDomains, new ConceptDomainComparator());

			children = conceptDomains.toArray();
		} else {

			children = none.toArray();

//			// Data Integrity Problems - Using All Upper Case
//			if (valueSetMapByName.containsKey(targetConceptDomain.getName().toUpperCase())) {
//				ValueSet valueSet = valueSetMapByName.get(targetConceptDomain.getName().toUpperCase());
//
//				// / make method
//				ValueSetVersion valueSetCurrentVersion = null;
//				long currentDif = Long.MAX_VALUE;
//				long currentVersionDateTime = 0;
//
//				// Get correct version of valueset
//				for (ValueSetVersion valueSetVersion : valueSet.getVersion()) {
//
//					XMLGregorianCalendar versionDate = valueSetVersion.getVersionDate();
//					currentVersionDateTime = 0;
//
//					// If we have a valid data and the date is valid - get the
//					// time in millis
//					if (versionDate != null && versionDate.isValid()) {
//
//						GregorianCalendar gc = new GregorianCalendar(versionDate.getYear(), versionDate.getMonth(), versionDate.getDay());
//
//						currentVersionDateTime = gc.getTimeInMillis();
//
//					}
//
//					// If current version time is less then the vocabulary
//					// version time
//					// see if it is the latest available version
//					if (currentVersionDateTime < vocabularyVersionDateTime) {
//						if ((vocabularyVersionDateTime - currentVersionDateTime) < currentDif) {
//							valueSetCurrentVersion = valueSetVersion;
//							currentDif = vocabularyVersionDateTime - currentVersionDateTime;
//						}
//
//					}
//
//				}
//
//				// If we found a version and the version has stuff
//				if (valueSetCurrentVersion != null && valueSetCurrentVersion.getContent() != null) {
//
//					ContentDefinition cd = valueSetCurrentVersion.getContent();
//
//					HashMap<String, String> codes = new HashMap<String, String>();
//
//					for (CodeBasedContentDefinition cbcd : cd.getCodeBasedContent()) {
//						codes.put(cbcd.getCode(), cbcd.getCode());
//					}
//
//					if (codeSystemMap.containsKey(valueSetCurrentVersion.getContent().getCodeSystem())) {
//						CodeSystem codeSystem = codeSystemMap.get(valueSetCurrentVersion.getContent().getCodeSystem());
//
//						CodeSystemVersion codeSystemCurrentVersion = null;
//						// reset Dif to use again
//						currentDif = Long.MAX_VALUE;
//
//						// This time find latest code system version - lots of
//						// versions running around
//						for (CodeSystemVersion codeSystemVersion : codeSystem.getReleasedVersion()) {
//
//							XMLGregorianCalendar versionDate = codeSystemVersion.getReleaseDate();
//
//							currentVersionDateTime = 0;
//
//							// If we have a valid data and the date is valid -
//							// get the
//							// time in millis
//							if (versionDate != null && versionDate.isValid()) {
//								GregorianCalendar gc = new GregorianCalendar(versionDate.getYear(), versionDate.getMonth(), versionDate.getDay());
//
//								currentVersionDateTime = gc.getTimeInMillis();
//							}
//
//							// If current version time is less then the
//							// vocabulary
//							// version time
//							// see if it is the latest available version
//							if (currentVersionDateTime < vocabularyVersionDateTime) {
//								if ((vocabularyVersionDateTime - currentVersionDateTime) < currentDif) {
//									codeSystemCurrentVersion = codeSystemVersion;
//									currentDif = vocabularyVersionDateTime - currentVersionDateTime;
//								}
//
//							}
//
//							// If we are displaying all concepts - set children
//							// - do not filter by status
//							if (displayAll) {
//								children = codeSystemCurrentVersion.getConcept().toArray();
//							} else {
//
//								// else we filter by status
//								ArrayList<Concept> concepts = new ArrayList<Concept>();
//								for (Concept concept : codeSystemCurrentVersion.getConcept()) {
//									if (concept.isIsSelectable()) {
//										Code code = concept.getCode().get(0);
//										if (codes.containsKey(code.getCode())) {
//											if (!code.getStatus().equals(CodeStatusKind.RETIRED)) {
//												concepts.add(concept);
//											}
//										} else {
//											// look at relationships - TODO
//											// seems to have relationshipName
//											// but not sure how it all ties
//											// together
//											for (ConceptRelationship conceptRelationship : concept.getConceptRelationship()) {
//												if (codes.containsKey(conceptRelationship.getTargetConcept().getCode())) {
//													concepts.add(concept);
//												} else if (codes.containsKey(conceptRelationship.getTargetConcept().getCode())) {
//
//												}
//											}
//										}
//									}
//								}
//
//								Collections.sort(concepts, new ConceptComparator());
//
//								children = concepts.toArray();
//
//							}
//
//						}
//
//					}
//				}
//			}

		}

		return targetConceptDomain;
	}

//	boolean concepts = false;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch#caseVocabularyModel(org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel)
	 */
	@Override
	public Object caseVocabularyModel(VocabularyModel vocabularyModel) {

		// Cache the model
		this.vocabularyModel = vocabularyModel;


		// Initialize maps valueSet and codeSystem maps
		for (ValueSet valueSet : vocabularyModel.getValueSet()) {
			if (valueSet.getId() != null) {
				valueSetMap.put(valueSet.getId(), valueSet);
			}
		}

		for (ValueSet valueSet : vocabularyModel.getValueSet()) {
			if (valueSet.getName() != null) {
				valueSetMapByName.put(valueSet.getName().toUpperCase(), valueSet);
			}
		}

		for (CodeSystem codeSystem : vocabularyModel.getCodeSystem()) {
			if (codeSystem.getCodeSystemId() != null) {
				codeSystemMap.put(codeSystem.getCodeSystemId(), codeSystem);
			}
		}

		for (ConceptDomain conceptDomain : vocabularyModel.getConceptDomain()) {
			if (conceptDomain.getName() != null) {
				conceptDomainMap.put(conceptDomain.getName(), conceptDomain);
			}
		}

		for (ContextBinding contextBinding : vocabularyModel.getContextBinding()) {
			if (contextBinding.getConceptDomain() != null) {
				contextBindingMap.put(contextBinding.getConceptDomain(), contextBinding);
			}
		}

		
		if (constraint.equals(Constraint.CODESYSTEMS)) {
			// select the binding realms as the children for the model
			children = vocabularyModel.getBindingRealm().toArray();
		} else {
			if (constraint.equals(Constraint.CONCEPTS)) {

				ArrayList<ConceptDomain> conceptDomains = new ArrayList<ConceptDomain>();
				for (ConceptDomain conceptDomain : vocabularyModel
						.getConceptDomain()) {

					if (conceptDomain.getSpecializedByDomain().size() == 0
							&& conceptDomain.getSpecializesDomain().size() == 0) {
						conceptDomains.add(conceptDomain);
					}
					children = conceptDomains.toArray();
				}
			} else
			{
				if (constraint.equals(Constraint.VALUESSETS))
				{
					children = valueSetMap.values().toArray();
				}
			}

		}
		return vocabularyModel;
	}

	public class ContextBindingComparator implements Comparator<ContextBinding> {

		public int compare(ContextBinding o1, ContextBinding o2) {
			return o1.getConceptDomain().compareTo(o2.getConceptDomain());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch#caseBindingRealm(org.openhealthtools
	 * .mif2.BindingRealm)
	 */
	@Override
	public Object caseBindingRealm(BindingRealm object) {

		// Do we need to support the pseudo BindingRealm "hierarchy" or have
		// it as a flag

		ArrayList<ContextBinding> contextBindings = new ArrayList<ContextBinding>();

		// Not sure we need to cache this result or is it cached as part of
		// the treeview and not called again
		for (ContextBinding contextBinding : vocabularyModel.getContextBinding()) {
			if (contextBinding.getBindingRealmName() != null && contextBinding.getBindingRealmName().equals(object.getName())) {

				if (!flatten) {
					if (conceptDomainMap.containsKey(contextBinding.getConceptDomain())) {
						ConceptDomain conceptDomain = conceptDomainMap.get(contextBinding.getConceptDomain());

						// If our concept is not "specialized" by some domain -
						// then we add
						if (conceptDomain.getSpecializesDomain().size() == 0) {
							contextBindings.add(contextBinding);
						}

					}
				} else {
					contextBindings.add(contextBinding);
				}

			}
		}

		Collections.sort(contextBindings, new ContextBindingComparator());

		children = contextBindings.toArray();

		return object;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch#caseContextBinding(org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding)
	 */
	@Override
	public Object caseContextBinding(ContextBinding contextBinding) {

		// Reset Children - not sure if this the best way
		children = none.toArray();
//		boolean unSpecialized = true;

		// If we are not flattening the model - then the search loop is on
		if (!flatten) {
			// ArrayList<ContextBinding> contextBindings = new
			// ArrayList<ContextBinding>();

			ArrayList<ConceptDomain> conceptDomains = new ArrayList<ConceptDomain>();

			// loop over the conceptDomains
			for (ConceptDomain conceptDomain : conceptDomainMap.values()) {
				// Loop over the Specializes Domain - seems to have only roughly
				// emulating a child/parent
				for (ConceptDomainRef conceptDomainRef : conceptDomain.getSpecializesDomain()) {
					// Does the conceptDomainRef name equal our current context
					// bindings

					if (contextBinding.getConceptDomain().equals(conceptDomainRef.getName())) {
//						unSpecialized = false;
						conceptDomains.add(conceptDomain);

					}

					// conceptDomains.add(conceptDomain);

					/***********
					 * if (contextBinding.getConceptDomain().equals(
					 * conceptDomainRef.getName())) { // If so - set
					 * unSpecialized to false to prevent // downstream
					 * processing of codes unSpecialized = false; // Get a
					 * referenced binding if one exist - not a given if
					 * (contextBindingMap.containsKey(conceptDomain.getName()))
					 * { contextBindings.add(contextBindingMap.get(conceptDomain
					 * .getName())); } }
					 ************/
				}

			}

			Collections.sort(conceptDomains, new ConceptDomainComparator());
			// Set children to our bindings collection
			children = conceptDomains.toArray();

		}

		// If we are flattening or unSpecialized (leaf node essentially) -
		// process codes flatten || unSpecialized
		if (true) {

			// Find our related valueset
			if (valueSetMap.containsKey(contextBinding.getValueSet())) {
				ValueSet valueSet = valueSetMap.get(contextBinding.getValueSet());

				ValueSetVersion valueSetCurrentVersion = null;
				long currentDif = Long.MAX_VALUE;
				long currentVersionDateTime = 0;

				// Get correct version of valueset
				for (ValueSetVersion valueSetVersion : valueSet.getVersion()) {

					XMLGregorianCalendar versionDate = valueSetVersion.getVersionDate();
					currentVersionDateTime = 0;

					// If we have a valid data and the date is valid - get the
					// time in millis
					if (versionDate != null && versionDate.isValid()) {

						GregorianCalendar gc = new GregorianCalendar(versionDate.getYear(), versionDate.getMonth(), versionDate.getDay());

						currentVersionDateTime = gc.getTimeInMillis();

					}

					// If current version time is less then the vocabulary
					// version time
					// see if it is the latest available version
					if (currentVersionDateTime < vocabularyVersionDateTime) {
						if ((vocabularyVersionDateTime - currentVersionDateTime) < currentDif) {
							valueSetCurrentVersion = valueSetVersion;
							currentDif = vocabularyVersionDateTime - currentVersionDateTime;
						}

					}

				}

				// If we found a version and the version has stuff
				if (valueSetCurrentVersion != null && valueSetCurrentVersion.getContent() != null) {
					if (codeSystemMap.containsKey(valueSetCurrentVersion.getContent().getCodeSystem())) {
						CodeSystem codeSystem = codeSystemMap.get(valueSetCurrentVersion.getContent().getCodeSystem());

						CodeSystemVersion codeSystemCurrentVersion = null;
						// reset Dif to use again
						currentDif = Long.MAX_VALUE;

						// This time find latest code system version - lots of
						// versions running around
						for (CodeSystemVersion codeSystemVersion : codeSystem.getReleasedVersion()) {

							XMLGregorianCalendar versionDate = codeSystemVersion.getReleaseDate();

							currentVersionDateTime = 0;

							// If we have a valid data and the date is valid -
							// get the
							// time in millis
							if (versionDate != null && versionDate.isValid()) {
								GregorianCalendar gc = new GregorianCalendar(versionDate.getYear(), versionDate.getMonth(), versionDate.getDay());

								currentVersionDateTime = gc.getTimeInMillis();
							}

							// If current version time is less then the
							// vocabulary
							// version time
							// see if it is the latest available version
							if (currentVersionDateTime < vocabularyVersionDateTime) {
								if ((vocabularyVersionDateTime - currentVersionDateTime) < currentDif) {
									codeSystemCurrentVersion = codeSystemVersion;
									currentDif = vocabularyVersionDateTime - currentVersionDateTime;
								}

							}

							// If we are displaying all concepts - set children
							// - do not filter by status
							if (displayAll) {
								children = codeSystemCurrentVersion.getConcept().toArray();
							} else {

								// else we filter by status
								ArrayList<Concept> concepts = new ArrayList<Concept>();
								for (Concept concept : codeSystemCurrentVersion.getConcept()) {
									if (concept.isIsSelectable()) {
										if (!concept.getCode().get(0).getStatus().equals(CodeStatusKind.RETIRED)) {
											concepts.add(concept);
										}
									}
								}
								children = concepts.toArray();

							}

						}

					}
				}
			}
		}
		return contextBinding;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Switch#defaultCase(org.eclipse.emf.
	 * ecore.EObject)
	 */
	@Override
	public Object defaultCase(EObject object) {
		// TODO Auto-generated method stub
		// children = null;

		ArrayList<Object> none = new ArrayList<Object>();
		children = none.toArray();
		return object;
	}

	/**
	 * 
	 */
	public Mif2VocabularyContentProvider(Constraint constraint) {
		super();
		this.constraint = constraint;

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

}