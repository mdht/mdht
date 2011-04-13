package org.openhealthtools.mdht.uml.datatypes.builder;

import org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilderImpl;

public class DatatypesBuilderFactory {

	public static PNBuilder createPNBuilder() {
		return new PNBuilderImpl();
	}


}
