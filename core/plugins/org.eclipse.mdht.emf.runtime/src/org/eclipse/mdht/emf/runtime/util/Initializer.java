/*******************************************************************************
 * Copyright (c) 2012 John T.E. Timm (IBM Corporation) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     John T.E. Timm (IBM Corporation) - initial API
 *     Christian W. Damus - initial implementation and elaboration (artf3272)
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A protocol for initialization of new objects in EMF-based documents
 *
 * @param <T>
 *            the kind of object that I initialize
 */
public interface Initializer<T extends EObject> {
	/**
	 * Initializes a new object.
	 *
	 * @param object
	 *            the object to initialize
	 *
	 * @return the same {@code object} again for call chaining; not some replacement object
	 */
	T initialize(T object);

	/**
	 * Queries the kind of object that I initialize.
	 *
	 * @return my initialization target
	 */
	Class<? extends T> getTargetType();

	/**
	 * Initializers that perform the same initialization are equal.
	 */
	boolean equals(Object obj);

	/**
	 * Initializers that perform the same initialization have the same hash code.
	 */
	int hashCode();

	//
	// Nested types
	//

	interface Registry {
		Registry INSTANCE = new Impl();

		/**
		 * Obtains all of the initializers specifically {@linkplain #addInitializer(EClass, Initializer) registered} for an {@code eclass} and its
		 * superclasses.
		 *
		 * @param eclass
		 *            the eclass for which to get initializers
		 *
		 * @return the initializers
		 *
		 * @see #getInitializers(EClass, boolean)
		 */
		<T extends EObject> Iterable<? extends Initializer<? super T>> getInitializers(EClass eclass);

		/**
		 * Obtains the initializers specifically {@linkplain #addInitializer(EClass, Initializer) registered} for an {@code eclass} and, optionally,
		 * its superclasses.
		 *
		 * @param eclass
		 *            the eclass for which to get initializers
		 * @param inherit
		 *            whether to inderit initializers from superclasses
		 *
		 * @return the initializers
		 *
		 * @see #getInitializers(EClass, boolean)
		 */
		<T extends EObject> Iterable<? extends Initializer<? super T>> getInitializers(EClass eclass, boolean inherit);

		/**
		 * Adds an initializer for the specified {@code eclass}. Has no effect if this {@code initializer} is already registered.
		 *
		 * @param eclass
		 *            an eclass to initialize
		 * @param initializer
		 *            an initializer to register
		 *
		 * @return myself, for convenience of call chaining
		 *
		 * @throws IllegalArgumentException
		 *             if the {@code initializer} does not {@linkplain Initializer#getTargetType() target} the eclass's
		 *             {@linkplain EClassifier#getInstanceClass() instance class}
		 */
		Registry addInitializer(EClass eclass, Initializer<? extends EObject> initializer);

		/**
		 * Adds initializers for the specified {@code eclass}.
		 *
		 * @param eclass
		 *            an eclass to initialize
		 * @param initializers
		 *            a bunch of initializers to register
		 *
		 * @return myself, for convenience of call chaining
		 *
		 * @throws IllegalArgumentException
		 *             if any of the {@code initializers} does not {@linkplain Initializer#getTargetType() target} the eclass's
		 *             {@linkplain EClassifier#getInstanceClass() instance class}
		 *
		 * @see #addInitializer(EClass, Initializer)
		 */
		Registry addAllInitializers(EClass eclass, Iterable<? extends Initializer<? extends EObject>> initializers);

		/**
		 * Creates the initializers for the classes in the specified {@code epackage} using the {@linkplain Factory factory} that was generated for
		 * it.
		 *
		 * @param epackage
		 *            an epackage to initialize
		 *
		 * @return myself, for convenience of call chaining
		 */
		Registry initializeEPackage(EPackage epackage);

		/**
		 * Creates the initializers for the classes in the specified {@code epackage} isunci the specified {@code factory}. It would be highly unusual
		 * not to use the package's own generated factory, unless it doesn't have one (such as is the case for legacy packages generated with MDHT 1.1
		 * or earlier).
		 *
		 * @param epackage
		 *            an epackage to initialize
		 * @param factory
		 *            the initializer factory
		 *
		 * @return myself, for convenience of call chaining
		 */
		Registry initializeEPackage(EPackage epackage, Initializer.Factory factory);

		/**
		 * Gets the factory that creates the initializers in the set identified by the given URI.
		 *
		 * @param initializersURI
		 *            the unique identifier of the initializer-set, as referenced from the Ecore package's annotation
		 *
		 * @return the factory, or {@code null} if none is registered for this URI
		 */
		Factory getFactory(String initializersURI);

		/**
		 * Registers an initializer factory.
		 *
		 * @param initializersURI
		 *            the unique identifier of the initializer-set, as referenced from the Ecore package's annotation
		 * @param factory
		 *            the factory that creates these initializers
		 *
		 * @return myself, for convenienc of call chaining
		 */
		Registry registerFactory(String initializersURI, Factory factory);

		class Impl implements Registry {
			private final Impl delegate;

			private final Set<EPackage> initializedPackages = new java.util.HashSet<EPackage>();

			private final Map<EClass, List<Initializer<? extends EObject>>> initializers = new java.util.HashMap<EClass, List<Initializer<? extends EObject>>>();

			private final Map<String, Factory> factories = new java.util.HashMap<String, Initializer.Factory>();

			Impl() {
				this(null);
			}

			Impl(Impl delegate) {
				this.delegate = delegate;
			}

			public <T extends EObject> Iterable<? extends Initializer<? super T>> getInitializers(EClass eclass) {
				return getInitializers(eclass, true);
			}

			public <T extends EObject> Iterable<? extends Initializer<? super T>> getInitializers(EClass eclass,
					boolean inherit) {

				Iterable<? extends Initializer<? super T>> result = initializersFor(eclass);

				if (inherit) {
					// copy, then add
					List<Initializer<? super T>> listResult = new java.util.ArrayList<Initializer<? super T>>();
					for (Initializer<? super T> next : result) {
						listResult.add(next);
					}

					for (EClass super_ : eclass.getEAllSuperTypes()) {
						for (Initializer<? super T> next : initializersFor(super_)) {
							listResult.add(next);
						}
					}
					result = listResult;
				}

				return result;
			}

			private <T extends EObject> Iterable<? extends Initializer<? super T>> initializersFor(EClass eclass) {
				List<Initializer<? super T>> listResult;

				Iterable<Initializer<? extends EObject>> unfiltered = initializers.get(eclass);
				if (unfiltered == null) {
					listResult = Collections.emptyList();
				} else {
					listResult = new java.util.ArrayList<Initializer<? super T>>();
					for (Initializer<? extends EObject> next : unfiltered) {
						if (initializes(next, eclass.getInstanceClass())) {
							// by filtering on the target type of the initializers, we do our best to ensure that this is a safe cast
							@SuppressWarnings("unchecked")
							Initializer<? super T> asSuperT = (Initializer<? super T>) next;
							listResult.add(asSuperT);
						}
					}
				}

				Iterable<? extends Initializer<? super T>> result = listResult;
				if (delegate != null) {
					if (listResult.isEmpty()) {
						result = delegate.getInitializers(eclass);
					} else {
						for (Initializer<? super T> next : delegate.getInitializers(eclass)) {
							listResult.add(next);
						}
					}
				}

				return result;
			}

			public Registry addInitializer(EClass eclass, Initializer<? extends EObject> initializer) {
				if (!initializer.getTargetType().isAssignableFrom(eclass.getInstanceClass())) {
					throw new IllegalArgumentException(
						String.format("Cannot initialize EClass %s with %s.", eclass.getName(), initializer));
				}

				List<Initializer<? extends EObject>> list = initializers.get(eclass);
				if (list == null) {
					list = new java.util.ArrayList<Initializer<? extends EObject>>();
					initializers.put(eclass, list);
				}

				boolean alreadyHaveIt = false;
				for (Initializer<?> next : getInitializers(eclass)) {
					if (next == initializer) {
						alreadyHaveIt = true;
						break;
					}
				}
				if (!alreadyHaveIt) {
					list.add(initializer);
				}

				return this;
			}

			public Registry addAllInitializers(EClass eclass,
					Iterable<? extends Initializer<? extends EObject>> initializers) {

				// all-or-nothing
				for (Initializer<?> next : initializers) {
					if (!next.getTargetType().isAssignableFrom(eclass.getInstanceClass())) {
						throw new IllegalArgumentException(
							String.format("Cannot initialize EClass %s with %s.", eclass.getName(), next));
					}
				}

				List<Initializer<? extends EObject>> list = this.initializers.get(eclass);
				if (list == null) {
					list = new java.util.ArrayList<Initializer<? extends EObject>>();
					this.initializers.put(eclass, list);
				}

				Set<Initializer<? extends EObject>> existing = new java.util.HashSet<Initializer<? extends EObject>>();
				for (Initializer<? extends EObject> next : getInitializers(eclass)) {
					existing.add(next);
				}
				for (Initializer<? extends EObject> next : initializers) {
					if (!existing.contains(next)) {
						list.add(next);
					}
				}

				return this;
			}

			private static boolean initializes(Initializer<?> initializer, final Class<?> type) {
				return initializer.getTargetType().isAssignableFrom(type);
			}

			public Registry initializeEPackage(EPackage epackage) {
				Initializer.Factory factory = Util.getInitializerFactory(this, epackage);

				if (factory != null) {
					initializeEPackage(epackage, factory);
				}

				return this;
			}

			public Registry initializeEPackage(EPackage epackage, Initializer.Factory factory) {
				if (initializedPackages.add(epackage) &&
						((delegate == null) || !delegate.initializedPackages.contains(epackage))) {

					for (EClassifier next : epackage.getEClassifiers()) {
						if (next instanceof EClass) {
							EClass eclass = (EClass) next;
							addAllInitializers(eclass, factory.createInitializers(eclass));
						}
					}
				}

				return this;
			}

			public Factory getFactory(String initializersURI) {
				Factory result = factories.get(initializersURI);

				if ((result == null) && (delegate != null)) {
					result = delegate.getFactory(initializersURI);
				}

				return result;
			}

			public Registry registerFactory(String initializersURI, Factory factory) {
				factories.put(initializersURI, factory);
				return this;
			}
		}
	}

	interface Factory {

		/**
		 * Creates the initializers for an {@code eclass}.
		 *
		 * @param eclass
		 *            the eclass for which to create initializers
		 *
		 * @return the initializers
		 */
		Iterable<? extends Initializer<? extends EObject>> createInitializers(EClass eclass);

	}

	/**
	 * A suite of utility operations for access to and working with {@link Initializer}s that would be static operations on that interface, if Java
	 * had allowed it.
	 */
	class Util {
		public static final String INITIALIZERS_ANNOTATION_SOURCE = "http://www.openhealthtools.org/mdht/uml";

		public static final String INITIALIZERS_ANNOTATION_DETAIL = "initializers";

		private Util() {
			super();
		}

		/**
		 * Gets a local initializer registry for the specified resource set.
		 *
		 * @param resourceSet
		 *            a resource set
		 *
		 * @return the resource set's local initializer registry (never {@code null})
		 */
		public static Registry getRegistry(ResourceSet resourceSet) {
			RegistryAdapter adapter = (RegistryAdapter) EcoreUtil.getAdapter(resourceSet.eAdapters(), Registry.class);

			if (adapter == null) {
				adapter = new RegistryAdapter(new Registry.Impl((Registry.Impl) Registry.INSTANCE));
				resourceSet.eAdapters().add(adapter);
			}

			return adapter.get();
		}

		/**
		 * Gets a local initializer registry for the specified object, or the global registry if the object is not in a resource set.
		 *
		 * @param object
		 *            an object
		 *
		 * @return the best initializer registry for the object (never {@code null})
		 */
		public static Registry getRegistry(EObject object) {
			ResourceSet rset = null;

			Resource res = object.eResource();
			if (res != null) {
				rset = res.getResourceSet();
			}

			return (rset != null)
					? getRegistry(rset)
					: Registry.INSTANCE;
		}

		/**
		 * Initializes an {@code object} using the {@linkplain Initializer initializers} registered for its type.
		 *
		 * @param object
		 *            an object to initialize
		 *
		 * @return the {@code object} argument for convenience of call chaining
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static <T extends EObject> T init(T object) {
			init((EObject) object, (Iterable) getRegistry(object).getInitializers(object.eClass()));
			return object;
		}

		/**
		 * Initializes an {@code object} using the given {@code initializers}. The caller is responsible for ensuring that the {@code initializers}
		 * given are applicable to the {@code object}.
		 *
		 * @param object
		 *            an object to initialize
		 * @param initializers
		 *            some initializers (possibly empty) to initialize the object with
		 *
		 * @return the {@code eObject} argument for convenience of call chaining
		 *
		 * @throws ClassCastException
		 *             if any of the {@code initializers} is not applicable to the {@code object}
		 */
		public static <T extends EObject, I extends Initializer<? extends T>> void init(EObject object,
				Iterable<? extends I> initializers) {

			for (Initializer<?> next : initializers) {
				init(object, next);
			}
		}

		// extra level of helper needed to capture the <T> type argument
		private static <T extends EObject> void init(EObject object, Initializer<T> initializer) {
			initializer.initialize(initializer.getTargetType().cast(object));
		}

		/**
		 * Queries whether an {@code epackage} has generated initializers for its classes.
		 *
		 * @param epackage
		 *            an epackage
		 *
		 * @return whether it has generated initializers
		 */
		public static boolean hasInitializers(EPackage epackage) {
			return EcoreUtil.getAnnotation(
				epackage, INITIALIZERS_ANNOTATION_SOURCE, INITIALIZERS_ANNOTATION_DETAIL) != null;
		}

		/**
		 * Gets the initializer factories of an {@code epackage}, if it has any.
		 *
		 * @param epackage
		 *            the package for which to get the initializer factories
		 *
		 * @return the initializer factories, or an empty collection if the package does not have any (for example, if it is a legacy package
		 *         generated with
		 *         MDHT 1.1 or earlier)
		 */
		public static Iterable<Initializer.Factory> getInitializerFactories(final Registry registry,
				final EPackage epackage) {
			Iterable<Initializer.Factory> result = Collections.emptyList();

			String uris = EcoreUtil.getAnnotation(
				epackage, INITIALIZERS_ANNOTATION_SOURCE, INITIALIZERS_ANNOTATION_DETAIL);
			if (uris != null) {
				List<Initializer.Factory> listResult = new java.util.ArrayList<Initializer.Factory>();
				for (String next : uris.split("\\s+")) {
					Initializer.Factory factory = registry.getFactory(next);
					if (factory != null) {
						listResult.add(factory);
					}
				}
				result = Collections.unmodifiableList(listResult);
			}

			return result;
		}

		static Initializer.Factory getInitializerFactory(Registry registry, EPackage epackage) {
			Initializer.Factory result;

			Iterable<Initializer.Factory> factories = getInitializerFactories(registry, epackage);

			Iterator<Initializer.Factory> iter = factories.iterator();

			if (!iter.hasNext()) {
				result = NullFactory.INSTANCE;
			} else {
				result = iter.next();
				if (iter.hasNext()) {
					// more than one factory
					result = new ChainedFactory(factories);
				}
			}

			return result;
		}

		//
		// Nested types
		//

		private static class RegistryAdapter extends AdapterImpl {
			private final Registry registry;

			RegistryAdapter(Registry registry) {
				this.registry = registry;
			}

			Registry get() {
				return registry;
			}

			@Override
			public void setTarget(Notifier newTarget) {
				// don't retain my target
			}

			@Override
			public boolean isAdapterForType(Object type) {
				return type == Registry.class;
			}
		}

		private static class NullFactory implements Factory {
			static final Factory INSTANCE = new NullFactory();

			public Iterable<? extends Initializer<? extends EObject>> createInitializers(EClass eclass) {
				return Collections.emptyList();
			}
		}

		private static class ChainedFactory implements Factory {
			private final Iterable<? extends Factory> factories;

			ChainedFactory(Iterable<? extends Factory> factories) {
				this.factories = factories;
			}

			public Iterable<? extends Initializer<? extends EObject>> createInitializers(final EClass eclass) {
				List<Initializer<? extends EObject>> result = new java.util.ArrayList<Initializer<? extends EObject>>();

				for (Initializer.Factory factory : factories) {
					for (Initializer<? extends EObject> next : factory.createInitializers(eclass)) {
						result.add(next);
					}
				}

				return Collections.unmodifiableList(result);
			}
		}
	}
}
