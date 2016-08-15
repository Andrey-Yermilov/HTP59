<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="flowers">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <td>Name</td>
                        <td>Soil</td>
                        <td>Origin</td>
                        <td>Trunk Colour</td>
                        <td>Leaf Colour</td>
                        <td>Size</td>
                        <td>Temperature</td>
                        <td>Water</td>
                        <td>Multiplying</td>
                    </tr>
                    <xsl:for-each select="flower">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="soil"/></td>
                            <td><xsl:value-of select="origin"/></td>
                            <td><xsl:value-of select="visualParameters/trunkColour"/></td>
                            <td><xsl:value-of select="visualParameters/leafColour"/></td>
                            <td><xsl:value-of select="visualParameters/size"/></td>
                            <td><xsl:value-of select="growingTips/temperature"/></td>
                            <td><xsl:value-of select="growingTips/water"/></td>
                            <td><xsl:value-of select="multiplying"/></td>
                        </tr>
                    </xsl:for-each>
                </table >
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
