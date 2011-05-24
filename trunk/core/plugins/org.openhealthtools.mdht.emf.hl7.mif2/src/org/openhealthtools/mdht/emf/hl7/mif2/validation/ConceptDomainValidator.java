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

import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConceptDomainValidator {
	boolean validate();

	boolean validateBusinessName(EList<BusinessName> value);

	boolean validateAnnotations(ConceptDomainAnnotations value);

	boolean validateSpecializesDomain(EList<ConceptDomainRef> value);

	boolean validateExampleConcept(EList<String> value);

	boolean validateProperty(EList<ConceptDomainProperty> value);

	boolean validateSpecializedByDomain(EList<ConceptDomainRef> value);

	boolean validateIsBindable(boolean value);

	boolean validateName(String value);

	boolean validateSortKey(String value);
}
