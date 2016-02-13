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
package org.eclipse.mdht.uml.cda.core.util;

import org.apache.commons.lang.StringUtils;

public abstract class CDATemplateComputeBuilder {

	private String templateVersion;

	private boolean markup = false;

	private String ruleIds;

	private String multiplicity;

	private String content;

	public static String getMultiplicityRange(String multiplicity) {
		if (multiplicity == null) {
			return "1..1";
		}
		return multiplicity.trim();
	}

	public CDATemplateComputeBuilder setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		return this;
	}

	public CDATemplateComputeBuilder setRuleIds(String ruleIds) {
		if (ruleIds != null && !ruleIds.trim().isEmpty()) {
			this.ruleIds = " ( " + ruleIds + " )";
		} else {
			this.ruleIds = "";
		}

		return this;
	}

	public CDATemplateComputeBuilder setRequireMarkup(Boolean markup) {
		this.markup = markup;
		return this;
	}

	public CDATemplateComputeBuilder setMultiplicity(String multiplicityRange) {
		this.multiplicity = multiplicityRange.trim();
		return this;
	}

	public CDATemplateComputeBuilder compute() {
		StringBuilder content = new StringBuilder();
		content.append(getSeverityContain());
		content.append(getMultiplicityText());
		content.append(addTemplateIdMultiplicity());
		content.append(ruleIds);
		content.append(" such that it ");
		if (markup) {
			content.append("<ol><li>");
		}
		content.append(getSeverityContain());
		content.append("exactly one");
		content.append(addRootMultiplicity());
		if (markup) {
			content.append("</li>");
		}
		if (!StringUtils.isEmpty(templateVersion)) {
			if (markup) {
				content.append(" <li>");
			} else {
				content.append(" and ");
			}
			content.append(getSeverityContain());
			content.append("exactly one");
			content.append(addTemplateVersion());
			if (markup) {
				content.append("</li>");
			}
		}
		if (markup) {
			content.append("</ol>");
		}
		this.content = content.toString();
		return this;
	}

	@Override
	public String toString() {
		if (content == null) {
			return super.toString();
		}
		return content;
	}

	public abstract String addTemplateIdMultiplicity();

	public abstract String addRootMultiplicity();

	public abstract String addTemplateVersion();

	private String getSeverityContain() {
		StringBuilder content = new StringBuilder();
		if (markup) {
			content.append("<b>");
		}
		content.append("SHALL");
		if (markup) {
			content.append("</b>");
		}
		content.append(" contain ");
		return content.toString();
	}

	private String getMultiplicityText() {
		if ("[1..1]".equals(multiplicity)) {
			return "exactly one";
		}
		if ("[1..*]".equals(multiplicity)) {
			return "at least one";
		}
		System.err.println("Used unexpected multiplicity " + multiplicity);
		return "";
	}

}
