/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *     Christian W. Damus - fix re-ordering of properties and constraints
 *                        - ensure correct structure of pasted association copies (artf3287)
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

/**
 *
 * @version $Id: $
 */
public class ClassExtItemProvider extends ClassItemProvider implements ITableItemLabelProvider, ICellModifier {

	private Collection<? extends EStructuralFeature> myChildrenFeatures;

	/**
	 * @param adapterFactory
	 */
	public ClassExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		Object elementImage = NotationUtil.getElementImage((Class) object);
		if (elementImage == null) {
			elementImage = super.getImage(object);
		}

		return elementImage;
	}

	protected String getName(NamedElement namedElement) {
		AdapterFactory adapterFactory = getAdapterFactory();
		return adapterFactory instanceof UML2ExtendedAdapterFactory &&
				((UML2ExtendedAdapterFactory) adapterFactory).isShowBusinessNames()
						? NamedElementUtil.getBusinessName(namedElement)
						: namedElement.getName();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.uml2.uml.provider.ClassItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		String label = getName((org.eclipse.uml2.uml.Class) object);
		return label == null || label.length() == 0
				? getString("_UI_Class_type") //$NON-NLS-1$
				: label;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Object> getChildren(Object object) {
		Class clazz = (Class) object;
		List<Object> children = new ArrayList<Object>();

		/* Applied Stereotypes */
		// for (EObject stereotypeApplication : clazz.getStereotypeApplications()) {
		// children.add(stereotypeApplication);
		// }

		children.addAll(clazz.getOwnedComments());
		for (Property property : clazz.getOwnedAttributes()) {
			if (property.getAssociation() == null) {
				children.add(property);
			}
		}
		// include associations after attributes
		for (Property property : clazz.getOwnedAttributes()) {
			if (property.getAssociation() != null && property.getOtherEnd() != null &&
					property.getOtherEnd().getType() == clazz) {
				children.add(property.getAssociation());
			}
		}
		// include associations that own both ends
		for (Association association : clazz.getAssociations()) {
			// do not include nested associations already included via their properties
			// only include associations that own both ends
			if (!children.contains(association) && association.getOwnedEnds().size() == 2) {
				children.add(association);
			}
		}

		children.addAll(clazz.getOwnedOperations());

		for (Classifier classifier : clazz.getNestedClassifiers()) {
			// do not include nested associations already included via their properties
			if (!children.contains(classifier)) {
				children.add(classifier);
			}
		}

		children.addAll(clazz.getOwnedRules());
		children.addAll(clazz.getClientDependencies());
		children.addAll(clazz.getGeneralizations());

		return children;
	}

	// TODO: We should only report as children features the features from which we actually derive children
	// @Override
	// public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
	// return getMyChildrenFeatures(object);
	// }

	private Collection<? extends EStructuralFeature> getMyChildrenFeatures(Object object) {
		if (myChildrenFeatures == null) {
			Collection<EStructuralFeature> features = new java.util.ArrayList<EStructuralFeature>(6);

			features.add(UMLPackage.Literals.ELEMENT__OWNED_COMMENT);
			features.add(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
			features.add(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER);
			features.add(UMLPackage.Literals.NAMESPACE__OWNED_RULE);
			features.add(UMLPackage.Literals.NAMED_ELEMENT__CLIENT_DEPENDENCY);
			features.add(UMLPackage.Literals.CLASSIFIER__GENERALIZATION);

			myChildrenFeatures = features;
		}

		return myChildrenFeatures;
	}

	// TODO: refactorAddCommand(...) needs a similar override, but is much more complex
	/**
	 * As the {@link #getChildren(Object)} method is overridden to determine what elements
	 * to show, so must this one to determine where to slot a moved element.
	 */
	@Override
	protected Command factorMoveCommand(EditingDomain domain, CommandParameter commandParameter) {
		Command result;

		final EObject owner = commandParameter.getEOwner();
		final Object child = commandParameter.getValue();
		int index = commandParameter.getIndex();

		// handle the special case of non-owned associations
		final boolean isAssociation = child instanceof Association;
		final Object toMove = isAssociation
				? getOwnedEnd(owner, (Association) child)
				: child;

		final EStructuralFeature feature = getChildFeature(owner, toMove);

		if ((feature != null) && feature.isMany()) {
			for (EStructuralFeature next : getMyChildrenFeatures(owner)) {
				if (next == feature) {
					break;
				}

				if (next.isMany()) {
					index = index - ((Collection<?>) owner.eGet(next)).size();
				} else if (owner.eGet(next) != null) {
					index = index - 1;
				}
			}

			if (toMove instanceof Property) {
				// these are partitioned into two groups. Recompute the index
				Class clazz = (Class) owner;
				List<? extends Property> sortedProperties = sortOwnedAttributes(clazz);

				if ((index >= 0) && (index < sortedProperties.size())) {
					Property precursor = sortedProperties.get(index);
					int adjustedIndex = clazz.getOwnedAttributes().indexOf(precursor);
					result = createMoveCommand(domain, owner, feature, toMove, adjustedIndex);
				} else {
					// can't do the move
					result = UnexecutableCommand.INSTANCE;
				}
			} else {
				result = createMoveCommand(domain, owner, feature, toMove, index);
			}
		} else {
			// cannot move an object in a scalar feature
			result = UnexecutableCommand.INSTANCE;
		}

		return result;
	}

	private Property getOwnedEnd(EObject owner, Association association) {
		Property result = null;

		for (Property next : association.getMemberEnds()) {
			if (EcoreUtil.isAncestor(owner, next)) {
				result = next;
				break;
			}
		}

		// don't need to worry about returning null because we wouldn't be looking at
		// the association if our class didn't own an end of it
		return result;
	}

	private List<? extends Property> sortOwnedAttributes(Class clazz) {
		final List<? extends Property> ownedAttributes = clazz.getOwnedAttributes();
		List<Property> result = new java.util.ArrayList<Property>(ownedAttributes.size());

		for (Property next : ownedAttributes) {
			if (next.getAssociation() == null) {
				result.add(next);
			}
		}

		// include association ends after attributes
		for (Property next : ownedAttributes) {
			if ((next.getAssociation() != null) && (next.getOtherEnd() != null) &&
					(next.getOtherEnd().getType() == clazz)) {

				result.add(next);
			}
		}

		return result;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		Class classifier = (Class) object;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotationImage(classifier);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		Class classifier = (Class) element;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getName(classifier);
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == classifier.getVisibility()) {
					return "";
				} else {
					return classifier.getVisibility().getName();
				}
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotation(classifier);
			case IUMLTableProperties.DEFAULT_VALUE_INDEX:
				String text = NotationUtil.getShortDescription(classifier);
				return (text == null)
						? ""
						: text;
			default:
				return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Classifier classifier = (Classifier) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return classifier.getName();
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return new Integer(classifier.getVisibility().getValue());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		NamedElementOperations.modify(element, property, value);
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection, int index) {

		// see if we're pasting associations. If so, they actually go into our package (but the same controlled unit!)
		List<Association> associations = new java.util.ArrayList<Association>();
		for (Object next : collection) {
			if (next instanceof Association) {
				associations.add((Association) next);
			}
		}
		if (!associations.isEmpty()) {
			Collection<Object> newCollection = new java.util.ArrayList<Object>(collection);
			newCollection.removeAll(associations);
			collection = newCollection;
		}

		Command result = (collection.isEmpty() && !associations.isEmpty())
				? IdentityCommand.INSTANCE
				: super.createAddCommand(domain, owner, feature, collection, index);

		if (!associations.isEmpty() && result.canExecute()) {
			Package nearestPackage = ((Class) owner).getNearestPackage();
			CompoundCommand compound = new CompoundCommand(CompoundCommand.MERGE_COMMAND_ALL);
			compound.append(result);
			result = compound;

			// add the associations to the package, but sneak them in a Trojan horse because otherwise they would be blocked
			// by the package's item provider
			compound.append(
				AddCommand.create(
					domain, nearestPackage, UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
					TrojanHorse.wrap(associations, owner, feature, adapterFactory)));

			if (owner.eResource() != nearestPackage.eResource()) {
				// need to co-control the associations
				compound.append(new AddCommand(domain, owner.eResource().getContents(), associations));
			}

			// see if any associations have navigable non-owned members that we also want to paste into ourselves
			List<Property> navigableEnds = new java.util.ArrayList<Property>();

			for (Association next : associations) {
				for (Property end : next.getMemberEnds()) {
					if (end.getOwner() == null) {
						navigableEnds.add(end);
					}
				}
			}

			if (!navigableEnds.isEmpty()) {
				// add the navigable ends to the destination class
				compound.append(
					AddCommand.create(
						domain, owner, UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, navigableEnds));

				// AND make sure that the opposites that we copied are typed by the destination class, otherwise it's
				// not a valid association
				Type type = (Type) owner;
				for (Property next : navigableEnds) {
					Property other = next.getOtherEnd();
					if (other != null) {
						compound.append(
							SetCommand.create(domain, other, UMLPackage.Literals.TYPED_ELEMENT__TYPE, type));
					}
				}
			}
		}

		return result;
	}
}
