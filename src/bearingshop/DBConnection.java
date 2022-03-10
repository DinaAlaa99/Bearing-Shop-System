/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearingshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dina Alaa
 */
public class DBConnection {

    Connection myconobj = null;
    Statement mystateobj = null;
    ResultSet myresobj = null;
    String query;

    public DBConnection(String query) {
        this.query = query;
        try {
            myconobj = DriverManager.getConnection("jdbc:derby://localhost:1527/Bearing Shop", "MohamedFawzy", "123456");
            System.out.println("Connection Established Correctly.........");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DatabaseAccess() {
        try {

            mystateobj = myconobj.createStatement();
            System.out.println(query);
            myresobj = mystateobj.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    DBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void UpdadateTable() {
        try {
            mystateobj = myconobj.createStatement();
            System.out.println(query);
            mystateobj.executeUpdate(query);
        }   catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void CloseConnection() throws SQLException {
        myconobj.close();
    }

}
