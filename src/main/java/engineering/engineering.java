package engineering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class engineering {
	public static void main(String[] args) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/engg", "root","root");
	//PreparedStatement preparedStatement=  connection.prepareStatement
			//("create table BE(USN varchar(50) primary key,name varchar(50) not null,stream varchar(50),clgname varchar(50),CGPA varchar(10))");
	
	boolean flag=true;
	Scanner scanner = new Scanner(System.in);
	while(flag)
	{
		System.out.println("1. add ");
		System.out.println("2. update brach");
		System.out.println("3. update CGPA");
		System.out.println("4. fetch students");
		System.out.println("5. delete student");
		System.out.println("6. fetch all students");
		System.out.println("7. delete all student");
		System.out.println("8. exit");
		System.out.println(" enter the option...................");
		switch (scanner.nextInt()) {
		case 1:
		{
			PreparedStatement preparedStatement=  connection.prepareStatement("insert into BE values(?,?,?,?,?)");
			System.out.println("enter the USN");
			preparedStatement.setString(1, scanner.next());
			System.out.println("enter the name");
			preparedStatement.setString(2, scanner.next());
			System.out.println("enter the stream");
			preparedStatement.setString(3, scanner.next());
			System.out.println("enter the clgname");
			preparedStatement.setString(4, scanner.next());
			System.out.println("enter the CGPA");
			preparedStatement.setString(5, scanner.next());
			preparedStatement.executeUpdate();
			System.out.println("................added...............");	
		}break;
case 2: {
	PreparedStatement preparedStatement =connection.prepareStatement("update BE set breach=? where USN=? ");
	System.out.println("enter the USN");
	preparedStatement.setString(1, scanner.next());
	System.out.println("enetr the branch name");
	preparedStatement.setString(2, scanner.next());
	preparedStatement.executeUpdate();
	System.out.println("..............updated................");
	
	}break;
case 3: {
	PreparedStatement preparedStatement =connection.prepareStatement("update BE set CGPA=? where USN=? ");
	System.out.println("enter the USN");
	preparedStatement.setString(1, scanner.next());
	System.out.println("enetr the update CGPA");
	preparedStatement.setString(2, scanner.next());
	preparedStatement.executeUpdate();
	System.out.println("..............updated................");
}break;

case 4: {
	PreparedStatement preparedStatement =connection.prepareStatement("select * from BE where USN=? ");
	System.out.println("enter the USN");
	preparedStatement.setString(1, scanner.next());
	ResultSet resultSet= preparedStatement.executeQuery();
	resultSet.next();
	System.out.println("USN:" + resultSet.getString(1) + "name:" + resultSet.getString(2) + "stream :" + resultSet.getString(3) + "clgname :" + resultSet.getString(4) + "CGPA :" + resultSet.getString(5));
	System.out.println("..............................");
}break;
case 5:{
	PreparedStatement preparedStatement =connection.prepareStatement("delete from BE where USN=? ");
	System.out.println("enter the USN to remove the student");
	preparedStatement.setString(1, scanner.next());
	preparedStatement.executeUpdate();
	System.out.println("..............student has been removed................");
	
}break;
case 6:{
	PreparedStatement preparedStatement =connection.prepareStatement("select * from BE ");
	ResultSet resultSet= preparedStatement.executeQuery();
	resultSet.next();
	System.out.println("USN:" + resultSet.getString(1) + "name:" + resultSet.getString(2) + "stream :" + resultSet.getString(3) + "clgname :" + resultSet.getString(4) + "CGPA :" + resultSet.getString(5));
	System.out.println("..............................");
	
}break;
case 7:{
	PreparedStatement preparedStatement =connection.prepareStatement("delete from BE ");
	preparedStatement.executeUpdate();
	System.out.println("..............removed all................");
}break;
case 8:{
	flag=false;
	System.out.println("Thank you ..........<(-_-)>.........");
}break;

default:
			System.out.println("invalid option");
			break;
		}
	}
	connection.close();
}
}
