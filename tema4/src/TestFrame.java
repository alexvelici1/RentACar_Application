import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.cj.xdevapi.FindStatement;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

class TestFrame extends JFrame {
    public TestFrame() {

        JFrame f = new JFrame("Frame Example"); //aici creez un nou frame

        JPanel panel = new JPanel();

        JButton b1 = new JButton("LOG IN");// aici creez butoanele
        b1.setFont(new Font("Century",1,12));

        JButton b2 = new JButton("SIGN UP");
        b2.setFont(new Font("Century",1,12));

        JButton b3 = new JButton("CANCEL");
        b3.setFont(new Font("Century",1,12));

        JLabel label1, label2;// aici declaram label 1, label 2
        JTextField nume_text, parola_text;// declram jtextfiled pt nume_text si parola_text
        label1 = new JLabel("Enter your username");//aici creez label 1
        label2 = new JLabel("Enter your password");//aici creez label 2
        nume_text = new JTextField(15);// aici creez JTextField si dimensiunea pt nume_text
        parola_text = new JPasswordField(15);//aici creez JTextField si dimensiunea pt parola_text

        f.setLayout(new FlowLayout()); //aici setez asezarea cu ajutorul lui FlowLayout
        f.setBackground(Color.GRAY);// aici setam culoarea gri de fundal
        f.add(label1);
        f.add(nume_text);
        f.add(label2);
        f.add(parola_text);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(panel);
        f.setSize(250, 430);// aici setam inaltimea si lungimea
        f.setVisible(true);

            //aici facem event pt butoane
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int count=0;
                String nume_utilizator = nume_text.getText();
                String parola_utilizator = parola_text.getText();
                try {// get a connection to dabase
                    Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_DB","root","admin");

                    //creat a statament
                    Statement mystmt=myConn.createStatement();

                    //execute sql query select //
                    //insert cu executeupdate

                    //mystmt.executeQuery("select from  log (nume_text,parola_text) VALUES ( nume,parola)");

                    ResultSet myRs=mystmt.executeQuery("select  nume, parola  from log ");

                    //process the result set
                    while(myRs.next()) {
                           if(myRs.getString("nume").equals(nume_utilizator)) {
                               if (myRs.getString("parola").equals(parola_utilizator)) {
                                  count=1;
                               }
                           }
                        }
                    if(count==1){
                        f.dispose();
                        InchirieriAutoFrame auto1 = new InchirieriAutoFrame();
                        System.out.println("Felicitari te-ai logat!");
                    }else{
                        System.out.println("Numele sau parola sunt gresite!");
                    }
                    }
                    catch (Exception exc){
                        exc.printStackTrace();

                    }

            };
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
            };

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               SignupFrame sign1=new SignupFrame();
            };

        });








    };


}
