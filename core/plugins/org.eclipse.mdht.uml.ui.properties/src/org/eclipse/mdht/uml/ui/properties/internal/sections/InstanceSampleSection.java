/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;

/**
 * Section that allows to add sample data to classes
 */
public class InstanceSampleSection extends WrapperAwareModelerPropertySection {

	private static final String REMOVE = "Remove ";

	private static final String ADD = "";

	private static final String UMLSAMPLE_ANNOTATION_SOURCE = "UMLSAMPLE";

	protected Element umlElement;

	/**
	 * Map from property paths to their assigned data
	 */
	private Map<String, String> lines = new HashMap<String, String>();

	protected Composite body;

	/**
	 * Set to true whenever the user modifies the current text control
	 */
	private boolean bodyModified;

	private ModifyListener modifyListener = new ModifyListener() {

		public void modifyText(final ModifyEvent event) {
			bodyModified = true;
		}
	};

	private Form form;

	private TabbedPropertySheetPage theTabbedPropertySheetPage;

	/**
	 * Locks the UI from being updated
	 */
	private boolean preventUIUpdate;

	/**
	 * After the user choose to add a sample data item, contains the path to it ..
	 */
	private String focusPath;

	/**
	 * .. in order to focus this control associated to the data item
	 */
	private Control focusControl;

	/**
	 * Updates the given property path with the given value
	 *
	 * @param name
	 *            the propety path
	 * @param value
	 *            if <code>null</code>, removes any sample data located by the property path
	 * @param updateUI
	 */
	private void modifyFields(final String name, final String value, boolean updateUI) {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlElement);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					EAnnotation anno = umlElement.getEAnnotation(UMLSAMPLE_ANNOTATION_SOURCE);
					if (anno == null) {
						anno = EcoreFactory.eINSTANCE.createEAnnotation();
						anno.setSource(UMLSAMPLE_ANNOTATION_SOURCE);
					}
					if (value == null) {
						for (String key : new ArrayList<String>(anno.getDetails().keySet())) {
							if (key.equals(name) || key.startsWith(name + "/")) {
								anno.getDetails().remove(key);
							}
						}
					} else {
						anno.getDetails().put(name, value);
					}
					if (anno.getDetails().isEmpty()) {
						umlElement.getEAnnotations().remove(anno);
					} else {
						umlElement.getEAnnotations().add(anno);
					}
					return Status.OK_STATUS;
				}
			};

			preventUIUpdate = !updateUI;
			try {
				execute(operation);
			} finally {
				preventUIUpdate = false;
			}

			focusPath = name;
		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		this.theTabbedPropertySheetPage = aTabbedPropertySheetPage;
		super.createControls(parent, aTabbedPropertySheetPage);
		form = getWidgetFactory().createForm(parent);

		body = form.getBody();

		TableWrapLayout bodyLayout = new TableWrapLayout();
		bodyLayout.numColumns = 2;
		body.setLayout(bodyLayout);
		refresh();

	}

	/**
	 * Generates the UI for the given class
	 *
	 * @param class1
	 * @param path
	 *            the property path
	 * @param basePath
	 *            the base property path
	 * @param menu
	 *            if <code>null</code>, generates input fields for the given class, other generates UI actions into the menu to add/remove sample data
	 * @param context
	 *            the list of UML classes accordingly to the property path (not including class1)
	 */
	private void addClass(final Class class1, final String path, final String basePath, IMenuManager menu,
			final List<Class> context) {

		List<IAction> actions = new ArrayList<IAction>();
		final List<IAction> addclassactions = new ArrayList<IAction>();
		final List<IAction> actionsRemove = new ArrayList<IAction>();
		for (final Property property : editableAttributes(class1)) {
			Property baseProperty = getBaseProperty(property);
			final String propPath = abbreviate(path + "/" + (property.getType() instanceof DataType
					? "@"
					: "") + property.getName());
			final String propBasePath = abbreviate(basePath + "/" + (property.getType() instanceof DataType
					? "@"
					: "") + baseProperty.getName());

			if (property.getType() instanceof DataType &&
					(getDefaultValue(property) == null || property.getLower() == 0)) {
				final String lastStep = lastStep(indexed(propPath, 1), indexed(propBasePath, 1));
				if (menu != null) {
					if (countModelOccurences(propPath) < upper(property) && !isAlwaysVisible(property, path)) {
						Action action = new Action() {

							@Override
							public void run() {
								modifyFields(indexed(propPath, 1), "", false);
								refresh();
							}

						};
						action.setText(fixMenuText(ADD + lastStep));
						actions.add(action);
					} else if (!isAlwaysVisible(property, path)) {
						Action action = new Action() {

							@Override
							public void run() {
								modifyFields(indexed(propPath, 1), null, false);
								refresh();
							}

						};
						action.setText(fixMenuText(REMOVE + lastStep));
						actionsRemove.add(action);

					}
				}
				if (menu != null) {
					continue;
				}
				if (countModelOccurences(propPath) == 0 && !isAlwaysVisible(property, path)) {
					continue;
				}
				Label label = getWidgetFactory().createLabel(body, propPath.substring(1) + " :", 0);
				label.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
				label.setToolTipText(propBasePath.substring(1));

				MenuManager propmenu = new MenuManager();
				propmenu.setRemoveAllWhenShown(true);
				label.setMenu(propmenu.createContextMenu(label));
				propmenu.addMenuListener(new IMenuListener() {

					@Override
					public void menuAboutToShow(IMenuManager manager) {
						if (!isAlwaysVisible(property, path)) {
							Action action = new Action() {

								@Override
								public void run() {
									modifyFields(indexed(propPath, 1), null, false);
									refresh();
								}

							};
							action.setText(fixMenuText(REMOVE + lastStep));
							manager.add(action);
						}
						if (!"".equals(path)) {
							Action action = new Action() {

								@Override
								public void run() {
									modifyFields(path, null, false);
									refresh();
								}

							};
							action.setText(fixMenuText(REMOVE + lastStep(path, basePath)));
							manager.add(action);
						}
						manager.add(new Separator());

						addClass(class1, path, basePath, manager, context);

						manager.add(new Separator());

						String pathParent = path;
						String basePathParent = basePath;
						for (int parentIndex = context.size() - 1; parentIndex >= 1; parentIndex--) {

							final int fparentIndex = parentIndex;
							final String fpathParent = pathParent = pathParent.substring(
								0, pathParent.lastIndexOf("/"));
							final String fbasePathParent = basePathParent = basePathParent.substring(
								0, basePathParent.lastIndexOf("/"));

							Action action = new Action() {
								@Override
								public void run() {
								}
							};
							action.setText(".. " + lastStep(pathParent, basePathParent));
							manager.add(action);
							action.setMenuCreator(new MenuCreator() {

								@Override
								protected void fillMenu(MenuManager dropDownMenuMgr) {
									System.out.println(context.get(fparentIndex).getName() + " " + fpathParent);
									addClass(
										context.get(fparentIndex), fpathParent, fbasePathParent, dropDownMenuMgr,
										context.subList(0, fparentIndex));
								}

							});
						}
					}

				});

				if (property.getType() instanceof Enumeration ||
						"EBooleanObject".equals(property.getType().getName())) {
					List<String> lits = new ArrayList<String>();
					if (getDefaultValue(property) != null) {
						lits.add(getDefaultValue(property));
					} else if (property.getType() instanceof Enumeration) {
						Enumeration enumeratedType = (Enumeration) property.getType();
						for (EnumerationLiteral lit : enumeratedType.getOwnedLiterals()) {
							lits.add(lit.getName());
						}
					} else {
						lits.add("true");
						lits.add("false");
					}
					lits.add("");
					final Combo combo = new Combo(body, SWT.DROP_DOWN | SWT.READ_ONLY);
					combo.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
					combo.setItems(lits.toArray(new String[] {}));
					if (lines.get(propPath) != null) {
						combo.select(lits.indexOf(lines.get(propPath)));
						// combo.setText(lines.get(propPath));
					}
					combo.addFocusListener(new FocusListener() {

						public void focusGained(FocusEvent e) {
							bodyModified = false;
						}

						public void focusLost(FocusEvent event) {
							if (bodyModified) {
								bodyModified = false;
								modifyFields(propPath, combo.getText(), false);
							}
						}
					});
					combo.addSelectionListener(new SelectionListener() {
						public void widgetDefaultSelected(SelectionEvent e) {
							bodyModified = true;
							modifyFields(propPath, combo.getText(), false);
						}

						public void widgetSelected(SelectionEvent e) {
							bodyModified = true;
							modifyFields(propPath, combo.getText(), false);
						}
					});
					combo.addModifyListener(modifyListener);
					if (indexed(propPath, 1).equals(focusPath)) {
						focusControl = combo;
					}
				} else {
					final Text text = getWidgetFactory().createText(body, "", "any".equals(property.getName())
							? SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL
							: 0);
					text.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
					if (lines.get(propPath) != null) {
						text.setText(lines.get(propPath));
					}

					text.addFocusListener(new FocusListener() {

						public void focusGained(FocusEvent e) {
							bodyModified = false;
						}

						public void focusLost(FocusEvent event) {
							if (bodyModified) {
								bodyModified = false;
								modifyFields(propPath, text.getText(), false);
							}
						}
					});
					text.addModifyListener(modifyListener);
					if (indexed(propPath, 1).equals(focusPath)) {
						focusControl = text;
					}
				}
			}
		}
		for (Property property : editableAttributes(class1)) {
			Property baseProperty = getBaseProperty(property);
			final String propPath = path + "/" + property.getName();
			final String propBasePath = basePath + "/" + baseProperty.getName();
			// if (property.getType() instanceof DataType || property.getType().conformsTo((Type) hl7_datatypes.getPackagedElement("ST"))) {
			// continue;
			// }
			if (!(property.getType() instanceof Class)) {
				continue;
			}

			final Class class2 = (Class) property.getType();
			int addedInstances = countModelOccurences(propPath);
			if (menu == null) {
				// editors for nested content
				for (int index = 1; index <= 9; index++) {
					if (containsPath(indexed(propPath, index))) {
						List<Class> childContext = new ArrayList<Class>(context);
						childContext.add(class1);
						addClass(class2, indexed(propPath, index), indexed(propBasePath, index), menu, childContext);
					}
				}
				continue;
			}
			// allow removal of optional content
			if (addedInstances > property.getLower() || true) {
				for (int index = 1; index <= 9; index++) {
					if (containsPath(indexed(propPath, index))) {

						final int findex = index;
						Action action = new Action() {
							@Override
							public void run() {
								modifyFields(indexed(propPath, findex), null, false);
								refresh();
							}

						};
						String menuItemText = REMOVE + lastStep(indexed(propPath, index), indexed(propBasePath, index));
						action.setText(fixMenuText(menuItemText));
						actionsRemove.add(action);
					}
				}
			}
			boolean addedNewItem = false;
			// allow addition of optional content
			for (int index = 1; index <= 9; index++) {
				if (containsPath(indexed(propPath, index)) || addedInstances < upper(property) && !addedNewItem) {

					final int findex = index;
					Action action = new Action() {
						@Override
						public void run() {
							modifyFields(indexed(propPath, findex), "", false);
							refresh();
						}

					};
					action.setText(ADD + lastStep(indexed(propPath, findex), indexed(propBasePath, findex)));
					addclassactions.add(action);

					action.setMenuCreator(new MenuCreator() {

						@Override
						protected void fillMenu(MenuManager dropDownMenuMgr) {
							List<Class> childContext = new ArrayList<Class>(context);
							childContext.add(class1);
							addClass(
								class2, indexed(propPath, findex), indexed(propBasePath, findex), dropDownMenuMgr,
								childContext);
						}

					});

					if (!containsPath(indexed(propPath, index))) {
						addedNewItem = true;
					}
				}
			}

		}

		sortActionsByCaption(actions);

		for (IAction action : actions) {
			menu.add(action);
		}

		if (menu != null) {
			menu.add(new Separator());
		}

		if (!addclassactions.isEmpty() && addclassactions.size() <= 20) {
			sortActionsByCaption(addclassactions);
			for (IAction action : addclassactions) {
				menu.add(action);
			}
			menu.add(new Separator());
		} else if (!addclassactions.isEmpty()) {

			Action action = new Action() {
				@Override
				public void run() {
				}

			};
			action.setText("Add");
			menu.add(action);

			action.setMenuCreator(new MenuCreator() {

				@Override
				protected void fillMenu(MenuManager dropDownMenuMgr) {
					sortActionsByCaption(addclassactions);
					for (IAction action : addclassactions) {
						dropDownMenuMgr.add(action);
					}
				}

			});

		}
		if (!actionsRemove.isEmpty()) {

			Action action = new Action() {
				@Override
				public void run() {
				}

			};
			action.setText("Remove");
			menu.add(action);

			action.setMenuCreator(new MenuCreator() {

				@Override
				protected void fillMenu(MenuManager dropDownMenuMgr) {
					sortActionsByCaption(actionsRemove);
					for (IAction action : actionsRemove) {
						dropDownMenuMgr.add(action);
					}
				}

			});

		}
	}

	/**
	 *
	 * Just calling <code>property.getDefault()</code> may return <code>null</code> for dynamic metamodels, so better use this helper function here
	 *
	 * @param property
	 * @return
	 */
	protected String getDefaultValue(final Property property) {
		return property.getDefaultValue() instanceof InstanceValue
				? ((InstanceValue) property.getDefaultValue()).getName()
				: property.getDefault();
	}

	/**
	 * @param property
	 * @return the "base" property to which the given property would be matched, or <code>null</code> if this property should not be considered
	 */
	protected Property getBaseProperty(final Property property) {
		Property result = UMLUtil.getInheritedProperty(property);
		if (result != null) {
			return result;
		}
		return property;
	}

	private String fixMenuText(String menuItemText) {
		if (menuItemText.contains("@")) {
			// see http://stackoverflow.com/questions/27822109/eclipse-action-with-symbol-in-the-text
			return menuItemText + "@";
		}
		return menuItemText;
	}

	private void sortActionsByCaption(List<IAction> actions) {
		Collections.sort(actions, new Comparator<IAction>() {

			@Override
			public int compare(IAction o1, IAction o2) {
				return o1.getText().compareTo(o2.getText());
			}

		});
	}

	private String abbreviate(String path) {
		if (path.endsWith("/@mixed")) {
			return path.substring(0, path.length() - "/@mixed".length()) + "/@text";
		}
		return path;
	}

	/**
	 * The list of properties that could be edited for the given class
	 *
	 * @param cls
	 * @return
	 */
	protected Collection<Property> editableAttributes(Class cls) {
		List<Property> result = new ArrayList<Property>();
		for (Property property : getAllAttributes(cls)) {
			if (getBaseProperty(property) == null) {
				continue;
			}
			result.add(property);
		}
		return result;
	}

	protected Collection<Property> getAllAttributes(Class cls) {
		return cls.getAllAttributes();
	}

	/**
	 * @param propPath
	 * @param index
	 * @return
	 */
	private String indexed(String propPath, int index) {
		if (index == 1) {
			return propPath;
		}
		return propPath + "(" + index + ")";
	}

	/**
	 * @param string
	 * @return whether the given property path is a suffix or equal to any existing path of sample data
	 */
	private boolean containsPath(String path) {
		for (String key : lines.keySet()) {
			if (key.equals(path) || key.startsWith(path + "/")) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean isReadOnly() {
		if (umlElement != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlElement);
			if (editingDomain != null && editingDomain.isReadOnly(umlElement.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		// if (element instanceof View) {
		// element = ((View) element).getElement();
		// }
		Assert.isTrue(element instanceof Element);
		this.umlElement = (Element) element;

	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		lines.clear();
		for (Control c : body.getChildren()) {
			c.dispose();
		}
		if (umlElement == null) {
			return;
		}
		EAnnotation anno = umlElement.getEAnnotation(UMLSAMPLE_ANNOTATION_SOURCE);
		if (anno != null) {
			for (String key : anno.getDetails().keySet()) {
				lines.put(key, anno.getDetails().get(key));
			}
		}

		MenuManager menu = new MenuManager();
		menu.setRemoveAllWhenShown(true);
		body.setMenu(menu.createContextMenu(body));
		menu.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				if (umlElement instanceof Class) {
					addClass((Class) umlElement, "", "", manager, Collections.<Class> emptyList());
				}
			}
		});

		focusControl = null;
		if (umlElement instanceof Class) {
			Class class1 = (Class) umlElement;
			addClass(class1, "", "", null, Collections.<Class> emptyList());
		}

		createOtherFormUI();

		form.layout(true, true);
		theTabbedPropertySheetPage.resizeScrolledComposite();

		if (focusControl != null) {
			focusControl.setFocus();
		}
		focusPath = null;
	}

	/**
	 * Create other UI controls in the bottom of the form
	 */
	protected void createOtherFormUI() {

	}

	/**
	 *
	 * @param property
	 * @param umlClassPath
	 * @return whether the given property should always be a UI edit control be generated for or not
	 */
	protected boolean isAlwaysVisible(Property property, String umlClassPath) {
		return property.getLower() != 0 && ("".equals(umlClassPath) || containsPath(umlClassPath));
	}

	/**
	 * @param property
	 * @return a "mathematically" useful number for the upper bound
	 */
	protected int upper(Property property) {
		return property.getUpper() == -1
				? Integer.MAX_VALUE
				: property.getUpper();
	}

	/**
	 * @param propPath
	 * @return the multiplicity of the property for the given property path
	 */
	protected int countModelOccurences(final String propPath) {
		int addedInstances = 0;
		for (int index = 1; index <= 9; index++) {
			if (containsPath(indexed(propPath, index))) {
				addedInstances++;
			}
		}
		return addedInstances;
	}

	/**
	 * Tell whether the given property is either optional (and maybe fixed in value) or required but not fixed in value.
	 * Rational: only such properties are allowed to be edited
	 *
	 * @param property
	 * @return
	 */
	protected boolean isOptionalOrRequiredButNotFixed(Property property) {
		return property.getType() instanceof DataType &&
				(getDefaultValue(property) == null || property.getLower() == 0);
	}

	private String lastStep(String path, String basePath) {
		String umlProperty = path.substring(path.lastIndexOf("/") + 1);
		String baseProperty = basePath.substring(basePath.lastIndexOf("/") + 1);
		if (!umlProperty.equals(baseProperty)) {
			return baseProperty + " (" + umlProperty + ")";
		}
		return umlProperty;
	}

	/**
	 * Update if neccessary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            - even notification
	 * @param element
	 *            - element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed() && !preventUIUpdate) {
			postUpdateRequest(new Runnable() {

				public void run() {
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
