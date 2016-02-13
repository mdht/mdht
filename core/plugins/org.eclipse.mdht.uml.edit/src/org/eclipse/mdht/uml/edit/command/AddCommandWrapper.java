/*******************************************************************************
 * Copyright (c) 2012,2015 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     Sean Muir - extended support for business names
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.edit.command;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * An add-command wrapper that ensures correctness of cross-resource containment of the added objects, in the case that they are contained at the
 * root the same resource that contains the object to which they are being added.
 */
public class AddCommandWrapper implements UMLCommandWrapper {
	public boolean canWrap(Class<? extends Command> requestedType, CommandParameter parameter) {
		return requestedType == AddCommand.class;
	}

	public Command wrap(final Command addCommand, CommandParameter parameter) {
		CompoundCommand result = new CompoundCommand(addCommand.getLabel(), addCommand.getDescription());
		result.append(addCommand);

		final EObject owner = parameter.getEOwner();
		final Resource targetResource = (owner == null)
				? null
				: owner.eResource();
		if (targetResource != null) {
			// append a command that ensures that cross-resource containment is correct
			result.append(new CommandWrapper() {
				@Override
				protected Command createCommand() {
					Command result = IdentityCommand.INSTANCE;

					Collection<EObject> objectsToDetach = getObjectsToDetach(addCommand.getResult(), targetResource);

					if (!objectsToDetach.isEmpty()) {
						// don't need an editing domain because we don't want the remove to be overridden
						result = new RemoveCommand(null, targetResource.getContents(), objectsToDetach);
					}

					return result;
				}
			});

			// also append a command that ensures that stereotype applications copied from the clipboard are pasted
			final Collection<?> objectsToAdd = parameter.getCollection();
			result.append(new CommandWrapper() {
				@Override
				protected Command createCommand() {
					Command result = IdentityCommand.INSTANCE;

					final Collection<EObject> addedObjects = new java.util.ArrayList<EObject>();
					Collection<EObject> stereotypeApplications = new java.util.ArrayList<EObject>();

					// collect the stereotype applications of all the objects we're adding
					for (Iterator<?> iter = EcoreUtil.getAllContents(objectsToAdd); iter.hasNext();) {
						Object next = iter.next();
						if (next instanceof EObject) {
							EObject owner = (EObject) next;
							addedObjects.add(owner);

							Collection<? extends EObject> stereotypesToAdd = StereotypesCache.getStereotypeApplications(
								owner);
							stereotypeApplications.addAll(stereotypesToAdd);
						}
					}

					if (!stereotypeApplications.isEmpty()) {
						// don't need an editing domain because we don't want the add to be overridden
						result = new CommandWrapper(
							new AddCommand(null, targetResource.getContents(), stereotypeApplications)) {

							@Override
							public void execute() {
								// do the add
								super.execute();

								// then clear the cache
								for (EObject next : addedObjects) {
									StereotypesCache.clearStereotypeApplications(next);
								}
							};
						};
					}

					return result;
				}
			});

			// Append Business Name Command Wrapper
			result.append(new CommandWrapper() {
				@Override
				protected Command createCommand() {
					Command result = IdentityCommand.INSTANCE;

					result = new AbstractCommand() {

						/*
						 * (non-Javadoc)
						 *
						 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
						 */
						@Override
						public boolean canExecute() {
							return true;
						}

						/*
						 * (non-Javadoc)
						 *
						 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
						 */
						@Override
						public boolean canUndo() {
							return true;
						}

						/*
						 * (non-Javadoc)
						 *
						 * @see org.eclipse.emf.common.command.AbstractCommand#getResult()
						 */
						@Override
						public Collection<?> getResult() {
							// TODO Auto-generated method stub
							return super.getResult();
						}

						/*
						 * (non-Javadoc)
						 *
						 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
						 */
						@Override
						protected boolean prepare() {
							return true;
						}

						public void execute() {

							for (Iterator<?> iter = EcoreUtil.getAllContents(objectsToAdd); iter.hasNext();) {
								Object next = iter.next();
								if (next instanceof NamedElement) {
									NamedElement owner = (NamedElement) next;

									String businessName = BusinessNamesCache.getCachedBusinessNames(owner);

									if (businessName != null) {
										NamedElementUtil.setBusinessName(owner, businessName);
									}
									BusinessNamesCache.clearBusinessNames(owner);

								}
							}

						}

						public void redo() {
							// TODO Auto-generated method stub

						}
					};

					return result;
				}
			});

		}

		return result.unwrap();
	}

	private static Collection<EObject> getObjectsToDetach(Collection<?> objects, Resource targetResource) {
		Collection<EObject> result = new java.util.ArrayList<EObject>();

		for (Object next : objects) {
			if ((next instanceof InternalEObject) && (((InternalEObject) next).eDirectResource() == targetResource)) {
				// this object is added to another object in the same resource. Don't let it be cross-resource-contained
				// by the same resource that it's already attached to
				result.add((EObject) next);
			}
		}

		return result;
	}

	//
	// Nested types
	//

	/**
	 * A cache of stereotype applications that are applied to an element while it is not maintained in a resource.
	 * While it is not in a resource, an element cannot determine its stereotype applications, even if they are
	 * known to the {@code CacheAdapter}, because without a resource-set, the stereotype definitions cannot be traced,
	 * so objects cannot be recognized as stereotype applications. However, in clipboard interactions, we know a priori
	 * which elements are stereotype applications, and so use this adapter to track them explicitly.
	 */
	static class StereotypesCache extends AdapterImpl {
		private final Collection<? extends EObject> stereotypApplications;

		private StereotypesCache(Collection<? extends EObject> stereotypeApplications) {
			this.stereotypApplications = stereotypeApplications;
		}

		/**
		 * Caches the stereotype applications for an element on the clipboard.
		 */
		static void setStereotypeApplications(EObject element, Collection<? extends EObject> stereotypApplications) {
			clearStereotypeApplications(element);

			element.eAdapters().add(new StereotypesCache(stereotypApplications));
		}

		/**
		 * Clears the caches of stereotype applications for an element.
		 */
		static void clearStereotypeApplications(EObject element) {
			for (Iterator<? extends Adapter> iter = element.eAdapters().iterator(); iter.hasNext();) {
				if (iter.next().isAdapterForType(StereotypesCache.class)) {
					iter.remove();
					break;
				}
			}
		}

		/**
		 * Queries the cached stereotype applications for an element on the clipboard.
		 */
		static Collection<? extends EObject> getCachedStereotypeApplications(EObject element) {
			Collection<? extends EObject> result;

			Adapter existing = EcoreUtil.getExistingAdapter(element, StereotypesCache.class);
			if (existing instanceof StereotypesCache) {
				result = ((StereotypesCache) existing).stereotypApplications;
			} else {
				result = Collections.emptyList();
			}

			return result;
		}

		/**
		 * Queries the stereotype applications of an element, which may be an "original" element in the model, or perhaps a cut or copied
		 * instance on the clipboard.
		 */
		static Collection<? extends EObject> getStereotypeApplications(EObject element) {
			Collection<? extends EObject> result;

			if ((element instanceof Element) && (element.eResource() != null)) {
				// if it's an UML element in the model, it knows its stereotypes and doesn't need our cache
				result = ((Element) element).getStereotypeApplications();
			} else {
				// otherwise, it's a clipboard element and we need to consult the cache
				result = getCachedStereotypeApplications(element);
			}

			return result;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == StereotypesCache.class;
		}

		EObject getETarget() {
			EObject result = null;

			Object target = getTarget();
			if (target instanceof EObject) {
				result = (EObject) target;
			}

			return result;
		}

		@Override
		public void notifyChanged(Notification msg) {
			super.notifyChanged(msg);

			EObject target = getETarget();
			if ((target != null) && (target.eResource() == null)) {
				// I am not applicable to elements in the model
				target.eAdapters().remove(this);
			}
		}
	}

	/**
	 * BusinessNamesCache is patterned after StereotypesCache to bring along any business names that were set on class
	 *
	 * @TODO Does it make sense to have one dynamic adapter versus a series of specialized adapter
	 * @author seanmuir
	 *
	 */
	static class BusinessNamesCache extends AdapterImpl {
		String businesName;

		/**
		 * @param businesName
		 */
		public BusinessNamesCache(String businesName) {
			super();
			this.businesName = businesName;
		}

		/**
		 * Caches the business name for an element on the clipboard.
		 */
		static void setBusinessNames(EObject element, String businessName) {
			clearBusinessNames(element);

			element.eAdapters().add(new BusinessNamesCache(businessName));
		}

		/**
		 * Clears the caches of business name for an element.
		 */
		static void clearBusinessNames(EObject element) {
			for (Iterator<? extends Adapter> iter = element.eAdapters().iterator(); iter.hasNext();) {
				if (iter.next().isAdapterForType(BusinessNamesCache.class)) {
					iter.remove();
					break;
				}
			}
		}

		/**
		 * Queries the cached business name for an element on the clipboard.
		 */
		static String getCachedBusinessNames(EObject element) {
			String result = null;

			Adapter existing = EcoreUtil.getExistingAdapter(element, BusinessNamesCache.class);
			if (existing instanceof BusinessNamesCache) {
				result = ((BusinessNamesCache) existing).businesName;
			}

			return result;
		}

		/**
		 * Queries the business names of an element, which may be an "original" element in the model, or perhaps a cut or copied
		 * instance on the clipboard.
		 */
		String getBusinessNames(EObject element) {
			String result = null;

			if ((element instanceof Element)) {
				if ((element.eResource() != null)) {
					// if it's an UML element in the model, get the corresponding Busines Name
					result = NamedElementUtil.getPropertyValue((NamedElement) element, "label");
				} else {
					// otherwise, it's a clipboard element and we need to consult the cache
					result = getCachedBusinessNames(element);
				}
			}
			return result;
		}

		//
		@Override
		public boolean isAdapterForType(Object type) {
			return type == BusinessNamesCache.class;
		}

		EObject getETarget() {
			EObject result = null;

			Object target = getTarget();
			if (target instanceof EObject) {
				result = (EObject) target;
			}

			return result;
		}

		@Override
		public void notifyChanged(Notification msg) {
			super.notifyChanged(msg);

			EObject target = getETarget();
			if ((target != null) && (target.eResource() == null)) {
				// I am not applicable to elements in the model
				target.eAdapters().remove(this);
			}
		}
	}
}
