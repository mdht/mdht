/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.ui.properties.internal.sections;

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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;
import org.eclipse.uml2.uml.edit.providers.ElementItemProvider;
import org.openhealthtools.mdht.uml.common.ui.util.AdapterFactoryManager;

public class UMLAdvancedSection extends AdvancedPropertySection implements IPropertySourceProvider {

	protected static class UMLPropertySource
			extends PropertySource {

		protected List stereotypeApplicationItemPropertyDescriptors = null;

		protected UMLPropertySource(Object object,
				IItemPropertySource itemPropertySource) {
			super(object, itemPropertySource);
		}

		protected IPropertyDescriptor createPropertyDescriptor(
				IItemPropertyDescriptor itemPropertyDescriptor) {
			return new UMLPropertyDescriptor(object, itemPropertyDescriptor);
		}

		public IPropertyDescriptor[] getPropertyDescriptors() {
			List propertyDescriptors = new ArrayList();

			List itemPropertyDescriptors = itemPropertySource
				.getPropertyDescriptors(object);

			if (itemPropertyDescriptors != null) {

				for (Iterator i = itemPropertyDescriptors.iterator(); i
					.hasNext();) {

					propertyDescriptors
						.add(createPropertyDescriptor((IItemPropertyDescriptor) i
							.next()));
				}
			}

			if (itemPropertySource instanceof ElementItemProvider) {
				stereotypeApplicationItemPropertyDescriptors = ((ElementItemProvider) itemPropertySource)
					.getStereotypeApplicationPropertyDescriptors(object);

				if (stereotypeApplicationItemPropertyDescriptors != null) {

					for (Iterator i = stereotypeApplicationItemPropertyDescriptors
						.iterator(); i.hasNext();) {

						propertyDescriptors
							.add(createPropertyDescriptor((IItemPropertyDescriptor) i
								.next()));
					}
				}
			}

			return (IPropertyDescriptor[]) propertyDescriptors
				.toArray(new IPropertyDescriptor[propertyDescriptors.size()]);
		}

		protected IItemPropertyDescriptor getItemPropertyDescriptor(
				Object propertyId) {
			IItemPropertyDescriptor itemPropertyDescriptor = itemPropertySource
				.getPropertyDescriptor(object, propertyId);

			return itemPropertyDescriptor == null
				&& itemPropertySource instanceof ElementItemProvider
				? ((ElementItemProvider) itemPropertySource)
					.getStereotypeApplicationPropertyDescriptor(object,
						propertyId)
				: itemPropertyDescriptor;
		}

		public Object getPropertyValue(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).getPropertyValue(
				object);
		}

		public boolean isPropertySet(Object propertyId) {
			return getItemPropertyDescriptor(propertyId).isPropertySet(object);
		}

		public void resetPropertyValue(Object propertyId) {
			getItemPropertyDescriptor(propertyId).resetPropertyValue(object);
		}

		public void setPropertyValue(Object propertyId, Object value) {
			getItemPropertyDescriptor(propertyId).setPropertyValue(object,
				value);
		}

	}

	protected static class UMLPropertyDescriptor
			extends PropertyDescriptor {

		protected UMLPropertyDescriptor(Object object,
				IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		protected ILabelProvider getEditLabelProvider() {
			final ILabelProvider editLabelProvider = super
				.getEditLabelProvider();

			return new LabelProvider() {

				public String getText(Object object) {
					return itemPropertyDescriptor instanceof IItemQualifiedTextProvider
						? ((IItemQualifiedTextProvider) itemPropertyDescriptor)
							.getQualifiedText(object)
						: editLabelProvider.getText(object);
				}

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
				return new UMLPropertySource(object, ips);
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}

	/**
	 * Modify/unwrap selection.  
	 */
	protected Object transformSelection(Object selected) {
		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			EObject eObject = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			if (eObject != null) {
				return eObject;
			}
		}
		return selected;
	}

	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty() || false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
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
		}
		else {
			return AdapterFactoryManager.getAdapterFactory();
		}
	}
}
