import java.awt.*;
import java.io.ObjectInputStream;
import javax.swing.*;
import javax.swing.JPanel;

public class CarAuto {
    String img;
    String nume;
    String descriere;
    int pret;

    CarAuto(String a,String b,int c,String d){
        this.img=a;
        this.nume=b;
        this.pret=c;
        this.descriere=d;

    }

    String getImg(){
        return this.img;
    }

    String getNume(){
        return this.nume;
    }
    String getDescriere(){return this.descriere;}

    int getPret(){
        return this.pret;
    }


}
