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
package org.eclipse.mdht.uml.ui.navigator.internal.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.edit.providers.ArtifactItemProvider;
import org.eclipse.uml2.uml.edit.providers.AssociationClassItemProvider;
import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;
import org.eclipse.uml2.uml.edit.providers.ClassItemProvider;
import org.eclipse.uml2.uml.edit.providers.CommentItemProvider;
import org.eclipse.uml2.uml.edit.providers.ConstraintItemProvider;
import org.eclipse.uml2.uml.edit.providers.DataTypeItemProvider;
import org.eclipse.uml2.uml.edit.providers.DependencyItemProvider;
import org.eclipse.uml2.uml.edit.providers.EnumerationItemProvider;
import org.eclipse.uml2.uml.edit.providers.EnumerationLiteralItemProvider;
import org.eclipse.uml2.uml.edit.providers.GeneralizationItemProvider;
import org.eclipse.uml2.uml.edit.providers.InterfaceItemProvider;
import org.eclipse.uml2.uml.edit.providers.ManifestationItemProvider;
import org.eclipse.uml2.uml.edit.providers.ModelItemProvider;
import org.eclipse.uml2.uml.edit.providers.PackageImportItemProvider;
import org.eclipse.uml2.uml.edit.providers.PackageItemProvider;
import org.eclipse.uml2.uml.edit.providers.PrimitiveTypeItemProvider;
import org.eclipse.uml2.uml.edit.providers.ProfileApplicationItemProvider;
import org.eclipse.uml2.uml.edit.providers.PropertyItemProvider;
import org.eclipse.uml2.uml.edit.providers.RealizationItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.eclipse.uml2.uml.edit.providers.UsageItemProvider;

public class NavigatorUMLItemProviderAdapterFactory extends UMLItemProviderAdapterFactory {

	// TODO add a preference setting for ProjectExplorer stereotype names
	private boolean showKeywords() {
		return false;
	}

	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return artifactItemProvider;
	}

	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return associationItemProvider;
	}

	@Override
	public Adapter createAssociationClassAdapter() {
		if (associationClassItemProvider == null) {
			associationClassItemProvider = new AssociationClassItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return associationClassItemProvider;
	}

	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return classItemProvider;
	}

	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					// always show keywords
					return super.appendKeywords(text, object);
				}

				@Override
				public String getText(Object object) {
					// show type name, but not body text
					return appendType(appendKeywords(new StringBuffer(), object), "_UI_Comment_type").toString(); //$NON-NLS-1$
				}
			};
		}
		return commentItemProvider;
	}

	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return constraintItemProvider;
	}

	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return dataTypeItemProvider;
	}

	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return dependencyItemProvider;
	}

	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return enumerationItemProvider;
	}

	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return enumerationLiteralItemProvider;
	}

	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return generalizationItemProvider;
	}

	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return interfaceItemProvider;
	}

	@Override
	public Adapter createManifestationAdapter() {
		if (manifestationItemProvider == null) {
			manifestationItemProvider = new ManifestationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return manifestationItemProvider;
	}

	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}

				@Override
				public String getText(Object object) {
					String label = super.getText(object);
					if (((Model) object).eResource().isModified()) {
						label += " *";
					}
					return label;
				}
			};
		}

		return modelItemProvider;
	}

	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return packageItemProvider;
	}

	@Override
	public Adapter createPackageImportAdapter() {
		if (packageImportItemProvider == null) {
			packageImportItemProvider = new PackageImportItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return packageImportItemProvider;
	}

	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return primitiveTypeItemProvider;
	}

	@Override
	public Adapter createProfileApplicationAdapter() {
		if (profileApplicationItemProvider == null) {
			profileApplicationItemProvider = new ProfileApplicationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return profileApplicationItemProvider;
	}

	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return propertyItemProvider;
	}

	@Override
	public Adapter createRealizationAdapter() {
		if (realizationItemProvider == null) {
			realizationItemProvider = new RealizationItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return realizationItemProvider;
	}

	@Override
	public Adapter createUsageAdapter() {
		if (usageItemProvider == null) {
			usageItemProvider = new UsageItemProvider(this) {
				@Override
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords()
							? super.appendKeywords(text, object)
							: text;
				}

				@Override
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return usageItemProvider;
	}

}
