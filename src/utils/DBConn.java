package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by admin on 2017/5/31.
 */
public class DBConn {
    // 初始化连接池
    private static DataSource dataSource;
    static {
         dataSource = new ComboPooledDataSource();
    }
    

    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 创建DbUtils常用工具类对象
     */
    public static QueryRunner getQueryRunner() {
        return new QueryRunner(dataSource);
    }


    public static void main(String[] args) throws  Exception {
        String sql = "insert into employee(empName) values(?)";
        try {
            DBConn.getQueryRunner().update(sql, "Jack");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
