package com.example.vanirut.texttools

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class TextToolsUnitTest {
    @Test
    @Throws(Exception::class)
    fun text_tools() {
        val inputFile = "D:/Work/Android/Project/OatRice/TextTools/app/src/test/java/com" +
                "/example/vanirut/texttools/styles.xml"

        val outPutFile = "D:/Work/Android/Project/OatRice/TextTools/app/src/test/java/com" +
                "/example/vanirut/texttools/styles2.xml"

        val linePoint = "bold</item>"

        val content = "\t\t<item name=\"android:textAppearance\">@style/FontBold</item>"

        TextTools().addNewLine(inputFile, outPutFile, linePoint, content)
    }
}