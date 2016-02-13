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
package org.eclipse.mdht.transform.core.impl;

import org.eclipse.mdht.transform.core.FragmentKind;
import org.eclipse.mdht.transform.core.IRuleFragment;

/**
 * A partial implementation of the {@link IRuleFragment} API.
 */
public abstract class AbstractRuleFragment extends AbstractTransformComponent<FragmentKind> implements IRuleFragment {

	public AbstractRuleFragment(String id, FragmentKind kind, String label) {
		super(id, kind, label);
	}

}
