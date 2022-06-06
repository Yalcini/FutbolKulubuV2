package application;
//klüpteki çalýþan tüm personeller maaþlý bir çalýþandýr ilkesinden yola çýkarak MaasliCalisan soyut sýnýfýný oluþtururuz.
public abstract class MaasliCalisan {
	  // her maaþlý çalýþanýn bir adý, yaþý ve maaþý olmalýdýr
	  private String adSoyad;
	  private int yas;
	  private double maas;


	  public MaasliCalisan() {
		  // mainControlde yeni personelleri veri yapýlarý kullanarak eklerken bu boþ kurucuya ihtiyaç duyuluyor.
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
