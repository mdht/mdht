/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.mif2uml.util;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.Classifier;
import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase;

public class MIFUtil {

	/**
	 * Get the MIF model containing this model element.
	 */
	public static StaticModelBase getStaticModel(EObject mifElement) {
		EObject eObject = mifElement;
		while (eObject != null && !(eObject instanceof StaticModelBase))
			eObject = eObject.eContainer();
		
		return eObject instanceof StaticModelBase ? (StaticModelBase)eObject : null;
	}

	/**
	 * Get the MIF DatatypeModelLibrary containing this model element.
	 */
	public static DatatypeModelLibrary getDatatypeLibrary(EObject mifElement) {
		EObject eObject = mifElement;
		while (eObject != null && !(eObject instanceof DatatypeModelLibrary))
			eObject = eObject.eContainer();
		
		return eObject instanceof DatatypeModelLibrary ? (DatatypeModelLibrary)eObject : null;
	}

	/**
	 * Get the MIF Classifier that contains this model element.
	 */
	public static Classifier getContainingClassifier(EObject mifElement) {
		EObject eObject = mifElement;
		while (eObject != null && !(eObject instanceof Classifier))
			eObject = eObject.eContainer();
		
		return eObject instanceof Classifier ? (Classifier)eObject : null;
	}

	/**
	 * Get the MIF Datatype that contains this model element.
	 */
	public static Datatype getContainingDatatype(EObject mifElement) {
		EObject eObject = mifElement;
		while (eObject != null && !(eObject instanceof Classifier))
			eObject = eObject.eContainer();
		
		return eObject instanceof Datatype ? (Datatype)eObject : null;
	}

	/**
	 * Get the MIF package containing this model element.
	 */
	public static Package getPackage(EObject mifElement) {
		EObject eObject = mifElement;
		while (eObject != null && !(eObject instanceof Package))
			eObject = eObject.eContainer();
		
		return eObject instanceof Package ? (Package)eObject : null;
	}

	public static String getModelName(Package mifPackage) {
		// very strange logic for name, but this is needed to get it right...
		String mifName = null;
		if (mifPackage.getName() != null)
			mifName = mifPackage.getName();
		
		PackageRef packageLocation = mifPackage.getPackageLocation();
		if (packageLocation.getId() != null)
			mifName = packageLocation.getId().toString();
		else if (packageLocation.getCombinedId() != null)
			mifName = packageLocation.getCombinedId().toString();
		String pkgName = MIFUtil.getPackageName(packageLocation, mifName);
		
		return pkgName;
	}
	
//	public static String getPackageName(PackageRef packageRef) {
//		// very strange logic for name, but this is needed to get it right...
//		String mifName = packageRef.getName();
//		if (packageRef.getId() != null)
//			mifName = packageRef.getId().toString();
//		String pkgName = getPackageName(packageRef, mifName);
//		
//		return pkgName;
//	}

	public static String getPackageName(PackageRef pkgRef, String pkgId) {
		StringBuffer mifFileName = new StringBuffer();
		if (pkgRef.getSubSection() != null)
			mifFileName.append(pkgRef.getSubSection());
		if (pkgRef.getDomain() != null)
			mifFileName.append(pkgRef.getDomain());
		if (mifFileName.length() > 0)
			mifFileName.append("_");
		
		if (pkgRef.getArtifact() != null) {
			String artifactName = pkgRef.getArtifact().getName();
			int deprecatedIndex = artifactName.indexOf("Deprecated");
			if (deprecatedIndex > 0)
				artifactName = artifactName.substring(0, deprecatedIndex);
			mifFileName.append(artifactName);
		}
		
		if (pkgId != null) {
			while (pkgId.length() < 6)
				pkgId = "0" + pkgId;
			mifFileName.append(pkgId);
		}
		
//		if (AffiliateKind.UV.equals(pkgRef.getRealmNamespace())) {
//			mifFileName.append(AffiliateKind.UV.getName());
//			if (pkgRef.getVersion() != null)
//				mifFileName.append(pkgRef.getVersion());
//		}

		if (pkgRef.getRealmNamespace() != null)
			mifFileName.append(pkgRef.getRealmNamespace());
		if (pkgRef.getVersion() != null)
			mifFileName.append(pkgRef.getVersion());
		
		return mifFileName.toString();
	}

	/**
	 * Get the MIF class by name.
	 */
	public static ClassBase getClassByName(StaticModelBase mifModel, String name) {
		if (mifModel == null || !(mifModel instanceof StaticModel))
			return null;
		
		for (ClassElement clazz :((StaticModel)mifModel).getContainedClass()) {
			if (clazz.getClass_() != null
					&& clazz.getClass_().getName().equals(name))
				return clazz.getClass_();
		}
		return null;
	}

	/**
	 * Get the MIF datatype by name.
	 */
	public static Datatype getDatatypeByName(DatatypeModelLibrary mifModel, String name) {
		if (mifModel == null)
			return null;
		
		for (Datatype datatype : mifModel.getDatatype()) {
			if (datatype.getName().equals(name))
				return datatype;
		}
		return null;
	}
	
	/**
	 * Special case for MIF datatypes, e.g. IVL_PQ, change to IVL<PQ>.
	 */
	public static String getDatatypeName(Datatype datatype) {
		String name = datatype.getName();
		if (datatype.getBinding() != null && name.indexOf("_") > 0) {
			name = MIFUtil.getDatatypeName(datatype.getBinding());
		}
		return name;
	}
	
	/**
	 * Get the "flattened" name of a datatype reference to template bindings.
	 * For example: LIST<QTY>.
	 */
	public static String getDatatypeName(DatatypeRef datatypeRef) {
		StringBuffer name = new StringBuffer();
		name.append(datatypeRef.getName());
		
		if (!datatypeRef.getArgumentDatatype().isEmpty()) {
			boolean firstArg = true;
			name.append("<");
			for (DatatypeRef arg : datatypeRef.getArgumentDatatype()) {
				if (!firstArg)
					name.append(",");
				
				name.append(arg.getName());
				firstArg = false;
			}
			name.append(">");
		}

		return name.toString();
	}

	/**
	 * Get the underscore "flattened" name of a datatype reference to template bindings.
	 * For example: LIST_QTY.
	 */
	public static String getUnderscoreDatatypeName(DatatypeRef datatypeRef) {
		StringBuffer name = new StringBuffer();
		name.append(datatypeRef.getName());
		
		if (!datatypeRef.getArgumentDatatype().isEmpty()) {
			for (DatatypeRef arg : datatypeRef.getArgumentDatatype()) {
				name.append("_");
				name.append(arg.getName());
			}
		}

		return name.toString();
	}

	/**
	 * Get the "flattened" name of a datatype template bindings.
	 * For example: IVL<TS>.
	 */
	public static String getDatatypeName(DatatypeBinding datatypeBinding) {
		StringBuffer name = new StringBuffer();
		name.append(datatypeBinding.getTargetDatatype().getName());
		
		if (!datatypeBinding.getArgumentDatatype().isEmpty()) {
			boolean firstArg = true;
			name.append("<");
			for (DatatypeRef arg : datatypeBinding.getArgumentDatatype()) {
				if (!firstArg)
					name.append(",");
				
				name.append(arg.getName());
				firstArg = false;
			}
			name.append(">");
		}

		return name.toString();
	}

}
