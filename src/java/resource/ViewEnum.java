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
public enum ViewEnum
{
    START("/helloworld/helloWorldStartview.jsp"), 
    ERROR("/WEB-INF/error/ErrorView.jsp"), 
    RESULT("/WEB-INF/helloworld/HelloWorldView.jsp");
    
    private String view;

    private ViewEnum(String view)
    {
        this.view = view;
    }

    public String getView()
    {
        return view;
    }
}
