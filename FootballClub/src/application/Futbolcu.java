package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Futbolcu extends MaasliCalisan {
    private double piyasa;
    private String mevki;
    private String uyruk;
    private String sozlesme;
    private int formaNo;
    private Integer guc;
    private String yildiz;
        public Futbolcu() {
        	// mainControlde yeni personelleri veri yapýlarý kullanarak eklerken bu boþ kurucuya ihtiyaç duyuluyor.
        	super();
        	this.setGuc(new Random().nextInt(60,85));
        }
        public Futbolcu(String ad_soyad, int yas, double maas,  double piyasa, String mevki,int formaNo, String uyruk,String sozlesme) {
        super(ad_soyad, yas, maas);
        this.setGuc(new Random().nextInt(60,85));
        this.setYildiz(yildizHesapla());
        this.setPiyasa(piyasa);
        this.setMevki(mevki);
        this.setUyruk(uyruk);
        this.setFormaNo(formaNo);
        this.setSozlesme(sozlesme);
        
    }

   
   
    public String getUyruk() {
        return uyruk;
    }
    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }
    public String getMevki() {
        return mevki;
    }
    public void setMevki(String mevki) {
        this.mevki = mevki;
    }
    public double getPiyasa() {
        return piyasa;
    }
    public void setPiyasa(double piyasa) {
        this.piyasa = piyasa;
    }
    public String getSozlesme() {
        return sozlesme;
    }

    public void setSozlesme(String sozlesme) {
        this.sozlesme = sozlesme;
    }

    public int getFormaNo() {
        return formaNo;
    }

    public void setFormaNo(int formaNo) {
        this.formaNo = formaNo;
    }
    
    public void setYildiz(String yildiz) {
    	this.yildiz = yildiz;
    }
    
    public String getYildiz() {
    	return yildiz;
    }



	public Integer getGuc() {
		return guc;
	}



	public void setGuc(Integer guc) {
		this.guc = guc;
	}
    
	// Oyuncu bilgilerini gösterirken gücü yýldýzlar göstermenin daha hoþ olacaðý düþünülüp böyle bir fonksiyon yazýldý
	// Belli güç aralýklarýný 3, 4 veya 5 yýldýza eþitliyor.
	public String yildizHesapla() {
		String yildiz;
		if(getGuc() >= 60 && getGuc() < 70)
			yildiz = "***";
		else if(getGuc() >= 70 && getGuc() < 80)
			yildiz = "****";
		else
			yildiz = "*****";
	    return yildiz;
	}
    
    

   
    
}
