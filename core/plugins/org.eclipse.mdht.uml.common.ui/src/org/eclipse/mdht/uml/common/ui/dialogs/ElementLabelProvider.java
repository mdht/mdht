/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.dialogs;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.mdht.uml.common.ui.internal.l10n.Messages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

/**
 * Derived from Eclipse JDT UI Java type search dialog.
 *
 * @version $Id: $
 */
public class ElementLabelProvider extends LabelProvider {

	public static final int SHOW_FULLYQUALIFIED = 0x01;

	public static final int SHOW_PACKAGE_POSTFIX = 0x02;

	public static final int SHOW_PACKAGE_ONLY = 0x04;

	public static final int SHOW_ROOT_POSTFIX = 0x08;

	public static final int SHOW_TYPE_ONLY = 0x10;

	public static final int SHOW_TYPE_CONTAINER_ONLY = 0x20;

	public static final int SHOW_RESOURCE_NAME_POSTFIX = 0x40;

	private static final AdapterFactory adapterFactory = new UMLItemProviderAdapterFactory();

	private static final ILabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

	private int m_Flags;

	public ElementLabelProvider(int flags) {
		m_Flags = flags;
	}

	private boolean isSet(int flag) {
		return (m_Flags & flag) != 0;
	}

	private String getPackageName(String packName) {
		if (packName.length() == 0) {
			return Messages.ElementLabelProvider_default_package;
		} else {
			return packName;
		}
	}

	private String getTypeQualifiedName(NamedElement element) {
		String qname = element.getName();
		if (element instanceof Class) {
			while (((Class) element).getNamespace() instanceof Class) {
				qname = ((Class) element).getNamespace().getName() + "." + qname;
			}
		}
		return qname;
	}

	/*
	 * non java-doc
	 *
	 * @see ILabelProvider#getText
	 */
	@Override
	public String getText(Object element) {
		if (!(element instanceof NamedElement)) {
			return super.getText(element);
		}

		NamedElement namedElement = (NamedElement) element;
		StringBuffer buf = new StringBuffer();
		if (isSet(SHOW_TYPE_ONLY)) {
			buf.append(namedElement.getName());
		} else if (isSet(SHOW_TYPE_CONTAINER_ONLY)) {
			String containerName = namedElement.getNamespace().getQualifiedName();
			buf.append(getPackageName(containerName));
		} else if (isSet(SHOW_PACKAGE_ONLY)) {
			String packName = namedElement.getNearestPackage().getName();
			buf.append(getPackageName(packName));
		} else {
			if (isSet(SHOW_FULLYQUALIFIED)) {
				buf.append(namedElement.getQualifiedName());
			} else {
				buf.append(getTypeQualifiedName(namedElement));
			}

			if (isSet(SHOW_PACKAGE_POSTFIX)) {
				buf.append(Messages.ElementLabelProvider_dash);
				String packName = namedElement.getNearestPackage().getName();
				buf.append(getPackageName(packName));
			}
		}

		if (isSet(SHOW_RESOURCE_NAME_POSTFIX)) {
			buf.append(Messages.ElementLabelProvider_dash);
			String resourceName = namedElement.eResource().getURI().lastSegment();
			buf.append(resourceName);
		}

		return buf.toString();
	}

	/*
	 * non java-doc
	 *
	 * @see ILabelProvider#getImage
	 */
	@Override
	public Image getImage(Object element) {
		return labelProvider.getImage(element);
	}
}
