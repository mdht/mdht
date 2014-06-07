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
package org.openhealthtools.mdht.uml.datatypes.builder;

import java.util.List;

import org.openhealthtools.mdht.uml.hl7.datatypes.PN;

public interface PNBuilder {

	public abstract PN build();

	public abstract PNBuilder withFamilyName(String familyName);

	public abstract PNBuilder withFamilyNames(List<String> familyNames);

	public abstract PNBuilder withGivenName(List<String> givenNames);

	public abstract PNBuilder withGivenName(String givenName);

	public abstract PNBuilder withPrefix(String prefix);

	public abstract PNBuilder withPrefixes(List<String> prefixes);

	public abstract PNBuilder withSuffix(String suffix);

	public abstract PNBuilder withSuffixes(List<String> suffixes);

}
