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
package org.openhealthtools.mdht.uml.ui.navigator.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.openhealthtools.mdht.uml.ui.navigator.UMLAbstractNavigatorItem;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.openhealthtools.mdht.uml.ui.navigator.internal.plugin.Activator;
import org.openhealthtools.mdht.uml.ui.navigator.internal.providers.NavigatorUMLItemProviderAdapterFactory;


public class UMLNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider {

	static {
		Activator.getDefault().getImageRegistry().put("Navigator?InvalidElement", ImageDescriptor.getMissingImageDescriptor());
		Activator.getDefault().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor());
		Activator.getDefault().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor());
	}

	/** This is the one adapter factory used for providing views of the model. */
	private ComposedAdapterFactory adapterFactory;
	
	private ILabelProvider labelProvider;

    /*
     * Adds validation problem markers to the model elements.
     */
    private IValidationListener validationListener = new IValidationListener() {
		public void validationOccurred(final ValidationEvent event) {
			if (event.getClientContextIds().contains("org.openhealthtools.mdht.uml.ui.validation.refresh")
					&& event.getEvaluationMode() == EvaluationMode.BATCH) {
				// Decorate using current UI thread
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						// Fire a label provider changed event to decorate the
						// resources whose image needs to be updated
						fireLabelProviderChanged(new LabelProviderChangedEvent(UMLNavigatorLabelProvider.this, null));
					}
				});
			}
		}
    };
	
	public UMLNavigatorLabelProvider() {
		adapterFactory = createAdapterFactory();
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

		ModelValidationService.getInstance().addValidationListener(validationListener);
	}

	public void dispose() {
		adapterFactory.dispose();
		ModelValidationService.getInstance().removeValidationListener(validationListener);
	}

	protected ComposedAdapterFactory createAdapterFactory() {
		List factories = new ArrayList();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	protected void fillItemProviderFactories(List factories) {
		factories.add(new NavigatorUMLItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	public Image getImage(Object element) {
		if (false == element instanceof UMLAbstractNavigatorItem) {
			return super.getImage(element);
		}

		UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
		if (abstractNavigatorItem instanceof UMLDomainNavigatorItem) {
			UMLDomainNavigatorItem navigatorItem = (UMLDomainNavigatorItem) abstractNavigatorItem;
			return labelProvider.getImage(navigatorItem.getEObject());
			
		} 
		else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return Activator.getDefault().getBundledImage(group.getIcon());
		}
		return super.getImage(element);
	}

	public String getText(Object element) {
		if (element instanceof IFile) {
			return "(" + super.getText(element) + ")";
		}
		else if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
			if (abstractNavigatorItem instanceof UMLDomainNavigatorItem) {
				UMLDomainNavigatorItem navigatorItem = (UMLDomainNavigatorItem) abstractNavigatorItem;
				return labelProvider.getText(navigatorItem.getEObject());
			}
	
			else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
				UMLNavigatorGroup group = (UMLNavigatorGroup) element;
				return group.getGroupName();
			}
		}
		
		return super.getText(element);
	}

	public void init(ICommonContentExtensionSite aConfig) {
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	public String getDescription(Object anElement) {
		return null;
	}

}
