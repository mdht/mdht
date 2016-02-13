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
package org.eclipse.mdht.uml.common.ui.util;

import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;

/**
 * A label provider that makes it convenient to map {@link Enum} literals to string labels.
 */
public class EnumerationLabelProvider<T extends Enum<T>> extends LabelProvider {
	private Class<T> type;

	private Map<T, String> labels;

	private EnumerationLabelProvider(Class<T> type) {
		this.type = type;
		this.labels = new java.util.EnumMap<T, String>(type);
	}

	public static <T extends Enum<T>> EnumerationLabelProvider<T> of(Class<T> type) {
		return new EnumerationLabelProvider<T>(type);
	}

	public EnumerationLabelProvider<T> label(T value, String label) {
		labels.put(value, label);
		return this;
	}

	public EnumerationLabelProvider<T> labels(String... label) {
		final T[] values = type.getEnumConstants();
		for (int i = 0; (i < values.length) && (i < label.length); i++) {
			if (label != null) {
				this.labels.put(values[i], label[i]);
			}
		}

		return this;
	}

	@Override
	public String getText(Object element) {
		String result = labels.get(element);

		if (result == null) {
			result = super.getText(element);
		}

		return result;
	}
}
