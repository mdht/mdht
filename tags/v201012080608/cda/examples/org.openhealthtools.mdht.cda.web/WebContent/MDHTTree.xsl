<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://validation.hitsp.nist.gov"
	xmlns:ax21="http://validation.hitsp.nist.gov/xsd">

<xsl:output method="text" />

	<xsl:template match="/">
			
			foldersTree = gFld("MDHT Diagnostics", "demoLargeRightFrame.html")

			<xsl:variable name="unique-list" select="//validateDocumentResponse/return/issue/context[not(.=following::context)]" />

					<xsl:for-each select="$unique-list">
					
						diagnosticFolder<xsl:number value="position()" format="1 " />= gFld("<xsl:value-of select="." />", "diagnostics.html")

						diagnosticFolder<xsl:number value="position()" format="1" />.addChildren([
							<xsl:call-template name="addmessages">
								<xsl:with-param name="messagecontext" select="." />
							</xsl:call-template>
						])
					</xsl:for-each>

foldersTree.addChildren([<xsl:for-each select="$unique-list">diagnosticFolder<xsl:number value="position()" format="1 " /><xsl:if test="position()!=last()"><xsl:text>, </xsl:text></xsl:if></xsl:for-each>])

	</xsl:template>



	<xsl:template name="addmessages">
		<xsl:param name="messagecontext" />
		<xsl:for-each
			select="//validateDocumentResponse/return/issue[context=$messagecontext]">
			["<xsl:value-of select="translate(message,'&#34;',' ')" />"]<xsl:if test="position()!=last()"><xsl:text>, </xsl:text></xsl:if>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>