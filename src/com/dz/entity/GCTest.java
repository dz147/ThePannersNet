package com.dz.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GCTest {
    public static void main(String[] args) {
        Connection conn = null;
       String  DBDRIVER = "com.mysql.jdbc.Driver";
       String DBURL = "jdbc:mysql://localhost:3306/wbwproductdb?useUnicode=true&characterEncoding=utf-8&";
        try {
            Class.forName(DBDRIVER);
            for (int i = 0; i < 10; i++) {
                conn = DriverManager.getConnection(DBURL,"root","dz520123");
                //conn.close();
            }
            System.out.println("连接成功！");
           //System.gc();
            Thread.sleep(8000);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
