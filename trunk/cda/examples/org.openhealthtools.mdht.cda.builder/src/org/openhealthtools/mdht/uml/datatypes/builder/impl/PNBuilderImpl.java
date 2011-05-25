/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.datatypes.builder.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.datatypes.builder.PNBuilder;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

public class PNBuilderImpl implements PNBuilder {

	List<String> givenNames = new ArrayList<String>();

	List<String> familyNames = new ArrayList<String>();

	List<String> suffixes = new ArrayList<String>();

	List<String> prefixes = new ArrayList<String>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#build()
	 */
	public PN build() {

		PN pn = DatatypesFactory.eINSTANCE.createPN();

		for (String givenName : givenNames) {
			pn.getGivens().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.GIV, givenName));
		}

		for (String familyName : familyNames) {
			pn.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, familyName));
		}

		for (String suffix : suffixes) {
			pn.getSuffixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.SFX, suffix));
		}

		for (String prefix : prefixes) {
			pn.getPrefixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.PFX, prefix));
		}

		return pn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withFamilyName(java.lang.String)
	 */
	public PNBuilder withFamilyName(String familyName) {
		familyNames.add(familyName);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withFamilyNames(java.util.List)
	 */
	public PNBuilder withFamilyNames(List<String> familyNames) {
		familyNames.addAll(familyNames);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withGivenName(java.util.List)
	 */
	public PNBuilder withGivenName(List<String> givenNames) {
		givenNames.addAll(givenNames);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withGivenName(java.lang.String)
	 */
	public PNBuilder withGivenName(String givenName) {
		givenNames.add(givenName);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withPrefix(java.lang.String)
	 */
	public PNBuilder withPrefix(String prefix) {
		prefixes.add(prefix);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withPrefixes(java.util.List)
	 */
	public PNBuilder withPrefixes(List<String> prefixes) {
		prefixes.addAll(prefixes);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withSuffix(java.lang.String)
	 */
	public PNBuilder withSuffix(String suffix) {
		suffixes.add(suffix);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilder#withSuffixes(java.util.List)
	 */
	public PNBuilder withSuffixes(List<String> suffixes) {
		suffixes.addAll(suffixes);
		return this;
	}

}
