/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *     Christian W. Damus - disallow pasting associations directly into packages (artf3287)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.util.NamedElementComparator;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.provider.operations.NamedElementOperations;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;

/**
 *
 * @version $Id: $
 */
public class PackageExtItemProvider extends PackageItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public PackageExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.PackageItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	protected String getName(NamedElement namedElement) {
		AdapterFactory adapterFactory = getAdapterFactory();
		return adapterFactory instanceof UML2ExtendedAdapterFactory &&
				((UML2ExtendedAdapterFactory) adapterFactory).isShowBusinessNames()
						? NamedElementUtil.getBusinessName(namedElement)
						: namedElement.getName();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.PackageItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((org.eclipse.uml2.uml.Package) object);
		return label == null || label.length() == 0
				? getString("_UI_Package_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Object> getChildren(Object object) {
		Package pkg = (Package) object;
		List<Object> children = new ArrayList<Object>();

		/* Applied Stereotypes */
		// for (EObject stereotypeApplication : pkg.getStereotypeApplications()) {
		// children.add(stereotypeApplication);
		// }

		children.addAll(pkg.getOwnedComments());
		children.addAll(pkg.getOwnedRules());

		List<Package> sortedPackages = new ArrayList<Package>(pkg.getNestedPackages());
		Collections.sort(sortedPackages, new NamedElementComparator());
		children.addAll(sortedPackages);

		List<Type> sortedTypes = new ArrayList<Type>();
		for (Type type : pkg.getOwnedTypes()) {
			if (type instanceof org.eclipse.uml2.uml.Class || type instanceof Interface || type instanceof DataType ||
					type instanceof Actor || type instanceof UseCase) {
				sortedTypes.add(type);
			}
		}
		Collections.sort(sortedTypes, new NamedElementComparator());
		children.addAll(sortedTypes);

		// List sortedAssociations = new ArrayList();
		// for (Iterator members = pkg.getOwnedTypes().iterator(); members.hasNext();) {
		// Type type = (Type) members.next();
		// if (type instanceof Association)
		// sortedAssociations.add(type);
		// }
		// Collections.sort(sortedAssociations, new NamedElementComparator());
		// children.addAll(sortedAssociations);

		children.addAll(pkg.getPackageImports());
		children.addAll(pkg.getElementImports());
		children.addAll(pkg.getClientDependencies());

		return children;
	}

	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		if (child instanceof Model) {
			return null;
		} else {
			return super.getChildFeature(object, child);
		}
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		Package pkg = (Package) object;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getName(pkg);
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == pkg.getVisibility()) {
					return "";
				} else {
					return pkg.getVisibility().getName();
				}
			default:
				return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Package pkg = (Package) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return pkg.getName();
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return new Integer(pkg.getVisibility().getValue());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		NamedElementOperations.modify(element, property, value);
	}

	@Override
	public Command createCommand(Object object, EditingDomain domain, Class<? extends Command> commandClass,
			CommandParameter commandParameter) {

		Command result = null;

		if (commandClass == AddCommand.class) {
			// are we trying to add objects that we don't want to be able to add?
			if (!TrojanHorse.filter(commandParameter.getCollection(), Association.class)) {
				result = UnexecutableCommand.INSTANCE;
			}
		}

		if (result == null) {
			result = super.createCommand(object, domain, commandClass, commandParameter);
		}

		return result;
	}
}
