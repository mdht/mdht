<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns="http://validation.hitsp.nist.gov"
	xmlns:ax21="http://validation.hitsp.nist.gov/xsd">
	<xsl:template match="/">
		<html>
			<body>
				

				<table border="0">
				
				   <tr>
          <td id="header" style="width: 602"><img src="images/oht_logo.png" alt="Open Health Tools logo" style="width: 602 height :   140 hspace :   0 vspace :   0 border :   0" /></td>
  <td id="header" style="width: 602"><img src="images/MDHT_Logo_150x121.png" alt="MDHT Logo" style="width: 602 height :   140 hspace :   0 vspace :   0 border :   0" /></td>     </tr>
 
     <tr>
          <td colspan="2">
          <h1 style="text-align: center">MDHT Clinical Document Architecture (CDA) Validation Services</h1>
          </td>
     </tr>


	

<tr>
<td>
<h2>NIST Validations</h2>
</td>
</tr>
 
 					<tr>
					<td colspan="4">

<table width="60%" border="1" align="center">

<tr>
<td align="center">Total</td><td align="center">Errors</td><td align="center">Warnings</td><td align="center">Information</td>
</tr>

<tr>
<td align="center"><xsl:value-of select="count(//ns:validateDocumentResponse/ns:return/ax21:issue)"/></td>
<td align="center"><xsl:value-of select="count(//ns:validateDocumentResponse/ns:return/ax21:issue/ax21:severity[contains(.,'error')])"/></td>
<td align="center"><xsl:value-of select="count(//ns:validateDocumentResponse/ns:return/ax21:issue/ax21:severity[contains(.,'warning')])"/></td>
<td align="center"><xsl:value-of select="count(//ns:validateDocumentResponse/ns:return/ax21:issue/ax21:severity[contains(.,'information')])"/></td>
</tr>

</table>
					

	
 

				
					</td>
					
					</tr>
 
				
				
				
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
					<td colspan="2"> <a href="NISTCDAValidation.html" >Back to NIST CDA Diagnostics</a></td>
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