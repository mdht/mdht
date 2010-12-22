package org.openhealthtools.mdht.uml.cda.dita;

import org.eclipse.uml2.uml.Package;

public class TransformPackage extends TransformAbstract {

	public TransformPackage(DitaTransformerOptions options) {
		super(options);
	}
	
	@Override
	public Object casePackage(Package umlPackage) {


		return umlPackage;
	}

}
