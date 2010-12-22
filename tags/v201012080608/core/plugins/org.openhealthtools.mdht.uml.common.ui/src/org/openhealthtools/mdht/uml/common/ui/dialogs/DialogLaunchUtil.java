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
package org.openhealthtools.mdht.uml.common.ui.dialogs;

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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.openhealthtools.mdht.uml.common.ui.internal.l10n.Messages;
import org.openhealthtools.mdht.uml.common.ui.search.IElementFilter;
import org.openhealthtools.mdht.uml.common.ui.search.ModelSearch;

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
		
		public Image getImage(Object element) {
			return labelProvider.getImage(element);
		}
		
		public String getText(Object element) {
			if( element instanceof NamedElement )
				return ((NamedElement)element).getQualifiedName();
			else
				return "";
		}
	}	

	/**
	 * 
	 */
	public static Type chooseType( ResourceSet resourceSet, Shell shell ) {
		Class[] filter = {Type.class};
		return (Type) chooseElement(filter, resourceSet, shell);
	}

	/**
	 * 
	 */
	public static NamedElement chooseElement( Class[] filter, ResourceSet resourceSet, Shell shell ) {
		return chooseElement(filter, resourceSet, shell,
				Messages.ElementSelectionDialog_title,
				Messages.ElementSelectionDialog_message);
	}

	/**
	 * 
	 */
	public static NamedElement chooseElement( Class[] filter, Package umlPackage, Shell shell ) {
		return chooseElement(filter, umlPackage, shell,
				Messages.ElementSelectionDialog_title,
				Messages.ElementSelectionDialog_message);
	}

	public static NamedElement chooseElement( Class[] filter, Package umlPackage, 
			Shell shell, String title, String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			typeList.addAll(ModelSearch.findAllOf(umlPackage, filter[i]));
		}

		ElementSelectionDialog dialog= new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			return (NamedElement) dialog.getFirstResult();
		}
		return null;
	}

	public static NamedElement chooseElement( Class[] filter, Resource resource, 
			Shell shell, String title, String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			typeList.addAll(ModelSearch.findAllOf(resource, filter[i]));
		}

		ElementSelectionDialog dialog= new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
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
	public static NamedElement chooseElement( Class[] filter, ResourceSet resourceSet, 
			Shell shell, String title, String message) {
		List<Element> typeList = new ArrayList<Element>();
		for (int i = 0; i < filter.length; i++) {
			typeList.addAll(ModelSearch.findAllOf(resourceSet, filter[i]));
		}

		ElementSelectionDialog dialog= new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
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
	public static NamedElement chooseElement( IElementFilter filter, ResourceSet resourceSet, 
			Shell shell, String title, String message) {
		if (title == null) {
			title = Messages.ElementSelectionDialog_title;
		}
		if (message == null) {
			message = Messages.ElementSelectionDialog_message;
		}
		List<Element> typeList = ModelSearch.findAllOf(resourceSet, filter);

		ElementSelectionDialog dialog= new ElementSelectionDialog(shell, new ProgressMonitorDialog(shell), typeList);
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
	public static Package choosePackage( ResourceSet resourceSet, Shell shell ) {
		List packagesList = ModelSearch.findAllOf(resourceSet, Package.class);
		Package[] packages= (Package[])packagesList.toArray(new Package[packagesList.size()]);
		
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(shell, new PackagesListLabelProvider());
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

}
