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
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Glossary#getImportedGlossary <em>Imported Glossary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Glossary#getTermDefinition <em>Term Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGlossary()
 * @model extendedMetaData="name='Glossary' kind='elementOnly'"
 * @generated
 */
public interface Glossary extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Imported Glossary</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a glossary upon which the current glossary is based.  (Definitions in the current glossary override imported definitions of the same term).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Glossary</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGlossary_ImportedGlossary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedGlossary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getImportedGlossary();

	/**
	 * Returns the value of the '<em><b>Term Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the meaning of a particular term.  The same term may be defined in multiple glossaries to provide additional interpretation specific to a particular domain.  Such definitions should always contain a reference to the 'base' term.
	 * UML: EnumerationLiterals contained within the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Definition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGlossary_TermDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='termDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TermDefinition> getTermDefinition();

} // Glossary
