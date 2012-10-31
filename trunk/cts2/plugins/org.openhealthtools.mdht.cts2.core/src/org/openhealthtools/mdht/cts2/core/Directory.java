/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Provides a directory or list of resources that match a specific filter and are ordered in a specified order. A directory is read-only and is not
 * necessarily immutable.Note that the name of the link to
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DirectoryEntry</i> is called "entries" rather than "entry". This allows subclasses to use
 * "entry" without type collisions in the Z.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getDirectoryFilter <em>Directory Filter</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getSortCriteria <em>Sort Criteria</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getComplete <em>Complete</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getNext <em>Next</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getNumEntries <em>Num Entries</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Directory#getPrev <em>Prev</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory()
 * @model abstract="true"
 *        extendedMetaData="name='Directory' kind='elementOnly'"
 * @generated
 */
public interface Directory extends Message {
	/**
	 * Returns the value of the '<em><b>Directory Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the filter(s) that were applied to generate this directory
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Directory Filter</em>' containment reference.
	 * @see #setDirectoryFilter(Filter)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_DirectoryFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directoryFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	Filter getDirectoryFilter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getDirectoryFilter <em>Directory Filter</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Directory Filter</em>' containment reference.
	 * @see #getDirectoryFilter()
	 * @generated
	 */
	void setDirectoryFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Sort Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the sort criteria used in the directory. When this is left as optional, there is the possibility that some directories may not be ordered. Some
	 * PSMs may chose to make <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">sortCriteria</i>
	 * mandatory, meaning that all directory listings must reflect some sort order.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Sort Criteria</em>' containment reference.
	 * @see #setSortCriteria(SortCriteria)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_SortCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sortCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	SortCriteria getSortCriteria();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getSortCriteria <em>Sort Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sort Criteria</em>' containment reference.
	 * @see #getSortCriteria()
	 * @generated
	 */
	void setSortCriteria(SortCriteria value);

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.CompleteDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that states whether the complete directory listing is included in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entries</i>
	 * or whether additional retrievals are needed to get the full listing.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @see #isSetComplete()
	 * @see #unsetComplete()
	 * @see #setComplete(CompleteDirectory)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_Complete()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='complete'"
	 * @generated
	 */
	CompleteDirectory getComplete();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Complete</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.CompleteDirectory
	 * @see #isSetComplete()
	 * @see #unsetComplete()
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(CompleteDirectory value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetComplete()
	 * @see #getComplete()
	 * @see #setComplete(CompleteDirectory)
	 * @generated
	 */
	void unsetComplete();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getComplete <em>Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Complete</em>' attribute is set.
	 * @see #unsetComplete()
	 * @see #getComplete()
	 * @see #setComplete(CompleteDirectory)
	 * @generated
	 */
	boolean isSetComplete();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that, when de-referenced, produces the next set of entries in the directory.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_Next()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DirectoryURI"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getNext <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Next</em>' attribute.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(String value);

	/**
	 * Returns the value of the '<em><b>Num Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the number of entries in this directory segment. Note that this is <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">not</i> the total number
	 * of entries in the complete directory listing - just the number of entries in this
	 * segment.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Num Entries</em>' attribute.
	 * @see #setNumEntries(BigInteger)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_NumEntries()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NaturalNumber" required="true"
	 *        extendedMetaData="kind='attribute' name='numEntries'"
	 * @generated
	 */
	BigInteger getNumEntries();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getNumEntries <em>Num Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Num Entries</em>' attribute.
	 * @see #getNumEntries()
	 * @generated
	 */
	void setNumEntries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that, when de-referenced, produces the preceding set of entries in the directory.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Prev</em>' attribute.
	 * @see #setPrev(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDirectory_Prev()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DirectoryURI"
	 *        extendedMetaData="kind='attribute' name='prev'"
	 * @generated
	 */
	String getPrev();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Directory#getPrev <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Prev</em>' attribute.
	 * @see #getPrev()
	 * @generated
	 */
	void setPrev(String value);

} // Directory
