/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.cda.core.util;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

/**
 * Associates model elements to a Status
 */
public class ModelStatus extends Status {

	private EObject[] participants;

	public ModelStatus(int severity, String pluginId, int code, String message, Throwable exception,
			EObject... participants) {
		super(severity, pluginId, code, message, exception);
		this.participants = participants;
	}

	public EObject[] getParticipants() {
		return participants;
	}

}
