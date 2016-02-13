/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     David A Carlson (XMLmodeling.com) - adapted for use in table editor
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.util;

import java.util.LinkedList;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.TypedListener;
import org.eclipse.swt.widgets.Widget;

/**
 * Modified from org.eclipse.swt.custom.TableCursor for use in a tree.
 *
 * A TreeCursor provides a way for the user to navigate around Tree columns
 * using the keyboard. It also provides a mechanism for selecting an
 * individual cell in a tree table.
 *
 * <p>
 * Here is an example of using a TreeCursor to navigate to a cell and then edit it.
 *
 * <code><pre>
 *  public static void main(String[] args) {
 * 		Display display = new Display();
 * 		Shell shell = new Shell(display);
 * 		shell.setLayout(new GridLayout());
 *
 * 		// create a a table with 3 columns and fill with data
 * 		final Tree table = new Tree(shell, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
 * 		table.setLayoutData(new GridData(GridData.FILL_BOTH));
 * 		TreeColumn column1 = new TreeColumn(table, SWT.NONE);
 * 		TreeColumn column2 = new TreeColumn(table, SWT.NONE);
 * 		TreeColumn column3 = new TreeColumn(table, SWT.NONE);
 * 		for (int i = 0; i &lt; 100; i++) {
 * 			TreeItem item = new TreeItem(table, SWT.NONE);
 * 			item.setText(new String[] { "cell "+i+" 0", "cell "+i+" 1", "cell "+i+" 2"});
 * 		}
 * 		column1.pack();
 * 		column2.pack();
 * 		column3.pack();
 *
 * 		// create a TreeCursor to navigate around the table
 * 		final TreeCursor cursor = new TreeCursor(table, SWT.NONE);
 * 		// create an editor to edit the cell when the user hits "ENTER"
 * 		// while over a cell in the table
 * 		final ControlEditor editor = new ControlEditor(cursor);
 * 		editor.grabHorizontal = true;
 * 		editor.grabVertical = true;
 *
 * 		cursor.addSelectionListener(new SelectionAdapter() {
 * 			// when the TreeEditor is over a cell, select the corresponding row in
 * 			// the table
 * 			public void widgetSelected(SelectionEvent e) {
 * 				table.setSelection(new TreeItem[] {cursor.getRow()});
 * 			}
 * 			// when the user hits "ENTER" in the TreeCursor, pop up a text editor so that
 * 			// they can change the text of the cell
 * 			public void widgetDefaultSelected(SelectionEvent e){
 * 				final Text text = new Text(cursor, SWT.NONE);
 * 				TreeItem row = cursor.getRow();
 * 				int column = cursor.getColumn();
 * 				text.setText(row.getText(column));
 * 				text.addKeyListener(new KeyAdapter() {
 * 					public void keyPressed(KeyEvent e) {
 * 						// close the text editor and copy the data over
 * 						// when the user hits "ENTER"
 * 						if (e.character == SWT.CR) {
 * 							TreeItem row = cursor.getRow();
 * 							int column = cursor.getColumn();
 * 							row.setText(column, text.getText());
 * 							text.dispose();
 * 						}
 * 						// close the text editor when the user hits "ESC"
 * 						if (e.character == SWT.ESC) {
 * 							text.dispose();
 * 						}
 * 					}
 * 				});
 * 				editor.setEditor(text);
 * 				text.setFocus();
 * 			}
 * 		});
 * 		// Hide the TreeCursor when the user hits the "MOD1" or "MOD2" key.
 * 		// This alows the user to select multiple items in the table.
 * 		cursor.addKeyListener(new KeyAdapter() {
 * 			public void keyPressed(KeyEvent e) {
 * 				if (e.keyCode == SWT.MOD1 ||
 * 				    e.keyCode == SWT.MOD2 ||
 * 				    (e.stateMask & SWT.MOD1) != 0 ||
 * 				    (e.stateMask & SWT.MOD2) != 0) {
 * 					cursor.setVisible(false);
 * 				}
 * 			}
 * 		});
 * 		// Show the TreeCursor when the user releases the "MOD2" or "MOD1" key.
 * 		// This signals the end of the multiple selection task.
 * 		table.addKeyListener(new KeyAdapter() {
 * 			public void keyReleased(KeyEvent e) {
 * 				if (e.keyCode == SWT.MOD1 && (e.stateMask & SWT.MOD2) != 0) return;
 * 				if (e.keyCode == SWT.MOD2 && (e.stateMask & SWT.MOD1) != 0) return;
 * 				if (e.keyCode != SWT.MOD1 && (e.stateMask & SWT.MOD1) != 0) return;
 * 				if (e.keyCode != SWT.MOD2 && (e.stateMask & SWT.MOD2) != 0) return;
 *
 * 				TreeItem[] selection = table.getSelection();
 * 				TreeItem row = (selection.length == 0) ? table.getItem(table.getTopIndex()) : selection[0];
 * 				table.showItem(row);
 * 				cursor.setSelection(row, 0);
 * 				cursor.setVisible(true);
 * 				cursor.setFocus();
 * 			}
 * 		});
 *
 * 		shell.open();
 * 		while (!shell.isDisposed()) {
 * 			if (!display.readAndDispatch())
 * 				display.sleep();
 * 		}
 * 		display.dispose();
 * 	}
 * </pre></code>
 *
 * <dl>
 * <dt><b>Styles:</b></dt>
 * <dd>BORDER</dd>
 * <dt><b>Events:</b></dt>
 * <dd>Selection, DefaultSelection</dd>
 * </dl>
 *
 * @since 2.0
 *
 */
public class TreeCursor extends Canvas {
	Tree tree;

	TreeItem row = null;

	TreeColumn column = null;

	TreeListener treeListener;

	Listener tableListener, resizeListener, disposeItemListener, disposeColumnListener;

	Listener canvasListener;

	// workaround for problem with row selection
	private boolean ignoreMouseDown = false;

	// By default, invert the list selection colors
	static final int BACKGROUND = SWT.COLOR_LIST_SELECTION_TEXT;

	static final int FOREGROUND = SWT.COLOR_LIST_SELECTION;

	/**
	 * Constructs a new instance of this class given its parent
	 * table and a style value describing its behavior and appearance.
	 * <p>
	 * The style value is either one of the style constants defined in class <code>SWT</code> which is applicable to instances of this class, or must
	 * be built by <em>bitwise OR</em>'ing together (that is, using the <code>int</code> "|" operator) two or more of those <code>SWT</code> style
	 * constants. The class description lists the style constants that are applicable to the class. Style bits are also inherited from superclasses.
	 * </p>
	 *
	 * @param parent
	 *            a Tree control which will be the parent of the new instance (cannot be null)
	 * @param style
	 *            the style of control to construct
	 *
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the parent is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the parent</li>
	 *                <li>ERROR_INVALID_SUBCLASS - if this class is not an allowed subclass</li>
	 *                </ul>
	 *
	 * @see SWT#BORDER
	 * @see Widget#checkSubclass()
	 * @see Widget#getStyle()
	 */
	public TreeCursor(Tree parent, int style) {
		super(parent, style);
		tree = parent;
		setBackground(null);
		setForeground(null);

		Listener listener = new Listener() {
			public void handleEvent(Event event) {
				switch (event.type) {
					case SWT.Dispose:
						dispose(event);
						break;
					case SWT.FocusIn:
					case SWT.FocusOut:
						redraw();
						break;
					case SWT.KeyDown:
						keyDown(event);
						break;
					case SWT.Paint:
						paint(event);
						break;
					case SWT.Traverse:
						traverse(event);
						break;
				}
			}
		};

		int[] events = new int[] { SWT.Dispose, SWT.FocusIn, SWT.FocusOut, SWT.KeyDown, SWT.Paint, SWT.Traverse };
		for (int i = 0; i < events.length; i++) {
			addListener(events[i], listener);
		}

		treeListener = new TreeListener() {
			public void treeCollapsed(TreeEvent event) {
				if (event.item instanceof TreeItem) {
					// fix bug where mouse down row selection conflicts with new expand/collapse row selection
					ignoreMouseDown = true;
					setSelection((TreeItem) event.item, 0);

					// the current row bounds are only available AFTER treeCollapsed() had finished
					// need async event to cause resize AFTER tree has collapsed/expanded
					tree.getDisplay().asyncExec(new Runnable() {
						public void run() {
							_resize();
						}
					});
				}
			}

			public void treeExpanded(TreeEvent event) {
				if (event.item instanceof TreeItem) {
					ignoreMouseDown = true;
					setSelection((TreeItem) event.item, 0);

					tree.getDisplay().asyncExec(new Runnable() {
						public void run() {
							_resize();
						}
					});
				}
			}
		};
		tree.addTreeListener(treeListener);

		tableListener = new Listener() {
			public void handleEvent(Event event) {
				switch (event.type) {
					case SWT.MouseDown:
						if (ignoreMouseDown) {
							ignoreMouseDown = false;
						} else {
							tableMouseDown(event);
						}
						break;
					case SWT.FocusIn:
						tableFocusIn(event);
						break;
				}
			}
		};
		tree.addListener(SWT.FocusIn, tableListener);
		tree.addListener(SWT.MouseDown, tableListener);

		canvasListener = new Listener() {
			public void handleEvent(Event event) {
				switch (event.type) {
					case SWT.MouseDoubleClick:
						handleDoubleClick(event);
						break;
				}
			}
		};
		addListener(SWT.MouseDoubleClick, canvasListener);

		disposeItemListener = new Listener() {
			public void handleEvent(Event event) {
				row = null;
				column = null;
				_resize();
			}
		};
		disposeColumnListener = new Listener() {
			public void handleEvent(Event event) {
				row = null;
				column = null;
				_resize();
			}
		};
		resizeListener = new Listener() {
			public void handleEvent(Event event) {
				_resize();
			}
		};
		ScrollBar hBar = tree.getHorizontalBar();
		if (hBar != null) {
			hBar.addListener(SWT.Selection, resizeListener);
		}
		ScrollBar vBar = tree.getVerticalBar();
		if (vBar != null) {
			vBar.addListener(SWT.Selection, resizeListener);
		}
	}

	void _resize() {
		if (row == null) {
			setBounds(-200, -200, 0, 0);
		} else {
			int columnIndex = column == null
					? 0
					: tree.indexOf(column);
			setBounds(row.getBounds(columnIndex));
		}
	}

	/**
	 * Adds the listener to the collection of listeners who will
	 * be notified when the receiver's selection changes, by sending
	 * it one of the messages defined in the <code>SelectionListener</code> interface.
	 * <p>
	 * When <code>widgetSelected</code> is called, the item field of the event object is valid. If the reciever has <code>SWT.CHECK</code> style set
	 * and the check selection changes, the event object detail field contains the value <code>SWT.CHECK</code>. <code>widgetDefaultSelected</code> is
	 * typically called when an item is double-clicked.
	 * </p>
	 *
	 * @param listener
	 *            the listener which should be notified
	 *
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 *                </ul>
	 *
	 * @see SelectionListener
	 * @see SelectionEvent
	 * @see #removeSelectionListener(SelectionListener)
	 *
	 */
	public void addSelectionListener(SelectionListener listener) {
		checkWidget();
		if (listener == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		TypedListener typedListener = new TypedListener(listener);
		addListener(SWT.Selection, typedListener);
		addListener(SWT.DefaultSelection, typedListener);
	}

	void dispose(Event event) {
		tree.removeListener(SWT.FocusIn, tableListener);
		tree.removeListener(SWT.MouseDown, tableListener);
		if (column != null) {
			column.removeListener(SWT.Dispose, disposeColumnListener);
			column.removeListener(SWT.Move, resizeListener);
			column.removeListener(SWT.Resize, resizeListener);
			column = null;
		}
		if (row != null) {
			row.removeListener(SWT.Dispose, disposeItemListener);
			row = null;
		}
		ScrollBar hBar = tree.getHorizontalBar();
		if (hBar != null) {
			hBar.removeListener(SWT.Selection, resizeListener);
		}
		ScrollBar vBar = tree.getVerticalBar();
		if (vBar != null) {
			vBar.removeListener(SWT.Selection, resizeListener);
		}
	}

	/**
	 * Returns the column over which the TreeCursor is positioned.
	 *
	 * @return the column for the current position
	 *
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 *                </ul>
	 */
	public int getColumn() {
		checkWidget();
		return column == null
				? 0
				: tree.indexOf(column);
	}

	private TreeItem getNextSibling(TreeItem item) {
		TreeItem sibling = null;
		Widget parent = item.getParentItem() == null
				? (Widget) tree
				: item.getParentItem();
		int rowIndex = getRowIndex(item);
		if (rowIndex < getParentItemCount(item) - 1) {
			sibling = (parent instanceof Tree)
					? ((Tree) parent).getItem(++rowIndex)
					: ((TreeItem) parent).getItem(++rowIndex);
		}
		return sibling;
	}

	/**
	 * Find parent, either TreeItem or Tree, and call its getItemCount().
	 */
	private int getParentItemCount(TreeItem item) {
		int count = 0;
		if (item != null) {
			count = (item.getParentItem() == null)
					? tree.getItemCount()
					: item.getParentItem().getItemCount();
		}
		return count;
	}

	private TreeItem getPreviousSibling(TreeItem item) {
		TreeItem sibling = null;
		Widget parent = item.getParentItem() == null
				? (Widget) tree
				: item.getParentItem();
		int rowIndex = getRowIndex(item);
		if (rowIndex > 0) {
			sibling = (parent instanceof Tree)
					? ((Tree) parent).getItem(--rowIndex)
					: ((TreeItem) parent).getItem(--rowIndex);
		}
		return sibling;
	}

	/**
	 * Returns the row over which the TreeCursor is positioned.
	 *
	 * @return the item for the current position
	 *
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 *                </ul>
	 */
	public TreeItem getRow() {
		checkWidget();
		return row;
	}

	/**
	 * Find parent, either TreeItem or Tree, and return index within parent.
	 */
	private int getRowIndex(TreeItem item) {
		int index = -1;
		if (item != null) {
			index = (item.getParentItem() == null)
					? tree.indexOf(item)
					: item.getParentItem().indexOf(item);
		}
		return index;
	}

	public TreePath getTreePath(TreeItem item) {
		LinkedList<Object> segments = new LinkedList<Object>();
		while (item != null) {
			Object segment = item.getData();
			Assert.isNotNull(segment);
			segments.addFirst(segment);
			item = item.getParentItem();
		}
		return new TreePath(segments.toArray());
	}

	/**
	 * User double-clicked on the current cursor canvas.
	 * Default is to do nothing. Subclasses may override.
	 */
	public void handleDoubleClick(Event event) {
		// do nothing
	}

	void keyDown(Event event) {
		if (row == null) {
			return;
		}
		switch (event.character) {
			case SWT.CR:
				notifyListeners(SWT.DefaultSelection, new Event());
				return;
		}
		int rowIndex = getRowIndex(row);
		int columnIndex = column == null
				? 0
				: tree.indexOf(column);
		switch (event.keyCode) {
			case SWT.ARROW_UP:
				TreeItem previousRow = getPreviousSibling(row);
				if (previousRow == null && row.getParentItem() != null) {
					previousRow = row.getParentItem();
				} else if (previousRow != null && previousRow.getExpanded() && previousRow.getItemCount() > 0) {
					previousRow = previousRow.getItem(previousRow.getItemCount() - 1);
				}

				if (previousRow != null) {
					setRowColumn(previousRow, column, true);
				}
				break;
			case SWT.ARROW_DOWN:
				TreeItem nextRow = getNextSibling(row);
				if (row.getExpanded() && row.getItemCount() > 0) {
					setRowColumn(row.getItem(0), column, true);
				} else if (nextRow != null) {
					setRowColumn(nextRow, column, true);
				} else if (row.getParentItem() != null) {
					TreeItem parentItem = row.getParentItem();
					TreeItem nextParent = null;
					while (parentItem != null && nextParent == null) {
						nextParent = getNextSibling(parentItem);
						parentItem = parentItem.getParentItem();
					}
					if (nextParent != null) {
						setRowColumn(nextParent, column, true);
					}
				}
				break;
			case SWT.ARROW_LEFT:
			case SWT.ARROW_RIGHT: {
				int columnCount = tree.getColumnCount();
				if (columnCount == 0) {
					break;
				}
				int[] order = tree.getColumnOrder();
				int index = 0;
				while (index < order.length) {
					if (order[index] == columnIndex) {
						break;
					}
					index++;
				}
				if (index == order.length) {
					index = 0;
				}
				int leadKey = (getStyle() & SWT.RIGHT_TO_LEFT) != 0
						? SWT.ARROW_RIGHT
						: SWT.ARROW_LEFT;
				int newColumnIndex = columnIndex;
				if (event.keyCode == leadKey) {
					newColumnIndex = order[Math.max(0, index - 1)];
				} else {
					newColumnIndex = order[Math.min(columnCount - 1, index + 1)];
				}
				TreeColumn col = newColumnIndex == -1 || tree.getColumnCount() == 0
						? null
						: tree.getColumn(newColumnIndex);
				setRowColumn(row, col, true);
				break;
			}
			case SWT.HOME:
				setRowColumn(tree.getItem(0), tree.getColumn(0), true);
				break;
			case SWT.END: {
				// TODO fix for table-tree
				// int i = tree.getItemCount() - 1;
				// setRowColumn(i, columnIndex, true);
				break;
			}
			case SWT.PAGE_UP: {
				// TODO fix for table-tree
				int index = tree.indexOf(tree.getTopItem());
				if (index == rowIndex) {
					Rectangle rect = tree.getClientArea();
					TreeItem item = tree.getItem(index);
					Rectangle itemRect = item.getBounds(0);
					rect.height -= itemRect.y;
					int height = tree.getItemHeight();
					int page = Math.max(1, rect.height / height);
					index = Math.max(0, index - page + 1);
				}
				// setRowColumn(index, columnIndex, true);
				break;
			}
			case SWT.PAGE_DOWN: {
				// TODO fix for table-tree
				int index = tree.indexOf(tree.getTopItem());
				Rectangle rect = tree.getClientArea();
				TreeItem item = tree.getItem(index);
				Rectangle itemRect = item.getBounds(0);
				rect.height -= itemRect.y;
				int height = tree.getItemHeight();
				int page = Math.max(1, rect.height / height);
				int end = tree.getItemCount() - 1;
				index = Math.min(end, index + page - 1);
				if (index == rowIndex) {
					index = Math.min(end, index + page - 1);
				}
				// setRowColumn(index, columnIndex, true);
				break;
			}
		}
	}

	void paint(Event event) {
		if (row == null) {
			return;
		}
		int columnIndex = column == null
				? 0
				: tree.indexOf(column);
		GC gc = event.gc;
		Display display = getDisplay();
		gc.setBackground(getBackground());
		gc.setForeground(getForeground());
		gc.fillRectangle(event.x, event.y, event.width, event.height);
		int x = 0;
		Point size = getSize();
		Image image = row.getImage(columnIndex);
		if (image != null) {
			Rectangle imageSize = image.getBounds();
			int imageY = (size.y - imageSize.height) / 2;
			gc.drawImage(image, x, imageY);
			x += imageSize.width;
		}
		String text = row.getText(columnIndex);
		if (text != "") { //$NON-NLS-1$
			Rectangle bounds = row.getBounds(columnIndex);
			Point extent = gc.stringExtent(text);
			// Temporary code - need a better way to determine table trim
			String platform = SWT.getPlatform();
			if ("win32".equals(platform)) { //$NON-NLS-1$
				if (tree.getColumnCount() == 0 || columnIndex == 0) {
					x += 2;
				} else {
					int alignmnent = column.getAlignment();
					switch (alignmnent) {
						case SWT.LEFT:
							x += 6;
							break;
						case SWT.RIGHT:
							x = bounds.width - extent.x - 6;
							break;
						case SWT.CENTER:
							x += (bounds.width - x - extent.x) / 2;
							break;
					}
				}
			} else {
				if (tree.getColumnCount() == 0) {
					x += 5;
				} else {
					int alignmnent = column.getAlignment();
					switch (alignmnent) {
						case SWT.LEFT:
							x += 5;
							break;
						case SWT.RIGHT:
							x = bounds.width - extent.x - 2;
							break;
						case SWT.CENTER:
							x += (bounds.width - x - extent.x) / 2 + 2;
							break;
					}
				}
			}
			int textY = (size.y - extent.y) / 2;
			gc.drawString(text, x, textY);
		}
		if (isFocusControl()) {
			gc.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
			gc.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
			gc.drawFocus(0, 0, size.x, size.y);
		}
	}

	/**
	 * Removes the listener from the collection of listeners who will
	 * be notified when the receiver's selection changes.
	 *
	 * @param listener
	 *            the listener which should no longer be notified
	 *
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 *                </ul>
	 *
	 * @see SelectionListener
	 * @see #addSelectionListener(SelectionListener)
	 *
	 * @since 3.0
	 */
	public void removeSelectionListener(SelectionListener listener) {
		checkWidget();
		if (listener == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		removeListener(SWT.Selection, listener);
		removeListener(SWT.DefaultSelection, listener);
	}

	@Override
	public void setBackground(Color color) {
		if (color == null) {
			color = getDisplay().getSystemColor(BACKGROUND);
		}
		super.setBackground(color);
		redraw();
	}

	@Override
	public void setForeground(Color color) {
		if (color == null) {
			color = getDisplay().getSystemColor(FOREGROUND);
		}
		super.setForeground(color);
		redraw();
	}

	void setRowColumn(TreeItem row, TreeColumn column, boolean notify) {
		if (this.row == row && this.column == column) {
			return;
		}
		if (this.row != null && this.row != row) {
			this.row.removeListener(SWT.Dispose, disposeItemListener);
			this.row = null;
		}
		if (this.column != null && this.column != column) {
			this.column.removeListener(SWT.Dispose, disposeColumnListener);
			this.column.removeListener(SWT.Move, resizeListener);
			this.column.removeListener(SWT.Resize, resizeListener);
			this.column = null;
		}
		if (row != null) {
			if (this.row != row) {
				this.row = row;
				row.addListener(SWT.Dispose, disposeItemListener);
				tree.showItem(row);
			}
			if (this.column != column && column != null) {
				this.column = column;
				column.addListener(SWT.Dispose, disposeColumnListener);
				column.addListener(SWT.Move, resizeListener);
				column.addListener(SWT.Resize, resizeListener);
				tree.showColumn(column);
			}
			int columnIndex = column == null
					? 0
					: tree.indexOf(column);
			setBounds(row.getBounds(columnIndex));
			redraw();
			if (notify) {
				Event event = new Event();
				event.item = row;
				notifyListeners(SWT.Selection, event);
			}
		}
	}

	/**
	 * Positions the TreeCursor over the cell at the given row and column in the parent table.
	 *
	 * @param row
	 *            the TreeItem of the row for the cell to select
	 * @param column
	 *            the index of column for the cell to select
	 *
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 *                </ul>
	 *
	 */
	public void setSelection(TreeItem row, int column) {
		checkWidget();
		int columnCount = tree.getColumnCount();
		int maxColumnIndex = columnCount == 0
				? 0
				: columnCount - 1;
		if (row == null || row.isDisposed() || column < 0 || column > maxColumnIndex) {
			SWT.error(SWT.ERROR_INVALID_ARGUMENT);
		}

		TreeColumn col = column == -1 || tree.getColumnCount() == 0
				? null
				: tree.getColumn(column);
		setRowColumn(row, col, true);
	}

	@Override
	public void setVisible(boolean visible) {
		checkWidget();
		if (visible) {
			_resize();
		}
		super.setVisible(visible);
	}

	void tableFocusIn(Event event) {
		if (isDisposed()) {
			return;
		}
		if (isVisible()) {
			setFocus();
		}
	}

	void tableMouseDown(Event event) {
		if (isDisposed() || !isVisible()) {
			return;
		}
		Point pt = new Point(event.x, event.y);
		int lineWidth = tree.getLinesVisible()
				? tree.getGridLineWidth()
				: 0;
		TreeItem item = tree.getItem(pt);
		if ((tree.getStyle() & SWT.FULL_SELECTION) != 0) {
			if (item == null) {
				return;
			}
		} else {
			int start = item != null
					? tree.indexOf(item)
					: tree.indexOf(tree.getTopItem());
			int end = tree.getItemCount();
			Rectangle clientRect = tree.getClientArea();
			for (int i = start; i < end; i++) {
				TreeItem nextItem = tree.getItem(i);
				Rectangle rect = nextItem.getBounds(0);
				if (pt.y >= rect.y && pt.y < rect.y + rect.height + lineWidth) {
					item = nextItem;
					break;
				}
				if (rect.y > clientRect.y + clientRect.height) {
					return;
				}
			}
			if (item == null) {
				return;
			}
		}
		TreeColumn newColumn = null;
		int columnCount = tree.getColumnCount();
		if (columnCount > 0) {
			for (int i = 0; i < columnCount; i++) {
				Rectangle rect = item.getBounds(i);
				rect.width += lineWidth;
				rect.height += lineWidth;
				if (rect.contains(pt)) {
					newColumn = tree.getColumn(i);
					break;
				}
			}
			if (newColumn == null) {
				newColumn = tree.getColumn(0);
			}
		}
		setRowColumn(item, newColumn, true);

		/*
		 * setFocus() causes flash; but without this, goes immediately into edit mode.
		 * Using setFocus() alos causes a false "Set Name" undo command in stack.
		 *
		 * see TreeEditorImpl.handleMouseDown() for cause of immediate edit mode
		 */
		// setFocus();
	}

	void traverse(Event event) {
		switch (event.detail) {
			case SWT.TRAVERSE_ARROW_NEXT:
			case SWT.TRAVERSE_ARROW_PREVIOUS:
			case SWT.TRAVERSE_RETURN:
				event.doit = false;
				return;
		}
		event.doit = true;
	}

}
