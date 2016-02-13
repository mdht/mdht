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

import java.util.Map;

import org.eclipse.mdht.transform.core.ITransformContext;

/**
 * Default implementation of the transformation context.
 */
public class TransformContext implements ITransformContext {
	private final Map<String, Object> options = new java.util.HashMap<String, Object>();

	private final Map<Object, Object> data = new java.util.HashMap<Object, Object>();

	private final ITransformContext delegate;

	public TransformContext() {
		this(null);
	}

	public TransformContext(ITransformContext delegate) {
		this.delegate = delegate;
	}

	public boolean getBooleanOption(String name) {
		Boolean localValue = (Boolean) options.get(name);
		return (localValue != null)
				? localValue.booleanValue()
				: delegatedGetBooleanOption(name);
	}

	protected boolean delegatedGetBooleanOption(String name) {
		return (delegate == null)
				? false
				: delegate.getBooleanOption(name);
	}

	public void setBooleanOption(String name, boolean value) {
		options.put(name, value);
	}

	public String getStringOption(String name) {
		String localValue = (String) options.get(name);
		return (localValue != null)
				? localValue
				: delegatedGetStringOption(name);
	}

	protected String delegatedGetStringOption(String name) {
		return (delegate == null)
				? null
				: delegate.getStringOption(name);
	}

	public void setStringOption(String name, String value) {
		if (value == null) {
			options.remove(name);
		} else {
			options.put(name, value);
		}
	}

	public Object get(Object key) {
		Object localValue = data.get(key);
		return (localValue != null)
				? localValue
				: delegatedGet(key);
	}

	protected Object delegatedGet(Object key) {
		return (delegate == null)
				? null
				: delegate.get(key);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<? extends T> key) {
		Object localValue = data.get(key);

		if ((localValue != null) && !key.isInstance(localValue)) {
			throw new IllegalStateException(
				String.format("Invalid data for key of type %s: %s", key.getName(), localValue));
		}

		return (localValue != null)
				? (T) localValue
				: delegatedGet(key);
	}

	protected <T> T delegatedGet(Class<? extends T> key) {
		return (delegate == null)
				? null
				: delegate.get(key);
	}

	public Object put(Object key, Object value) {
		return (value == null)
				? data.remove(key)
				: data.put(key, value);
	}

	public <T> Object put(Class<? super T> key, T value) {
		return (value == null)
				? data.remove(key)
				: data.put(key, value);
	}

	public void dispose() {
		options.clear();
		data.clear();
	}
}
