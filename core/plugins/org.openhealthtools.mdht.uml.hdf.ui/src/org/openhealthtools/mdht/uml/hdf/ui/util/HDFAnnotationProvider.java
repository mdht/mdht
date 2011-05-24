package org.openhealthtools.mdht.uml.hdf.ui.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;

public class HDFAnnotationProvider implements INotationProvider, IExecutableExtension {

	public final static int HL7_PROPERTY_ANNOTATION = IHL7Appearance.DISP_VOCABULARY | IHL7Appearance.DISP_UPDATE_MODE;

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Property) {
			printString = HDFPropertyNotation.getCustomLabel((Property) element, IHL7Appearance.DEFAULT_HL7_PROPERTY);
		}

		return printString;
	}

	public String getAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Property) {
			annotation = HDFPropertyNotation.getCustomLabel((Property) element, HL7_PROPERTY_ANNOTATION);
		}

		return annotation;
	}

	public Object getElementImage(Element element) {
		return null;
	}

	public Object getAnnotationImage(Element element) {
		return null;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

}
