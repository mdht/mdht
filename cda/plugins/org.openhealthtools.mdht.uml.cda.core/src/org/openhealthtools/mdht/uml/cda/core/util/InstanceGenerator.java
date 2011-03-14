/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

@SuppressWarnings("rawtypes")
public class InstanceGenerator {

	public static final String CDA_SAMPLE_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/sample";

	public static <T> T sampleInstanceCreate(EObject root, String path, ResourceSet resourceSet) {
		return sampleInstanceCreate(root, path, null, resourceSet);
	}

	private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");

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

	/**
	 * 
	 * sampleInstanceCreate will attempt to use existing ismany instances versus
	 * creating a new one original init does not use existing ismany 
	 * @param <T>
	 * @param root
	 * @param path
	 * @param eClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static <T> T sampleInstanceCreate(EObject root, String path, EClass eClass, ResourceSet resourceSet) {
		EObject current = root;
		String[] components = path.split("/");
		int currentIndex = 0;
		for (String component : components) {

			String[] featurePath = component.split("/[/]");

			EStructuralFeature feature = current.eClass().getEStructuralFeature(featurePath[0]);

			if (feature instanceof EReference) {
				EObject eObject = null;

				Object value = current.eGet(feature);

				boolean needToCreate = (value == null);

				if (!needToCreate && feature.isMany()) {
					List<EObject> list = (List<EObject>) value;
					if (list.size() > 0) {
						value = list.get(0);
					} else {
						needToCreate = true;
					}
				}

				if (needToCreate) {
					EClass type = (EClass) feature.getEType();

					if (type.isAbstract()) {
						String searchName = current.eClass().getEPackage().getNsPrefix() + "::" + current.eClass().getName();
						Collection<NamedElement> results = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(resourceSet, searchName);
						if (results.size() == 1) {
							NamedElement ne = results.iterator().next();
							if (ne instanceof Class) {
								for (Property p : ((Class) ne).getOwnedAttributes()) {
									if (feature.getName().equals(p.getName())) {
										for (EObject c : type.getEPackage().eContents()) {
											if (c instanceof EClass && p.getType().getName().equals(((EClass) c).getName())) {
												type = (EClass) c;
												break;
											}
										}
										break;
									}

								}
							}
						}
					}

					if (!type.isAbstract()) {

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

	private static void init(EObject eObject, Map<String, String> details, boolean sampleInit, ResourceSet resourceSet) {
		List<String> created = new ArrayList<String>();
		for (String key : details.keySet()) {
			try {
				String path = key.replace(".", "/");
				if (path.contains("/")) {
					String s = path.substring(0, path.lastIndexOf("/"));
					if (!created.contains(s)) {

						sampleInstanceCreate(eObject, s, resourceSet);

						created.add(s);
					}
				}
				set(eObject, path, details.get(key));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void sampleInstanceInitialization(EObject eObject, ResourceSet resourceSet, HashMap<String, String> shallShouldMayProperties) {

		List<EClass> classes = new ArrayList<EClass>(eObject.eClass().getEAllSuperTypes());

		classes.add(eObject.eClass());

		try {

			Method initMethod = eObject.getClass().getDeclaredMethod("init", new java.lang.Class[0]);
			if (initMethod != null) {
				initMethod.invoke(eObject, new Object[0]);
			}
		} catch (Exception e) {
			// ignore if no init() method
		}

		for (EClass eClass : classes) {
			EAnnotation annotation = eClass.getEAnnotation(CDA_SAMPLE_SOURCE);
			if (annotation != null) {
				init(eObject, annotation.getDetails().map(), true, resourceSet);
			}
		}

		HashMap<String, EOperation> gets = new HashMap<String, EOperation>();

		for (EClass eClass : classes) {
		for (EOperation eOperation : eClass.getEOperations()) {
			if (eOperation.getName().startsWith("get") && !gets.containsKey(eOperation.getName())) {
				if ((!eOperation.getEContainingClass().getEPackage().getNsURI().equals(RIMPackage.eINSTANCE.getNsURI()))
						&& (!eOperation.getEContainingClass().getEPackage().getNsURI().equals(CDAPackage.eINSTANCE.getNsURI()))) {
					for (EOperation addOperation : eClass.getEAllOperations()) {
						if (addOperation.getName().startsWith("add")) {
							for (EParameter eParameter : addOperation.getEParameters()) {
								for (EClass superTypes : ((EClass) eOperation.getEType()).getEAllSuperTypes()) {
									if (superTypes.equals(eParameter.getEType())) {

										gets.put(eOperation.getName(), eOperation);

										EObject objectToAdd = null;
										/*
										 * If abstract - search the current
										 * package for class that implements
										 * abstract type
										 */
										if (((EClass) eOperation.getEGenericType().getEClassifier()).isAbstract()) {
											for (EClassifier e2 : eClass.getEPackage().getEClassifiers()) {
												if (e2 instanceof EClass) {
													EClass e3 = (EClass) e2;
													if (e3.getEAllSuperTypes().contains(eOperation.getEGenericType().getEClassifier())) {
														objectToAdd = e3.getEPackage().getEFactoryInstance().create(e3);
													}
												}
											}

										} else {
											objectToAdd = eOperation.getEGenericType().getEClassifier().getEPackage().getEFactoryInstance()
													.create((EClass) eOperation.getEGenericType().getEClassifier());
										}

										if (objectToAdd != null) {

											HashMap<String, String> ssmprops = new HashMap<String, String>();

											ssmprops.put("id", "id");
											ssmprops.put("effectiveTime", "effectiveTime");
											ssmprops.put("time", "time");

											String searchName = objectToAdd.eClass().getEPackage().getNsPrefix() + "::" + objectToAdd.eClass().getName();

											Collection<NamedElement> results = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(resourceSet, searchName);

											if (results.size() == 1) {
												NamedElement ne = results.iterator().next();
												if (ne instanceof Class) {
													createvalueSetProperies((Class) ne, ssmprops);
												}
											}
											sampleInstanceInitialization(objectToAdd, resourceSet, ssmprops);
										}

										try {

											for (Method m : eClass.getInstanceClass().getMethods()) {
												if (addOperation.getName().equals(m.getName())) {
													m.invoke(eObject, objectToAdd);
													break;

												}
											}

										} catch (SecurityException e) {
										} catch (IllegalArgumentException e) {
										} catch (IllegalAccessException e) {
										} catch (InvocationTargetException e) {
										}

									}

								}
							}
						}
					}
				}
			}
		}
			DatatypesInit datatypesInit = new DatatypesInit();

			for (EClass eClass2 : classes) {
				for (EStructuralFeature feature : eClass2.getEStructuralFeatures()) {
					if (feature.getEType() != null && feature.getEType() instanceof EClass) {
						EClass ec = (EClass) feature.getEType();
						if (DatatypesPackage.eINSTANCE.getNsURI().equals(ec.getEPackage().getNsURI())) {
							if (shallShouldMayProperties.containsKey(feature.getName())) {
								Object currentValue = eObject.eGet(feature);
								if (currentValue == null || (currentValue instanceof EList && ((EList) currentValue).isEmpty())) {
									// If we have abstract type - use
									// corresponding uml class to get type
									if (ec.isAbstract()) {
										String searchName = eObject.eClass().getEPackage().getNsPrefix() + "::" + eObject.eClass().getName();
										Collection<NamedElement> results = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(resourceSet, searchName);
										if (results.size() == 1) {
											NamedElement ne = results.iterator().next();
											if (ne instanceof Class) {
												for (Property p : ((Class) ne).getOwnedAttributes()) {
													if (feature.getName().equals(p.getName())) {
														for (EObject c : ec.getEPackage().eContents()) {
															if (c instanceof EClass && p.getType().getName().equals(((EClass) c).getName())) {
																ec = (EClass) c;
																break;
															}
														}
														break;
													}

												}
											}
										}

									}
									// If we are not abstract at this point;
									// create instance
									if (!ec.isAbstract()) {

										EObject value = ec.getEPackage().getEFactoryInstance().create(ec);

										datatypesInit.doSwitch(value);

										if (feature.isMany()) {
											eObject.eSet(feature, Collections.singletonList(value));
										} else {
											eObject.eSet(feature, value);
										}
									}
								} else {
									if (feature.isMany()) {
										datatypesInit.doSwitch((EObject) ((EList) currentValue).get(0));
									} else {
										datatypesInit.doSwitch((EObject) currentValue);
									}
								}

							}
						}
					}

				}
			}

		}

	}

	private static class DatatypesInit extends org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch<Object> {

		@Override
		public Object caseST(ST object) {
			
			if ( (object.getText() != null && object.getText().length() == 0) &&   object.eContainer() != null)
			{
				if (object.eContainer() instanceof Section){					
					Section s = (Section)object.eContainer();					
					object.addText(s.getCode().getDisplayName());	
				}
					
			}
		
			
			
			return object;
		}

		public static String now(String dateFormat) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			return sdf.format(cal.getTime());

		}

		@Override
		public Object caseSXCM_TS(SXCM_TS object) {
			object.setValue(now("yyyyMMdd"));
			return object;
		}

		@Override
		public Object caseIVL_TS(IVL_TS object) {
			IVXB_TS lowValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			lowValue.setValue(now("yyyy"));
			IVXB_TS highValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			highValue.setValue(now("yyyy"));

			object.setLow(lowValue);
			object.setHigh(highValue);
			return object;
		}

		@Override
		public Object caseII(II ii) {
			ii.setRoot(UUID.randomUUID().toString());
			return ii;
		}

		@Override
		public Object caseCD(CD object) {
			if (!object.getNullFlavor().equals(NullFlavor.NA)) {
				// if ( ( object.getCode() == null || (object.getCode() != null
				// && object.getCode().length() == 0))) {
				// object.setCode("GetCodeFromTerminlogyHere");
				// }
			}

			return object;
		}

		@Override
		public Object defaultCase(EObject object) {
			return super.defaultCase(object);
		}

	}

	private Map<String, EPackage> packageURIMap = new HashMap<String, EPackage>();

	boolean standalone = false;

	public InstanceGenerator() {
		CDAUtil.loadPackages();
	}

	public InstanceGenerator(boolean standalone) {
		this.standalone = standalone;
		CDAUtil.loadPackages();
	}

	private EPackage getEPackageForURI(String ePackageURI) {
		EPackage ePackage = packageURIMap.get(ePackageURI);
		if (!packageURIMap.containsKey(ePackageURI)) {
			ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageURI);
			packageURIMap.put(ePackageURI, ePackage);

			if (ePackage == null) {
				System.err.println("Cannot load EPackage for: " + ePackageURI);
			}
		}

		return ePackage;
	}

	public EClass getEClass(Type umlType) {
		String ePackageURI = CDAModelUtil.getEcorePackageURI(umlType);
		if (ePackageURI != null) {
			EPackage ePackage = getEPackageForURI(ePackageURI);
			if (ePackage != null) {
				EClassifier eClassifier = ePackage.getEClassifier(umlType.getName());
				if (eClassifier instanceof EClass) {
					return (EClass) eClassifier;
				}
			}
		}

		return null;
	}

	private Package getInstancePackage(Package modelPackage) {
		Package instancePackage = null;
		if (modelPackage != null) {
			if (modelPackage.eResource() != null) {
				if (modelPackage.eResource().getURI() != null) {

					final String[] segments = modelPackage.eResource().getURI().segments();

					String instanceURIPath = "";

					Resource umlInstanceResource = null;

					if (!standalone) {
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(segments[1]);
						IFolder folder = project.getFolder("model");
						String instancePath = segments[segments.length - 1].replace(".uml", "-instances.uml");
						IFile file = folder.getFile(instancePath);
						instanceURIPath = file.getFullPath().toOSString();

						final URI instanceURI = URI.createPlatformResourceURI(instanceURIPath, false);

						try {
							umlInstanceResource = modelPackage.eResource().getResourceSet().getResource(instanceURI, true);
						} catch (Exception e) {
							umlInstanceResource = modelPackage.eResource().getResourceSet().getResource(instanceURI, false);
						}

					} else {
						instanceURIPath = modelPackage.getNearestPackage().eResource().getURI().toFileString();

						String umlModelName = segments[segments.length - 1].replace(".uml", "-instances.uml");

						instanceURIPath = instanceURIPath.replace(segments[segments.length - 1], umlModelName);

						final URI instanceURI = URI.createFileURI(instanceURIPath);

						try {
							umlInstanceResource = modelPackage.eResource().getResourceSet().getResource(instanceURI, true);
						} catch (Exception e) {
							umlInstanceResource = modelPackage.eResource().getResourceSet().getResource(instanceURI, false);
						}

					}

					if (umlInstanceResource != null) {
						instancePackage = (Package) EcoreUtil.getObjectByType(umlInstanceResource.getContents(), UMLPackage.eINSTANCE.getPackage());
					}
				}

			}
		}
		return instancePackage;

	}

	static void createvalueSetProperies(Class umlClass, HashMap<String, String> shouldShallMayProperties) {

		for (Property umlProperty : umlClass.getOwnedAttributes()) {

			if (CDAModelUtil.getValidationSeverity(umlProperty) != null) {
				if (!shouldShallMayProperties.containsKey(umlProperty.getName())) {
					shouldShallMayProperties.put(umlProperty.getName(), umlProperty.getName());
				}
			}
		}

		for (Classifier c : umlClass.getGenerals()) {
			if (c instanceof Class && c.getGenerals().size() > 0) {
				createvalueSetProperies((Class) c, shouldShallMayProperties);
			}

		}

	}

	public EObject createInstance(Class umlClass, int levels) {

		HashMap<String, String> shallShouldMayProperties = new HashMap<String, String>();

		shallShouldMayProperties.put("id", "id");
		shallShouldMayProperties.put("effectiveTime", "effectiveTime");
		shallShouldMayProperties.put("time", "time");

		createvalueSetProperies(umlClass, shallShouldMayProperties);

		Package topPackage = UMLUtil.getTopPackage(umlClass);

		for (Package p : topPackage.getImportedPackages()) {
			Package instancePackage = getInstancePackage(p);

			if (instancePackage != null) { // umlClass.getName()
				setSampleAnnotations(instancePackage);
			}

		}

		Package instancePackage = getInstancePackage(topPackage);

		if (instancePackage != null) { // umlClass.getName()
			setSampleAnnotations(instancePackage);
		}

		EObject eObject = null;

		EClass eClass = getEClass(umlClass);

		if (eClass != null && !eClass.isAbstract()) {
			eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
			sampleInstanceInitialization(eObject, topPackage.eResource().getResourceSet(), shallShouldMayProperties);
		}
		return eObject;
	}

	public void save(EObject eObject, Writer writer) {
		try {
			if (eObject instanceof ClinicalDocument) {
				CDAUtil.save((ClinicalDocument) eObject, writer);
			} else if (eObject instanceof InfrastructureRoot) {
				CDAUtil.saveSnippet((InfrastructureRoot) eObject, writer);
			} else {
				writer.write("Unable to create XML Snippet");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void addAnnotation(ENamedElement eNamedElement, int depth, String source, String[] details, URI[] references) {

		EAnnotation eAnnotation = eNamedElement.getEAnnotation(CDA_SAMPLE_SOURCE);
		if (eAnnotation == null) {
			eAnnotation = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(source);
		} else {
			eAnnotation.getDetails().clear();
		}

		EMap<String, String> theDetails = eAnnotation.getDetails();
		for (int i = 1; i < details.length; i += 2) {
			theDetails.put(details[i - 1], details[i]);
		}
		EList<EAnnotation> annotations = eNamedElement.getEAnnotations();
		for (int i = 0; i < depth; ++i) {
			@SuppressWarnings("unchecked")
			EList<EAnnotation> childAnnotations = (EList<EAnnotation>) (EList<?>) annotations.get(annotations.size() - 1).getContents();
			annotations = childAnnotations;
		}
		annotations.add(eAnnotation);
		if (references != null) {
			InternalEList<EObject> eAnnotationReferences = (InternalEList<EObject>) eAnnotation.getReferences();
			for (URI reference : references) {
				InternalEObject internalEObject = (InternalEObject) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEObject();
				internalEObject.eSetProxyURI(reference);
				eAnnotationReferences.addUnique(internalEObject);
			}
		}
	}

	private static void addAnnotation(ENamedElement eNamedElement, String source, String[] details) {
		addAnnotation(eNamedElement, source, details, null);
	}

	private static void addAnnotation(ENamedElement eNamedElement, String source, String[] details, URI[] references) {
		addAnnotation(eNamedElement, 0, source, details, references);
	}

	private static void createValues(InstanceSpecification instanceSpecification, ArrayList<String> annotations) {
		for (Slot slot : instanceSpecification.getSlots()) {

			for (ValueSpecification vs : slot.getValues()) {
				if (vs instanceof InstanceValue) {
					InstanceValue instanceValue = (InstanceValue) vs;
					createValues(instanceValue.getInstance(), annotations);
				} else {
					if (vs instanceof LiteralString) {
						LiteralString literalString = (LiteralString) vs;
						if (literalString.getValue() != null && literalString.getValue().length() > 0) {
							annotations.add(vs.getName());
							annotations.add(literalString.getValue());
						}
					}

				}
			}
		}

	}

	public void setSampleAnnotations(Package umlPackage) {

		for (PackageableElement packageableElement : umlPackage.getPackagedElements()) {
			if (packageableElement instanceof InstanceSpecification) {
				InstanceSpecification instanceSpecification = (InstanceSpecification) packageableElement;

				for (Classifier classifier : instanceSpecification.getClassifiers()) {
					EClass eclass = getEClass(classifier);
					if (eclass != null) {
						ArrayList<String> annotations = new ArrayList<String>();
						createValues(instanceSpecification, annotations);
						String[] values = new String[] {};
						values = annotations.toArray(values);
						addAnnotation(eclass, CDA_SAMPLE_SOURCE, values);

					}
				}

			}
		}
	}
}
