/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.statement.DocumentRoot;
import org.openhealthtools.mdht.cts2.statement.Statement;
import org.openhealthtools.mdht.cts2.statement.StatementDirectory;
import org.openhealthtools.mdht.cts2.statement.StatementList;
import org.openhealthtools.mdht.cts2.statement.StatementMsg;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getStatement <em>Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getStatementDirectory <em>Statement Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getStatementList <em>Statement List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.impl.DocumentRootImpl#getStatementMsg <em>Statement Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentRootImpl() {
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
		return StatementPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, StatementPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Statement getStatement() {
		return (Statement) getMixed().get(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT, newStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		((FeatureMap.Internal) getMixed()).set(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT, newStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementDirectory getStatementDirectory() {
		return (StatementDirectory) getMixed().get(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_DIRECTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatementDirectory(StatementDirectory newStatementDirectory, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_DIRECTORY, newStatementDirectory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatementDirectory(StatementDirectory newStatementDirectory) {
		((FeatureMap.Internal) getMixed()).set(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_DIRECTORY, newStatementDirectory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementList getStatementList() {
		return (StatementList) getMixed().get(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatementList(StatementList newStatementList, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_LIST, newStatementList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatementList(StatementList newStatementList) {
		((FeatureMap.Internal) getMixed()).set(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_LIST, newStatementList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementMsg getStatementMsg() {
		return (StatementMsg) getMixed().get(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatementMsg(StatementMsg newStatementMsg, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_MSG, newStatementMsg, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatementMsg(StatementMsg newStatementMsg) {
		((FeatureMap.Internal) getMixed()).set(StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_MSG, newStatementMsg);
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
			case StatementPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case StatementPackage.DOCUMENT_ROOT__STATEMENT:
				return basicSetStatement(null, msgs);
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_DIRECTORY:
				return basicSetStatementDirectory(null, msgs);
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_LIST:
				return basicSetStatementList(null, msgs);
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_MSG:
				return basicSetStatementMsg(null, msgs);
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
			case StatementPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case StatementPackage.DOCUMENT_ROOT__STATEMENT:
				return getStatement();
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_DIRECTORY:
				return getStatementDirectory();
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_LIST:
				return getStatementList();
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_MSG:
				return getStatementMsg();
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
			case StatementPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT:
				setStatement((Statement) newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_DIRECTORY:
				setStatementDirectory((StatementDirectory) newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_LIST:
				setStatementList((StatementList) newValue);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_MSG:
				setStatementMsg((StatementMsg) newValue);
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
			case StatementPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT:
				setStatement((Statement) null);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_DIRECTORY:
				setStatementDirectory((StatementDirectory) null);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_LIST:
				setStatementList((StatementList) null);
				return;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_MSG:
				setStatementMsg((StatementMsg) null);
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
			case StatementPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case StatementPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case StatementPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case StatementPackage.DOCUMENT_ROOT__STATEMENT:
				return getStatement() != null;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_DIRECTORY:
				return getStatementDirectory() != null;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_LIST:
				return getStatementList() != null;
			case StatementPackage.DOCUMENT_ROOT__STATEMENT_MSG:
				return getStatementMsg() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // DocumentRootImpl
