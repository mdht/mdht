/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.hdf.internal.Logger;

public class XSDDatatypeUtil {

	/**
	 * @param classifier
	 * @return true if classifier is contained in HL7 XSD data types resource.
	 */
	public static boolean isHL7_XSDDatatype(Classifier classifier) {
		if (classifier == null) {
			return false;
		}

		URI uri = classifier.eResource().getURI();
		return HL7Resource.HL7_DATATYPES_LIBRARY_URI.equals(uri.toString());
	}

	public static Package importHL7DatatypesLibrary(Package pkg) {
		Package hl7Library = null;
		try {
			ResourceSet resourceSet = pkg.eResource().getResourceSet();
			Resource hl7LibraryResource = resourceSet.getResource(
				URI.createURI(HL7Resource.HL7_DATATYPES_LIBRARY_URI), true);

			if (hl7LibraryResource != null) {
				hl7Library = (Package) EcoreUtil.getObjectByType(
					hl7LibraryResource.getContents(), UMLPackage.eINSTANCE.getPackage());

				// This must be called from within an EMFT Transaction.
				if (hl7Library != null) {
					PackageImport datatypesImport = null;
					for (Iterator imports = pkg.getPackageImports().iterator(); imports.hasNext();) {
						PackageImport pkgImport = (PackageImport) imports.next();
						if (hl7Library.equals(pkgImport.getImportedPackage())) {
							datatypesImport = pkgImport;
							break;
						}
					}
					if (datatypesImport == null) {
						datatypesImport = pkg.createPackageImport(hl7Library);
					}
				}
			}

		} catch (WrappedException we) {
			Logger.logException(we);
		}

		return hl7Library;
	}

	public static Package loadHL7VocabularyLibrary(Package pkg) {
		ResourceSet resourceSet = pkg.eResource().getResourceSet();
		Resource hl7LibraryResource = resourceSet.getResource(URI.createURI(HL7Resource.HL7_VOC_LIBRARY_URI), true);

		Package hl7Library = null;
		if (hl7LibraryResource != null) {
			hl7Library = (Package) EcoreUtil.getObjectByType(
				hl7LibraryResource.getContents(), UMLPackage.eINSTANCE.getPackage());
		}
		return hl7Library;
	}

	/**
	 * Search all nested packages in HL7 datatypes model for the given
	 * datatype name.
	 * 
	 * @param basePackage
	 *            model package where HL7 datatypes is imported
	 * @param localName
	 * @return datatype Classifier, or null if not found
	 */
	public static Classifier getDatatypeByName(Package basePackage, final String localName) {
		if (localName == null) {
			return null;
		}

		Classifier datatype = null;

		// import the HL7 datatype library
		Package hl7Library = importHL7DatatypesLibrary(basePackage);
		if (hl7Library != null) {
			UMLSwitch umlSwitch = new UMLSwitch() {
				@Override
				public Object caseClassifier(Classifier classifier) {
					if (localName.equals(classifier.getName())) {
						return classifier;
					} else {
						return null;
					}
				}

				@Override
				public Object casePackage(Package pkg) {
					Object result = null;
					for (Iterator iter = pkg.getOwnedMembers().iterator(); iter.hasNext();) {
						result = doSwitch((EObject) iter.next());
						if (result != null) {
							break;
						}
					}
					return result;
				}
			};

			datatype = (Classifier) umlSwitch.doSwitch(hl7Library);
		}

		return datatype;
	}

	/**
	 * Search all nested packages in HL7 XSD vocabulary model for the given
	 * enumeration name.
	 * 
	 * @param basePackage
	 *            model package where HL7 vocabulary will be referenced
	 * @param localName
	 * @return vocabulary Enumeration, or null if not found
	 */
	public static Enumeration getVocabularyByName(Package basePackage, final String localName) {
		if (localName == null) {
			return null;
		}

		Enumeration enumeration = null;

		// load the HL7 XSD vocabulary library
		Package hl7Library = loadHL7VocabularyLibrary(basePackage);
		if (hl7Library != null) {
			UMLSwitch umlSwitch = new UMLSwitch() {
				@Override
				public Object caseEnumeration(Enumeration enumeration) {
					if (localName.equals(enumeration.getName())) {
						return enumeration;
					} else {
						return null;
					}
				}

				@Override
				public Object casePackage(Package pkg) {
					Object result = null;
					for (Iterator iter = pkg.getOwnedMembers().iterator(); iter.hasNext();) {
						result = doSwitch((EObject) iter.next());
						if (result != null) {
							break;
						}
					}
					return result;
				}
			};

			enumeration = (Enumeration) umlSwitch.doSwitch(hl7Library);
		}

		return enumeration;
	}

}
