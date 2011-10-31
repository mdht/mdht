/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ED</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#validateThumbnailThumbnail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#matches(java.lang.String) <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDOperations extends ANYOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateThumbnailThumbnail(ED, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail Thumbnail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateThumbnailThumbnail(ED, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.thumbnail.oclIsUndefined() implies self.thumbnail.thumbnail.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateThumbnailThumbnail(ED, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail Thumbnail</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateThumbnailThumbnail(ED, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.thumbnail.oclIsUndefined() implies self.thumbnail.thumbnail.oclIsUndefined()
	 * @param ed The receiving '<em><b>ED</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateThumbnailThumbnail(ED ed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.ED);
			try {
				VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ed)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, DatatypesValidator.DIAGNOSTIC_SOURCE, DatatypesValidator.ED__THUMBNAIL_THUMBNAIL,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"validateThumbnailThumbnail",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ed, context) }),
					new Object[] { ed }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ED addText(ED ed, String text) {
		if (text == null) {
			throw new IllegalArgumentException("text is null");
		}
		FeatureMapUtil.addText(ed.getMixed(), text);
		return ed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getText(ED ed) {
		StringBuffer text = new StringBuffer("");
		for (FeatureMap.Entry entry : ed.getMixed()) {
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean matches(ED ed, String regularExpression) {
		return ed.getText().matches(regularExpression);
	}

} // EDOperations
