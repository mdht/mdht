/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.util.AdapterFactoryManager;
import org.eclipse.mdht.uml.common.ui.util.Selections;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.uml.edit.providers.ElementItemProvider;

public class UMLAdvancedSection extends AdvancedPropertySection implements IPropertySourceProvider {

	private boolean inputIsWrapper;

	protected static class UMLPropertySource extends PropertySource {
		private final boolean readOnly;

		protected List<IItemPropertyDescriptor> stereotypeApplicationItemPropertyDescriptors = null;

		protected UMLPropertySource(Object object, IItemPropertySource itemPropertySource, boolean readOnly) {
			super(object, itemPropertySource);

			this.readOnly = readOnly;
		}

		@Override
		protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
			return new UMLPropertyDescriptor(object, itemPropertyDescriptor, readOnly);
		}

		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() {
			List<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>();

			List<IItemPropertyDescriptor> itemPropertyDescriptors = itemPropertySource.getPropertyDescriptors(object);

			if (itemPropertyDescriptors != null) {

				for (Iterator<IItemPropertyDescriptor> i = itemPropertyDescriptors.iterator(); i.hasNext();) {

					propertyDescriptors.add(createPropertyDescriptor(i.next()));
				}
			}

			if (itemPropertySource instanceof ElementItemProvider) {
				stereotypeApplicationItemPropertyDescriptors = ((ElementItemProvider) itemPropertySource).getStereotypeApplicationPropertyDescriptors(
					object);

				if (stereotypeApplicationItemPropertyDescriptors != null) {

					for (Iterator<IItemPropertyDescriptor> i = stereotypeApplicationItemPropertyDescriptors.iterator(); i.hasNext();) {

						propertyDescriptors.add(createPropertyDescriptor(i.next()));
					}
				}
			}

			return propertyDescriptors.toArray(new IPropertyDescriptor[propertyDescriptors.size()]);
		}

		protected IItemPropertyDescriptor getItemPropertyDescriptor(Object propertyId) {
			IItemPropertyDescriptor itemPropertyDescriptor = itemPropertySource.getPropertyDescriptor(
				object, propertyId);

			return itemPropertyDescriptor == null && itemPropertySource instanceof ElementItemProvider
					? ((ElementItemProvider) itemPropertySource).getStereotypeApplicationPropertyDescriptor(
						object, propertyId)
					: itemPropertyDescriptor;
		}

		@Override
		public Object getPropertyValue(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).getPropertyValue(object);
		}

		@Override
		public boolean isPropertySet(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).isPropertySet(object);
		}

		@Override
		public void resetPropertyValue(Object propertyId) {
			getItemPropertyDescriptor(propertyId).resetPropertyValue(object);
		}

		@Override
		public void setPropertyValue(Object propertyId, Object value) {
			getItemPropertyDescriptor(propertyId).setPropertyValue(object, value);
		}

	}

	protected static class UMLPropertyDescriptor extends PropertyDescriptor {
		private final boolean readOnly;

		protected UMLPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor,
				boolean readOnly) {
			super(object, itemPropertyDescriptor);

			this.readOnly = readOnly;
		}

		@Override
		public CellEditor createPropertyEditor(Composite composite) {
			return readOnly
					? null
					: super.createPropertyEditor(composite);
		}

		@Override
		protected ILabelProvider getEditLabelProvider() {
			final ILabelProvider editLabelProvider = super.getEditLabelProvider();

			return new LabelProvider() {

				@Override
				public String getText(Object object) {
					return itemPropertyDescriptor instanceof IItemQualifiedTextProvider
							? ((IItemQualifiedTextProvider) itemPropertyDescriptor).getQualifiedText(object)
							: editLabelProvider.getText(object);
				}

				@Override
				public Image getImage(Object object) {
					return editLabelProvider.getImage(object);
				}
			};
		}
	}

	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new UMLPropertySource(object, ips, inputIsWrapper);
			}
		}
		if (object instanceof IAdaptable) {
			return ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * Modify/unwrap selection.
	 */
	protected Object transformSelection(Object selected) {
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View
					? ((View) model).getElement()
					: null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			EObject eObject = ((IAdaptable) selected).getAdapter(EObject.class);
			if (eObject != null) {
				return eObject;
			}
		}
		return selected;
	}

	@Override
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty() || false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}

		final StructuredSelection structuredSelection = (StructuredSelection) Selections.unwrap(
			(StructuredSelection) selection);
		inputIsWrapper = structuredSelection != selection;

		ArrayList<Object> transformedSelection = new ArrayList<Object>(structuredSelection.size());
		for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain()).getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(object);

		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
		} else {
			return AdapterFactoryManager.getAdapterFactory();
		}
	}
}
