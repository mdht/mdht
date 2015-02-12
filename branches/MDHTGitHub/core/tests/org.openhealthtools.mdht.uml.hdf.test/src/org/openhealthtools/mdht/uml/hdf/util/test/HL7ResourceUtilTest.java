package org.openhealthtools.mdht.uml.hdf.util.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;

import junit.framework.TestCase;

public class HL7ResourceUtilTest extends TestCase {
	
	
	Package testPackage = null;


	protected void setUp() throws Exception {

		testPackage = UMLFactory.eINSTANCE.createPackage();
	
		super.setUp();
	}

	

	public void testGetBooleanPreference() {
		fail("Not yet implemented");
	}

	public void testGetStringPreference() {
		fail("Not yet implemented");
	}

	public void testGetLongPreference() {
		fail("Not yet implemented");
	}

	public void testGetAppliedHDFStereotype() {
		fail("Not yet implemented");
	}

	public void testApplyHDFStereotype() {
		fail("Not yet implemented");
	}

	public void testUnapplyHDFStereotype() {
		fail("Not yet implemented");
	}

	public void testGetAppliedHDFProfile() {
		fail("Not yet implemented");
	}

	public void testApplyHDFProfile() {
		fail("Not yet implemented");
	}

	public void testGetAppliedRIMStereotype() {
		fail("Not yet implemented");
	}

	public void testApplyRIMStereotype() {
		fail("Not yet implemented");
	}

	public void testGetAppliedRIMProfile() {
		fail("Not yet implemented");
	}

	
	
	
	public void testApplyRIMProfile() {
	
		  File dir1 = new File ("junittest.emx");
		     File dir2 = new File ("..");
		       try {
				System.out.println ("Current dir : " + dir1.getCanonicalPath());
				System.out.println ("Current dir : " + dir1.getAbsolutePath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		URI uri = URI.createFileURI(dir1.getAbsolutePath());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		// load the models
		
		
//		String modelName = uri.lastSegment();
//		modelName = modelName.substring(0, modelName.lastIndexOf("."));
		
		Model defaultModel = UMLFactory.eINSTANCE.createModel();
		defaultModel.setName("TEST");
		Resource modelResource = resourceSet.createResource(uri);
		modelResource.getContents().add(defaultModel);
		
		
//		
//		/* Resource set to contain loaded MIF resources */
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//
//		
//		Model model = UMLFactory.eINSTANCE.createModel();
//		
//		model.setName("JUnitTestModel");
//		
		Profile rimProfile = HL7ResourceUtil.applyRIMProfile(defaultModel);
//		
		assertNotNull(rimProfile);
//		
	}
	
	
	

}
