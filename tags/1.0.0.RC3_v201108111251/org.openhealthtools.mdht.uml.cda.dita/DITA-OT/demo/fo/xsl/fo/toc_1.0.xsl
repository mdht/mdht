<?xml version='1.0'?>

<!--
Copyright © 2004-2006 by Idiom Technologies, Inc. All rights reserved.
IDIOM is a registered trademark of Idiom Technologies, Inc. and WORLDSERVER
and WORLDSTART are trademarks of Idiom Technologies, Inc. All other
trademarks are the property of their respective owners.

IDIOM TECHNOLOGIES, INC. IS DELIVERING THE SOFTWARE "AS IS," WITH
ABSOLUTELY NO WARRANTIES WHATSOEVER, WHETHER EXPRESS OR IMPLIED,  AND IDIOM
TECHNOLOGIES, INC. DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING
BUT NOT LIMITED TO WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
PURPOSE AND WARRANTY OF NON-INFRINGEMENT. IDIOM TECHNOLOGIES, INC. SHALL NOT
BE LIABLE FOR INDIRECT, INCIDENTAL, SPECIAL, COVER, PUNITIVE, EXEMPLARY,
RELIANCE, OR CONSEQUENTIAL DAMAGES (INCLUDING BUT NOT LIMITED TO LOSS OF
ANTICIPATED PROFIT), ARISING FROM ANY CAUSE UNDER OR RELATED TO  OR ARISING
OUT OF THE USE OF OR INABILITY TO USE THE SOFTWARE, EVEN IF IDIOM
TECHNOLOGIES, INC. HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

Idiom Technologies, Inc. and its licensors shall not be liable for any
damages suffered by any person as a result of using and/or modifying the
Software or its derivatives. In no event shall Idiom Technologies, Inc.'s
liability for any damages hereunder exceed the amounts received by Idiom
Technologies, Inc. as a result of this transaction.

These terms and conditions supersede the terms and conditions in any
licensing agreement to the extent that such terms and conditions conflict
with those set forth herein.

This file is part of the DITA Open Toolkit project hosted on Sourceforge.net. 
See the accompanying license.txt file for applicable licenses.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    xmlns:exsl="http://exslt.org/common"
    xmlns:opentopic="http://www.idiominc.com/opentopic"
    xmlns:exslf="http://exslt.org/functions"
    xmlns:opentopic-func="http://www.idiominc.com/opentopic/exsl/function"
    xmlns:ot-placeholder="http://suite-sol.com/namespaces/ot-placeholder"
    extension-element-prefixes="exsl"
    exclude-result-prefixes="opentopic exslf opentopic-func ot-placeholder"
    version='1.1'>

    <xsl:include href="../../cfg/fo/attrs/toc-attr.xsl"/>

    <xsl:variable name="map" select="//opentopic:map"/>

    <xsl:template name="createToc">

        <xsl:variable name="toc">
            <xsl:choose>
                <xsl:when test="($ditaVersion &gt;= '1.1') and $map//*[contains(@class,' bookmap/toc ')][@href]"/>
                <xsl:when test="($ditaVersion &gt;= '1.1') and $map//*[contains(@class,' bookmap/toc ')]">
                    <xsl:apply-templates select="/" mode="toc"/>
                </xsl:when>
                <xsl:when test="($ditaVersion &gt;= '1.1') and /*[contains(@class,' map/map ')][not(contains(@class,' bookmap/bookmap '))]">
                    <xsl:apply-templates select="/" mode="toc"/>
                </xsl:when>
                <xsl:when test="($ditaVersion &gt;= '1.1')"/>
                <xsl:otherwise>
                    <xsl:apply-templates select="/" mode="toc"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>

        <xsl:if test="count(exsl:node-set($toc)/*) > 0">
            <fo:page-sequence master-reference="toc-sequence" xsl:use-attribute-sets="__force__page__count">

                <xsl:call-template name="insertTocStaticContents"/>

                <fo:flow flow-name="xsl-region-body">
                    <xsl:call-template name="createTocHeader"/>
                    <fo:block>
                        <xsl:copy-of select="exsl:node-set($toc)"/>
                    </fo:block>
                </fo:flow>

            </fo:page-sequence>
        </xsl:if>
    </xsl:template>

    <xsl:template name="processTocList">
        <fo:page-sequence master-reference="toc-sequence" xsl:use-attribute-sets="__force__page__count">

            <xsl:call-template name="insertTocStaticContents"/>

            <fo:flow flow-name="xsl-region-body">
                <xsl:call-template name="createTocHeader"/>
                <fo:block>
                    <xsl:apply-templates/>
                </fo:block>
            </fo:flow>

        </fo:page-sequence>
    </xsl:template>

    <xsl:template match="*[contains(@class, ' topic/topic ')][opentopic-func:determineTopicType() = 'topicTocList']"  mode="toc" priority="10"/>
    <xsl:template match="*[contains(@class, ' topic/topic ')][opentopic-func:determineTopicType() = 'topicIndexList']"  mode="toc" priority="10"/>
    
    <xsl:template match="ot-placeholder:glossarylist" mode="toc">
        <fo:block xsl:use-attribute-sets="__toc__indent__glossary">
            <fo:block xsl:use-attribute-sets="__toc__topic__content__glossary">
                <fo:basic-link internal-destination="ID_GLOSSARY_00-0F-EA-40-0D-4D" xsl:use-attribute-sets="__toc__link">
                  
                        <fo:inline xsl:use-attribute-sets="__toc__title" keep-together.within-line="always" margin-right=".2in">
                            <xsl:call-template name="insertVariable">
                                <xsl:with-param name="theVariableID" select="'Glossary'"/>
                            </xsl:call-template>
                        </fo:inline>

                        <fo:inline margin-left="-.2in" keep-together.within-line="always">
                            <fo:leader xsl:use-attribute-sets="__toc__leader"/>
                            <fo:page-number-citation ref-id="ID_GLOSSARY_00-0F-EA-40-0D-4D"/>
                        </fo:inline>
                 
                </fo:basic-link>
            </fo:block>
       </fo:block>
    </xsl:template>

    <xsl:template match="*[contains(@class, ' glossentry/glossentry ')]" mode="toc" priority="10"/>

</xsl:stylesheet>