/*
 * Copyright (c) 2008-2010, Dennis M. Sosnoski. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 * following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of
 * JiBX nor the names of its contributors may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.openhealthtools.mdht.uml.cda.core.util;

/**
 * Support methods for name conversions.
 */
public class NameUtilities {
	/**
	 * Convert potentially plural name to singular form. TODO: internationalization?
	 *
	 * @param name
	 *            base name
	 * @return singularized name
	 */
	public static String depluralize(String name) {
		if (name.endsWith("ies")) {
			return name.substring(0, name.length() - 3) + 'y';
		} else if (name.endsWith("sses")) {
			return name.substring(0, name.length() - 2);
		} else if (name.endsWith("s") && !name.endsWith("ss")) {
			return name.substring(0, name.length() - 1);
		} else if (name.endsWith("List")) {
			return name.substring(0, name.length() - 4);
		} else {
			return name;
		}
	}

	/**
	 * Convert singular name to plural form. TODO: internationalization?
	 *
	 * @param name
	 *            base name
	 * @return plural name
	 */
	public static String pluralize(String name) {

		// first check for already in plural form
		if (name.endsWith("List") ||
				(name.endsWith("s") && !name.endsWith("ss") || Character.isDigit(name.charAt(name.length() - 1)))) {
			return name;
		}

		// convert singular form to plural
		if (name.endsWith("y") && !name.endsWith("ay") && !name.endsWith("ey") && !name.endsWith("iy") &&
				!name.endsWith("oy") && !name.endsWith("uy")) {
			if (name.equalsIgnoreCase("any")) {
				return name;
			} else {
				return name.substring(0, name.length() - 1) + "ies";
			}
		} else if (name.endsWith("ss")) {
			return name + "es";
		} else {
			return name + 's';
		}
	}

	/**
	 * Checks if a name matches a pattern. This method accepts one or more '*' wildcard
	 * characters in the pattern, calling itself recursively in order to handle multiple wildcards.
	 *
	 * @param name
	 * @param pattern
	 *            match pattern
	 * @return <code>true</code> if pattern matched, <code>false</code> if not
	 */
	public static boolean isPatternMatch(String name, String pattern) {

		// check special match cases first
		if (pattern.length() == 0) {
			return name.length() == 0;
		} else if (pattern.charAt(0) == '*') {

			// check if the wildcard is all that's left of pattern
			if (pattern.length() == 1) {
				return true;
			} else {

				// check if another wildcard follows next segment of text
				pattern = pattern.substring(1);
				int split = pattern.indexOf('*');
				if (split > 0) {

					// recurse on each match to text segment
					String piece = pattern.substring(0, split);
					pattern = pattern.substring(split);
					int offset = -1;
					while ((offset = name.indexOf(piece, ++offset)) > 0) {
						int end = offset + piece.length();
						if (isPatternMatch(name.substring(end), pattern)) {
							return true;
						}
					}

				} else {

					// no more wildcards, need exact match to end of name
					return name.endsWith(pattern);

				}
			}
		} else {

			// check for leading text before first wildcard
			int split = pattern.indexOf('*');
			if (split > 0) {

				// match leading text to start of name
				String piece = pattern.substring(0, split);
				if (name.startsWith(piece)) {
					return isPatternMatch(name.substring(split), pattern.substring(split));
				} else {
					return false;
				}

			} else {

				// no wildcards, need exact match
				return name.equals(pattern);

			}
		}
		return false;
	}
}
