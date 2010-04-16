<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://validation.hitsp.nist.gov"
	xmlns:ax21="http://validation.hitsp.nist.gov/xsd">
	<xsl:template match="/">
		<html>
			<body>
				<h2>MDHT Validations</h2>
				<table border="1">
					<tr bgcolor="lightblue">
						<th>Diagnostics</th>
					</tr>
					<xsl:variable name="unique-list"
						select="//validateDocumentResponse/return/issue/context[not(.=following::context)]" />
					<xsl:for-each select="$unique-list">
						<tr>
							<td style="font-size:80%">
								<table width="100%" border="1">
								
									<tr bgcolor="lightblue">
										<th colspan="4" align="center">
											Context
										</th>
									</tr>
									
									<tr>
										<th colspan="4" align="left">
											<xsl:value-of select="." />
										</th>
									</tr>
									<tr bgcolor="lightblue">
										<th>Specification</th>
										<th>Severity</th>
										<th>Message</th>
										<th>Test</th>
									</tr>
									<xsl:call-template name="show_messages">
										<xsl:with-param name="messagecontext" select="." />
									</xsl:call-template>
								</table>
							</td>
						</tr>
						<tr>
							<td>
								<p>
								</p>
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
			select="//validateDocumentResponse/return/issue[context=$messagecontext]">
			<tr>
				<td style="vertical-align: top">
					<xsl:value-of select="specification" />
				</td>

				<td style="vertical-align: top">
					<xsl:value-of select="severity" />
				</td>
				<td>
					<xsl:value-of select="message" />
				</td>
				<td>
					<xsl:value-of select="test" />
				</td>
			</tr>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>