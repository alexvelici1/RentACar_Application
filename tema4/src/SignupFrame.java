import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.io.File;
import java.lang.reflect.Field;
import java.security.KeyStore;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class SignupFrame {
    SignupFrame() {

        JFrame f = new JFrame("Frame Sign UP");
        JTextField mail, parola_1, confirm_parola;


        JButton okey = new JButton("OK");
        //aici se seteaza fontul si marimea butonului OK
        okey.setFont(new Font("Century", 1, 12));

        JButton cancel = new JButton("Cancel");
        cancel.setFont(new Font("Century", 1, 12));

        JLabel l1 = new JLabel("Mail:");
        JLabel l2 = new JLabel("Password:");
        JLabel l3 = new JLabel("Confirm Password:");

        mail = new JTextField(16);
        parola_1 = new JTextField(16);
        confirm_parola = new JTextField(16);

        // parola_1 = new JPasswordField(15);
        //confirm_parola = new JPasswordField(15);


        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        okey.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.add(l1);
        f.add(mail);

        f.add(l2);
        f.add(parola_1);

        f.add(l3);
        f.add(confirm_parola);


        f.add(okey);
        f.add(cancel);


        f.setSize(205, 310);
        f.setVisible(true);


        okey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String mail_text = mail.getText();
                String parola1_text = parola_1.getText();
                String confirmparola_text = confirm_parola.getText();
                char nume;
                char parola;
                int gasit=0;


                /////
                if (mail_text.equals("")) {
                    System.out.println("Ati uitat adresa de mail");
                } else {
                    if (parola1_text.equals("")) {
                        System.out.println("Ati uitat parola");
                    } else {
                        if (confirmparola_text.equals((""))) {
                            System.out.println("Ati uitat sa conf par");
                        } else {

                            if (parola1_text.equals(confirmparola_text)& confirmparola_text.equals(parola1_text)) {
                                System.out.println("Sunt la fel  ");
                                try {// get a connection to dabase
                                    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_DB", "root", "admin");
                                    //creat a statament
                                    Statement mystmt = myConn.createStatement();
                                    //execute sql query select //
                                    //insert cu executeupdate
                                    ResultSet myRs = null;
                                  if(mail_text== myConn.nativeSQL("nume")){
                                      System.out.println("invalid");
                                  }else{
                                      System.out.println("mail acceptat");
                                  }
                                    myRs = mystmt.executeQuery("select * from log");
                                    //process the result set
                                    while (myRs.next()) { //for(int i =0 ;i<final< i++) myRs.next exact ca si myRs[i]
                                        if(myRs.getString("nume").equals(mail_text)){
                                            gasit=1;
                                        }
                                    }

                                    //in partea din stg avem vectorul myrs si  avem egalitatea intre stg si dreapta ,iar cu select tabelele din mysql
                                }
                                catch (Exception exc){
                                    exc.printStackTrace();

                                }
                                try{
                                    if(gasit==1){
                                        System.out.println("Acest user exista deja!");
                                    }
                                    else{
                                        Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_DB", "root", "admin");
                                        //creat a statament
                                        Statement mystmt1 = myConn1.createStatement();
                                        if(gasit==1){
                                            System.out.println("Acest user exista deja!");
                                        }
                                        else{
                                            Connection myConn12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Auto_DB", "root", "admin");
                                            //creat a statament
                                            Statement mystmt12 = myConn12.createStatement();
                                            mystmt12.executeUpdate("INSERT INTO log (nume,parola,confpar) VALUES ('" + mail_text + "','" + parola1_text + "','" + confirmparola_text + "')");
                                        }
                                    }
                                }catch (Exception exc){
                                    exc.printStackTrace();

                                }
                            } else {

                                System.out.println("Parolele nu coincid");
                            }
                        }
                    }

                }
            }


        });//PARNTEZA ACTION EVENT
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
            }
        });

    }


};


