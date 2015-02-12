/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
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

package org.openhealthtools.mdht.uml.ui.smd.vocabulary;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
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
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ChildCodeSet;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7CodeSet;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7CodeSystem;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7Concept;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ConceptDomain;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ContextBinding;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7ValueSet;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7VocabularyArtifact;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.HL7VocabularyModel;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.vocabularymetamodel.util.VocabularymetamodelSwitch;
import org.openhealthtools.mdht.uml.hdf.ui.properties.IVocabularySelectionDelegate.Constraint;

/**
 * SMD HL7 Vocabulary Browser
 * 
 * @author Sean Muir
 * 
 */
public class HL7VocabularyContentProvider extends VocabularymetamodelSwitch<Object> implements ITreeContentProvider {

	private static Map<URI, HL7VocabularyModel> mifVocabularyModels = new HashMap<URI, HL7VocabularyModel>();

	public HL7VocabularyModel getHL7VocabularyModel() {
		return loadHL7VocabularyModel(ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(
			HL7_SMD_VOCABULARY_PATH));
	}

	// Move to util if not there already
	protected HL7VocabularyModel loadHL7VocabularyModelFile(final ResourceSet resourceSet, final URI modelURI) {
		Resource resource = null;
		HL7VocabularyModel hl7VocabularyModel = null;

		// don't abandon processing if parse error in MIF file
		try {

			Map<Object, Object> loadMap = resourceSet.getLoadOptions();

			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setIDAttributeName("id");
			loadMap.put(XMLResource.OPTION_XML_MAP, xmlMap);

			for (Object o : resourceSet.getLoadOptions().keySet()) {
				System.out.println(o);
			}

			resource = resourceSet.getResource(modelURI, true);

		} catch (Exception emfException) {
			resource = resourceSet.getResource(modelURI, false);
		}
		if (resource != null) {

			// EcoreUtil.get
			TreeIterator<Object> iterator = EcoreUtil.getAllContents(resource, false);
			while (iterator.hasNext()) {
				Object next = iterator.next();
				if (next instanceof HL7VocabularyModel) {
					hl7VocabularyModel = (HL7VocabularyModel) next;
					break;
				}
			}
		}

		return hl7VocabularyModel;
	}

	final public static String HL7_SMD_VOCABULARY_PATH = "HL7_SMD_VOCABULARY";

	private HL7VocabularyModel loadHL7VocabularyModel(IPath iPath) {
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		File file = iPath.toFile();
		URI uri;

		HL7VocabularyModel hl7VocabularyModel = null;

		try {
			uri = URI.createURI(file.toURI().toURL().toString());
			if (mifVocabularyModels.containsKey(uri)) {
				hl7VocabularyModel = mifVocabularyModels.get(uri);
			} else {
				hl7VocabularyModel = loadHL7VocabularyModelFile(resourceSet, uri);
				mifVocabularyModels.put(uri, hl7VocabularyModel);
			}

		} catch (MalformedURLException e) {
			// Consume exception - mifModel status checked later+
		}

		return hl7VocabularyModel;

	}

	public void loadMIF2Vocabulary() {

		/*
		 * Cache instance of vocabulary model to ensure quicker response time
		 * might be a resource hog and need to be managed differently - in memory indexes and not the whole model
		 * Have not refactored complete implementation to take advantage, yet
		 */
		if (mifVocabularyModels.isEmpty() &&
				ResourcesPlugin.getWorkspace().getPathVariableManager().isDefined(HL7_SMD_VOCABULARY_PATH)) {
			loadHL7VocabularyModel(ResourcesPlugin.getWorkspace().getPathVariableManager().getValue(
				HL7_SMD_VOCABULARY_PATH));
		}

	}

	final static List<Object> NONE = new ArrayList<Object>();

	/**
	 * Bucket to return results of doSwitch
	 */
	private Object[] children = null;

	// static public enum BROWSEBY {CODESYSTEMS,DOMAINS,VALUESETS};

	static public Constraint BROWSEFILTER = Constraint.CONCEPTS;

	public class HL7ConceptDomainComparator implements Comparator<HL7ConceptDomain> {

		@Override
		public int compare(HL7ConceptDomain concept1, HL7ConceptDomain concept2) {
			int result = 0;

			if (concept1.getName() != null) {
				result = concept1.getName().compareTo(concept2.getName());
			}
			return result;
		}
	}

	public class HL7CodeSystemComparator implements Comparator<HL7CodeSystem> {

		@Override
		public int compare(HL7CodeSystem codeSystem1, HL7CodeSystem codeSystem2) {
			int result = 0;

			if (codeSystem1.getName() != null) {
				result = codeSystem1.getName().compareTo(codeSystem2.getName());
			}
			return result;
		}
	}

	public class HL7ValueSetComparator implements Comparator<HL7ValueSet> {

		@Override
		public int compare(HL7ValueSet valueSet1, HL7ValueSet valueSet2) {
			int result = 0;

			if (valueSet1.getName() != null) {
				result = valueSet1.getName().compareTo(valueSet2.getName());
			}
			return result;
		}
	}

	public class HL7ConceptComparator implements Comparator<HL7Concept> {

		@Override
		public int compare(HL7Concept concept1, HL7Concept concept2) {
			int result = 0;

			String code1 = "";
			String code2 = "";
			if (!concept1.getCodes().isEmpty()) {
				code1 = concept1.getCodes().get(0).getCode();
			}

			if (!concept2.getCodes().isEmpty()) {
				code2 = concept2.getCodes().get(0).getCode();
			}

			if (code1 != null) {
				result = code1.compareTo(code2);
			}
			return result;
		}
	}

	@Override
	public Object caseHL7VocabularyModel(HL7VocabularyModel hl7VocabularyModel) {

		switch (BROWSEFILTER) {
			case CONCEPTS:
			case VALUESSETS:
				List<HL7ConceptDomain> concepts = new ArrayList<HL7ConceptDomain>();
				for (HL7ConceptDomain cd : hl7VocabularyModel.getDomains()) {
					if (cd.getSpecializedDomains().size() == 0) {
						if ((BROWSEFILTER == Constraint.CONCEPTS) ||
								(BROWSEFILTER == Constraint.VALUESSETS && !cd.getBindings().isEmpty())) {
							concepts.add(cd);
						}
					}
				}
				Collections.sort(concepts, new HL7ConceptDomainComparator());
				children = concepts.toArray();
				break;

			case CODESYSTEMS:
				List<HL7CodeSystem> codeSystems = new ArrayList<HL7CodeSystem>();
				codeSystems.addAll(hl7VocabularyModel.getCodeSystems());
				Collections.sort(codeSystems, new HL7CodeSystemComparator());
				children = codeSystems.toArray();
				break;

			default:
				children = NONE.toArray();
				break;
		}

		return hl7VocabularyModel;
	}

	@Override
	public Object caseHL7Concept(HL7Concept object) {
		children = NONE.toArray();
		;
		return object;
	}

	public Object caseHL7CodeSystem(HL7CodeSystem object) {

		List<HL7Concept> concepts = new ArrayList<HL7Concept>();

		concepts.addAll((Collection<? extends HL7Concept>) object.getConcepts());

		Collections.sort(concepts, new HL7ConceptComparator());

		children = concepts.toArray();

		return object;
	}

	@Override
	public Object caseHL7ConceptDomain(HL7ConceptDomain object) {

		List<HL7VocabularyArtifact> artifacts = new ArrayList<HL7VocabularyArtifact>();

		if (BROWSEFILTER == Constraint.VALUESSETS) {

			for (HL7ContextBinding cb : object.getBindings()) {
				if (cb.getValueSet() != null) {
					artifacts.add(cb.getValueSet());
				}

			}
		}

		artifacts.addAll(object.getSpecializedByDomains());

		children = artifacts.toArray();

		return object;
	}

	@Override
	public Object caseHL7CodeSet(HL7CodeSet object) {

		children = object.getContainedConcepts().toArray();

		return object;
	}

	@Override
	public Object caseHL7ChildCodeSet(HL7ChildCodeSet object) {

		List<EObject> list = new ArrayList<EObject>();

		list.add(object.getCode());

		children = list.toArray();

		return object;
	}

	@Override
	public Object caseHL7ValueSet(HL7ValueSet object) {

		// List<HL7ValueSet> list = new ArrayList<HL7ValueSet>();
		//
		// // for (HL7CodeSet ccs : object.getContent().getCodeSets())
		// // {
		// // if (ccs instanceof HL7ChildCodeSet)
		// // {
		// // list.add(((HL7ChildCodeSet)ccs).getCode());
		// //
		// // }
		// //
		// // }
		//
		//
		//
		// // list.addAll(object.getContent().getUnionWithContents());
		//
		// list.addAll(object.getReferencingParentValueSets());
		//
		// Collections.sort(list, new HL7ValueSetComparator());
		// children = list.toArray();
		//
		//
		// children = list.toArray();

		children = NONE.toArray();

		return object;
	}

	@Override
	public Object defaultCase(EObject object) {
		children = NONE.toArray();
		return object;
	}

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
