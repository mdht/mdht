package org.eclipse.mdht.uml.ui.propertytesters;

import org.eclipse.core.commands.AbstractParameterValueConverter;
import org.eclipse.core.commands.ParameterValueConversionException;

public class BooleanValueConverter extends AbstractParameterValueConverter {

	public BooleanValueConverter() {
	}

	@Override
	public Object convertToObject(String value) throws ParameterValueConversionException {
		return Boolean.parseBoolean(value);
	}

	@Override
	public String convertToString(Object obj) throws ParameterValueConversionException {
		return obj.toString();
	}

}
