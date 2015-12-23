/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;

/**
 * Creates clinical documents that can be used as positive (valid CDA documents) or negative (violating certain CDA constraints) test XML files.
 */
public class ClinicalDocumentCreator {

	private static final String PLUGIN = "org.openhealthtools.mdht.uml.cda.core";

	/**
	 * The package of {@link #ecoreClinicalDocument}
	 */
	private EPackage cda_ecore;

	/**
	 * a map from initialized EObject instances to the UML class they were initialized from
	 */
	private Map<Object, Property> initialized = new HashMap<Object, Property>();

	/**
	 * The clinical document that is initialized
	 */
	private EObject aClinicalDocument;

	/**
	 * The metamodel for {@link #aClinicalDocument}
	 */
	private EClass ecoreClinicalDocument;

	/**
	 * The UML model that generated {@link #ecoreClinicalDocument}
	 */
	private Class umlClinicalDocument;

	/**
	 * When the last two flushed clinical documents have the same contents, note this in the error console
	 */
	private String lastXML;

	private File lastFile;

	private Map<Classifier, Collection<Classifier>> specificsOf = new HashMap<Classifier, Collection<Classifier>>();

	private List<ModelStatus> statuses;

	private Collection<File> createdFiles = new HashSet<File>();

	private CDASampler sampler = new CDASampler();

	private boolean enableSampleData = false;

	private boolean enableSampleDataExpansion;

	public ClinicalDocumentCreator(Class umlClinicalDocument, ResourceSet resourceSet, List<ModelStatus> statuses) {
		this.umlClinicalDocument = umlClinicalDocument;
		this.statuses = statuses;
		this.cda_ecore = (EPackage) resourceSet.getEObject(
			URI.createURI("pathmap://CDA_MODEL/cda.uml/../cda.ecore#/"), true);
		this.ecoreClinicalDocument = (EClass) cda_ecore.getEClassifier("ClinicalDocument");
		for (EClass es : ecoreClinicalDocument.getESuperTypes()) {
			if (es.eIsProxy()) {
				ecoreClinicalDocument = null;
				cda_ecore = null;
				CDACommonUtils.addStatus(
					statuses, IStatus.INFO, PLUGIN, 1, "Pathmap to CDA .ecore files not resolved: " +
							((BasicEObjectImpl) es).eProxyURI() + ". Will not use any CDA extension!");
				break;
			}
		}
	}

	private void createClinicalDocument() {
		initialized.clear();
		if (ecoreClinicalDocument != null) {
			aClinicalDocument = EcoreUtil.create(ecoreClinicalDocument);
		} else {
			aClinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		}
	}

	protected void discardClinicalDocument() {
		aClinicalDocument = null;
	}

	/**
	 * Saves the currently constructed clinical document to the given file
	 * 
	 * @param file
	 * @throws Exception
	 */
	public void flushClinicalDocument(File file) throws Exception {
		try {
			Map<String, Object> options = new HashMap<String, Object>();
			// generate no indentation in e.g. "<title>Adverse Reactions</title>", i.e. keep it in one line
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, ExtendedMetaData.INSTANCE);
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			String xml = XMLHelperImpl.saveString(options, Arrays.asList(aClinicalDocument), null, null);

			// xml = xml.replace("typeCode=\"WIT\"", "typeCode=\"CAGNT\"");
			xml = xml.replace("\"datatypes:", "\"");
			xml = xml.replace("<cda:", "<");
			xml = xml.replace("</cda:", "</");
			xml = xml.replace("Extensions_3.0", "ext");
			int index = xml.indexOf("<ClinicalDocument");
			xml = xml.substring(0, index) +
					"<ClinicalDocument xmlns:ext=\"http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\">" +
					xml.substring(xml.indexOf(">", index) + 1);
			xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + xml;

			file.getParentFile().mkdirs();
			writeFile(xml, file);
		} catch (Exception e) {
			CDACommonUtils.addStatus(statuses, IStatus.ERROR, PLUGIN, 2, "Cannot serialize file " + file.getName(), e);
		}
		discardClinicalDocument();
	}

	/**
	 * @param file
	 * @param xml
	 * @throws IOException
	 */
	public void writeFile(String xml, File file) throws IOException {
		CDACommonUtils.stringToFileIfGenerated(xml, file);
		if (!createdFiles.add(file)) {
			CDACommonUtils.addStatus(
				statuses, IStatus.ERROR, PLUGIN, 11, "File name clash: this file is written more than once: " + file);
		}
		if (xml.equals(lastXML)) {
			System.err.println("Equal files:");
			System.err.println(lastFile);
			System.err.println(file);
		}
		lastFile = file;
		lastXML = xml;
	}

	/**
	 * Initializes a clinical document containing the given clazz while enforcing the mandatory property, skipping the prohibited property and making
	 * a difference to the diversify property
	 * 
	 * @param clazz
	 *            mandatory
	 * @param mandatoryProperty
	 *            optional
	 * @param prohibitedProperty
	 *            optional
	 * @param diversifyProperty
	 *            optional
	 * @return If the mandatory property is not <code>null</code>, returns the instance created for it but <code>null</code> if no instance could be
	 *         created for it; if the mandatory property is <code>null</code>, returns the instance created for clazz but <code>null</code> if no
	 *         instance could be created for it. if <code>null</code> is returned, the possibly partially initialized clinical document is discarded.
	 */
	public Object initializePath(Class clazz, Property mandatoryProperty, Property prohibitedProperty,
			Property diversifyProperty) {
		int count = statuses.size();
		createClinicalDocument();
		List<Property> propertyPath = CDACommonUtils.getPropertyPath(clazz);
		if (mandatoryProperty != null) {
			propertyPath.add(mandatoryProperty);
		}
		Object result = initialize(
			umlClinicalDocument, aClinicalDocument, propertyPath,
			new HashSet<Property>(Arrays.asList(prohibitedProperty)), Arrays.asList(diversifyProperty), null, null);
		if (mandatoryProperty != null) {
			if (getInitializedByProperty(result) == mandatoryProperty) {
				return result;
			}
		} else {
			if (getInitializedByClass(result) == clazz) {
				return result;
			}
			if (result == null && clazz == umlClinicalDocument) {
				return aClinicalDocument;
			}
		}
		if (count == statuses.size() && mandatoryProperty != null) {
			CDACommonUtils.addStatus(
				statuses, IStatus.WARNING, PLUGIN, 6, CDACommonUtils.getUmlContextDoubled(mandatoryProperty) +
						" could not be initialized", mandatoryProperty);
		}
		discardClinicalDocument();
		return null;
	}

	/**
	 * Initializes only an instance for the given class, without embedding it into a clinical document
	 * 
	 * @param clazz
	 * @return
	 */
	public EObject initializeSnippet(Class clazz, Collection<Property> mandatoryProperty) {
		createClinicalDocument();
		Classifier cdaChildClass = CDACommonUtils.getCDAType(clazz);
		if (cdaChildClass == null) {
			CDACommonUtils.addStatus(statuses, IStatus.ERROR, PLUGIN, 9, "Found no CDA base class for " +
					CDACommonUtils.getUmlContext(clazz), clazz);
			return null;
		}
		EClass eClass = null;
		for (EPackage ePackage : CDACommonUtils.getAllContents(aClinicalDocument.eClass().eResource(), EPackage.class)) {
			// look in the root package (named "cda") or its child extension package (not named "cda"!)
			if ("cda".equals(ePackage.getName()) == "cda".equals(cdaChildClass.getNearestPackage().getName())) {
				eClass = (EClass) ePackage.getEClassifier(cdaChildClass.getName());
			}
		}

		if (eClass == null) {
			CDACommonUtils.addStatus(
				statuses, IStatus.ERROR, PLUGIN, 9,
				"Found no Runtime class for " + CDACommonUtils.getUmlContext(clazz), clazz);
			return null;
		}

		EObject eObject = EcoreUtil.create(eClass);
		initialize(clazz, eObject, mandatoryProperty, new HashSet<Property>(), new HashSet<Property>(), null, null);
		return eObject;
	}

	public EObject initializeSnippet(Class clazz) {
		return initializeSnippet(clazz, Collections.<Property> emptyList());
	}

	/**
	 * Initializes a clinical document with the given mandatory properties
	 * 
	 * @param mandatoryProperty
	 *            if not all dependent properties are also included for a given property in this list, a given property may be not initialized
	 * @return
	 */
	public void initialize(Collection<Property> mandatoryProperty) {
		createClinicalDocument();
		initialize(
			umlClinicalDocument, aClinicalDocument, mandatoryProperty, new HashSet<Property>(),
			Collections.<Property> emptyList(), null, null);
	}

	protected Object initialize(Class parentClass, EObject parent, Collection<Property> mandatoryProperty,
			Set<Property> prohibitedProperty, Collection<Property> diversifyProperty, Property parentProperty,
			Object result) {

		if (enableSampleData) {
			sampler.mergeSampleXML(parentClass, parent);
		}

		Property oldProperty = initialized.put(parent, parentProperty);
		if (oldProperty != null) {
			CDACommonUtils.addStatus(
				statuses,
				IStatus.WARNING,
				PLUGIN,
				5,
				"Double-initialization by " + CDACommonUtils.getUmlContext(parentProperty) + " and " +
						CDACommonUtils.getUmlContext(oldProperty), parentProperty, oldProperty);
		}

		String templateId = CDACommonUtils.getTemplateId(parentClass);
		Property templateIdProperty = getTemplateIdProperty(parentClass);
		if (templateId != null && templateIdProperty != null && !prohibitedProperty.contains(templateIdProperty)) {
			EStructuralFeature templateIdFeatureFeature = parent.eClass().getEStructuralFeature("templateId");
			EObject templateIdInstance = EcoreUtil.create((EClass) templateIdFeatureFeature.getEType());
			templateIdInstance = setOrAdd(parent, templateIdFeatureFeature, templateIdInstance);
			setOrAdd(templateIdInstance, "root", templateId + (diversifyProperty.contains(templateIdProperty)
					? "TYPO"
					: ""));

			String extension = CDAModelUtil.getTemplateVersion(parentClass);
			if (extension != null)
				setOrAdd(templateIdInstance, "extension", extension);
			initialized.put(templateIdInstance, templateIdProperty);
			if (mandatoryProperty.contains(templateIdProperty) &&
					(parentProperty == null || mandatoryProperty.contains(parentProperty))) {
				result = templateIdInstance;
			}
		}

		for (Property property : CDACommonUtils.allAttributes(parentClass)) {
			if (property == templateIdProperty && templateId != null) {
				// already initialized
				continue;
			}
			result = initializeProperty(
				property, parent, mandatoryProperty, prohibitedProperty, diversifyProperty, parentClass, result);
		}

		return result;
	}

	/**
	 * Creates another value for the given UML property besides the one already created (propertyInstance)
	 * 
	 * @param property
	 * @param propertyInstance
	 * @return the new property value
	 */
	public Object repopulateProperty(Property property, EObject propertyInstance) {
		initialized.remove(propertyInstance);
		EObject parent = propertyInstance.eContainer();
		Class parentClass = (Class) getInitializedByClass(parent);
		return initializeProperty(
			property, parent, Arrays.asList(property), new HashSet<Property>(), Collections.<Property> emptyList(),
			parentClass, null);
	}

	/**
	 * @param property
	 * @param parent
	 * @param mandatoryProperty
	 * @param prohibitedProperty
	 * @param diversifyProperty
	 * @param needInit
	 * @param typeIdentifyingProperty
	 * @param result
	 * @return
	 */
	protected Object initializeProperty(Property property, EObject parent, Collection<Property> mandatoryProperty,
			Set<Property> prohibitedProperty, Collection<Property> diversifyProperty, Class parentClass, Object result) {
		EStructuralFeature feature = getStructuralFeature(parent, property);
		if (feature == null || prohibitedProperty.contains(property)) {
			return result;
		}

		boolean structuralRequired = property.getLower() > 0 ||
				CDACommonUtils.getPropertyForTypeCheck(parentClass) == property ||
				CDACommonUtils.getPropertyForCodeOrClasscodeCheck(parentClass) == property ||
				diversifyProperty.contains(property) || mandatoryProperty.contains(property);

		sampler.descentProperty(property);
		while (sampler.hasData() && (enableSampleDataExpansion || feature.getEType() instanceof EDataType) ||
				structuralRequired) {
			try {
				if (feature.getEType() instanceof EDataType) {
					EDataType eDataType = (EDataType) feature.getEType();
					Object def = null;
					String dv = sampler.getSample();
					if (dv == null) {
						dv = CDACommonUtils.getDefault(property);
					}
					try {
						if (parent.eGet(feature) instanceof FeatureMap) {
							def = getValueForFeaturemap(feature, dv);
						} else if (dv != null) {
							def = EcoreUtil.createFromString(eDataType, dv);
						}
					} catch (Exception e) {
						CDACommonUtils.addStatus(statuses, IStatus.ERROR, PLUGIN, 7, "Cannot parse default value \"" +
								dv + "\" for property " + CDACommonUtils.getUmlContextDoubled(property) + " as " +
								(eDataType.getName() != null
										? eDataType.getName()
										: eDataType), e, property);
					}
					Object val = null;
					if (!diversifyProperty.contains(property) && def != null) {
						feature.setUnsettable(true);
						val = setOrAdd(parent, feature, def);
					} else if (eDataType instanceof EEnum) {
						EEnum eEnum = (EEnum) eDataType;
						EEnumLiteral literal = eEnum.getEEnumLiteral(eEnum.getELiterals().size() - 1);
						if (def != null && literal == def) {
							literal = eEnum.getEEnumLiteral(eEnum.getELiterals().size() - 2);
						}
						val = setOrAdd(parent, feature, literal.getInstance());
					} else if (eDataType.getInstanceClass() != null &&
							eDataType.getInstanceClass().isAssignableFrom(String.class)) {
						val = setOrAdd(parent, feature, def instanceof String
								? ((String) def) + "TYPO"
								: "testString");
					} else if (eDataType.getInstanceClass() != null &&
							eDataType.getInstanceClass().isAssignableFrom(Boolean.class)) {
						val = setOrAdd(parent, feature, def instanceof Boolean
								? !((Boolean) def)
								: true);
					} else if (eDataType.getInstanceClass() != null &&
							eDataType.getInstanceClass().isAssignableFrom(BigInteger.class)) {
						val = setOrAdd(parent, feature, def instanceof BigInteger
								? ((BigInteger) def).add(BigInteger.valueOf(1))
								: BigInteger.valueOf(999));
					} else {
						CDACommonUtils.addStatus(
							statuses, IStatus.ERROR, PLUGIN, 8,
							"Cannot initialize value for property " + CDACommonUtils.getUmlContextDoubled(property) +
									" for datatype " + (eDataType.getName() != null
											? eDataType.getName()
											: eDataType), property);
					}
					if (mandatoryProperty.contains(property)) {
						initialized.put(val, property);
						result = val;
					}
				} else {

					if (!(property.getType() instanceof Class)) {
						return result;
					}
					Class childClass = (Class) property.getType();
					EObject child = null;
					Object oldValue = parent.eGet(feature);
					for (Object object : oldValue instanceof List
							? (List<?>) oldValue
							: Arrays.asList(oldValue)) {
						if (getInitializedByClass(object) == childClass && property.getUpper() == 1) {
							child = (EObject) object;
						}
					}
					if (child == null) {
						EClass eClass = (EClass) feature.getEType();
						Classifier cdaChildClass = CDACommonUtils.getCDAType(childClass);
						if (cdaChildClass == null) {
							CDACommonUtils.addStatus(
								statuses, IStatus.ERROR, PLUGIN, 9,
								"Found no CDA base class for " + CDACommonUtils.getUmlContext(childClass), childClass);
							return result;
						}
						if (!cdaChildClass.getName().equals(eClass.getName())) {
							EClassifier eClass1 = eClass.getEPackage().getEClassifier(cdaChildClass.getName());
							if (eClass1 != null) {
								eClass = (EClass) eClass1;
							}
						}
						if (diversifyProperty.contains(property) || eClass.isAbstract()) {
							EClassifier otherClass = null;
							for (Classifier classifier : getSpecific(childClass)) {
								if (!classifier.isAbstract()) {
									if (classifier.getName() != null &&
											classifier.getName().equals(childClass.getName())) {
										// makes no difference in serialization if same named, so don't allow it!
										continue;
									}
									otherClass = eClass.getEPackage().getEClassifier(classifier.getName());
									if (otherClass != null) {
										break;
									}
								}
							}
							if (otherClass != null) {
								eClass = (EClass) otherClass;
							} else {
								CDACommonUtils.addStatus(
									statuses, IStatus.ERROR, PLUGIN, 10, "Cannot find a different class other than " +
											eClass.getName(), property);
								return result;
							}
						}
						if (property.getLower() == 0) {
							int level = 0;
							EObject aParent = parent;
							while (aParent != null) {
								if (aParent.eClass() == eClass || level >= 10) {
									// prevent endless recursion
									return result;
								}
								aParent = aParent.eContainer();
								level++;
							}
						}
						child = EcoreUtil.create(eClass);
						child = setOrAdd(parent, feature, child);
					}
					CodeSystemConstraint codeSystemConstraint = CDACommonUtils.getCodeSystemConstraint(property);
					if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
						setOrAdd(child, "code", codeSystemConstraint.getCode() + (diversifyProperty.contains(property)
								? "TYPO"
								: ""));
					}
					if (codeSystemConstraint != null && CDACommonUtils.getCodeSystem(codeSystemConstraint) != null) {
						setOrAdd(child, "codeSystem", CDACommonUtils.getCodeSystem(codeSystemConstraint));
					}
					if (codeSystemConstraint != null && codeSystemConstraint.getDisplayName() != null) {
						setOrAdd(child, "displayName", codeSystemConstraint.getDisplayName());
					}
					EStructuralFeature mixedFeature = child.eClass().getEStructuralFeature("mixed");
					Object mixed = mixedFeature != null
							? child.eGet(mixedFeature)
							: null;
					if (mixed instanceof FeatureMap) {
						String text = sampler.getSample();
						if (text == null) {
							TextValue textValue = CDACommonUtils.getTextValue(property);
							text = textValue != null
									? textValue.getValue()
									: null;
						}
						if (text != null) {
							text = text.trim() + (diversifyProperty.contains(property)
									? "TYPO"
									: "");
							FeatureMapUtil.addText((FeatureMap) mixed, text);
						}
					}
					if (mandatoryProperty.contains(property)) {
						result = child;
					}
					// prohibitedProperty.add(property);
					result = initialize(
						childClass, child, mandatoryProperty, prohibitedProperty, diversifyProperty, property, result);
				}
			} finally {
				sampler.ascentProperty();
			}
			structuralRequired = false;
			sampler.descentProperty(property);
		}
		sampler.ascentProperty();
		return result;
	}

	private Object getValueForFeaturemap(EStructuralFeature feature, String string) throws IOException {
		if ("any".equals(feature.getName())) {
			/**
			 * @see org.openhealthtools.mdht.uml.cda.operations.SectionOperations#createStrucDocText()
			 */
			Resource.Factory factory = new GenericXMLResourceFactoryImpl();
			XMLResource resource = (XMLResource) factory.createResource(null);
			resource.load(new URIConverter.ReadableInputStream("<text>" + string + "</text>"), null);
			XMLTypeDocumentRoot root = (XMLTypeDocumentRoot) resource.getContents().get(0);
			AnyType value = (AnyType) root.getMixed().getValue(0);
			return value.getMixed();
		}
		return string;
	}

	public Type getInitializedByClass(Object object) {
		if (object == aClinicalDocument) {
			return umlClinicalDocument;
		}
		Property parentProperty = initialized.get(object);
		if (parentProperty != null && object != null) {
			return parentProperty.getType();
		} else {
			return null;
		}
	}

	public Property getInitializedByProperty(Object object) {
		return initialized.get(object);
	}

	private Collection<Classifier> getSpecific(Class clazz) {
		if (specificsOf.isEmpty()) {
			Iterator<Object> it = EcoreUtil.getAllContents(clazz.eResource().getResourceSet(), false);
			while (it.hasNext()) {
				Object eObject = it.next();
				if (eObject instanceof Classifier) {
					Classifier specific = (Classifier) eObject;
					for (Generalization generalization : specific.getGeneralizations()) {
						Classifier general = generalization.getGeneral();
						Collection<Classifier> specifics = specificsOf.get(general);
						if (specifics == null) {
							specificsOf.put(general, specifics = new ArrayList<Classifier>());
						}
						if (!specifics.contains(specific)) {
							specifics.add(specific);
						}
					}
				}
			}
		}
		if (specificsOf.get(clazz) != null) {
			return specificsOf.get(clazz);
		}
		return Collections.emptyList();
	}

	/**
	 * @param parent
	 * @param property
	 * @return
	 */
	private EStructuralFeature getStructuralFeature(EObject parent, Property property) {
		Property cdaProperty = CDACommonUtils.getCDAProperty(property);
		if (cdaProperty != null && parent != null) {
			EStructuralFeature feature = parent.eClass().getEStructuralFeature(cdaProperty.getName());
			if (feature == null) {
				CDACommonUtils.addStatus(statuses, IStatus.WARNING, PLUGIN, 4, "No Java/Ecore mapping for property " +
						CDACommonUtils.getUmlContextDoubled(property) + ")", property);
			}
			return feature;
		}
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T> T setOrAdd(EObject eObject, EStructuralFeature feature, T value) {
		if (eObject.eGet(feature) instanceof FeatureMap && value instanceof String) {
			FeatureMap featureMap = (FeatureMap) eObject.eGet(feature);
			FeatureMapUtil.addText(featureMap, (String) value);
		} else if (feature.isMany()) {
			List list = (List) eObject.eGet(feature);
			if (value instanceof List) {
				list.addAll((List) value);
			} else {
				list.add(value);
			}
		} else {
			eObject.eSet(feature, value);
		}
		return value;
	}

	private <T> T setOrAdd(EObject eObject, String featureName, T value) {
		return setOrAdd(eObject, eObject.eClass().getEStructuralFeature(featureName), value);
	}

	public void forgetLastFileContent() {
		lastXML = null;
	}

	public Property getTemplateIdProperty(Class clazz) {
		Property result = CDACommonUtils.findAttribute(clazz, "templateId");
		if (result != null) {
			result = CDACommonUtils.getCDAProperty(result);
		}
		return result;
	}

	/**
	 * @return the cda_ecore
	 */
	public EPackage getCdaEcore() {
		return cda_ecore;
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

	public String toXMLString(EObject eObject, Class clazz) {
		return toXMLString(eObject, clazz, new HashMap<String, Object>());
	}

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
				if (cdaProperty != null) {
					rootTag = cdaProperty.getName();
				}
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
		// "<ClinicalDocument xmlns:ext=\"http://ns.electronichealth.net.au/Ci/Cda/Extensions/3.0\"
		// xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\">"
		// + xml.substring(xml.indexOf(">", index) + 1);

		return xml;
	}

	public void enableSampleData(boolean value) {
		enableSampleData = value;
	}

	public void enableSampleDataExpansion(boolean value) {
		enableSampleDataExpansion = value;
	}

	public EObject getClinicalDocument() {
		return aClinicalDocument;
	}

}
