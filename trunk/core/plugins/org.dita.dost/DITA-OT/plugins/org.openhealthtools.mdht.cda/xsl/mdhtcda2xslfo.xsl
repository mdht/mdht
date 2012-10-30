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
								<xsl:value-of select="$map/bookmeta/prodinfo/series" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="center">
								<xsl:value-of select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
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
						
							<fo:block text-align="center">
								<xsl:for-each select="$map/bookmeta/bookrights/bookowner/organization">
							&#xA9;<xsl:text> </xsl:text><xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" /><xsl:text> </xsl:text><xsl:value-of select="."/><xsl:text> </xsl:text>
							</xsl:for-each>		
							</fo:block>
							
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
		</fo:static-content>
	</xsl:template>

</xsl:stylesheet>
