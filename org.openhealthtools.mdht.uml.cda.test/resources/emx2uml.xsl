<?xml version="1.0" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:output method="xml" indent="yes"/>

  <!-- identity transform (pass-thru) -->
  <xsl:template match="@*|node()">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
  
  <!-- remove all comments -->
  <xsl:template match="comment()"/>

  <!-- remove all processing instructions -->
  <xsl:template match="processing-instruction()"/>
  
  <!-- remove all RSM-specific diagrams -->
  <xsl:template match="//eAnnotations[@source='uml2.diagrams']"/>

  <!-- remove all RSM-specific profiles -->
  <xsl:template match="profileApplication[./appliedProfile[contains(@href, '.epx')]]"/>

  <!-- rename all annotations elements -->
  <!--
  <xsl:template match="annotations">
    <annotation><xsl:value-of select="."/></annotation>
  </xsl:template>
  -->

</xsl:stylesheet>