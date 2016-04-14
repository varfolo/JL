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
public class JSONParser {

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
           // conn.createStatement().executeUpdate("INSERT Appointments (ID, Engineer, Name)VALUES (1,'false','Лященко');");
           //conn.createStatement().executeQuery("INSERT Appointments (ID, Engineer, Name)VALUES (1,'false','Лященко');");
           // ResultSet result = statement           
           //   while (result.next()){
           //             System.out.println(result.getRow()+" "+result.getInt("AppID")+" "+result.getString("name")+" "+result.getString("Engineer"));
                  
           
//2-ой с//пособ, способ запросов хранимых процедур
/*
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
           String url2 = "jdbc:sqlserver://localhost:1433;databaseName=ShopD;integratedSecurity=false;";
          //Class.forName("net.sourceforge.jtds.jdbc.Driver");
          //String url2 = "jdbc:jtds:sqlserver://localhost:1433/ShopD";
           String UID = "sa";
           String PWRD = "qwe";
            Connection conn2 = DriverManager.getConnection(url2, UID, PWRD);
           CallableStatement cstmt = conn2.prepareCall("{call spEmployees}");
           ResultSet result = cstmt.executeQuery();

            while (result.next()){
                System.out.println(result.getRow()+" "+result.getInt("EmployeeID")+" "+result.getString("FName")+" "+result.getString("LName"));
           }
           conn2.close();
           // storedProcedure str = new storedProcedure("{call spEmployees}",conn2);
           // str.stor();
        }
        catch (Exception e){
            e.printStackTrace();
        }
     */
         
         
    /*            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        String url = "jdbc:sqlserver://localhost:1433;databaseName=ParseJ;integratedSecurity=false;";
        String UID = "sa";
        String PWRD = "qwe";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, UID, PWRD);
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("Select*from Appointments");
           
        } catch (SQLException ex) {
            Logger.getLogger(createDB.class.getName()).log(Level.SEVERE, null, ex);
        } 
*/
     // createDB create = new createDB();
     // create.crtDB();
        
//3 Работа с JSON
String url2 = "http://spgt.uraltexis.ru/api/v1/appointments/";
String genreJson = IOUtils.toString(new URL(url2));
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
