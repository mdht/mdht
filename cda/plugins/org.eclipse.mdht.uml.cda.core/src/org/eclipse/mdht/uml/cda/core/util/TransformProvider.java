/*******************************************************************************
 * Copyright (c) 2015 AlexSkillender.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     AlexSkillender (NEHTA) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.util;

import org.eclipse.uml2.uml.Property;

/**
 * Provides access to the CDA Transform properties
 */
public interface TransformProvider {

	public Property GetTransform(Property property);
}
