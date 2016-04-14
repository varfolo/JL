/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;


import java.net.URL;
import java.sql.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author galaxy
 */
public class JSONPars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
//1-ый способ, способ простых SQL-запросов
           Class.forName("net.sourceforge.jtds.jdbc.Driver");
           String url = "jdbc:jtds:sqlserver://localhost:1433/ParseJ";
           String UID = "sa";
           String PWRD = "qwe";
           Connection conn = DriverManager.getConnection(url, UID, PWRD);
           conn.createStatement().executeUpdate("TRUNCATE TABLE Appointments");
       
            //3 Работа с JSON
            String url1 = "http://spgt.uraltexis.ru/api/v1/appointments/";
            String genreJson = IOUtils.toString(new URL(url1));
            JSONParser jP = new JSONParser();
            JSONArray jA = (JSONArray) jP.parse(genreJson);

            for (int i = 0; i < jA.size(); i++ ){
                JSONObject genreJsonObject = (JSONObject) jA.get(i);
                String id = genreJsonObject.get("id").toString();
                String name = genreJsonObject.get("name").toString();
                String eng = genreJsonObject.get("engeneer").toString();
    
                String sql = "INSERT Appointments ([ID], [Engineer], [Name]) VALUES (?,?,?)";
   
                PreparedStatement sqlstatement = conn.prepareStatement(sql);
                sqlstatement.setString(1, id);
                sqlstatement.setString(2, eng);
                sqlstatement.setString(3, name);
                sqlstatement.executeUpdate();
            }       
            conn.close();

            }
             
             catch (Exception e){
                e.printStackTrace();
             }   
    }   
    
}
