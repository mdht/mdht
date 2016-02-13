/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ui.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.mdht.uml.transform.FlattenTransformer;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.uml2.uml.Element;

public class FlattenModelAction extends UML2AbstractAction {

	public FlattenModelAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		boolean includeBaseModel = true;
		boolean useBusinessNames = true;
		String outputModelPath = null;
		String vocabModelPath = null;

		try {
			final List<Element> elements = getSelectedElements();
			if (elements.isEmpty()) {
				return;
			}

			TransformerOptions options = new TransformerOptions();
			options.setIncludeBaseModel(includeBaseModel);
			options.setUseBusinessNames(useBusinessNames);

			options.setOutputModelPath(outputModelPath);
			options.setVocabModelPath(vocabModelPath);

			final FlattenTransformer transformer = new FlattenTransformer(options);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Flatten Model") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					transformer.initialize(elements.get(0).getNearestPackage());
					for (Element element : elements) {
						transformer.transformModelElement(element);
					}

					transformer.saveResources();

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), activePart);

			} catch (ExecutionException ee) {
				throw new RuntimeException(ee.getCause());
			}

			if (transformer.getFlattenedPackage() != null) {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformer.getFlattenedPackage().eResource().save(saveOptions);
			}
			if (transformer.getFlattenedVocabPackage() != null) {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformer.getFlattenedVocabPackage().eResource().save(saveOptions);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
