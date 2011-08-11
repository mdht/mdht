/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adjusting alignmnent of field labels
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.properties.internal.sections;

import java.util.StringTokenizer;

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
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.ui.properties.internal.Logger;

/**
 * The general properties section for Property.
 * 
 * $Id: $
 */
public class PropertySection extends AbstractModelerPropertySection {

	private Property property;

	private CLabel typeName;

	private Button typeButton;

	private Text defaultValueText;

	private boolean defaultValueModified = false;

	private CCombo multiplicityCombo;

	private boolean multiplicityModified = false;

	private CCombo aggregationCombo;

	private boolean aggregationModified = false;

	private Button isDerived;

	private boolean isDerivedModified = false;

	private Button isReadOnly;

	private boolean isReadOnlyModified = false;

	private Button isOrdered;

	private boolean isOrderedModified = false;

	private Button isUnique;

	private boolean isUniqueModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (defaultValueText == event.getSource()) {
				defaultValueModified = true;
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

	private void modifyFields() {
		if (!(defaultValueModified || multiplicityModified || aggregationModified || isDerivedModified ||
				isReadOnlyModified || isUniqueModified || isOrderedModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (defaultValueModified) {
						defaultValueModified = false;
						this.setLabel("Set Default Value");
						if (property.getDefaultValue() != null) {
							property.getDefaultValue().destroy();
						}
						String newValue = defaultValueText.getText();
						if (newValue != null && newValue.trim().length() > 0) {
							// TODO check property type and create appropriate literal type
							LiteralString literal = UMLFactory.eINSTANCE.createLiteralString();
							literal.setValue(newValue);
							property.setDefaultValue(literal);
						}
					} else if (multiplicityModified) {
						multiplicityModified = false;
						this.setLabel("Set Multiplicity");
						try {
							setMultiplicity(property, multiplicityCombo.getText());

						} catch (IllegalArgumentException e) {
							return Status.CANCEL_STATUS;
						}
					} else if (aggregationModified) {
						aggregationModified = false;
						this.setLabel("Set Aggregation");
						try {
							property.setAggregation(AggregationKind.get(aggregationCombo.getText()));

						} catch (IllegalArgumentException e) {
							return Status.CANCEL_STATUS;
						}
					} else if (isDerivedModified) {
						isDerivedModified = false;
						this.setLabel("Set Derived");
						property.setIsDerived(isDerived.getSelection());
					} else if (isReadOnlyModified) {
						isReadOnlyModified = false;
						this.setLabel("Set ReadOnly");
						property.setIsReadOnly(isReadOnly.getSelection());
					} else if (isUniqueModified) {
						isUniqueModified = false;
						this.setLabel("Set Unique");
						property.setIsUnique(isUnique.getSelection());
					} else if (isOrderedModified) {
						isOrderedModified = false;
						this.setLabel("Set Ordered");
						property.setIsOrdered(isOrdered.getSelection());
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

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

	private void openPropertyTypeDialog(final Property property) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

		final NamedElement type = DialogLaunchUtil.chooseElement(
			new java.lang.Class[] { org.eclipse.uml2.uml.Class.class, DataType.class }, editingDomain.getResourceSet(),
			getPart().getSite().getShell());

		if (type != null) {
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Set Type") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					property.setType((Classifier) type);

					// refresh children, cause change notification to be sent
					Class owner = property.getClass_();
					int position = owner.getOwnedAttributes().lastIndexOf(property);
					owner.getOwnedAttributes().remove(property);
					owner.getOwnedAttributes().add(position, property);

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), getPart());

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();

		CLabel typeLabel = getWidgetFactory().createCLabel(composite, "Type:"); //$NON-NLS-1$
		typeName = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		typeButton = getWidgetFactory().createButton(composite, "Select Type...", SWT.PUSH); //$NON-NLS-1$
		typeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				openPropertyTypeDialog(property);
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(typeName, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		typeLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(typeButton, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		typeName.setLayoutData(data);

		data = new FormData();
		data.right = new FormAttachment(80, 0);
		data.top = new FormAttachment(0, 0);
		data.height = buttonHeight;
		typeButton.setLayoutData(data);

		/* ---- Multiplicity combo ---- */
		CLabel multiplicityLabel = getWidgetFactory().createCLabel(composite, "Multiplicity:"); //$NON-NLS-1$
		multiplicityCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		multiplicityCombo.setItems(new String[] { "*", "0..1", "1", "1..*" });
		multiplicityCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				multiplicityModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				multiplicityModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(typeButton, ITabbedPropertyConstants.HSPACE);
		data.right = new FormAttachment(multiplicityCombo, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0);
		multiplicityLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(typeButton, STANDARD_LABEL_WIDTH + 5);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		multiplicityCombo.setLayoutData(data);

		/* ------------------------------- */
		defaultValueText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		// TODO figure out how to set correct wider label width
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH + 20);
		data.right = new FormAttachment(70, 0);
		data.top = new FormAttachment(1, 3, ITabbedPropertyConstants.VSPACE);
		defaultValueText.setLayoutData(data);

		CLabel defaultValueLabel = getWidgetFactory().createCLabel(composite, "Default Value:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(defaultValueText, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(defaultValueText, 0, SWT.CENTER);
		defaultValueLabel.setLayoutData(data);

		/* ---- Is Derived checkbox ---- */
		isDerived = getWidgetFactory().createButton(composite, "Derived", SWT.CHECK);
		isDerived.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isDerivedModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isDerivedModified = true;
				modifyFields();
			}
		});

		/* ---- Is ReadOnly checkbox ---- */
		isReadOnly = getWidgetFactory().createButton(composite, "Read Only", SWT.CHECK);
		isReadOnly.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isReadOnlyModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isReadOnlyModified = true;
				modifyFields();
			}
		});

		/* ---- Is Unique checkbox ---- */
		isUnique = getWidgetFactory().createButton(composite, "Unique", SWT.CHECK);
		isUnique.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isUniqueModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isUniqueModified = true;
				modifyFields();
			}
		});

		/* ---- Is Ordered checkbox ---- */
		isOrdered = getWidgetFactory().createButton(composite, "Ordered", SWT.CHECK);
		isOrdered.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				isOrderedModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				isOrderedModified = true;
				modifyFields();
			}
		});

		/* ---- Aggregation combo ---- */
		aggregationCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY);
		aggregationCombo.setItems(new String[] {
				AggregationKind.NONE_LITERAL.getName(), AggregationKind.SHARED_LITERAL.getName(),
				AggregationKind.COMPOSITE_LITERAL.getName() });
		aggregationCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				aggregationModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				aggregationModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 5);
		data.top = new FormAttachment(aggregationCombo, 0, SWT.CENTER);
		isDerived.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isDerived, 5);
		data.top = new FormAttachment(aggregationCombo, 0, SWT.CENTER);
		isReadOnly.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isReadOnly, 5);
		data.top = new FormAttachment(aggregationCombo, 0, SWT.CENTER);
		isUnique.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isUnique, 5);
		data.top = new FormAttachment(aggregationCombo, 0, SWT.CENTER);
		isOrdered.setLayoutData(data);

		CLabel aggregationLabel = getWidgetFactory().createCLabel(composite, "Aggregation:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(isOrdered, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(aggregationCombo, 0, SWT.CENTER);
		aggregationLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(isOrdered, STANDARD_LABEL_WIDTH + 5);
		data.top = new FormAttachment(2, 3, ITabbedPropertyConstants.VSPACE + 2);
		aggregationCombo.setLayoutData(data);
	}

	@Override
	protected boolean isReadOnly() {
		if (property != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);
			if (editingDomain != null && editingDomain.isReadOnly(property.eResource())) {
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
		if (element instanceof View) {
			element = ((View) element).getElement();
		}
		Assert.isTrue(element instanceof Property);
		this.property = (Property) element;
	}

	@Override
	public void dispose() {
		super.dispose();
		property = null;
	}

	@Override
	public void refresh() {
		if (property.getType() != null && property.getType().getName() != null) {
			typeName.setText(property.getType().getQualifiedName());
		} else {
			typeName.setText("");
		}

		defaultValueText.removeModifyListener(modifyListener);
		defaultValueText.removeKeyListener(keyListener);
		defaultValueText.removeFocusListener(focusListener);
		if (property.getType() == null) {
			defaultValueText.setEditable(false);
		} else {
			defaultValueText.setEditable(true);
		}

		if (property.getDefaultValue() != null && property.getDefaultValue().stringValue() != null) {
			defaultValueText.setText(property.getDefaultValue().stringValue());
		} else {
			defaultValueText.setText("");
		}
		defaultValueText.addModifyListener(modifyListener);
		defaultValueText.addKeyListener(keyListener);
		defaultValueText.addFocusListener(focusListener);

		multiplicityCombo.setText(displayMultiplicity(property));
		aggregationCombo.setText(property.getAggregation().getName());
		isDerived.setSelection(property.isDerived());
		isReadOnly.setSelection(property.isReadOnly());
		isUnique.setSelection(property.isUnique());
		isOrdered.setSelection(property.isOrdered());

		if (isReadOnly()) {
			isDerived.setEnabled(false);
			isReadOnly.setEnabled(false);
			isUnique.setEnabled(false);
			isOrdered.setEnabled(false);
			typeButton.setEnabled(false);
			multiplicityCombo.setEnabled(false);
			defaultValueText.setEnabled(false);
			aggregationCombo.setEnabled(false);
		} else {
			isDerived.setEnabled(true);
			isReadOnly.setEnabled(true);
			isUnique.setEnabled(true);
			isOrdered.setEnabled(true);
			typeButton.setEnabled(true);
			multiplicityCombo.setEnabled(true);
			defaultValueText.setEnabled(true);
			aggregationCombo.setEnabled(true);
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
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

	/**
	 * Display a multiplicity string of the format [lower..upper], unless
	 * both lower and upper are == 1.
	 * 
	 * @param multElement
	 * @return
	 */
	protected String displayMultiplicity(MultiplicityElement multElement) {
		StringBuffer multDisplay = new StringBuffer();
		multDisplay.append(multElement.getLower());
		multDisplay.append("..");
		multDisplay.append(multElement.getUpper() == -1
				? "*"
				: Integer.toString(multElement.getUpper()));

		return multDisplay.toString();
	}

	/**
	 * Set multiplicity parsed from a string value, e.g. "0..1" or "1..*".
	 * Must be called from within a transaction.
	 */
	private void setMultiplicity(MultiplicityElement multiplicityElement, String value) {
		int lower = 1;
		int upper = 1;

		StringTokenizer stk = new StringTokenizer(value, ". ");
		if (stk.hasMoreTokens()) {
			lower = parseMultiplicityRangeToken(stk.nextToken());
			if (!stk.hasMoreTokens()) {
				if (lower == LiteralUnlimitedNatural.UNLIMITED) {
					lower = 0;
					upper = LiteralUnlimitedNatural.UNLIMITED;
				} else {
					upper = lower;
				}
			} else {
				upper = parseMultiplicityRangeToken(stk.nextToken());
				if (stk.hasMoreTokens()) {
					throw new IllegalArgumentException("illegal range specification: " + value);
				}
			}
		}

		// remove existing values so that we get change notification to update view
		if (multiplicityElement.getLowerValue() != null) {
			multiplicityElement.getLowerValue().destroy();
		}
		if (multiplicityElement.getUpperValue() != null) {
			multiplicityElement.getUpperValue().destroy();
		}

		multiplicityElement.setUpper(upper);
		multiplicityElement.setLower(lower);
	}

	/**
	 * Parse an multiplicity range token; map 'n', '*', or "unbounded" to -1
	 */
	private int parseMultiplicityRangeToken(String token) {
		try {
			if (token.equalsIgnoreCase("n") || token.equals("*") || token.equalsIgnoreCase("unbounded")) {
				return LiteralUnlimitedNatural.UNLIMITED;
			} else {
				return Integer.parseInt(token);
			}
		} catch (Exception ex) {
			throw new IllegalArgumentException("illegal range bound: " + token);
		}
	}

}
