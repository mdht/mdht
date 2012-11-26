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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementChange;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.GroupChange;
import org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ElementChange}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementChangeValidator {
	boolean validate();

	boolean validateChangeItems(FeatureMap value);

	boolean validateAddAttribute(EList<AttributeContent> value);

	boolean validateAddElement(EList<AddElementContent> value);

	boolean validateRemoveAttribute(EList<AttributeRef> value);

	boolean validateReplaceAttribute(EList<AttributeContent> value);

	boolean validateRemoveElement(EList<ElementRef> value);

	boolean validateReplaceElement(EList<ReplaceElementContent> value);

	boolean validateChangeElement(EList<ElementChange> value);

	boolean validateChangeGroup(EList<GroupChange> value);
}
