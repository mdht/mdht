/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Calls @TraceabilityViewer#handleLeftCtrlClick() when left mouse is clicked and Ctrl is pressed
 */
public class TraceabilityMouseListener implements MouseListener {

	private final TraceabilityViewer xViewer;
	private MouseEvent leftClickEvent;

	public TraceabilityMouseListener(TraceabilityViewer xViewer) {
		this.xViewer = xViewer;
	}

	@Override
	public void mouseDoubleClick(MouseEvent e) {
		// nothing to do
	}

	@Override
	public void mouseDown(MouseEvent event) {
		if (isLeftClick(event)) {
			leftClickEvent = event;
		}
	}

	private boolean isRightClick(MouseEvent event) {
		return event.button == 3;
	}

	@Override
	public void mouseUp(MouseEvent event) {
		TreeItem item = xViewer.getItemUnderMouseClick(new Point(event.x, event.y));
		if (item == null) {
			return;
		}

		try {
			TreeColumn column = xViewer.getColumnUnderMouseClick(new Point(event.x, event.y));
			if (column == null) {
				return;
			}
			if (isLeftClick(event) && shiftBeingHeld(event)) {

				if (altIsBeingHeld(event)) {
					// do nothing
				} else {
					// System.out.println("Column " + colNum);
					xViewer.handleLeftShiftClick(column, item);
				}
			}
			xViewer.updateStatusLabel();
		} catch (ArrayIndexOutOfBoundsException ex) {
			// mouse clicked outside of last/valid column
			return;
		}

	}

	public boolean shiftBeingHeld(MouseEvent event) {
		return ((event.stateMask & SWT.MODIFIER_MASK) == SWT.SHIFT) || ((event.stateMask & SWT.MODIFIER_MASK) == SWT.CTRL) || ((event.stateMask & SWT.MODIFIER_MASK) == SWT.COMMAND);
	}

	private boolean isLeftClick(MouseEvent event) {
		return event.button == 1;
	}

	private boolean altIsBeingHeld(MouseEvent event) {
		return ((event.stateMask & SWT.MODIFIER_MASK) == SWT.ALT);
	}

	private boolean controlNotBeingHeld(MouseEvent event) {
		return !controlBeingHeld(event);
	}

	private boolean controlBeingHeld(MouseEvent event) {
		return ((event.stateMask & SWT.MODIFIER_MASK) == SWT.CTRL);
	}

	public MouseEvent getLeftClickEvent() {
		return leftClickEvent;
	}

}
