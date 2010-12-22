package org.openhealthtools.mdht.uml.term.ui.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class TermAnnotationProvider implements INotationProvider, IExecutableExtension {
	
	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof NamedElement) {
			printString = ((NamedElement)element).getName();
		}
		
		return printString;
	}

	public String getAnnotation(Element element) {
		String annotation = null;
		
		if (element instanceof Enumeration) {
			annotation = getMetadata((Enumeration)element);
		}
		else if (element instanceof EnumerationLiteral) {
			annotation = getMetadata((EnumerationLiteral)element);
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

	private static String getMetadata(Enumeration enumeration) {
		StringBuffer value = new StringBuffer();
		CodeSystemVersion codeSystemVersion = TermProfileUtil.getCodeSystemVersion(enumeration);
		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(enumeration);

		String identifier = null;
		if (codeSystemVersion != null) {
			identifier = codeSystemVersion.getIdentifier();
		}
		else if (valueSetVersion != null) {
			identifier = valueSetVersion.getIdentifier();
		}
		
		if (identifier != null) {
			value.append(identifier);
		}
		
		return value.toString();
	}

	private static String getMetadata(EnumerationLiteral literal) {
		StringBuffer value = new StringBuffer();
		ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(literal);

		if (valueSetCode != null && valueSetCode.getConceptName() != null) {
			value.append(valueSetCode.getConceptName());
		}
		
		return value.toString();
	}

}
