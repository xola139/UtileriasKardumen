package examples.jaunt;
import com.jaunt.*;
import com.jaunt.component.*;

public class Example22{
  public static void main(String[] args) throws ResponseException{
    UserAgent userAgent = new UserAgent(); 
//    userAgent.setProxyHost("127.0.0.1");             //specify the proxy host (ip address)
//    userAgent.setProxyPort(9666);                      //specify the proxy port
//                                                       //visit a URL through the proxy
//    userAgent.visit("http://twitter.com/xola139");               
//    System.out.println(userAgent.doc.innerXML());      //print the retrieved document
// 
  try{
  
    //UserAgent userAgent = new UserAgent();
    userAgent.visit("http://fiddle.jshell.net/xola139/GmDuY/2/show/");
    Table table = userAgent.doc.getTable("<table>");   //get Table component via search query
         
    System.out.println("\nColumn having 'Equipo':");
    Elements elements = table.getCol("equipo");                                  //get entire column containing 'Mon'
    for(Element element : elements) System.out.println(element.outerHTML());
  
  }catch(Exception e){
	  e.printStackTrace();
  }
  }
}