package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AssignConformanceRuleIdsAction implements IObjectActionDelegate {
	
	protected IWorkbenchPart activePart;
	protected ISelection currentSelection;
	protected Element selectedElement;
	
	private String rulePrefix = "CONF-";
	private int lastId = 0;
	
	public AssignConformanceRuleIdsAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Remove Validation Messages") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
			    	
			    	findRulePrefix();
			    	findLastId();
			    	assignConformanceRuleIds(selectedElement);
					
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
		selectedElement = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View)selected).getElement();
			}
			
			if (selected instanceof Element) {
				selectedElement = (Element) selected;
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

	private void assignConformanceRuleIds(Element element) {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
				Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				public Object caseAssociation(Association association) {
					setRuleId(association);
					return association;
				}

//				public Object caseClass(Class umlClass) {
//					setRuleId(umlClass);
//					return umlClass;
//				}

				public Object caseProperty(Property property) {
					setRuleId(property);
					
					Association association = property.getAssociation();
					if (association != null) {
						setRuleId(association);
					}
					
					return property;
				}
				
				public Object caseGeneralization(Generalization generalization) {
//					if (!CDAModelUtil.hasValidationSupport(generalization.getSpecific())) {
//						CDAProfileUtil.applyCDAStereotype(generalization.getSpecific(), ICDAProfileConstants.CDA_TEMPLATE);
//						setRuleId(generalization.getSpecific());
//					}

					// only succeeds if ConformsTo has been applied
					setRuleId(generalization);
					
					return generalization;
				}
				
				public Object caseConstraint(Constraint constraint) {
					if (!CDAModelUtil.hasValidationSupport(constraint)) {
						CDAProfileUtil.applyCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
					}
					setRuleId(constraint);
					return constraint;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}

	private void findRulePrefix() {
		String prefix = CDAModelUtil.getModelPrefix(selectedElement);
		if (prefix != null) {
			rulePrefix = "CONF-" + prefix + "-";
		}
	}
	
	private void findLastId() {
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
				Collections.singletonList(UMLUtil.getTopPackage(selectedElement)));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();
			
			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
				public Object caseElement(Element element) {
					for (String ruleId : CDAModelUtil.getConformanceRuleIdList(element)) {
						int lastDash = ruleId.lastIndexOf("-");
						try {
							int ruleNumber = Integer.parseInt(ruleId.substring(lastDash+1));
							if (ruleNumber > lastId) {
								lastId = ruleNumber;
							}
						}
						catch (NumberFormatException e) {
							// ignore ill-formed ids.
						}
					}
					return element;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}
	
	private void setRuleId(Element element) {
		if (CDAModelUtil.hasValidationSupport(element)
				&& CDAModelUtil.getConformanceRuleIdList(element).isEmpty()) {
			String ruleId = rulePrefix + ++lastId;
			CDAModelUtil.setValidationRuleId(element, ruleId);
		}
	}
}
