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
public enum ViewResourceEnum {
  START("helloworld/helloworldstartview.jsp"),
  RESULT("/WEB-INF/helloworld/helloWorldView.jsp"),
  ERROR("/WEB-INF/error/errorView.jsp");
  
  private String path;
  
  private ViewResourceEnum(String path)
  {
    this.path = path;
  }
  
  public String getPath()
  {
     return path;
  }
}
