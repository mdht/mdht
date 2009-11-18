package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;

public class CDAAnnotationProvider implements INotationProvider, IExecutableExtension {

	public final static int CDA_CLASS_ANNOTATION = IHL7Appearance.DISP_TEMPLATE_ID;
	public final static int CDA_PROPERTY_ANNOTATION = IHL7Appearance.DISP_VOCABULARY | IHL7Appearance.DISP_UPDATE_MODE;

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Class) {
			printString = CDAClassNotation.getCustomLabel((Class)element, IHL7Appearance.DEFAULT_HL7_CLASS);
		}
		else if (element instanceof Property) {
			printString = CDAPropertyNotation.getCustomLabel((Property)element, IHL7Appearance.DEFAULT_HL7_PROPERTY);
		}
		
		return printString;
	}

	public String getAnnotation(Element element) {
		String annotation = null;
		
		if (element instanceof Class) {
			annotation = CDAClassNotation.getCustomLabel((Class)element, CDA_CLASS_ANNOTATION);
		}
		else if (element instanceof Property) {
			annotation = CDAPropertyNotation.getCustomLabel((Property)element, CDA_PROPERTY_ANNOTATION);
		}
		
		return annotation;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

}
