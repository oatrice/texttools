package com.example.vanirut.texttools

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.io.PrintWriter


/**
 * Created by vanirut on 7/28/2017.
 */

class TextTools {

    fun addNewLine(inputFile: String, outputFile: String, linePoint: String, content: String) {

        var bufferReader: BufferedReader? = null
        var fileReader: FileReader? = null
        val printWriter = PrintWriter(outputFile, "UTF-8")

        try {

            val fr = FileReader(inputFile)
            val br = BufferedReader(fr)

            var sCurrentLine = br.readLine()

            while (sCurrentLine != null) {
                println(sCurrentLine)
                printWriter.println(sCurrentLine)
                if (sCurrentLine.contains(linePoint)) {
                    println(content)
                    printWriter.println(content)
                }
                sCurrentLine = br.readLine()
            }

        } catch (e: IOException) {
            e.printStackTrace()

        } finally {

            try {

                if (bufferReader != null)
                    bufferReader!!.close()

                if (fileReader != null)
                    fileReader!!.close()

                if (printWriter != null)
                    printWriter!!.close()

            } catch (ex: IOException) {
                ex.printStackTrace()

            }

        }
    }
}
