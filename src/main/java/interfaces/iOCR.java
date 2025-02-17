package interfaces;

import java.awt.*;

public interface iOCR {
    /**
     * Reads the specific area, and returns what it was able to read.
     * @return A string with the OCR results.
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     */
    String readLastLine(Rectangle areaToOCR);

    /**
     * Reads the specific area, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readAnyText(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area using the Bold 12 font, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readBold12Text(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area using the Plain 11 font, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readPlain11Text(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area using the Plain 12 font, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readPlain12Text(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area using the Quill font, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readQuillText(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area using the Quill 8 font, and returns what it was able to read.
     * @return A string with the OCR results.
     *
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colors A list of java awt colors used to find text with
     */
    String readQuill8Text(Rectangle areaToOCR, java.util.List<java.awt.Color> colors);

    /**
     * Reads the specific area, and returns the digits (0-9) it was able to read.
     * @return An integer that represents the value that was read
     * @param areaToOCR A java.awt.Rectangle with the area you want to perform OCR on.
     * @param colorsToScan A java.util.List with java.awt.Colors in it that you'd like to use to read.
     */
    int readDigitsInArea(Rectangle areaToOCR, java.util.List<Color> colorsToScan);
}
