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
 *     Christian W. Damus - fix re-ordering of properties and constraints
 *                        - ensure correct structure of pasted association copies (artf3287)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.provider;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.mdht.uml.common.notation.NotationUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.internal.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.ExtensionItemProvider;

/**
 *
 */
public class ExtensionExtItemProvider extends ExtensionItemProvider implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ExtensionExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		return "metaclass";
	}

	/**
	 * I declare no children features so that no drop/add/etc. may be attempted on me.
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		return Collections.emptyList();
	}

	/**
	 * Because we show extensions under the stereotype, provide that as the parent.
	 */
	@Override
	public Object getParent(Object object) {
		final Extension extension = (Extension) object;

		return extension.getStereotype();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		return super.getChildren(object);
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		// we wrap most children because they are cross-references (and not even direct ones, at that)
		return true;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		final Extension extension = (Extension) object;
		if (extension.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Class metaclass = extension.getMetaclass();

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			case IUMLTableProperties.TYPE_INDEX:
				if (metaclass != null) {
					IItemLabelProvider provider = (IItemLabelProvider) getAdapterFactory().adapt(
						metaclass, IItemLabelProvider.class);
					if (provider != null) {
						return provider.getImage(metaclass);
					}
				}
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotationImage(extension);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		final Extension extension = (Extension) element;
		if (extension.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Class metaclass = extension.getMetaclass();

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(element);
			case IUMLTableProperties.TYPE_INDEX:
				return (metaclass == null)
						? null
						: metaclass.getName();
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == extension.getVisibility()) {
					return "";
				} else {
					return extension.getVisibility().getName();
				}
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotation(extension);
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
			return false;
		} else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
			return false;
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return false;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		final Extension extension = (Extension) element;

		if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return extension.getMetaclass();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		final Extension extension = (Extension) element;
		final Profile profile = (Profile) extension.getPackage();

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(extension);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (IUMLTableProperties.TYPE_PROPERTY.equals(property) && value instanceof Class) {
						Class metaclass = (Class) value;

						setLabel("Set Metaclass");
						extension.metaclassEnd().setType(metaclass);

						// assure that metaclass is imported
						if (!profile.getReferencedMetaclasses().contains(metaclass) &&
								!profile.getReferencedMetamodels().contains(metaclass.getModel())) {
							profile.createMetaclassReference(metaclass);
						}

					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	protected Command createCreateCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return null;
	}

}
