
package org.openhealthtools.mdht.builder.examples;

import org.openhealthtools.mdht.builder.cda.ClinicalDocumentBuilder;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class BuildClinicalDocumentExample {

	public static void main(String[] args) {

		ClinicalDocumentBuilder exampleClinicalDocumentBuilder = new ClinicalDocumentBuilder() {


		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
