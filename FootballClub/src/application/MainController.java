package application;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Stack;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
	import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

	public class MainController implements Initializable {
		// Aray�zde kullan�lan ve gerekti�inde de�i�mesi gereken t�m fieldlar a�a��da s�ralanmaktad�r.
		@FXML
		private Label labelYildiz;
		
		@FXML
	    private Button futbolcuEkle;
		
	    @FXML
	    private TextField alanAd;
	    
	    @FXML
	    private TextField alanAdTeknik;
	    
	    @FXML
	    private TextField alanAdYonetim;

	    @FXML
	    private TextField alanMaas;
	    
        @FXML
	    private TextField alanMaasTeknik;
        
        @FXML
	    private TextField alanMaasYonetim;
        
	    @FXML
	    private TextField alanPiyasa;

	    @FXML
	    private TextField alanSozlesme;
	    
	    @FXML
	    private TextField alanSozlesmeTeknik;

	    @FXML
	    private TextField alanUyruk;

	    @FXML
	    private TextField alanYas;
	    
	    @FXML
	    private TextField alanYasTeknik;
	    
	    @FXML
	    private TextField alanYasYonetim;
	    
	    @FXML
	    private TextField alanPozisyonTeknik;
	    
	    @FXML
	    private TextField alanPozisyonYonetim;
	    
	    @FXML
	    private TextField alanFormaNumarasi;
	    
	    @FXML
	    private Tab tabFutbolcular;

	    @FXML
	    private TabPane tabPaneKulup;

	    @FXML
	    private Tab tabTeknikEkip;
	    
	    @FXML
	    private Tab tabYonetim;
	    
	    @FXML
	    private TextField arananYildiz;

	    @FXML
	    private TableColumn<Futbolcu, String> sutunAd;
	    
	    @FXML
	    private TableColumn<Teknik, String> sutunAdTeknik;
	    
	    @FXML
	    private TableColumn<Yonetim, String> sutunAdYonetim;
	    
	    @FXML
	    private TableColumn<Teknik, String> sutunPozisyonTeknik;
	    
	    @FXML
	    private TableColumn<Yonetim, String> sutunPozisyonYonetim;

	    @FXML
	    private TableColumn<Futbolcu, Integer> sutunGuc;

	    @FXML
	    private TableView<Futbolcu> tabloFutbolcular;
	    
	    @FXML
	    private TableView<Teknik> tabloTeknikEkip;
	    
	    @FXML
	    private TableView<Yonetim> tabloYonetim;
	    
	    
	    private ObservableList<Futbolcu> futbolcular = FXCollections.observableArrayList();
	    
	    private ObservableList<Teknik> teknikEkip = FXCollections.observableArrayList();
	    
	    private ObservableList<Yonetim> yonetim = FXCollections.observableArrayList();

	    LinkedList1 llist = new LinkedList1();
	    // Y�netim sekmesinde sa� splitpane i�indeki textfiedlar� doldurma i�lemi ger�ekle�tiriliyor.
	    public void yonetimGoster(Yonetim yonetim) {
	    	if(yonetim != null) {
	    		alanAdYonetim.setText(yonetim.getAdSoyad());
	    		alanPozisyonYonetim.setText(yonetim.getGorev());
	    		alanYasYonetim.setText(""+yonetim.getYas());
	    		alanMaasYonetim.setText(""+yonetim.getMaas());
	    	}
	    	// e�er g�sterilecek personel yoksa textfieldlar bo� kal�yor
	    	else {
	    		alanAdYonetim.setText("");
	    		alanPozisyonYonetim.setText("");
	    		alanYasYonetim.setText("");
	    		alanMaasYonetim.setText("");
	    	}
	    }
	 // Teknik sekmesinde sa� splitpane i�indeki textfiedlar� doldurma i�lemi ger�ekle�tiriliyor.
	    public void teknikEkipGoster(Teknik teknik) {
	    	if(teknik != null) {
	    		alanAdTeknik.setText(teknik.getAdSoyad());
	    		alanPozisyonTeknik.setText(teknik.getGorev());
	    		alanMaasTeknik.setText(""+ teknik.getMaas() + " Milyon Euro");
	    		alanSozlesmeTeknik.setText(teknik.getSozlesmeBitisi());
	    		alanYasTeknik.setText("" + teknik.getYas());
	    	}
	    	// e�er g�sterilecek personel yoksa textfieldlar bo� kal�yor
	    	else {
	    		alanAdTeknik.setText("");
	    		alanPozisyonTeknik.setText("");
	    		alanMaasTeknik.setText("");
	    		alanSozlesmeTeknik.setText("");
	    		alanYasTeknik.setText("");
	    	}
	    }
	 // Futbolcu sekmesinde sa� splitpane i�indeki textfiedlar� doldurma i�lemi ger�ekle�tiriliyor.
	    public void futbolcuGoster(Futbolcu futbolcu) {
	    	if(futbolcu != null) {
	    		alanAd.setText(futbolcu.getAdSoyad());
	    		alanMaas.setText(""+futbolcu.getMaas()+" Milyon Euro");
	    		alanPiyasa.setText(""+futbolcu.getPiyasa()+" Milyon Euro");
	    		alanSozlesme.setText(futbolcu.getSozlesme());
	    		alanUyruk.setText(futbolcu.getUyruk());
	    		alanYas.setText(""+futbolcu.getYas());
	    		alanFormaNumarasi.setText(""+futbolcu.getFormaNo());
	    		labelYildiz.setText(futbolcu.getYildiz());
	    		
	    	}
	    	else 
	    		// e�er g�sterilecek personel yoksa textfieldlar bo� kal�yor
	    		{
	    		alanAd.setText("");
	    		alanMaas.setText("");
	    		alanPiyasa.setText("");
	    		alanSozlesme.setText("");
	    		alanUyruk.setText("");
	    		alanYas.setText("");
	    		alanFormaNumarasi.setText("");
	    		labelYildiz.setText("");
	    	}
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			
			//Burada �� sekmede de kullan�lmak �zere 
			//futbolcu, teknik ve y�netim s�n�flar�ndan nesneler �retiliyor.
			
			Futbolcu fp = new Futbolcu("Burak Yalcini", 34, 5.0, 22.0, "Stoper", 9, "�talya", "21/08/2025");
            Futbolcu fp1 = new Futbolcu("Mehmet Aurelio", 21, 7.0, 3.0, "Orta Saha", 42, "Gana", "24/08/2027");
            Futbolcu fp2 = new Futbolcu("�mer Earth", 28, 1.3, 6.75, "Stoper", 55, "T�rkiye", "17/08/2023");
            Futbolcu fp3 = new Futbolcu("Yusuf Writer", 25, 1.3, 6.75, "Orta Saha", 97, "T�rkiye", "30/06/2024");
            		
			futbolcular.add(fp);
			futbolcular.add(fp1);
			futbolcular.add(fp2);
			futbolcular.add(fp3);
			// sol splitpanedeki tableView'a listedeki futbolcular� aktarmaya yarayan fonksiyon
			tabloFutbolcularDoldur();
			tabloFutbolcular.getSelectionModel().selectedItemProperty().addListener(
					(observable, oldValue, newValue) -> futbolcuGoster(newValue));
			
			teknikEkip.add(new Teknik("Teknik Direkt�r", "Pep Guardiola", 46, 2.0, "22/11/2024"));
			teknikEkip.add(new Teknik("Antren�r", "Sel�uk  �nan", 38, 0.6, "22/11/2024"));
			teknikEkip.add(new Teknik("Fizyoterapist", "Mehmet G�k�eli", 36, 0.2, "16/05/2026"));
			tabloTeknikEkipDoldur();
			tabloTeknikEkip.getSelectionModel().selectedItemProperty().addListener(
					(observable, oldValue, newValue) -> teknikEkipGoster(newValue));
			yonetim.add(new Yonetim("Burak Elmas", 55, 0.24, "Ba�kan"));
			yonetim.add(new Yonetim("Ahmet Fikret Kileci", 55, 0.2,"Ba�kan Yard�mc�s�"));
			yonetim.add(new Yonetim("Sezer Cihan", 45, 0.15, "Ba�kan Yard�mc�s�"));
			yonetim.add(new Yonetim("Erhan �zmen", 50, 0.14, "Genel Sekreter"));
			tabloYonetimDoldur();
			tabloYonetim.getSelectionModel().selectedItemProperty().addListener(
					(observable, oldValue, newValue) -> yonetimGoster(newValue));
			
		}
		// a�a��daki benzer 3 fonksiyon her bir sekmedeki 
		//split panelerin i�inde sol tarafta yer alan tableViewlar i�in
		// ilgili s�tunlar� doldurma g�revini g�r�yor.
		
		public void tabloFutbolcularDoldur() {
			sutunAd.setCellValueFactory(new PropertyValueFactory<Futbolcu, String>("adSoyad"));
			sutunGuc.setCellValueFactory(new PropertyValueFactory<Futbolcu, Integer>("guc"));
			tabloFutbolcular.setItems(futbolcular);
			tabloFutbolcular.refresh();
		}
		
		public void tabloTeknikEkipDoldur() {
			sutunAdTeknik.setCellValueFactory(new PropertyValueFactory<Teknik, String>("adSoyad"));
			sutunPozisyonTeknik.setCellValueFactory(new PropertyValueFactory<Teknik, String>("gorev"));
			tabloTeknikEkip.setItems(teknikEkip);
			tabloTeknikEkip.refresh();
		}
		
		public void tabloYonetimDoldur() {
			sutunAdYonetim.setCellValueFactory(new PropertyValueFactory<Yonetim, String>("adSoyad"));
			sutunPozisyonYonetim.setCellValueFactory(new PropertyValueFactory<Yonetim, String>("gorev"));
			tabloYonetim.setItems(yonetim);
			tabloYonetim.refresh();
		}
	    
		// futbolcu sekmesindeki ekle butonuna bas�ld���nda
		// �nce bir stack yarat�l�r daha sonra bu stack e textfieldlarda yazan 
		// textler aktar�l�r daha sonras�nda stack in LIFO mant���na uygun olarak 
		// pop edilen textler sayesinde yeni bir futbolcu nesnesi olu�turulup futbolcular
		// listesine eklenir.
		@FXML
	    void futbolcuEkle(ActionEvent event) {
			Stack<Object> stack = new Stack<Object>();
			stack.add(alanAd.getText());
			stack.add(Integer.parseInt(alanFormaNumarasi.getText()));
			stack.add(Double.parseDouble(alanMaas.getText()));
			stack.add(Integer.parseInt(alanYas.getText()));
			stack.add(Double.parseDouble(alanPiyasa.getText()));
			stack.add(alanUyruk.getText());
			stack.add(alanSozlesme.getText());
			Futbolcu stackF = new Futbolcu();
			stackF.setSozlesme((String) stack.pop());
			stackF.setUyruk((String) stack.pop());
			stackF.setPiyasa((Double) stack.pop());
			stackF.setYas((int) stack.pop());
			stackF.setMaas((Double) stack.pop());
			stackF.setFormaNo((int) stack.pop());
			stackF.setAdSoyad((String) stack.pop());
			futbolcular.add(stackF);
			
			tabloFutbolcularDoldur();
	    }
		
		// yeni bir queue olu�turup eklenecek teknik personelin bilgilerini ekler
		//daha sonra bu queue FIFO mant���na g�re
		// s�rayla eklenen de�i�kenleri aray�zde ilgili alana set eder.
		@FXML
	    void teknikEkle(ActionEvent event) {
             Queue<Object> queue = new LinkedList();
             queue.add(alanAdTeknik.getText());
             queue.add(alanPozisyonTeknik.getText());
             queue.add(Integer.parseInt(alanYasTeknik.getText()));
             queue.add(Double.parseDouble(alanMaasTeknik.getText()));
             queue.add(alanSozlesmeTeknik.getText());
             Teknik queueT = new Teknik();
             queueT.setAdSoyad((String) queue.remove());
             queueT.setGorev((String) queue.remove());
             queueT.setYas((int) queue.remove());
             queueT.setMaas((double) queue.remove());
             queueT.setSozlesmeBitisi((String) queue.remove());
             teknikEkip.add(queueT);
             
             tabloTeknikEkipDoldur();
             
	    }
		// Y�netim sekmesindeki ekle tu�u �al��t���nda mainController class�nda olu�turulmu� olan
		// LinkedList nesnesi i�ine textfieldlardaki bilgiler insert edilir daha sonra bu nesnenin yard�m�yla
		// head ve next fieldlar� kullan�larak saklanan bilgiler getirilip yeni yonetim �yesi personeli olu�turmada kullan�l�r
		@FXML
	    void yonetimEkle(ActionEvent event) {
             llist.insert(llist, alanAdYonetim.getText());
             llist.insert(llist, alanPozisyonYonetim.getText());
             llist.insert(llist, Integer.parseInt(alanYasYonetim.getText()));
             llist.insert(llist, Double.parseDouble(alanMaasYonetim.getText()));
             Yonetim llistYonetim = new Yonetim();
             llistYonetim.setAdSoyad((String) llist.head.data);
             llistYonetim.setGorev((String) llist.head.next.data);
             llistYonetim.setYas((int) llist.head.next.next.data );
             llistYonetim.setMaas((double) llist.head.next.next.next.data );
             yonetim.add(llistYonetim);
             
             tabloYonetimDoldur();
		}
		// A�a��daki 3 "yeni" butonu da bas�ld���nda ilgili textfieldlar� bo�altmakla g�revlidir.
		@FXML
		void yeniFutbolcu(ActionEvent event) {
			alanAd.setText("");
    		alanMaas.setText("");
    		alanPiyasa.setText("");
    		alanSozlesme.setText("");
    		alanUyruk.setText("");
    		alanYas.setText("");
    		alanFormaNumarasi.setText("");
    		labelYildiz.setText("");
			
		}
		
		@FXML
		void yeniTeknik(ActionEvent event) {
			alanAdTeknik.setText("");
    		alanPozisyonTeknik.setText("");
    		alanMaasTeknik.setText("");
    		alanSozlesmeTeknik.setText("");
    		alanYasTeknik.setText("");
		}
		
		@FXML
		void yeniYonetim(ActionEvent event) {
			alanAdYonetim.setText("");
    		alanPozisyonYonetim.setText("");
    		alanYasYonetim.setText("");
    		alanMaasYonetim.setText("");
		}
		
		@FXML
		void silFutbolcu() {
			int secilen = tabloFutbolcular.getSelectionModel().getSelectedIndex();
			
			// E�er tabloda bir se�im yap�ld�ysa se�ilen indexteki oyuncuyu listeden ��kart�yoruz sonras�nda tabloyu yeni
			// listeyle tekrar dolduruyoruz.
			
			if(secilen != -1) {
				futbolcular.remove(secilen);
				tabloFutbolcularDoldur();
			}
		}
		
		@FXML
		void silTeknik() {
			int secilen = tabloTeknikEkip.getSelectionModel().getSelectedIndex();
			
			if(secilen != -1) {
				teknikEkip.remove(secilen);
				tabloTeknikEkipDoldur();
			}
		}
		
		@FXML
		void silYonetim() {
			int secilen = tabloYonetim.getSelectionModel().getSelectedIndex();
			
			if(secilen != -1) {
				yonetim.remove(secilen);
				tabloYonetimDoldur();
			}
		}
		
	    

	}



