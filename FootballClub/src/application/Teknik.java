package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teknik extends MaasliCalisan {

    private String gorev; // teknik direktör, yardýmcý antrenörler, kaleci antrenörü, performans antrenörü, analiz sorumlusu,takým doktoru, fizyoterapist, tercüman, masörler, malzeme sorumlusu
    private String sozlesmeBitisi;
    
    public Teknik() {
    	// mainControlde yeni personelleri veri yapýlarý kullanarak eklerken bu boþ kurucuya ihtiyaç duyuluyor.
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


    public void setGorev(String görev) {
        this.gorev = görev;
    }
    
    
    
}

