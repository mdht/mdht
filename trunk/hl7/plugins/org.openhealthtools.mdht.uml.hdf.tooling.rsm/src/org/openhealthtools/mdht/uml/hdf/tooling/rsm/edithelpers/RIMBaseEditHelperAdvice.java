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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.edithelpers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;

import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;

import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;

import org.eclipse.gmf.runtime.notation.Diagram;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.l10n.RIMMessages;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.utils.RIMUtil;
import org.openhealthtools.mdht.uml.hdf.ui.clone.CloneClass;
import org.openhealthtools.mdht.uml.hdf.ui.clone.CloneHandler;

/**
 * @generated
 */
public abstract class RIMBaseEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * @generated
	 */
	@Override
	protected ICommand getBeforeConfigureCommand(ConfigureRequest request) {
		EObject root = EcoreUtil.getRootContainer(request.getElementToConfigure());
		if (root instanceof Package) {
			Package rootPackage = (Package) root;

			// apply the profile to the model if it is not already applied
			if (rootPackage.getAppliedProfile(RIMUtil.PROFILE_NAME) == null) {
				ICommand cmd = UMLElementFactory.getCreateRelationshipCommand(
					rootPackage, UMLElementTypes.PROFILE_APPLICATION, rootPackage, RIMUtil.getProfile());
				return cmd != null
						? cmd
						: UnexecutableCommand.INSTANCE;
			}
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		final EObject eObject = request.getElementToConfigure();
		final EObject container = eObject.eContainer();
		final EReference reference = eObject.eContainmentFeature();

		// return new AbstractTransactionalCommand(TransactionUtil.getEditingDomain(eObject),
		// RIMMessages.CommandLabel_autoName, null) {
		//
		// protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
		// IAdaptable info)
		// throws ExecutionException {
		//
		// autoName(container, reference, eObject);
		// return CommandResult.newOKCommandResult();
		// }
		//
		// };

		// Customized code block starts.
		String dropClassName = (String) request.getParameter("stereotype");
		final CloneHandler cloneHandler = new CloneHandler(null, eObject, dropClassName);
		final CloneClass cloneClass = cloneHandler.clone();

		return new AbstractTransactionalCommand(
			TransactionUtil.getEditingDomain(eObject), RIMMessages.CommandLabel_autoName, null) {
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				CommandResult commandResult = null;
				if (cloneClass != null) {
					autoName(container, reference, eObject);
					if (cloneClass.getStereotype() != null) {
						cloneHandler.applyStereoType(cloneClass.getStereotype());
					}
					commandResult = CommandResult.newOKCommandResult();
				} else {
					commandResult = CommandResult.newCancelledCommandResult();
				}
				return commandResult;
			}
		};
		// Customized code block ends.
	}

	/**
	 * @generated
	 */
	@Override
	protected ICommand getBeforeEditContextCommand(GetEditContextRequest request) {
		IEditCommandRequest editRequest = request.getEditCommandRequest();
		if (editRequest instanceof CreateRelationshipRequest) {
			CreateRelationshipRequest crr = (CreateRelationshipRequest) editRequest;
			EObject source = crr.getSource();
			EObject target = crr.getTarget();

			IElementType type = crr.getElementType();

			if (source != null) {
				if (!RIMElementTypes.matchesSource(type, source)) {
					return UnexecutableCommand.INSTANCE;
				}
			}
			if (target != null) {
				if (!RIMElementTypes.matchesTarget(type, target)) {
					return UnexecutableCommand.INSTANCE;
				}
			}
		}

		return super.getBeforeEditContextCommand(request);
	}

	/**
	 * Return the localized name of the given EObject.
	 * 
	 * @param eObject
	 * @return the localized name
	 * @generated
	 */
	protected String getLocalizedName(EObject eObject) {
		return PackageUtil.getLocalizedName(eObject.eClass());
	}

	/**
	 * Set the auto name for the given EObject.
	 * 
	 * @param eObject
	 * @param name
	 * @generated
	 */
	protected void setAutoName(EObject eObject, String name) {
		if (eObject instanceof NamedElement) {
			((NamedElement) eObject).setName(name);
		} else if (eObject instanceof Diagram) {
			((Diagram) eObject).setName(name);
		}
	}

	/**
	 * Get the name for the given EObject.
	 * 
	 * @param eObject
	 * @return String name
	 * @generated
	 */
	protected String getName(EObject eObject) {
		if (eObject instanceof NamedElement) {
			return ((NamedElement) eObject).getName();
		} else if (eObject instanceof Diagram) {
			return ((Diagram) eObject).getName();
		} else {
			return null;
		}
	}

	/**
	 * Auto name the given EObject.
	 * 
	 * @param container
	 * @param reference
	 * @param eObject
	 * @generated
	 */
	protected void autoName(EObject container, EReference reference, EObject eObject) {

		String originalName = getLocalizedName(eObject);

		if (originalName != null) {
			if (reference.isMany()) {
				String name = originalName;
				Set<String> set = new HashSet<String>();
				for (Object sibling : ((Collection<?>) container.eGet(reference))) {
					if (sibling != null) {
						String n = null;

						// add extra conditions for other model elements
						if (sibling instanceof NamedElement) {
							n = ((NamedElement) sibling).getName();
						} else if (sibling instanceof Diagram) {
							n = ((Diagram) sibling).getName();
						}

						if (n != null) {
							set.add(n);
						}
					}
				}

				for (int j = 1; j <= Integer.MAX_VALUE; j++) {
					String n = (j == 1)
							? name
							: name + j;
					if (!set.contains(n)) {
						name = n;
						break;
					}
				}
				if (!name.equals(getName(eObject))) {
					setAutoName(eObject, name);
				}
			}
		}
	}

	protected ICommand getReorientCommand(final ReorientReferenceRelationshipRequest request,
			final String sourceFeatureName, final IElementType elementType) {
		final Element referenceEnd = (Element) request.getReferenceOwner();
		final Element oldEnd = (Element) request.getOldRelationshipEnd();
		final Element newEnd = (Element) request.getNewRelationshipEnd();
		final boolean isReorientTarget = (ReorientRequest.REORIENT_TARGET == request.getDirection());

		return new AbstractTransactionalCommand(request.getEditingDomain(), request.getLabel(), Collections.EMPTY_LIST) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				EObject sourceApplication = null;
				EObject newApplication = null;
				EObject oldApplication = null;

				IElementType[] sourceTypes = RIMElementTypes.getSources(elementType);
				for (IElementType sourceType : sourceTypes) {
					if (sourceType instanceof IStereotypedElementType) {
						IStereotypedElementType sSourceType = (IStereotypedElementType) sourceType;

						if (sourceApplication == null) {
							sourceApplication = referenceEnd.getStereotypeApplication(referenceEnd.getApplicableStereotype(sSourceType.getStereotypeName()));
						}

						if (!isReorientTarget && newApplication == null) {
							newApplication = newEnd.getStereotypeApplication(newEnd.getApplicableStereotype(sSourceType.getStereotypeName()));
						}
					}
				}

				IElementType[] targetTypes = RIMElementTypes.getTargets(elementType);

				for (IElementType targetType : targetTypes) {
					if (targetType instanceof IStereotypedElementType) {
						IStereotypedElementType sTargetType = (IStereotypedElementType) targetType;

						if (oldApplication == null) {
							oldApplication = oldEnd.getStereotypeApplication(oldEnd.getApplicableStereotype(sTargetType.getStereotypeName()));
						}

						if (isReorientTarget && newApplication == null) {
							newApplication = newEnd.getStereotypeApplication(newEnd.getApplicableStereotype(sTargetType.getStereotypeName()));
						}
					} else {
						if (targetType instanceof ISpecializationType) {
							if (oldApplication == null &&
									((ISpecializationType) targetType).getMatcher().matches(oldEnd)) {
								oldApplication = oldEnd;
							}

							if (isReorientTarget && newApplication == null &&
									((ISpecializationType) targetType).getMatcher().matches(newEnd)) {
								newApplication = newEnd;
							}
						} else {
							if (oldApplication == null && targetType.getEClass().equals(oldEnd.eClass())) {
								oldApplication = oldEnd;
							}

							if (isReorientTarget && newApplication == null &&
									targetType.getEClass().equals(newEnd.eClass())) {
								newApplication = newEnd;
							}
						}
					}
				}

				if (sourceApplication == null) {
					return CommandResult.newErrorCommandResult("Unable to locate applied stereotype on the relationship source");
				}

				if (oldApplication == null) {
					return CommandResult.newErrorCommandResult("Unable to locate applied stereotype on the old relationship target");
				}

				if (newApplication == null) {
					return CommandResult.newErrorCommandResult("Unable to locate applied stereotype on the new relationship target");
				}

				if (isReorientTarget) {
					EStructuralFeature feature = sourceApplication.eClass().getEStructuralFeature(sourceFeatureName);
					if (feature.isMany()) {
						((EList) sourceApplication.eGet(feature)).remove(oldApplication);
						((EList) sourceApplication.eGet(feature)).add(newApplication);
					} else {
						sourceApplication.eSet(feature, newApplication);
					}
				} else {
					EStructuralFeature sourceFeature = sourceApplication.eClass().getEStructuralFeature(
						sourceFeatureName);
					EStructuralFeature newFeature = newApplication.eClass().getEStructuralFeature(sourceFeatureName);

					if (sourceFeature.isMany()) {
						((EList) sourceApplication.eGet(sourceFeature)).remove(oldApplication);
					} else {
						sourceApplication.eUnset(sourceFeature);
					}

					if (newFeature.isMany()) {
						((EList) newApplication.eGet(newFeature)).add(oldApplication);
					} else {
						newApplication.eSet(newFeature, oldApplication);
					}

				}

				return CommandResult.newOKCommandResult();
			}

		};
	}

	protected boolean relationshipAlreadyExists(ReorientReferenceRelationshipRequest request, String sourceFeatureName,
			IElementType elementType) {
		Element newEnd = (Element) request.getNewRelationshipEnd();
		Element oldEnd = (Element) request.getOldRelationshipEnd();
		Element referenceEnd = (Element) request.getReferenceOwner();

		EObject sourceApplication = null;
		EObject newApplication = null;
		EObject oldApplication = null;
		boolean isReorientTarget = (ReorientRequest.REORIENT_TARGET == request.getDirection());

		IElementType[] sourceTypes = RIMElementTypes.getSources(elementType);
		for (IElementType sourceType : sourceTypes) {
			if (sourceType instanceof IStereotypedElementType) {
				IStereotypedElementType sSourceType = (IStereotypedElementType) sourceType;

				if (sourceApplication == null) {
					sourceApplication = referenceEnd.getStereotypeApplication(referenceEnd.getApplicableStereotype(sSourceType.getStereotypeName()));
				}

				if (!isReorientTarget && newApplication == null) {
					newApplication = newEnd.getStereotypeApplication(newEnd.getApplicableStereotype(sSourceType.getStereotypeName()));
				}
			}
		}

		IElementType[] targetTypes = RIMElementTypes.getTargets(elementType);

		for (IElementType targetType : targetTypes) {
			if (targetType instanceof IStereotypedElementType) {
				IStereotypedElementType sTargetType = (IStereotypedElementType) targetType;

				if (oldApplication == null) {
					oldApplication = oldEnd.getStereotypeApplication(oldEnd.getApplicableStereotype(sTargetType.getStereotypeName()));
				}

				if (isReorientTarget && newApplication == null) {
					newApplication = newEnd.getStereotypeApplication(newEnd.getApplicableStereotype(sTargetType.getStereotypeName()));
				}
			} else {
				if (targetType instanceof ISpecializationType) {
					if (oldApplication == null && ((ISpecializationType) targetType).getMatcher().matches(oldEnd)) {
						oldApplication = oldEnd;
					}

					if (isReorientTarget && newApplication == null &&
							((ISpecializationType) targetType).getMatcher().matches(newEnd)) {
						newApplication = newEnd;
					}
				} else {
					if (oldApplication == null && targetType.getEClass().equals(oldEnd.eClass())) {
						oldApplication = oldEnd;
					}

					if (isReorientTarget && newApplication == null && targetType.getEClass().equals(newEnd.eClass())) {
						newApplication = newEnd;
					}
				}
			}
		}

		if (sourceApplication == null || oldApplication == null || newApplication == null) {
			return false;
		}

		if (isReorientTarget) {
			EStructuralFeature feature = sourceApplication.eClass().getEStructuralFeature(sourceFeatureName);
			if (feature.isMany()) {
				return ((EList) sourceApplication.eGet(feature)).contains(newApplication);
			} else {
				return newApplication.equals(sourceApplication.eGet(feature));
			}
		} else {
			EStructuralFeature feature = newApplication.eClass().getEStructuralFeature(sourceFeatureName);
			if (feature.isMany()) {
				return ((EList) newApplication.eGet(feature)).contains(oldApplication);
			} else {
				return oldApplication.equals(newApplication.eGet(feature));
			}
		}
	}
}
