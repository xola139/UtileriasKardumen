

package examples.jaunt;

import com.jaunt.*;
import com.jaunt.component.*;
import java.io.*;

public class Example0{
  public static void main(String[] args){
    try{
      UserAgent userAgent = new UserAgent();                       //create new userAgent (headless browser).
      userAgent.visit("http://15.156.24.35:8052/ClienteWebCajeros/cajeros.html");                        //visit a webpage    
      System.out.println(userAgent.doc.innerHTML());               //print the content as HTML
    }
    catch(JauntException e){         //if an HTTP/connection error occurs, handle JauntException.
      System.err.println(e);
    }
  }
}