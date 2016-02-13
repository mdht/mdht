/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

public class SubclassEditorTreeViewer extends CheckboxTreeViewer {

	private Class currentSelection;

	private boolean modifyMode = false;

	private boolean doneInitialSelections = false;

	private Property initProperty = null;

	// private String initStereotypeName = null;

	/**
	 * Constructor for ContainerCheckedTreeViewer.
	 *
	 * @see CheckboxTreeViewer#CheckboxTreeViewer(Composite)
	 */
	public SubclassEditorTreeViewer(Composite parent) {
		super(parent);
		initViewer();
	}

	/**
	 * Constructor for ContainerCheckedTreeViewer.
	 *
	 * @see CheckboxTreeViewer#CheckboxTreeViewer(Composite,int)
	 */
	public SubclassEditorTreeViewer(Composite parent, int style) {
		super(parent, style);
		initViewer();
	}

	/**
	 * Constructor for ContainerCheckedTreeViewer.
	 *
	 * @see CheckboxTreeViewer#CheckboxTreeViewer(Tree)
	 */
	public SubclassEditorTreeViewer(Tree tree) {
		super(tree);
		initViewer();
	}

	private void initViewer() {
		setUseHashlookup(true);
		addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				doCheckStateChanged(event.getElement());
			}
		});
		addTreeListener(new ITreeViewerListener() {
			public void treeCollapsed(TreeExpansionEvent event) {
			}

			public void treeExpanded(TreeExpansionEvent event) {
				Widget item = findItem(event.getElement());
				if (item instanceof TreeItem) {
					initializeItem((TreeItem) item);
				}
			}
		});
	}

	/**
	 * Update element after a checkstate change.
	 *
	 * @param element
	 */
	protected void doCheckStateChanged(Object element) {
		Widget item = null;
		// If the clone editor is kicked off in modify mode,
		// then try to find the input element in the tree and pre-select the Property
		if (isModifyMode() && !isDoneInitialSelections()) {
			initProperty = (Property) element;
			// get the initProperty stereotype name
			// TODO
			// Stereotype stereotype = RIMProfileUtil.getRIMStereotype(initProperty.getClass_());
			// if (stereotype != null) {
			// initStereotypeName = stereotype.getName();
			// }
			doInitSelection(getTree().getItems());
		} else {
			item = findItem(element);
		}
		if (item instanceof TreeItem) {
			TreeItem treeItem = (TreeItem) item;
			if (!hasItemSelected(treeItem)) {
				treeItem.setGrayed(false);
				updateChildrenItems(treeItem);
				updateParentItems(treeItem.getParentItem());
			}
		}
		recordCheckedClass(getTree().getItems());
	}

	/**
	 * This method traverse the input tree to look for the initElement property, and pre-select the
	 * element and update its tree accordingly.
	 *
	 * @param treeItems
	 */
	private void doInitSelection(Item[] treeItems) {
		for (int i = 0; i < treeItems.length; i++) {
			TreeItem item = (TreeItem) treeItems[i];
			if (item.getData() instanceof Property) {
				Property itemProperty = (Property) item.getData();

				// String itemClassName = itemProperty.getClass_().getName();
				// makes sure that the tree item has the same name,
				// and its class name is the same as initProperty stereotype name
				// if(itemProperty.getName().equals(initProperty.getName())&&
				// (itemClassName.equals(initStereotypeName)||
				// CloneEditorRIMUtil.isCoreRIMClass(itemClassName))){
				if (itemProperty.getName().equals(initProperty.getName())) {
					item.setChecked(true);
					item.setGrayed(false);
					if (!hasItemSelected(item)) {
						item.setGrayed(false);
						updateChildrenItems(item);
						updateParentItems(item.getParentItem());
						return;
					}
				}
			} else if (item.getData() instanceof Class) {
				// the children of the item node is not yet created.
				// Create the tree items and traverse the node to look for the initElement
				createChildren(item);
				doInitSelection(getChildren(item));
			}
		}
	}

	/**
	 * The item has expanded. Updates the checked state of its children.
	 */
	private void initializeItem(TreeItem item) {
		if (item.getChecked() && !item.getGrayed()) {
			updateChildrenItems(item);
		}
	}

	/**
	 * Updates the check state of all created children
	 */
	private void updateChildrenItems(TreeItem parent) {
		Item[] children = getChildren(parent);
		boolean state = parent.getChecked();
		for (int i = 0; i < children.length; i++) {
			TreeItem child = (TreeItem) children[i];
			if (child.getData() != null && ((child.getChecked() != state) || child.getGrayed())) {
				if (child.getData() instanceof Property) {
					child.setChecked(state);
					child.setGrayed(false);
				} else if (child.getData() instanceof Class) {
					child.setGrayed(true);
				}
				updateChildrenItems(child);
			}
		}
	}

	/**
	 * Updates the check / gray state of all parent items
	 */
	private void updateParentItems(TreeItem item) {
		if (item != null) {
			Item[] children = getChildren(item);
			boolean containsChecked = false;
			boolean containsUnchecked = false;
			for (int i = 0; i < children.length; i++) {
				TreeItem curr = (TreeItem) children[i];
				containsChecked |= curr.getChecked();
				containsUnchecked |= (!curr.getChecked() || curr.getGrayed());
			}
			item.setChecked(containsChecked);
			item.setGrayed(containsChecked && containsUnchecked);
			updateParentItems(item.getParentItem());
		}
	}

	@Override
	public boolean setChecked(Object element, boolean state) {
		if (super.setChecked(element, state)) {
			doCheckStateChanged(element);
			return true;
		}
		return false;
	}

	@Override
	public void setCheckedElements(Object[] elements) {
		super.setCheckedElements(elements);
		for (int i = 0; i < elements.length; i++) {
			doCheckStateChanged(elements[i]);
		}
		// if the the tree is in modify mode then disable all tree nodes that are not already
		// selected.
		if (isModifyMode()) {
			disableNodesForModify(getTree().getItems());
		}
	}

	private void disableNodesForModify(TreeItem[] treeItems) {
		TreeItem item = null;
		for (int i = 0; i < treeItems.length; i++) {
			item = treeItems[i];
			if (item.getData() instanceof Property) {
				// if the Property or parent class is not checked, then set the item to gray
				if (item.getChecked() == false) {
					item.setGrayed(true);
				}
			} else if (item.getData() instanceof Class) {
				// set all classes to gray to prevent changing the stereotype
				item.setGrayed(true);
				createChildren(item);
				disableNodesForModify(item.getItems());
			}
		}
	}

	@Override
	protected void setExpanded(Item item, boolean expand) {
		super.setExpanded(item, expand);
		if (expand && item instanceof TreeItem) {
			initializeItem((TreeItem) item);
		}
	}

	@Override
	public Object[] getCheckedElements() {
		Object[] checked = super.getCheckedElements();
		// add all items that are children of a checked node but not created yet
		ArrayList result = new ArrayList();
		for (int i = 0; i < checked.length; i++) {
			Object curr = checked[i];
			result.add(curr);
			Widget item = findItem(curr);
			if (item != null) {
				Item[] children = getChildren(item);
				// check if contains the dummy node
				if (children.length == 1 && children[0].getData() == null) {
					// not yet created
					collectChildren(curr, result);
				}
			}
		}
		return result.toArray();
	}

	/**
	 * Recursively add the filtered children of element to the result.
	 *
	 * @param element
	 * @param result
	 */
	private void collectChildren(Object element, ArrayList result) {
		Object[] filteredChildren = getFilteredChildren(element);
		for (int i = 0; i < filteredChildren.length; i++) {
			Object curr = filteredChildren[i];
			result.add(curr);
			collectChildren(curr, result);
		}
	}

	/**
	 * Handles a tree expand event from the SWT widget.
	 *
	 * @param event
	 *            the SWT tree event
	 */
	@Override
	protected void handleTreeExpand(TreeEvent event) {
		createChildren(event.item);
		if (event.item.getData() != null) {
			fireTreeExpanded(new TreeExpansionEvent(this, event.item.getData()));
		}
	}

	/**
	 * @param inputItem
	 * @return
	 */
	private boolean hasItemSelected(TreeItem inputItem) {
		boolean isChecked = false;

		if (inputItem != null && inputItem.getChecked()) {
			if (inputItem.getData() instanceof Class) {
				isChecked = handleClassSelection(inputItem);
			} else if (inputItem.getData() instanceof Property) {
				isChecked = handlePropertySelection(inputItem);
			}
		}
		return isChecked;
	}

	/**
	 * @param inputItem
	 * @return
	 */
	private boolean handleClassSelection(TreeItem inputItem) {
		boolean hasSelection = false;
		Object[] checkedArray = super.getCheckedElements();
		TreeItem parent = inputItem.getParentItem();
		if (parent != null) {
			TreeItem[] treeChildren = parent.getItems();
			TreeItem child = null;
			for (int i = 0; i < treeChildren.length; i++) {
				child = treeChildren[i];
				// if the parent tree has already a child class checked
				if ((child.getData() instanceof Class && child.getChecked() && !child.equals(inputItem))) {
					hasSelection = true;
					inputItem.setChecked(false);
					inputItem.setGrayed(true);
				} else {
					List treeList = new ArrayList();
					// add the parent Class and filter out all Properties from the treeChildren
					treeList.add(parent.getData());
					for (int j = 0; j < treeChildren.length; j++) {
						if (treeChildren[j].getData() instanceof Class) {
							treeList.add(treeChildren[j].getData());
						}
					}
					// check other checked Class to see if it's in the parent tree
					// if not then set the inputItem to unchecked
					for (int k = 0; k < checkedArray.length; k++) {
						if (checkedArray[k] instanceof Class && !treeList.contains(checkedArray[k])) {
							hasSelection = true;
							inputItem.setChecked(false);
							inputItem.setGrayed(true);
							break;
						}
					}
				}
			}
		} else {
			for (int i = 0; i < checkedArray.length; i++) {
				if (checkedArray[i] instanceof Class) {
					if (!inputItem.getData().equals(checkedArray[i])) {
						hasSelection = true;
						inputItem.setChecked(false);
						inputItem.setGrayed(true);
						break;
					}
				}
			}
		}
		return hasSelection;
	}

	/**
	 * @param inputItem
	 * @return
	 */
	private boolean handlePropertySelection(TreeItem inputItem) {
		boolean hasSelection = false;
		Object[] checkedArray = super.getCheckedElements();
		Class aCheckedClass = null;
		TreeItem parent = inputItem.getParentItem();

		if (parent != null) {
			TreeItem[] allItemsInTree = null;
			if (parent.getParentItem() != null) {
				allItemsInTree = parent.getParentItem().getItems();
				for (int i = 0; i < allItemsInTree.length; i++) {
					if (allItemsInTree[i].getData() instanceof Class) {
						if (allItemsInTree[i].getChecked() && !parent.equals(allItemsInTree[i])) {
							hasSelection = true;
							inputItem.setChecked(false);
							inputItem.setGrayed(true);
						}
					}
				}
			} else {
				List<Property> propertyList = null;
				for (int i = 0; i < checkedArray.length; i++) {
					if (checkedArray[i] instanceof Class) {
						aCheckedClass = (Class) checkedArray[i];
						if (propertyList == null || propertyList.size() <= 0) {
							propertyList = aCheckedClass.getOwnedAttributes();
						} else {
							propertyList.addAll(propertyList.size(), aCheckedClass.getOwnedAttributes());
						}
					}
				}
				if (propertyList != null && !propertyList.isEmpty() && !propertyList.contains(inputItem.getData())) {
					hasSelection = true;
					inputItem.setChecked(false);
					inputItem.setGrayed(true);
				}
			}
		}
		return hasSelection;
	}

	/**
	 * @return
	 */
	public Class getSelectedClass() {
		return currentSelection;
	}

	private void recordCheckedClass(TreeItem[] treeItems) {
		for (int j = 0; j < treeItems.length; j++) {
			TreeItem item = treeItems[j];
			if (item.getData() instanceof Class && item.getChecked()) {
				currentSelection = (Class) item.getData();
				recordCheckedClass(item.getItems());
			}
		}
	}

	private boolean isDoneInitialSelections() {
		return doneInitialSelections;
	}

	protected void setDoneInitialSelections(boolean doneInitialSelections) {
		this.doneInitialSelections = doneInitialSelections;
	}

	protected boolean isModifyMode() {
		return modifyMode;
	}

	protected void setModifyMode(boolean modifyMode) {
		this.modifyMode = modifyMode;
	}
}
