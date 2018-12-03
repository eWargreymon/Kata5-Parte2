package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {
    
    public static List<String> read() throws SQLException{
        
        Connection con = null;
        String url = "jdbc:sqlite:KATA5.db";
        con = DriverManager.getConnection(url);
        System.out.println("Conexión establecida");
        String sql = "SELECT Mail FROM EMAIL";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        List<String> emails = new ArrayList<String>();
        
        while(rs.next()){
            emails.add(rs.getString("Mail"));
        }
        
        return emails;
    }
    
}
