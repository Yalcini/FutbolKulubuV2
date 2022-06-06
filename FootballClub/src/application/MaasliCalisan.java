package application;
//kl�pteki �al��an t�m personeller maa�l� bir �al��and�r ilkesinden yola ��karak MaasliCalisan soyut s�n�f�n� olu�tururuz.
public abstract class MaasliCalisan {
	  // her maa�l� �al��an�n bir ad�, ya�� ve maa�� olmal�d�r
	  private String adSoyad;
	  private int yas;
	  private double maas;


	  public MaasliCalisan() {
		  // mainControlde yeni personelleri veri yap�lar� kullanarak eklerken bu bo� kurucuya ihtiya� duyuluyor.
	  }
	  public MaasliCalisan(String ad_soyad, int yas, double maas) {
	    this.adSoyad = ad_soyad;
	    this.yas = yas;
	    this.maas = maas;
	  }

	  
	    				
	   
	  
	  
	  public double getMaas() {
	    return maas;
	  }

	  public void setMaas(double maas) {
	    this.maas = maas;
	  }

	  public int getYas() {
	    return yas;
	  }

	  public void setYas(int yas) {
	    this.yas = yas;
	  }

	  public void setAdSoyad(String ad_soyad){
	    this.adSoyad= ad_soyad;
	  }
	  
	  public String getAdSoyad(){
	    return adSoyad;
	  }
	}
