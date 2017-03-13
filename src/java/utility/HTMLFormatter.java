/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author Sabrina
 */
public class HTMLFormatter
{
    public static String getHTMLBegin()
    {
        return "<html> \n <head> </head> \n <body> \n";
    }
    
    public static String getHTMLEnd()
    {
        return "</body> \n </html>";
    }
    
    public static String formatText(String text, int size, String color)
    {
        return String.format("<font size=\"%d\" color=\"%s\">%s</font>", size, color, text);
    }
}
