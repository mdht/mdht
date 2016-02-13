/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *                        - use UML binding for OCL to check constraints, and handle query constraints (artf3317)
 *                        - implement handling of live validation roll-back (artf3318)
 *     Sarp Kaya (NEHTA) - DITA Mode
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.ui.properties.internal.UmlUiEditor;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.mdht.uml.validation.ocl.EcoreProfileEnvironment;
import org.eclipse.mdht.uml.validation.ocl.EcoreProfileEnvironmentFactory;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.uml.OCL;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * The profile properties section for UML constraints.
 */
public class ConstraintSection extends WrapperAwareModelerPropertySection {

	public Constraint constraint;

	// protected String[] languages = { "Analysis", "OCL", "Java", "XPath", "StrucText" };

	public CCombo languageCombo;

	private boolean languageModified = false;

	private boolean ditaModified = false;

	private Button closeErrorTextButton;

	private Text errorText;

	private Button ditaEnableButton;

	private CLabel currentLanguagesLabel;

	protected Text bodyText;

	public boolean bodyModified = false;

	private List<String> languages = new ArrayList<String>();

	private Map<String, ConstraintEditor> contributors = new LinkedHashMap<>(); // Better to keep the order

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
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character) {
				modifyFields();
			}
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
		if (constraint.getContext() instanceof Classifier) {
			ResourceSet rset = constraint.eResource().getResourceSet();
			OCL oclEnv = OCL.newInstance(new EcoreProfileEnvironmentFactory(rset));
			OCL.Helper helper = oclEnv.createOCLHelper();

			String ocl = bodyText.getText().trim();

			helper.setContext((Classifier) constraint.getContext());

			try {
				if (EcoreProfileEnvironment.isQueryConstraint(constraint)) {
					helper.createQuery(ocl);
				} else {
					helper.createInvariant(ocl);
				}
			} catch (ParserException pe) {
				Shell shell = new Shell();
				MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING);
				messageBox.setText("OCL Error ");
				messageBox.setMessage(pe.getMessage());
				messageBox.open();
			} finally {
				oclEnv.dispose();
			}
		}
	}

	private static String T1 = "ConstraintValidation";

	public void modifyFields() {
		if (!(bodyModified || languageModified || ditaModified)) {
			return;
		}

		if (languageCombo.getSelectionIndex() == 1) {
			validateOCL();
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(constraint);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					int languageIndex = languageCombo.getSelectionIndex();
					if (languageIndex == -1) {
						languageIndex = 0; // default to Analysis
					}
					String language = languages.get(languageIndex);
					String body = bodyText.getText().trim();

					ValueSpecification spec = constraint.getSpecification();
					if (spec == null) {
						spec = constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
					}
					if (spec instanceof OpaqueExpression) {
						OpaqueExpression oESpec = (OpaqueExpression) spec;
						if (bodyModified) {
							bodyModified = false;
							this.setLabel("Set Constraint Body");

							int specIndex = -1;
							for (int i = 0; i < oESpec.getLanguages().size(); i++) {
								String lang = oESpec.getLanguages().get(i);
								if (language.equals(lang)) {
									specIndex = i;
								}
							}
							if (specIndex >= 0) {
								if (body.length() == 0) {
									// remove language and body from specification
									oESpec.getLanguages().remove(specIndex);
									oESpec.getBodies().remove(specIndex);
								} else {
									oESpec.getBodies().set(specIndex, body);
								}
							} else if (body.length() > 0) {
								// create new specification entry
								oESpec.getLanguages().add(language);
								oESpec.getBodies().add(body);
							}
						}
						if (ditaModified) {
							ditaModified = false;
							contributors.get(language).setDitaEnabled(ditaEnableButton.getSelection());

							// Also don't show errors if they are visible
							if (!ditaEnableButton.getSelection()) {
								errorText.setVisible(false);
								closeErrorTextButton.setVisible(false);
							}
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					refresh();
					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void loadUIExtensions() throws CoreException {

		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint("org.eclipse.mdht.uml.ui.properties.ConstraintEditor");
		IExtension[] extensions = ep.getExtensions();

		for (int i = 0; i < extensions.length; i++) {
			IExtension ext = extensions[i];
			IConfigurationElement[] ce = ext.getConfigurationElements();
			for (int j = 0; j < ce.length; j++) {
				String language = ce[j].getAttribute("language");
				ConstraintEditor newContributor = (ConstraintEditor) ce[j].createExecutableExtension("component");
				ConstraintEditor previousContributor = contributors.get(language);
				// Check if the previous one is not locally implemented one
				if (!(previousContributor instanceof UmlUiEditor)) {
					if (previousContributor == null) {
						languages.add(language);
						contributors.put(language, newContributor);
					} // Don't do anything when previous is not locally implemented one
				} else {
					contributors.put(language, newContributor);
				}
			}
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		try {
			loadUIExtensions();
		} catch (CoreException e1) {

		}

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
		languageCombo.setItems(languages.toArray(new String[1]));
		languageCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				refresh();
			}

			public void widgetSelected(SelectionEvent e) {
				refresh();
			}
		});

		CLabel languageLabel = getWidgetFactory().createCLabel(composite, "Language:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		languageLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(languageLabel, 0);
		data.top = new FormAttachment(0, 4);
		languageCombo.setLayoutData(data);

		CLabel assignedLabel = getWidgetFactory().createCLabel(composite, "Assigned Expressions:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(languageCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		assignedLabel.setLayoutData(data);

		currentLanguagesLabel = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(assignedLabel, 0);
		// data.right = new FormAttachment(10, 0);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		currentLanguagesLabel.setLayoutData(data);

		/* ---- Dita Enable checkbox ---- */
		ditaEnableButton = getWidgetFactory().createButton(composite, "Enable DITA", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(currentLanguagesLabel, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(languageCombo, 0, SWT.CENTER);
		ditaEnableButton.setLayoutData(data);
		ditaEnableButton.setEnabled(true);
		ditaEnableButton.setVisible(false);

		ditaEnableButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				ditaModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				ditaModified = true;
				modifyFields();
			}
		});

		/*
		 * ---- body text ----
		 */
		bodyText = getWidgetFactory().createText(composite, "", SWT.V_SCROLL | SWT.WRAP);

		for (ConstraintEditor ce : contributors.values()) {
			ce.setText(bodyText);
		}

		CLabel bodyLabel = getWidgetFactory().createCLabel(composite, "Body:"); //$NON-NLS-1$
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

		errorText = getWidgetFactory().createText(composite, "Error message here", SWT.V_SCROLL | SWT.WRAP);
		data = new FormData();
		data.left = new FormAttachment(bodyLabel, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(85, 0);
		// if I set the top AND height, then I get vertical scroll within the tab page
		data.top = new FormAttachment(bodyText, 0, SWT.BOTTOM);
		data.height = charHeight * 2;
		errorText.setLayoutData(data);
		errorText.setEnabled(false);
		errorText.setVisible(false);

		/* ---- Error close button ---- */
		closeErrorTextButton = getWidgetFactory().createButton(composite, "Close DITA Error", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(errorText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(errorText, 0, SWT.CENTER);
		closeErrorTextButton.setLayoutData(data);
		closeErrorTextButton.setEnabled(true);
		closeErrorTextButton.setVisible(false);
		closeErrorTextButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				closeErrorTextButton.setVisible(false);
				errorText.setVisible(false);
			}
		});

		for (ConstraintEditor ce : contributors.values()) {
			ce.setCloseErrorText(closeErrorTextButton);
			ce.setErrorText(errorText);
		}

	}

	@Override
	protected boolean isReadOnly() {
		if (constraint != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(constraint);
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
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Constraint);
		this.constraint = (Constraint) element;

		initializeLanguageSelection();
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	private void initializeLanguageSelection() {
		final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression)
				? (OpaqueExpression) constraint.getSpecification()
				: null;

		int currentIndex = languageCombo.getSelectionIndex();
		String currentLanguage = currentIndex == -1
				? ""
				: languageCombo.getItem(currentIndex);

		int languageIndex = currentIndex == -1
				? 0
				: currentIndex;

		if (spec != null) {
			// final List<String> knownLangs = Arrays.asList(languages);
			final List<String> specLangs = spec.getLanguages();
			final List<String> specBodies = spec.getBodies();

			if (!specLangs.contains(currentLanguage)) {
				for (int i = 0; (i < specBodies.size()) && (i < specLangs.size()); i++) {
					if (!UML2Util.isEmpty(specBodies.get(i)) && languages.contains(specLangs.get(i))) {
						languageIndex = languages.indexOf(specLangs.get(i));
						break;
					}
				}
			}
		}

		languageCombo.select(languageIndex);
	}

	@Override
	public void refresh() {
		for (ConstraintEditor ce : contributors.values()) {
			ce.setConstraint(constraint);
		}
		final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression)
				? (OpaqueExpression) constraint.getSpecification()
				: null;
		String language = null;
		String body = null;

		int languageIndex = languageCombo.getSelectionIndex();
		if (languageIndex == -1) {
			languageIndex = 0; // default to the first language for which we have a body, else Analysis

			if (spec != null) {
				// final List<String> knownLangs = Arrays.asList(languages);
				final List<String> specLangs = spec.getLanguages();
				final List<String> specBodies = spec.getBodies();
				for (int i = 0; (i < specBodies.size()) && (i < specLangs.size()); i++) {
					if (!UML2Util.isEmpty(specBodies.get(i)) && languages.contains(specLangs.get(i))) {
						languageIndex = languages.indexOf(specLangs.get(i));
						body = specBodies.get(i);
						break;
					}
				}
			}
		}
		language = languages.get(languageIndex);

		StringBuilder languagesList = new StringBuilder();

		if (spec != null) {
			for (int i = 0; i < spec.getLanguages().size(); i++) {
				String lang = spec.getLanguages().get(i);
				if (languagesList.length() > 0) {
					languagesList.append(", ");
				}
				languagesList.append(lang);

				// find first body with this language, if any
				if (language.equals(lang)) {
					body = spec.getBodies().get(i);
				}
			}
		}

		languageCombo.select(languageIndex);

		currentLanguagesLabel.setText(languagesList.toString());

		bodyText.removeModifyListener(modifyListener);
		bodyText.removeKeyListener(keyListener);
		bodyText.removeFocusListener(focusListener);
		bodyText.setText(body != null
				? body
				: "");
		bodyText.addModifyListener(modifyListener);
		bodyText.addKeyListener(keyListener);
		bodyText.addFocusListener(focusListener);

		if (isReadOnly()) {
			languageCombo.setEnabled(false);
			bodyText.setEnabled(false);
		} else {
			languageCombo.setEnabled(true);
			bodyText.setEnabled(true);
		}
		if ("Analysis".equals(languageCombo.getText())) {
			ditaEnableButton.setSelection(contributors.get(language).isDitaEnabled());
			ditaEnableButton.setVisible(true);
		} else {
			ditaEnableButton.setVisible(false);
		}

	}

	/**
	 * Update if necessary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            -
	 *            even notification
	 * @param element
	 *            -
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && constraint.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

}
