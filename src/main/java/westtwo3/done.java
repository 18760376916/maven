package westtwo3;

import java.sql.*;
import java.util.List;

public class done {
    public static void main(String[] args) {
        List<info> infoFu = getInfo.getF();//https://geoapi.qweather.com/v2/city/lookup?key=4cb4ea53a98d4ffa9b71a50041753e3f&location=福州
        String name1="福州";
        String id1="101230101";
        String tempMax11=infoFu.get(0).getTempMax(),tempMin11=infoFu.get(0).getTempMin(),tempMax12=infoFu.get(1).getTempMax(),tempMin12=infoFu.get(1).getTempMin(),tempMax13=infoFu.get(2).getTempMax(),tempMin13=infoFu.get(2).getTempMin();
        String fxDate11=infoFu.get(0).getFxDate(),fxDate12=infoFu.get(1).getFxDate(),fxDate13=infoFu.get(2).getFxDate();
        String textDay11=infoFu.get(0).getTextDay(),textDay12=infoFu.get(1).getTextDay(),textDay13=infoFu.get(2).getTextDay();
        List<info> infoBei = getInfo.getB();
        String name2="北京";
        String id2="101010100";
        String tempMax21=infoBei.get(0).getTempMax(),tempMin21=infoBei.get(0).getTempMin(),tempMax22=infoBei.get(1).getTempMax(),tempMin22=infoBei.get(1).getTempMin(),tempMax23=infoBei.get(2).getTempMax(),tempMin23=infoBei.get(2).getTempMin();
        String fxDate21=infoBei.get(0).getFxDate(),fxDate22=infoBei.get(1).getFxDate(),fxDate23=infoBei.get(2).getFxDate();
        String textDay21=infoBei.get(0).getTextDay(),textDay22=infoBei.get(1).getTextDay(),textDay23=infoBei.get(2).getTextDay();
        List<info> infoSh = getInfo.getF();
        String name3="上海";
        String id3="101020100";
        String tempMax31=infoSh.get(0).getTempMax(),tempMin31=infoSh.get(0).getTempMin(),tempMax32=infoSh.get(1).getTempMax(),tempMin32=infoSh.get(1).getTempMin(),tempMax33=infoSh.get(2).getTempMax(),tempMin33=infoSh.get(2).getTempMin();
        String fxDate31=infoSh.get(0).getFxDate(),fxDate32=infoSh.get(1).getFxDate(),fxDate33=infoSh.get(2).getFxDate();
        String textDay31=infoSh.get(0).getTextDay(),textDay32=infoSh.get(1).getTextDay(),textDay33=infoSh.get(2).getTextDay();
        String driver="com.mysql.cj.jdbc.Driver";
        //数据库名为school
        String URL="jdbc:mysql://localhost:3306/school?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
        Connection conn=null;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(URL,"root","18760376916");
            System.out.println("*************数据库连接成功*************");
            //插入数据
            Insert.CityInsert(name1,"101230101","26.07530","119.30623",conn);
            Insert.CityInsert(name2,"101010100","39.90498","116.40528",conn);
            Insert.CityInsert(name3,"101020100","31.23170","121.47264",conn);
            Insert.TodayInsert(name1,fxDate11,tempMax11,tempMin11,textDay11,conn);
            Insert.TomorrowInsert(name1,fxDate12,tempMax12,tempMin12,textDay12,conn);
            Insert.TdatInsert(name1,fxDate13,tempMax13,tempMin13,textDay13,conn);
            Insert.TodayInsert(name2,fxDate21,tempMax21,tempMin21,textDay21,conn);
            Insert.TomorrowInsert(name2,fxDate22,tempMax22,tempMin22,textDay22,conn);
            Insert.TdatInsert(name2,fxDate23,tempMax23,tempMin23,textDay23,conn);
            Insert.TodayInsert(name3,fxDate31,tempMax31,tempMin31,textDay31,conn);
            Insert.TomorrowInsert(name3,fxDate32,tempMax32,tempMin32,textDay32,conn);
            Insert.TdatInsert(name3,fxDate33,tempMax33,tempMin33,textDay33,conn);
            //外键约束
            connect.with(conn);
            //查询数据-城市信息
            System.out.println("***福州信息如下：***");
            select.oneCity("福州",conn);
            System.out.println("***北京信息如下：***");
            select.oneCity("福州",conn);
            System.out.println("***上海信息如下：***");
            select.oneCity("北京",conn);
            //查询数据-今日城市天气
            System.out.println("***福州今日天气情况如下：***");
            select.oneToday("福州",conn);
            System.out.println("***北京今日天气情况如下：***");
            select.oneToday("北京",conn);
            System.out.println("***上海今日天气情况如下：***");
            select.oneToday("上海",conn);
            //查询数据-明天城市天气
            System.out.println("***福州明天天气情况如下：***");
            select.oneTomorrow("福州",conn);
            System.out.println("***北京明天天气情况如下：***");
            select.oneTomorrow("北京",conn);
            System.out.println("***上海明天天气情况如下：***");
            select.oneTomorrow("上海",conn);
            //查询数据-后天城市天气
            System.out.println("***福州后天天气情况如下：***");
            select.oneTdat("福州",conn);
            System.out.println("***北京后天天气情况如下：***");
            select.oneTdat("北京",conn);
            System.out.println("***上海后天天气情况如下：***");
            select.oneTdat("上海",conn);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("*************数据库连接失败*************");
        }finally {
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
