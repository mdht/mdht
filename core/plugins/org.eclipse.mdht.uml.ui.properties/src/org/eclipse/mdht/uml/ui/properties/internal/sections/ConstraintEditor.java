/*******************************************************************************
 * Copyright (c) 2015 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Constraint;

/**
 * @author seanmuir
 *
 */
public interface ConstraintEditor {
	void setText(Text text);

	void setConstraint(Constraint constraint);

	void setErrorText(Text errorText);

	void setCloseErrorText(Button closeErrorTextButton);

	void setDitaEnabled(boolean isEnabled);

	/*
	 * retrun the value of DITA enabled plugin
	 */
	boolean isDitaEnabled();
}
