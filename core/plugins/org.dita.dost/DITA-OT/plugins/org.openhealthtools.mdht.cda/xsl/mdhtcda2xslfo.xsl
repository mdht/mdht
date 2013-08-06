<?xml version="1.0"?>
<!-- Copyright (c) 2013 Sean Muir. All rights reserved. This program and 
	the accompanying materials are made available under the terms of the Eclipse 
	Public License v1.0 which accompanies this distribution, and is available 
	at http://www.eclipse.org/legal/epl-v10.html Contributors: Sean Muir (JKM 
	Software) - initial implementation -->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:dita2xslfo="http://dita-ot.sourceforge.net/ns/200910/dita2xslfo"
	version="1.0" exclude-result-prefixes="dita2xslfo">

	<xsl:variable name="productName">

		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/prodname">
				<xsl:value-of select="$map/bookmeta/prodinfo/prodname" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Name in BookMap (bookmap/bookmeta/prodinfo/prodname)
			</xsl:otherwise>
		</xsl:choose>
		_
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@release">
				<xsl:value-of select="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@release" />
			</xsl:when>
			<xsl:otherwise>
				Missing Release (DSTU) in BookMap
				(bookmap/bookmeta/prodinfo/vrmlist/vrm/@release)
			</xsl:otherwise>
		</xsl:choose>
		_
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@version">
				<xsl:value-of select="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@version" />
			</xsl:when>
			<xsl:otherwise>
				Missing Version (YYYYMM) in BookMap
				(bookmap/bookmeta/prodinfo/vrmlist/vrm/@version)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productBrand">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/brand">
				<xsl:value-of select="$map/bookmeta/prodinfo/brand" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Brand (HL7 IG for CDA R2) in BookMap
				(bookmap/bookmeta/prodinfo/brand)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productSeries">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/series">
				<xsl:value-of select="$map/bookmeta/prodinfo/series" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Series (Draft Standard for Trial Use) in BookMap
				(bookmap/bookmeta/prodinfo/series)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productPlatform">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/platform">
				<xsl:value-of select="$map/bookmeta/prodinfo/platform" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Platform (Universal Realm) in BookMap
				(bookmap/bookmeta/prodinfo/platform)
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>




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
								<xsl:value-of select="$productBrand" />
							</fo:block>
							<fo:block text-align="start">
								<xsl:value-of select="$productSeries" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="center">
								<xsl:value-of
									select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
								(
								<xsl:value-of select="$productPlatform" />
								)
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="end">
								Page
								<fo:page-number />
							</fo:block>
							<fo:block text-align="end">
								<xsl:value-of
									select="format-dateTime(current-dateTime(),'[MNn] [Y0001]')" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell number-columns-spanned="3">
							<fo:block text-align="center">
								<xsl:choose>
									<xsl:when test="$map/bookmeta/bookrights/bookowner/organization">
										<xsl:for-each
											select="$map/bookmeta/bookrights/bookowner/organization">
											<xsl:text>&#xA9; </xsl:text>
											<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
											<xsl:text> </xsl:text>
											<xsl:value-of select="." />
											<xsl:text>. All rights reserved</xsl:text>
										</xsl:for-each>
									</xsl:when>
									<xsl:otherwise>
										Missing Book Rights Organization (Health Level Seven
										International) in BookMap
										(bookmap/bookmeta/bookrights/bookowner/organization)
									</xsl:otherwise>
								</xsl:choose>
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
		</fo:static-content>
	</xsl:template>

	<xsl:template name="insertBodyEvenFooter">
		<fo:static-content flow-name="even-body-footer">
			<fo:table table-layout="fixed" inline-progression-dimension="100%">
				<fo:table-column column-width="33.3%" />
				<fo:table-column column-width="33.3%" />
				<fo:table-column column-width="33.3%" />
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell>
							<fo:block text-align="start">
								<xsl:value-of select="$productBrand" />
							</fo:block>
							<fo:block text-align="start">
								<xsl:value-of select="$productSeries" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="center">
								<xsl:value-of
									select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
								(
								<xsl:value-of select="$productPlatform" />
								)
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="end">
								Page
								<fo:page-number />
							</fo:block>
							<fo:block text-align="end">
								<xsl:value-of
									select="format-dateTime(current-dateTime(),'[MNn] [Y0001]')" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
					<fo:table-row>
						<fo:table-cell number-columns-spanned="3">

							<fo:block text-align="center">
								<xsl:for-each select="$map/bookmeta/bookrights/bookowner/organization">
									&#xA9;
									<xsl:text />
									<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
									<xsl:text />
									<xsl:value-of select="." />
									<xsl:text />
								</xsl:for-each>
							</fo:block>

						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
		</fo:static-content>
	</xsl:template>

	<xsl:template name="createFrontMatter_1.0">
		<fo:page-sequence master-reference="body-odd">
			<fo:static-content flow-name="odd-body-header">
				<fo:block xsl:use-attribute-sets="__body__odd__header">
					<xsl:value-of select="$productName" />
				</fo:block>
			</fo:static-content>

			<fo:static-content flow-name="odd-body-footer">
				<fo:table table-layout="fixed"
					inline-progression-dimension="100%">
					<fo:table-column column-width="10%" />
					<fo:table-column column-width="80%" />
					<fo:table-column column-width="10%" />
					<fo:table-body>
						<fo:table-row>
							<fo:table-cell>

							</fo:table-cell>
							<fo:table-cell>
								<fo:block xsl:use-attribute-sets="tm__content">
									Copyright &#169;
									<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
									Health Level Seven International &#174; ALL RIGHTS
									RESERVED. The
									reproduction of this material in any form
									is strictly
									forbidden
									without the written permission of the
									publisher. HL7
									International
									and Health Level Seven are registered
									trademarks of
									Health Level
									Seven International. Reg. U.S. Pat &amp;
									TM Off.
								</fo:block>
							</fo:table-cell>
							<fo:table-cell>

							</fo:table-cell>
						</fo:table-row>

						<fo:table-row>
							<fo:table-cell>

							</fo:table-cell>
							<fo:table-cell>
								<fo:block xsl:use-attribute-sets="tm__content">
									Use of this material is governed by HL7's
									<fo:basic-link external-destination="http://www.hl7.org/legal/ippolicy.cfm">IP Compliance
										Policy
									</fo:basic-link>
									.
								</fo:block>
							</fo:table-cell>
							<fo:table-cell>

							</fo:table-cell>
						</fo:table-row>

					</fo:table-body>
				</fo:table>

			</fo:static-content>

			<fo:flow flow-name="xsl-region-body">
				<fo:block xsl:use-attribute-sets="__frontmatter">
					<fo:table table-layout="fixed"
						inline-progression-dimension="100%">
						<fo:table-column column-width="100%" />

						<fo:table-body>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="left">
										<xsl:apply-templates select="$map/booktitle/booktitlealt[2]" />
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										<xsl:choose>
											<xsl:when test="$map/*[contains(@class,' topic/title ')][1]">
												<xsl:apply-templates
													select="$map/*[contains(@class,' topic/title ')][1]" />
											</xsl:when>
											<xsl:when
												test="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]">
												<xsl:apply-templates
													select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
											</xsl:when>
											<xsl:when test="//*[contains(@class, ' map/map ')]/@title">
												<xsl:value-of select="//*[contains(@class, ' map/map ')]/@title" />
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of
													select="/descendant::*[contains(@class, ' topic/topic ')][1]/*[contains(@class, ' topic/title ')]" />
											</xsl:otherwise>
										</xsl:choose>

									</fo:block>
								</fo:table-cell>

							</fo:table-row>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										<xsl:apply-templates select="$map/booktitle/booktitlealt[1]" />
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

						
							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										HL7
										<xsl:value-of select="$map/bookmeta/prodinfo/series" />
										Ballot
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

						


							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__owner">
										Sponsored By:
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
							<xsl:for-each select="$map/bookmeta/author">

								<fo:table-row>
									<fo:table-cell>
										<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__owner">
											<xsl:apply-templates select="." />
										</fo:block>
									</fo:table-cell>
								</fo:table-row>


							</xsl:for-each>


						</fo:table-body>
					</fo:table>

				</fo:block>
			</fo:flow>

		</fo:page-sequence>


	</xsl:template>
</xsl:stylesheet>
