/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors::
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Component5;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.internal.registry.CDARegistry;
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResource;
import org.w3c.dom.Document;

public class CDAUtil {
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");
	
	public static void registerPackage(EPackage ePackage) {
		ePackage.eClass();
		CDARegistry.INSTANCE.load();
	}
	
	public static ClinicalDocument load(InputStream in) throws Exception {
		return load(in, null);
	}
	
	public static ClinicalDocument load(InputStream in, LoadHandler handler) throws Exception {
		CDAPackage.eINSTANCE.eClass();
		DocumentBuilder builder = newDocumentBuilder();
		Document doc = builder.parse(in);
		CDAResource resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.load(doc, null);
		if (handler != null) {
			processResource(resource, handler);
		}
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		return root.getClinicalDocument();
	}
	
	private static DocumentBuilder newDocumentBuilder() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		return factory.newDocumentBuilder();
	}
	
	private static void processResource(XMLResource resource, LoadHandler handler) {
		Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
		for (EObject key : extMap.keySet()) {
			AnyType value = extMap.get(key);
			handleUnknownData(key, value, handler);
		}
	}
	
	private static void handleUnknownData(EObject object, AnyType unknownData, LoadHandler handler) {
		handleUnknownFeatures(object, unknownData.getMixed(), handler);
		handleUnknownFeatures(object, unknownData.getAnyAttribute(), handler);
	}

	private static void handleUnknownFeatures(EObject owner, FeatureMap featureMap, LoadHandler handler) {
		Iterator<FeatureMap.Entry> iterator = featureMap.iterator();
		while (iterator.hasNext()) {
			FeatureMap.Entry entry = iterator.next();
			EStructuralFeature feature = entry.getEStructuralFeature();
			if (handler.handleUnknownFeature(owner, feature, entry.getValue())) {
				iterator.remove();
			}
		}
	}
	
	public interface LoadHandler {
		public boolean handleUnknownFeature(EObject owner, EStructuralFeature feature, Object value);
	}
	
	public static void save(ClinicalDocument clinicalDocument, OutputStream out) throws Exception {
		save(clinicalDocument, out, true);
	}
	
	public static void save(ClinicalDocument clinicalDocument, OutputStream out, boolean defaults) throws Exception {
		CDAResource resource = prepare(clinicalDocument, defaults);
		resource.save(out, null);
	}
	
	public static void save(ClinicalDocument clinicalDocument, Writer writer) throws Exception {
		save(clinicalDocument, writer, true);
	}
	
	public static void save(ClinicalDocument clinicalDocument, Writer writer, boolean defaults) throws Exception {
		CDAResource resource = prepare(clinicalDocument, defaults);
		resource.save(writer, null);
	}

	private static CDAResource prepare(ClinicalDocument clinicalDocument, boolean defaults) {
		if (defaults) {
			handleDefaults(clinicalDocument);
		}
		CDAResource resource = (CDAResource) clinicalDocument.eResource();
		if (resource == null) {
			resource = (CDAResource) CDAResource.Factory.INSTANCE.createResource(URI.createURI(CDAPackage.eNS_URI));
			DocumentRoot root = CDAFactory.eINSTANCE.createDocumentRoot();
			root.setClinicalDocument(clinicalDocument);
			root.getXMLNSPrefixMap().put("", CDAPackage.eNS_URI);
			resource.getContents().add(root);
		}
		return resource;
	}
	
	// iterative breadth-first traversal using queue
	@SuppressWarnings("unchecked")
	private static void handleDefaults(EObject root) {
		Queue<EObject> queue = new LinkedList<EObject>();
		queue.add(root); // root
		while (!queue.isEmpty()) {
			EObject eObject = queue.remove();
			EClass eClass = eObject.eClass();
			for (EAttribute attribute : eClass.getEAllAttributes()) { // visit
				if (!eObject.eIsSet(attribute) && attribute.getLowerBound() > 0 && attribute.getDefaultValueLiteral() != null) {
					if (attribute.isMany()) {
						List<Object> list = (List<Object>) eObject.eGet(attribute);
						list.add(attribute.getDefaultValue());
					} else {
						eObject.eSet(attribute, attribute.getDefaultValue());
					}
				}
			}
			for (EReference reference : eClass.getEAllReferences()) { // process successors
				Object value = eObject.eGet(reference);
				if (value != null) {
					if (reference.isMany()) {
						queue.addAll((List<EObject>) value);
					} else {
						queue.add((EObject) value);
					}
				}
			}
		}
	}
	
	public static boolean validate(ClinicalDocument clinicalDocument) {
		return validate(clinicalDocument, null);
	}
	
	public static boolean validate(ClinicalDocument clinicalDocument, ValidationHandler handler) {
		return validate(clinicalDocument, handler, true);
	}
	
	public static boolean validate(ClinicalDocument clinicalDocument, ValidationHandler handler, boolean defaults) {
		if (defaults) {
			handleDefaults(clinicalDocument);
		}
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(clinicalDocument);
		if (handler != null) {
			processDiagnostic(diagnostic, handler);
		}
		return diagnostic.getSeverity() != Diagnostic.ERROR;
	}
	
	// iterative breadth-first traversal of diagnostic tree using queue
	private static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic);	// root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			handleDiagnostic(d, handler);	// visit
			for (Diagnostic childDiagnostic : d.getChildren()) {	// process successors
				queue.add(childDiagnostic);
			}
		}
	}
	
	private static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
		case Diagnostic.ERROR:
			handler.handleError(diagnostic);
			break;
		case Diagnostic.WARNING:
			handler.handleWarning(diagnostic);
			break;
		case Diagnostic.INFO:
			handler.handleInfo(diagnostic);
			break;
		}
	}
	
	public interface ValidationHandler {
		public void handleError(Diagnostic diagnostic);
		public void handleWarning(Diagnostic diagnostic);
		public void handleInfo(Diagnostic diagnostic);
	}

	// walk up the containment tree until we reach the ClinicalDocument or we run out of containers
	public static ClinicalDocument getClinicalDocument(EObject object) {
		while (object != null && !(object instanceof ClinicalDocument)) {
			object = object.eContainer();
		}
		return (ClinicalDocument) object;
	}
	
	// walk up the containment tree until we reach a Section or we run out of containers
	public static Section getSection(EObject object) {
		while (object != null & !(object instanceof Section)) {
			object = object.eContainer();
		}
		return (Section) object;
	}
	
	// annotation processing to populate runtime instance
	public static void init(EObject eObject) {
		List<EClass> classes = new ArrayList<EClass>(eObject.eClass().getEAllSuperTypes());
		classes.add(eObject.eClass());
		for (EClass eClass : classes) {
			EAnnotation annotation = eClass.getEAnnotation(CDA_ANNOTATION_SOURCE);
			if (annotation != null) {
				init(eObject, annotation.getDetails().map());
			}
		}
	}
	
	private static void init(EObject eObject, Map<String, String> details) {
		List<String> created = new ArrayList<String>();
		for (String key : details.keySet()) {
			try {
				String path = key.replace(".", "/");
				if (path.contains("/")) {
					String s = path.substring(0, path.lastIndexOf("/"));
					if (!created.contains(s)) {
						create(eObject, s);
						created.add(s);
					}
				}
				set(eObject, path, details.get(key));
			} catch (Exception e) {}
		}
	}
	
	// BEGIN: Path Expression Support
	public static <T> T create(EObject root, String path) {
		return create(root, path, null);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T create(EObject root, String path, EClass eClass) {
		EObject current = root;
		String[] components = path.split("/");
		int currentIndex = 0;
		for (String component : components) {
			EStructuralFeature feature = current.eClass().getEStructuralFeature(component);
			if (feature instanceof EReference) {
				EObject eObject = null;
				Object value = current.eGet(feature);
				if (value == null || feature.isMany()) {
					EClass type = (EClass) feature.getEType();
					if (currentIndex == components.length - 1 && eClass != null && type.isSuperTypeOf(eClass)) {
						eObject = EcoreUtil.create(eClass);
					} else {
						eObject = EcoreUtil.create(type);
					}
					if (feature.isMany()) {
						List<EObject> list = (List<EObject>) value;
						list.add(eObject);
					} else {
						current.eSet(feature, eObject);
					}
				} else {
					eObject = (EObject) value;
				}
				current = eObject;
			}
			currentIndex++;
		}
		return (T) current;
	}

	@SuppressWarnings("unchecked")
	public static void set(EObject root, String path, Object value) {
		String last = path.substring(path.lastIndexOf("/") + 1);
	    EObject target = path.equals(last) ? root : (EObject) get(root, path.substring(0, path.lastIndexOf("/")));
        if (target != null) {
        	String name = null;
        	Integer index = null;
        	Matcher matcher = COMPONENT_PATTERN.matcher(last);
        	if (matcher.matches()) {
        		name = matcher.group(1);
        		if (matcher.group(3) != null) {
        			index = Integer.valueOf(matcher.group(3)) - 1;
        		}
	            EStructuralFeature feature = target.eClass().getEStructuralFeature(name);
	            if (feature != null && value != null) {
	                if (FeatureMapUtil.isFeatureMap(feature) && value instanceof String) {
	                    FeatureMap featureMap = (FeatureMap) target.eGet(feature);
	                    FeatureMapUtil.addText(featureMap, (String) value);
	                } else {
	    	            if (feature instanceof EAttribute) {
	    	                EDataType type = (EDataType) feature.getEType();
	    	                if (value instanceof String && !type.isInstance(value)) {
	    	                    value = EcoreUtil.createFromString(type, (String) value);
	    	                }
	    	            }
	                	if (feature.isMany()) {
		                    List<Object> list = (List<Object>) target.eGet(feature);
		                    if (index != null) {
		                    	if (index >= 0 && index < list.size()) {
		                    		list.set(index, value);
		                    	}
		                    } else {
		                    	list.add(value);
		                    }
		                } else {
		                    target.eSet(feature, value);
		                }
	                }
	            }
        	}
        }
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(EObject root, String path) {
	    Object result = null;
	    EObject current = root;
	    String[] components = path.split("/");
	    for (String component : components) {
	        if (current != null) {
	        	String name = null;
	        	Integer index = null;
	        	Matcher matcher = COMPONENT_PATTERN.matcher(component);
	        	if (matcher.matches()) {
	        		name = matcher.group(1);
	        		if (matcher.group(3) != null) {
	        			index = Integer.valueOf(matcher.group(3)) - 1;
	        		}
		            EStructuralFeature feature = current.eClass().getEStructuralFeature(name);
		            if (feature != null) {
		            	if (feature.isMany()) {
		            		List<Object> list = (List<Object>) current.eGet(feature);
		            		if (index == null) {
		            			index = list.size() - 1;
		            		}
		            		result = (index >= 0 && index < list.size()) ? list.get(index) : null;
		            	} else {
		            		result = current.eGet(feature);
		            	}
		            	if (feature instanceof EReference) {
		            		current = (EObject) result;
		            	}
		            } else {
		            	result = current = null;
		            }
	        	}
	        }
	    }
	    return (T) result;
	}

	public static boolean isSet(EObject root, String path) {
	    return get(root, path) != null;
	}

	@SuppressWarnings("unchecked")
	public static void unset(EObject root, String path) {
	    String last = path.substring(path.lastIndexOf("/") + 1);
	    EObject target = path.equals(last) ? root : (EObject) get(root, path.substring(0, path.lastIndexOf("/")));
	    if (target != null) {
    		String name = null;
    		Integer index = null;
	    	Matcher matcher = COMPONENT_PATTERN.matcher(last);
	    	if (matcher.matches()) {
	    		name = matcher.group(1);
	    		if (matcher.group(3) != null) {
	    			index = Integer.valueOf(matcher.group(3)) - 1;
	    		}
		        EStructuralFeature feature = target.eClass().getEStructuralFeature(name);
		        if (feature != null) {
		        	if (feature.isMany() && index != null) {
		        		List<Object> list = (List<Object>) target.eGet(feature);
		        		if (index >= 0 && index < list.size()) {
		        			list.remove(index);
		        		}
		        	} else {
		        		target.eUnset(feature);
		        	}
		        }
	    	}
	    }
	}
	// END: Path Expression Support
	
	// BEGIN: OCL Support
	private static final OCL ocl = OCL.newInstance();

	public static Object query(EObject eObject, String body) throws Exception {
		OCL.Helper helper = ocl.createOCLHelper();
		helper.setContext(eObject.eClass());
		OCLExpression expression = helper.createQuery(body);
		OCL.Query query = ocl.createQuery(expression);
		return query.evaluate(eObject);
	}

	public static boolean check(EObject eObject, String body) throws Exception {
		OCL.Helper helper = ocl.createOCLHelper();
		helper.setContext(eObject.eClass());
		Constraint constraint = helper.createInvariant(body);
		OCL.Query query = ocl.createQuery(constraint);
		return query.check(eObject);
	}
	// END: OCL Support
	
	// BEGIN: Experimental Query/Filter operations
	public interface Filter<T> {
		public boolean accept(T item);
	}
	
	public static List<Section> getSections(ClinicalDocument clinicalDocument, Filter<Section> filter) {
		return getSections(clinicalDocument, Section.class, filter);
	}
	
	// get sections that conform to clazz
	public static <T> List<T> getSections(ClinicalDocument clinicalDocument, Class<T> clazz) {
		return getSections(clinicalDocument, clazz, new Filter<T>() {
			public boolean accept(T section) {
				return true;
			}
		});
	}
	
	// get sections that conform to clazz and are accepted by filter
	public static <T> List<T> getSections(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> sections = new ArrayList<T>();
		for (Section section : getAllSections(clinicalDocument)) {
			if (clazz.isInstance(section)) {
				T sect = clazz.cast(section);
				if (filter.accept(sect)) {
					sections.add(sect);
				}
			}
		}
		return sections;
	}
	
	// get all sections in the document
	public static List<Section> getAllSections(ClinicalDocument clinicalDocument) {
		List<Section> allSections = new ArrayList<Section>();
		Component2 component2 = clinicalDocument.getComponent();
		if (component2 != null) {
			StructuredBody structuredBody = component2.getStructuredBody();
			if (structuredBody != null) {
				for (Component3 component3 : structuredBody.getComponents()) {
					Section section = component3.getSection();
					if (section != null) {
						allSections.addAll(getAllSections(section));
					}
				}
			}
		}
		return allSections;
	}
	
	public static List<Act> getActs(ClinicalDocument clinicalDocument, Filter<Act> filter) {
		return getClinicalStatements(clinicalDocument, Act.class, filter);
	}
	
	public static List<Act> getAllActs(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Act.class);
	}
	
	public static List<Encounter> getEncounters(ClinicalDocument clinicalDocument, Filter<Encounter> filter) {
		return getClinicalStatements(clinicalDocument, Encounter.class, filter);
	}
	
	public static List<Encounter> getAllEncounters(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Encounter.class);
	}
	
	public static List<Observation> getObservations(ClinicalDocument clinicalDocument, Filter<Observation> filter) {
		return getClinicalStatements(clinicalDocument, Observation.class, filter);
	}
	
	public static List<Observation> getAllObservations(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Observation.class);
	}
	
	public static List<ObservationMedia> getObservationMedia(ClinicalDocument clinicalDocument, Filter<ObservationMedia> filter) {
		return getClinicalStatements(clinicalDocument, ObservationMedia.class, filter);
	}
	
	public static List<ObservationMedia> getAllObservationMedia(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, ObservationMedia.class);
	}
	
	public static List<Organizer> getOrganizers(ClinicalDocument clinicalDocument, Filter<Organizer> filter) {
		return getClinicalStatements(clinicalDocument, Organizer.class, filter);
	}
	
	public static List<Organizer> getAllOrganizers(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Organizer.class);
	}
	
	public static List<Procedure> getProcedures(ClinicalDocument clinicalDocument, Filter<Procedure> filter) {
		return getClinicalStatements(clinicalDocument, Procedure.class, filter);
	}
	
	public static List<Procedure> getAllProcedures(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Procedure.class);
	}
	
	public static List<RegionOfInterest> getRegionsOfInterest(ClinicalDocument clinicalDocument, Filter<RegionOfInterest> filter) {
		return getClinicalStatements(clinicalDocument, RegionOfInterest.class, filter);
	}

	public static List<RegionOfInterest> getAllRegionsOfInterest(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, RegionOfInterest.class);
	}
	
	public static List<SubstanceAdministration> getSubstranceAdministration(ClinicalDocument clinicalDocument, Filter<SubstanceAdministration> filter) {
		return getClinicalStatements(clinicalDocument, SubstanceAdministration.class, filter);
	}
	
	public static List<SubstanceAdministration> getAllSubstanceAdministrations(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, SubstanceAdministration.class);
	}
	
	public static List<Supply> getSupplies(ClinicalDocument clinicalDocument, Filter<Supply> filter) {
		return getClinicalStatements(clinicalDocument, Supply.class, filter);
	}
	
	public static List<Supply> getAllSupplies(ClinicalDocument clinicalDocument) {
		return getClinicalStatements(clinicalDocument, Supply.class);
	}
	
	public static List<EObject> getClinicalStatements(ClinicalDocument clinicalDocument, Filter<EObject> filter) {
		return getClinicalStatements(clinicalDocument, EObject.class, filter);
	}
	
	// get clinical statements that conform to clazz
	public static <T> List<T> getClinicalStatements(ClinicalDocument clinicalDocument, Class<T> clazz) {
		return getClinicalStatements(clinicalDocument, clazz, new Filter<T>() {
			public boolean accept(T clinicalStatement) {
				return true;
			}
		});
	}
	
	// get clinical statements that conform to clazz and are accepted by filter
	public static <T> List<T> getClinicalStatements(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> clinicalStatements = new ArrayList<T>();
		for (EObject clinicalStatement : getAllClinicalStatements(clinicalDocument)) {
			if (clazz.isInstance(clinicalStatement)) {
				T stmt = clazz.cast(clinicalStatement);
				if (filter.accept(stmt)) {
					clinicalStatements.add(stmt);
				}
			}
		}
		return clinicalStatements;
	}
	
	public static List<EObject> getAllClinicalStatements(ClinicalDocument clinicalDocument) {
		List<EObject> allClinicalStatements = new ArrayList<EObject>();
		for (Section section : getAllSections(clinicalDocument)) {
			allClinicalStatements.addAll(getAllClinicalStatements(section));
		}
		return allClinicalStatements;
	}
	
	private static List<EObject> getAllClinicalStatements(Section section) {
		List<EObject> allClinicalStatements = new ArrayList<EObject>();
		for (Entry entry : section.getEntries()) {
			EObject clinicalStatement = getClinicalStatement(entry);
			if (clinicalStatement != null) {
				allClinicalStatements.addAll(getAllClinicalStatements(clinicalStatement));
			}
		}
		return allClinicalStatements;
	}

	private static List<EObject> getAllClinicalStatements(EObject clinicalStatement) {
		List<EObject> allClinicalStatements = new ArrayList<EObject>();
		Stack<EObject> stack = new Stack<EObject>();
		stack.push(clinicalStatement);	// root
		while (!stack.isEmpty()) {
			EObject stmt = stack.pop();
			allClinicalStatements.add(stmt);	// visit
			if (stmt instanceof Organizer) {
				Organizer organizer = (Organizer) stmt;
				for (Component4 component : organizer.getComponents()) {	// process successors
					EObject child = getClinicalStatement(component);
					if (child != null) {
						stack.push(child);
					}
				}
			} else {
				for (EntryRelationship entryRelationship : getEntryRelationships(stmt)) {	// process successors
					EObject child = getClinicalStatement(entryRelationship);
					if (child != null) {
						stack.push(child);
					}
				}
			}
		}
		return allClinicalStatements;
	}

	private static List<EntryRelationship> getEntryRelationships(EObject clinicalStatement) {
		if (clinicalStatement instanceof Act) {
			return ((Act) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof Encounter) {
			return ((Encounter) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof Observation) {
			return ((Observation) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof ObservationMedia) {
			return ((ObservationMedia) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof Procedure) {
			return ((Procedure) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof RegionOfInterest) {
			return ((RegionOfInterest) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof SubstanceAdministration) {
			return ((SubstanceAdministration) clinicalStatement).getEntryRelationships();
		}
		if (clinicalStatement instanceof Supply) {
			return ((Supply) clinicalStatement).getEntryRelationships();
		}
		return Collections.<EntryRelationship>emptyList();
	}

	private static EObject getClinicalStatement(Entry entry) {
		if (entry.getAct() != null) {
			return entry.getAct();
		}
		if (entry.getEncounter() != null) {
			return entry.getEncounter();
		}
		if (entry.getObservation() != null) {
			return entry.getObservation();
		}
		if (entry.getObservationMedia() != null) {
			return entry.getObservationMedia();
		}
		if (entry.getOrganizer() != null) {
			return entry.getOrganizer();
		}
		if (entry.getProcedure() != null) {
			return entry.getProcedure();
		}
		if (entry.getRegionOfInterest() != null) {
			return entry.getRegionOfInterest();
		}
		if (entry.getSubstanceAdministration() != null) {
			return entry.getSubstanceAdministration();
		}
		if (entry.getSupply() != null) {
			return entry.getSupply();
		}
		return null;
	}
	
	private static EObject getClinicalStatement(EntryRelationship entryRelationship) {
		if (entryRelationship.getAct() != null) {
			return entryRelationship.getAct();
		}
		if (entryRelationship.getEncounter() != null) {
			return entryRelationship.getEncounter();
		}
		if (entryRelationship.getObservation() != null) {
			return entryRelationship.getObservation();
		}
		if (entryRelationship.getObservationMedia() != null) {
			return entryRelationship.getObservationMedia();
		}
		if (entryRelationship.getOrganizer() != null) {
			return entryRelationship.getOrganizer();
		}
		if (entryRelationship.getProcedure() != null) {
			return entryRelationship.getProcedure();
		}
		if (entryRelationship.getRegionOfInterest() != null) {
			return entryRelationship.getRegionOfInterest();
		}
		if (entryRelationship.getSubstanceAdministration() != null) {
			return entryRelationship.getSubstanceAdministration();
		}
		if (entryRelationship.getSupply() != null) {
			return entryRelationship.getSupply();
		}
		return null;
	}

	private static EObject getClinicalStatement(Component4 component) {
		if (component.getAct() != null) {
			return component.getAct();
		}
		if (component.getEncounter() != null) {
			return component.getEncounter();
		}
		if (component.getObservation() != null) {
			return component.getObservation();
		}
		if (component.getObservationMedia() != null) {
			return component.getObservationMedia();
		}
		if (component.getOrganizer() != null) {
			return component.getOrganizer();
		}
		if (component.getProcedure() != null) {
			return component.getProcedure();
		}
		if (component.getRegionOfInterest() != null) {
			return component.getRegionOfInterest();
		}
		if (component.getSubstanceAdministration() != null) {
			return component.getSubstanceAdministration();
		}
		if (component.getSupply() != null) {
			return component.getSupply();
		}
		return null;
	}
	
	private static List<Section> getAllSections(Section section) {
		List<Section> allSections = new ArrayList<Section>();
		Stack<Section> stack = new Stack<Section>();
		stack.push(section);	// root
		while (!stack.isEmpty()) {
			Section sect = stack.pop();
			allSections.add(sect);	// visit
			for (Component5 component : sect.getComponents()) {	// process successors
				Section child = component.getSection();
				if (child != null) {
					stack.push(child);
				}
			}
		}
		return allSections;
	}
	// END: Experimental Query/Filter operations
}
