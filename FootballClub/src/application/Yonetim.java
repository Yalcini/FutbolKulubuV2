package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Yonetim extends MaasliCalisan {
   private String gorev;
  
// mainControlde yeni personelleri veri yapýlarý kullanarak eklerken bu boþ kurucuya ihtiyaç duyuluyor.
public Yonetim() {
	super();
}
public Yonetim(String ad_soyad, int yas, Double maas, String gorev) {
    super(ad_soyad, yas, maas);
    this.setGorev(gorev);
    ArrayList<Object> yonetimUyesi = new ArrayList<Object>();
    yonetimUyesi.add(gorev);
    yonetimUyesi.add(ad_soyad);
    yonetimUyesi.add(yas);
    yonetimUyesi.add(maas);
    Kulup.yonetim.add(yonetimUyesi);

}

public String getGorev() {
    return gorev;
}

public void setGorev(String gorev) {
    this.gorev = gorev;
}
}
