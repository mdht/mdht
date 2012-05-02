<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0" xmlns:presentation="urn:oasis:names:tc:opendocument:xmlns:presentation:1.0" xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" xmlns:math="http://www.w3.org/1998/Math/MathML" xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" xmlns:dom="http://www.w3.org/2001/xml-events" xmlns:xforms="http://www.w3.org/2002/xforms" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:anim="urn:oasis:names:tc:opendocument:xmlns:animation:1.0" xmlns:smil="urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0" xmlns:prodtools="http://www.ibm.com/xmlns/prodtools" xmlns:random="org.dita.dost.util.RandomUtils" exclude-result-prefixes="random" version="1.1">
  
  
  <xsl:import href="common/output-message.xsl"></xsl:import>
  <xsl:import href="common/dita-utilities.xsl"></xsl:import>
  <xsl:import href="common/related-links.xsl"></xsl:import>
  <xsl:import href="common/dita-textonly.xsl"></xsl:import>
  <xsl:import href="common/flag.xsl"></xsl:import>
  
  <xsl:import href="xslodt/dita2odt-utilities.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-table.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-lists.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-img.xsl"></xsl:import>
  
  <xsl:import href="xslodt/dita2odt-map.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odtImpl.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-concept.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-gloss.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-task.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-reference.xsl"></xsl:import>
  <xsl:import href="xslodt/hi-d.xsl"></xsl:import>
  <xsl:import href="xslodt/pr-d.xsl"></xsl:import>
  <xsl:import href="xslodt/sw-d.xsl"></xsl:import>
  <xsl:import href="xslodt/ui-d.xsl"></xsl:import>
  
  <xsl:import href="xslodt/commons.xsl"></xsl:import>
  <xsl:import href="xslodt/dita2odt-links.xsl"></xsl:import>

  <xsl:import href="xslodt/dita2odt-flagging.xsl"></xsl:import>

  
  
  



<xsl:param name="disableRelatedLinks" select="'none'"></xsl:param>
<xsl:param name="DRAFT" select="'no'"></xsl:param>
<xsl:param name="OUTPUTDIR" select="''"></xsl:param>
<xsl:param name="FILTERFILE"></xsl:param>

<xsl:param name="INDEXSHOW" select="'no'"></xsl:param>

<xsl:param name="FILEREF">file:///</xsl:param>
  

<xsl:param name="TRANSTYPE" select="'odt'"></xsl:param>


<xsl:param name="BREADCRUMBS" select="'no'"></xsl:param> 


<xsl:param name="YEAR" select="'2010'"></xsl:param>



<xsl:param name="FILENAME"></xsl:param>
<xsl:param name="FILEDIR"></xsl:param>
<xsl:param name="CURRENTFILE">
  <xsl:choose>
    
    <xsl:when test="contains($FILENAME, '_MERGED')">
      <xsl:value-of select="concat($FILEDIR, '/', substring-before($FILENAME, '_MERGED'), '.ditamap')"></xsl:value-of>
    </xsl:when>
    
    <xsl:otherwise>
      <xsl:value-of select="concat($FILEDIR, '/', substring-before($FILENAME, '.'), $DITAEXT)"></xsl:value-of>
    </xsl:otherwise>
  </xsl:choose>
</xsl:param>
  


<xsl:param name="DBG" select="'no'"></xsl:param> 

<xsl:param name="ODTIMGEMBED" select="'yes'"></xsl:param>


<xsl:param name="DITAEXT" select="'.xml'"></xsl:param>


<xsl:param name="KEYREF-FILE" select="concat($WORKDIR,$PATH2PROJ,'keydef.xml')"></xsl:param>

<xsl:param name="BASEDIR"></xsl:param>

<xsl:param name="TEMPDIR"></xsl:param>
  
<xsl:variable name="tempfiledir">
  <xsl:choose>
    <xsl:when test="contains($TEMPDIR, ':\') or contains($TEMPDIR, ':/')">
      
      <xsl:value-of select="'file:/'"></xsl:value-of><xsl:value-of select="concat($TEMPDIR, '/')"></xsl:value-of>
    </xsl:when>
    <xsl:when test="starts-with($TEMPDIR, '/')">
      <xsl:value-of select="'file://'"></xsl:value-of><xsl:value-of select="concat($TEMPDIR, '/')"></xsl:value-of>
    </xsl:when>
    <xsl:when test="starts-with($BASEDIR, '/')">
      <xsl:value-of select="'file://'"></xsl:value-of><xsl:value-of select="concat($BASEDIR, '/')"></xsl:value-of><xsl:value-of select="concat($TEMPDIR, '/')"></xsl:value-of>
    </xsl:when>
    <xsl:otherwise>
      
      <xsl:value-of select="'file:/'"></xsl:value-of><xsl:value-of select="concat($BASEDIR, '/')"></xsl:value-of><xsl:value-of select="concat($TEMPDIR, '/')"></xsl:value-of>
    </xsl:otherwise>
  </xsl:choose>
</xsl:variable>
  

<xsl:variable name="currentfile" select="concat($tempfiledir, $CURRENTFILE)"></xsl:variable>

<xsl:variable name="WORKDIR">
  <xsl:apply-templates select="document($currentfile, /)/processing-instruction('workdir')[1]" mode="get-work-dir"></xsl:apply-templates>
</xsl:variable>


<xsl:variable name="PATH2PROJ">
  <xsl:apply-templates select="document($currentfile, /)/processing-instruction('path2project')[1]" mode="get-path2project"></xsl:apply-templates>
</xsl:variable>


<xsl:output method="xml" encoding="UTF-8" indent="yes"></xsl:output>
<xsl:strip-space elements="*"></xsl:strip-space>

  <xsl:attribute-set name="root">
    <xsl:attribute name="office:version">1.1</xsl:attribute>
  </xsl:attribute-set>
  
  <xsl:template match="/">
    <office:document-content xsl:use-attribute-sets="root">
      <xsl:call-template name="root"></xsl:call-template>
    </office:document-content>
  </xsl:template>
  
  <xsl:template name="root">
    
    <office:scripts></office:scripts>
    <office:automatic-styles>
      <xsl:if test="//*[contains(@class, ' topic/table ')]|//*[contains(@class, ' topic/simpletable ')]">
          <xsl:call-template name="create_table_cell_styles"></xsl:call-template>
      </xsl:if>
      
      <xsl:apply-templates select="//text()|//*[contains(@class, ' topic/state ')]" mode="create_hi_style"></xsl:apply-templates>
      
      <xsl:call-template name="create_flagging_styles"></xsl:call-template>
      
    </office:automatic-styles>
    <office:body>
      <office:text>
        <text:sequence-decls>
          <text:sequence-decl text:display-outline-level="0" text:name="Illustration"></text:sequence-decl>
          <text:sequence-decl text:display-outline-level="0" text:name="Table"></text:sequence-decl>
          <text:sequence-decl text:display-outline-level="0" text:name="Text"></text:sequence-decl>
          <text:sequence-decl text:display-outline-level="0" text:name="Drawing"></text:sequence-decl>
        </text:sequence-decls>
        
        
        
        
        <xsl:choose>
          
          <xsl:when test="$mapType = 'bookmap'">
            <xsl:call-template name="create_book_title"></xsl:call-template>
            
            <xsl:call-template name="create_book_abstract"></xsl:call-template>
            
            <xsl:call-template name="create_book_notices"></xsl:call-template>
          </xsl:when>
          
          <xsl:when test="$mapType = 'ditamap'">
            <xsl:call-template name="create_map_title"></xsl:call-template>
          </xsl:when>
          
          <xsl:otherwise>
            <xsl:call-template name="create_topic_title"></xsl:call-template>
          </xsl:otherwise>
          
        </xsl:choose>
        
        
        <xsl:call-template name="create_toc"></xsl:call-template>
        
        
        <xsl:apply-templates></xsl:apply-templates>
      </office:text>
    </office:body>
  </xsl:template>
  
  <xsl:template match="processing-instruction('workdir')" mode="get-work-dir">
    <xsl:value-of select="."></xsl:value-of><xsl:text>/</xsl:text>
  </xsl:template>
  
  <xsl:template match="processing-instruction('path2project')" mode="get-path2project">
    <xsl:call-template name="get-path2project">
      <xsl:with-param name="s" select="."></xsl:with-param>
    </xsl:call-template>
  </xsl:template>
  
  <xsl:template name="get-path2project">
    
    
    <xsl:param name="s"></xsl:param>
    <xsl:choose>
      <xsl:when test="contains($s, '\')">
        <xsl:value-of select="substring-before($s, '\')"></xsl:value-of>
        <xsl:text>/</xsl:text>
        <xsl:call-template name="get-path2project">
          <xsl:with-param name="s" select="substring-after($s, '\')"></xsl:with-param>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$s"></xsl:value-of>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  
</xsl:stylesheet>