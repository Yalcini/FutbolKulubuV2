package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teknik extends MaasliCalisan {

    private String gorev; // teknik direkt�r, yard�mc� antren�rler, kaleci antren�r�, performans antren�r�, analiz sorumlusu,tak�m doktoru, fizyoterapist, terc�man, mas�rler, malzeme sorumlusu
    private String sozlesmeBitisi;
    
    public Teknik() {
    	// mainControlde yeni personelleri veri yap�lar� kullanarak eklerken bu bo� kurucuya ihtiya� duyuluyor.
    	super();
    }
    public Teknik(String gorev, String ad_soyad, int yas, double maas,String sozlesme) {
        super(ad_soyad, yas, maas);
        this.setGorev(gorev);
        this.setSozlesmeBitisi(sozlesme);
        
    }
    
    
    

    public String getSozlesmeBitisi() {
        return sozlesmeBitisi;
    }


    public void setSozlesmeBitisi(String sozlesmeBitisi) {
        this.sozlesmeBitisi = sozlesmeBitisi;
    }


    public String getGorev() {
        return gorev;
    }


    public void setGorev(String g�rev) {
        this.gorev = g�rev;
    }
    
    
    
}

