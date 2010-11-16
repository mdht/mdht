package org.openhealthtools.mdht.cda.xml;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.apache.xerces.parsers.SAXParser;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class Validate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClinicalDocument clinicalDocument;
		
		CDAUtil.loadPackages();
		
		try {
			
			URI cdaURI = URI.createURI(args[0]);

			if (cdaURI.isFile()) {

				InputSource inputSource = new InputSource(cdaURI.path());

				inputSource.setEncoding("UTF-8");

				OutputStream fout = new FileOutputStream(args[1]);
				OutputStream bout = new BufferedOutputStream(fout);
				final OutputStreamWriter out = new OutputStreamWriter(bout);

				XMLReader parser = new SAXParser();

				// Install the Content Handler
				final XPathIndexer xpathIndexer = new XPathIndexer();

				parser.setContentHandler(xpathIndexer);

				parser.parse(cdaURI.path());

				clinicalDocument = CDAUtil.load(inputSource);

				CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {

					public void handleError(Diagnostic diagnostic) {

						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = Validator.getPath((EObject) diagnostic.getData().get(0));
						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("error" + "," + eld.line + "," + eld.column + "," + diagnostic.getMessage() + "\n");
							} else {
								out.write("error" + "," + 0 + "," + 0 + "," + diagnostic.getMessage() + "(" + path + ")" + "\n");
							}

						} catch (IOException e) {
							e.printStackTrace();
						}

					}

					public void handleInfo(Diagnostic diagnostic) {

					}

					public void handleWarning(Diagnostic diagnostic) {
						
						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = Validator.getPath((EObject) diagnostic.getData().get(0));

						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());

						try {
							if (eld != null) {
								out.write("warning" + "," + eld.line + "," + eld.column + "," + diagnostic.getMessage() + "\n");
							} else {
								out.write("warning" + "," + 0 + "," + 0 + "," + diagnostic.getMessage() + "(" + path + ")" + "\n");
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				});

				out.flush();
				out.close();
				
				File lockFile = new File(args[2]);
				
				lockFile.delete();

			}

		} catch (Exception e1) {
		
			e1.printStackTrace();
		}

	}
	
	


}
