/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sun.net.www.http.HttpClient;
 

/**
 *
 * @author TeamWork
 */
public class JavaJsonEnvoyerVal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  Exception {
        // TODO code application logic here
         String strj="{\"code\":1111,\"nom\":\"ammio1000\"}";
            JSONObject o=new JSONObject(strj);
           // System.err.println(""+o.getInt("code"));
            
        
        URL  ur=new URL("http://localhost:88/PhpProject1/ajouterjsonToMysql.php?data="+o.toString());
        HttpURLConnection conn = (HttpURLConnection) ur.openConnection();
        /*conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-length", "0");
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(false);
        conn.setConnectTimeout(100000);
        conn.setReadTimeout(100000);*/
        conn.connect();
        if(conn.getResponseCode()==201 || conn.getResponseCode()==200)
        {
             
    
                //OBJ ENVOYER 
           
            System.err.println("ok connect");
            
        }else{
            System.err.println("ok connect");
        }
        /**************/
       
    
        
        
        
    }
    
}
