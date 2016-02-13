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
package org.eclipse.mdht.uml.ui.navigator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IColorDecorator;
import org.eclipse.jface.viewers.IFontDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;

public class DecoratorAdapterFactoryLabelProvider extends AdapterFactoryLabelProvider
		implements IColorDecorator, IFontDecorator {

	private IDecoratorManager decorator = PlatformUI.getWorkbench().getDecoratorManager();

	private ILabelProviderListener labelProviderListener = new ILabelProviderListener() {
		public void labelProviderChanged(LabelProviderChangedEvent event) {
			fireLabelProviderChanged();
		}
	};

	public DecoratorAdapterFactoryLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		decorator.addListener(labelProviderListener);
	}

	@Override
	public void dispose() {
		super.dispose();
		decorator.removeListener(labelProviderListener);
	}

	@Override
	public Image getImage(Object element) {
		Image image = super.getImage(element);
		if (image != null && decorator != null) {
			Image decorated = decorator.decorateImage(image, element);
			if (decorated != null) {
				return decorated;
			}
		}
		return image;
	}

	@Override
	public String getText(Object element) {
		String text = super.getText(element);
		if (decorator != null) {
			String decorated = decorator.decorateText(text, element);
			if (decorated != null) {
				return decorated;
			}
		}
		return text;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		Image image = super.getColumnImage(element, columnIndex);
		// the first table column displays the row's element name/image
		if (columnIndex == 0 && image != null && decorator != null) {
			Image decorated = decorator.decorateImage(image, element);
			if (decorated != null) {
				return decorated;
			}
		}
		return image;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		String text = super.getColumnText(element, columnIndex);
		// the first table column displays the row's element name/image
		if (columnIndex == 0 && text != null && decorator != null) {
			String decorated = decorator.decorateText(text, element);
			if (decorated != null) {
				return decorated;
			}
		}
		return text;
	}

	public Color decorateBackground(Object element) {
		if (decorator != null && decorator instanceof IColorDecorator) {
			Color decorated = ((IColorDecorator) decorator).decorateBackground(element);
			if (decorated != null) {
				return decorated;
			}
		}
		return null;
	}

	public Color decorateForeground(Object element) {
		if (decorator != null && decorator instanceof IColorDecorator) {
			Color decorated = ((IColorDecorator) decorator).decorateForeground(element);
			if (decorated != null) {
				return decorated;
			}
		}
		return null;
	}

	public Font decorateFont(Object element) {
		if (decorator != null && decorator instanceof IFontDecorator) {
			Font decorated = ((IFontDecorator) decorator).decorateFont(element);
			if (decorated != null) {
				return decorated;
			}
		}
		return null;
	}

}
