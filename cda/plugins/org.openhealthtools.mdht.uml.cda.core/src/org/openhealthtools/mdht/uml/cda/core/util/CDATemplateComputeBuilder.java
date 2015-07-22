/*******************************************************************************
 * Copyright (c) 2015 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sarp Kaya (NEHTA)  - initial implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.util;

public abstract class CDATemplateComputeBuilder {

	private String templateVersion;

	private boolean markup = false;

	private boolean cardinalityAfterElement = false;

	private String templateId;

	private String ruleIds;

	private String multiplicity;

	public static String getMultiplicityRange(String multiplicity) {
		System.out.println("getmultiplicity val is " + multiplicity);
		if (multiplicity == null) // default
			return "1..1";
		return multiplicity;
	}

	public CDATemplateComputeBuilder setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		return this;
	}

	public CDATemplateComputeBuilder setTemplateId(String templateId) {
		this.templateId = templateId;
		return this;
	}

	public CDATemplateComputeBuilder setRuleIds(String ruleIds) {
		this.ruleIds = ruleIds;
		return this;
	}

	public CDATemplateComputeBuilder setRequireMarkup(Boolean markup) {
		this.markup = markup;
		return this;
	}

	public CDATemplateComputeBuilder setCardinalityAfterElement(Boolean cardinalityAfterElement) {
		this.cardinalityAfterElement = cardinalityAfterElement;
		return this;
	}

	public CDATemplateComputeBuilder setMultiplicity(String multiplicityRange) {
		this.multiplicity = multiplicityRange;
		return this;
	}

	public CDATemplateComputeBuilder compute() {
		return this;
	}

	public abstract String addMultiplicity();

}
