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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.internal.resource.CDAResource;
import org.w3c.dom.Document;

public class CDAUtil {
	public static final String CDA_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
	private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");
	
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
}
