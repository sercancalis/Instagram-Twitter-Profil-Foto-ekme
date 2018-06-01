
package servis;

import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author sercan
 */
@WebService(serviceName = "servis")
public class servis {

    

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    public String getInstaPic(String name)
    {
         String url = "#";
         Document doc = null;
        try {   
            doc = Jsoup.connect("https://www.instagram.com/"+name).get();
                        
            Elements ele = doc.select("meta[property=og:image]");
            url = ele.attr("content");

        } catch (IOException ex) {
           
        }
        
        return url;
    }
    
    public String getTwitPic(String name)
    {
         String url = "#";
         Document doc = null;
        try {
            doc = Jsoup.connect("https://twitter.com/"+name).get();
                      
            Elements links = doc.select("div#page-container");
            for(Element link: links)
            {
                 url = link.select("a").attr("href");
            }
                    
        } catch (IOException ex) {
           
        }
        
        return url;
    }
}
