package helloworld;

/**
 *
 * @author Michaela
 */
public class HelloWorldBean {
    private String capital;
    //HTML-Formater
    private String htmlCapital;

    public HelloWorldBean() {
    }

    public String getCapital() {
        return capital;
    }

    public String getHtmlCapital() {
        return htmlCapital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setHtmlCapital(String htmlCapital) {
        this.htmlCapital = htmlCapital;
    }
    
    //Other

    public HelloWorldBean(String capital) {
        this.capital = capital;
    }
    
}
