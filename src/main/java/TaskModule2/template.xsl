<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="flowers">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <td>name</td>
                        <td>soil</td>
                        <td>origin</td>
                    </tr>
                    <xsl:for-each select="flower">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="soil"/></td>
                            <td><xsl:value-of select="origin"/></td>
                        </tr>
                    </xsl:for-each>
                </table >
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
