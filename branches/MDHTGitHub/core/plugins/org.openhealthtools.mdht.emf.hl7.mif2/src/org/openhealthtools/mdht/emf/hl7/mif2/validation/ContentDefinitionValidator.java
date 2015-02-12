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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.NonComputableContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetRef;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContentDefinitionValidator {
	boolean validate();

	boolean validateAnnotations(ContentDefinitionAnnotations value);

	boolean validateCombinedContent(CombinedContentDefinition value);

	boolean validateCodeBasedContent(EList<CodeBasedContentDefinition> value);

	boolean validatePropertyBasedContent(PropertyBasedContentDefinition value);

	boolean validateCodeFilterContent(CodeFilterContentDefinition value);

	boolean validateNonComputableContent(NonComputableContentDefinition value);

	boolean validateValueSetRef(VocabularyValueSetRef value);

	boolean validateAllowedQualifiers(EList<RelationshipBasedContentDefinition> value);

	boolean validateProhibitedQualifiers(EList<RelationshipBasedContentDefinition> value);

	boolean validateAreBaseQualifiersUnlimited(boolean value);

	boolean validateCodeSystem(String value);

	boolean validateVersionDate(XMLGregorianCalendar value);
}
