/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKMSoftware) - initial implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hdf.ui.properties;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.hdf.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;


public class HDFUIUtil {

	private static class StereoPropertyValueOperation extends AbstractEMFOperation {
		
		public Element element;

		public String stereotype;

		public String[] properties;

		public Object[] values;

		public StereoPropertyValueOperation(TransactionalEditingDomain domain, String label) {
			super(domain, label);			
		}

		protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

			IStatus result = Status.OK_STATUS;
			
			Stereotype apppliedStereotype = HL7ResourceUtil.getAppliedHDFStereotype(element, stereotype);
			

			if (apppliedStereotype != null) {

				if (properties.length == values.length) {
					int valueCtr = 0;

					for (String property : properties) {
						element.setValue(apppliedStereotype, property, values[valueCtr++]);
					}

					// If we have at least on value, create a notification to
					// update views
					if (values.length > 0) {
						Notification notification = new NotificationImpl(Notification.SET, null, values[0]) {
							public Object getNotifier() {
								return element;
							}

							public int getFeatureID(Class expectedClass) {
								return UMLPackage.PROPERTY__NAME;
							}
						};
						element.eNotify(notification);
					}

				} else {
					result = Status.CANCEL_STATUS;
				}
			}

			return result;
		}
	};

	/**
	 * setStereoPropertyValue is used to set properties within the health care
	 * tab within a editing transaction.
	 * 
	 * @param element
	 * @param stereotype
	 * @param property
	 * @param value
	 * @param adaptable
	 */
	static void setStereoPropertyValue(Element element, String stereotype, String[] property, Object[] value, IAdaptable adaptable) {

		// Start the editing domain transaction
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(element);

		StereoPropertyValueOperation operation = new StereoPropertyValueOperation(editingDomain, "setStereoProperties");

		operation.element = element;
		
		operation.stereotype = stereotype;
		
		operation.properties = property;
		
		operation.values = value;
	
		try {

			IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();

			operation.addContext(commandStack.getDefaultUndoContext());

			if (commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), adaptable) == Status.CANCEL_STATUS)
			{
				// Do Something Here
			}

		} catch (ExecutionException ee) {
			Logger.logException(ee);
		}
	}

}
