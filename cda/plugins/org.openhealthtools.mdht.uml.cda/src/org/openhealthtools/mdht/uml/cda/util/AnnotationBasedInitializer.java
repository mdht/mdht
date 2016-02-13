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
package org.openhealthtools.mdht.uml.cda.util;

import static org.openhealthtools.mdht.uml.cda.util.CDAUtil.CDA_ANNOTATION_SOURCE;

import java.util.Collections;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * An initializer that processes legacy CDA annotations for population of defaults in new objects.
 */
public class AnnotationBasedInitializer implements Initializer<EObject> {
	public static final Initializer.Factory FACTORY = new FactoryImpl();

	private final Class<? extends EObject> targetType;

	private final EAnnotation annotation;

	/**
	 * Initializes me (heh heh) with the eclass that I initialize.
	 *
	 * @param eclass my target eclass
	 */
	@SuppressWarnings("unchecked")
	private AnnotationBasedInitializer(EClass eclass) {
		this.targetType = (Class<? extends EObject>) eclass.getInstanceClass();
		this.annotation = eclass.getEAnnotation(CDA_ANNOTATION_SOURCE);
	}

	public EObject initialize(EObject object) {
		if (annotation != null) {
			CDAUtil.init(object, annotation.getDetails().map());
		}

		return object;
	}

	final public Class<? extends EObject> getTargetType() {
		return targetType;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof AnnotationBasedInitializer) &&
				((AnnotationBasedInitializer) obj).targetType.equals(targetType);
	}

	@Override
	public int hashCode() {
		return targetType.hashCode();
	}

	static void ensureCompatibility(EClass eclass, Initializer.Registry registry) {
		if (!Initializer.Util.hasInitializers(eclass.getEPackage())) {
			// add our initializer to the legacy package if it isn't already present
			registry.initializeEPackage(eclass.getEPackage(), FACTORY);
		}
	}

	//
	// Nested types
	//

	public static class FactoryImpl implements Initializer.Factory {

		public Iterable<? extends Initializer<? extends EObject>> createInitializers(EClass eclass) {
			return Collections.singletonList(new AnnotationBasedInitializer(eclass));
		}

	}
}
