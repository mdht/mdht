package org.openhealthtools.mdht.cts2.handlers;

import org.openhealthtools.mdht.cts2.cache.CTS2Service;

public class NCIThesaurusHandler extends CTS2Service {

	private static String SERVICE_NAME = "NCI Thesaurus";

	private static String SERVICE_URL = "http://informatics.mayo.edu/cts2/services/py4cts2/cts2";

	public static String ROOT_ENTITY_URI = "http://snomed.info/id/138875005";

	public static String ROOT_ENTITY_ID = "138875005";

	public NCIThesaurusHandler() {
		super(SERVICE_NAME, SERVICE_URL);
	}

	@Override
	public String getRootConceptURI() {
		return ROOT_ENTITY_URI;
	}

}
