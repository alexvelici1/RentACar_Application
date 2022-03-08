//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class InchirieriAutoFrame {
    int counter = 0;

    void Functie_buton_next(final CarAuto[] vector_masini) {
        final JFrame f = new JFrame();
        ImageIcon Volvo2016 = new ImageIcon((new ImageIcon(vector_masini[this.counter].getImg())).getImage().getScaledInstance(400, 300, 1));
        JLabel label_imagine = new JLabel(Volvo2016);
        label_imagine.setBounds(0, 0, 400, 300);
        f.add(label_imagine);
        JLabel label_nume = new JLabel(vector_masini[this.counter].getNume());
        label_nume.setBounds(450, 0, 220, 60);
        label_nume.setFont(new Font("Century", 1, 30));
        f.add(label_nume);
        JTextArea scrollableTextArea1 = new JTextArea(vector_masini[this.counter].getDescriere());
        scrollableTextArea1.setEditable(false);
        scrollableTextArea1.setBounds(420, 60, 400, 200);
        f.add(scrollableTextArea1);
        CarAuto var10002 = vector_masini[this.counter];
        JLabel label_pret = new JLabel(String.valueOf(var10002.getPret()) + "euro");
        label_pret.setBounds(500, 240, 100, 100);
        label_pret.setFont(new Font("Century", 1, 20));
        f.add(label_pret);
        JButton Rezerva = new JButton("Rezerva");
        Rezerva.setFont(new Font("Century", 1, 16));
        Rezerva.setBounds(500, 300, 100, 40);
        f.add(Rezerva);
        JButton Next = new JButton("Next");
        Next.setFont(new Font("Century", 1, 16));
        Next.setBounds(600, 300, 100, 40);
        f.add(Next);
        Next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (InchirieriAutoFrame.this.counter <= vector_masini.length - 2) {
                    f.dispose();
                    ++InchirieriAutoFrame.this.counter;
                    InchirieriAutoFrame.this.Functie_buton_next(vector_masini);
                } else {
                    System.out.println("Nu mai avem masini");
                }

            }
        });
        f.dispose();
        f.setSize(755, 400);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }

    InchirieriAutoFrame() throws IOException {
        final CarAuto[] vector_masini = new CarAuto[]{new CarAuto("C:\\Users\\daniel\\Downloads\\tema4\\tema4\\Volvo2016.jpg", "Volvo XC60", 200, "Descriere:\n\n 5 Locuri \n 2/3 Bagaje \n  Dublu climatronic \n  NAVIGATIE: 3D Actualizata \n Combustil : Diesel \n Cutie  de viteze: Manuala \n"),
                new CarAuto("C:\\Users\\daniel\\Downloads\\tema4\\tema4\\maserati.jpg", "Maserati", 300, "Descriere:\n\n4 Locuri \n1/2 Bagaje \n Geamuri electrice \n Interior:piele\nCombustil :Benzina \nCutie  de viteze: Manuala \n"),
                new CarAuto("C:\\Users\\daniel\\Downloads\\tema4\\tema4\\ww7.jpg", " VW Golf 7", 200, "Descriere:\n\n 5 Locuri \n 2 Bagaje \n  Scaune fata incalzite \n  Computer de bord  \n Combustil : Benzina \n Cutie de viteze: Manuala \n"),
                new CarAuto("C:\\Users\\daniel\\Downloads\\tema4\\tema4\\ford_puma.jpg", "Ford Puma", 250, "Descriere:\n\n 5 Locuri \n 2 Bagaje \n  Camera parcare spate \n  Computer de bord  \n Volan încălzit \n Combustil :Hibrid\n Cutie de viteze: Manuala \n")};
        JFrame f = new JFrame("Inchirieri.SRL");
        ImageIcon imageIcon = new ImageIcon((new ImageIcon("C:\\Users\\daniel\\Downloads\\tema4\\tema4\\logo.auto.jpg")).getImage().getScaledInstance(300, 140, 1));
        JLabel label = new JLabel(imageIcon);
        JButton Automobile = new JButton(" Automobile ");
        Automobile.setFont(new Font("Century", 1, 16));
        Automobile.setBounds(20, 140, 150, 35);
        JButton Reguli = new JButton(" Reguli ");
        Reguli.setFont(new Font("Century", 1, 16));
        Reguli.setBounds(200, 140, 150, 35);
        JButton Reduceri = new JButton("  Reduceri si Promotii ");
        Reduceri.setFont(new Font("Century", 1, 16));
        Reduceri.setBounds(380, 140, 250, 35);
        label.setBounds(180, 0, 300, 140);
        f.add(label);
        f.add(Automobile);
        f.add(Reguli);
        f.add(Reduceri);
        Automobile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InchirieriAutoFrame.this.counter = 0;
                InchirieriAutoFrame.this.Functie_buton_next(vector_masini);
            }
        });
        Reguli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JTextArea scrollableTextArea = new JTextArea("  1)  Documente necesare la preluarea masinii:\n– Carte de identitate sau pasaport;\n– Permis de conducere valid, cu o vechime de cel putin 12 luni;\n– Card de credit.\n \n2) CONDITII SI MODALITATI DE PLATA: \nLocatarul nu va plati nimic anticipat, plata avand loc integral la semnarea contractului( in functie de orele de predare/primire). ;\nToate tarifele si taxele sunt calculate in Euro.\n Plata in numerar se poate face in urmatoarele valute: LEI si EURO.Plata cu card de credit : VISA, MASTERCARD \n\n3) Taxa pentru carburant:\nFull with full: clientii ridica autoturismul cu plinul facut si trebuie sa il returneze tot cu plinul facut.\nIn caz contrar clientul va achita o taxa de realimentare de 20 de euro+ combustibilul \n\n4)Alte taxe suplimentare:\nCheia pierduta:intre 100-250 euro ( in cazul in care un consilier se va deplasa la client in acest sens, se va percepe o taxa suplimentara de 25 de euro);\nDocumente pierdute: 250 euro;\nMurdarie excesiva in autoturism (tapiterie patata,plafon patat etc.): 120 euro\nTapiserie deteriorata ( arsa cu tigarea,rupta ,agatata etc .) : 500 euro\nPierderea accesoriilor: intre 50 si 150 euro.\n");
                scrollableTextArea.setEditable(false);
                scrollableTextArea.setBackground(Color.lightGray);
                scrollableTextArea.setBounds(0, 0, 755, 400);
                f.add(scrollableTextArea);
                f.dispose();
                f.setSize(755, 400);
                f.setLayout((LayoutManager)null);
                f.setVisible(true);
            }
        });
        Reduceri.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JTextArea scrollableTextArea = new JTextArea(" Preturi reduse la inchirieri auto de weekend in Romania :\n\nExtinde-ti weekendul cu oferta noastra.\nPentru aventuri urbane, pentru calatorii lipsite de griji, pentru confort sau mai mult spatiu,alege o masina potrivita planurilor tale.\nInclude ziua de sambata in perioada pentru care inchiriezi masina pentru a descoperi preturile noastre reduse.\n Oferta valabia se v-a afisa cand se va selcta perioada.\n\n\n\nDescopera ofertele pentru sezonul festiv \n\nLa capatul fiecarui drum te asteapta o destinatie speciala.\nEste o adevarata placere pentru noi sa iti fim partener pentru calatoriile deosebite din \naceasta perioada si o onoare sa facem parte din povestea ta festiva.\nRelaxeaza-te daca planurile tale se schimba, la fel pot si rezervarile.\nFara taxe de anulare.Returnarea  integrala a banilor. Pentru modificari cu  maxim 24 de ore inainte de inceperea rezervarii.\n");
                scrollableTextArea.setEditable(false);
                scrollableTextArea.setBackground(Color.lightGray);
                scrollableTextArea.setBounds(0, 0, 820, 400);
                f.add(scrollableTextArea);
                f.dispose();
                f.setSize(755, 400);
                f.setLayout((LayoutManager)null);
                f.setVisible(true);
            }
        });
        f.dispose();
        f.setSize(740, 410);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }
}
