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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.internal.l10n.Messages;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.common.ui.search.ModelSearch;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

/**
 *
 * @version $Id: $
 */
public class DialogLaunchUtil {

	/**
	 * LabelProvider for package selection dialog.
	 */
	protected static class PackagesListLabelProvider extends LabelProvider {
		private static final AdapterFactory adapterFactory = new UMLItemProviderAdapterFactory();

		private static final ILabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

		@Override
		public Image getImage(Object element) {
			return labelProvider.getImage(element);
		}

		@Override
		public String getText(Object element) {
			if (element instanceof NamedElement) {
				return ((NamedElement) element).getQualifiedName();
			} else {
				return "";
			}
		}
	}

	/**
	 *
	 */
	public static Type chooseType(ResourceSet resourceSet, Shell shell) {
		Class<?>[] filter = { Type.class };
		return (Type) chooseElement(filter, resourceSet, shell);
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(Class<?>[] filter, ResourceSet resourceSet, Shell shell) {
		return chooseElement(
			filter, resourceSet, shell, Messages.ElementSelectionDialog_title, Messages.ElementSelectionDialog_message);
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(Class<?>[] filter, Package umlPackage, Shell shell) {
		return chooseElement(
			filter, umlPackage, shell, Messages.ElementSelectionDialog_title, Messages.ElementSelectionDialog_message);
	}

	public static NamedElement chooseElement(Class<?>[] filter, Package umlPackage, Shell shell, String title,
			String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			for (Element element : ModelSearch.findAllOf(umlPackage, filter[i])) {
				if (!typeList.contains(element)) {
					typeList.add(element);
				}
			}
		}

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	public static NamedElement chooseElement(Class<?>[] filter, Resource resource, Shell shell, String title,
			String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			for (Element element : ModelSearch.findAllOf(resource, filter[i])) {
				if (!typeList.contains(element)) {
					typeList.add(element);
				}
			}
		}

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(Class<?>[] filter, ResourceSet resourceSet, Shell shell, String title,
			String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			for (Element element : ModelSearch.findAllOf(resourceSet, filter[i])) {
				if (!typeList.contains(element)) {
					typeList.add(element);
				}
			}
		}

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(IElementFilter filter, ResourceSet resourceSet, Shell shell) {
		return chooseElement(
			filter, resourceSet, shell, Messages.ElementSelectionDialog_title, Messages.ElementSelectionDialog_message);
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(IElementFilter filter, ResourceSet resourceSet, Shell shell, String title,
			String message) {
		if (title == null) {
			title = Messages.ElementSelectionDialog_title;
		}
		if (message == null) {
			message = Messages.ElementSelectionDialog_message;
		}
		List<Element> typeList = ModelSearch.findAllOf(resourceSet, filter);

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(IElementFilter filter, Package umlPackage, Shell shell) {
		return chooseElement(
			filter, umlPackage, shell, Messages.ElementSelectionDialog_title, Messages.ElementSelectionDialog_message);
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(IElementFilter filter, Package umlPackage, Shell shell, String title,
			String message) {
		return chooseElement(filter, umlPackage, shell, title, message, false);
	}

	/**
	 *
	 */
	public static NamedElement chooseElement(IElementFilter filter, Package umlPackage, Shell shell, String title,
			String message, boolean returnOne) {
		if (title == null) {
			title = Messages.ElementSelectionDialog_title;
		}
		if (message == null) {
			message = Messages.ElementSelectionDialog_message;
		}
		List<Element> typeList = ModelSearch.findAllOf(umlPackage, filter);

		if (returnOne && typeList.size() == 1) {
			return (NamedElement) typeList.get(0);
		}

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 *
	 */
	public static Package choosePackage(ResourceSet resourceSet, Shell shell) {
		List<Element> packagesList = ModelSearch.findAllOf(resourceSet, Package.class);
		Package[] packages = packagesList.toArray(new Package[packagesList.size()]);

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new PackagesListLabelProvider());
		dialog.setIgnoreCase(false);
		dialog.setTitle(Messages.PackageSelectionDialog_title);
		dialog.setMessage(Messages.PackageSelectionDialog_description);
		dialog.setEmptyListMessage(Messages.PackageSelectionDialog_empty);
		dialog.setElements(packages);

		if (dialog.open() == Window.OK) {
			return (Package) dialog.getFirstResult();
		}
		return null;
	}

	public static org.eclipse.uml2.uml.Class chooseUMLMetaclass(ResourceSet resourceSet, Shell shell) {
		return chooseUMLMetaclass(resourceSet, shell, "Metaclass Selection", "Select UML metaclass for extension:");
	}

	public static org.eclipse.uml2.uml.Class chooseUMLMetaclass(ResourceSet resourceSet, Shell shell, String title,
			String message) {
		List<org.eclipse.uml2.uml.Class> classList = ModelSearch.findUMLMetaclasses(resourceSet);

		ElementSelectionDialog dialog = new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), classList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (org.eclipse.uml2.uml.Class) dialog.getFirstResult();
		}
		return null;
	}

}
