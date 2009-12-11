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
package org.openhealthtools.mdht.uml.ui.navigator.internal.providers;

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

public class NavigatorUMLItemProviderAdapterFactory extends
		UMLItemProviderAdapterFactory {

	//TODO add a preference setting for ProjectExplorer stereotype names
	private boolean showKeywords() {
		return false;
	}
	
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return artifactItemProvider;
	}

	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return associationItemProvider;
	}

	public Adapter createAssociationClassAdapter() {
		if (associationClassItemProvider == null) {
			associationClassItemProvider = new AssociationClassItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return associationClassItemProvider;
	}

	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return classItemProvider;
	}

	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					// always show keywords
					return super.appendKeywords(text, object);
				}
				public String getText(Object object) {
					// show type name, but not body text
					return appendType(appendKeywords(new StringBuffer(), object),
								"_UI_Comment_type").toString(); //$NON-NLS-1$
				}
			};
		}
		return commentItemProvider;
	}

	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return constraintItemProvider;
	}

	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return dataTypeItemProvider;
	}

	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return dependencyItemProvider;
	}

	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return enumerationItemProvider;
	}

	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return enumerationLiteralItemProvider;
	}

	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return generalizationItemProvider;
	}

	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return interfaceItemProvider;
	}

	public Adapter createManifestationAdapter() {
		if (manifestationItemProvider == null) {
			manifestationItemProvider = new ManifestationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return manifestationItemProvider;
	}

	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
				public String getText(Object object) {
					String label = super.getText(object);
					if (((Model)object).eResource().isModified()) {
						label += " *";
					}
					return label;
				}
			};
		}

		return modelItemProvider;
	}

	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return packageItemProvider;
	}

	public Adapter createPackageImportAdapter() {
		if (packageImportItemProvider == null) {
			packageImportItemProvider = new PackageImportItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return packageImportItemProvider;
	}

	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return primitiveTypeItemProvider;
	}

	public Adapter createProfileApplicationAdapter() {
		if (profileApplicationItemProvider == null) {
			profileApplicationItemProvider = new ProfileApplicationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return profileApplicationItemProvider;
	}

	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return propertyItemProvider;
	}

	public Adapter createRealizationAdapter() {
		if (realizationItemProvider == null) {
			realizationItemProvider = new RealizationItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return realizationItemProvider;
	}

	public Adapter createUsageAdapter() {
		if (usageItemProvider == null) {
			usageItemProvider = new UsageItemProvider(this) {
				protected StringBuffer appendKeywords(StringBuffer text, Object object) {
					return showKeywords() ? super.appendKeywords(text, object) : text;
				}
				protected StringBuffer appendType(StringBuffer text, String key) {
					return text;
				}
			};
		}

		return usageItemProvider;
	}

}
