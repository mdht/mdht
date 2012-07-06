<?xml version="1.0"?>
<!--
Copyright (c) 2012 Sean Muir.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:      Sean Muir (JKM Software) - initial implementation
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:dita2xslfo="http://dita-ot.sourceforge.net/ns/200910/dita2xslfo"
	version="1.0" exclude-result-prefixes="dita2xslfo">
	<xsl:template name="insertBodyOddFooter">
		<fo:static-content flow-name="odd-body-footer">
			<fo:table table-layout="fixed" inline-progression-dimension="100%">
				<fo:table-column column-width="33.3%" />
				<fo:table-column column-width="33.3%" />
				<fo:table-column column-width="33.3%" />
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell>
							<fo:block text-align="start">
								HL7 IG for CDA R2 L3
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="center">
								<xsl:value-of
									select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="end">
								Page
								<fo:page-number />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>			
					<fo:table-row>
						<fo:table-cell number-columns-spanned="3">
							<fo:block text-align="center">&#xA9; 2012 Health Level Seven
								International All rights reserved</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
		</fo:static-content>
	</xsl:template>

</xsl:stylesheet>
