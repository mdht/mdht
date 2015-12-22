/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;

/**
 * Action to generate XML files for the selected UML model
 */
public class GenerateXMLAction extends GenerateAPIAction {

	protected File xmlTestFolder;

	/**
	 * Stores the XML test files for a given UML model element
	 */
	private Map<Element, Collection<File>> testFilesFor = new HashMap<Element, Collection<File>>();

	/**
	 * Stores the test type of a given XML test file
	 */
	private Map<File, String> typeOfTestFile = new HashMap<File, String>();

	@Override
	protected String getTargetLanguage() {
		return "Positive/Negative XML Samples";
	}

	@Override
	protected String getRootFileExtension() {
		return ".xml";
	}

	@Override
	protected File genfolder(File modelFolder) {
		return new File(modelFolder, "samples");
	}

	@Override
	protected String toValidFileName(String filename) {
		filename = filename.replace(".", "_").replace(" ", ""); // cosmetics
		filename = filename.replaceAll("[:\\\\/*\"?|<>']", ""); // remove invalid characters
		return filename;
	}

	/**
	 * Generates positive and negative XML test files
	 * 
	 * @param pack
	 * @param monitor
	 * @throws Exception
	 */
	protected void genAPICode(final Package pack, IProgressMonitor monitor) throws Exception {
		xmlTestFolder = new File(genfolder, "xml");

		monitor.setTaskName("Creating Min/Max Clinical Documents");
		generateMinMaxXMLFiles(pack, monitor);

		monitor.setTaskName("Creating XML test data for properties");
		monitor = new SubProgressMonitor(monitor, 30);
		monitor.beginTask("", CDACommonUtils.getAllContents(pack.eResource(), Constraint.class).size() + CDACommonUtils.getAllContents(pack.eResource(), Class.class).size() + CDACommonUtils.getAllContents(pack.eResource(), Property.class).size());

		for (Constraint constraint : CDACommonUtils.getAllContents(pack.eResource(), Constraint.class)) {
			monitor.worked(1);
			if (constraint.getSpecification() instanceof OpaqueExpression && !constraint.getConstrainedElements().isEmpty() && constraint.getContext() instanceof Class) {
				OpaqueExpression opaqueExpression = (OpaqueExpression) constraint.getSpecification();
				if (!opaqueExpression.getLanguages().isEmpty() && "Analysis".equals(opaqueExpression.getLanguages().get(0))) {
					Element ele = constraint.getConstrainedElements().get(0);
					ele = CDACommonUtils.getMDHTRepresentative((NamedElement) ele);
					EObject eObject = ele;
					while (eObject != null) {
						if (eObject instanceof Class) {
							Class clazz = (Class) eObject;
							List<Property> propertyPath = CDACommonUtils.getPropertyPath(clazz);
							for (Element element : constraint.getConstrainedElements()) {
								if (element instanceof Property) {
									Property property = (Property) element;
									propertyPath.add(property);
								}
							}
							monitor.subTask(constraint.getName());
							File placeholderFolder = new File(xmlTestFolder, "Placeholder");
							creator.forgetLastFileContent();
							creator.initialize(propertyPath);
							creator.flushClinicalDocument(record((Class) constraint.getContext(), new File(placeholderFolder, "Positive"), constraint, "OK"));
							creator.forgetLastFileContent();
							creator.initialize(propertyPath);
							creator.flushClinicalDocument(record((Class) constraint.getContext(), new File(placeholderFolder, "Negative"), constraint, "Fail"));
							break;
						}
						eObject = eObject.eContainer();
					}
				}
			}
		}

		for (Class clazz : CDACommonUtils.getAllContents(pack.eResource(), Class.class)) {
			if (Boolean.parseBoolean(getStereotype(clazz, "noSchematronGen"))) {
				continue;
			}
			monitor.worked(1);
			String templateId = CDACommonUtils.getTemplateId(clazz);
			Property templateIdProperty = creator.getTemplateIdProperty(clazz);
			if (templateId != null && templateIdProperty != null) {
				monitor.subTask(clazz.getName());
				File templateIDsFolder = new File(xmlTestFolder, "TemplateIDs");
				if (creator.initializePath(clazz, templateIdProperty, null, null) != null)
					creator.flushClinicalDocument(record(clazz, new File(templateIDsFolder, "Positive"), templateIdProperty, "OK"));
				if (creator.initializePath(clazz, templateIdProperty, null, templateIdProperty) != null)
					creator.flushClinicalDocument(record(clazz, new File(templateIDsFolder, "Negative"), templateIdProperty, "AttributeValueTest"));
				if (creator.initializePath(clazz, null, templateIdProperty, null) != null)
					creator.flushClinicalDocument(record(clazz, new File(templateIDsFolder, "Negative"), templateIdProperty, "NodeExistenceTest"));
			}

		}

		for (Property property : CDACommonUtils.getAllContents(pack.eResource(), Property.class)) {
			monitor.worked(1);
			if (property.eContainer() instanceof Class) {
				Class clazz = (Class) property.eContainer();
				monitor.subTask(CDACommonUtils.getUmlContext(property));
				if (monitor.isCanceled())
					throw new RuntimeException("Canceled by user");

				if (Boolean.parseBoolean(getStereotype(property, "noSchematronGen"))) {
					continue;
				}
				Property baseProperty = CDACommonUtils.getCDAProperty(property);
				creator.forgetLastFileContent();
				{
					if (creator.initializePath(clazz, property, null, null) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "OK"));
				}
				if (property.getLower() >= 1 && CDACommonUtils.getPropertyForTypeCheck(clazz) != property && CDACommonUtils.getPropertyForCodeOrClasscodeCheck(clazz) != property) {
					if (creator.initializePath(clazz, null, property, null) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "NodeExistenceTest"));
				}
				if ((CDACommonUtils.getDefault(property) != null || CDACommonUtils.getTextValue(property) != null) && CDACommonUtils.getPropertyForTypeCheck(clazz) != property && CDACommonUtils.getPropertyForCodeOrClasscodeCheck(clazz) != property) {
					if (creator.initializePath(clazz, property, null, property) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "NodeValueTest"));
				}
				Property propertyForTypeCheck;
				if (property.getLower() >= 1 && property.getType() instanceof Class && (propertyForTypeCheck = CDACommonUtils.getLeafPropertyForTypeCheck((Class) property.getType())) != null) {
					if (creator.initializePath(clazz, property, null, propertyForTypeCheck) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "Predicated_NodeExistenceTest"));
				}
				if (property.getLower() >= 1 && property.getType() instanceof Class && CDACommonUtils.isDatatypeModel(property.getType()) && baseProperty != null && baseProperty.getType() != property.getType()) {
					if (creator.initializePath(clazz, property, null, property) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "NodeTypeTest"));
				}
				if (property.getUpper() == 0) {
					if (creator.initializePath(clazz, property, null, null) != null)
						creator.flushClinicalDocument(getXMLTestFile(property, "NodeNonExistenceTest"));
				}
				if (property.getUpper() == 1 && baseProperty != null && baseProperty.getUpper() != property.getUpper()) {
					Object child1 = creator.initializePath(clazz, property, null, null);
					if (child1 instanceof EObject) {
						EObject eObject = (EObject) child1;
						Object child2 = creator.repopulateProperty(property, eObject);
						if (child2 instanceof EObject) {
							creator.flushClinicalDocument(getXMLTestFile(property, "NodeNumberTest"));
						} else {
							CDACommonUtils.addStatus(statuses, IStatus.ERROR, getPlugin(), 16, "Cannot re-populate " + CDACommonUtils.getUmlContextDoubled(property), property);
						}
					}
				}

			}
		}

		monitor.done();

	}

	/**
	 * Removes trailing digits from the name
	 * 
	 * @param name
	 * @return
	 */
	private static String withoutDigits(String name) {
		while (!"".equals(name) && Character.isDigit(name.charAt(name.length() - 1))) {
			name = name.substring(0, name.length() - 1);
		}
		return name;
	}

	/**
	 * Copied from ClinicalDocumentCreator.toXMLString() TODO: remove this method
	 * 
	 * @param eObject
	 * @param clazz
	 * @param options
	 * @return
	 */
	public String toXMLString(EObject eObject, Class clazz, Map<String, Object> options) {
		// generate no indentation in e.g. "<title>Adverse Reactions</title>", i.e. keep it in one line
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, BasicExtendedMetaData.INSTANCE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		String xml;
		try {
			xml = XMLHelperImpl.saveString(options, Arrays.asList(eObject), null, null);
		} catch (Exception e1) {
			e1.printStackTrace();
			return null;
		}

		xml = xml.replace("\"datatypes:", "\"");
		xml = xml.replace("<cda:", "<");
		xml = xml.replace("</cda:", "</");
		xml = xml.replace("Extensions_3.0", "ext");
		xml = xml.replace("xmlns:cda=\"urn:hl7-org:v3\"", "xmlns=\"urn:hl7-org:v3\"");
		String eName = eObject.eClass().getName();
		if (!"ClinicalDocument".equals(eName)) {
			String rootTag = withoutDigits(eName.substring(0, 1).toLowerCase() + eName.substring(1));
			if (eObject.eContainmentFeature() != null) {
				rootTag = eObject.eContainingFeature().getName();
			} else if (clazz != null && CDACommonUtils.getOverallPropertyReference(clazz) != null) {
				Property cdaProperty = CDACommonUtils.getCDAProperty(CDACommonUtils.getOverallPropertyReference(clazz));
				if (cdaProperty != null)
					rootTag = cdaProperty.getName();
			}
			xml = xml.replace("<" + eName, "<" + rootTag);
			xml = xml.replace("</" + eName, "</" + rootTag);

			xml = xml.replace(" xmlns=\"urn:hl7-org:v3\"", "");
			xml = xml.replace(" xmi:version=\"2.0\"", "");
			xml = xml.replace(" xmlns:xmi=\"http://www.omg.org/XMI\"", "");
			xml = xml.replace(" xmlns:datatypes=\"http://www.openhealthtools.org/mdht/uml/hl7/datatypes\"", "");
			xml = xml.replace(" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "");
		} else {
			xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + xml;
		}
		// int index = xml.indexOf("<"+eName);
		// xml = xml.substring(0, index) +
		// "<ClinicalDocument xmlns:ext=\"http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\">"
		// + xml.substring(xml.indexOf(">", index) + 1);

		return xml;
	}

	/**
	 * Generates a minimum XML test file, a maximum
	 * 
	 * @param pack
	 * @param monitor
	 * @throws Exception
	 */
	protected void generateMinMaxXMLFiles(final Package pack, IProgressMonitor monitor) throws Exception {

		String uriMap = "";
		// resolve pathmap URIs
		for (Resource res : pack.eResource().getResourceSet().getResources()) {
			URI normURI = res.getResourceSet().getURIConverter().normalize(res.getURI());
			if (!res.getURI().equals(normURI)) {
				uriMap += " " + res.getURI() + " " + normURI;
				// res.setURI(normURI);
			}
		}
		currentCategory.setUriMap(uriMap.trim());

		Collection<Property> propertyPath = new HashSet<Property>();
		for (Class clazz : classes) {
			propertyPath.addAll(CDACommonUtils.getPropertyPath(clazz));
		}

		String pref = specContractedName + "_";

		creator.initialize(Collections.<Property> emptyList());
		creator.flushClinicalDocument(new File(xmlTestFolder, pref + "Min_mdht.xml"));

		creator.initialize(propertyPath);
		creator.flushClinicalDocument(new File(xmlTestFolder, pref + "Max(All_Classes)_mdht.xml"));

		EObject aClinicalDocument = creator.initializeSnippet(this.umlClinicalDocument, CDACommonUtils.getAllContents(irResources, Property.class));
		traceCreatedInstances(pref + "Max(All_Properties)_mdht", aClinicalDocument);

		creator.enableSampleData(true);
		creator.enableSampleDataExpansion(true);
		creator.initialize(Collections.<Property> emptyList());
		creator.flushClinicalDocument(new File(xmlTestFolder, pref + "Sample_mdht.xml"));
		creator.enableSampleData(false);

	}

	/**
	 * 
	 * 
	 * @param fileName
	 *            file name without extension - .xmi is appended automatically as it doesn't work with .xml
	 * @param aClinicalDocument
	 * @throws IOException
	 */
	private void traceCreatedInstances(String fileName, EObject aClinicalDocument) throws IOException {
		trace("Clinical Document instance", umlClinicalDocument, aClinicalDocument);
		currentCategory.setTargetModel(aClinicalDocument);
		for (EObject eObject : CDACommonUtils.getAllContents(Arrays.asList(aClinicalDocument), EObject.class)) {
			Property property = creator.getInitializedByProperty(eObject);
			if (property != null) {
				trace("Property instance", property, eObject);
			}
			Type clazz = creator.getInitializedByClass(eObject);
			if (clazz != null) {
				trace("Class instance", clazz, eObject);
			}
		}
		File file = new File(xmlTestFolder, fileName + ".xmi");
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, true);
		String xml = toXMLString(aClinicalDocument, this.umlClinicalDocument, options);
		creator.writeFile(xml, file);
		ResourceSet rSet = new ResourceSetImpl();
		Resource res = rSet.createResource(URI.createFileURI(file.toString()));
		res.getContents().add(aClinicalDocument);
		// options.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
		// options.put(XMLResource.OPTION_EXTENDED_META_DATA, BasicExtendedMetaData.INSTANCE);
		// // options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		// res.save(options);
	}

	private File getXMLTestFile(Property property, String testType) {
		if (!(property.getType() instanceof Class))
			testType = testType.replace("Node", "Attribute");
		Class clazz = (Class) property.eContainer();
		if (testType.contains("OK"))
			return record(clazz, new File(new File(xmlTestFolder, "Properties"), "Positive"), property, testType);
		else
			return record(clazz, new File(new File(xmlTestFolder, "Properties"), "Negative"), property, testType);
	}

	/**
	 * Records a XML test file for the given UML element
	 * 
	 * @param element
	 * @param result
	 * @return
	 */
	private File record(Class context, File parent, NamedElement constrainedElement, String testType) {
		NamedElement element = constrainedElement instanceof Constraint || isTemplateId(constrainedElement) ? context : constrainedElement;
		Collection<File> testTypes = testFilesFor.get(element);
		if (testTypes == null) {
			testFilesFor.put(element, testTypes = new ArrayList<File>());
		}
		String xmlTestFilenameTemplate = getStereotype(constrainedElement.getNearestPackage(), "xmlTestFilenameTemplate");
		String filename = toValidFileName(resolve(xmlTestFilenameTemplate, context, constrainedElement, testType));

		File result = new File(parent, filename + ".xml");
		testTypes.add(result);
		typeOfTestFile.put(result, testType);
		return result;
	}

	private String getTestTypes(Class clazz, NamedElement element, boolean anchor) {
		String result = "";
		Collection<File> testTypes = testFilesFor.get(isTemplateId(element) ? clazz : element);
		if (testTypes != null) {
			for (File file : testTypes) {
				if (anchor)
					result += getAnchor(file, typeOfTestFile.get(file), getEntityMimeType());
				else
					result += " " + typeOfTestFile.get(file);
			}
		}
		return result;
	}

	protected String resolve(String template, Class clazz, NamedElement element) {
		this.template = template;

		if (needResolve("{test-types-covered}", clazz, element))
			resolve(getTestTypes(clazz, element, false));
		if (needResolve("{test-file-anchors}", clazz, element))
			resolve(getTestTypes(clazz, element, true));

		return super.resolve(this.template, clazz, element);
	}

	@Override
	protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> createTrafo(ResourceSet resourceSet) {
		return null;

	}

	@Override
	protected String getEntityMimeType() {
		return "text/xml";
	}

}
