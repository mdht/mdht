package org.openhealthtools.mdht.uml.common.util.test;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;

public class UMLUtilTest extends TestCase {

	Package testPackage = null;

	Package subPackage = null;

	NamedElement subElement = null;

	final static String UNIQUECLASSNAME = "UniqueClassName";

	final static String UNIQUEDATATYPENAME = "UniqueDataTypeName";

	final static String UNIQUEENUMERATIONNAME = "UniqueEnumerationName";

	final static String UNIQUEPACKAGENAME = "UniquePackageName";

	final static String NONAME = "NoNameNoNameNoNameNoName";

	final static String SAMENAME = "SameNameSameNameSameNameSameNameSameNameSameName";

	final static String SUBPACKAGENAME = "SubPackageName";

	final static String SUBELEMENTNAME = "SubElementName";

	protected void setUp() throws Exception {

		testPackage = UMLFactory.eINSTANCE.createPackage();

		subPackage = (Package) testPackage.createPackagedElement(SUBPACKAGENAME, testPackage.eClass());

		subElement = subPackage.createOwnedClass(SUBELEMENTNAME, false);

		testPackage.createOwnedPrimitiveType(UNIQUEDATATYPENAME);

		testPackage.createOwnedClass(UNIQUECLASSNAME, false);

		testPackage.createOwnedEnumeration(UNIQUEENUMERATIONNAME);

		testPackage.createOwnedPrimitiveType(SAMENAME);

		testPackage.createOwnedClass(SAMENAME, false);

		testPackage.createOwnedEnumeration(SAMENAME);

		super.setUp();
	}

	
	public final void testVocabAll()
	{
		try{
		EDataType eDataType=null;
		String literalValue="ActClass";
		ActClass ac = (ActClass) VocabFactory.eINSTANCE.createFromString(eDataType, literalValue);
		} catch(Exception e)
		{
			
		}
	}
	
	
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

			assertEquals(names[index], results.get(index));

		}

	}

	public final void testGetClassifierByNamePackageString() {

		Classifier classifierByName = UMLUtil.getClassifierByName(testPackage, UNIQUECLASSNAME);

		assertNotNull(classifierByName);

		assertEquals(classifierByName.getName(), UNIQUECLASSNAME);

		classifierByName = UMLUtil.getClassifierByName(testPackage, NONAME);

		assertNull(classifierByName);

		classifierByName = UMLUtil.getClassifierByName(testPackage, null);

		assertNull(classifierByName);

		classifierByName = UMLUtil.getClassifierByName(null, null);

		assertNull(classifierByName);

	}

	public final void testGetClassByName() {

		Class classByName = UMLUtil.getClassByName(testPackage, UNIQUECLASSNAME);

		assertNotNull(classByName);

		assertEquals(classByName.getName(), UNIQUECLASSNAME);

		classByName = UMLUtil.getClassByName(testPackage, SAMENAME);

		assertNotNull(classByName);

		assertEquals(classByName.getName(), SAMENAME);

		classByName = UMLUtil.getClassByName(testPackage, NONAME);

		assertNull(classByName);

		classByName = UMLUtil.getClassByName(testPackage, null);

		assertNull(classByName);

		classByName = UMLUtil.getClassByName(null, null);

		assertNull(classByName);

	}

	public final void testGetDataTypeByName() {
		fail("Not yet implemented"); // TODO
	}

	public final void testGetEnumerationByName() {

		Enumeration enumerationByName = UMLUtil.getEnumerationByName(testPackage, UNIQUEENUMERATIONNAME);

		assertNotNull(enumerationByName);

		assertEquals(enumerationByName.getName(), UNIQUEENUMERATIONNAME);

		enumerationByName = UMLUtil.getEnumerationByName(testPackage, SAMENAME);

		assertNotNull(enumerationByName);

		assertEquals(enumerationByName.getName(), SAMENAME);

		enumerationByName = UMLUtil.getEnumerationByName(testPackage, NONAME);

		assertNull(enumerationByName);

		enumerationByName = UMLUtil.getEnumerationByName(testPackage, null);

		assertNull(enumerationByName);

		enumerationByName = UMLUtil.getEnumerationByName(null, null);

		assertNull(enumerationByName);

	}

	public final void testGetClassifierByNamePackageStringEClass() {

		Classifier classiferByClassifier = UMLUtil.getClassifierByName(testPackage, SAMENAME, UMLFactory.eINSTANCE.createClass().eClass());

		assertNotNull(classiferByClassifier);

		assertTrue((classiferByClassifier instanceof Class));

		classiferByClassifier = UMLUtil.getClassifierByName(testPackage, SAMENAME, UMLFactory.eINSTANCE.createEnumeration().eClass());

		assertNotNull(classiferByClassifier);

		assertTrue((classiferByClassifier instanceof Enumeration));

		classiferByClassifier = UMLUtil.getClassifierByName(testPackage, NONAME, UMLFactory.eINSTANCE.createClass().eClass());

		assertNull(classiferByClassifier);

		classiferByClassifier = UMLUtil.getClassifierByName(testPackage, NONAME, UMLFactory.eINSTANCE.createEnumeration().eClass());

		assertNull(classiferByClassifier);

		classiferByClassifier = UMLUtil.getClassifierByName(testPackage, NONAME, null);

		assertNull(classiferByClassifier);

		classiferByClassifier = UMLUtil.getClassifierByName(testPackage, null, null);

		assertNull(classiferByClassifier);

		classiferByClassifier = UMLUtil.getClassifierByName(null, null, null);

		assertNull(classiferByClassifier);

	}

	public final void testGetTopPackagePackage() {

		Package topPackage = UMLUtil.getTopPackage(subPackage);

		assertEquals(testPackage, topPackage);

		topPackage.equals(testPackage);

	}

	public final void testGetTopPackageNamedElement() {
		Package topPackage = UMLUtil.getTopPackage(subElement);

		assertEquals(testPackage, topPackage);

		topPackage.equals(testPackage);

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

		String pqn1 = UMLUtil.getPackageQualifiedName(subElement);

		String pqn2 = UMLUtil.getPackageQualifiedName(subPackage);

		assertNotSame(pqn1, pqn2);
		
	}

	public final void testCloneStereotypesElementElement() {
		
		fail("Not yet implemented"); // TODO	
	}

	public final void testCloneStereotypesClassClass() {
		
		
		fail("Not yet implemented"); // TODO
	}
	
	

	public final void testAddAliasName() {
		
		final  String ALIASTTEST="AliasTest";
		
		final String UML2ALIAS = "uml2.alias";
		
		UMLUtil.addAliasName(testPackage, ALIASTTEST);
		
		EAnnotation eAnnotation = testPackage.getEAnnotation(UML2ALIAS);
		
		assertTrue(eAnnotation.getDetails().containsKey(ALIASTTEST));
				
	}
	
	public final void testSetConstrainingClassifier() {
		
		ClassifierTemplateParameter classifierTemplateParameter = UMLFactory.eINSTANCE.createClassifierTemplateParameter();
		
		Classifier constraint = UMLFactory.eINSTANCE.createClass();
		
		UMLUtil.setConstrainingClassifier(classifierTemplateParameter, constraint);
		
		Classifier result = UMLUtil.getConstrainingClassifier(classifierTemplateParameter);

		assertTrue(constraint.equals(result));

	}

	public final void testSetParameterableElement() {
		TemplateParameterSubstitution substitution = UMLFactory.eINSTANCE.createTemplateParameterSubstitution();

		ParameterableElement parameterableElement = UMLFactory.eINSTANCE.createParameter();

		UMLUtil.setParameterableElement(substitution, parameterableElement);

		ParameterableElement result = UMLUtil.getParameterableElement(substitution);

		assertTrue(parameterableElement.equals(result));

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
