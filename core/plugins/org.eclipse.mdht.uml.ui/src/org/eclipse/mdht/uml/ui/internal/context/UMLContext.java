/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.internal.context;

/**
 * The UML editing contexts implemented by the UML Table Editor.
 */
public enum UMLContext {
	CLASSES;

	public String key() {
		return name().toLowerCase();
	}
}
