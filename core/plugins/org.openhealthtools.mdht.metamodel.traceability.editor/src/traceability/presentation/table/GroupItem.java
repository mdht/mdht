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

import java.util.ArrayList;
import java.util.List;

/**
 * In tables with a tree, this class is used to wrap all row elements
 */
public class GroupItem {

	public Object element;

	/**
	 * For table trees, stores the children of each table parent item
	 */
	public List<Object> childrenOf = new ArrayList<Object>();

	public GroupItem(Object element) {
		this.element = element;
	}

	public void addChild(Object child) {
		if (!this.childrenOf.contains(child))
			this.childrenOf.add(child);
	}

}
