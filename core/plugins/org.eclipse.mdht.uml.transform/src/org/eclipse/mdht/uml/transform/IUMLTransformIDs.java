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
package org.eclipse.mdht.uml.transform;

/**
 * Identifiers of phases, rules, and context properties used by UML model transformations.
 */
public interface IUMLTransformIDs {
	String ID_BASE = "org.eclipse.mdht.uml.transform.";

	String LOCALIZED_NAMES = ID_BASE + "localizedNames";

	String INITIALIZE_CONTEXT_RULE = ID_BASE + "InitContext";

	String INIT_MODEL_LOCALIZED_NAMES_RULE = ID_BASE + "InitModelLocalizedNames";

	String SAVE_MODEL_LOCALIZED_NAMES_RULE = ID_BASE + "SaveModelLocalizedNames";
}
