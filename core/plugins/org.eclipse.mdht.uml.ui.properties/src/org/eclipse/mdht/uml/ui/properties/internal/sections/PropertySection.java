/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adjusting alignmnent of field labels
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *                        - implement handling of live validation roll-back (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.PropertyTypeFilter;
import org.eclipse.mdht.uml.common.ui.search.StereotypePropertyTypeFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The general properties section for Property.
 *
 * $Id: $
 */
public class PropertySection extends WrapperAwareModelerPropertySection {

	private Property property;

	private CLabel typeName;

	private Button typeButton;

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

	private List<Property> inheritedProperties;

	private List<Property> inheritedCollectionProperties;

	private CCombo redefinesCombo;

	private boolean redefinesModified = false;

	private CCombo subsetsCombo;

	private boolean subsetsModified = false;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
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
		if (!(multiplicityModified || aggregationModified || isDerivedModified || isReadOnlyModified ||
				isUniqueModified || isOrderedModified || redefinesModified || subsetsModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (multiplicityModified) {
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
					} else if (redefinesModified) {
						redefinesModified = false;
						property.getRedefinedProperties().clear();
						if (redefinesCombo.getSelectionIndex() > 0) {
							Property redefined = inheritedProperties.get(redefinesCombo.getSelectionIndex() - 1);
							property.getRedefinedProperties().add(redefined);

							property.getSubsettedProperties().clear();
							subsetsCombo.select(0);
						}
					} else if (subsetsModified) {
						subsetsModified = false;
						property.getSubsettedProperties().clear();
						if (subsetsCombo.getSelectionIndex() > 0) {
							Property subsetted = inheritedCollectionProperties.get(
								subsetsCombo.getSelectionIndex() - 1);
							property.getSubsettedProperties().add(subsetted);

							property.getRedefinedProperties().clear();
							redefinesCombo.select(0);
						}
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void openPropertyTypeDialog(final Property property) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);
		Package topPackage = UMLUtil.getTopPackage(property);
		NamedElement type = null;

		if (topPackage instanceof Profile) {
			if (property.getAssociation() instanceof Extension) {
				type = DialogLaunchUtil.chooseUMLMetaclass(
					editingDomain.getResourceSet(), getPart().getSite().getShell());
			} else if (property.getClass_() instanceof Stereotype) {
				type = DialogLaunchUtil.chooseElement(
					new StereotypePropertyTypeFilter(), topPackage, getPart().getSite().getShell());
			} else {
				type = DialogLaunchUtil.chooseElement(
					new PropertyTypeFilter(), topPackage, getPart().getSite().getShell());
			}
		} else {
			// TODO refine selection for redefined properties to include only subtypes.
			// type = DialogLaunchUtil.chooseElement(
			// new PropertyTypeFilter(), editingDomain.getResourceSet(), getPart().getSite().getShell());
			type = DialogLaunchUtil.chooseElement(new PropertyTypeFilter(), topPackage, getPart().getSite().getShell());
		}

		if (type instanceof Classifier) {
			final Classifier classifier = (Classifier) type;
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Set Type") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					property.setType(classifier);

					if (property.getAssociation() instanceof Extension && classifier instanceof Class) {
						Class metaclass = (Class) classifier;
						Profile profile = (Profile) property.getAssociation().getPackage();

						// assure that metaclass is imported
						if (!profile.getReferencedMetaclasses().contains(metaclass) &&
								!profile.getReferencedMetamodels().contains(metaclass.getModel())) {
							profile.createMetaclassReference(metaclass);
						}
					}

					// refresh children, cause change notification to be sent
					Class owner = property.getClass_();
					int position = owner.getOwnedAttributes().lastIndexOf(property);
					owner.getOwnedAttributes().remove(property);
					owner.getOwnedAttributes().add(position, property);

					return Status.OK_STATUS;
				}
			};

			execute(operation);
		}
	}

	private void computeInheritedProperties() {
		inheritedProperties = new ArrayList<Property>();
		inheritedCollectionProperties = new ArrayList<Property>();
		if (property.getClass_() != null) {
			for (Classifier parent : property.getClass_().allParents()) {
				for (Property inherited : ((Class) parent).getOwnedAttributes()) {
					inheritedProperties.add(inherited);
					if (inherited.upperBound() > 1 || inherited.upperBound() == -1) {
						inheritedCollectionProperties.add(inherited);
					}
				}
			}
		}

	}

	private void fillInheritedPropertiesCombo(CCombo propertiesCombo, List<Property> properties) {
		propertiesCombo.removeAll();
		List<String> items = new ArrayList<String>();
		items.add("");

		for (Property inherited : properties) {
			items.add(UMLUtil.getPackageQualifiedName(inherited));
		}

		propertiesCombo.setItems(items.toArray(new String[items.size()]));
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
		aggregationCombo.setItems(
			new String[] {
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
		data.top = new FormAttachment(1, 3, ITabbedPropertyConstants.VSPACE + 2);
		aggregationCombo.setLayoutData(data);

		/* ---- Redefines combo ---- */
		CLabel redefinesLabel = getWidgetFactory().createCLabel(composite, "Redefines:"); //$NON-NLS-1$
		redefinesCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		redefinesCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				redefinesModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				redefinesModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(2, 3, ITabbedPropertyConstants.VSPACE + 2);
		redefinesLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(redefinesLabel, 5);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(2, 3, ITabbedPropertyConstants.VSPACE + 2);
		redefinesCombo.setLayoutData(data);

		/* ---- Subsets combo ---- */
		CLabel subsetsLabel = getWidgetFactory().createCLabel(composite, "Subsets:"); //$NON-NLS-1$
		subsetsCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		subsetsCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				subsetsModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				subsetsModified = true;
				modifyFields();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(redefinesCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(2, 3, ITabbedPropertyConstants.VSPACE + 2);
		subsetsLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(subsetsLabel, 5);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(2, 3, ITabbedPropertyConstants.VSPACE + 2);
		subsetsCombo.setLayoutData(data);

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

		if (element instanceof Association) {
			element = UMLUtil.getNavigableEnd((Association) element);
		}

		if (element instanceof Property) {
			this.property = (Property) element;
		} else {
			this.property = null;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		property = null;
	}

	@Override
	public void refresh() {
		if (property == null) {
			return;
		}

		if (property.getType() != null && property.getType().getName() != null) {
			typeName.setText(property.getType().getQualifiedName());
		} else {
			typeName.setText("");
		}

		multiplicityCombo.setText(displayMultiplicity(property));
		aggregationCombo.setText(property.getAggregation().getName());
		isDerived.setSelection(property.isDerived());
		isReadOnly.setSelection(property.isReadOnly());
		isUnique.setSelection(property.isUnique());
		isOrdered.setSelection(property.isOrdered());

		computeInheritedProperties();
		fillInheritedPropertiesCombo(redefinesCombo, inheritedProperties);
		fillInheritedPropertiesCombo(subsetsCombo, inheritedCollectionProperties);
		redefinesCombo.select(0);
		subsetsCombo.select(0);

		if (property.getRedefinedProperties().size() == 1) {
			Property redefined = property.getRedefinedProperties().get(0);
			int index = inheritedProperties.indexOf(redefined);
			if (index >= 0) {
				redefinesCombo.select(index + 1);
			}
		}

		if (property.getSubsettedProperties().size() == 1) {
			Property subsetted = property.getSubsettedProperties().get(0);
			int index = inheritedCollectionProperties.indexOf(subsetted);
			if (index >= 0) {
				subsetsCombo.select(index + 1);
			}
		}

		if (isReadOnly()) {
			isDerived.setEnabled(false);
			isReadOnly.setEnabled(false);
			isUnique.setEnabled(false);
			isOrdered.setEnabled(false);
			typeButton.setEnabled(false);
			multiplicityCombo.setEnabled(false);
			aggregationCombo.setEnabled(false);
			redefinesCombo.setEnabled(false);
			subsetsCombo.setEnabled(false);
		} else {
			isDerived.setEnabled(true);
			isReadOnly.setEnabled(true);
			isUnique.setEnabled(true);
			isOrdered.setEnabled(true);
			typeButton.setEnabled(true);
			multiplicityCombo.setEnabled(true);
			aggregationCombo.setEnabled(true);
			redefinesCombo.setEnabled(true);
			subsetsCombo.setEnabled(true);
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
