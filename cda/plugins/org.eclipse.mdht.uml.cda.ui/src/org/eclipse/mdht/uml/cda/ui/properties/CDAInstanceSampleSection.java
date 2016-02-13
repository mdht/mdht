/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.cda.ui.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.mdht.uml.cda.core.util.CDACommonUtils;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ClinicalDocumentCreator;
import org.eclipse.mdht.uml.cda.core.util.ModelStatus;
import org.eclipse.mdht.uml.cda.ui.filters.TextAttributeFilter;
import org.eclipse.mdht.uml.ui.properties.internal.sections.InstanceSampleSection;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

/**
 * Section that allows to add sample data to classes; also adds buttons to view sample XML snippets for attached data
 */
public class CDAInstanceSampleSection extends InstanceSampleSection {

	@Override
	protected Property getBaseProperty(final Property property) {
		return CDACommonUtils.getCDAProperty(property);
	}

	@Override
	protected boolean isOptionalOrRequiredButNotFixed(Property property) {
		if (super.isOptionalOrRequiredButNotFixed(property)) {
			return true;
		}
		if (new TextAttributeFilter().select(property) && CDAProfileUtil.getTextValue(property) == null) {
			return true;
		}
		return false;
	}

	@Override
	protected Collection<Property> getAllAttributes(Class cls) {
		return CDACommonUtils.allAttributes(cls);
	}

	@Override
	protected void createOtherFormUI() {
		final Button buttonSample = getWidgetFactory().createButton(body, "Show Sample Instance", 0);
		buttonSample.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP, 1, 2));

		Button buttonSampleMin = getWidgetFactory().createButton(body, "Show Minimal Instance", 0);
		buttonSampleMin.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP, 1, 2));

		final Button buttonSampleMax = getWidgetFactory().createButton(body, "Show Maximal Instance", 0);
		buttonSampleMax.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP, 1, 2));

		SelectionListener listener = new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {

				Class umlClinicalDocument = CDACommonUtils.getClinicalDocument(umlElement);

				ResourceSet resourceSet = new ResourceSetImpl();

				CDACommonUtils.patchResourceSet(resourceSet);

				ArrayList<ModelStatus> statuses = new ArrayList<ModelStatus>();
				ClinicalDocumentCreator creator = new ClinicalDocumentCreator(
					umlClinicalDocument, resourceSet, statuses);
				creator.enableSampleData(true);
				creator.enableSampleDataExpansion(e.getSource() == buttonSample);
				Collection<Property> props = Collections.emptyList();
				if (e.getSource() == buttonSampleMax) {
					props = CDACommonUtils.getAllContents(umlElement.eResource(), Property.class);
				}
				EObject newObject = creator.initializeSnippet((Class) umlElement, props);

				String xml = creator.toXMLString(newObject, (Class) umlElement);

				if (!statuses.isEmpty()) {
					MultiStatus status = new MultiStatus(
						"au.net.electronichealth.ci.common", IStatus.ERROR, statuses.toArray(new IStatus[] {}),
						"Errors occured during sample XML generation", null);
					StatusManager.getManager().handle(status);
				}

				MemoDialog dialog = new MemoDialog(Display.getCurrent().getActiveShell(), !statuses.isEmpty()
						? "Sample XML (see Error Log for more information)"
						: "Sample XML",
					xml);

				dialog.open();

			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}

		};
		buttonSample.addSelectionListener(listener);
		buttonSampleMin.addSelectionListener(listener);
		buttonSampleMax.addSelectionListener(listener);
	}
}
