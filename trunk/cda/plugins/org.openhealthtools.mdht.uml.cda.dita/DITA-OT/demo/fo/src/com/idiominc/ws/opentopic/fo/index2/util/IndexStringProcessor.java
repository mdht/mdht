package com.idiominc.ws.opentopic.fo.index2.util;

import com.idiominc.ws.opentopic.fo.index2.IndexEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Copyright � 2004-2006 by Idiom Technologies, Inc. All rights reserved.
IDIOM is a registered trademark of Idiom Technologies, Inc. and WORLDSERVER
and WORLDSTART are trademarks of Idiom Technologies, Inc. All other
trademarks are the property of their respective owners.

IDIOM TECHNOLOGIES, INC. IS DELIVERING THE SOFTWARE "AS IS," WITH
ABSOLUTELY NO WARRANTIES WHATSOEVER, WHETHER EXPRESS OR IMPLIED,  AND IDIOM
TECHNOLOGIES, INC. DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING
BUT NOT LIMITED TO WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
PURPOSE AND WARRANTY OF NON-INFRINGEMENT. IDIOM TECHNOLOGIES, INC. SHALL NOT
BE LIABLE FOR INDIRECT, INCIDENTAL, SPECIAL, COVER, PUNITIVE, EXEMPLARY,
RELIANCE, OR CONSEQUENTIAL DAMAGES (INCLUDING BUT NOT LIMITED TO LOSS OF
ANTICIPATED PROFIT), ARISING FROM ANY CAUSE UNDER OR RELATED TO  OR ARISING
OUT OF THE USE OF OR INABILITY TO USE THE SOFTWARE, EVEN IF IDIOM
TECHNOLOGIES, INC. HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

Idiom Technologies, Inc. and its licensors shall not be liable for any
damages suffered by any person as a result of using and/or modifying the
Software or its derivatives. In no event shall Idiom Technologies, Inc.'s
liability for any damages hereunder exceed the amounts received by Idiom
Technologies, Inc. as a result of this transaction.

These terms and conditions supersede the terms and conditions in any
licensing agreement to the extent that such terms and conditions conflict
with those set forth herein.

This file is part of the DITA Open Toolkit project hosted on Sourceforge.net.
See the accompanying license.txt file for applicable licenses.
*/
public abstract class IndexStringProcessor {
	private static final String COLON = ":";
	private static final String SEMICOLON = ";";
	private static final String STARTRANGE = "<$startrange>";
	private static final String ENDRANGE = "<$endrange>";
	private static final String NOPAGE = "<$nopage>";
	private static final String SINGLEPAGE = "<$singlepage>";
	private static final String SORT_START_BRAKET = "[";
	private static final String SORT_END_BRAKET = "]";
	private static final String SO = "<so>";
	private static final String LT = "<";
	private static final String GT = ">";


	/**
	 * Parse the index marker string and create IndexEntry object from one
	 *
	 * @param theIndexMarkerString index marker string
	 * @return IndexEntry objects created from the index string
	 * @see "Adobe Framemaker 7.1" help, topic "Adding index markers" (page is "1_15_8_0.html") for syntax details
	 */
	public static IndexEntry[] processIndexString(final String theIndexMarkerString) {
		List resList = new ArrayList();
		StringTokenizer stringTokenizer = new StringTokenizer(normalizeTextValue(theIndexMarkerString), SEMICOLON);
		while (stringTokenizer.hasMoreTokens()) {
			// string may contain multiple index entries. split and process each separately
			String entry = stringTokenizer.nextToken().trim();
			if (entry.length() > 0) {
				//Split index string and sort string
				String sortString = null;
				int sortStartIdx = entry.indexOf(SORT_START_BRAKET);
				if (sortStartIdx > 0) {
					//there is a sort string
					int sortEndIdx = entry.indexOf(SORT_END_BRAKET);
					if (sortEndIdx > 0 && sortEndIdx > sortStartIdx) {
						sortString = entry.substring(sortStartIdx + SORT_START_BRAKET.length(), sortEndIdx);
						entry = entry.substring(0, sortStartIdx);
					}
				}
				// process index string and add it to result list
				IndexEntry indexEntry = processEntry(entry, sortString);
				if (null != indexEntry) {
					resList.add(indexEntry);
				}
			}
		}
		return (IndexEntry[]) resList.toArray(new IndexEntry[resList.size()]);
	}


	private static IndexEntry processEntry(final String theEntry, final String theSortString) {
		IndexEntry res = null;

		IndexEntry parent = null;

		String sortString = (null != theSortString) ? theSortString : "";

		StringTokenizer entryColonTokenizer = new StringTokenizer(theEntry, COLON);
		StringTokenizer sortStringColonTokenizer = new StringTokenizer(sortString, COLON);

		StringBuffer referenceIDBuf = new StringBuffer();
		while (entryColonTokenizer.hasMoreTokens()) {
			String s = entryColonTokenizer.nextToken();
			boolean isLastToken = !entryColonTokenizer.hasMoreTokens();

			IndexEntryImpl indexEntry;

			String currSortString = null;
			if (sortString.length() > 0) {
				if (sortStringColonTokenizer.hasMoreTokens()) {
					currSortString = sortStringColonTokenizer.nextToken();
				} else {
					System.err.println("Possibly invalid sort string \"" + theSortString + "\" for the index entry \"" + theEntry + "\"!");
				}
			}

			final boolean parentSuppressesThePageNumber = (null != parent) ? parent.isSuppressesThePageNumber() : false;

			indexEntry = createIndexEntry(s, currSortString, parentSuppressesThePageNumber);

			referenceIDBuf.append(indexEntry.getValue());
			referenceIDBuf.append(':');

			if (!indexEntry.isSuppressesThePageNumber()) {
				indexEntry.addRefID(referenceIDBuf.toString());
			}

			if (null != parent) {
				parent.addChild(indexEntry);
			}
			parent = indexEntry;

			if (null == res) {
				res = parent;
			}

			if (isLastToken) {
				/*
					Start and end range flags should be set for the last child only
					but because of framemaker's syntax the first level entry contains it.
					That is why I took flags from the first (root) entry and set these flags
					to the last parsed entry.
				*/
				final boolean startingRange = res.isStartingRange();
				final boolean endsRange = res.isEndingRange();

				res.setStartRange(false);
				res.setEndsRange(false);

				indexEntry.setStartRange(startingRange);
				indexEntry.setEndsRange(endsRange);
			}

		}
		return res;
	}


	/**
	 * Method equals to the normalize-space xslt function
	 *
	 * @param theString string to normalize
	 * @return normalized string
	 */
	public static String normalizeTextValue(final String theString) {
		if (null != theString && theString.length() > 0) {
			String res = theString.replaceAll("[\\s\\n]+", " ");
			res = res.replaceAll("[\\s]+:", ":"); //replace spaces before ':'
			return res.replaceAll(":[\\s]+", ":"); //replace spaces after ':'
		}
		return theString;
	}


	private static IndexEntryImpl createIndexEntry(String theValue, String theSortString, boolean theIsParentNoPage) {
		String soString;
		int soIdxOf = theValue.indexOf(SO);
		if (soIdxOf > 0) {
			soString = theValue.substring(soIdxOf + SO.length());
			theValue = theValue.substring(0, soIdxOf);
		} else {
			soString = null;
		}

		boolean suppressesThePageNumber = theIsParentNoPage;
		int nopageIdx = theValue.indexOf(NOPAGE);
		if (nopageIdx == 0) {
			suppressesThePageNumber = true;
			theValue = theValue.substring(NOPAGE.length());
		}

		boolean restoresPageNumber = false;
		int singlepageIdx = theValue.indexOf(SINGLEPAGE);
		if (singlepageIdx == 0) {
			restoresPageNumber = true;
			suppressesThePageNumber = false;
			theValue = theValue.substring(SINGLEPAGE.length());
		}

		boolean startsRange = false;
		int startsRangeIdx = theValue.indexOf(STARTRANGE);
		if (startsRangeIdx == 0) {
			startsRange = true;
			theValue = theValue.substring(STARTRANGE.length());
		}

		boolean endsRange = false;
		int endsRangeIdx = theValue.indexOf(ENDRANGE);
		if (endsRangeIdx == 0) {
			endsRange = true;
			theValue = theValue.substring(ENDRANGE.length());
		}

		String strippedFormatting = stripFormatting(theValue);

		IndexEntryImpl indexEntry = new IndexEntryImpl(strippedFormatting, soString, theSortString, theValue);
		indexEntry.setSuppressesThePageNumber(suppressesThePageNumber);
		indexEntry.setRestoresPageNumber(restoresPageNumber);
		indexEntry.setStartRange(startsRange);
		indexEntry.setEndsRange(endsRange);
		indexEntry.setSortString(theSortString);
		return indexEntry;
	}


	/**
	 * Strips Adobe Framemaker index string formatting from string<br>
	 * <code>See "Adobe Framemaker 7.1" help, topic "Adding index markers" (page is "1_15_8_0.html") for details</code>
	 *
	 * @param theValue formatted string
	 * @return string without formatting
	 */
	private static String stripFormatting(String theValue) {
		int ltPos = theValue.indexOf(LT);
		int gtPos = theValue.indexOf(GT);
		if ((ltPos == -1) && (gtPos == -1)) {
			return theValue;
		} else if (ltPos == -1 || gtPos == -1 || (ltPos > gtPos)) {
			System.err.println("Possibly bad formatting in string \"" + theValue + "\"");
			return theValue;
		}
		String value = theValue.substring(0, ltPos) + theValue.substring(gtPos + 1);
		return stripFormatting(value);
	}
}
