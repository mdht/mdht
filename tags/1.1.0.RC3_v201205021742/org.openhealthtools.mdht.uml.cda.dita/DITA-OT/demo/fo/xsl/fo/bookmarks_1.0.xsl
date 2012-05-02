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
                xmlns:rx="http://www.renderx.com/XSL/Extensions"
                xmlns:exsl="http://exslt.org/common"
                xmlns:opentopic="http://www.idiominc.com/opentopic"
                xmlns:opentopic-index="http://www.idiominc.com/opentopic/index"
                xmlns:exslf="http://exslt.org/functions"
                xmlns:opentopic-func="http://www.idiominc.com/opentopic/exsl/function"
                xmlns:ot-placeholder="http://suite-sol.com/namespaces/ot-placeholder"
                extension-element-prefixes="exsl"
                exclude-result-prefixes="opentopic-index opentopic exslf opentopic-func ot-placeholder"
                version='1.1'>

    <xsl:variable name="map" select="//opentopic:map"/>

    <xsl:template name="createBookmarks">
        <xsl:variable name="bookmarks">
            <xsl:apply-templates select="/" mode="bookmark"/>
        </xsl:variable>

        <xsl:if test="count(exsl:node-set($bookmarks)/*) > 0">
            <fo:bookmark-tree>
                <xsl:choose>
                    <xsl:when test="($ditaVersion &gt;= '1.1') and $map//*[contains(@class,' bookmap/toc ')][@href]"/>
                    <xsl:when test="($ditaVersion &gt;= '1.1') and ($map//*[contains(@class,' bookmap/toc ')]
                        				or /*[contains(@class,' map/map ')][not(contains(@class,' bookmap/bookmap '))])">
                        <fo:bookmark internal-destination="ID_TOC_00-0F-EA-40-0D-4D">
                            <fo:bookmark-title>
                                <xsl:call-template name="insertVariable">
                                    <xsl:with-param name="theVariableID" select="'Table of Contents'"/>
                                </xsl:call-template>
                            </fo:bookmark-title>
                        </fo:bookmark>
                    </xsl:when>
					<xsl:when test="($ditaVersion &gt;= '1.1')"/>
                    <xsl:otherwise>
                        <fo:bookmark internal-destination="ID_TOC_00-0F-EA-40-0D-4D">
                            <fo:bookmark-title>
                                <xsl:call-template name="insertVariable">
                                    <xsl:with-param name="theVariableID" select="'Table of Contents'"/>
                                </xsl:call-template>
                            </fo:bookmark-title>
                        </fo:bookmark>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:copy-of select="exsl:node-set($bookmarks)"/>
                <!-- CC #6163  -->
                <xsl:if test="//opentopic-index:index.groups//opentopic-index:index.entry">
                    <xsl:choose>
                        <xsl:when test="($ditaVersion &gt;= '1.1') and $map//*[contains(@class,' bookmap/indexlist ')][@href]"/>
                        <xsl:when test="($ditaVersion &gt;= '1.1') and ($map//*[contains(@class,' bookmap/indexlist ')]
                        				or /*[contains(@class,' map/map ')][not(contains(@class,' bookmap/bookmap '))])">
                            <fo:bookmark internal-destination="ID_INDEX_00-0F-EA-40-0D-4D">
                                <fo:bookmark-title>
                                    <xsl:call-template name="insertVariable">
                                        <xsl:with-param name="theVariableID" select="'Index'"/>
                                    </xsl:call-template>
                                </fo:bookmark-title>
                            </fo:bookmark>
                        </xsl:when>
                        <xsl:when test="($ditaVersion &gt;= '1.1')"/>
                        <xsl:otherwise>
                            <fo:bookmark internal-destination="ID_INDEX_00-0F-EA-40-0D-4D">
                                <fo:bookmark-title>
                                    <xsl:call-template name="insertVariable">
                                        <xsl:with-param name="theVariableID" select="'Index'"/>
                                    </xsl:call-template>
                                </fo:bookmark-title>
                            </fo:bookmark>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:if>
            </fo:bookmark-tree>
        </xsl:if>
    </xsl:template>

    <xsl:template match="ot-placeholder:glossarylist" mode="bookmark">
        <fo:bookmark internal-destination="ID_GLOSSARY_00-0F-EA-40-0D-4D">
            <xsl:if test="$bookmarkStyle!='EXPANDED'">
                <xsl:attribute name="starting-state">hide</xsl:attribute>
            </xsl:if>
            <fo:bookmark-title>
                <xsl:call-template name="insertVariable">
                    <xsl:with-param name="theVariableID" select="'Glossary'"/>
                </xsl:call-template>
            </fo:bookmark-title>

            <xsl:apply-templates mode="bookmark"/>
        </fo:bookmark>
    </xsl:template>

    <!--<xsl:template match="*[contains(@class, ' topic/topic ')][opentopic-func:determineTopicType() = 'topicTocList']" mode="bookmark" priority="10"/>-->
    <!--<xsl:template match="*[contains(@class, ' topic/topic ')][opentopic-func:determineTopicType() = 'topicIndexList']" mode="bookmark" priority="10"/>-->


</xsl:stylesheet>