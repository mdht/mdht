<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://validation.hitsp.nist.gov"
	xmlns:ax21="http://validation.hitsp.nist.gov/xsd">
	<xsl:template match="/">
		<html>
			<body>
				<h2>NIST Validations</h2>
				<table border="1">
					<tr bgcolor="lightblue">
						<th>Context</th>
						<th>Message</th>
					</tr>
					<xsl:variable name="unique-list"
						select="//ns:validateDocumentResponse/ns:return/ax21:issue/ax21:context[not(.=following::ax21:context)]" />
					<xsl:for-each select="$unique-list">
						<tr>
							<td style="font-size:80%; vertical-align: top">
								<xsl:value-of select="." />
							</td>
							<td style="font-size:80%">
								<table>
									<xsl:call-template name="show_messages">
										<xsl:with-param name="messagecontext" select="." />
									</xsl:call-template>
								</table>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>

	<xsl:template name="show_messages">
		<xsl:param name="messagecontext" />
		<xsl:for-each
			select="//ns:validateDocumentResponse/ns:return/ax21:issue[ax21:context=$messagecontext]">
			<tr>
				<td style="vertical-align: top">
					<xsl:value-of select="ax21:severity" />
				</td>
				<td>
					<xsl:value-of select="ax21:message" />
				</td>
			</tr>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>