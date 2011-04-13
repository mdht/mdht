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