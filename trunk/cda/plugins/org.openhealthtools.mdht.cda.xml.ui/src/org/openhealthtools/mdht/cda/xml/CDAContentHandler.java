package org.openhealthtools.mdht.cda.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.xerces.parsers.SAXParser;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.XMLContentDescriber;
import org.eclipse.core.runtime.content.XMLRootElementContentDescriber2;
import org.eclipse.emf.common.util.URI;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class CDAContentHandler extends XMLContentDescriber  {

	@Override
	public int describe(InputStream input, IContentDescription description) throws IOException {

		int result = INVALID;

		if (super.describe(input, description) == VALID) {
			try {
				ClinicalDocument clinicalDocument = CDAUtil.load(input);
				result = VALID;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		return result;
		
	}

	
//	XMLRootElementContentDescriber2 asdf;
	
//	
//	org.eclipse.core.runtime.content.XMLRootElementContentDescriber asdf;
//	
//	public CDAContentHandler() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int describe(InputStream input, IContentDescription description) throws IOException {
//		
//		int result = INVALID;
//		
//		
//		try {
//			ClinicalDocument clinicalDocument = CDAUtil.load(input);
//			result = VALID;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//		}
//		
//		return result;
//		
//		/*
//		 * 	ClinicalDocument clinicalDocument;
//
//		try {
//			URI hl7ModelURI = URI.createURI(uri);
//
//			if (hl7ModelURI.isFile()) {
//				
//				InputSource inputSource = new InputSource(hl7ModelURI.path());
//
//				inputSource.setEncoding("UTF-8");
//				
//				XMLReader parser = new SAXParser();
//
//				// Install the Content Handler
//				final XPathIndexer xpathIndexer = new XPathIndexer();
//
//				parser.setContentHandler(xpathIndexer);
//
//				parser.parse(hl7ModelURI.path());
//
//				clinicalDocument = CDAUtil.load(inputSource);
//
//		 */
//		
//		
//		// TODO Auto-generated method stub
////		return super.describe(input, description);
//	}
//
//	@Override
//	public int describe(Reader input, IContentDescription description) throws IOException {
//		// TODO Auto-generated method stub
//		return super.describe(input, description);
//	}
//
//	@Override
//	public QualifiedName[] getSupportedOptions() {
//		// TODO Auto-generated method stub
//		return super.getSupportedOptions();
//	}

}
