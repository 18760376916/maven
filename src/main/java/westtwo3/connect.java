package westtwo3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connect {
    public static void with(Connection conn){
        String sql= "alter table city add constraint fk_name foreign key (name) references today (name);";
        String sql1= "alter table city add constraint fk_name1 foreign key (name) references tomorrow (name);";
        String sql2="alter table city add constraint fk_name2 foreign key (name) references tdat (name);";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.execute();
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
