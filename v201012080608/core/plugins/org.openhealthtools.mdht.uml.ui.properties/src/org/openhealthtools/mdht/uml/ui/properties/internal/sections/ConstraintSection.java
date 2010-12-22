/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.ui.properties.internal.Logger;

/**
 * The profile properties section for UML constraints.
 */
public class ConstraintSection extends AbstractModelerPropertySection {

	protected static final OCL EOCL_ENV = OCL.newInstance();
	
	private Constraint constraint;
	
	private String[] languages = {"Analysis", "OCL", "XPath"};

	private CCombo languageCombo;
	private boolean languageModified = false;
	private CLabel currentLanguagesLabel;
	private Text bodyText;
	private boolean bodyModified = false;

    private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (bodyText == event.getSource()) {
				bodyModified = true;
			}
		}
	};

	private KeyListener keyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// do nothing
		}

		public void keyReleased(KeyEvent e) {
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character)
				modifyFields();
		}
	};
	
	private FocusListener focusListener = new FocusListener() {
		public void focusGained(FocusEvent e) {
			// do nothing
		}

		public void focusLost(FocusEvent event) {
			modifyFields();
		}
	};
	
	private void validateOCL() {

		EPackage ePackage = null;

		OCL.Helper helper = EOCL_ENV.createOCLHelper();

		String ocl = bodyText.getText().trim();

		for (org.eclipse.uml2.uml.Package p : constraint.allOwningPackages()) {

			if (p.getAppliedStereotype("CDA::CodegenSupport") != null) {

				Stereotype s = p.getAppliedStereotype("CDA::CodegenSupport");

				String nsuri = (String) p.getValue(s, "nsURI");

				if (EPackage.Registry.INSTANCE.containsKey(nsuri)) {

					ePackage = EPackage.Registry.INSTANCE.getEPackage(nsuri);
					break;
				}

			}

		}

		if (constraint.getOwner() instanceof NamedElement) {

			String name = ((NamedElement) constraint.getOwner()).getName();

			if ((ePackage != null) && (ePackage.getEClassifier(name) != null)) {

				helper.setContext(ePackage.getEClassifier(name));

				try {

					helper.createInvariant(ocl);

				} catch (ParserException pe) {

					Shell shell = new Shell();
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING);
					messageBox.setText("OCL Error ");
					messageBox.setMessage(pe.getMessage());
					messageBox.open();

				}

			}
		}

	}
	
	private void modifyFields() {
		if (!(bodyModified || languageModified)) {
			return;
		}
		
		
		if (languageCombo.getSelectionIndex() == 1) {
			validateOCL();
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(constraint);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					int languageIndex = languageCombo.getSelectionIndex();
					if (languageIndex == -1) {
						languageIndex = 0;	// default to Analysis
					}
					String language = languages[languageIndex];
					String body = bodyText.getText().trim();

					if (bodyModified) {
						bodyModified = false;
						this.setLabel("Set Constraint Body");

						ValueSpecification spec = constraint.getSpecification();
						if (spec == null) {
							spec = constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
						}
						if (spec instanceof OpaqueExpression) {
							int specIndex = -1;
							for (int i=0; i<((OpaqueExpression) spec).getLanguages().size(); i++) {
								String lang = ((OpaqueExpression) spec).getLanguages().get(i);
								if (language.equals(lang)) {
									specIndex = i;
								}
							}
							if (specIndex >= 0) {
								if (body.length() == 0) {
									// remove language and body from specification
									((OpaqueExpression) spec).getLanguages().remove(specIndex);
									((OpaqueExpression) spec).getBodies().remove(specIndex);
								}
								else {
									((OpaqueExpression) spec).getBodies().set(specIndex, body);
								}
							}
							else if (body.length() > 0) {
								// create new specification entry
								((OpaqueExpression) spec).getLanguages().add(language);
								((OpaqueExpression) spec).getBodies().add(body);
							}
						}
					}
					else {
						return Status.CANCEL_STATUS;
					}
					
					refresh();
			        return Status.OK_STATUS;
			    }};

		    try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
		        commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), getPart());
		        
		    } catch (ExecutionException ee) {
		        Logger.logException(ee);
		    }
		    
		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}
	
	 
	public void createControls(final Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		 Shell shell = new Shell();
		
        GC gc = new GC(shell);
        gc.setFont(shell.getFont());
        Point point = gc.textExtent("");//$NON-NLS-1$
        int charHeight = point.y;
        gc.dispose();
        shell.dispose();

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		/* ---- language combo ---- */
		languageCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
		languageCombo.setItems(languages);
		languageCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				refresh();
			}
			public void widgetSelected(SelectionEvent e) {
				refresh();
			}
		});

		CLabel languageLabel = getWidgetFactory()
				.createCLabel(composite, "Language:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		languageLabel.setLayoutData(data);

		data = new FormData();
        data.left = new FormAttachment(languageLabel, 0);
		data.top = new FormAttachment(0,4);
		languageCombo.setLayoutData(data);

		CLabel assignedLabel = getWidgetFactory()
				.createCLabel(composite, "Assigned Expressions:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(languageCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		assignedLabel.setLayoutData(data);
		
		currentLanguagesLabel = getWidgetFactory()
				.createCLabel(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(assignedLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		currentLanguagesLabel.setLayoutData(data);

		/* ---- body text ---- */
		bodyText = getWidgetFactory().createText(composite, "", 
				SWT.V_SCROLL | SWT.WRAP); //$NON-NLS-1$
		CLabel bodyLabel = getWidgetFactory()
				.createCLabel(composite, "Body:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(languageCombo, 0, SWT.BOTTOM);
		bodyLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(bodyLabel, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(100, 0);
		// if I set the top AND height, then I get vertical scroll within the tab page
		data.top = new FormAttachment(languageCombo, 0, SWT.BOTTOM);
		data.height = charHeight * 4;
		bodyText.setLayoutData(data);

	}

	protected boolean isReadOnly() {
		if (constraint != null) {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(constraint);
			if (editingDomain != null && editingDomain.isReadOnly(constraint.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Constraint);
		this.constraint = (Constraint) element;
	}

	public void dispose() {
		super.dispose();

	}

	public void refresh() {
		int languageIndex = languageCombo.getSelectionIndex();
		if (languageIndex == -1) {
			languageIndex = 0;	// default to Analysis
		}
		String language = languages[languageIndex];
		String languagesList = "";
		String body = null;
		
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			for (int i=0; i<((OpaqueExpression) spec).getLanguages().size(); i++) {
				String lang = ((OpaqueExpression) spec).getLanguages().get(i);
				if (languagesList.length() > 0) {
					languagesList += ", ";
				}
				languagesList += lang;

				// find first body with this language, if any
				if (language.equals(lang)) {
					body = ((OpaqueExpression) spec).getBodies().get(i);
				}
			}
		}
		
		languageCombo.select(languageIndex);

		currentLanguagesLabel.setText(languagesList);

		bodyText.removeModifyListener(modifyListener);
		bodyText.removeKeyListener(keyListener);
		bodyText.removeFocusListener(focusListener);
		bodyText.setText(body!=null ? body : "");
		bodyText.addModifyListener(modifyListener);
		bodyText.addKeyListener(keyListener);
		bodyText.addFocusListener(focusListener);

		if (isReadOnly()) {
			languageCombo.setEnabled(false);
			bodyText.setEnabled(false);
		}
		else {
			languageCombo.setEnabled(true);
			bodyText.setEnabled(true);
		}

	}

	/**
	 * Update if necessary, upon receiving the model event.
	 * 
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification -
	 *            even notification
	 * @param element -
	 *            element that has changed
	 */
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && constraint.eResource() != null)
						refresh();
				}
			});
		}
	}

}
