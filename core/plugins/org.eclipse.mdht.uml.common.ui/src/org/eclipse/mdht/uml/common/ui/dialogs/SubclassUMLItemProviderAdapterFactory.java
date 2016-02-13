/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.dialogs;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

public class SubclassUMLItemProviderAdapterFactory extends UMLItemProviderAdapterFactory {

	private boolean showKeywords() {
		return false;
	}

	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return classItemProvider;
	}
}
