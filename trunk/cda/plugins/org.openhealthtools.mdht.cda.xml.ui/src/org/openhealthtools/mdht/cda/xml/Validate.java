package org.openhealthtools.mdht.cda.xml;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TimerTask;
import java.util.zip.ZipFile;

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
		
//		System.out.println("CCCCCCCCCCCCCCCCCCCCCCccc");
		
		CDAUtil.loadPackages();
		
		final String PATH_SEPARATOR = System.getProperty("path.separator");

		final String JAVA_CLASSPATH = System.getProperty("java.class.path");

		StringTokenizer st = new StringTokenizer(JAVA_CLASSPATH, PATH_SEPARATOR);

		while (st.hasMoreTokens()) {
			
			
			
			String path = st.nextToken();
			
//			System.out.println("PPPPPPPPPPPPPP"+path);
			
//			if (path.endsWith(".jar") || (path.endsWith(".zip"))) {
//				try {
////					processModelPlugin(new ZipFile(path));
//				} catch (Exception e) {
//					e.printStackTrace();
//					// If there is an issue loading the plugin jar - we let
//					// normal processing continue
//				}
//			}
		}
		
//		System.out.println("ddddddddddddddddddddCccc");

		try {
			
//			System.out.println(args[0]);
//			System.out.println(args[1]);
//			System.out.println(args[2]);
			
			URI cdaURI = URI.createURI(args[0]);

			URI output = URI.createURI(args[1]);
			
			URI lock = URI.createURI(args[2]);

			if (cdaURI.isFile()) {

				InputSource inputSource = new InputSource(cdaURI.path());

				inputSource.setEncoding("UTF-8");

				OutputStream fout = new FileOutputStream(output.toFileString());
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

//						System.out.println(diagnostic.getMessage());

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

//						System.out.println(diagnostic.getMessage());
						
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
				
//				System.out.println("foooo");

				File lockFile = new File(lock.toFileString());
				
				lockFile.delete();
				
//				lock.to

			}

		} catch (Exception e1) {
		
			e1.printStackTrace();
		}

	}
	
	


}
