/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author Sabrina
 */
public enum ServletEnum
{
    HELLOWORLD("/helloWorldServlet");
    
    private String url;

    private ServletEnum(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }
    
}