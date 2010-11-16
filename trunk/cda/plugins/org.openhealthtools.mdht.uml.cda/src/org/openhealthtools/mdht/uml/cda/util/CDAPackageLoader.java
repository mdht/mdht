/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * CDAPackageLoader is a utility class for non eclipse environment cda
 * applications can use to properly initialize emf plugins which are normally
 * intialized within the eclipse environment through the
 * org.eclipse.emf.ecore.generated_package extension
 * 
 */
public class CDAPackageLoader {

	
	private static boolean packagesLoaded = false;

	public static boolean isPackagesLoaded() {
		return packagesLoaded;
	}

	/**
	 * loadCDAPackagesFormClassPath will use the java class path and attempt to
	 * load an plugins that have defined generated_package extension
	 */
	protected static final void loadPackages() {

		if (!packagesLoaded) {
			final String PATH_SEPARATOR = System.getProperty("path.separator");

			final String JAVA_CLASSPATH = System.getProperty("java.class.path");

			StringTokenizer st = new StringTokenizer(JAVA_CLASSPATH, PATH_SEPARATOR);

			while (st.hasMoreTokens()) {

				String path = st.nextToken();

				if (path.endsWith(".jar") || (path.endsWith(".zip"))) {
					try {
						processModelPlugin(new ZipFile(path));
					} catch (Exception e) {
						e.printStackTrace();
						// If there is an issue loading the plugin jar - we let
						// normal processing continue
					}
				} else if (path.endsWith("/bin"))
				{
					
					String pluginPath = path.replaceAll("/bin", "/plugin.xml");

					try {
						FileInputStream pluginInputSteam = new FileInputStream(pluginPath);
						processPluginXML(pluginInputSteam);
					} catch (Exception e) {
					
					}
					
				}
			}
			packagesLoaded = true;
		}
		
		return;
	}

	/**
	 * loadPackages takes a directory location and loads all jars in
	 * the subdirectory which have defined generated_package extension
	 * 
	 * @param dir
	 */
	protected static final void loadPackages(String dir) {

		if (!packagesLoaded) {
			File directory = new File(dir);

			File[] files = directory.listFiles();

			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().endsWith(".jar") && files[i].exists()) {
					try {
						processModelPlugin(new ZipFile(files[i]));
					} catch (Exception e) {
						e.printStackTrace();
						// If there is an issue loading the plugin jar - we let
						// normal processing continue
					}
				}
			}
			packagesLoaded = true;
		}
		return;
	}

	private static void processModelPlugin(ZipFile zipFile) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, ClassNotFoundException,
			SecurityException, NoSuchFieldException {
		
		// Get the plugin.xml
		ZipEntry pluginEntry = zipFile.getEntry("plugin.xml");
		
		// if it has a plugin xml
		if (pluginEntry != null) {

			processPluginXML(zipFile.getInputStream(pluginEntry));
			
		}
	}
	
	private static void processPluginXML(InputStream pluginStream) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, ClassNotFoundException, SecurityException, NoSuchFieldException
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		factory.setNamespaceAware(true);
		
		DocumentBuilder builder;
		
		Document doc = null;
		
		XPathExpression expr = null;
		
		builder = factory.newDocumentBuilder();
		
		doc = builder.parse(new InputSource(pluginStream)); //zipFile.getInputStream(pluginEntry)));

		XPathFactory xFactory = XPathFactory.newInstance();
		
		XPath xpath = xFactory.newXPath();

		expr = xpath.compile("//plugin/extension[@point='org.eclipse.emf.ecore.generated_package']/package");

		Object result = expr.evaluate(doc, XPathConstants.NODESET);

		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {

			String packageClass = nodes.item(i).getAttributes().getNamedItem("class").getNodeValue();

			// initializes the CDA package
			if (packageClass != null) {
				Class<?> c = Class.forName(packageClass);
				c.getDeclaredField("eINSTANCE");
			}

		}
	}
	

}
