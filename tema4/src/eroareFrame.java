import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import java.applet.*;
import java.awt.event.*;
import java.io.File;
import java.lang.reflect.Field;
import  java.awt.Color.*;


public class  eroareFrame {
    public
    eroareFrame( String t1 ){

        JFrame f = new JFrame("EROARE");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel(t1);


        f.setSize(191, 120);
        f.setFont(new Font("Segoe UI Black",1,14));
        Color rosu = new Color(137, 54, 54);



        f.add(panel);
        f.add(label1);

        f.setVisible(true);




   }

}

