package connector;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDBConnector {
	Connection conn = null;
	String user = "sa";
	String password = "n0tPubl1c";
	String databaseName = "CSDLThuVien";
	String url = "jdbc:sqlserver://localhost;databaseName="+ databaseName+ ";user="+ user+ ";password="+ password+"";
	public static Connection getConnection() {
		
		try {
			conn = DriverManager.getConnection(url);		
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection()
	{
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
