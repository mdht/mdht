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
package org.eclipse.mdht.uml.transform.ecore;

/**
 * IDs of phases, rules, and context variables used by the base UML-to-Ecore transformation.
 */
public interface IEcoreTransformIDs {
	String ID_BASE = "org.eclipse.mdht.uml.transform.ecore.";

	String TRANSFORM_ELEMENTS_PHASE = ID_BASE + "TransformElements";

	String TRANSFORM_INLINE_ASSOCATIONS_PHASE = ID_BASE + "TransformInlineAssociations";

	String TRANSFORM_INNER_CLASSES_PHASE = ID_BASE + "TransformInnerClasses";

	String SAVE_PLUGIN_PROPERTIES_RULE = ID_BASE + "SavePluginProperties";
}
