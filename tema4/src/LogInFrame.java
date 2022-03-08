import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInFrame {

     public LogInFrame() {
         JFrame f = new JFrame("Frame Example");
         JButton b1 = new JButton("CANCEL");
         JLabel label1 = new JLabel("BINE ATI VENIT !");


         f.setLayout(new BorderLayout());
         f.setBackground(Color.GRAY);

         f.add(label1, BorderLayout.NORTH);
         f.add(b1, BorderLayout.SOUTH);
         f.setSize(100, 150);
         f.setVisible(true);

         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 f.setVisible(false);
             }

             ;

         });
     }
}
