/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.openhealthtools.mdht.uml.common.notation.NotationUtil;
import org.openhealthtools.mdht.uml.common.util.ModelFilterUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.internal.Logger;
import org.openhealthtools.mdht.uml.edit.internal.UMLExtEditPlugin;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

/**
 * 
 * @version $Id: $
 */
public class PropertyExtItemProvider extends org.eclipse.uml2.uml.edit.providers.PropertyItemProvider implements
		ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public PropertyExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.PropertyItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		ComposedImage composedImage = (ComposedImage) super.getImage(object);
		if (ModelFilterUtil.isHidden((Property) object)) {
			composedImage.getImages().add(UMLExtEditPlugin.INSTANCE.getImage("full/ovr16/filtered"));
		}
		return composedImage;
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
	 * @see org.eclipse.uml2.uml.provider.PropertyItemProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		Property property = (Property) object;
		String name = getName(property);
		if (name == null || name.length() == 0) {
			name = getString("_UI_Property_type");
		}

		StringBuffer label = new StringBuffer();
		label.append(name);
		// if (property.getAssociation() instanceof AssociationClass
		// && property.isNavigable()) {
		// label.append(" : ").append(property.getAssociation().getName());
		// }
		// else
		if (property.getType() != null) {
			label.append(" : ").append(getName(property.getType()));
		}

		label.append(displayMultiplicity(property));

		String defaultValue = property.getDefault();
		if (defaultValue != null && defaultValue.length() > 0) {
			label.append(" = ");
			label.append(defaultValue);
		}
		return label.toString();
	}

	/**
	 * Display a multiplicity string of the format [lower..upper], unless
	 * both lower and upper are == 1.
	 * 
	 * @param multElement
	 * @return
	 */
	protected String displayMultiplicity(MultiplicityElement multElement) {
		StringBuffer multDisplay = new StringBuffer();
		if (checkDisplayRange(multElement)) {
			multDisplay.append(" [");
			multDisplay.append(multElement.getLower());
			multDisplay.append("..");
			multDisplay.append(multElement.getUpper() == LiteralUnlimitedNatural.UNLIMITED
					? "*"
					: Integer.toString(multElement.getUpper()));
			multDisplay.append("]");
		}

		return multDisplay.toString();
	}

	protected boolean checkDisplayRange(MultiplicityElement multElement) {
		return multElement.getLower() != 1 || multElement.getUpper() != 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<Element> getChildren(Object object) {
		Property property = (Property) object;
		List<Element> children = new ArrayList<Element>();
		// if (XSDProfileHelper.isNestedGroup(property)) {
		// children.addAll(TypeOperations.getOwnedAttributes(property.getType()));
		// }

		children.addAll(property.getOwnedComments());
		children.addAll(property.getClientDependencies());

		return children;
	}

	@Override
	public Collection<EStructuralFeature> getChildrenFeatures(Object object) {
		// disallow other add/move commands
		if (childrenFeatures == null) {
			childrenFeatures = new ArrayList<EStructuralFeature>();
			childrenFeatures.add(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS);
			childrenFeatures.add(UMLPackage.Literals.ELEMENT__OWNED_COMMENT);
			childrenFeatures.add(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE);
		}
		return childrenFeatures;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.PropertyItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuralFeature.class)) {
			case UMLPackage.STRUCTURAL_FEATURE__TYPE:
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
			case UMLPackage.PROPERTY__DEFAULT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		Property property = (Property) object;
		Type type = property.getType();

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(property);
			case IUMLTableProperties.TYPE_INDEX:
				if (type != null) {
					IItemLabelProvider provider = (IItemLabelProvider) getAdapterFactory().adapt(
						type, IItemLabelProvider.class);
					if (provider != null) {
						return provider.getImage(type);
					}
				}
			case IUMLTableProperties.ANNOTATION_INDEX: {
				return NotationUtil.getAnnotationImage(property);
			}
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		Property property = (Property) object;

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getName(property);
			case IUMLTableProperties.TYPE_INDEX:
				return (property.getType() == null)
						? null
						: getName(property.getType());
			case IUMLTableProperties.MULTIPLICITY_INDEX:
				return displayColumnMultiplicity(property);
			case IUMLTableProperties.AGGREGATION_INDEX:
				if (AggregationKind.NONE_LITERAL == property.getAggregation()) {
					return "";
				} else {
					return property.getAggregation().getName();
				}
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == property.getVisibility()) {
					return "";
				} else {
					return property.getVisibility().getName();
				}
			case IUMLTableProperties.ANNOTATION_INDEX: {
				return NotationUtil.getAnnotation(property);
			}
			case IUMLTableProperties.DEFAULT_VALUE_INDEX:
				if (property.getDefaultValue() != null) {
					return property.getDefaultValue().stringValue();
				} else {
					return "";
				}
			default:
				return null;
		}
	}

	/**
	 * Display a multiplicity string of the format "lower..upper".
	 * 
	 * @param multElement
	 * @return
	 */
	protected static String displayColumnMultiplicity(MultiplicityElement multElement) {
		if (multElement == null) {
			return "";
		}

		StringBuffer multDisplay = new StringBuffer();
		multDisplay.append(multElement.getLower());
		multDisplay.append("..");
		multDisplay.append(multElement.getUpper() == LiteralUnlimitedNatural.UNLIMITED
				? "*"
				: Integer.toString(multElement.getUpper()));

		return multDisplay.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.AGGREGATION_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.ANNOTATION_PROPERTY.equals(property)) {
			return false;
		} else if (IUMLTableProperties.DEFAULT_VALUE_PROPERTY.equals(property)) {
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
		Property umlProperty = (Property) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return umlProperty.getName();
		} else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return umlProperty.getType();
		} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
			return displayColumnMultiplicity(umlProperty);
		} else if (IUMLTableProperties.AGGREGATION_PROPERTY.equals(property)) {
			return new Integer(umlProperty.getAggregation().getValue());
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return new Integer(umlProperty.getVisibility().getValue());
		} else if (IUMLTableProperties.DEFAULT_VALUE_PROPERTY.equals(property)) {
			if (umlProperty.getDefaultValue() != null) {
				return umlProperty.getDefaultValue().stringValue();
			} else {
				return "";
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		final Property umlProperty = (Property) element;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property) ||
				IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			NamedElementOperations.modify(element, property, value);
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlProperty);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (IUMLTableProperties.TYPE_PROPERTY.equals(property) && value instanceof Classifier) {
						setLabel("Set Type");
						umlProperty.setType((Classifier) value);
					} else if (IUMLTableProperties.AGGREGATION_PROPERTY.equals(property) && value instanceof Integer) {
						setLabel("Set Aggregation");
						umlProperty.setAggregation(AggregationKind.get(((Integer) value).intValue()));
					} else if (IUMLTableProperties.DEFAULT_VALUE_PROPERTY.equals(property) && value instanceof String) {
						this.setLabel("Set Default Value");
						if (umlProperty.getDefaultValue() != null) {
							umlProperty.getDefaultValue().destroy();
						}
						String newValue = (String) value;
						if (newValue != null && newValue.trim().length() > 0) {
							// TODO check property type and create appropriate literal type
							LiteralString literal = UMLFactory.eINSTANCE.createLiteralString();
							literal.setValue(newValue);
							umlProperty.setDefaultValue(literal);
						}
					} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property) && value instanceof String) {
						setLabel("Set Multiplicity");
						setMultiplicity(umlProperty, value.toString());
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * Set multiplicity parsed from a string value, e.g. "0..1" or "1..*".
	 * Must be called from within a transaction.
	 */
	protected static void setMultiplicity(MultiplicityElement multiplicityElement, String value) {
		int lower = 1;
		int upper = 1;

		StringTokenizer stk = new StringTokenizer(value, ". ");
		if (stk.hasMoreTokens()) {
			lower = parseMultiplicityRangeToken(stk.nextToken());
			if (!stk.hasMoreTokens()) {
				if (lower == LiteralUnlimitedNatural.UNLIMITED) {
					lower = 0;
					upper = LiteralUnlimitedNatural.UNLIMITED;
				} else {
					upper = lower;
				}
			} else {
				upper = parseMultiplicityRangeToken(stk.nextToken());
				if (stk.hasMoreTokens()) {
					throw new IllegalArgumentException("illegal range specification: " + value);
				}
			}
		}

		// remove existing values so that we get change notification to update view
		if (multiplicityElement.getLowerValue() != null) {
			multiplicityElement.getLowerValue().destroy();
		}
		if (multiplicityElement.getUpperValue() != null) {
			multiplicityElement.getUpperValue().destroy();
		}

		multiplicityElement.setUpper(upper);
		multiplicityElement.setLower(lower);
	}

	/**
	 * Parse an multiplicity range token; map 'n', '*', or "unbounded" to -1
	 */
	protected static int parseMultiplicityRangeToken(String token) {
		try {
			if (token.equalsIgnoreCase("n") || token.equals("*") || token.equalsIgnoreCase("unbounded")) {
				return LiteralUnlimitedNatural.UNLIMITED;
			} else {
				return Integer.parseInt(token);
			}
		} catch (Exception ex) {
			throw new IllegalArgumentException("illegal range bound: " + token);
		}
	}

}
