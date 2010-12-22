package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;

public class CDAAnnotationProvider implements INotationProvider, IExecutableExtension {

	public final static int CDA_CLASS_ANNOTATION = IHL7Appearance.DISP_TEMPLATE_ID;
	public final static int CDA_ASSOCIATION_ANNOTATION = IHL7Appearance.DISP_VOCABULARY;
	public final static int CDA_PROPERTY_ANNOTATION = IHL7Appearance.DISP_VOCABULARY | IHL7Appearance.DISP_TEMPLATE_CONSTRAINTS;

	public static final String SEVERITY_ERROR = "ERROR";
	public static final String SEVERITY_WARNING = "WARNING";
	public static final String SEVERITY_INFO = "INFO";

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Class) {
			printString = CDAClassNotation.getCustomLabel((Class)element, IHL7Appearance.DEFAULT_HL7_CLASS);
		}
		else if (element instanceof Association) {
			printString = CDAAssociationNotation.getCustomLabel((Association)element, IHL7Appearance.DISP_NAME);
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
		else if (element instanceof Association) {
			annotation = CDAAssociationNotation.getCustomLabel((Association)element, CDA_ASSOCIATION_ANNOTATION);
		}
		else if (element instanceof Property) {
			annotation = CDAPropertyNotation.getCustomLabel((Property)element, CDA_PROPERTY_ANNOTATION);
		}
		
		return annotation;
	}

	public Object getElementImage(Element element) {
		return null;
	}

	public Object getAnnotationImage(Element element) {
		Stereotype validationSupport = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (validationSupport != null) {
			Object literal = element.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = null;
			if (literal instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral)literal).getName();
			}
			else if (literal instanceof Enumerator) {
				severity = ((Enumerator)literal).getName();
			}
			
			if (severity != null) {
				if (SEVERITY_INFO.equals(severity)) {
					return Activator.getDefault().getBundledImage("/icons/full/obj16/information.gif");
				} else if (SEVERITY_WARNING.equals(severity)) {
					return Activator.getDefault().getBundledImage("/icons/full/obj16/warning.gif");
				} else if (SEVERITY_ERROR.equals(severity)) {
					return Activator.getDefault().getBundledImage("/icons/full/obj16/error.gif");
				}
			}
		}
		
		return null;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

}
