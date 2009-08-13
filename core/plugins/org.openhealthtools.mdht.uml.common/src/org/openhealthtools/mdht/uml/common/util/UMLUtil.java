/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.internal.Logger;

/**
*
* @version $Id: $
*/
public class UMLUtil {

	/**
	 * Accumulate a list containing the unqualified names of all
	 * generalizations for the given classifier, including this classfier name.
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
	 * Search all nested packages for the given classifier name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local name.
	 * 
	 * @param basePackage	base package for the library
	 * @param localName
	 * @return a Classifier, or null if not found
	 */
	public static Classifier getClassifierByName(Package basePackage, final String localName) {
		return getClassifierByName(basePackage, localName, null);
	}

	/**
	 * Search all nested packages for the given class name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local name.
	 * 
	 * @param basePackage	base package for the library
	 * @param localName
	 * @return a Class, or null if not found
	 */
	public static Class getClassByName(Package basePackage, final String localName) {
		return (Class) getClassifierByName(basePackage, localName, UMLPackage.Literals.CLASS);
	}

	/**
	 * Search all nested packages for the given data type name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local name.
	 * 
	 * @param basePackage	base package for the library
	 * @param localName
	 * @return a DataType, or null if not found
	 */
	public static DataType getDataTypeByName(Package basePackage, final String localName) {
		return (DataType) getClassifierByName(basePackage, localName, UMLPackage.Literals.DATA_TYPE);
	}

	/**
	 * Search all nested packages for the given enumeration name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local name.
	 * 
	 * @param basePackage	base package for the library
	 * @param localName
	 * @return an Enumeration, or null if not found
	 */
	public static Enumeration getEnumerationByName(Package basePackage, final String localName) {
		return (Enumeration) getClassifierByName(basePackage, localName, UMLPackage.Literals.ENUMERATION);
	}
	
	/**
	 * Search all nested packages for the given classifier name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local classifer name.
	 * 
	 * @param basePackage	base package for the library
	 * @param localName
	 * @param eClass	UML metaclass to search for
	 * @return a Classifier, or null if not found
	 */
	public static Classifier getClassifierByName(Package basePackage, final String localName, final EClass eClass) {
		if (basePackage == null || localName == null)
			return null;
		
		Classifier classifier = null;
		
		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
			public Object caseClassifier(Classifier classifier) {
				if (localName.equals(classifier.getName())) {
					if (eClass == null)
						return classifier;
					else
						return eClass == classifier.eClass() ? classifier : null;
				}
				else
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
	 * @param pkg
	 * @return a Package
	 */
	public static Package getTopPackage(Package pkg) {
		EList<Package> allOwningPackages = pkg.allOwningPackages();
		int size = allOwningPackages.size();

		return size > 0 ? allOwningPackages.get(size - 1) : pkg;
	}

	/**
	 * Returns the outermost top package containing the given named element.
	 * @param element
	 * @return a Package
	 */
	public static Package getTopPackage(NamedElement element) {
		return getTopPackage(element.getNearestPackage());
	}

	/**
	 * Get nearest UML namespace containing this model element.
	 */
	public static Namespace getNearestNamespace(Element element) {
		EObject eObject = element;
		while (!(eObject instanceof Namespace))
			eObject = eObject.eContainer();
		
		return eObject instanceof Namespace ? (Namespace)eObject : null;
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
		if (namedElement.getName() == null)
			return null;
		
		StringBuffer qname = new StringBuffer(namedElement.getName());
		Element container = namedElement.getOwner();
		while (container instanceof NamedElement) {
			qname.insert(0, NamedElement.SEPARATOR);
			qname.insert(0, ((NamedElement)container).getName());
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
					}
					catch (IllegalArgumentException e) {
						// ignore
					}
				}
			}
		}

		/* TODO clone stereotypes for all matching owned elements.
		 * However getOwnedElements() is a union and may have problems with
		 * list order and getting matching owned elements in second element.
		 */
//		for (Element ownedElement : first.getOwnedElements()) {
//			
//		}
	}

	public static void cloneStereotypes(Class first, Class second) {
		cloneStereotypes((Element)first, (Element)second);
		
		for (Property p1 : first.getOwnedAttributes()) {
			Property p2 = second.getOwnedAttribute(p1.getName(), p1.getType());
			if (p2 != null)
				cloneStereotypes(p1, p2);
		}
	}

	public static void addAliasName(Element element, String alias) {
		if (alias != null && alias.length() > 0) {
			EAnnotation annotation = element.createEAnnotation("uml2.alias");
			annotation.getDetails().put(alias, null);
		}
	}

	public static String setEObjectID(Element element) {
		String xmiId = org.eclipse.uml2.uml.util.UMLUtil.getXMIIdentifier((InternalEObject)element);
		
		return setEObjectID(element, xmiId);
	}

	public static String setEObjectID(Generalization generalization) {
		XMLResource resource = ((XMLResource)generalization.eResource());
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
		return setEObjectID((Element)association);
		
//		XMLResource resource = ((XMLResource)association.eResource());
//		StringBuffer xmiId = new StringBuffer();
//		for (Property end : association.getMemberEnds()) {
//			if (xmiId.length() > 0)
//				xmiId.append("_");
//			
//			if (end.isNavigable())
//				xmiId.append(resource.getID(end));
//			else
//				xmiId.append("anonymous");
//		}
//		xmiId.append("_association");
//		
//		return setEObjectID(association, xmiId.toString());
	}

	public static String setEObjectID(Element element, String xmiId) {
		XMLResource resource = ((XMLResource)element.eResource());
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
	 * @param basePackage	a package for the model into which library is imported
	 * @return 	root package of the imported library
	 */
	public static Package importLibrary(Package basePackage, String libraryURI) {
		Package library = null;
		try {
			ResourceSet resourceSet = basePackage.eResource().getResourceSet();
			Resource libraryResource = resourceSet.getResource(URI
					.createURI(libraryURI), true);
			
			if (libraryResource != null) {
				library = (Package) EcoreUtil.getObjectByType(
						libraryResource.getContents(), 
						UMLPackage.eINSTANCE.getPackage());

				// This must be called from within an EMFT Transaction.
				if (library != null) {
					PackageImport packageImport = null;
					Package topPackage = getTopPackage(basePackage);					
						for (PackageImport pkgImport : topPackage.getPackageImports())
						{
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
		return classifier != null && classifier.getTemplateBindings().size() > 0;
	}
	
	/**
	 * If classifier is a template binding and template is a Classifier,
	 * return the template, else return null.
	 * 
	 * @param classifier
	 * @return template classifier, or null if not a template binding
	 */
	public static Classifier getTemplate(Classifier classifier) {
		Classifier template = null;
		for (TemplateBinding binding : classifier.getTemplateBindings()) {
			if (binding.getSignature().getTemplate() instanceof Classifier) {
				template = (Classifier)binding.getSignature().getTemplate();
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
	 * Implementation/Exception Handling Note - The reflection API currently does not have an
	 * "hasMethod" so the approach is to call getMethod on the target class
	 * starting with UML 2.2 method. If the method is not found or some
	 * exception has been encountered attempt to get the 2.3 method. If both
	 * attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all exceptions.
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
	public static Classifier getConstrainingClassifier(ClassifierTemplateParameter classifierTemplateParameter) {

		Classifier classifier = null;

		boolean reflectionCompleted = false;

		try {

			// Attempt UML 2.2 API 
			Method getConstrainingClassifier = ClassifierTemplateParameter.class.getMethod("getConstrainingClassifier", (java.lang.Class<?>[]) null);

			classifier = (Classifier) getConstrainingClassifier.invoke(classifierTemplateParameter, (Object[]) null);

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
				Method getConstrainingClassifiers = ClassifierTemplateParameter.class.getMethod("getConstrainingClassifiers", (java.lang.Class<?>[]) null);

				EList<Classifier> classifiers = (EList<Classifier>) getConstrainingClassifiers.invoke(classifierTemplateParameter, (Object[]) null);

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

		// If neither 2.2/2.3 or some other execution error a general purpose UML 2 Reflection Error 
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
	 * Implementation/Exception Handling Note - The reflection API currently does not have an
	 * "hasMethod" so the approach is to call getMethod on the target class
	 * starting with UML 2.2 method. If the method is not found or some
	 * exception has been encountered attempt to get the 2.3 method. If both
	 * attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0_Migration_Guide/guide.html
	 * @param classifierTemplateParameter
	 * @param constraint
	 */
	public static void setConstrainingClassifier(ClassifierTemplateParameter classifierTemplateParameter, Classifier constraint) {

		boolean reflectionCompleted = false;

		try {
			
			// Attempt UML 2.2 API 
			
			Method setConstrainingClassifier = ClassifierTemplateParameter.class.getMethod("setConstrainingClassifier", new java.lang.Class<?>[] { Classifier.class });

			setConstrainingClassifier.invoke(classifierTemplateParameter, new Object[] { constraint });

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
				
				Method getConstrainingClassifiers = ClassifierTemplateParameter.class.getMethod("getConstrainingClassifiers", (java.lang.Class<?>[]) null);

				EList<Classifier> classifiers = (EList<Classifier>) getConstrainingClassifiers.invoke(classifierTemplateParameter, (Object[]) null);

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
		
		// If neither 2.2/2.3 or some other execution error a general purpose UML 2 Reflection Error 
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
	 * The difference in this case is that TemplateParameterSubstitution Actual Parameters a list (0..*) in 2.2
	 * and scalar (0..1) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently does not have an
	 * "hasMethod" so the approach is to call getMethod on the target class
	 * starting with UML 2.2 method. If the method is not found or some
	 * exception has been encountered attempt to get the 2.3 method. If both
	 * attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0_Migration_Guide/guide.html
	 * @param substitution
	 * @param parameterableElement
	 */
	public static void setParameterableElement(TemplateParameterSubstitution substitution, ParameterableElement parameterableElement) {
		boolean reflectionCompleted = false;

		try {
			// Attempt UML 2.2 API 
			Method getAcuals = TemplateParameterSubstitution.class.getMethod("getActuals", (java.lang.Class<?>[]) null);

			EList<ParameterableElement> actuals = (EList<ParameterableElement>) getAcuals.invoke(substitution, (Object[]) null);

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
				Method setAcual = TemplateParameterSubstitution.class.getMethod("setActual", new java.lang.Class<?>[] { ParameterableElement.class });

				setAcual.invoke(substitution, new Object[] { parameterableElement });
				
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

		// If neither 2.2/2.3 or some other execution error a general purpose UML 2 Reflection Error 
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
	 * The difference in this case is that TemplateParameterSubstitution Actual Parameters a list (0..*) in 2.2
	 * and scalar (0..1) in 2.3
	 * 
	 * Implementation/Exception Handling Note - The reflection API currently does not have an
	 * "hasMethod" so the approach is to call getMethod on the target class
	 * starting with UML 2.2 method. If the method is not found or some
	 * exception has been encountered attempt to get the 2.3 method. If both
	 * attempts fail, throw a RuntimeException. The reasoning behind this
	 * approach is not to introduce a series of exception handling for
	 * reflection errors into the base code because the project will eventually
	 * migrate completely to 2.3 so the current logic captures and ignores all exceptions.
	 * 
	 * http://www.eclipse.org/modeling/mdt/uml2/docs/guides/UML2_3.0_Migration_Guide/guide.html
	 * @param substitution
	 * @return
	 */
	public static ParameterableElement getParameterableElement(TemplateParameterSubstitution substitution) {

		ParameterableElement parameterableElement = null;

		boolean reflectionCompleted = false;

		try {
			// Attempt UML 2.2 API 
			Method getAcuals = TemplateParameterSubstitution.class.getMethod("getActuals", null);

			EList<ParameterableElement> actuals = (EList<ParameterableElement>) getAcuals.invoke(substitution, null);

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
				Method getAcual = TemplateParameterSubstitution.class.getMethod("getActual", null);

				parameterableElement = (ParameterableElement) getAcual.invoke(substitution, null);
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

		// If neither 2.2/2.3 or some other execution error a general purpose UML 2 Reflection Error 
		if (!reflectionCompleted) {
			throw new RuntimeException(UML2REFLECTIONERROR);

		}

		return parameterableElement;
	}
	
	

	/**
	 * If classifier is a template binding and template is a Classifier,
	 * return a list of template parameter substitutions.  Only include
	 * ParameterableElement if it is a Classifier.
	 * 
	 * @param classifier
	 * @return list of template binding parameter substitutions
	 */
	public static List<Classifier> getTemplateBindingParameters(Classifier classifier) {
		List<Classifier> params = new ArrayList<Classifier>();
		for (TemplateBinding binding : classifier.getTemplateBindings()) {
			if (binding.getSignature().getTemplate() instanceof Classifier) {
				for (TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {					
					ParameterableElement element = getParameterableElement(substitution);
					if (element instanceof Classifier) {
						params.add((Classifier) element);
					}
				}
			}
			
			//only process one binding, why would there ever be more?
			break;
		}
		return params;
	}

}
