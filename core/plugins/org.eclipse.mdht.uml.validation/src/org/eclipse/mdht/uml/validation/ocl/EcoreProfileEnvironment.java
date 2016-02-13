/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.validation.ocl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.uml.UMLEnvironment;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.UMLReflection;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.osgi.framework.Bundle;

/**
 * An OCL environment suitable for parsing OCL constraints on UML models that have the Ecore profile applied, supporting such extended semantics as
 * <ul>
 * <li>wrapping Java classes in <tt>{@literal <<eDataType>>} PrimitiveType</tt>s</li>
 * <li>suppression of associations and property redefinition, which Ecore doesn't support</li>
 * </ul>
 * and possibly more.
 */
public class EcoreProfileEnvironment extends UMLEnvironment {
	private static final String QUERY = "QUERY";

	private static final String EDATATYPE = UMLUtil.PROFILE__ECORE + NamedElement.SEPARATOR +
			UMLUtil.STEREOTYPE__E_DATA_TYPE;

	private EcoreProfileReflection reflection;

	public EcoreProfileEnvironment(
			Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> parent) {
		super(parent);
	}

	public EcoreProfileEnvironment(EcoreProfileEnvironmentFactory factory, EPackage.Registry registry,
			ResourceSet rset) {
		super(registry, rset);

		setFactory(factory);
	}

	public EcoreProfileEnvironment(EcoreProfileEnvironmentFactory factory, EPackage.Registry registry, ResourceSet rset,
			Resource resource) {
		super(registry, rset, resource);

		setFactory(factory);
	}

	/**
	 * Tests whether a given {@code constraint} is an MDHT query-style constraint (rejecting violating objects).
	 *
	 * @param constraint
	 *            a constraint
	 *
	 * @return {@code true} if it is a reject-query constraint; {@code false} if it's just an ordinary boolean condition
	 */
	public static boolean isQueryConstraint(Constraint constraint) {
		boolean result = false;

		for (Comment next : constraint.getOwnedComments()) {
			if ((next.getBody() != null) && QUERY.equalsIgnoreCase(next.getBody().trim())) {
				result = true;
				break;
			}
		}

		return result;
	}

	@Override
	public UMLReflection<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint> getUMLReflection() {
		if (reflection == null) {
			reflection = new EcoreProfileReflection(this);
		}

		return reflection;
	}

	@Override
	public Classifier lookupAssociationClassReference(Classifier owner, String name) {
		return null; // Ecore doesn't support association classes
	}

	@Override
	public Classifier lookupClassifier(List<String> names) {
		Classifier result = super.lookupClassifier(names);

		if (result instanceof Association) {
			result = null; // Ecore doesn't support associations as classifiers
		}

		return result;
	}

	@Override
	public Property lookupProperty(Classifier owner, String name) {
		Property result = super.lookupProperty(owner, name);

		if ((result == null) && ((owner == null) || (owner == getContextClassifier()))) {
			owner = getContextClassifier(); // in case of null, which happens for implicit navigation source

			// the UML-to-Ecore transformation transfers constraints from nested classes to the outermost nesting class.
			// Maybe we're trying to access a feature of that class from the context of a nesting class?
			Classifier ecoreContext = getNestingRoot(owner);
			if (owner != ecoreContext) {
				result = lookupProperty(ecoreContext, name);
			}
		}

		return result;
	}

	@Override
	public Operation lookupOperation(Classifier owner, String name, List<? extends TypedElement<Classifier>> args) {
		Operation result = super.lookupOperation(owner, name, args);

		if ((result == null) && ((owner == null) || (owner == getContextClassifier()))) {
			owner = getContextClassifier(); // in case of null, which happens for implicit operation call source

			// the UML-to-Ecore transformation transfers constraints from nested classes to the outermost nesting class.
			// Maybe we're trying to access a feature of that class from the context of a nesting class?
			Classifier ecoreContext = getNestingRoot(owner);
			if (owner != ecoreContext) {
				result = lookupOperation(ecoreContext, name, args);
			}
		}

		if (result == null) {
			java.lang.Class<?> javaClass = getJavaClass(owner);

			if (javaClass != null) {
				Classifier oclClass = getOCLClass(javaClass);

				if (oclClass != null) {
					// delegate to the corresponding OCL standard library type
					result = super.lookupOperation(oclClass, name, args);
				}
			}
		}

		return result;
	}

	private java.lang.Class<?> getJavaClass(Classifier classifier) {
		java.lang.Class<?> result = null;

		String javaClassName = (String) UMLUtil.getTaggedValue(
			classifier, EDATATYPE, UMLUtil.TAG_DEFINITION__INSTANCE_CLASS_NAME);
		javaClassName = (javaClassName == null)
				? javaClassName
				: javaClassName.trim();

		if ((javaClassName != null) && (javaClassName.length() > 0)) {
			result = getJavaClass(classifier.eResource(), javaClassName);
		}

		return result;
	}

	private java.lang.Class<?> getJavaClass(Resource context, String name) {
		java.lang.Class<?> result = null;

		try {
			result = java.lang.Class.forName(name);
		} catch (Exception e) {
			// if the resource is in some plug-in, then use its class loader to try again
			try {
				URIConverter conv = (context.getResourceSet() == null)
						? URIConverter.INSTANCE
						: context.getResourceSet().getURIConverter();
				URI normalizedURI = conv.normalize(context.getURI());
				if (normalizedURI.isPlatformPlugin()) {
					String pluginID = normalizedURI.segment(1); // segment 0 is "plugin"
					Bundle bundle = Platform.getBundle(pluginID);
					if (bundle != null) {
						result = bundle.loadClass(name);
					}
				}
			} catch (Exception e2) {
				// fine, no such class. That's normal
			}
		}

		return result;
	}

	private Classifier getOCLClass(java.lang.Class<?> javaClass) {
		Classifier result = null;

		final OCLStandardLibrary<Classifier> stdlib = getOCLStandardLibrary();

		if (javaClass == String.class) {
			result = stdlib.getString();
		} else if (javaClass == Object.class) {
			result = stdlib.getOclAny();
		} else if (javaClass == Boolean.class || javaClass == boolean.class) {
			result = stdlib.getBoolean();
		} else if (javaClass == Integer.class || javaClass == int.class || javaClass == Short.class ||
				javaClass == short.class || javaClass == Long.class || javaClass == long.class ||
				javaClass == Byte.class || javaClass == byte.class || javaClass == BigInteger.class) {
			result = stdlib.getInteger();
		} else if (javaClass == Double.class || javaClass == double.class || javaClass == Float.class ||
				javaClass == float.class || javaClass == BigDecimal.class) {
			result = stdlib.getReal();
		} else if (javaClass == Void.class || javaClass == void.class) {
			result = stdlib.getOclVoid();
		}

		return result;
	}

	private Classifier getNestingRoot(Classifier classifier) {
		Classifier result;

		for (result = classifier; result.getOwner() instanceof Classifier;) {
			result = (Classifier) result.getOwner();
		}

		return result;
	}
}
