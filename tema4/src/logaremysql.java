import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class logaremysql {
    public static void main(String[] args)
    {
        try {// get a connection to dabase
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_DB","root","admin");

            //creat a statament
            Statement mystmt=myConn.createStatement();

            //execute sql query select //
            //insert cu executeupdate

            mystmt.executeUpdate("INSERT INTO logaree (Nume,Parola,Confirmare_parola) VALUES ('vasile2012' ,'daniel','daniel')");

            ResultSet myRs=mystmt.executeQuery("select * from logaree ");

            //process the result set
            while(myRs.next()){
             System.out.println(myRs.getString("Nume")+", " + myRs.getString("Parola") );
            }
        }
        catch (Exception exc){
            exc.printStackTrace();

        }



    }


}
