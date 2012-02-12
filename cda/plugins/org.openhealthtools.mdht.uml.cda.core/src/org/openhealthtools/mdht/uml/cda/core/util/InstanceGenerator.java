/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

@SuppressWarnings("rawtypes")
public class InstanceGenerator {

	/*
	 * TODO Turn this into an extension point for non-cda "datatypes"
	 */
	private static class DatatypesInit extends org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch<Object> {

		private final Random random = new Random();

		public static String now(String dateFormat) {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			return sdf.format(cal.getTime());

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseCE(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
		 */
		@Override
		public Object caseCE(CE object) {
			object.setCode("Value");
			return object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseCS(org.openhealthtools.mdht.uml.hl7.datatypes.CS)
		 */
		@Override
		public Object caseCS(CS object) {

			if ("statusCode".equals(feature.getName())) {
				object.setCode("completed");
			}
			return object;
		}

		@Override
		public Object caseCD(CD object) {
			object.setCode(String.valueOf(Math.abs(random.nextInt())));
			return object;
		}

		@Override
		public Object caseII(II ii) {
			if (feature.getName().equals("id")) {

				ii.setRoot(String.valueOf(Math.abs(random.nextInt())));
			} else {
				ii.setRoot(UUID.randomUUID().toString());
			}
			return ii;
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
		public Object caseST(ST object) {

			if ((object.getText() != null && object.getText().length() == 0) && object.eContainer() != null) {
				if (object.eContainer() instanceof Section && object.eContainingFeature().getName().equals("title")) {
					Section s = (Section) object.eContainer();
					if (s.getCode() != null && s.getCode().getDisplayName() != null) {
						object.addText(s.getCode().getDisplayName());
					}
				}

			}

			return object;
		}

		@Override
		public Object caseSXCM_TS(SXCM_TS object) {
			object.setValue(now("yyyyMMdd"));
			return object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseED(org.openhealthtools.mdht.uml.hl7.datatypes.ED)
		 */
		@Override
		public Object caseED(ED object) {
			object.addText("Text Value");
			return object;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseINT(org.openhealthtools.mdht.uml.hl7.datatypes.INT)
		 */
		@Override
		public Object caseINT(INT object) {
			object.setValue(new Integer(1));
			return super.caseINT(object);
		}

		@Override
		public Object defaultCase(EObject object) {
			return super.defaultCase(object);
		}

		EStructuralFeature feature;

		/**
		 * @param feature
		 */
		public void setCurrentFeature(EStructuralFeature feature) {
			this.feature = feature;

		}

	}

	// public static final String CDA_SAMPLE_SOURCE = "http://www.openhealthtools.org/mdht/uml/cda/sample";
	//
	// private static final Pattern COMPONENT_PATTERN = Pattern.compile("(^[A-Za-z0-9]+)(\\[([1-9]+[0-9]*)\\])?");

	private static HashMap<String, String> createshallShouldMayProperties() {

		HashMap<String, String> shallShouldMayProperties = new HashMap<String, String>();

		shallShouldMayProperties.put("id", "id");
		shallShouldMayProperties.put("effectiveTime", "effectiveTime");
		shallShouldMayProperties.put("time", "time");
		shallShouldMayProperties.put("title", "title");

		return shallShouldMayProperties;

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

	private static EOperation findAddOperation(EClass eClass, EOperation getOperation) {
		for (EOperation eOperation : eClass.getEAllOperations()) {
			if (eOperation.getName() != null && eOperation.getName().startsWith("add")) {
				for (EParameter eParameter : eOperation.getEParameters()) {
					if (eParameter.getEType() instanceof EClass) {
						if (((EClass) eParameter.getEType()).isSuperTypeOf((EClass) getOperation.getEType())) {
							return eOperation;
						}
					}
				}

			}

		}
		return null;
	}

	private static void addObject(EClass eClass, EOperation addOperation, EObject eObject, EObject objectToAdd) {
		for (Method m : eClass.getInstanceClass().getMethods()) {
			if (addOperation.getName().equals(m.getName())) {
				try {
					m.invoke(eObject, objectToAdd);
				} catch (Exception e) {

				}
				break;

			}
		}
	}

	private static void initEObject(EObject eObject) {
		try {
			Method initMethod = eObject.getClass().getDeclaredMethod("init", new java.lang.Class[0]);
			if (initMethod != null) {
				initMethod.invoke(eObject, new Object[0]);
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private void sampleInstanceInitialization(Class umlClass, EObject eObject,
			HashMap<String, String> shallShouldMayProperties, int level) {

		if (level < 0) {
			return;
		}

		initEObject(eObject);

		EClass eClass = eObject.eClass();

		for (Association association : umlClass.getAssociations()) {
			for (Property property : association.getMemberEnds()) {
				if (umlClass.getOwnedAttribute(property.getName(), property.getType()) != null) {
					if (property.getType() instanceof Class) {
						Class cdaSourceClass = CDAModelUtil.getCDAClass(umlClass);
						Class cdaTypeClass = CDAModelUtil.getCDAClass((Classifier) property.getType());
						Property cdaProperty = null;
						if (cdaSourceClass != null) {
							cdaProperty = cdaSourceClass.getAttribute(null, cdaTypeClass);
						}

						if (cdaProperty != null) {
							EStructuralFeature cdaFeature = eClass.getEStructuralFeature(cdaProperty.getName());
							if (cdaFeature instanceof EReference) {
								EReference cdaReference = (EReference) cdaFeature;
								EObject objectToAdd = cdaReference.getEReferenceType().getEPackage().getEFactoryInstance().create(
									cdaReference.getEReferenceType());
								String ePackageURI = CDAModelUtil.getEcorePackageURI(property.getType());
								EPackage ePackage = getEPackageForURI(ePackageURI);
								if (ePackage != null) {
									EClassifier eet = ePackage.getEClassifier(UML2Util.getValidJavaIdentifier(umlClass.getName()) +
											"_" + UML2Util.getValidJavaIdentifier(property.getType().getName()));
									if (eet != null) {
										EAnnotation annotation = eet.getEAnnotation(CDAUtil.CDA_ANNOTATION_SOURCE);
										if (annotation != null) {
											CDAUtil.init(objectToAdd, annotation.getDetails().map());
										}
									}
								}

								HashMap<String, String> inlineshallShouldMayProperties = new HashMap<String, String>();

								createvalueSetProperies((Class) property.getType(), inlineshallShouldMayProperties);

								sampleInstanceInitialization(
									(Class) property.getType(), objectToAdd, inlineshallShouldMayProperties, level - 1);
								if (cdaReference.isMany()) {
									((EList) eObject.eGet(cdaReference)).add(objectToAdd);
								} else {
									eObject.eSet(cdaReference, objectToAdd);
								}
							}
						}
					}
				}
			}
		}

		for (EOperation eOperation : eClass.getEOperations()) {
			if (eOperation.getName().startsWith("get") && eOperation.getEType() instanceof EClass &&
					!((EClass) eOperation.getEType()).isAbstract()) {

				EOperation addOperation = findAddOperation(eClass, eOperation);
				if (addOperation != null) {
					EObject objectToAdd = eOperation.getEGenericType().getEClassifier().getEPackage().getEFactoryInstance().create(
						(EClass) eOperation.getEGenericType().getEClassifier());
					if (!eClass.equals(objectToAdd.eClass())) {
						sampleInstanceInitialization(umlClass, objectToAdd, shallShouldMayProperties, level - 1);
						addObject(eClass, addOperation, eObject, objectToAdd);
					}
				}
			}
		}

		DatatypesInit datatypesInit = new DatatypesInit();

		for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures()) {

			if (structuralFeature.getLowerBound() > 0 ||
					shallShouldMayProperties.containsKey(structuralFeature.getName())) {

				EClassifier sfEClass = structuralFeature.getEGenericType().getEClassifier();

				Property sfp = umlClass.getOwnedAttribute(structuralFeature.getName(), null);
				if (sfp != null) {

					sfEClass = getEClass(sfp.getType());
				}

				if (sfEClass instanceof EClass && !((EClass) sfEClass).isAbstract()) {

					if (structuralFeature.isMany() && !structuralFeature.getName().equals("mixed")) {

						EList result = (EList) eObject.eGet(structuralFeature);
						if (result.size() == 0) {
							EObject objectToAdd = sfEClass.getEPackage().getEFactoryInstance().create((EClass) sfEClass);
							if (DatatypesPackage.eINSTANCE.getNsURI().equals(
								objectToAdd.eClass().getEPackage().getNsURI())) {
								datatypesInit.setCurrentFeature(structuralFeature);
								datatypesInit.doSwitch(objectToAdd);
							} else {
								sampleInstanceInitialization(umlClass, objectToAdd, shallShouldMayProperties, level - 1);
							}
							try {
								result.add(objectToAdd);
							} catch (ClassCastException cce) {
								System.out.println("Unable to add " + eClass.getName() + "." +
										structuralFeature.getName() + " using type " + objectToAdd.eClass().getName());
							}
						}
					} else {

						Object result = eObject.eGet(structuralFeature);
						if (result == null && structuralFeature.getEType() instanceof EClass) {
							EObject objectToSet = structuralFeature.getEType().getEPackage().getEFactoryInstance().create(
								(EClass) structuralFeature.getEType());

							if (DatatypesPackage.eINSTANCE.getNsURI().equals(
								objectToSet.eClass().getEPackage().getNsURI())) {

								datatypesInit.setCurrentFeature(structuralFeature);
								datatypesInit.doSwitch(objectToSet);
							}
							try {
								eObject.eSet(structuralFeature, objectToSet);
							} catch (ClassCastException cce) {
								System.out.println("Unable to set " + eClass.getName() + "." +
										structuralFeature.getEType().getName() + structuralFeature.getName() +
										" using type " + objectToSet.eClass().getName());
							}
						}
					}
				}
			}
		}

	}

	private Map<String, EPackage> packageURIMap = new HashMap<String, EPackage>();

	boolean standalone = true;

	public InstanceGenerator() {
		CDAUtil.loadPackages();
	}

	public InstanceGenerator(boolean standalone) {
		this.standalone = standalone;
		CDAUtil.loadPackages();
	}

	ClinicalDocument clinicalDocument = null;

	@SuppressWarnings("unchecked")
	public EObject createInstance(Class umlClass, int levels) {

		Package topPackage = UMLUtil.getTopPackage(umlClass);

		Type type = topPackage.getOwnedType(null, false, UMLPackage.eINSTANCE.getArtifact(), false);

		EObject eObject = null;

		EClass eClass = getEClass(umlClass);

		if (type != null && type instanceof Artifact) {

			Artifact sampleArtifact = (Artifact) type;

			try {

				if (clinicalDocument == null) {

					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

					IProject docProject = root.getProject(topPackage.eResource().getURI().segment(1).replace(
						".model", ".doc"));

					if (docProject.exists()) {
						IFolder samplesFolder = docProject.getFolder("samples");
						if (samplesFolder.exists()) {
							IFile samplesFile = samplesFolder.getFile(sampleArtifact.getFileName());

							if (samplesFile.exists()) {
								clinicalDocument = CDAUtil.load(new FileInputStream(root.getLocation().append(
									samplesFile.getFullPath()).toFile()));
							}
						}

					} else {

						URI uri = topPackage.eResource().getURI();

						if (uri != null) {

							String[] segments = uri.segments();

							if (segments.length > 3) {

								String docProjectName = segments[segments.length - 3].replace(".model", ".doc");

								String sampleInstancePath = uri.path();

								if (sampleInstancePath != null) {

									sampleInstancePath = sampleInstancePath.replace(
										segments[segments.length - 3], docProjectName);
									sampleInstancePath = sampleInstancePath.replace(
										segments[segments.length - 2], "samples");
									sampleInstancePath = sampleInstancePath.replace(
										segments[segments.length - 1], sampleArtifact.getFileName());

									File file = new File(sampleInstancePath);
									if (file.exists()) {
										clinicalDocument = CDAUtil.load(new FileInputStream(file));
									}

								}
							}

						}

					}

				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

		if (clinicalDocument != null) {
			CDAUtil.Query query = new CDAUtil.Query(clinicalDocument);
			eObject = query.getEObject((java.lang.Class<? extends EObject>) eClass.getInstanceClass());
			if (eObject != null) {
				return EcoreUtil.copy(eObject);
			}

		}

		HashMap<String, String> shallShouldMayProperties = createshallShouldMayProperties();

		createvalueSetProperies(umlClass, shallShouldMayProperties);

		if (eClass != null && !eClass.isAbstract()) {

			eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
			// topPackage.eResource().getResourceSet(), shallShouldMayProperties,
			sampleInstanceInitialization(umlClass, eObject, shallShouldMayProperties, levels);

		}

		return eObject;

	}

	private EClass getEClass(Type umlType) {
		String ePackageURI = CDAModelUtil.getEcorePackageURI(umlType);
		if (ePackageURI != null) {
			EPackage ePackage = getEPackageForURI(ePackageURI);
			if (ePackage != null && umlType != null) {
				EClassifier eClassifier = ePackage.getEClassifier(UML2Util.getValidJavaIdentifier(umlType.getName()));
				if (eClassifier instanceof EClass) {
					return (EClass) eClassifier;
				}
			}
		}

		return null;
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

}
