package org.openhealthtools.mdht.uml.hdf.ui.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.ui.clone.CloneHandler;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;

public class OpenCloneEditorAction implements IObjectActionDelegate {

	EObject eObject;

	public OpenCloneEditorAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(eObject);

			String appliedStereotypeName = "";
			Stereotype stereotype = null;
			if (eObject instanceof Class) {
				stereotype = RIMProfileUtil.getRIMStereotype((Class) eObject);
				if (stereotype != null) {
					appliedStereotypeName = stereotype.getQualifiedName();
				}
			}
			final CloneHandler cloneHandler = new CloneHandler(stereotype, eObject, appliedStereotypeName);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Open Clone Editor") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					cloneHandler.modify();
					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				// Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		eObject = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Class) {
				eObject = (EObject) selected;
			}
		}

		if (eObject != null && eObject instanceof Class) {
			Class element = (Class) eObject;
			Stereotype rimStereotype = RIMProfileUtil.getRIMStereotype(element);
			// if the eObject has a RIM stereotype applied then enable the action
			if (rimStereotype != null) {
				action.setEnabled(true);
				return;
			}
		}
		action.setEnabled(false);

	}
}
