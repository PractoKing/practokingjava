package com.Practical;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * @author NDC
 */
public class DbSql {
    private static final String INSERT_SQL="INSERT INTO employee1 " + "(EMP_ID, NAME, DOB, EMAIL, DEPT) VALUES (?,?,?,?,?)";
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/pvg1";
        String username = "root";
        String password = "root";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Connection conn = null;
        PreparedStatement stmt = null;
        try {

            conn = DriverManager.getConnection(jdbcUrl, username, password);
            stmt = conn.prepareStatement(INSERT_SQL);

            stmt.setInt(1, 5);
            stmt.setString(2, "Michael");
            stmt.setDate(3, new Date(dateFormat.parse("1995-07-01").getTime()));
            stmt.setString(4, "michael@example.com");
            stmt.setString(5, "IT Department");
            stmt.executeUpdate();
            stmt.setInt(1, 4);
            stmt.setString(2, "Henry");
            stmt.setDate(3, new Date(dateFormat.parse("1990-02-21").getTime()));
            stmt.setString(4, "henry@example.com");
            stmt.setString(5, "HR Department");
            stmt.executeUpdate();
            System.out.println("Records inserted");
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
