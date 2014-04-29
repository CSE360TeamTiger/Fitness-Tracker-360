

import java.sql.Connection;
import java.util.Properties;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

	Connection c;
	Statement st;
	ResultSet rs;

	public Database() {
		c = openConnection();
	}

	public static Connection openConnection() {
        Properties properties = new Properties();
        properties.put("user", "jpjackson");
        properties.put("password", "7415FT");
        properties.put("characterEncoding", "ISO-8859-1");
        properties.put("useUnicode", "true");
        String url = "jdbc:mysql://127.0.0.1:3306/FT360_Database";
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, properties);
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

	public void execute(String sql) {
		try {
			st = c.createStatement();
			st.execute(sql);
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}

	public ResultSet executeQuery(String sql) {
		try {
			st = c.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,
					ex);
		}
		return rs;
	}

	public String tableName(String str) {
		switch (str) {
		case "Doctor":
			return "doctors";
		case "Patient":
			return "patients";
		default:
			return "";
		}
	}
}
