/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
 

/**
 *
 * @author TeamWork
 */
public class JavaJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  Exception {
        // TODO code application logic here
        URL  ur=new URL("http://localhost:88/PhpProject1/jsongetlist.php");
        HttpURLConnection conn = (HttpURLConnection) ur.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-length", "0");
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(false);
        conn.setConnectTimeout(100000);
        conn.setReadTimeout(100000);
        conn.connect();
        if(conn.getResponseCode()==201 || conn.getResponseCode()==200)
        {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    StringBuilder sb = new StringBuilder();

    String line = null;
     
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
    
    
      sb.toString();
            JSONArray ar=new JSONArray(sb.toString());
            int i=0;
            for(i=0;i<=ar.length()-1;i++){
                
                JSONObject  ob=ar.getJSONObject(i);
                System.out.print(ob.getString("code"));
                System.out.print(ob.getString("nom"));
                System.out.print(ob.getString("qte"));
                System.out.print(ob.getString("image"));
            }
            
        }
    }
    
}
