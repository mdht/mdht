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
package org.openhealthtools.mdht.transform.core.impl;

import org.openhealthtools.mdht.transform.core.ITransformContext;
import org.openhealthtools.mdht.transform.core.ITransformationComponent;
import org.openhealthtools.mdht.transform.core.TransformationException;

/**
 * Implementation of the protocol common to all transformation components.
 */
public abstract class AbstractTransformComponent<E extends Enum<E>> implements ITransformationComponent {
	static final String INTERNAL_COMPONENT_ID_BASE = "org.openhealthtools.mdht.transform.core.";

	private final String id;

	private final E kind;

	private final String label;

	private ITransformContext context;

	public AbstractTransformComponent(String id, E kind, String label) {
		this.id = id;
		this.kind = kind;
		this.label = label;
	}

	public String getID() {
		return id;
	}

	public E getKind() {
		return kind;
	}

	public String getLabel() {
		return label;
	}

	/**
	 * Stores the context for later access. Overrides must call {@code super}.
	 */
	public void initialize(ITransformContext ctx) throws TransformationException {
		this.context = ctx;
	}

	protected ITransformContext getContext() {
		return context;
	}

	@Override
	public String toString() {
		return String.format("%s(%s, %s, %s)", getClass().getSimpleName(), getKind(), getLabel(), getID());
	}
}
