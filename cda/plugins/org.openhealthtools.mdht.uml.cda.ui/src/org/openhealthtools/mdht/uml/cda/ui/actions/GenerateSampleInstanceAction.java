package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.io.PrintWriter;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;

public class GenerateSampleInstanceAction implements IObjectActionDelegate {
	
	protected IWorkbenchPart activePart;
	protected ISelection currentSelection;
	protected Class selectedElement;
	
	public GenerateSampleInstanceAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
    	createInstance();
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
		selectedElement = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View)selected).getElement();
			}
			
			if (selected instanceof Class) {
				selectedElement = (Class) selected;
			}
		}
		
		if (selectedElement != null &&
				CDAProfileUtil.getAppliedCDAProfile(selectedElement) != null) {
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
	
	private void createInstance() {
		InstanceGenerator generator = new InstanceGenerator();
		EObject instance = generator.createInstance(selectedElement, 5);
		
		PrintWriter writer = new PrintWriter(System.out);
		generator.save(instance, writer);
		writer.close();
	}

}
