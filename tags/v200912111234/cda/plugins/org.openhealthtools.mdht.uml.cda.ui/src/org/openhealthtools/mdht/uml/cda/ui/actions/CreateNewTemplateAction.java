package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.util.Iterator;

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
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.ui.dialogs.TemplateEditorViewContentProvider;
import org.openhealthtools.mdht.uml.cda.ui.dialogs.TemplateEditorViewLabelProvider;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassHandler;

public class CreateNewTemplateAction implements IObjectActionDelegate {
	
	protected IWorkbenchPart activePart;
	protected ISelection currentSelection;
	protected Package selectedPackage;
	
	public CreateNewTemplateAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedPackage);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Create New Template") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					// prompt for new class name
					String className = null;
					InputDialog inputDialog = new InputDialog(activePart.getSite().getShell(), 
							"New Template", "Enter template name", "", null);
					if (inputDialog.open() == InputDialog.OK) {
						className = inputDialog.getValue();
					}
					if (className == null || className.length() == 0) {
						return Status.CANCEL_STATUS;
					}
					
					Class newClass = null;
					// prompt for base class and create generalization
					Class baseClass = (Class) DialogLaunchUtil.chooseElement(
							new java.lang.Class[] { Class.class }, selectedPackage.eResource()
									.getResourceSet(), activePart.getSite().getShell());
					if (baseClass != null) {
						newClass = selectedPackage.createOwnedClass(className, false);
						
						// create new generalization
						newClass.getGenerals().clear();
						newClass.createGeneralization(baseClass);
					}
					else {
						return Status.CANCEL_STATUS;
					}

					SubclassHandler subclassHandler = new SubclassHandler(
							activePart.getSite().getShell(), newClass,
							getContentProvider(), getLabelProvider());
					int resultStatus = subclassHandler.openSubclassDialog();
					if (Dialog.OK != resultStatus) {
						// can't figure out how to rollback operation transaction if canceled, so destroy here
						newClass.destroy();
						return Status.CANCEL_STATUS;
					}
					
					//TODO this does not select in CommonNavigator.  maybe need a refresh first?
					if (activePart instanceof ISetSelectionTarget) {
						((ISetSelectionTarget)activePart).selectReveal(new StructuredSelection(newClass));
					}
					
			        return Status.OK_STATUS;
			    }};

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
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
		selectedPackage = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View)selected).getElement();
			}
			
			if (selected instanceof Package) {
				selectedPackage = (Package) selected;
			}
		}
		
		if (selectedPackage != null &&
				CDAProfileUtil.getAppliedCDAProfile(selectedPackage) != null) {
			action.setEnabled(true);
		}
		else {
			action.setEnabled(false);
		}
	}

	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection)
				.iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = (View) ((IAdaptable) element)
					.getAdapter(View.class);

			if (view != null) {
				return view;
			}
		}
		
		return null;
	}

	protected SubclassEditorViewContentProvider getContentProvider() {
		return new TemplateEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new TemplateEditorViewLabelProvider();
	}
}
