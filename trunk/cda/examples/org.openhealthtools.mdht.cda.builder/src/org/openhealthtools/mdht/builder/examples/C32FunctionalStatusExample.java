/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.examples;

import java.io.FileOutputStream;

import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * C32Example is an example implementation of the MDHT
 * DocumentBuilder based on the GOF BuilderPattern. see
 * http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example uses C32DocumentBuilder which creates the minimum structures to create valid (no errors) C32 V2.5
 * 
 */
public class C32FunctionalStatusExample {


	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public FunctionalStatusSectionBuilder getFunctionalStatusSectionBuilder() {
				return new FunctionalStatusSectionBuilder()
				{

			
					
				};
			}

		

		};

		try {
			
			
			

			System.out.println("Start C32 Document Build Example");
			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();
			CDAUtil.save(clinicalDocument, new FileOutputStream("/home/eclipse/heliosworkspaceG/org.openhealthtools.mdht.cda.builder/resource/ExampleC32FunctionalStatus.xml"));
			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
