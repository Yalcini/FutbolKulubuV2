package application;

// yönetime yeni personel eklerken bunu LinkedList aracýlýðýyla yapmanýn uygun olacaðý düþünülmüþ ve LinkedList classý elle yazýlmýþtýr
public class LinkedList1 {	
	//linked listler node lardan oluþur bu yüzden içinde bir node class ý tanýmlanýr.
	 public class Node {
		   //oluþturulan her node un sakladýðý bir data ve point ettiði bir next Node vardýr.
	        Object data;
	        Node next;
	       // oluþturulan her node un deðeri kendisine atanýr ve next node u null a eþitlenir.
	        Node(Object d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    // linked list ile iþlem yapmamýza yarayan ilk node u temsil eden head Node tanýmý.
	    Node head;
	    
	    public  LinkedList1 insert(LinkedList1 list, Object object)
	    {
	        // verilen datayla yeni node oluþturulur
	        Node new_node = new Node(object);
	        new_node.next = null;
	   
	        // Eðer linked list boþ iþe, oluþturulan yeni node ayný zamanda head olur.
	        
	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            // Yoksa node.next ile boþ olan ilk node a kadar liste gezilir.
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	   
	            // Yeni node u boþtaki ilk node a atarýz.
	            last.next = new_node;
	        }
	   
	        //Liste return edilir
	        return list;
	    }
	    
	    
}
	   
	    
