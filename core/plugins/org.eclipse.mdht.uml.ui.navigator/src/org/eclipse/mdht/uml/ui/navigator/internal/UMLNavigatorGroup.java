/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.navigator.internal;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.mdht.uml.ui.navigator.UMLAbstractNavigatorItem;

public class UMLNavigatorGroup extends UMLAbstractNavigatorItem {

	private String myGroupName;

	private String myIcon;

	private Collection myChildren = new LinkedList();

	UMLNavigatorGroup(String groupName, String icon, Object parent) {
		super(parent);
		myGroupName = groupName;
		myIcon = icon;
	}

	public String getGroupName() {
		return myGroupName;
	}

	public String getIcon() {
		return myIcon;
	}

	public Object[] getChildren() {
		return myChildren.toArray();
	}

	public void addChildren(Collection children) {
		myChildren.addAll(children);
	}

	public void addChild(Object child) {
		myChildren.add(child);
	}

	public boolean isEmpty() {
		return myChildren.size() == 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup anotherGroup = (UMLNavigatorGroup) obj;
			if (getGroupName().equals(anotherGroup.getGroupName())) {
				return getParent().equals(anotherGroup.getParent());
			}
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return getGroupName().hashCode();
	}

}
