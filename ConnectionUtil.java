
public static Connection getConnection()
{
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");//loading class
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
	System.out.println(conn);
	
	} catch (SQLException e) {
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
