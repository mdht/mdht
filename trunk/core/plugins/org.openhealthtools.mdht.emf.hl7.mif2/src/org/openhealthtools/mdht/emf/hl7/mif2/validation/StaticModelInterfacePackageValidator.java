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
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StaticModelInterfacePackageValidator {
	boolean validate();

	boolean validateImportedVocabularyModelPackage(PackageRef value);

	boolean validateImportStaticModelInterfacePackage(EList<ArtifactDependency> value);

	boolean validateCommonModelElementDefinition(EList<CommonModelElementDefinition> value);

	boolean validateStubDefinition(EList<StubDefinition> value);
}
