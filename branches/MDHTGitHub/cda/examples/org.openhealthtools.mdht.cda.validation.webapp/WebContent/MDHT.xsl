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
 		<td id="header" style="width: 602"><img src="images/MDHT_Logo_150x121.png" alt="CDA Tools Logo" style="width: 602 height :   140 hspace :   0 vspace :   0 border :   0" /></td>   
     </tr>
     <tr>
          <td colspan="2">
          <h1 style="text-align: center">MDHT Clinical Document Architecture (CDA) Validation Services</h1>
          </td>
     </tr>
 

					<tr bgcolor="#6495ED">
						<th colspan="4">Diagnostics For CDA Document xxx</th>
					</tr>
					
					<tr>
					<td colspan="4">

<table width="60%" border="1" align="center">

<tr>
<td align="center">Total</td><td align="center">Errors</td><td align="center">Warnings</td><td align="center">Information</td>
</tr>

<tr>
<td align="center"><xsl:value-of select="count(//validateDocumentResponse/return/issue)"/></td>
<td align="center"><xsl:value-of select="count(//validateDocumentResponse/return/issue/severity[contains(.,'error')])"/></td>
<td align="center"><xsl:value-of select="count(//validateDocumentResponse/return/issue/severity[contains(.,'warning')])"/></td>
<td align="center"><xsl:value-of select="count(//validateDocumentResponse/return/issue/severity[contains(.,'information')])"/></td>
</tr>

</table>
					

	
 

				
					</td>
					
					</tr>
					<xsl:variable name="unique-list"
						select="//validateDocumentResponse/return/issue/context[not(.=following::context)]" />
					<xsl:for-each select="$unique-list">
						<tr>
							<td style="font-size:80%" colspan="4">
								<table width="100%" >
								
<xsl:if test="position() = 1">
									<tr bgcolor="#6495ED">
										<th>Specification</th>
										<th>Severity</th>
										<th>Message</th>									
									</tr>
  </xsl:if>									
									<tr>
										<th bgcolor="#7D9EC0" colspan="4" align="left">
											<xsl:value-of select="." />
										</th>
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

					<td colspan="2"> <a href="index.html" >Back to MDHT CDA Diagnostics</a></td>

				</table>
			</body>
		</html>
	</xsl:template>

	<xsl:template name="show_messages">
		<xsl:param name="messagecontext" />
		<xsl:for-each
			select="//validateDocumentResponse/return/issue[context=$messagecontext]">
			<tr>



   <xsl:if test="position() mod 2 != 1">
    <xsl:attribute  name="style">background-color:#C6E2FF</xsl:attribute>
  </xsl:if>
  
  <xsl:if test="contains(./severity,'error')">
  <xsl:attribute  name="style">color:red</xsl:attribute>

 <xsl:if test="position() mod 2 != 1">
    <xsl:attribute  name="style">background-color:#C6E2FF;color:red</xsl:attribute>
  </xsl:if>

  </xsl:if>

				<td style="vertical-align: top" width="20%">
					<xsl:value-of select="specification" />
				</td>

				<td style="vertical-align: top" width="10%">
					<xsl:value-of select="severity" />
				</td>
				<td>
					<xsl:value-of select="message" />
				</td>				
			</tr>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>