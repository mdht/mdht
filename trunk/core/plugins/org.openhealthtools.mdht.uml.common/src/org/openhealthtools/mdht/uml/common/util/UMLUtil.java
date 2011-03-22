/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - added utility to retrieve controlled (sub-)resources
 *     Kenn Hussey - added utilities for working with (model) properties files
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.internal.Logger;

/**
 * 
 * @version $Id: $
 */
public class UMLUtil {

	/**
	 * This method breaks sourceName into words delimited by mixed-case naming.
	 * Copied from org.eclipse.emf.codegen.util.CodeGenUtil.parseName()
	 */
	public static List<String> splitName(String sourceName) {
		List<String> result = new ArrayList<String>();
		if (sourceName != null) {
			StringBuilder currentWord = new StringBuilder();
			boolean lastIsLower = false;
			for (int index = 0, length = sourceName.length(); index < length; ++index) {
				char curChar = sourceName.charAt(index);
				if (Character.isUpperCase(curChar)
						|| (!lastIsLower && Character.isDigit(curChar))) {
					if (lastIsLower && currentWord.length() > 1) {
						result.add(currentWord.toString());
						currentWord = new StringBuilder();
					}
					lastIsLower = false;
				} else {
					if (!lastIsLower) {
						int currentWordLength = currentWord.length();
						if (currentWordLength > 1) {
							char lastChar = currentWord
									.charAt(--currentWordLength);
							currentWord.setLength(currentWordLength);
							result.add(currentWord.toString());
							currentWord = new StringBuilder();
							currentWord.append(lastChar);
						}
					}
					lastIsLower = true;
				}

				currentWord.append(curChar);
			}

			result.add(currentWord.toString());
		}
		return result;
	}

	/**
	 * This method breaks element's name into words delimited by mixed-case
	 * naming and returns a string with name words separated by space. If model
	 * element name already contains spaces, return unchanged.
	 */
	public static String splitName(NamedElement element) {
		String modelName = element.getName();
		if (modelName.indexOf(' ') > 0) {
			return modelName;
		}

		StringBuffer buffer = new StringBuffer();
		for (String token : UMLUtil.splitName(modelName)) {
			buffer.append(buffer.length() > 0 ? " " : "");
			buffer.append(token);
		}

		return buffer.toString();
	}

	/**
	 * Accumulate a list containing the unqualified names of all generalizations
	 * for the given classifier, including this classfier name.
	 * 
	 * @param classifier
	 * @return a List with zero or more classifiers
	 */
	public static List<String> getAllParentNames(Classifier classifier) {

		List<String> parentNames = new ArrayList<String>();

		parentNames.add(classifier.getName());

		for (Classifier parent : classifier.getGenerals()) {
			parentNames.addAll(getAllParentNames(parent));
		}
		return parentNames;
	}

	/**
	 * Accumulate a list containing general classifiers of all generalizations
	 * for the given classifier, including the given classfier.
	 * 
	 * @param classifier
	 * @return a List with zero or more classifiers
	 */
	public static List<Classifier> getAllGeneralizations(Classifier classifier) {
		List<Classifier> parents = new ArrayList<Classifier>();
		parents.add(classifier);

		for (Classifier parent : classifier.getGenerals()) {
			parents.addAll(getAllGeneralizations(parent));
		}
		return parents;
	}

	/**
	 * Accumulate a list containing specific classifiers of all subclass generalizations
	 * for the given classifier, including the given classfier. This list will include
	 * only classifier from models loaded into the current ResourceSet.
	 * 
	 * @param classifier
	 * @return a List with zero or more classifiers
	 */
	public static List<Classifier> getAllSpecializations(Classifier classifier) {
		List<Classifier> allSpecializations = new ArrayList<Classifier>();

		List<DirectedRelationship>specializations = 
			classifier.getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
		for (DirectedRelationship relationship : specializations) {
			Classifier specific = ((Generalization)relationship).getSpecific();
			if (specific != null) {
				allSpecializations.add(specific);
				allSpecializations.addAll(getAllSpecializations(specific));
			}
		}
		
		return allSpecializations;
	}
	
	/**
	 * Search all nested packages for the given classifier name. This search
	 * does not consider qualified names, but only looks for a matching local
	 * name.
	 * 
	 * @param basePackage
	 *            base package for the library
	 * @param localName
	 * @return a Classifier, or null if not found
	 */
	public static Classifier getClassifierByName(Package basePackage,
			final String localName) {
		return getClassifierByName(basePackage, localName, null);
	}

	/**
	 * Search all nested packages for the given class name. This search does not
	 * consider qualified names, but only looks for a matching local name.
	 * 
	 * @param basePackage
	 *            base package for the library
	 * @param localName
	 * @return a Class, or null if not found
	 */
	public static Class getClassByName(Package basePackage,
			final String localName) {
		return (Class) getClassifierByName(basePackage, localName,
				UMLPackage.Literals.CLASS);
	}

	/**
	 * Search all nested packages for the given data type name. This search does
	 * not consider qualified names, but only looks for a matching local name.
	 * 
	 * @param basePackage
	 *            base package for the library
	 * @param localName
	 * @return a DataType, or null if not found
	 */
	public static DataType getDataTypeByName(Package basePackage,
			final String localName) {
		return (DataType) getClassifierByName(basePackage, localName,
				UMLPackage.Literals.DATA_TYPE);
	}

	/**
	 * Search all nested packages for the given enumeration name. This search
	 * does not consider qualified names, but only looks for a matching local
	 * name.
	 * 
	 * @param basePackage
	 *            base package for the library
	 * @param localName
	 * @return an Enumeration, or null if not found
	 */
	public static Enumeration getEnumerationByName(Package basePackage,
			final String localName) {
		return (Enumeration) getClassifierByName(basePackage, localName,
				UMLPackage.Literals.ENUMERATION);
	}

	/**
	 * Search all nested packages for the given classifier name. This search
	 * does not consider qualified names, but only looks for a matching local
	 * classifer name.
	 * 
	 * @param basePackage
	 *            base package for the library
	 * @param localName
	 * @param eClass
	 *            UML metaclass to search for
	 * @return a Classifier, or null if not found
	 */
	public static Classifier getClassifierByName(Package basePackage,
			final String localName, final EClass eClass) {
		if (basePackage == null || localName == null)
			return null;

		Classifier classifier = null;

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
			public Object caseClassifier(Classifier classifier) {
				if (localName.equals(classifier.getName())) {
					if (eClass == null)
						return classifier;
					else
						return eClass == classifier.eClass() ? classifier
								: null;
				} else
					return null;
			}

			public Object casePackage(Package pkg) {
				Object result = null;
				for (NamedElement namedElement : pkg.getOwnedMembers()) {
					result = doSwitch(namedElement);
					if (result != null)
						break;
				}
				return result;
			}
		};

		classifier = (Classifier) umlSwitch.doSwitch(basePackage);

		return classifier;
	}

	/**
	 * Returns the outermost top package containing the given package.
	 * 
	 * @param pkg
	 * @return a Package
	 */
	public static Package getTopPackage(Package pkg) {
		if (pkg.eIsProxy())
			return null;

		EList<Package> allOwningPackages = pkg.allOwningPackages();
		int size = allOwningPackages.size();

		return size > 0 ? allOwningPackages.get(size - 1) : pkg;
	}

	/**
	 * Returns the outermost top package containing the given element.
	 * 
	 * @param element
	 * @return a Package
	 */
	public static Package getTopPackage(Element element) {
		return element.eIsProxy() ? null : getTopPackage(element
				.getNearestPackage());
	}

	/**
	 * Get nearest UML namespace containing this model element.
	 */
	public static Namespace getNearestNamespace(Element element) {
		if (element.eIsProxy())
			return null;

		EObject eObject = element;
		while (!(eObject instanceof Namespace))
			eObject = eObject.eContainer();

		return eObject instanceof Namespace ? (Namespace) eObject : null;
	}

	public static boolean isSameModel(Element first, Element second) {
		if (first == null || second == null)
			return false;

		Package firstPackage = UMLUtil.getTopPackage(first);
		Package secondPackage = UMLUtil.getTopPackage(second);

		if (firstPackage == null || secondPackage == null)
			return first.eResource().getURI()
					.equals(second.eResource().getURI());
		else
			return firstPackage.equals(secondPackage)
					|| firstPackage.getImportedElements().contains(second);
	}

	public static boolean isSameProject(Element first, Element second) {
		// get Resource, compare base path except for file name
		// TODO also strip folder within project
		URI firstURI = first.eResource().getURI();
		URI secondURI = second.eResource().getURI();

		return firstURI.trimSegments(1).equals(secondURI.trimSegments(1));
	}

	/**
	 * Find next unused type name, using 'name' as the base.
	 */
	public static String getUniqueTypeName(Package owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getOwnedType(uniqueName));

		return uniqueName;
	}

	/**
	 * Find next unused nested classifier name, using 'name' as the base.
	 */
	public static String getUniqueNestedClassifierName(Class owner, String name) {
		int seqNo = 1;
		String uniqueName;

		do {
			uniqueName = name + String.valueOf(seqNo++);
		} while (null != owner.getNestedClassifier(uniqueName));

		return uniqueName;
	}

	public static String getPackageQualifiedName(NamedElement namedElement) {
		if (namedElement.eIsProxy() || namedElement.getName() == null)
			return null;

		StringBuffer qname = new StringBuffer(namedElement.getName());
		Element container = namedElement.getOwner();
		while (container instanceof NamedElement) {
			qname.insert(0, NamedElement.SEPARATOR);
			qname.insert(0, ((NamedElement) container).getName());
			if (container instanceof Package) {
				break;
			}
			container = container.getOwner();
		}
		return qname.toString();
	}

	public static void cloneStereotypes(Element first, Element second) {
		for (Stereotype s : first.getAppliedStereotypes()) {
			if (second.isStereotypeApplicable(s)) {
				second.applyStereotype(s);

				for (Property sProperty : s.getAllAttributes()) {
					if (sProperty.getName().startsWith("base_"))
						continue;

					try {
						Object value = first.getValue(s, sProperty.getName());
						if (value != null) {
							second.setValue(s, sProperty.getName(), value);
						}
					} catch (IllegalArgumentException e) {
						// ignore
					}
				}
			}
		}

		/*
		 * TODO clone stereotypes for all matching owned elements. However
		 * getOwnedElements() is a union and may have problems with list order
		 * and getting matching owned elements in second element.
		 */
		// for (Element ownedElement : first.getOwnedElements()) {
		//
		// }
	}

	public static void cloneStereotypes(Class first, Class second) {
		cloneStereotypes((Element) first, (Element) second);

		for (Property p1 : first.getOwnedAttributes()) {
			Property p2 = second.getOwnedAttribute(p1.getName(), p1.getType());
			if (p2 != null) {
				cloneStereotypes(p1, p2);
			}
		}
		for (Constraint constraint1 : first.getOwnedRules()) {
			Constraint constraint2 = second.getOwnedRule(constraint1.getName());
			if (constraint2 != null) {
				cloneStereotypes(constraint1, constraint2);
			}
		}
	}

	public static void cloneStereotypes(Enumeration first, Enumeration second) {
		cloneStereotypes((Element) first, (Element) second);

		for (EnumerationLiteral literal1 : first.getOwnedLiterals()) {
			EnumerationLiteral literal2 = second.getOwnedLiteral(literal1.getName());
			if (literal2 != null) {
				cloneStereotypes(literal1, literal2);
			}
		}
	}

	public static void addAliasName(Element element, String alias) {
		if (alias != null && alias.length() > 0) {
			EAnnotation annotation = element.createEAnnotation("uml2.alias");
			annotation.getDetails().put(alias, null);
		}
	}

	public static String setEObjectID(Element element) {
		String xmiId = org.eclipse.uml2.uml.util.UMLUtil
				.getXMIIdentifier((InternalEObject) element);

		return setEObjectID(element, xmiId);
	}

	public static String setEObjectID(Generalization generalization) {
		XMLResource resource = ((XMLResource) generalization.eResource());
		StringBuffer xmiId = new StringBuffer();
		xmiId.append(resource.getID(generalization.getGeneral()));
		xmiId.append("_");
		xmiId.append(resource.getID(generalization.getSpecific()));
		xmiId.append("_generalization");

		return setEObjectID(generalization, xmiId.toString());
	}

	/*
	 * TODO this is not a reliable ID for association
	 */
	public static String setEObjectID(Association association) {
		return setEObjectID((Element) association);

		// XMLResource resource = ((XMLResource)association.eResource());
		// StringBuffer xmiId = new StringBuffer();
		// for (Property end : association.getMemberEnds()) {
		// if (xmiId.length() > 0)
		// xmiId.append("_");
		//
		// if (end.isNavigable())
		// xmiId.append(resource.getID(end));
		// else
		// xmiId.append("anonymous");
		// }
		// xmiId.append("_association");
		//
		// return setEObjectID(association, xmiId.toString());
	}

	public static String setEObjectID(Element element, String xmiId) {
		XMLResource resource = ((XMLResource) element.eResource());
		if (xmiId != null && xmiId.length() > 0) {
			int suffix = 1;
			String firstId = xmiId;
			while (resource.getEObject(xmiId) != null)
				xmiId = firstId + "." + suffix++;

			resource.setID(element, xmiId);
		}

		return xmiId;
	}

	/**
	 * Import library into a model containing the given package.
	 * 
	 * @param basePackage
	 *            a package for the model into which library is imported
	 * @return root package of the imported library
	 */
	public static Package importLibrary(Package basePackage, String libraryURI) {
		Package library = null;
		try {
			ResourceSet resourceSet = basePackage.eResource().getResourceSet();
			Resource libraryResource = resourceSet.getResource(
					URI.createURI(libraryURI), true);

			if (libraryResource != null) {
				library = (Package) EcoreUtil.getObjectByType(
						libraryResource.getContents(),
						UMLPackage.eINSTANCE.getPackage());

				// This must be called from within an EMFT Transaction.
				if (library != null) {
					PackageImport packageImport = null;
					Package topPackage = getTopPackage(basePackage);
					for (PackageImport pkgImport : topPackage
							.getPackageImports()) {
						if (library.equals(pkgImport.getImportedPackage())) {
							packageImport = pkgImport;
							break;
						}
					}
					if (packageImport == null) {
						packageImport = topPackage.createPackageImport(library);
					}
				}
			}

		} catch (WrappedException we) {
			Logger.logException(we);
		}

		return library;
	}

	/**
	 * @param classifier
	 * @return true if classifier contains template bindings.
	 */
	public static boolean isTemplateBinding(Classifier classifier) {
		return classifier != null
				&& classifier.getTemplateBindings().size() > 0;
	}

	/**
	 * If classifier is a template binding and template is a Classifier, return
	 * the template, else return null.
	 * 
	 * @param classifier
	 * @return template classifier, or null if not a template binding
	 */
	public static Classifier getTemplate(Classifier classifier) {
		Classifier template = null;
		for (TemplateBinding binding : classifier.getTemplateBindings()) {
			if (binding.getSignature().getTemplate() instanceof Classifier) {
				template = (Classifier) binding.getSignature().getTemplate();
			}
		}
		return template;
	}

	private static final String UML2REFLECTIONERROR = "UML2 Reflection Error";

	/**
	 * getConstrainingClassifier is a static utility method used to encapsulate
	 * UML 2.3 Migration in the code base. The goal is to use the same code and
	 * avoid multiple builds, features, sites to support both UML 2.2 and 2.3
	 * api with the same code base.
	 * 
	 * The difference in this case is that ConstrainingClassifier is scalar in
	 * 2.2 (0..1) and list (0..*) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently
	 * does not have an "hasMethod" so the approach is to call getMethod on the
	 * target class starting with UML 2.2 method. If the method is not found or
	 * some exception has been encountered attempt to get the 2.3 method. If
	 * both attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all
	 * exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0
	 * _Migration_Guide/guide.html
	 * 
	 * @param classifierTemplateParameter
	 * @return
	 * @throws NoSuchMethodException
	 * 
	 * 
	 */
	public static Classifier getConstrainingClassifier(
			ClassifierTemplateParameter classifierTemplateParameter) {

		Classifier classifier = null;

		boolean reflectionCompleted = false;

		try {

			// Attempt UML 2.2 API
			Method getConstrainingClassifier = ClassifierTemplateParameter.class
					.getMethod("getConstrainingClassifier",
							(java.lang.Class<?>[]) null);

			classifier = (Classifier) getConstrainingClassifier.invoke(
					classifierTemplateParameter, (Object[]) null);

			reflectionCompleted = true;

		} catch (IllegalArgumentException e) {
			// Consume Exception
		} catch (IllegalAccessException e) {
			// Consume Exception
		} catch (InvocationTargetException e) {
			// Consume Exception
		} catch (SecurityException e) {
			// Consume Exception
		} catch (NoSuchMethodException e) {
			// Consume Exception
		}

		if (!reflectionCompleted) {

			try {

				// Attempt UML 2.3 API
				Method getConstrainingClassifiers = ClassifierTemplateParameter.class
						.getMethod("getConstrainingClassifiers",
								(java.lang.Class<?>[]) null);

				EList<Classifier> classifiers = (EList<Classifier>) getConstrainingClassifiers
						.invoke(classifierTemplateParameter, (Object[]) null);

				if (classifiers.size() > 0) {
					classifier = classifiers.get(0);
				}

				reflectionCompleted = true;
			} catch (IllegalArgumentException e) {
				// Consume Exception
			} catch (IllegalAccessException e) {
				// Consume Exception
			} catch (InvocationTargetException e) {
				// Consume Exception
			} catch (SecurityException e) {
				// Consume Exception
			} catch (NoSuchMethodException e) {
				// Consume Exception
			}

		}

		// If neither 2.2/2.3 or some other execution error a general purpose
		// UML 2 Reflection Error
		if (!reflectionCompleted) {
			throw new RuntimeException(UML2REFLECTIONERROR);

		}

		return classifier;
	}

	/**
	 * setConstrainingClassifier is a static utility method used to encapsulate
	 * UML 2.3 Migration in the code base. The goal is to use the same code and
	 * avoid multiple builds, features, sites to support both UML 2.2 and 2.3
	 * api with the same code base.
	 * 
	 * The difference in this case is that ConstrainingClassifier is scalar in
	 * 2.2 (0..1) and list (0..*) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently
	 * does not have an "hasMethod" so the approach is to call getMethod on the
	 * target class starting with UML 2.2 method. If the method is not found or
	 * some exception has been encountered attempt to get the 2.3 method. If
	 * both attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all
	 * exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0
	 * _Migration_Guide/guide.html
	 * 
	 * @param classifierTemplateParameter
	 * @param constraint
	 */
	public static void setConstrainingClassifier(
			ClassifierTemplateParameter classifierTemplateParameter,
			Classifier constraint) {

		boolean reflectionCompleted = false;

		try {

			// Attempt UML 2.2 API

			Method setConstrainingClassifier = ClassifierTemplateParameter.class
					.getMethod("setConstrainingClassifier",
							new java.lang.Class<?>[] { Classifier.class });

			setConstrainingClassifier.invoke(classifierTemplateParameter,
					new Object[] { constraint });

			reflectionCompleted = true;

		} catch (IllegalArgumentException e) {
			// Consume Exception
		} catch (IllegalAccessException e) {
			// Consume Exception
		} catch (InvocationTargetException e) {
			// Consume Exception
		} catch (SecurityException e) {
			// Consume Exception
		} catch (NoSuchMethodException e) {
			// Consume Exception
		}

		if (!reflectionCompleted) {

			try {

				// Attempt UML 2.3 API

				Method getConstrainingClassifiers = ClassifierTemplateParameter.class
						.getMethod("getConstrainingClassifiers",
								(java.lang.Class<?>[]) null);

				EList<Classifier> classifiers = (EList<Classifier>) getConstrainingClassifiers
						.invoke(classifierTemplateParameter, (Object[]) null);

				classifiers.add(constraint);

				reflectionCompleted = true;

			} catch (IllegalArgumentException e) {
				// Consume Exception
			} catch (IllegalAccessException e) {
				// Consume Exception
			} catch (InvocationTargetException e) {
				// Consume Exception
			} catch (SecurityException e) {
				// Consume Exception
			} catch (NoSuchMethodException e) {
				// Consume Exception
			}

		}

		// If neither 2.2/2.3 or some other execution error a general purpose
		// UML 2 Reflection Error
		if (!reflectionCompleted) {
			throw new RuntimeException(UML2REFLECTIONERROR);

		}

		return;

	}

	/**
	 * setParameterableElement is a static utility method used to encapsulate
	 * UML 2.3 Migration in the code base. The goal is to use the same code and
	 * avoid multiple builds, features, sites to support both UML 2.2 and 2.3
	 * api with the same code base.
	 * 
	 * The difference in this case is that TemplateParameterSubstitution Actual
	 * Parameters a list (0..*) in 2.2 and scalar (0..1) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently
	 * does not have an "hasMethod" so the approach is to call getMethod on the
	 * target class starting with UML 2.2 method. If the method is not found or
	 * some exception has been encountered attempt to get the 2.3 method. If
	 * both attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all
	 * exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0
	 * _Migration_Guide/guide.html
	 * 
	 * @param substitution
	 * @param parameterableElement
	 */
	public static void setParameterableElement(
			TemplateParameterSubstitution substitution,
			ParameterableElement parameterableElement) {
		boolean reflectionCompleted = false;

		try {
			// Attempt UML 2.2 API
			Method getAcuals = TemplateParameterSubstitution.class.getMethod(
					"getActuals", (java.lang.Class<?>[]) null);

			EList<ParameterableElement> actuals = (EList<ParameterableElement>) getAcuals
					.invoke(substitution, (Object[]) null);

			reflectionCompleted = true;

			actuals.add(parameterableElement);

		} catch (IllegalArgumentException e) {
			// Consume Exception
		} catch (IllegalAccessException e) {
			// Consume Exception
		} catch (InvocationTargetException e) {
			// Consume Exception
		} catch (SecurityException e) {
			// Consume Exception
		} catch (NoSuchMethodException e) {
			// Consume Exception
		}

		if (!reflectionCompleted) {

			try {
				// Attempt UML 2.3 API
				Method setAcual = TemplateParameterSubstitution.class
						.getMethod(
								"setActual",
								new java.lang.Class<?>[] { ParameterableElement.class });

				setAcual.invoke(substitution,
						new Object[] { parameterableElement });

				reflectionCompleted = true;

			} catch (IllegalArgumentException e) {
				// Consume Exception
			} catch (IllegalAccessException e) {
				// Consume Exception
			} catch (InvocationTargetException e) {
				// Consume Exception
			} catch (SecurityException e) {
				// Consume Exception
			} catch (NoSuchMethodException e) {
				// Consume Exception
			}

		}

		// If neither 2.2/2.3 or some other execution error a general purpose
		// UML 2 Reflection Error
		if (!reflectionCompleted) {
			throw new RuntimeException(UML2REFLECTIONERROR);

		}

		return;
	}

	/**
	 * setParameterableElement is a static utility method used to encapsulate
	 * UML 2.3 Migration in the code base. The goal is to use the same code and
	 * avoid multiple builds, features, sites to support both UML 2.2 and 2.3
	 * api with the same code base.
	 * 
	 * The difference in this case is that TemplateParameterSubstitution Actual
	 * Parameters a list (0..*) in 2.2 and scalar (0..1) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently
	 * does not have an "hasMethod" so the approach is to call getMethod on the
	 * target class starting with UML 2.2 method. If the method is not found or
	 * some exception has been encountered attempt to get the 2.3 method. If
	 * both attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all
	 * exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0
	 * _Migration_Guide/guide.html
	 * 
	 * @param substitution
	 * @return
	 */
	public static ParameterableElement getParameterableElement(
			TemplateParameterSubstitution substitution) {

		ParameterableElement parameterableElement = null;

		boolean reflectionCompleted = false;

		try {
			// Attempt UML 2.2 API
			Method getAcuals = TemplateParameterSubstitution.class.getMethod(
					"getActuals", null);

			EList<ParameterableElement> actuals = (EList<ParameterableElement>) getAcuals
					.invoke(substitution, null);

			reflectionCompleted = true;

			if (actuals.size() > 0) {
				parameterableElement = actuals.get(0);
			}

		} catch (IllegalArgumentException e) {
			// Consume Exception
		} catch (IllegalAccessException e) {
			// Consume Exception
		} catch (InvocationTargetException e) {
			// Consume Exception
		} catch (SecurityException e) {
			// Consume Exception
		} catch (NoSuchMethodException e) {
			// Consume Exception
		}

		if (!reflectionCompleted) {

			try {
				// Attempt UML 2.3 API
				Method getAcual = TemplateParameterSubstitution.class
						.getMethod("getActual", null);

				parameterableElement = (ParameterableElement) getAcual.invoke(
						substitution, null);
				reflectionCompleted = true;
			} catch (IllegalArgumentException e) {
				// Consume Exception
			} catch (IllegalAccessException e) {
				// Consume Exception
			} catch (InvocationTargetException e) {
				// Consume Exception
			} catch (SecurityException e) {
				// Consume Exception
			} catch (NoSuchMethodException e) {
				// Consume Exception
			}

		}

		// If neither 2.2/2.3 or some other execution error a general purpose
		// UML 2 Reflection Error
		if (!reflectionCompleted) {
			throw new RuntimeException(UML2REFLECTIONERROR);

		}

		return parameterableElement;
	}

	/**
	 * If classifier is a template binding and template is a Classifier, return
	 * a list of template parameter substitutions. Only include
	 * ParameterableElement if it is a Classifier.
	 * 
	 * @param classifier
	 * @return list of template binding parameter substitutions
	 */
	public static List<Classifier> getTemplateBindingParameters(
			Classifier classifier) {
		List<Classifier> params = new ArrayList<Classifier>();
		for (TemplateBinding binding : classifier.getTemplateBindings()) {
			if (binding.getSignature().getTemplate() instanceof Classifier) {
				for (TemplateParameterSubstitution substitution : binding
						.getParameterSubstitutions()) {
					ParameterableElement element = getParameterableElement(substitution);
					if (element instanceof Classifier) {
						params.add((Classifier) element);
					}
				}
			}

			// only process one binding, why would there ever be more?
			break;
		}
		return params;
	}

	/**
	 * Find applied profile to a Package container of element, or return null if
	 * profile is not applied.
	 * 
	 * @param profileURI
	 * @param element
	 * @return
	 */
	public static Profile getAppliedProfile(String profileURI, Element element) {
		if (element == null)
			return null;

		try {
			ResourceSet resourceSet = element.eResource().getResourceSet();
			Resource profileResource = resourceSet.getResource(
					URI.createURI(profileURI), true);

			if (profileResource != null) {
				// is profile loaded into this resource set?
				Profile profile = (Profile) EcoreUtil.getObjectByType(
						profileResource.getContents(),
						UMLPackage.eINSTANCE.getProfile());

				if (profile == null) {
					return null;
				}
				try {
					Package pkg = element.getNearestPackage();
					while (pkg != null) {
						if (pkg.isProfileApplied(profile))
							return profile;
						else
							pkg = pkg.getNestingPackage();
					}
				} catch (IllegalArgumentException e) {
					Logger.logException(e);
				}
			}

		} catch (WrappedException we) {
			Logger.logException(we);
		}

		return null;
	}

	/**
	 * Delegates to the subclass specific getOwnedAttributes() method for type.
	 * 
	 * @param type
	 * @return list of Property
	 */
	public static List<Property> getOwnedAttributes(Type type) {

		return (List) new UMLSwitch() {

			public Object caseArtifact(Artifact artifact) {
				return artifact.getOwnedAttributes();
			}

			public Object caseDataType(DataType dataType) {
				return dataType.getOwnedAttributes();
			}

			public Object caseInterface(Interface interface_) {
				return interface_.getOwnedAttributes();
			}

			public Object caseSignal(Signal signal) {
				return signal.getOwnedAttributes();
			}

			public Object caseStructuredClassifier(
					StructuredClassifier structuredClassifier) {
				return structuredClassifier.getOwnedAttributes();
			}

			public Object doSwitch(EObject eObject) {
				return null == eObject ? null : super.doSwitch(eObject);
			}
		}.doSwitch(type);
	}

	public static List<Property> getRedefinedProperties(Property property) {
		List<Property> redefinedProperties = new ArrayList<Property>();
		if (!property.getRedefinedProperties().isEmpty()) {
			redefinedProperties.addAll(property.getRedefinedProperties());
		} else {
			for (Classifier parent : property.getClass_().allParents()) {
				Property p = parent.getAttribute(property.getName(), null);
				if (p != null) {
					redefinedProperties.add(p);
				}
			}
		}

		return redefinedProperties;
	}

	public static List<Resource> getControlledResources(Resource resource) {
		List<Resource> controlledResources = new UniqueEList.FastCompare<Resource>();
		if (resource != null) {
			for (TreeIterator<EObject> allContents = resource.getAllContents(); allContents
					.hasNext();) {
				Resource directResource = ((InternalEObject) allContents.next())
						.eDirectResource();
				if (directResource != null && directResource != resource) {
					controlledResources.add(directResource);
				}
			}
		}
		return controlledResources;
	}

	/**
	 * File encoding for properties files.
	 */
	protected static final String PROPERTIES_ENCODING = "ISO-8859-1";

	/**
	 * Reads the properties file at the specified URI.
	 * 
	 * @param uri
	 *            The URI of the properties file.
	 * @return The contents of the properties file as a string, or
	 *         <code>null</code> if an exception occurs.
	 */
	public static String readProperties(URI uri) {
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					new ExtensibleURIConverterImpl().createInputStream(uri));
			byte[] input = new byte[bufferedInputStream.available()];
			bufferedInputStream.read(input);
			bufferedInputStream.close();
			return new String(input, PROPERTIES_ENCODING);
		} catch (IOException exception) {
			// ignore
		}

		return null;
	}

	/**
	 * Writes the specified properties to a file with the specified URI.
	 * 
	 * @param uri
	 *            The URI of the properties file.
	 * @param properties
	 *            The properties to be written.
	 * @return Whether the properties were successfully written.
	 */
	public static boolean writeProperties(URI uri,
			Map<String, String> properties) {
		StringBuilder result = new StringBuilder();

		for (String property : properties.values()) {
			result.append(property);
		}

		try {
			OutputStream output = new ExtensibleURIConverterImpl()
					.createOutputStream(uri);
			output.write(result.toString().getBytes(PROPERTIES_ENCODING));
			output.close();

			return true;
		} catch (IOException ioe) {
			return false;
		}
	}

	/**
	 * Patterns for lines in a properties file.
	 */
	protected static Pattern PROPERTY_LINE = Pattern.compile(
			"\\s*(\\S+)\\s*=.*", Pattern.MULTILINE);

	/**
	 * Parses the specified properties file contents into a map of key/value
	 * pairs, where the key is the key for a named element and the value is the
	 * corresponding line from the properties file.
	 * 
	 * @param properties
	 *            The string contents of a properties file as a string.
	 * @return A map containing key/value pairs for the specified properties
	 *         file contents.
	 */
	public static Map<String, String> parseProperties(String properties) {
		Map<String, String> result = new LinkedHashMap<String, String>();
		int i = 0;

		while (i < properties.length()) {
			int eol;

			for (int start = i;;) {
				eol = properties.indexOf("\n", start);

				if (eol != -1) {

					if (eol + 1 < properties.length()
							&& properties.charAt(eol + 1) == '\r') {

						if (eol > start && properties.charAt(eol - 1) == '\\') {
							start = eol + 2;
						} else {
							++eol;
							break;
						}
					} else if (eol > start
							&& properties.charAt(eol - 1) == '\\'
							|| eol - 1 > start
							&& properties.charAt(eol - 1) == '\r'
							&& properties.charAt(eol - 2) == '\\') {
						start = eol + 1;
					} else {
						break;
					}
				} else {
					eol = properties.indexOf("\r", start);

					if (eol == -1) {
						eol = properties.length() - 1;
						break;
					} else if (eol > start
							&& properties.charAt(eol - 1) == '\\') {
						start = eol + 1;
					} else {
						break;
					}
				}
			}

			String property = properties.substring(i, eol + 1);
			Matcher matcher = PROPERTY_LINE.matcher(property);

			if (matcher.find() && matcher.groupCount() >= 1) {
				int begin = matcher.start(1);
				int end = matcher.end(1);
				String propertyName = property.substring(begin, end);

				if (propertyName.indexOf("#") == -1) {
					result.put(propertyName, property);
				} else if (propertyName.startsWith("#")) {
					result.put(propertyName.substring(1), property);
				}
			}

			i = eol + 1;
		}

		return result;
	}

	/**
	 * Returns a URI for the properties file corresponding to the specified
	 * resource; this will be essentially the same URI except with a properties
	 * file extension.
	 * 
	 * @param resource
	 *            The model resource.
	 * @return A properties file URI.
	 */
	public static URI getPropertiesURI(Resource resource) {
		return resource.getURI().trimFileExtension()
				.appendFileExtension("properties");
	}

}
