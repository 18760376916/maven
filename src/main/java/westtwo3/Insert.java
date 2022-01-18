package westtwo3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void CityInsert(String name, String city_id, String wei, String jin, Connection conn){
        PreparedStatement stmt= null;
        String sql="insert into city (name, city_id, wei, jin) values ( ? , ? , ? ,? )";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,city_id);
            stmt.setString(3,wei);
            stmt.setString(4,jin);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void TodayInsert( String name, String fxDate, String tempMax,String tempMin,String textDay, Connection conn){
        PreparedStatement stmt= null;
        String sql="insert into today (name, fxDate, tempMax, tempMin, textDay) VALUES ( ?,?,?,?,? ) on duplicate key update name = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,fxDate);
            stmt.setString(3,tempMax);
            stmt.setString(4,tempMin);
            stmt.setString(5,textDay);
            stmt.setString(6,name);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void TomorrowInsert( String name, String fxDate, String tempMax,String tempMin,String textDay, Connection conn){
        PreparedStatement stmt= null;
        String sql="insert into tomorrow (name, fxDate, tempMax, tempMin, textDay) VALUES ( ?,?,?,?,? ) on duplicate key update name = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,fxDate);
            stmt.setString(3,tempMax);
            stmt.setString(4,tempMin);
            stmt.setString(5,textDay);
            stmt.setString(6,name);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void TdatInsert( String name, String fxDate, String tempMax,String tempMin,String textDay, Connection conn){
        PreparedStatement stmt= null;
        String sql="insert into tdat (name, fxDate, tempMax, tempMin, textDay) VALUES ( ?,?,?,?,? ) on duplicate key update name = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,fxDate);
            stmt.setString(3,tempMax);
            stmt.setString(4,tempMin);
            stmt.setString(5,textDay);
            stmt.setString(6,name);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
