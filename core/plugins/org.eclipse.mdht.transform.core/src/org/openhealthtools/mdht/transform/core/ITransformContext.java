/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.transform.core;

/**
 * The context provides components of a transformation with information about the context of its execution, tuning options, and a general-purpose
 * stash of data to communicate to future invocations of the same or other rules.
 */
public interface ITransformContext {
	/**
	 * Gets a boolean-valued transformation option.
	 * 
	 * @param name
	 *            a transformation option
	 * 
	 * @return the option value, or {@code false} if it isn't set
	 * 
	 * @see #setBooleanOption(String, boolean)
	 * @see #getStringOption(String)
	 */
	boolean getBooleanOption(String name);

	/**
	 * Sets a boolean option value.
	 * 
	 * @param name
	 *            the option name
	 * @param value
	 *            the value
	 * 
	 * @see #getBooleanOption(String)
	 */
	void setBooleanOption(String name, boolean value);

	/**
	 * Gets a bstringoolean-valued transformation option.
	 * 
	 * @param name
	 *            a transformation option
	 * 
	 * @return the option value, or {@code null} if it isn't set
	 * 
	 * @see #setStringOption(String, String)
	 * @see #setBooleanOption(String, boolean)
	 */
	String getStringOption(String name);

	/**
	 * Sets a string option value.
	 * 
	 * @param name
	 *            the option name
	 * @param value
	 *            the value
	 * 
	 * @see #getStringOption(String)
	 */
	void setStringOption(String name, String value);

	/**
	 * Gets an arbitrary bit of data that may have been stashed previously.
	 * 
	 * @param key
	 *            the key to look up
	 * 
	 * @return the object, or {@code null} if it is not present
	 * 
	 * @see #put(Object, Object)
	 * @see #get(Class)
	 */
	Object get(Object key);

	/**
	 * Gets an bit of data of a specified type that may have been stashed previously under that type as the key.
	 * 
	 * @param typeKey
	 *            the type of object to look up
	 * 
	 * @return the object, or {@code null} if it is not present
	 * 
	 * @see #put(Class, Object)
	 * @see #get(Object)
	 */
	<T> T get(Class<? extends T> typeKey);

	/**
	 * Stashes an arbitrary bit of data.
	 * 
	 * @param key
	 *            the key to assign to the data
	 * @param value
	 *            the data
	 * 
	 * @return the data previously stashed under that {@code key}, or {@code null} if there was nothing
	 * 
	 * @see #get(Object)
	 * @see #put(Class, Object)
	 */
	Object put(Object key, Object value);

	/**
	 * Stashes an object of the given type.
	 * 
	 * @param typeKey
	 *            the type of the object to stash
	 * @param value
	 *            the object
	 * 
	 * @return the data previously stashed under that {@code typeKey}, or {@code null} if there was nothing
	 * 
	 * @see #get(Class)
	 * @see #put(Object, Object)
	 */
	<T> Object put(Class<? super T> typeKey, T value);

	void dispose();
}
