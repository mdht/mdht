package org.eclipse.mdht.uml.ui.propertytesters;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;

public class BooleanValues implements IParameterValues {
	private static HashMap<String, Boolean> values = new HashMap<String, Boolean>();

	static {
		values.put("true", new Boolean(true));
		values.put("false", new Boolean(false));
	}

	public Map getParameterValues() {

		return values;
	}

}
