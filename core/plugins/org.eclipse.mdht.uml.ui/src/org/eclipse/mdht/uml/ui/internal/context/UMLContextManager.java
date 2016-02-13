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

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;

/**
 * Context management service for UML editing contexts in the UML Table Editor.
 */
public class UMLContextManager {
	private static final String CONTEXT_ID_PREFIX = "org.eclipse.mdht.uml.ui.context.";

	private final IContextService contextService;

	private final Map<UMLContext, IContextActivation> activeContexts = new EnumMap<UMLContext, IContextActivation>(
		UMLContext.class);

	public UMLContextManager(IContextService contextService) {
		this.contextService = contextService;
	}

	private static String getContextID(UMLContext context) {
		return CONTEXT_ID_PREFIX + context.key();
	}

	public void activate(UMLContext context) {
		if (!activeContexts.containsKey(context)) {
			activeContexts.put(context, contextService.activateContext(getContextID(context)));
		}
	}

	public void deactivate(UMLContext context) {
		IContextActivation token = activeContexts.remove(context);
		if (token != null) {
			contextService.deactivateContext(token);
		}
	}

	public void activateAll(Iterable<? extends UMLContext> contexts) {
		for (UMLContext next : contexts) {
			activate(next);
		}
	}

	public void activateAll() {
		activateAll(EnumSet.allOf(UMLContext.class));
	}

	public void deactivateAll(Iterable<? extends UMLContext> contexts) {
		for (UMLContext next : contexts) {
			deactivate(next);
		}
	}

	public void deactivateAll() {
		deactivateAll(EnumSet.allOf(UMLContext.class));
	}

	public boolean isActive(UMLContext context) {
		return activeContexts.containsKey(context);
	}
}
