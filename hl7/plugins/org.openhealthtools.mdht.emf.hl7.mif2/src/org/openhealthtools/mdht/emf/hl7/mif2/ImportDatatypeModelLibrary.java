/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Datatype Model Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies the DatatypeModelLibrary package being imported, as well as identifying all datatypes that are to be publicly exposed from the imported model.  (Default is 'private' exposure for those datatypes not explicitly mentioned.)
 * UML: Represents a combination of the Import stereotype to another DatatypeModelLibrary (via the packageref), as well as the ElementImport association to each imported datatype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary#getImportedDatatype <em>Imported Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImportDatatypeModelLibrary()
 * @model extendedMetaData="name='ImportDatatypeModelLibrary' kind='elementOnly'"
 * @generated
 */
public interface ImportDatatypeModelLibrary extends ArtifactDependency {
	/**
	 * Returns the value of the '<em><b>Imported Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies those datatypes that should be 'exposed' in the current datatype model.  Exposed datatypes will be usable as attribute datatypes.  All datatypes will be accessible for 'refinement'.  If no filter is specified, then all datatypes are available with the same access as they were in the imported specification
	 * UML: The ElementImport association to each datatype being imported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImportDatatypeModelLibrary_ImportedDatatype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeImport> getImportedDatatype();

} // ImportDatatypeModelLibrary
