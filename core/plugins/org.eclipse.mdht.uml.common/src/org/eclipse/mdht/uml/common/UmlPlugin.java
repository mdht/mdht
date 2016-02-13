/*******************************************************************************
 * Copyright (c) 2014 National E-Health Transition Authority (NEHTA)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.osgi.framework.BundleContext;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author seanmuir
 *
 */
public class UmlPlugin extends EMFPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.mdht.uml.common";

	/**
	 * The singleton instance of the plugin.
	 */
	public static final UmlPlugin INSTANCE = new UmlPlugin();

	/**
	 * Creates the singleton instance.
	 */
	private UmlPlugin() {
		super(new ResourceLocator[] {});
	}

	/**
	 * The plugin singleton
	 */
	private static Implementation plugin;

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	public static void computeModelPathMapExtensions() {

		if (EMFPlugin.IS_ECLIPSE_RUNNING) {
			IWorkspaceRoot root = EcorePlugin.getWorkspaceRoot();
			if (root != null) {
				IProject[] projects = root.getProjects();
				if (projects != null) {

					for (int i = 0, size = projects.length; i < size; ++i) {
						IProject project = projects[i];
						if (project.isOpen()) {

							final IFile plugin = project.getFile("plugin.xml");
							if (plugin.exists()) {
								try {
									processPluginXML(project.getName(), plugin.getContents(true));
								} catch (Exception exception) {

								}
							}

						}
					}
				}
			}
		} else {
			computeModelPathMapsFromPath();
		}

	}

	private static void computeModelPathMapsFromPath() {

		final String PATH_SEPARATOR = System.getProperty("path.separator");

		final String JAVA_CLASSPATH = System.getProperty("java.class.path");

		final String BIN = "bin";

		final String PLUGINXML = "plugin.xml";

		StringTokenizer st = new StringTokenizer(JAVA_CLASSPATH, PATH_SEPARATOR);

		while (st.hasMoreTokens()) {

			String path = st.nextToken();

			if (path.endsWith(".jar") || (path.endsWith(".zip"))) {
				// try {
				// processPluginXML(new ZipFile(path));
				// } catch (Exception e) {
				// e.printStackTrace();
				// // If there is an issue loading the plugin jar - we let
				// // normal processing continue
				// }
			} else if (path.endsWith(BIN)) {

				String pluginPath = path.substring(0, path.lastIndexOf(BIN)) + PLUGINXML;
				try {
					FileInputStream pluginInputSteam = new FileInputStream(pluginPath);
					processPluginXML(pluginPath.substring(0, pluginPath.lastIndexOf(PLUGINXML)), pluginInputSteam);
				} catch (Exception e) {

				}

			}
		}
		return;
	}

	private static void processPluginXML(String location, InputStream pluginStream)
			throws SAXException, IOException, ParserConfigurationException, XPathExpressionException,
			ClassNotFoundException, SecurityException, NoSuchFieldException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		factory.setNamespaceAware(true);

		DocumentBuilder builder;

		Document doc = null;

		XPathExpression expr = null;

		builder = factory.newDocumentBuilder();

		doc = builder.parse(new InputSource(pluginStream));

		XPathFactory xFactory = XPathFactory.newInstance();

		XPath xpath = xFactory.newXPath();

		expr = xpath.compile("//plugin/extension[@point='org.eclipse.emf.ecore.uri_mapping']/mapping");

		Object result = expr.evaluate(doc, XPathConstants.NODESET);

		NodeList nodes = (NodeList) result;

		for (int i = 0; i < nodes.getLength(); i++) {
			String source = nodes.item(i).getAttributes().getNamedItem("source").getNodeValue();
			String target = nodes.item(i).getAttributes().getNamedItem("target").getNodeValue();
			URI key = URI.createURI(source);

			URI value = null;
			if (EMFPlugin.IS_ECLIPSE_RUNNING) {
				value = URI.createURI("platform:/plugin/" + location + "/" + target);
			} else {

				value = URI.createURI("file://" + location + target);
			}

			org.eclipse.emf.ecore.resource.URIConverter.URI_MAP.put(key, value);
		}
	}

	public static URI getPathMap(InputStream pluginStream)
			throws SAXException, IOException, ParserConfigurationException, XPathExpressionException,
			ClassNotFoundException, SecurityException, NoSuchFieldException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		factory.setNamespaceAware(true);

		DocumentBuilder builder;

		Document doc = null;

		XPathExpression expr = null;

		builder = factory.newDocumentBuilder();

		doc = builder.parse(new InputSource(pluginStream));

		XPathFactory xFactory = XPathFactory.newInstance();

		XPath xpath = xFactory.newXPath();

		expr = xpath.compile("//plugin/extension[@point='org.eclipse.emf.ecore.uri_mapping']/mapping");

		Object result = expr.evaluate(doc, XPathConstants.NODESET);

		URI key = null;
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {
			String source = nodes.item(i).getAttributes().getNamedItem("source").getNodeValue();
			nodes.item(i).getAttributes().getNamedItem("target").getNodeValue();
			key = URI.createURI(source + "/");
		}

		return key;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {

		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}

		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);

			computeModelPathMapExtensions();

		}

	}

}
