import java.sql.Connection;

public class ConnectionUtil{
public static Connection getConnection()
{
FileInputStream fis;
	Connection conn=null;
	Properties propeties_file;
	try {
		fis=new FileInputStream(".//resources//dbmsConnection.properties");
		properties_file.load(fis);
		String driver=properties_file.getProperty("driver");
		String url=properties_file.getProperty("url");
		String user=properties_file.getProperty("user");
		String password=properties_file.getProperty("passsword");
		Class.forName(driver);//loading class
		conn=DriverManager.getConnection(url,user,password);
	        System.out.println(conn);
	
	}
	catch()
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
		}
	
return conn;
}
}
