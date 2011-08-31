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
package org.openhealthtools.mdht.uml.edit.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

/**
 * 
 * $Id: $
 */
public class UML2ExtendedAdapterFactory extends UMLItemProviderAdapterFactory {

	/**
	 * 
	 */
	public UML2ExtendedAdapterFactory() {
		super();

		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ICellModifier.class);
	}

	@Override
	public boolean isFactoryForType(Object object) {
		if (object instanceof SimpleListNotifier) {
			return true;
		} else if (object instanceof DiagramFolder) {
			return true;
		} else {
			return super.isFactoryForType(object);
		}
	}

	@Override
	public Adapter createAdapter(Notifier target) {
		if (target instanceof SimpleListNotifier) {
			return createListAdapter();
		} else if (target instanceof EObject) {
			return super.createAdapter(target);
		} else {
			// if Resource is selected
			return null;
		}
	}

	protected SimpleListItemProvider listItemProvider;

	public Adapter createListAdapter() {
		if (listItemProvider == null) {
			listItemProvider = new SimpleListItemProvider(this);
		}

		return listItemProvider;
	}

	protected DiagramFolderAdapter diagramFolderItemProvider;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#resolve(java.lang.Object, java.lang.Object)
	 */
	// protected Object resolve(Object object, Object type) {
	// if (object instanceof DiagramFolder) {
	// return createDiagramFolderItemProvider();
	// }
	// return super.resolve(object, type);
	// }

	// public Adapter createDiagramFolderItemProvider() {
	// if (diagramFolderItemProvider == null) {
	// diagramFolderItemProvider = new DiagramFolderAdapter(this);
	// }
	//
	// return diagramFolderItemProvider;
	// }

	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationExtItemProvider(this);
		}

		return associationItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createAssociationClassAdapter()
	 */
	@Override
	public Adapter createAssociationClassAdapter() {
		if (associationClassItemProvider == null) {
			associationClassItemProvider = new AssociationClassExtItemProvider(this);
		}

		return associationClassItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createClassAdapter()
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassExtItemProvider(this);
		}

		return classItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createDataTypeAdapter()
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeExtItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createCommentAdapter()
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentExtItemProvider(this);
		}

		return commentItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory#createConstraintAdapter()
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintExtItemProvider(this);
		}

		return constraintItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createDependencyAdapter()
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyExtItemProvider(this);
		}

		return dependencyItemProvider;
	}

	@Override
	public Adapter createElementImportAdapter() {
		if (elementImportItemProvider == null) {
			elementImportItemProvider = new ElementImportExtItemProvider(this);
		}

		return elementImportItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createEnumerationAdapter()
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationExtItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createEnumerationLiteralAdapter()
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralExtItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createGeneralizationAdapter()
	 */
	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationExtItemProvider(this);
		}

		return generalizationItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createInterfaceAdapter()
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceExtItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createModelAdapter()
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelExtItemProvider(this);
		}

		return modelItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createOperationAdapter()
	 */
	@Override
	public Adapter createOperationAdapter() {
		return new OperationExtItemProvider(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createPackageAdapter()
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageExtItemProvider(this);
		}

		return packageItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createPackageImportAdapter()
	 */
	@Override
	public Adapter createPackageImportAdapter() {
		if (packageImportItemProvider == null) {
			packageImportItemProvider = new PackageImportExtItemProvider(this);
		}

		return packageImportItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createParameterAdapter()
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterExtItemProvider(this);
		}

		return parameterItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createPrimitiveTypeAdapter()
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeExtItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createProfileAdapter()
	 */
	@Override
	public Adapter createProfileAdapter() {
		if (profileItemProvider == null) {
			profileItemProvider = new ProfileExtItemProvider(this);
		}

		return profileItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createProfileApplicationAdapter()
	 */
	@Override
	public Adapter createProfileApplicationAdapter() {
		return super.createProfileApplicationAdapter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createPropertyAdapter()
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyExtItemProvider(this);
		}

		return propertyItemProvider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.provider.UML2ItemProviderAdapterFactory#createStereotypeAdapter()
	 */
	@Override
	public Adapter createStereotypeAdapter() {
		if (stereotypeItemProvider == null) {
			stereotypeItemProvider = new StereotypeExtItemProvider(this);
		}

		return stereotypeItemProvider;
	}

	@Override
	public Adapter createSubstitutionAdapter() {
		if (substitutionItemProvider == null) {
			substitutionItemProvider = new SubstitutionExtItemProvider(this);
		}

		return substitutionItemProvider;
	}

	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentExtItemProvider(this);
		}

		return componentItemProvider;
	}

	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorExtItemProvider(this);
		}

		return actorItemProvider;
	}

	@Override
	public Adapter createUseCaseAdapter() {
		if (useCaseItemProvider == null) {
			useCaseItemProvider = new UseCaseExtItemProvider(this);
		}

		return useCaseItemProvider;
	}

	@Override
	public Adapter createIncludeAdapter() {
		if (includeItemProvider == null) {
			includeItemProvider = new IncludeExtItemProvider(this);
		}

		return includeItemProvider;
	}

	@Override
	public Adapter createExtendAdapter() {
		if (extendItemProvider == null) {
			extendItemProvider = new ExtendExtItemProvider(this);
		}

		return extendItemProvider;
	}

	@Override
	public Adapter createInterfaceRealizationAdapter() {
		if (interfaceRealizationItemProvider == null) {
			interfaceRealizationItemProvider = new InterfaceRealizationExtItemProvider(this);
		}

		return interfaceRealizationItemProvider;
	}

	protected boolean showBusinessNames = false;

	public boolean isShowBusinessNames() {
		return showBusinessNames;
	}

	public void setShowBusinessNames(boolean showBusinessNames) {
		this.showBusinessNames = showBusinessNames;
	}
}
