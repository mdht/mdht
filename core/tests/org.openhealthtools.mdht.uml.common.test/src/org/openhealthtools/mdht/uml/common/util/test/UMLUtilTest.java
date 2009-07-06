package org.openhealthtools.mdht.uml.common.util.test;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class UMLUtilTest extends TestCase {

	public final void testGetAllParentNames() {
		
		String[] names = new String[] { "org.openhealthtools.mdht.uml.parent", "org.openhealthtools.mdht.uml.child1", "org.openhealthtools.mdht.uml.child2" };

		
		Class generalization = null;
		for (String name : names) {

			Class current = UMLFactory.eINSTANCE.createClass();
			current.setName(name);
			if (generalization != null) {
				current.getGenerals().add(generalization);
			}
			generalization = current;
		}

		List<String> results = UMLUtil.getAllParentNames(generalization);
		
		// Results should be in reverse order
		Collections.reverse(results);

		for (int index = 0; index < results.size(); index++) {
			if (!names[index].equals(results.get(index))) {
				System.out.println(names[index] + " verus "+results.get(index));
				fail("testGetAllParentNames"); 	
			
				
//				fail("testGetAllParentNames "); // + names[index] + " not equal to " + results.get(index));
			}
		}	
		
	 		

	}

	public final void testGetClassifierByNamePackageString() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetClassByName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetDataTypeByName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetEnumerationByName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetClassifierByNamePackageStringEClass() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetTopPackagePackage() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetTopPackageNamedElement() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetNearestNamespace() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetUniqueTypeName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetUniqueNestedClassifierName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetPackageQualifiedName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testCloneStereotypesElementElement() {
		fail("Not yet implemented"); // TODO
	}

	public final void testCloneStereotypesClassClass() {
		fail("Not yet implemented"); // TODO
	}

	public final void testAddAliasName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testSetEObjectIDElement() {
		fail("Not yet implemented"); // TODO
	}

	public final void testSetEObjectIDGeneralization() {
		fail("Not yet implemented"); // TODO
	}

	public final void testSetEObjectIDAssociation() {
		fail("Not yet implemented"); // TODO
	}

	public final void testSetEObjectIDElementString() {
		fail("Not yet implemented"); // TODO
	}

	public final void testImportLibrary() {
		fail("Not yet implemented"); // TODO
	}

	public final void testIsTemplateBinding() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetTemplate() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetTemplateBindingParameters() {
		fail("Not yet implemented"); // TODO
	}

}
