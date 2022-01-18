package westtwo3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
    /*public static void all( Connection conn){
        String sql = "select * from city";
        String sql1 = "select * from today";
        String sql2 = "select * from tomorrow";
        String sql3 = "select * from tdat";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String n = rs.getString("name");
                String id = rs.getString("city_id");
                String wei = rs.getString("wei");
                String jin = rs.getString("jin");
                System.out.println(n+","+id+","+wei+","+jin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
    public static void oneCity(String name, Connection conn){
        String sql = "select * from city where name = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            rs.next();
            String n = rs.getString("name");
            String id = rs.getString("city_id");
            String wei = rs.getString("wei");
            String jin = rs.getString("jin");
            System.out.println(n+","+id+","+wei+","+jin);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void oneToday(String name, Connection conn){
        String sql = "select * from today where name = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            rs.next();
            String n = rs.getString("name");
            String fxDate = rs.getString("fxDate");
            String tempMax = rs.getString("tempMax");
            String tempMin = rs.getString("tempMin");
            String textDay= rs.getString("textDay");
            System.out.println(n+","+fxDate+","+tempMax+","+tempMin+","+textDay);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void oneTomorrow(String name, Connection conn){
        String sql = "select * from tomorrow where name = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            rs.next();
            String n = rs.getString("name");
            String fxDate = rs.getString("fxDate");
            String tempMax = rs.getString("tempMax");
            String tempMin = rs.getString("tempMin");
            String textDay= rs.getString("textDay");
            System.out.println(n+","+fxDate+","+tempMax+","+tempMin+","+textDay);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void oneTdat(String name, Connection conn){
        String sql = "select * from tdat where name = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            rs.next();
            String n = rs.getString("name");
            String fxDate = rs.getString("fxDate");
            String tempMax = rs.getString("tempMax");
            String tempMin = rs.getString("tempMin");
            String textDay= rs.getString("textDay");
            System.out.println(n+","+fxDate+","+tempMax+","+tempMin+","+textDay);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
