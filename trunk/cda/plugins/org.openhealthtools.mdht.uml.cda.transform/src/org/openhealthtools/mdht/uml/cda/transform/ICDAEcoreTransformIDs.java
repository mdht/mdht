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
package org.openhealthtools.mdht.uml.cda.transform;

/**
 * IDs of phases, rules, and context variables used by the CDA UML-to-Ecore transformation.
 */
public interface ICDAEcoreTransformIDs {
	String ID_BASE = "org.openhealthtools.mdht.uml.cda.transform.";

	String TRANSFORM_ELEMENTS_PHASE = ID_BASE + "TransformElements";

	String TRANSFORM_INLINE_ASSOCATIONS_PHASE = ID_BASE + "TransformInlineAssociations";

	String TRANSFORM_INNER_CLASSES_PHASE = ID_BASE + "TransformInnerClasses";

	String INITIALIZE_CONTEXT_RULE = ID_BASE + "InitContext";

	String SAVE_PLUGIN_PROPERTIES_RULE = ID_BASE + "SavePluginProperties";
}
