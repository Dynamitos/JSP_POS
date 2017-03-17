/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author Michaela
 */
public enum ServletResourceEnum {
    HELLOWORLD("/HelloWorld");
    private String urlPattern;

    private ServletResourceEnum(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

}
