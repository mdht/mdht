package org.openhealthtools.mdht.api.schematron;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.openhealthtools.mdht.api.OCLConstraintSection;
import org.openhealthtools.mdht.transformation.ocl2xpath.OCL2XPathTransformationForUML;

public class Activator extends AbstractUIPlugin {

	public Activator() {
		OCLConstraintSection.OCL_TRANSFORMATIONS.put("XPath", new OCL2XPathTransformationForUML(null));
	}

}
