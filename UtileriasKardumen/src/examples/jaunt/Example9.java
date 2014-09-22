package examples.jaunt;
import com.jaunt.*;
import com.jaunt.component.*;
import java.util.List;

public class Example9{
  public static void main(String[] args){
    try{ 
      UserAgent userAgent = new UserAgent(); 
      userAgent.visit("http://www.eluniversal.com.mx/noticias.html");
   
      Elements elements = userAgent.doc.findEvery("<div>");              //find all divs in the document
      System.out.println("Every div: " + elements.size() + " results");  //report number of search results.
   
      elements = userAgent.doc.findEach("<div>");                        //find all non-nested divs
      System.out.println("Each div: " + elements.size() + " results");   //report number of search results.
                                                                         //find non-nested divs within <p class='meat'>
      //elements = userAgent.doc.findFirst("<div class=mmtitulares>").findEach("<li>");
      
//      elements = userAgent.doc.findFirst("<div class=mmtitulares>").findEach("<ul>");
//      System.out.println("Meat search: " + elements.size() + " results");//report number of search results.
//      
      
//      div.outerXML(2)
      
      Elements ils = userAgent.doc.findEach("<div id=mmtitulares>").findEach("<ul>").findEach("<li>");//find non-nested ol's within non-nested tables
      System.out.println("Found " + ils.size() + " ILs:");
      for(Element il : ils){                                     //iterate through Results

    	  Element hr=il.findFirst("<a href>");
    	  Element fecha=il.findFirst("<span>");
    	  Element titulo=il.findFirst("<p>");
    	  System.out.println(hr.getAt("href")+"   "+fecha.getText()+"   "+titulo.getText());         //print each element and its contents
      }
      
      
    }
    catch(JauntException e){                          
      System.out.println(e);
    }    
  }
}


