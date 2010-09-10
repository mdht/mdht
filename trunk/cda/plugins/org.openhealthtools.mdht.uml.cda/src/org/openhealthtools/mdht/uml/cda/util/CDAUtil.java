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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.ecore.xmi.DOMHandler;
import org.eclipse.emf.ecore.xmi.DOMHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
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
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResource;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class CDAUtil {
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");

	public static ClinicalDocument load(InputStream in) throws Exception {
		return load(in, null);
	}

	public static ClinicalDocument load(InputSource is) throws Exception {
		return load(is, null);
	}

	public static ClinicalDocument load(InputStream in, LoadHandler handler) throws Exception {
		DocumentBuilder builder = newDocumentBuilder();
		Document doc = builder.parse(in);
		return load(doc, handler);
	}

	public static ClinicalDocument load(InputSource is, LoadHandler handler) throws Exception {
		DocumentBuilder builder = newDocumentBuilder();
		Document doc = builder.parse(is);
		return load(doc, handler);
	}

	public static ClinicalDocument load(Document doc, LoadHandler handler) throws Exception {
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
	
	public static Document save(ClinicalDocument clinicalDocument, DOMHandler handler) throws Exception {
		CDAResource resource = prepare(clinicalDocument, true);
		return resource.save(newDocumentBuilder().newDocument(), null, handler);
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
			root.getXSISchemaLocation().put(CDAPackage.eNS_URI, "CDA.xsd");
			resource.getContents().add(root);
		} else {
//			DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
			DocumentRoot root = (DocumentRoot) clinicalDocument.eContainer();
			Iterator<Map.Entry<String, String>> iterator = root.getXMLNSPrefixMap().entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = iterator.next();
				if (EPackage.Registry.INSTANCE.keySet().contains(entry.getValue()) 
						&& !CDAPackage.eNS_URI.equals(entry.getValue())) {
					iterator.remove();
				}
			}
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
		while (object != null && !(object instanceof Section)) {
			object = object.eContainer();
		}
		return (Section) object;
	}

	/**
	 * 
	 * @param source a Clinical Statement
	 * @param typeCode If typeCode is null, then all relationships are matched.
	 * @param targetClass EClass of relationship target. If null, then all target types are returned.
	 * @return list of Clinical Statements
	 */
	public static  EList<ClinicalStatement> getEntryRelationshipTargets(ClinicalStatement source, x_ActRelationshipEntryRelationship typeCode, EClass targetClass) {
		List<ClinicalStatement> targets = new ArrayList<ClinicalStatement>();
		
		// test children
		for (EntryRelationship rel : CDAUtil.getEntryRelationships(source)) {
			boolean typeCodeMatch = typeCode==null ? true : typeCode.equals(rel.getTypeCode());
			ClinicalStatement target = (ClinicalStatement) CDAUtil.getClinicalStatement(rel);
			if (target != null && isReference(target)) {
				// resolve 'id' referenced elements
				ClinicalStatement element = resolveReference(target);
				if (element != null)
					target = element;
			}
			if ((Boolean.FALSE == rel.getInversionInd() || null == rel.getInversionInd())
					&& typeCodeMatch && target != null 
					&& (targetClass == null || targetClass.isSuperTypeOf(target.eClass()))) {
				targets.add(target);
			}
		}
		
		// test container with inversionInd="true"
		if (source.eContainer() instanceof EntryRelationship) {
			EntryRelationship rel = (EntryRelationship) source.eContainer();
			boolean typeCodeMatch = typeCode==null ? true : typeCode.equals(rel.getTypeCode());
			if (Boolean.TRUE == rel.getInversionInd() && typeCodeMatch
					&& rel.eContainer() instanceof ClinicalStatement
					&& (targetClass == null || targetClass.isSuperTypeOf(rel.eContainer().eClass()))) {
				targets.add((ClinicalStatement)rel.eContainer());
			}
		}
		
		return new BasicEList.UnmodifiableEList<ClinicalStatement>(targets.size(), targets.toArray());
	}

	/**
	 * 
	 * @param source a Section
	 * @param typeCode If typeCode is null, then all relationships are matched.
	 * @param targetClass EClass of relationship target. If null, then all target types are returned.
	 * @return list of Clinical Statements
	 */
	public static  EList<ClinicalStatement> getEntryTargets(Section source, x_ActRelationshipEntry typeCode, EClass targetClass) {
		List<ClinicalStatement> targets = new ArrayList<ClinicalStatement>();
		
		// test children
		for (Entry rel : source.getEntries()) {
			boolean typeCodeMatch = typeCode==null ? true : typeCode.equals(rel.getTypeCode());
			ClinicalStatement target = (ClinicalStatement) CDAUtil.getClinicalStatement(rel);
			if (target != null && isReference(target)) {
				// resolve 'id' referenced elements
				ClinicalStatement element = resolveReference(target);
				if (element != null)
					target = element;
			}
			if (typeCodeMatch && target != null 
					&& (targetClass == null || targetClass.isSuperTypeOf(target.eClass()))) {
				targets.add(target);
			}
		}
		
		return new BasicEList.UnmodifiableEList<ClinicalStatement>(targets.size(), targets.toArray());
	}
	
	/**
	 * A CDA element may be reference if it has an 'id' child, but no 'templateId'.
	 */
	public static boolean isReference(EObject element) {
		EObject id = getChildElement(element, "id");
		EObject templateId = getChildElement(element, "templateId");
		
		return templateId == null && id instanceof II && ((II)id).getRoot() != null;
	}
	
	@SuppressWarnings("unchecked")
	private static EObject getChildElement(EObject eObject, String name) {
		Object result = null;

		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(name);
		if (feature != null) {
			if (feature.isMany()) {
				List<Object> list = (List<Object>) eObject.eGet(feature);
				if (list.size() > 0) {
					result = list.get(0);
				}
			} else {
				result = eObject.eGet(feature);
			}
		}
		
		return (result instanceof EObject) ? (EObject) result : null;
	}
	
	private static class ReferenceFilter implements Filter<EObject> {
		private II id;
		public ReferenceFilter(II id) {
			this.id = id;
		}
		
		public boolean accept(EObject item) {
			EObject itemId = getChildElement(item, "id");
			EObject templateId = getChildElement(item, "templateId");

			if (itemId instanceof II && templateId != null &&
					id.equals((II)itemId)) {
				return true;
			}
			return false;
		}
	}
	
	/**
	 * Return the referenced element, or null if 'element' argument is not a reference
	 * or referenced id is not found.
	 */
	public static EObject resolveReference(EObject element) {
		if (!isReference(element)) {
			return null;
		}
		final II id = (II) getChildElement(element, "id");

		EObject target = null;
		ClinicalDocument clinicalDocument = getClinicalDocument(element);
		if (clinicalDocument != null) {
			Query query = new Query(clinicalDocument);
			target = query.getEObject(EObject.class, new ReferenceFilter(id));
		}
		
		return target;
	}

	/**
	 * Return the referenced clinical statement, or null if 'element' argument is not a reference
	 * or referenced id is not found.
	 */
	public static ClinicalStatement resolveReference(ClinicalStatement element) {
		if (!isReference(element)) {
			return null;
		}
		final II id = (II) getChildElement(element, "id");

		ClinicalStatement target = null;
		ClinicalDocument clinicalDocument = getClinicalDocument(element);
		if (clinicalDocument != null) {
			Query query = new Query(clinicalDocument);
			target = (ClinicalStatement) query.getClinicalStatement(EObject.class, new ReferenceFilter(id));
		}
		
		return target;
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

	public static class OCLFilter<T extends EObject> implements Filter<T> {
		protected String body = null;

		public OCLFilter(String body) {
			this.body = body;
		}

		public boolean accept(T item) {
			boolean result = false;
			try {
				result = check(item, body);
			} catch (Exception e) {}
			return result;
		}
	}

	public static class Query {
		private ClinicalDocument clinicalDocument = null;
		private List<Section> allSections = null;
		private List<EObject> allClinicalStatements = null;
		private List<EObject> allEObjects = null;

		public Query(ClinicalDocument clinicalDocument) {
			this.clinicalDocument = clinicalDocument;
		}

		// get first section that conforms to clazz and is accepted by filter
		public <T extends Section> T getSection(Class<T> clazz, Filter<T> filter) {
			List<T> sections = getSections(clazz, filter);
			return !sections.isEmpty() ? sections.get(0) : null;
		}

		// get first section that conforms to clazz
		public <T extends Section> T getSection(Class<T> clazz) {
			List<T> sections = getSections(clazz);
			return !sections.isEmpty() ? sections.get(0) : null;
		}

		// get sections that conform to clazz and are accepted by filter
		public <T extends Section> List<T> getSections(Class<T> clazz, Filter<T> filter) {
			List<T> sections = new ArrayList<T>();
			for (T section : getSections(clazz)) {
				if (filter.accept(section)) {
					sections.add(section);
				}
			}
			return sections;
		}

		// get sections that conform to clazz
		public <T extends Section> List<T> getSections(Class<T> clazz) {
			List<T> sections = new ArrayList<T>();
			for (Section section : getAllSections()) {
				if (clazz.isInstance(section)) {
					sections.add(clazz.cast(section));
				}
			}
			return sections;
		}

		// get all sections in the document (closure)
		public List<Section> getAllSections() {
			if (allSections == null) {
				allSections = CDAUtil.getAllSections(clinicalDocument);
			}
			return allSections;
		}

		// get first clinical statement that conform to clazz and is accepted by filter
		public <T extends EObject> T getClinicalStatement(Class<T> clazz, Filter<T> filter) {
			List<T> clinicalStatements = getClinicalStatements(clazz, filter);
			return !clinicalStatements.isEmpty() ? clinicalStatements.get(0) : null;
		}

		// get first clinical statement that conform to clazz
		public <T extends EObject> T getClinicalStatement(Class<T> clazz) {
			List<T> clinicalStatements = getClinicalStatements(clazz);
			return !clinicalStatements.isEmpty() ? clinicalStatements.get(0) : null;
		}

		// get clinical statements that conform to clazz and are accepted by filter
		public <T extends EObject> List<T> getClinicalStatements(Class<T> clazz, Filter<T> filter) {
			List<T> clinicalStatements = new ArrayList<T>();
			for (T clinicalStatement : getClinicalStatements(clazz)) {
				if (filter.accept(clinicalStatement)) {
					clinicalStatements.add(clinicalStatement);
				}
			}
			return clinicalStatements;
		}

		// get clinical statements that conform to clazz
		public <T extends EObject> List<T> getClinicalStatements(Class<T> clazz) {
			List<T> clinicalStatements = new ArrayList<T>();
			for (EObject clinicalStatement : getAllClinicalStatements()) {
				if (clazz.isInstance(clinicalStatement)) {
					clinicalStatements.add(clazz.cast(clinicalStatement));
				}
			}
			return clinicalStatements;
		}

		// get all clinical statements in the document (closure)
		public List<EObject> getAllClinicalStatements() {
			if (allClinicalStatements == null) {
				allClinicalStatements = CDAUtil.getAllClinicalStatements(clinicalDocument);
			}
			return allClinicalStatements;
		}
		
		// get first object that conforms to clazz and is accepted by filter
		public <T extends EObject> T getEObject(Class<T> clazz, Filter<T> filter) {
			List<T> eObjects = getEObjects(clazz, filter);
			return !eObjects.isEmpty() ? eObjects.get(0) : null;
		}

		// get first object that conforms to clazz
		public <T extends EObject> T getEObject(Class<T> clazz) {
			List<T> eObjects = getEObjects(clazz);
			return !eObjects.isEmpty() ? eObjects.get(0) : null;
		}

		// get objects that conform to clazz and are accepted by filter
		public <T extends EObject> List<T> getEObjects(Class<T> clazz, Filter<T> filter) {
			List<T> eObjects = new ArrayList<T>();
			for (T eObject : getEObjects(clazz)) {
				if (filter.accept(eObject)) {
					eObjects.add(eObject);
				}
			}
			return eObjects;
		}

		// get objects that conform to clazz
		public <T extends EObject> List<T> getEObjects(Class<T> clazz) {
			List<T> eObjects = new ArrayList<T>();
			for (EObject eObject : getAllEObjects()) {
				if (clazz.isInstance(eObject)) {
					eObjects.add(clazz.cast(eObject));
				}
			}
			return eObjects;
		}

		// get all objects in the document (closure)
		public List<EObject> getAllEObjects() {
			if (allEObjects == null) {
				allEObjects = CDAUtil.getAllEObjects(clinicalDocument);
			}
			return allEObjects;
		}
	}

	// get first section that conforms to clazz and is accepted by filter
	public static <T extends Section> T getSection(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> sections = getSections(clinicalDocument, clazz, filter);
		return !sections.isEmpty() ? sections.get(0) : null;
	}

	// get first section that conforms to clazz
	public static <T extends Section> T getSection(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> sections = getSections(clinicalDocument, clazz);
		return !sections.isEmpty() ? sections.get(0) : null;
	}

	// get sections that conform to clazz and are accepted by filter
	public static <T extends Section> List<T> getSections(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> sections = new ArrayList<T>();
		for (T section : getSections(clinicalDocument, clazz)) {
			if (filter.accept(section)) {
				sections.add(section);
			}
		}
		return sections;
	}

	// get sections that conform to clazz
	public static <T extends Section> List<T> getSections(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> sections = new ArrayList<T>();
		for (Section section : getAllSections(clinicalDocument)) {
			if (clazz.isInstance(section)) {
				sections.add(clazz.cast(section));
			}
		}
		return sections;
	}

	// get all sections in the document (closure)
	public static List<Section> getAllSections(ClinicalDocument clinicalDocument) {
		List<Section> allSections = new ArrayList<Section>();
		Component2 component2 = clinicalDocument.getComponent();
		if (component2 != null) {
			StructuredBody structuredBody = component2.getStructuredBody();
			if (structuredBody != null) {
				for (Component3 component3 : structuredBody.getComponents()) {
					Section section = component3.getSection();
					if (section != null) {
						allSections.addAll(getSections(section));
					}
				}
			}
		}
		return allSections;
	}

	// get all nested sections in the section (closure)
	public static List<Section> getAllSections(Section section) {
		return getSections(section);
	}

	private static List<Section> getSections(Section section) {
		List<Section> sections = new ArrayList<Section>();
		Stack<Section> stack = new Stack<Section>();
		stack.push(section);	// root
		while (!stack.isEmpty()) {
			Section sect = stack.pop();
			sections.add(sect);	// visit
			for (Component5 component : sect.getComponents()) {	// process successors
				Section child = component.getSection();
				if (child != null) {
					stack.push(child);
				}
			}
		}
		return sections;
	}

	// get first clinical statement that conforms to clazz and is accepted by filter
	public static <T extends EObject> T getClinicalStatement(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> clinicalStatements = getClinicalStatements(clinicalDocument, clazz, filter);
		return !clinicalStatements.isEmpty() ? clinicalStatements.get(0) : null;
	}

	// get first clinical statement that conforms to clazz
	public static <T extends EObject> T getClinicalStatement(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> clinicalStatements = getClinicalStatements(clinicalDocument, clazz);
		return !clinicalStatements.isEmpty() ? clinicalStatements.get(0) : null;
	}

	// get clinical statements that conform to clazz and are accepted by filter
	public static <T extends EObject> List<T> getClinicalStatements(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> clinicalStatements = new ArrayList<T>();
		for (T clinicalStatement : getClinicalStatements(clinicalDocument, clazz)) {
			if (filter.accept(clinicalStatement)) {
				clinicalStatements.add(clinicalStatement);
			}
		}
		return clinicalStatements;
	}

	// get clinical statements that conform to clazz
	public static <T extends EObject> List<T> getClinicalStatements(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> clinicalStatements = new ArrayList<T>();
		for (EObject clinicalStatement : getAllClinicalStatements(clinicalDocument)) {
			if (clazz.isInstance(clinicalStatement)) {
				clinicalStatements.add(clazz.cast(clinicalStatement));
			}
		}
		return clinicalStatements;
	}

	// get all clinical statements in the document (closure)
	public static List<EObject> getAllClinicalStatements(ClinicalDocument clinicalDocument) {
		List<EObject> allClinicalStatements = new ArrayList<EObject>();
		for (Section section : getAllSections(clinicalDocument)) {
			allClinicalStatements.addAll(getClinicalStatements(section));
		}
		return allClinicalStatements;
	}
	
	private static List<EObject> getClinicalStatements(Section section) {
		List<EObject> clinicalStatements = new ArrayList<EObject>();
		for (Entry entry : section.getEntries()) {
			EObject clinicalStatement = getClinicalStatement(entry);
			if (clinicalStatement != null) {
				clinicalStatements.addAll(getClinicalStatements(clinicalStatement));
			}
		}
		return clinicalStatements;
	}

	private static List<EObject> getClinicalStatements(EObject clinicalStatement) {
		List<EObject> clinicalStatements = new ArrayList<EObject>();
		Stack<EObject> stack = new Stack<EObject>();
		stack.push(clinicalStatement);	// root
		while (!stack.isEmpty()) {
			EObject stmt = stack.pop();
			clinicalStatements.add(stmt);	// visit
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
		return clinicalStatements;
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
	
	// get first object that conforms to clazz and is accepted by filter
	public static <T extends EObject> T getEObject(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> eObjects = getEObjects(clinicalDocument, clazz, filter);
		return !eObjects.isEmpty() ? eObjects.get(0) : null;
	}

	// get first object that conforms to clazz
	public static <T extends EObject> T getEObject(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> eObjects = getEObjects(clinicalDocument, clazz);
		return !eObjects.isEmpty() ? eObjects.get(0) : null;
	}

	// get objects that conform to clazz and are accepted by filter
	public static <T extends EObject> List<T> getEObjects(ClinicalDocument clinicalDocument, Class<T> clazz, Filter<T> filter) {
		List<T> eObjects = new ArrayList<T>();
		for (T eObject : getEObjects(clinicalDocument, clazz)) {
			if (filter.accept(eObject)) {
				eObjects.add(eObject);
			}
		}
		return eObjects;
	}

	// get objects that conform to clazz
	public static <T extends EObject> List<T> getEObjects(ClinicalDocument clinicalDocument, Class<T> clazz) {
		List<T> eObjects = new ArrayList<T>();
		for (EObject eObject : getAllEObjects(clinicalDocument)) {
			if (clazz.isInstance(eObject)) {
				eObjects.add(clazz.cast(eObject));
			}
		}
		return eObjects;
	}

	// get all objects in the document (closure)
	public static List<EObject> getAllEObjects(ClinicalDocument clinicalDocument) {
		List<EObject> allEObjects = new ArrayList<EObject>();
		Stack<EObject> stack = new Stack<EObject>();
		stack.push(clinicalDocument);	// root
		while (!stack.isEmpty()) {
			EObject eObject = stack.pop();
			allEObjects.add(eObject);	// visit
			for (EObject child : eObject.eContents()) {	// process successors
				stack.push(child);
			}
		}
		return allEObjects;
	}
	// END: Experimental Query/Filter operations
	
	public class CDAXPath {
		private ClinicalDocument clinicalDocument = null;
		private Document document = null;
		private DocumentRoot documentRoot = null;	
		private Map<Node, Object> nodeToObject = null;
		private Map<Object, Node> objectToNode = null;
		private XPath xpath = null;
		
		public CDAXPath(ClinicalDocument clinicalDocument) throws Exception {
			this.clinicalDocument = clinicalDocument;
			nodeToObject = new HashMap<Node, Object>();
			objectToNode = new HashMap<Object, Node>();
			document = CDAUtil.save(clinicalDocument, new DOMHandler() {
				public DOMHelper getDOMHelper() {
					return null;
				}
				public void recordValues(Node node, EObject container, EStructuralFeature feature, Object value) {
					if (value != null) {
						nodeToObject.put(node, value);
						objectToNode.put(value, node);
					}
				}
			});
			documentRoot = (DocumentRoot) clinicalDocument.eContainer();
			nodeToObject.put(document, documentRoot);
			objectToNode.put(documentRoot, document);
			xpath = XPathFactory.newInstance().newXPath();
			xpath.setNamespaceContext(new NamespaceContext() {
				public String getNamespaceURI(String prefix) {
					if ("cda".equals(prefix)) {
						return "urn:hl7-org:v3";
					} else if ("sdtc".equals(prefix)) {
						return "urn:hl7-org:sdtc";
					} else if ("xsi".equals(prefix)) {
						return "http://www.w3.org/2001/XMLSchema-instance";
					}
					return null;
				}
				public String getPrefix(String namespaceURI) {
					if ("urn:hl7-org:v3".equals(namespaceURI)) {
						return "cda";
					} else if ("urn:hl7-org:sdtc".equals(namespaceURI)) {
						return "sdtc";
					} else if ("http://www.w3.org/2001/XMLSchema-instance".equals(namespaceURI)) {
						return "xsi";
					}
					return null;
				}
				public Iterator<String> getPrefixes(String namespaceURI) {
					return null;
				}
			});
		}
		
		public Object evaluate(Node item, String expr, QName returnType) throws Exception {
			XPathExpression expression = xpath.compile(expr);
			return expression.evaluate(item, returnType);
		}
		
		public <T> T evaluate(Object item, String expr, Class<T> clazz) throws Exception {
			QName returnType = null;
			if (clazz.equals(Double.class)) {
				returnType = XPathConstants.NUMBER;
			} else if (clazz.equals(String.class)) {
				returnType = XPathConstants.STRING;
			} else if (clazz.equals(Boolean.class)){
				returnType = XPathConstants.BOOLEAN;
			} else if (clazz.equals(NodeList.class)){
				returnType = XPathConstants.NODESET;
			} else if (clazz.equals(Node.class)) {
				returnType = XPathConstants.NODE;
			}
			return returnType != null ? clazz.cast(evaluate(getNode(item), expr, returnType)) : null;
		}
		
		public <T> T evaluate(String expr, Class<T> clazz) throws Exception {
			return evaluate(documentRoot, expr, clazz);
		}
		
		public Object evaluate(String expr, QName returnType) throws Exception {
			return evaluate(document, expr, returnType);
		}
		
		public ClinicalDocument getClinicalDocument() {
			return clinicalDocument;
		}
		
		public Document getDocument() {
			return document;
		}
		
		public DocumentRoot getDocumentRoot() {
			return documentRoot;
		}
		
		public Node getNode(Object object) {
			return objectToNode.get(object);
		}
		
		public Object getObject(Node node) {
			return nodeToObject.get(node);
		}
		
		public List<Node> selectNodes(Node item, String expr) throws Exception {
			List<Node> result = new ArrayList<Node>();
			NodeList nodeList = (NodeList) evaluate(item, expr, XPathConstants.NODESET);
			if (nodeList != null) {
				for (int i = 0; i < nodeList.getLength(); i++) {
					result.add(nodeList.item(i));
				}
			}
			return result;
		}
		
		public <T extends EObject> List<T> selectNodes(Object item, String expr, Class<T> clazz) throws Exception {
			List<T> result = new ArrayList<T>();
			for (Node node : selectNodes(getNode(item), expr)) {
				Object object = getObject(node);
				if (clazz.isInstance(object)) {
					result.add(clazz.cast(object));
				}
			}
			return result;
		}
		
		public List<Node> selectNodes(String expr) throws Exception {
			return selectNodes(document, expr);
		}
		
		public <T extends EObject> List<T> selectNodes(String expr, Class<T> clazz) throws Exception {
			return selectNodes(documentRoot, expr, clazz);
		}
		
		public Node selectSingleNode(Node item, String expr) throws Exception {
			List<Node> result = selectNodes(item, expr);
			return !result.isEmpty() ? result.get(0) : null;
		}
		
		public <T extends EObject> T selectSingleNode(Object item, String expr, Class<T> clazz) throws Exception {
			List<T> result = selectNodes(item, expr, clazz);
			return !result.isEmpty() ? result.get(0) : null;
		}
		
		public Node selectSingleNode(String expr) throws Exception {
			return selectSingleNode(document, expr);
		}
		
		public <T extends EObject> T selectSingleNode(String expr, Class<T> clazz) throws Exception {
			return selectSingleNode(documentRoot, expr, clazz);
		}
	}
	
	public static void loadPackages() {
		CDAPackageLoader.loadPackages();
	}

	public static void loadPackages(String location) {
		CDAPackageLoader.loadPackages(location);
	}
}
