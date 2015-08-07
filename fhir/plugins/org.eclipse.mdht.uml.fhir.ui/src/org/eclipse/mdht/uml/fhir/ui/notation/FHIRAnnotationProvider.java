/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.notation;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.common.notation.IExtendedNotationProvider;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class FHIRAnnotationProvider implements IExtendedNotationProvider, IExecutableExtension {

	public final static int PROPERTY_ANNOTATION = INotationConstants.DISP_VOCABULARY |
			INotationConstants.DISP_MOFIFIERS | INotationConstants.DISP_TYPE_CHOICE;
	
	public String getAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Class) {
			annotation = getMetadata((Class) element);
		} else if (element instanceof Enumeration) {
			annotation = getMetadata((Enumeration) element);
		} else if (element instanceof EnumerationLiteral) {
			annotation = getMetadata((EnumerationLiteral) element);
		} else if (element instanceof Property) {
			annotation = FHIRPropertyNotation.getCustomLabel((Property) element, PROPERTY_ANNOTATION);
		} else if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null) {
				annotation = FHIRPropertyNotation.getCustomLabel(navigableEnd, PROPERTY_ANNOTATION);
			}
		}

		return annotation;
	}

	public String getShortAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Property) {
			annotation = FHIRPropertyNotation.getCustomLabel((Property) element, INotationConstants.DISP_MOFIFIERS);
		}
		else {
			annotation = getAnnotation(element);
		}
		
		return annotation;
	}

	public Object getAnnotationImage(Element element) {
		return getStereotypeImage(element);
	}

	public Object getElementImage(Element element) {
		if (element instanceof Class) {
			return getModelImage((Class) element);

		} else if (element instanceof Property) {

			// TODO ELEMENT move to aml.cimi.ui notation provider
			// TODO this is incomplete logic, also selects attributes within a DataType
			// Property property = (Property) element;
			// if (AMLUtil.containingArchetype(property) != null && property.getType() != null &&
			// AMLUtil.dataModelType(property.getType()) != null) {
			// return Activator.getDefault().getBundledImage("icons/full/obj16/Element.png");
			// }
		}

		return null;
	}

	public List<Classifier> getTypeChoice(Property property) {
		List<Classifier> types = new ArrayList<Classifier>();
		
		TypeChoice typeChoice = (TypeChoice) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null) {
			types.addAll(typeChoice.getTypes());
		}
		
		return types;
	}

	protected Object getStereotypeImage(Element element) {
		Object image = null;

		if (element instanceof Class) {
			Class umlClass = (Class) element;

//			if (MDRProfileUtil.getConcept(umlClass) != null) {
//				image = Activator.getDefault().getBundledImage("icons/full/obj16/Concept.gif");
//			}

		} else if (element instanceof Property) {
			Property property = (Property) element;

			if (property.getType() != null) {
				Type type = property.getType();
				image = getStereotypeImage(type);
			}

		} else if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null && navigableEnd.getType() != null) {
				Type type = navigableEnd.getType();
				image = getStereotypeImage(type);
			}
		}

		return image;
	}

	protected Object getModelImage(NamedElement element) {
		Object image = getIcon(element);

		if (image == null && element instanceof Classifier) {
			for (Classifier general : ((Classifier) element).getGenerals()) {
				// fix bug with infinite cyclic loop
				if (general != element) {
//					image = getModelImage(general);
					if (image != null) {
						break;
					}
				}
			}
		}

		return image;
	}

	protected Object getIcon(NamedElement element) {
		Object image = null;
		String location = "icons/" + element.getName() + ".gif";

		Resource eResource = element.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				URIConverter uriConverter = resourceSet.getURIConverter();
				URI normalizedURI = uriConverter.normalize(eResource.getURI());

				URI uri = URI.createURI(location).resolve(normalizedURI);

				try {
					URL url = new URL(uriConverter.normalize(uri).toString());
					url.openStream().close();
					image = url;
				} catch (Exception e1) {
					try {
						// try .png extension
						uri = uri.trimFileExtension().appendFileExtension("png");
						URL url = new URL(uriConverter.normalize(uri).toString());
						url.openStream().close();
						image = url;
					} catch (Exception e2) {
						// ignore
					}
				}
			}
		}

		return image;
	}

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Property) {
			printString = FHIRPropertyNotation.getCustomLabel(
				(Property) element, INotationConstants.DEFAULT_UML_PROPERTY | INotationConstants.DISP_VOCABULARY);
		}

		return printString;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

	protected static String getMetadata(Class umlClass) {
		StringBuffer value = new StringBuffer();
		

		return value.toString();
	}

	protected static String getMetadata(Enumeration umlEnum) {
		StringBuffer value = new StringBuffer();

		return value.toString();
	}

	protected static String getMetadata(EnumerationLiteral literal) {
		StringBuffer value = new StringBuffer();


		return value.toString();
	}

}
