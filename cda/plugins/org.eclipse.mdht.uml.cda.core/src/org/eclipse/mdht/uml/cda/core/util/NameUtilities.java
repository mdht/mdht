/*
 * Copyright (c) 2005, 2015 IBM Corporation, David Carlson.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   David Carlson (Clinical Cloud Solutions, LLC) - do not pluralize names ending with digit
 */
package org.eclipse.mdht.uml.cda.core.util;

/**
 * Pluralize method copied from org.eclipse.uml2.codegen.ecore.Generator.
 * Modified to ignore names ending with digit.
 */
public class NameUtilities {
	public static String pluralize(String name) {

		if (Character.isDigit(name.charAt(name.length() - 1))) {
			return name;
		} else if (name.equalsIgnoreCase("children") || name.endsWith("Children")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("child") || name.endsWith("Child")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name + "ren"; //$NON-NLS-1$
		} else if (name.equalsIgnoreCase("data") || name.endsWith("Data")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name;
		} else if (name.equalsIgnoreCase("datum") || name.endsWith("Datum")) { //$NON-NLS-1$ //$NON-NLS-2$
			return name.substring(0, name.length() - 2) + "a"; //$NON-NLS-1$
		} else if (name.endsWith("By")) { //$NON-NLS-1$
			return name + "s"; //$NON-NLS-1$
		} else if (name.endsWith("y")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 1) + "ies"; //$NON-NLS-1$
		} else if (name.endsWith("ex")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "ices"; //$NON-NLS-1$
		} else if (name.endsWith("x")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("us")) { //$NON-NLS-1$
			return name.substring(0, name.length() - 2) + "i"; //$NON-NLS-1$
		} else if (name.endsWith("ss")) { //$NON-NLS-1$
			return name + "es"; //$NON-NLS-1$
		} else if (name.endsWith("s")) { //$NON-NLS-1$
			return name;
		} else {
			return name + "s"; //$NON-NLS-1$
		}
	}

}
