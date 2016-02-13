/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.util;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * A cell editor that presents a check box.
 * <p>
 * This class may be instantiated; it is not intended to be subclassed.
 * </p>
 */
public class CheckboxCellEditor extends CellEditor {

	protected boolean value;

	protected Button checkButton;

	/**
	 * Default CheckboxCellEditor style
	 */
	private static final int defaultStyle = SWT.NONE;

	/**
	 * Creates a new cell editor with no control. Initially,
	 * the cell editor has no cell validator.
	 */
	public CheckboxCellEditor() {
		setStyle(defaultStyle);
	}

	/**
	 * Creates a new checkbox cell editor parented under the given control.
	 * The cell editor value is a boolean value, which is initially <code>false</code>.
	 * Initially, the cell editor has no cell validator.
	 *
	 * @param parent
	 *            the parent control
	 */
	public CheckboxCellEditor(Composite parent) {
		this(parent, defaultStyle);
	}

	/**
	 * Creates a new checkbox cell editor parented under the given control.
	 * The cell editor value is a boolean value, which is initially <code>false</code>.
	 * Initially, the cell editor has no cell validator.
	 *
	 * @param parent
	 *            the parent control
	 * @param style
	 *            the style bits
	 * @since 2.1
	 */
	public CheckboxCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	/*
	 * (non-Javadoc)
	 * Method declared on CellEditor.
	 */
	@Override
	protected Control createControl(Composite parent) {

		checkButton = new Button(parent, SWT.CHECK);
		checkButton.pack();

		checkButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				keyReleaseOccured(e);
			}
		});

		checkButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent event) {
				applyEditorValueAndDeactivate();
			}

			@Override
			public void widgetSelected(SelectionEvent event) {
				applyEditorValueAndDeactivate();
			}
		});

		checkButton.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_ESCAPE || e.detail == SWT.TRAVERSE_RETURN) {
					e.doit = false;
				}
			}
		});

		checkButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				CheckboxCellEditor.this.focusLost();
			}
		});
		return checkButton;
	}

	/**
	 * The <code>CheckboxCellEditor</code> implementation of
	 * this <code>CellEditor</code> framework method returns
	 * the current Boolean value.
	 *
	 * @return the current Boolean value of check box
	 */
	@Override
	protected Object doGetValue() {
		return new Boolean(value);
	}

	/*
	 * (non-Javadoc)
	 * Method declared on CellEditor.
	 */
	@Override
	protected void doSetFocus() {
		checkButton.setFocus();
	}

	/**
	 * The <code>CheckboxCellEditor</code> implementation of
	 * this <code>CellEditor</code> framework method
	 * accepts a Boolean value.
	 *
	 * @param value
	 *            the Boolean value of check box
	 */
	@Override
	protected void doSetValue(Object value) {
		Assert.isTrue(value instanceof Boolean);
		this.value = ((Boolean) value).booleanValue();
		checkButton.setSelection(this.value);
	}

	/**
	 * Applies the currently selected value and deactiavates the cell editor
	 */
	void applyEditorValueAndDeactivate() {
		value = checkButton.getSelection();

		fireApplyEditorValue();
		deactivate();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.CellEditor#focusLost()
	 */
	@Override
	protected void focusLost() {
		if (isActivated()) {
			applyEditorValueAndDeactivate();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.CellEditor#keyReleaseOccured(org.eclipse.swt.events.KeyEvent)
	 */
	@Override
	protected void keyReleaseOccured(KeyEvent keyEvent) {
		if (keyEvent.character == '\u001b') { // Escape character
			fireCancelEditor();
		} else if (keyEvent.character == '\t') { // tab key
			applyEditorValueAndDeactivate();
		}
	}
}
