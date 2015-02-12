<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://validation.hitsp.nist.gov"
	xmlns:ax21="http://validation.hitsp.nist.gov/xsd">
<xsl:output method="text" />
	<xsl:template match="/">
			
			foldersTree = gFld("NIST Diagnostics", "demoLargeRightFrame.html")

			<xsl:variable name="unique-list" select="//ns:validateDocumentResponse/ns:return/ax21:issue/ax21:context[not(.=following::ax21:context)]" />

					<xsl:for-each select="$unique-list">
					
						diagnosticFolder<xsl:number value="position()" format="1 " />= gFld("<xsl:value-of select="." />", "diagnostics.html")

						diagnosticFolder<xsl:number value="position()" format="1" />.addChildren([
							<xsl:call-template name="addmessages">
								<xsl:with-param name="messagecontext" select="." />
							</xsl:call-template>
						])
					</xsl:for-each>

					foldersTree.addChildren([
						<xsl:for-each select="$unique-list">
								diagnosticFolder<xsl:number value="position()" format="1 " />
								<xsl:if test="position()!=last()">
									<xsl:text>, </xsl:text>
								</xsl:if>
							</xsl:for-each>
					])

	</xsl:template>



	<xsl:template name="addmessages">
		<xsl:param name="messagecontext" />
		<xsl:for-each
			select="//ns:validateDocumentResponse/ns:return/ax21:issue[ax21:context=$messagecontext]">
			["<xsl:value-of select="translate(ax21:message,'&#34;',' ')" />"]<xsl:if test="position()!=last()"><xsl:text>, </xsl:text></xsl:if>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>