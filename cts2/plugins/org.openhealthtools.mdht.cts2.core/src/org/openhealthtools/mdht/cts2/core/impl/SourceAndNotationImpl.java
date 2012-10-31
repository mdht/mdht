/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageReference;
import org.openhealthtools.mdht.cts2.core.OntologySyntaxReference;
import org.openhealthtools.mdht.cts2.core.SourceAndNotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl#getSourceAndNotationDescription <em>Source And Notation Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl#getSourceDocument <em>Source Document</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl#getSourceLanguage <em>Source Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SourceAndNotationImpl#getSourceDocumentSyntax <em>Source Document Syntax</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SourceAndNotationImpl extends EObjectImpl implements SourceAndNotation {
	/**
	 * The default value of the '{@link #getSourceAndNotationDescription() <em>Source And Notation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAndNotationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_AND_NOTATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAndNotationDescription() <em>Source And Notation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAndNotationDescription()
	 * @generated
	 * @ordered
	 */
	protected String sourceAndNotationDescription = SOURCE_AND_NOTATION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDocument() <em>Source Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDocument() <em>Source Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceDocument()
	 * @generated
	 * @ordered
	 */
	protected String sourceDocument = SOURCE_DOCUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceLanguage() <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected OntologyLanguageReference sourceLanguage;

	/**
	 * The cached value of the '{@link #getSourceDocumentSyntax() <em>Source Document Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceDocumentSyntax()
	 * @generated
	 * @ordered
	 */
	protected OntologySyntaxReference sourceDocumentSyntax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SourceAndNotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SOURCE_AND_NOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceAndNotationDescription() {
		return sourceAndNotationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceAndNotationDescription(String newSourceAndNotationDescription) {
		String oldSourceAndNotationDescription = sourceAndNotationDescription;
		sourceAndNotationDescription = newSourceAndNotationDescription;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION,
				oldSourceAndNotationDescription, sourceAndNotationDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceDocument() {
		return sourceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceDocument(String newSourceDocument) {
		String oldSourceDocument = sourceDocument;
		sourceDocument = newSourceDocument;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT, oldSourceDocument,
				sourceDocument));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageReference getSourceLanguage() {
		return sourceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSourceLanguage(OntologyLanguageReference newSourceLanguage, NotificationChain msgs) {
		OntologyLanguageReference oldSourceLanguage = sourceLanguage;
		sourceLanguage = newSourceLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE, oldSourceLanguage,
				newSourceLanguage);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceLanguage(OntologyLanguageReference newSourceLanguage) {
		if (newSourceLanguage != sourceLanguage) {
			NotificationChain msgs = null;
			if (sourceLanguage != null) {
				msgs = ((InternalEObject) sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE, null, msgs);
			}
			if (newSourceLanguage != null) {
				msgs = ((InternalEObject) newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE, null, msgs);
			}
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE, newSourceLanguage,
				newSourceLanguage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologySyntaxReference getSourceDocumentSyntax() {
		return sourceDocumentSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSourceDocumentSyntax(OntologySyntaxReference newSourceDocumentSyntax,
			NotificationChain msgs) {
		OntologySyntaxReference oldSourceDocumentSyntax = sourceDocumentSyntax;
		sourceDocumentSyntax = newSourceDocumentSyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX,
				oldSourceDocumentSyntax, newSourceDocumentSyntax);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceDocumentSyntax(OntologySyntaxReference newSourceDocumentSyntax) {
		if (newSourceDocumentSyntax != sourceDocumentSyntax) {
			NotificationChain msgs = null;
			if (sourceDocumentSyntax != null) {
				msgs = ((InternalEObject) sourceDocumentSyntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX, null, msgs);
			}
			if (newSourceDocumentSyntax != null) {
				msgs = ((InternalEObject) newSourceDocumentSyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX, null, msgs);
			}
			msgs = basicSetSourceDocumentSyntax(newSourceDocumentSyntax, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX,
				newSourceDocumentSyntax, newSourceDocumentSyntax));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX:
				return basicSetSourceDocumentSyntax(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION:
				return getSourceAndNotationDescription();
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT:
				return getSourceDocument();
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX:
				return getSourceDocumentSyntax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION:
				setSourceAndNotationDescription((String) newValue);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT:
				setSourceDocument((String) newValue);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE:
				setSourceLanguage((OntologyLanguageReference) newValue);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX:
				setSourceDocumentSyntax((OntologySyntaxReference) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION:
				setSourceAndNotationDescription(SOURCE_AND_NOTATION_DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT:
				setSourceDocument(SOURCE_DOCUMENT_EDEFAULT);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE:
				setSourceLanguage((OntologyLanguageReference) null);
				return;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX:
				setSourceDocumentSyntax((OntologySyntaxReference) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION:
				return SOURCE_AND_NOTATION_DESCRIPTION_EDEFAULT == null
						? sourceAndNotationDescription != null
						: !SOURCE_AND_NOTATION_DESCRIPTION_EDEFAULT.equals(sourceAndNotationDescription);
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT:
				return SOURCE_DOCUMENT_EDEFAULT == null
						? sourceDocument != null
						: !SOURCE_DOCUMENT_EDEFAULT.equals(sourceDocument);
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case CorePackage.SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX:
				return sourceDocumentSyntax != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceAndNotationDescription: ");
		result.append(sourceAndNotationDescription);
		result.append(", sourceDocument: ");
		result.append(sourceDocument);
		result.append(')');
		return result.toString();
	}

} // SourceAndNotationImpl
