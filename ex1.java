import java.sql.*;
class ex1{
public static void main(String args[]){
try{
//step1 load the driver class
Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.32.2:1521:trident","user1","user#123");

//step3 create the statement object
Statement stmt=con.createStatement();

//step4 execute query
ResultSet rs=stmt.executeQuery("select * from tab");
while(rs.next())
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
rs.close();
stmt.close();
con.close();

}catch(Exception e){ System.out.println(e);}

}
}