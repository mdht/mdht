package org.openhealthtools.mdht.api.schematron.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Class;

/**
 * Manages the resources for a given entity (that determines their filenames), namely one XPath resource and one entity file
 */
public class EntityResources {

	public String fileName;
	public StringBuilder xpathResource;
	public StringBuilder asserts = new StringBuilder();
	public String entId;
	public String patternId;
	public List<String> assertNames = new ArrayList<String>();
	public Class context;

	public EntityResources(String fileName, String entId, String patternId, String template) {
		this.fileName = fileName;
		this.entId = entId;
		this.patternId = patternId;
		this.xpathResource = new StringBuilder(template.replace("{tab}", "\t").replace("{newline}", "\n").replace("{", "").replace("}", ""));
	}
}
