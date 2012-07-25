/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.validation.tests;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.internal.util.TextUtils;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * JUnit test cases for constraints defined in UML profiles.
 */
public class ProfileConstraintTests {
	private static ResourceSet rset;

	private Package testModel;

	@Test
	public void batchModeJavaConstraint() {
		// code 1 is the "association should be directed" constraint
		assertThat(validate(), hasItem(warning(1, element("bar_foo", Association.class))));
	}

	@Test
	public void batchModeOCLConstraint() {
		// code 3 is the "class must not have any specializations" constraint
		assertThat(
			validate(),
			both(hasItem(error(3, element("Bar", Class.class)))).and(hasItem(ok(3, element("Foo", Class.class)))));
	}

	@Test
	public void liveModeJavaConstraint() {
		// code 2 is the "element must be named" constraint
		runTransaction(new RunnableWithResult.Impl<Void>() {
			public void run() {
				testModel.getOwnedType("SubFoo").setName("");
			}
		}, error(2, element("SubFoo", Class.class)));
	}

	//
	// Test framework
	//

	@BeforeClass
	public static void createResourceSet() {
		rset = new ResourceSetImpl();
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
	}

	@AfterClass
	public static void destroyResourceSet() {
		for (Resource next : rset.getResources()) {
			next.unload();
		}
		getDomain().dispose();
		rset.getResources().clear();
		rset = null;
	}

	@Before
	public void loadTestModel() {
		testModel = UML2Util.load(
			rset,
			URI.createPlatformPluginURI("/org.openhealthtools.mdht.uml.validation.tests/models/TestModel.uml", true),
			UMLPackage.Literals.PACKAGE);
	}

	@After
	public void unloadTestModel() {
		Resource res = testModel.eResource();
		res.unload();
		rset.getResources().remove(res);
	}

	static TransactionalEditingDomain getDomain() {
		return TransactionUtil.getEditingDomain(rset);
	}

	static <T> T runTransaction(RunnableWithResult<T> runnable, Matcher<IStatus> rollbackStatus) {
		InternalTransactionalEditingDomain domain = (InternalTransactionalEditingDomain) getDomain();

		Transaction transaction = null;

		try {
			// start a read/write transaction
			transaction = domain.startTransaction(false, Collections.emptyMap());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to start transaction: " + e.getLocalizedMessage());
		}

		runnable.run();

		try {
			transaction.commit();

			assertThat(null, rollbackStatus);
		} catch (RollbackException e) {
			if (e.getStatus().isMultiStatus()) {
				assertThat(Arrays.asList(e.getStatus().getChildren()), hasItem(rollbackStatus));
			} else {
				assertThat(e.getStatus(), rollbackStatus);
			}
		}

		return runnable.getResult();
	}

	List<IStatus> validate() {
		IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		validator.setReportSuccesses(true);
		IStatus result = validator.validate(testModel);

		return result.isMultiStatus()
				? Arrays.asList(result.getChildren())
				: Collections.singletonList(result);
	}

	static Matcher<? extends EObject> element(final String name, final java.lang.Class<? extends EObject> type) {
		return new BaseMatcher<EObject>() {
			public void describeTo(Description description) {
				description.appendText(String.format("a(n) %s named \"%s\"", type.getSimpleName(), name));
			}

			public boolean matches(Object item) {
				boolean result = type.isInstance(item);

				if (result) {
					String itemName = null;
					if (item instanceof NamedElement) {
						// do what EMF Validation Framework does to get an element name
						itemName = ((NamedElement) item).getName();
					}

					if (itemName == null) {
						if (item instanceof EObject) {
							itemName = TextUtils.getText((EObject) item);
						} else {
							itemName = String.valueOf(item);
						}
					}

					result = UML2Util.safeEquals(itemName, name);
				}

				return result;
			}
		};
	}

	static Matcher<IStatus> ok(final int code, final Matcher<? extends EObject> object) {
		return status(IStatus.OK, code, object);
	}

	static Matcher<IStatus> info(final int code, final Matcher<? extends EObject> object) {
		return status(IStatus.INFO, code, object);
	}

	static Matcher<IStatus> warning(final int code, final Matcher<? extends EObject> object) {
		return status(IStatus.WARNING, code, object);
	}

	static Matcher<IStatus> error(final int code, final Matcher<? extends EObject> object) {
		return status(IStatus.ERROR, code, object);
	}

	static Matcher<IStatus> status(final int severity, final int code, final Matcher<? extends EObject> object) {
		final String sevString;
		switch (severity) {
			case IStatus.OK:
				sevString = "OK";
				break;
			case IStatus.INFO:
				sevString = "info";
				break;
			case IStatus.WARNING:
				sevString = "warning";
				break;
			case IStatus.ERROR:
				sevString = "error";
				break;
			default:
				fail("Unknown severity " + severity);
				sevString = "";
		}

		return new BaseMatcher<IStatus>() {
			public void describeTo(Description description) {
				description.appendText(String.format("%s result from constraint %d for ", sevString, code)).appendDescriptionOf(
					object);
			}

			public boolean matches(Object item) {
				boolean result = (item instanceof IConstraintStatus);

				if (result) {
					IConstraintStatus status = (IConstraintStatus) item;
					IModelConstraint constraint = status.getConstraint();
					IConstraintDescriptor desc = constraint.getDescriptor();
					result = "org.openhealthtools.mdht.uml.validation.tests".equals(desc.getPluginId()) &&
							(status.getSeverity() == severity) && (desc.getStatusCode() == code) &&
							object.matches(status.getTarget());
				}

				return result;
			}
		};
	}
}
